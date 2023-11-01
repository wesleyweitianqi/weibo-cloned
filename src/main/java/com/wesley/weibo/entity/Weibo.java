package com.wesley.weibo.entity;

import lombok.Data;

import java.io.Serializable;

import java.sql.Date;
import java.util.List;
@Data
public class Weibo implements Serializable{
	
	private static final long serialVersionUID = 2112400850487003217L;
	private long id;
	private User user;
	private int tranum;
	private int comnum;
	private int colnum;
	private int likeN;
	private Date pubTime;
	private String body;
	private String image;
	private long u_id;
	private boolean b;
	private List<WeiboComm> comm;
	private String str_pubTime;
	private int state;
	
	public Weibo(){}


	
}
