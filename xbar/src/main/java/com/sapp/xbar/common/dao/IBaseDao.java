package com.sapp.xbar.common.dao;

public interface IBaseDao<T, K> {

	/**
	 * 根据主键删除现有持久化类的实例，同步持久层。
	 * 
	 * @param clazz
	 *            持久化类
	 * @param id
	 *            主键
	 * @return 删除的记录数
	 */
	public int delete(Class<T> clazz, K id);
	
	
}
