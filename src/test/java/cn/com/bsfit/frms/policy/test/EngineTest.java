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

        String url = "http://10.100.1.42:9180/audit";
        List<AuditObject> audits = new ArrayList<AuditObject>();
        AuditObject ao = new AuditObject();
        ao.setBizCode("PAY.P2P");
        ao.setTransVol(1000*1000L);
        ao.put("frms_pay_user_id","1111");
        ao.put("frms_user_id", "11111111111");
        ao.put("frms_trans_time", new Date().getTime());
        ao.put("frms_order_type", "PAY.P2P");
        ao.put("frms_order_id", "111111111");
        ao.put("frms_trans_amount", 1000*1000L);
        ao.put("frms_or_state", 1);
        ao.put("frms_pay_card_no", "666666666666666666666666");
        ao.put("frms_col_card_no", "1111111111111");
        ao.put("frms_col_user_id", "1234567890");
        ao.put("frms_gateid", "通道编号");
        ao.put("frms_trade_no", "支付编号");
        ao.put("frms_terminalid", "终端ID");
        ao.put("frms_dept_code", "1");
        ao.put("frms_pay_ip", "交易IP");
        ao.put("frms_trade_status", "1");
        ao.put("frms_cry_type", "人民币");
        ao.put("frms_phone_addr", "手机归属地");
        ao.put("frms_trans_ip_addr", "交易IP归属地");
        ao.put("frms_mac_addr", "MAC");
        ao.put("frms_device_num", "设备号");
        ao.put("frms_orderid", "商户订单号");
        ao.put("frms_trace", "机构请求流水");
        ao.put("frms_refund_amount", 1);
        ao.put("frms_refund_num", 2);
        ao.put("frms_product_id", "P0000001");
        audits.add(ao);
        System.out.println(template.postForObject(url, audits, List.class));;
    }
}
