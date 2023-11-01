package com.wesley.weibo.entity;

import lombok.Data;

@Data
public class Conch {
	private long id;
	private long userId;
	private long adoptId;
	private int cNumber;
	private String conchBody;
	private String conchTime;
	private int state;
	
	private User chUser;
	
	public Conch() {
	}

}
