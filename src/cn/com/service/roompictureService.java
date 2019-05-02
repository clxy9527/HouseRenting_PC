package cn.com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.com.bean.roompicture;
import cn.com.mapper.roompictureMapper;

@Service("roompictureService")
public class roompictureService {
	@Autowired
	private roompictureMapper roompicturemapper;
	public List<roompicture> query(String roomNo){
		return roompicturemapper.query(roomNo);
	}
	public boolean insert (roompicture roompicture) {
		return roompicturemapper.insert(roompicture);
	}
}
