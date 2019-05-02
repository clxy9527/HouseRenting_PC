package cn.com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.com.bean.judgeinfo;
import cn.com.mapper.judgeinfoMapper;

@Service("judgeinfoServie")
public class judgeinfoServie {
	@Autowired
	private judgeinfoMapper judgeinfomapper;
	
	public List<judgeinfo> queryallweb(String judgeState){
		return judgeinfomapper.queryjudgeinfoweb(judgeState);
	}
	public void update(judgeinfo judgeinfo) {
		judgeinfomapper.updatejudge(judgeinfo);
	}
	public List<judgeinfo> queryallapp(String roomNo,int start ,int num){
		return judgeinfomapper.queryroomjudge(roomNo,start, num);
	}
	public List<judgeinfo> queryallappuser(String userNo,int start ,int num){
		return judgeinfomapper.queryuserjudge(userNo,start, num);
	}
	public boolean insertjudge(judgeinfo judgeinfo) {
		return judgeinfomapper.insertjudgensert(judgeinfo);
	}
}
