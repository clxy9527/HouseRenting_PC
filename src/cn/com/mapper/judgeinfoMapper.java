package cn.com.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import cn.com.bean.judgeinfo;

public interface judgeinfoMapper {
	//webҳ��鿴��������
	public List<judgeinfo> queryjudgeinfoweb(@Param("judgeState") String judgeState);
	//web�޸�����
	public void updatejudge(@Param("judegNo") String judegNo);
	
	//app�鿴����
	public List<judgeinfo> queryroomjudge(@Param("roomNo") String roomNo);
	//��������
	public void insertjudge(judgeinfo judgeinfo);
}
