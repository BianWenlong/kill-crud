package com.dianping.killcrud.entity;

import java.io.Serializable;

/**
 *
 * @author Mr.Bian
 *
 */
public class Column implements Serializable{
	
	private static final long serialVersionUID = 4182208933044395335L;
	
	private String name;
	private int dataType;
	private String comment;
	private boolean primaryKey;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getDataType() {
		return dataType;
	}
	public void setDataType(int dataType) {
		this.dataType = dataType;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	public boolean getPrimaryKey() {
		return primaryKey;
	}
	public void setPrimaryKey(boolean primaryKey) {
		this.primaryKey = primaryKey;
	}
	
	
}
