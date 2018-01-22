package com.sapp.xbar.modules.sc01.entity;

import com.sapp.kitbox.entity.BizEntity;

public class Org extends BizEntity{
	
	private static final long serialVersionUID = 1L;
	
	/** 单位代码 */
	private String orgCode;
	/** 单位名称 */
	private String orgName;
	/** 单位英文名称 */
	private String orgNameEn;
	/** 组织类型编码。关联BASE_ORG_TYPE字典项数据。10：总公司；20：集团；30：公司；40：部门；401：分部；50：分公司； */
	private String orgType;
	/** 上机组织ID */
	private String parentOrgId;
	/** 上机组织代码（冗余） */
	private String parentOrgCode;
	/** 机构的通信地址 */
	private String address;
	/** 机构所在地邮政编码 */
	private String postcode;
	/** 省份名称 */
	private String provName;
	/** 省份代码 */
	private String provCode;
	/** 城市代码 */
	private String cityCode;
	/** 城市名称 */
	private String cityName;
	/** 联系人名称 */
	private String contacterName;
	/** 组织级次（保留）。默认0 */
	private String orgLevel;
	/** 备注 */
	private String remark;
	/** 显示顺序 */
	private Integer displayOrder;
	/** 是否叶子 */
	private String leafFlag;
	/** 机构所属上级数据 */
	private String fullPath;
	
	public Org() { }

	public Org(String id) {
		setId(id);
	}
	
	public String getOrgCode() {
		return orgCode;
	}
	public void setOrgCode(String orgCode) {
		this.orgCode = orgCode;
	}
	public String getOrgName() {
		return orgName;
	}
	public void setOrgName(String orgName) {
		this.orgName = orgName;
	}
	public String getOrgNameEn() {
		return orgNameEn;
	}
	public void setOrgNameEn(String orgNameEn) {
		this.orgNameEn = orgNameEn;
	}
	public String getOrgType() {
		return orgType;
	}
	public void setOrgType(String orgType) {
		this.orgType = orgType;
	}
	public String getParentOrgId() {
		return parentOrgId;
	}
	public void setParentOrgId(String parentOrgId) {
		this.parentOrgId = parentOrgId;
	}
	public String getParentOrgCode() {
		return parentOrgCode;
	}
	public void setParentOrgCode(String parentOrgCode) {
		this.parentOrgCode = parentOrgCode;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPostcode() {
		return postcode;
	}
	public void setPostcode(String postcode) {
		this.postcode = postcode;
	}
	public String getProvName() {
		return provName;
	}
	public void setProvName(String provName) {
		this.provName = provName;
	}
	public String getProvCode() {
		return provCode;
	}
	public void setProvCode(String provCode) {
		this.provCode = provCode;
	}
	public String getCityCode() {
		return cityCode;
	}
	public void setCityCode(String cityCode) {
		this.cityCode = cityCode;
	}
	public String getCityName() {
		return cityName;
	}
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
	public String getContacterName() {
		return contacterName;
	}
	public void setContacterName(String contacterName) {
		this.contacterName = contacterName;
	}
	public String getOrgLevel() {
		return orgLevel;
	}
	public void setOrgLevel(String orgLevel) {
		this.orgLevel = orgLevel;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public Integer getDisplayOrder() {
		return displayOrder;
	}
	public void setDisplayOrder(Integer displayOrder) {
		this.displayOrder = displayOrder;
	}
	public String getLeafFlag() {
		return leafFlag;
	}
	public void setLeafFlag(String leafFlag) {
		this.leafFlag = leafFlag;
	}
	public String getFullPath() {
		return fullPath;
	}
	public void setFullPath(String fullPath) {
		this.fullPath = fullPath;
	}
	
	@Override
	public String toString() {
		StringBuffer s = new StringBuffer();
		s.append(super.toString());
		s.append(",orgCode=").append(this.orgCode);
		s.append(",orgName=").append(this.orgName);
		s.append(",orgType=").append(this.orgType);
		s.append(",parentOrgId=").append(this.parentOrgId);
		s.append(",parentOrgCode=").append(this.parentOrgCode);
		s.append(",leafFlag=").append(this.leafFlag);
		return s.toString();
	}
}
