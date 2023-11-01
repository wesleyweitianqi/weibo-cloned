package com.wesley.weibo.entity;

import lombok.Data;

import java.io.Serializable;

@Data
public class WeiboComm implements Serializable{
	
	private static final long serialVersionUID = 6559587096337502792L;
	
	private long id;
	private long weiboId;
	private long commentId;
	private long beCommentId;
	//private Date commentDate;
	private String commentDate;
	private String commentBody;
	private int commentLike;
	private int commentState;
	private User commUser;
	
	
	public WeiboComm() {
	}

	


	
}
