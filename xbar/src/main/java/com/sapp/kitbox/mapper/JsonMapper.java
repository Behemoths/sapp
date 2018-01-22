package com.sapp.kitbox.mapper;

import java.io.IOException;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.fasterxml.jackson.core.JsonParser.Feature;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonMapper extends ObjectMapper {

	private static final long serialVersionUID = 1L;
	private static Log logger = LogFactory.getLog(JsonMapper.class);
	private static JsonMapper mapper;
	
	public static String toJsonString(Object object) {
		return getInstance().toJson(object);
	}
	
	public static JsonMapper getInstance() {
		if (mapper == null) {
			mapper = (new JsonMapper()).enableSimple();
		}

		return mapper;
	}
	
	public String toJson(Object object) {
		try {
			return this.writeValueAsString(object);
		} catch (IOException e) {
			logger.warn("write to json string error:" + object, e);
			return null;
		}
	}
	
	public JsonMapper enableSimple() {
		// 该特性决定parser是否允许单引号来包住属性名称和字符串值，默认是false的。
		this.configure(Feature.ALLOW_SINGLE_QUOTES, true);
		// 由于JSON标准上需要为属性名称使用双引号，所以这也是一个非标准特性，默认是false的。
		this.configure(Feature.ALLOW_UNQUOTED_FIELD_NAMES, true);
		return this;
	}
}
