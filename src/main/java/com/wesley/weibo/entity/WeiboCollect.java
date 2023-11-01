package com.wesley.weibo.entity;

import lombok.Data;

import java.io.Serializable;
import java.sql.Date;
@Data
public class WeiboCollect implements Serializable{
	
	private static final long serialVersionUID = -8500926783617342532L;
	private long id;
	private Weibo weibo;
	private long collectUserId;
	private Date collectDate;
	
	public WeiboCollect() {
	}


	
	
}
