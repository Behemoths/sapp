package com.sapp.xbar.modules.sc01.entity;

import com.sapp.kitbox.entity.BizEntity;
import com.sapp.kitbox.entity.GlobalConstants;

public class BaseApp extends BizEntity implements Comparable<BaseApp> {

	private static final long serialVersionUID = 1L;

	private String appName;
	private String appCode;
	/** IP地址 */
	private String appUrl;
	/** 系统级访问标志。1：是，系统访问；0：否，页面访问。 */
	private String accessFlag = GlobalConstants.FLAG_DISABLED;
	/** 内建标志 1是内建 0不是内建*/
	private String innerFlag = GlobalConstants.FLAG_DISABLED;
	/** 显示顺序 */
	private int displayOrder;
	
	public BaseApp() { }

	public BaseApp(String id) {
		setId(id);
	}
	
	/**
	 * 是否内建
	 * 
	 * @return boolean
	 */
	public boolean isInner() {
		if (getInnerFlag() == null) {
			return false;
		}
		return GlobalConstants.FLAG_ENABLED.equals(getInnerFlag());
	}
	
	/**
	 * 是否系统级访问
	 * 
	 * @return boolean
	 */
	public boolean isAccess() {
		if (accessFlag == null) {
			return false;
		}
		return GlobalConstants.FLAG_ENABLED.equals(accessFlag);
	}
	
	@Override
	public int compareTo(BaseApp o) {
		return this.getDisplayOrder() - (o.getDisplayOrder());
	}

	public String getAppName() {
		return appName;
	}

	public void setAppName(String appName) {
		this.appName = appName;
	}

	public String getAppCode() {
		return appCode;
	}

	public void setAppCode(String appCode) {
		this.appCode = appCode;
	}

	public String getAppUrl() {
		return appUrl;
	}

	public void setAppUrl(String appUrl) {
		this.appUrl = appUrl;
	}

	public String getAccessFlag() {
		return accessFlag;
	}

	public void setAccessFlag(String accessFlag) {
		this.accessFlag = accessFlag;
	}

	public String getInnerFlag() {
		return innerFlag;
	}

	public void setInnerFlag(String innerFlag) {
		this.innerFlag = innerFlag;
	}

	public int getDisplayOrder() {
		return displayOrder;
	}

	public void setDisplayOrder(int displayOrder) {
		this.displayOrder = displayOrder;
	}
	
	@Override
	public String toString() {
		StringBuffer s = new StringBuffer();
		s.append(",appCode=").append(this.appCode);
		s.append(",accessFlag=").append(accessFlag);
		s.append(",appName=").append(this.appName);
		s.append(",appUrl=").append(this.appUrl);
		s.append(";").append(super.toString());
		return s.toString();
	}

}
