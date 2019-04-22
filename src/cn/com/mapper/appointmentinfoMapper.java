package cn.com.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import cn.com.bean.appointmentinfo;

public interface appointmentinfoMapper {
	// 用于web根据房屋查询，不做分页了。。。。
	public List<appointmentinfo> queryallweb(@Param("appointmentState") String appointmentState);

	// 用于app查询，做分页 0是预约者， 1是被预约的人
	public List<appointmentinfo> queryallapp(@Param("userNo") String userNo,
			@Param("appointmentState") String appointmentState, int start, int num, int type);

	// 查看具体的预约信息
//	public appointmentinfo queryappoint(@Param("apponintNo") String apponintNo);
	// 预约信息修改
	public void updateappoint(appointmentinfo appointmentinfo);

	// 新增一条预约信息
	public void insertappoint(appointmentinfo appointmentinfo);

}
