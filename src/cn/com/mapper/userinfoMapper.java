package cn.com.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import cn.com.bean.userinfo;

public interface userinfoMapper {
	public void insert(userinfo userinfo);
	public void update(userinfo userinfo);
	public List<userinfo> queryallweb();
	public userinfo queryuser(@Param("userNo") String userNo);
}
