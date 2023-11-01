package com.wesley.weibo.entity;

import lombok.Data;

import java.io.Serializable;


@Data
public class Friend implements Serializable{

	private static final long serialVersionUID = 6004607048005816278L;

	private long id;
	private User aUser;
	private User bUser;
	
	
	
	public Friend() {}
	
	

	
}
