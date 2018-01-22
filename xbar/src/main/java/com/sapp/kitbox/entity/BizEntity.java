package com.sapp.kitbox.entity;

/**
 * 商业基础实体类
 * @author Behemoth
 *
 */
public class BizEntity extends AbsEntity{

	private static final long serialVersionUID = 1L;
	
	/** 状态 */
	private String state;
	
	/** 启用标志。默认：0。1：启用；0：停用。 */
	private String enabledFlag;
	/** 删除标志。默认：0。1：已删除；0：未删除。 */
	private String deletedFlag;
	
	/** 所属流程ID */
	private String ownProcessId;
	/** 所属流程名称 */
	private String ownProcessName;
	
	/** 创建人ID。如果是系统驱动交换，该字段设为SYSTEM */
	private String operId;
	/** 创建人代码。如果是系统驱动交换，该字段设为SYSTEM */
	private String operCode;
	/** 创建人名称。如果是系统驱动交换，该字段设为“系统”。 */
	private String operName;
	/** 创建人所属组织ID */
	private String operOrgId;
	/** 创建人所属组织代码 */
	private String operOrgCode;
	/** 创建人组织名称 */
	private String operOrgName;
	/** 备注 */
	private String remark;
	
	public BizEntity() { }

	public BizEntity(String id) {
		super(id);
	}
	
	/**
	 * 是否启用
	 * @return
	 */
	public boolean isEnabled() {
		return this.enabledFlag == null ? false : GlobalConstants.FLAG_ENABLED.equals(this.enabledFlag.trim());
	}
	
	/**
	 * 是否删除
	 * @return
	 */
	public boolean isDeleted() {
		return this.deletedFlag == null ? false : GlobalConstants.FLAG_DELETED.equals(this.deletedFlag.trim());
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getEnabledFlag() {
		return enabledFlag;
	}

	public void setEnabledFlag(String enabledFlag) {
		this.enabledFlag = enabledFlag;
	}

	public String getDeletedFlag() {
		return deletedFlag;
	}

	public void setDeletedFlag(String deletedFlag) {
		this.deletedFlag = deletedFlag;
	}

	public String getOwnProcessId() {
		return ownProcessId;
	}

	public void setOwnProcessId(String ownProcessId) {
		this.ownProcessId = ownProcessId;
	}

	public String getOwnProcessName() {
		return ownProcessName;
	}

	public void setOwnProcessName(String ownProcessName) {
		this.ownProcessName = ownProcessName;
	}

	public String getOperCode() {
		return operCode;
	}

	public void setOperCode(String operCode) {
		this.operCode = operCode;
	}

	public String getOperId() {
		return operId;
	}

	public void setOperId(String operId) {
		this.operId = operId;
	}

	public String getOperName() {
		return operName;
	}

	public void setOperName(String operName) {
		this.operName = operName;
	}

	public String getOperOrgCode() {
		return operOrgCode;
	}

	public void setOperOrgCode(String operOrgCode) {
		this.operOrgCode = operOrgCode;
	}

	public String getOperOrgId() {
		return operOrgId;
	}

	public void setOperOrgId(String operOrgId) {
		this.operOrgId = operOrgId;
	}

	public String getOperOrgName() {
		return operOrgName;
	}

	public void setOperOrgName(String operOrgName) {
		this.operOrgName = operOrgName;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}
	
	public String toString() {
		StringBuffer s = new StringBuffer();
		s.append("ownProcessId=").append(this.ownProcessId);
		s.append(",ownProcessName=").append(this.ownProcessName);
		s.append(",enabledFlag=").append(this.enabledFlag);
		s.append(",deletedFlag=").append(this.deletedFlag);
		s.append(";").append(super.toString());
		return s.toString();
	}
}
