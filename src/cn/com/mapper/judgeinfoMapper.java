package cn.com.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import cn.com.bean.judgeinfo;

public interface judgeinfoMapper {
	// web页面查看所有评价
	public List<judgeinfo> queryjudgeinfoweb(@Param("judgeState") String judgeState);

	// web修改评价
	public void updatejudge(judgeinfo judgeinfo);

	// app查看评价
	public List<judgeinfo> queryroomjudge(@Param("roomNo") String roomNo);


	// app查询
	public List<judgeinfo> queryroomjudge(@Param("roomNo") String roomNo, @Param("start") int start,
			@Param("num") int num);

	// app查询
	public List<judgeinfo> queryuserjudge(@Param("userNo") String userNo, @Param("start") int start,
			@Param("num") int num);

	public boolean insertjudgensert(judgeinfo judgeinfo);
}
