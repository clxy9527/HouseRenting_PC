package cn.com.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import cn.com.bean.collect;

public interface collectMapper {
	public List<collect> queryallcollet(@Param("userNo") String userNo);

	public void deletecollect(@Param("userNo") String userNo, @Param("roomNo") String roomNo);

	public void insertcollect(@Param("userNo") String userNo, @Param("roomNo") String roomNo);
}
