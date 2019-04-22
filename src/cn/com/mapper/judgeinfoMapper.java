package cn.com.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import cn.com.bean.judgeinfo;

public interface judgeinfoMapper {
	//web页面查看所有评价
	public List<judgeinfo> queryjudgeinfoweb(@Param("judgeState") String judgeState);
	//web修改评价
	public void updatejudge(@Param("judegNo") String judegNo);
	
	//app查看评价
	public List<judgeinfo> queryroomjudge(@Param("roomNo") String roomNo);
	//插入评价
	public void insertjudge(judgeinfo judgeinfo);
}
