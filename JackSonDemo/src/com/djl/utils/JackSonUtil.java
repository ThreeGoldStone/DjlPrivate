package com.djl.utils;

import java.io.IOException;
import java.io.InputStream;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.annotate.JsonAutoDetect.Visibility;
import org.codehaus.jackson.annotate.JsonMethod;
import org.codehaus.jackson.map.DeserializationConfig;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

import android.util.Log;

/**
 * 
 * @author DJL
 * @since 2014/10/25 18:33
 * @version 1.0 这里需要注意1.实体bean的结构必须与json中的数据结构一。2.实体bean中的数据名称必须与json中对应的关键词一至
 * 
 */
public class JackSonUtil {
	/**
	 * @author Djl
	 * @param clazz
	 *            需要解析成的bean类型 改bean类型必须实现Serializable接口
	 * @param is
	 *            json的输入流
	 * @return 返回解析成的bean对象 例: Djl p = JackSonUtil.parse(Djl.class, is);
	 */
	public static <T> T parse(Class<T> clazz, InputStream is) {
		ObjectMapper mapper = new ObjectMapper().setVisibility(
				JsonMethod.FIELD, Visibility.ANY);
		T result = null;
		try {
			/**
			 * true可以设置私有变量
			 */
			mapper.configure(
					DeserializationConfig.Feature.ACCEPT_SINGLE_VALUE_AS_ARRAY,
					true);
			/**
			 * 与未定义的属相有关
			 */
			mapper.configure(
					DeserializationConfig.Feature.FAIL_ON_UNKNOWN_PROPERTIES,
					false);
			result = mapper.readValue(is, clazz);
		} catch (JsonParseException e) {
			Log.e("JackSonUtil", e.getMessage());
		} catch (JsonMappingException e) {
			Log.e("JackSonUtil", e.getMessage());
		} catch (IOException e) {
			Log.e("JackSonUtil", e.getMessage());
		}
		return result;
	}

	/**
	 * @author Djl
	 * @param clazz
	 *            需要解析成的bean类型 改bean类型必须实现Serializable接口
	 * @param json
	 *            json文本
	 * @return 返回解析成的bean对象 例: Djl p = JackSonUtil.parse(Djl.class, is);
	 */
	public static <T> T parse(Class<T> clazz, String json) {
		ObjectMapper mapper = new ObjectMapper().setVisibility(
				JsonMethod.FIELD, Visibility.ANY);
		T result = null;
		try {
			/**
			 * true可以设置私有变量
			 */
			mapper.configure(
					DeserializationConfig.Feature.ACCEPT_SINGLE_VALUE_AS_ARRAY,
					true);
			/**
			 * 与未定义的属相有关
			 */
			mapper.configure(
					DeserializationConfig.Feature.FAIL_ON_UNKNOWN_PROPERTIES,
					false);
			result = mapper.readValue(json, clazz);
		} catch (JsonParseException e) {
			Log.e("JackSonUtil", e.getMessage());
		} catch (JsonMappingException e) {
			Log.e("JackSonUtil", e.getMessage());
		} catch (IOException e) {
			Log.e("JackSonUtil", e.getMessage());
		}
		return result;
	}
}
