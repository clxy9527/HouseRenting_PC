package cn.com.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import cn.com.bean.appointmentinfo;

public interface appointmentinfoMapper {
	// ����web���ݷ��ݲ�ѯ��������ҳ�ˡ�������
	public List<appointmentinfo> queryallweb(@Param("appointmentState") String appointmentState);

	// ����app��ѯ������ҳ 0��ԤԼ�ߣ� 1�Ǳ�ԤԼ����
	public List<appointmentinfo> queryallapp(@Param("userNo") String userNo,
			@Param("appointmentState") String appointmentState, int start, int num, int type);

	// �鿴�����ԤԼ��Ϣ
//	public appointmentinfo queryappoint(@Param("apponintNo") String apponintNo);
	// ԤԼ��Ϣ�޸�
	public void updateappoint(appointmentinfo appointmentinfo);

	// ����һ��ԤԼ��Ϣ
	public void insertappoint(appointmentinfo appointmentinfo);

}
