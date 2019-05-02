package cn.com.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import cn.com.bean.appointmentinfo;

public interface appointmentinfoMapper {
	// ����web���ݷ��ݲ�ѯ��������ҳ�ˡ�������
	public List<appointmentinfo> queryallweb(@Param("appointmentState") String appointmentState);

	// ����app��ѯ������ҳ 0��ԤԼ�ߣ� 1�Ǳ�ԤԼ����
	public List<appointmentinfo> queryallapp(@Param("userNo") String userNo,
			@Param("appointmentState") String appointmentState,@Param("start") int start,@Param("num") int num,@Param("type")  int type);

	// �鿴�����ԤԼ��Ϣ
//	public appointmentinfo queryappoint(@Param("apponintNo") String apponintNo);
	// ԤԼ��Ϣ�޸�״̬
	public boolean updateappoint(appointmentinfo appointmentinfo);

	// ����һ��ԤԼ��Ϣ
	public boolean insertappoint(appointmentinfo appointmentinfo);
	//app�鿴ĳ��ԤԼ
	public appointmentinfo queryoneapp(@Param("appointmentNo") String appointmentNo);
}
