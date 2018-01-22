package com.sapp.kitbox.entity;

import java.lang.reflect.InvocationTargetException;
import java.util.Date;

import org.apache.commons.beanutils.PropertyUtils;

/**
 * 拥有公共属性的抽象实体类
 * @author Behemoth
 *
 */
public class AbsEntity extends Entity {

	private static final long serialVersionUID = 1L;
	
	/** 所有者编码 */
	private String ownerCode;
	/** 锁版本 */
	private long entityVersion = 0L;
	/** 密文 */
	private String sign;
	/** 数据指纹-保留 */
	private String finger;
	/** 创建时间 */
	private Date createTime;
	/** 末次修改时间 */
	private Date updateTime;
	
	public AbsEntity() { }
	
	public AbsEntity(String id) {
		super(id);
	}
	
	public void clone(AbsEntity absEntity) {
		try {
			PropertyUtils.copyProperties(this, absEntity);
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			e.printStackTrace();
		}
	}
	
	public void copyTo(AbsEntity absEntity) {
		try {
			PropertyUtils.copyProperties(this, absEntity);
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			e.printStackTrace();
		}
	}
	
	public void setOwnerCode(String ownerCode) {
		this.ownerCode = ownerCode;
	}

	public String getOwnerCode() {
		return ownerCode;
	}

	public long getEntityVersion() {
		return entityVersion;
	}

	public void setEntityVersion(long entityVersion) {
		this.entityVersion = entityVersion;
	}

	public String getSign() {
		return sign;
	}

	public void setSign(String sign) {
		this.sign = sign;
	}

	public String getFinger() {
		return finger;
	}

	public void setFinger(String finger) {
		this.finger = finger;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	
	public String toString() {
		StringBuffer s = new StringBuffer(super.toString());
		s.append(",createTime=").append(this.createTime);
		s.append(",updateTime=").append(this.updateTime);
		s.append(",entityVersion=").append(this.entityVersion);
		s.append(",sign=").append(this.sign);
		s.append(",finger=").append(this.finger);
		return s.toString();
	}
}
