package cn.com.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import cn.com.bean.contractinfo;

public interface contractinfoMapper {
	// web��ѯ���к�ͬ�б�
	public List<contractinfo> queryallweb();

	// web�鿴ĳ����ͬ�б�
	public contractinfo querycontractinfo(@Param("contractNo") String contractNo);

	// app�鿴�Լ��ĺ�ͬ ���ⷽ�����÷�
	public contractinfo querycontractinfoapp(@Param("contractNo") String contractNo, @Param("userNo") String userNo,
			int type);

	// ����һ����ͬ
	public void insertcontractinfo(contractinfo contractinfo);

	// �޸ĺ�ͬ
	public void updatecontractinfo(contractinfo contractinfo);
}
