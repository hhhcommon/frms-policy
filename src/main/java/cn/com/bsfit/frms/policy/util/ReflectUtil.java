package cn.com.bsfit.frms.policy.util;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/**
 * 反射的工具类
 */
public class ReflectUtil {

	/**
	 * 将POJO对象转成Map
	 */
	public static Map<String, Object> pojoToMap(Object obj) {
		Map<String, Object> hashMap = new HashMap<String, Object>();
		try {
			Class<?> cla = obj.getClass();
			Method out[] = cla.getDeclaredMethods();
			for (Method method : out) {
				String methodName = method.getName();
				if (methodName.indexOf("get") == 0) {
					hashMap.put((char) (methodName.charAt(3) + 32) + methodName.substring(4), method.invoke(obj));
				}
			}
		} catch (Throwable e) {
			System.err.println(e);
		}
		return hashMap;
	}

}
