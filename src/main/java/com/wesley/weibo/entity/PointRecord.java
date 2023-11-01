package com.wesley.weibo.entity;

import lombok.Data;

import java.io.Serializable;

import java.util.Date;
@Data
public class PointRecord implements Serializable{
	
	private static final long serialVersionUID = -5486027495328217465L;
	private long id;
	private PointAction action;
	private String email;
	private Date recordDate;
	
	public PointRecord(){
	}


	
	
}
