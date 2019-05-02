package cn.com.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import cn.com.bean.roominfo;

public interface roominfoMapper {
	public boolean insert(roominfo roominfo);

	public void update(roominfo roominfo);

	// web�鿴�����б�
	public List<roominfo> queryallweb();

	//�鿴���������Ϣ
	public roominfo queryweb(@Param("roomNo")String roomNo);
	
	//�ֻ��鿴�б�
	//public List<roominfo> queryallapp(int start ,int num,@Param("roomState") String roomState,@Param("roomType") String roomType);
	
	//�鿴������ص÷���
	public List<roominfo> queryuser(@Param("userNo") String userNo);
	//app�鿴���з����б�
	
	public List<roominfo> queryallapp(@Param("start") int start ,@Param("num") int num);
	//app��ѯ�ҵĳ��ⷿ
	public List<roominfo> queryuserapp(@Param("userNo") String userNo,@Param("start") int start ,@Param("num") int num);
	//����
	public List<roominfo> searchroom(@Param("roomTitle") String roomTitle,@Param("start") int start ,@Param("num") int num);
}
