package cn.com.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import cn.com.bean.contractinfo;

public interface contractinfoMapper {
	// web查询所有合同列表
	public List<contractinfo> queryallweb();

	// web查看某个合同列表
	public contractinfo querycontractinfo(@Param("contractNo") String contractNo);

	// app查看自己的合同 出租方和租用方
	public contractinfo querycontractinfoapp(@Param("contractNo") String contractNo, @Param("userNo") String userNo,
			int type);

	// 新增一个合同
	public void insertcontractinfo(contractinfo contractinfo);

	// 修改合同
	public void updatecontractinfo(contractinfo contractinfo);
}
