package com.sapp.xbar.modules.sc01.entity;

public class BizProfile extends User{

	private static final long serialVersionUID = 1L;
	/** 当前用户所属的组织 */
	private Org org;
	
	public BizProfile() { }
	
	public BizProfile(User user) {
		// 复制User参数 的属性
		this.clone(user);
	}
	
	public Org getOrg() {
		return org;
	}
	public void setOrg(Org org) {
		this.org = org;
	}
	
}
