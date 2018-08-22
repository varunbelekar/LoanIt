package com.rakesh.bean;
import org.hibernate.validator.NotEmpty;
import org.hibernate.validator.Size;
import org.springframework.format.annotation.NumberFormat;
public class UsersBean {
	@NotEmpty
	@NumberFormat
	private Long id;
	@NotEmpty
	@Size(min = 1, max = 50)
	private String userName;
	@NotEmpty
	@Size(min = 1, max = 20)
	private String password;

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserName() {
		return userName;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getPassword() {
		return password;
	}
}
