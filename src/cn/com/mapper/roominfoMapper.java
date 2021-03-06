package cn.com.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import cn.com.bean.roominfo;

public interface roominfoMapper {
	public boolean insert(roominfo roominfo);

	public void update(roominfo roominfo);

	// web查看房间列表
	public List<roominfo> queryallweb();

	//查看房间具体信息
	public roominfo queryweb(@Param("roomNo")String roomNo);
	
	//手机查看列表
	//public List<roominfo> queryallapp(int start ,int num,@Param("roomState") String roomState,@Param("roomType") String roomType);
	
	//查看个人相关得房子
	public List<roominfo> queryuser(@Param("userNo") String userNo);
	//app查看所有房屋列表
	
	public List<roominfo> queryallapp(@Param("start") int start ,@Param("num") int num);
	//app查询我的出租房
	public List<roominfo> queryuserapp(@Param("userNo") String userNo,@Param("start") int start ,@Param("num") int num);
	//搜索
	public List<roominfo> searchroom(@Param("roomTitle") String roomTitle,@Param("start") int start ,@Param("num") int num);
}
