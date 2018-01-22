package com.sapp.xbar.modules.sc01.web;

import java.util.List;
import java.util.Map;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.shiro.authz.annotation.Logical;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.google.common.collect.Maps;
import com.sapp.kitbox.mapper.JsonMapper;
import com.sapp.xbar.common.web.ProfileUtils;
import com.sapp.xbar.modules.sc01.entity.BaseApp;
import com.sapp.xbar.modules.sc01.entity.BizProfile;
import com.sapp.xbar.modules.sc01.service.IAppService;

/**
 *	应用系统管理
 */
@Controller
public class SC01Controller {
	
	private static Log logger = LogFactory.getLog(SC01Controller.class);

	@Autowired
	private IAppService iAppService;

	@RequestMapping(value = "/sc040406/refresh.sc")
	@RequiresPermissions(value = { "SC040406" }, logical = Logical.OR)
	@ResponseBody
	public String getAppsByUserIdDB() {
		BizProfile profile = ProfileUtils.getProfile();
		
		Map<String, Object> map = Maps.newHashMap();
		
		List<BaseApp> list = iAppService.getAppsByUserIdDB(profile.getId());
		map.put("apps", list);
		
		return JsonMapper.toJsonString(map);
	}
}
