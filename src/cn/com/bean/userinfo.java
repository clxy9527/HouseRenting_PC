package cn.com.bean;

public class userinfo {
	//用户表
	public String userNo;
	//用户编号
	public String userName;
	//用户名字
	public String userNickname;
	//昵称
	public String phone;
	//联系电话
	public int userType;
	//用户类型
	public String loginPassword;
	//登录密码
	public String userBackup;
	//备注
	public String userImage;
	//用户照片
	public String getUserNo() {
		return userNo;
	}
	public void setUserNo(String userNo) {
		this.userNo = userNo;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserNickname() {
		return userNickname;
	}
	public void setUserNickname(String userNickname) {
		this.userNickname = userNickname;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public int getUserType() {
		return userType;
	}
	public void setUserType(int userType) {
		this.userType = userType;
	}
	public String getLoginPassword() {
		return loginPassword;
	}
	public void setLoginPassword(String loginPassword) {
		this.loginPassword = loginPassword;
	}
	public String getUserBackup() {
		return userBackup;
	}
	public void setUserBackup(String userBackup) {
		this.userBackup = userBackup;
	}
	public String getUserImage() {
		return userImage;
	}
	public void setUserImage(String userImage) {
		this.userImage = userImage;
	}
	

}
