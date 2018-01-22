package com.sapp.xbar.modules.sc01.service;

import java.util.List;

import com.sapp.xbar.modules.sc01.entity.BaseApp;

public interface IAppService {

	/**
	 * 根据userID查询系统应用，在数据库中查询
	 * 
	 * @param userId
	 *            用户ID
	 * 
	 * @return
	 */
	public List<BaseApp> getAppsByUserIdDB(String userId);
}
