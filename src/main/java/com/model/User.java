package com.model;


import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="t_user")
public class User {
	@Id
	@GeneratedValue
	@Column(length=18)
	private long UserId;
	private String name;
	private String password;
	private Date createDate;
	private Date updataDate;
	@OneToOne(mappedBy="user")
	private LoginLog loginLog;
	public long getUserId() {
		return UserId;
	}
	public void setUserId(long UserId) {
		this.UserId = UserId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Date getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	public Date getUpdataDate() {
		return updataDate;
	}
	public void setUpdataDate(Date updataDate) {
		this.updataDate = updataDate;
	}
	
	public LoginLog getLoginLog() {
		return loginLog;
	}
	public void setLoginLog(LoginLog loginLog) {
		this.loginLog = loginLog;
	}
	
	public User(){}
	
	public User(String name,String password){
		this.name = name;
		this.password = password;
		this.createDate = new Date();
		this.updataDate = new Date();
		this.loginLog = new LoginLog();
	}
	
	public String toString() {
		return "User [UserId=" + UserId + ", name=" + name + ", password=" + password + ", createDate=" + createDate
				+ ", updataDate=" + updataDate + ", loginLog=" + loginLog + "]";
	}
	
	
}
