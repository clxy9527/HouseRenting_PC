package cn.com.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import cn.com.bean.judgeinfo;

public interface judgeinfoMapper {
	// webҳ��鿴��������
	public List<judgeinfo> queryjudgeinfoweb(@Param("judgeState") String judgeState);

	// web�޸�����
	public void updatejudge(judgeinfo judgeinfo);

	// app�鿴����
	public List<judgeinfo> queryroomjudge(@Param("roomNo") String roomNo);


	// app��ѯ
	public List<judgeinfo> queryroomjudge(@Param("roomNo") String roomNo, @Param("start") int start,
			@Param("num") int num);

	// app��ѯ
	public List<judgeinfo> queryuserjudge(@Param("userNo") String userNo, @Param("start") int start,
			@Param("num") int num);

	public boolean insertjudgensert(judgeinfo judgeinfo);
}
