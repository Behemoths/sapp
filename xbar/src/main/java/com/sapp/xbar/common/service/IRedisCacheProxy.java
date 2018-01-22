package com.sapp.xbar.common.service;

import org.springframework.stereotype.Service;

import com.sapp.xbar.modules.sc01.entity.Org;
import com.sapp.xbar.modules.sc01.entity.User;

@Service
public interface IRedisCacheProxy {

	/**
	 * 根据userCode查询用户
	 * 
	 * @param userCode
	 * 				用户编码
	 * @return
	 */
	public User getUserByCode(String userCode);

	/**
	 * 根据orgId查询组织
	 * 
	 * @param orgId
	 * 			组织Id
	 * @return
	 */
	public Org getOrgById(String orgId);
	
}
