package com.wesley.weibo.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;


@Data
public class User implements Serializable{
	
	private static final long serialVersionUID = 3275176147824704556L;
	private long id;
	private String name;
	private String password;
	private String email;
	private String nickName;
	private String sex;
	private String position;
	private String images;
	private String sign;
	private Date registerTime;
	private Date lastLogin;
	private int attention;
	private int fans;
	private int collect;
	private int integral;
	private int conchIntegral;
	private int blogNumber;
	private String pwdQuestion;
	private String pwdAnswer;
	private String birthday;
	
	private int unReadMessage;
	private String conchTitle;
	private int state;
	private String banTime;
	
	public User() {
	}

}
