package cn.com.service;

import java.util.List;

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
}
