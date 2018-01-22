package com.sapp.xbar.common.web;

import javax.servlet.http.HttpServletRequest;

import org.jasig.cas.client.authentication.AttributePrincipal;
import org.jasig.cas.client.util.AssertionHolder;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import com.sapp.kitbox.utils.SpringContextHolder;
import com.sapp.xbar.common.service.IRedisCacheProxy;
import com.sapp.xbar.modules.sc01.entity.BizProfile;
import com.sapp.xbar.modules.sc01.entity.Org;
import com.sapp.xbar.modules.sc01.entity.User;

/**
 * 用户工具类
 * @author Behemoth
 */
public class ProfileUtils {
	
	private static IRedisCacheProxy redisCachedao = SpringContextHolder.getBean(IRedisCacheProxy.class);

	/**
	 * 获取当前登录人信息。
	 * 
	 * @param request
	 * @return
	 */
	public static BizProfile getProfile(HttpServletRequest request) {
		BizProfile profile = (BizProfile) request.getSession().getAttribute(USER_IN_SESSION);
		if (profile == null) {
			AttributePrincipal principal = AssertionHolder.getAssertion().getPrincipal();
			String userCode = principal.getName();
			// 取用户对象
			User user = redisCachedao.getUserByCode(userCode);
			// 复制User参数的属性
			profile = new BizProfile(user);
			// 取用户组织
			Org org = redisCachedao.getOrgById(user.getOrgId());
			if (org != null) {
				profile.setOrg(org);
			}
		}
		return profile;
	}
	
	/**
	 * 获取当前登录人信息。
	 * 
	 * @return
	 */
	public static BizProfile getProfile() {
		// 取HttpRequest对象
		HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes())
				.getRequest();
		return getProfile(request);
	}
	
	public final static String USER_IN_SESSION = "_CURRENT_PROFILE_USER_BIZ";
	public final static String PROCESS_IN_SESSION = "_CURRENT_PROCESS_BIZ";
}
