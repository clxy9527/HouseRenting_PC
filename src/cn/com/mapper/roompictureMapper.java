package cn.com.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import cn.com.bean.roompicture;

public interface roompictureMapper {
	public void insert(roompicture roompicture);
	//图片根据时间命名，所以不会重复
	public void delete(List<String> picture);
}
