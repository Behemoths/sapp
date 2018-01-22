package com.sapp.xbar.modules.sc01.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sapp.kitbox.exception.UncheckedException;
import com.sapp.xbar.common.service.AbsService;
import com.sapp.xbar.modules.sc01.dao.IBaseAppDao;
import com.sapp.xbar.modules.sc01.entity.BaseApp;
import com.sapp.xbar.modules.sc01.service.IAppService;

/**
 * 维护系统应用的添加、修改和删除。<br>
 * 使用REDIS存放系統应用对象的数据。<br>
 * 为了方便数据库统计查询，在每次做添加、修改和删除操作时，触发同步到数据库的事件。<br>
 * 为快速向请求端返回响应，系统采用异步方式向数据库添加、修改或者删除数据。<br>
 * 
 * 仅涉及表：BASE_APPS
 * 
 * @author Behemoth
 */
@Service("appService")
public class AppServiceImpl extends AbsService implements IAppService {

	@Autowired
	private IBaseAppDao<BaseApp, String> appDao;
	
	/**
	 * 根据userID查询系统应用，在数据库中查询
	 * 
	 * @param userId
	 *            用户ID
	 * 
	 * @return
	 */
	@Override
	public List<BaseApp> getAppsByUserIdDB(String userId) {
		// 检查参数值不能空
		if (userId == null) {
			throw new UncheckedException("sc0404-1002");
		}
		return appDao.getAppsByUserIdDB(userId);
	}

}
