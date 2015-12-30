package cn.com.bsfit.frms.policy.test;

import cn.com.bsfit.frms.obj.AuditObject;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.impl.conn.PoolingHttpClientConnectionManager;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.web.client.RestTemplate;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by admin on 2015/12/29.
 */
public class EngineTest {
    public static void main(String[] args) throws ParseException {
        int poolSize = 4;
        PoolingHttpClientConnectionManager connMgr = new PoolingHttpClientConnectionManager();
        connMgr.setMaxTotal(poolSize + 1);
        connMgr.setDefaultMaxPerRoute(poolSize);
        CloseableHttpClient httpClient = HttpClients.custom().setConnectionManager(connMgr).build();
        RestTemplate template = new RestTemplate(new HttpComponentsClientHttpRequestFactory(httpClient));
        List<HttpMessageConverter<?>> converters = new ArrayList<HttpMessageConverter<?>>();
        FastJsonHttpMessageConverter fastjson = new FastJsonHttpMessageConverter();
        fastjson.setFeatures(SerializerFeature.WriteClassName, SerializerFeature.BrowserCompatible, SerializerFeature.DisableCircularReferenceDetect);
        converters.add(fastjson);
        template.setMessageConverters(converters);

        String url = "http://localhost:9180/audit";
        List<AuditObject> audits = new ArrayList<AuditObject>();
        AuditObject ao = new AuditObject();
        ao.setBizCode("PAY.P2P");
        ao.setTransVol(1000*1000L);
        ao.setTransTime(new Date());
        ao.put("frms_user_id","1111");
        ao.put("frms_finger","adfsdfs");
        ao.put("frms_trans_time", new Date().getTime());
//        ao.setTransVol(2900000L);
//        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//        ao.setTransTime(sdf.parse("2015-04-26 15:43:40"));
//        ao.put("frms_signed_time", sdf.parse("2015-04-26 13:43:40"));
//        ao.put("frms_shouhuo_mob", "13575490835");
//        ao.put("frms_col_user_id", "admin");
//        ao.put("frms_col_register_time", sdf.parse("2015-04-26 08:43:40"));

//        List<HashMap<String, Object>> auditList = new ArrayList<HashMap<String, Object>>();
//        HashMap<String, Object> auditMap = new HashMap<String, Object>();
//        auditMap.put("frms_goods_name", "Q币_1元直充");
//        auditMap.put("frms_platform_id", "2011102114PT22279640");
//        auditMap.put("frms_trans_vol",500000L);
//        auditList.add(auditMap);
//        ao.put("frms_order_list", auditList);

        audits.add(ao);
        System.out.println(template.postForObject(url, audits, List.class));;
    }
}
