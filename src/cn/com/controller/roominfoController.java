package cn.com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import cn.com.bean.roominfo;
import cn.com.service.roominfoService;

@Controller
@RequestMapping("roominfoController")
public class roominfoController {
	@Autowired
	private roominfoService roominfoservice;
	/**
	 * ��ѯ�����б�json
	 */
	@RequestMapping(value="/queryroominfoList",produces={"application/json;charset=UTF-8"})
	@ResponseBody
	public List<roominfo> queryroominfoList(){
		return null;
		
	}
	/**
	 * ��ѯ�����б�web
	 */
	@RequestMapping(value="/queryroominfoListweb")
	public ModelAndView queryroominfoListweb(){
		return null;
		
	}
	/**
	 * ��ѯ������Ϣjson
	 */
	@RequestMapping(value="/queryroominfo",produces={"application/json;charset=UTF-8"})
	@ResponseBody
	public roominfo queryroominfo(@PathVariable("roomNo") String roomNo){
		return null;
		
	}
	
	/**
	 * ��ѯ������Ϣweb
	 */
	@RequestMapping(value="/queryroominfoweb")
	public roominfo queryroominfoweb(@PathVariable("roomNo") String roomNo){
		return null;
		
	}
	
	/**
	 * �޸ķ�����Ϣ
	 */
	@RequestMapping("/updateroominfo")
	public void updateroominfo(roominfo roominfo) {
		
	}
	/**
	 * �޸ķ�����Ϣ
	 */
	@RequestMapping("/insertroominfo")
	public void insertroominfo(roominfo roominfo) {
		
	}
}
