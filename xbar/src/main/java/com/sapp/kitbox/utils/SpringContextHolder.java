package com.sapp.kitbox.utils;

import org.apache.commons.lang3.Validate;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

@Service
@Lazy(false) // 延迟加载机制
public class SpringContextHolder {
	
	private static ApplicationContext applicationContext = null;
	private static Log logger = LogFactory.getLog(SpringContextHolder.class);
	
	public static <T> T getBean(Class<T> requiredType) {
		assertContextInjected();
		return applicationContext.getBean(requiredType);
	}
	
	private static void assertContextInjected() {
		Validate.validState(applicationContext != null,
				"【应用的上下文】属性未注入, 请在【applicationContext.xml】中定义【SpringContextHolder】。", new Object[0]);
	}
}
