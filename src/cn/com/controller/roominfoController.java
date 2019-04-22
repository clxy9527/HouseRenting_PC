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
	 * 查询房间列表json
	 */
	@RequestMapping(value="/queryroominfoList",produces={"application/json;charset=UTF-8"})
	@ResponseBody
	public List<roominfo> queryroominfoList(){
		return null;
		
	}
	/**
	 * 查询房间列表web
	 */
	@RequestMapping(value="/queryroominfoListweb")
	public ModelAndView queryroominfoListweb(){
		return null;
		
	}
	/**
	 * 查询房间信息json
	 */
	@RequestMapping(value="/queryroominfo",produces={"application/json;charset=UTF-8"})
	@ResponseBody
	public roominfo queryroominfo(@PathVariable("roomNo") String roomNo){
		return null;
		
	}
	
	/**
	 * 查询房间信息web
	 */
	@RequestMapping(value="/queryroominfoweb")
	public roominfo queryroominfoweb(@PathVariable("roomNo") String roomNo){
		return null;
		
	}
	
	/**
	 * 修改房间信息
	 */
	@RequestMapping("/updateroominfo")
	public void updateroominfo(roominfo roominfo) {
		
	}
	/**
	 * 修改房间信息
	 */
	@RequestMapping("/insertroominfo")
	public void insertroominfo(roominfo roominfo) {
		
	}
}
