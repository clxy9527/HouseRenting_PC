package cn.com.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import cn.com.bean.roompicture;

public interface roompictureMapper {
	public void insert(roompicture roompicture);
	//ͼƬ����ʱ�����������Բ����ظ�
	public void delete(List<String> picture);
}
