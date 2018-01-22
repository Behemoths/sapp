package com.sapp.xbar.modules.sc01.dao;

import java.util.List;

import com.sapp.xbar.common.dao.IBaseDao;

public interface IBaseAppDao<T, K> extends IBaseDao<T, K>{

	/**
	 * 根据userID查询系统应用，在数据库中查询
	 * 
	 * @param userId 用户Id
	 * @return
	 */
	public List<T> getAppsByUserIdDB(String userId);

}
