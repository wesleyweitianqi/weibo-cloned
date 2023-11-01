package com.wesley.weibo.entity;

import lombok.Data;

import java.io.Serializable;
import java.sql.Date;


@Data
public class WeiboTrans implements Serializable{
	
	private static final long serialVersionUID = 8139112862553053989L;
	
	private long id;
	private long weiboId;
	private long transUserId;
	private long beTransUserId;
	private Date transDate;
	
	public WeiboTrans() {}


	
}
