package com.wesley.weibo.entity;

import lombok.Data;

import java.io.Serializable;


@Data
public class PointAction implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -2099063679070673113L;
	private long id;
	private String actionName;
	private int point;
	private String description;
	
	public PointAction(){
	}
	


	
}
