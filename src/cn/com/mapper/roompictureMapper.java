package cn.com.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import cn.com.bean.roompicture;

public interface roompictureMapper {
	public boolean insert(roompicture roompicture);
	//图片根据时间命名，所以不会重复
	public boolean delete(List<String> picture);
	public List<roompicture> query(String roomNo);
}
