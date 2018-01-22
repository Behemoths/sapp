package com.sapp.kitbox.entity;

import java.io.Serializable;

/**
 * 基础实体类
 * @author Behemoth
 *
 */
public class Entity implements Serializable, Cloneable {

	private static final long serialVersionUID = 1L;
	private String id;

	public Entity() { }

	public Entity(String id) {
		this.id = id;
	}

	@Override
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	@Override
	public String toString() {
		StringBuffer s = new StringBuffer();
		s.append("id=").append(this.id);
		return s.toString();
	}
}
