package com.sapp.xbar.modules.sc01.entity;

import java.util.Date;

import com.sapp.kitbox.entity.BizEntity;
import com.sapp.kitbox.entity.GlobalConstants;

public class User extends BizEntity {

	private static final long serialVersionUID = 1L;
	/** 归属组织ID */
	private String orgId;
	/** 用户所属机构及其上级机构 */
	private String orgPath;
	/** 登录代码 */
	private String userCode;
	/** 用户名称 */
	private String userName;
	/** 密码 */
	private String userPassword;
	/** 证书主题（保留） */
	private String certdn;
	/** 用户类型：总经理、经理、组长、一般员工等。对应数据字典：BASE_USER_TYPE */
	private String userType;
	/** 手机 */
	private String mobile;
	/** 邮箱 */
	private String email;
	/** 邮箱激活标志。0：未开通，1：自动开通，2：手动开通，3：开通失败。默认0。 */
	private String emailFlag;
	/** 电话 */
	private String telphone;
	/** 临时标识（保留） */
	private String tempFlag;
	/** 锁定标识：默认0。0：未锁定；1：锁定。 */
	private String lockFlag;
	/** 锁定时间 */
	private Date lockTime;
	/** 锁定原因 */
	private String lockRemark;
	/** 备注 */
	private String remark;
	/** 管理员标识。0：普通；1：超管；2：子管理员。默认0。 */
	private String adminFlag;
	/** 可选值 */
	private String optionValue;
	/** 查询开始时间 */
	private String createTimeStart;
	/** 查询结束时间 */
	private String createTimeEnd;
	/** 生日 */
	private String party;
	/** 用户修改密码时间 */
	private Date changepwdTime;
	/** 是否允许登录 */
	private String loginFlag;
	
	public User() {
		super();
		this.lockFlag = GlobalConstants.FLAG_NOT_LOCKED;
		this.adminFlag = GlobalConstants.FLAG_NOT_ADMIN;
	}
	
	public User(String id) {
		setId(id);
	}
	
	public User(String id, String userCode) {
		setId(id);
		setUserCode(userCode);
	}
	
	public String getOrgId() {
		return orgId;
	}
	public void setOrgId(String orgId) {
		this.orgId = orgId;
	}
	public String getOrgPath() {
		return orgPath;
	}
	public void setOrgPath(String orgPath) {
		this.orgPath = orgPath;
	}
	public String getUserCode() {
		return userCode;
	}
	public void setUserCode(String userCode) {
		this.userCode = userCode;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserPassword() {
		return userPassword;
	}
	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}
	public String getCertdn() {
		return certdn;
	}
	public void setCertdn(String certdn) {
		this.certdn = certdn;
	}
	public String getUserType() {
		return userType;
	}
	public void setUserType(String userType) {
		this.userType = userType;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getEmailFlag() {
		return emailFlag;
	}
	public void setEmailFlag(String emailFlag) {
		this.emailFlag = emailFlag;
	}
	public String getTelphone() {
		return telphone;
	}
	public void setTelphone(String telphone) {
		this.telphone = telphone;
	}
	public String getTempFlag() {
		return tempFlag;
	}
	public void setTempFlag(String tempFlag) {
		this.tempFlag = tempFlag;
	}
	public String getLockFlag() {
		return lockFlag;
	}
	public void setLockFlag(String lockFlag) {
		this.lockFlag = lockFlag;
	}
	public Date getLockTime() {
		return lockTime;
	}
	public void setLockTime(Date lockTime) {
		this.lockTime = lockTime;
	}
	public String getLockRemark() {
		return lockRemark;
	}
	public void setLockRemark(String lockRemark) {
		this.lockRemark = lockRemark;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public String getAdminFlag() {
		return adminFlag;
	}
	public void setAdminFlag(String adminFlag) {
		this.adminFlag = adminFlag;
	}
	public String getOptionValue() {
		return optionValue;
	}
	public void setOptionValue(String optionValue) {
		this.optionValue = optionValue;
	}
	public String getCreateTimeStart() {
		return createTimeStart;
	}
	public void setCreateTimeStart(String createTimeStart) {
		this.createTimeStart = createTimeStart;
	}
	public String getCreateTimeEnd() {
		return createTimeEnd;
	}
	public void setCreateTimeEnd(String createTimeEnd) {
		this.createTimeEnd = createTimeEnd;
	}
	public String getParty() {
		return party;
	}
	public void setParty(String party) {
		this.party = party;
	}
	public Date getChangepwdTime() {
		return changepwdTime;
	}
	public void setChangepwdTime(Date changepwdTime) {
		this.changepwdTime = changepwdTime;
	}
	public String getLoginFlag() {
		return loginFlag;
	}
	public void setLoginFlag(String loginFlag) {
		this.loginFlag = loginFlag;
	}
	
	@Override
	public String toString() {
		return getId();
	}
}
