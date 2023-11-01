package com.wesley.weibo.entity;

import lombok.Data;

import java.io.Serializable;
import java.sql.Date;
@Data
public class WeiboLike implements Serializable{
	

	
	private static final long serialVersionUID = -7370231331872649387L;
	
	private long id;
	private long weiboId;
	private long likeUserId;
	private long beLikeId;
	private Date likeDate;
	
	public WeiboLike() {}


	
	
}
