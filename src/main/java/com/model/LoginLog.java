package com.model;


import java.util.Date;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="tLogin_Log")
public class LoginLog  {

	@Id
	@GeneratedValue
	@Column(length=18)
	private long LoginLogId;
	private String ip;
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="UserId")
	private User user;
	private Date loginDataTime;
	public long getLoginLogId() {
		return LoginLogId;
	}
	public void setLoginLogId(long LoginLogId) {
		this.LoginLogId = LoginLogId;
	}
	
	public String getIp() {
		return ip;
	}
	public void setIp(String ip) {
		this.ip = ip;
	}
	public Date getLoginDataTime() {
		return loginDataTime;
	}
	public void setLoginDataTime(Date loginDataTime) {
		this.loginDataTime = loginDataTime;
	}
	
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	@Override
	public String toString() {
		return "LoginLog [LoginLogId=" + LoginLogId + ", ip=" + ip + ", user=" + user.toString() + ", loginDataTime="
				+ loginDataTime + "]";
	}
	
	
}
