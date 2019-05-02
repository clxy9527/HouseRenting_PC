package cn.com.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.com.bean.roominfo;
import cn.com.mapper.roominfoMapper;

@Service("roominfoService")
public class roominfoService {
	@Autowired
	private roominfoMapper roominfomapper;

	public List<roominfo> queryall() {
		return roominfomapper.queryallweb();
	}

	public roominfo queryroom(String roomNo) {
		return roominfomapper.queryweb(roomNo);
	}

	public void update(roominfo roominfo) {
		roominfomapper.update(roominfo);
	}

	public boolean insert(roominfo roominfo) {
		if (roominfomapper.insert(roominfo))
			return true;
		else
			return false;
	}

	public List<roominfo> queryallapp(int start, int num) {
		return roominfomapper.queryallapp(start, num);
	}

	public List<roominfo> queryuserapp(String userNo, int start, int num) {
		return roominfomapper.queryuserapp(userNo, start, num);
	}

	public List<roominfo> searchroom(String roomTitle, int start, int num) {
		return roominfomapper.searchroom(roomTitle,start,num);
	}
}
