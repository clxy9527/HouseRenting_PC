package cn.com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.com.bean.judgeinfo;
import cn.com.service.judgeinfoServie;

@Controller
@RequestMapping("judgeinfoCotroller")
public class judgeinfoCotroller {
	@Autowired
	private judgeinfoServie judgeinfoservie;
	/*
	 * ��ѯ��������
	 */
	@RequestMapping(value="/queryroomJudgeList",produces={"application/json;charset=UTF-8"})
	@ResponseBody
	public judgeinfo queryroomjudge(@RequestParam("roomNo")String roomNo) {
		return null;
		
	}
	/*
	 * ��ѯ��������
	 */
	@RequestMapping(value="/queryuserJudgeList",produces={"application/json;charset=UTF-8"})
	@ResponseBody
	public judgeinfo queryuserjudge(@RequestParam("userNo")String userNo) {
		return null;
		
	}
	/*
	 * ����һ������
	 */
	@RequestMapping("/insertJudegList")
	public void insert(judgeinfo judgeinfo) {
		
	}
	/*
	 * �޸�һ������״̬
	 */
	@RequestMapping("/updateJudeg")
	public void update(judgeinfo judgeinfo) {
		
	}
}
