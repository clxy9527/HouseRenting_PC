package cn.com.bean;

public class roominfo {
	//入库日期
	private String roomDate;
	//审核日期
	private String roomCheckDate;
	//标题
	public String roomTitle;
	//房间信息表
	public String roomNo;
	//房间编号
	public String roomAddress;
	//房屋地址
	public String roomCover;
	//房屋封面
	public String roomArea;
	//房屋面积
	public String roomPrice;
	//房屋价格
	public String roomBackup;
	//备注信息
	public String roomState;
	//房屋状态
	public String roomType;
	//房屋类型
	public roomdevice roomDevice;
	//房屋设备
	public userinfo userNo;
	public String getRoomNo() {
		return roomNo;
	}
	public void setRoomNo(String roomNo) {
		this.roomNo = roomNo;
	}
	public String getRoomAddress() {
		return roomAddress;
	}
	public void setRoomAddress(String roomAddress) {
		this.roomAddress = roomAddress;
	}
	public String getRoomCover() {
		return roomCover;
	}
	public void setRoomCover(String roomCover) {
		this.roomCover = roomCover;
	}
	public String getRoomArea() {
		return roomArea;
	}
	public void setRoomArea(String roomArea) {
		this.roomArea = roomArea;
	}
	public String getRoomPrice() {
		return roomPrice;
	}
	public void setRoomPrice(String roomPrice) {
		this.roomPrice = roomPrice;
	}
	public String getRoomBackup() {
		return roomBackup;
	}
	public void setRoomBackup(String roomBackup) {
		this.roomBackup = roomBackup;
	}
	public String getRoomState() {
		return roomState;
	}
	public void setRoomState(String roomState) {
		this.roomState = roomState;
	}
	public String getRoomType() {
		return roomType;
	}
	public void setRoomType(String roomType) {
		this.roomType = roomType;
	}
	public String getRoomTitle() {
		return roomTitle;
	}
	public void setRoomTitle(String roomTitle) {
		this.roomTitle = roomTitle;
	}
	public roomdevice getRoomDevice() {
		return roomDevice;
	}
	public void setRoomDevice(roomdevice roomDevice) {
		this.roomDevice = roomDevice;
	}
	public userinfo getUserNo() {
		return userNo;
	}
	public void setUserNo(userinfo userNo) {
		this.userNo = userNo;
	}
	public String getRoomDate() {
		return roomDate;
	}
	public void setRoomDate(String roomDate) {
		this.roomDate = roomDate;
	}
	public String getRoomCheckDate() {
		return roomCheckDate;
	}
	public void setRoomCheckDate(String roomCheckDate) {
		this.roomCheckDate = roomCheckDate;
	}
	

}
