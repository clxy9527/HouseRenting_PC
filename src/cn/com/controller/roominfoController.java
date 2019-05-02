package cn.com.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import cn.com.bean.roomdevice;
import cn.com.bean.roominfo;
import cn.com.bean.roompicture;
import cn.com.service.roomdeviceService;
import cn.com.service.roominfoService;
import cn.com.service.roompictureService;
import cn.com.utils.AppInterfaceUtil;

@Controller
@RequestMapping("roominfoController")
public class roominfoController {
	@Autowired
	private roominfoService roominfoservice;
	@Autowired
	private roomdeviceService roomdeviceservice;
	@Autowired
	private roompictureService roompictureservice;

	/**
	 * 查询房间列表jsonlist
	 */
	@RequestMapping(value = "/queryroominfoList", produces = { "application/json;charset=UTF-8" })
	@ResponseBody
	public Map<String, Object> queryroominfoList(int start, int num) {
		Map<String, Object> result = new HashMap<String, Object>();
		List<roominfo> rm = roominfoservice.queryallapp(start, num);
		result = AppInterfaceUtil.createResult(200, rm, null);
		return result;

	}

	/**
	 * 查询房间列表web
	 */
	@RequestMapping(value = "/queryroominfoListweb")
	public ModelAndView queryroominfoListweb() {
		ModelAndView mav = new ModelAndView();
		mav.addObject("roomlist", roominfoservice.queryall());
		mav.setViewName("room");
		return mav;

	}

	/**
	 * 查询房间信息json
	 */
	@RequestMapping(value = "/queryroominfo/{roomNo}", produces = { "application/json;charset=UTF-8" })
	@ResponseBody
	public Map<String, Object> queryroominfo(@PathVariable("roomNo") String roomNo) {
		Map<String, Object> result = new HashMap<String, Object>();
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("room", roominfoservice.queryroom(roomNo));
		map.put("picture", roompictureservice.query(roomNo));
		map.put("device", roomdeviceservice.query(roomNo));
		result = AppInterfaceUtil.createResult(200, map, null);
		return result;

	}

	/**
	 * 查询房间信息web
	 */
	@RequestMapping(value = "/queryroominfoweb/{roomNo}")
	public ModelAndView queryroominfoweb(@PathVariable("roomNo") String roomNo) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("photo", roompictureservice.query(roomNo));
		mav.addObject("device", roomdeviceservice.query(roomNo));
		mav.addObject("room", roominfoservice.queryroom(roomNo));
		mav.setViewName("/roominfo");
		return mav;

	}

	/**
	 * 修改房间信息
	 */
	@RequestMapping("/updateroominfo")
	public String updateroominfo(roominfo roominfo) {
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");// 设置日期格式
		String date = df.format(new Date());
		roominfo.setRoomCheckDate(date);
		roominfoservice.update(roominfo);
		return "redirect:/roominfoController/queryroominfoweb/" + roominfo.getRoomNo() + "";
	}

	/**
	 * 修改房间信息 *******
	 */
	@RequestMapping(value = "/updateroominfoapp", produces = { "application/json;charset=UTF-8" })
	@ResponseBody
	public Map<String, Object> updateroominfoapp(roominfo roominfo,roomdevice roomdevice) {
		// SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
		// String date = df.format(new Date());
		// roominfo.setRoomCheckDate(date);
		Map<String, Object> result = new HashMap<String, Object>();
		roominfo.setRoomState("-1");
		roominfoservice.update(roominfo);
		roomdeviceservice.update(roomdevice);
		result = AppInterfaceUtil.createResult(200, null, null);
		return result;
	}

	/**
	 * 新增房间信息 **********
	 */
	@RequestMapping(value = "/insertroominfo", produces = { "application/json;charset=UTF-8" })
	@ResponseBody
	public Map<String, Object> insertroominfo(roominfo roominfo,roomdevice roomdevice) {
		Map<String, Object> result = new HashMap<String, Object>();
		if (roominfoservice.insert(roominfo)&&roomdeviceservice.insert(roomdevice))
			result = AppInterfaceUtil.createResult(200, null, null);
		else
			result = AppInterfaceUtil.createResult(500, null, null);
		return result;
	}
	/**
	 * app查询我的出租房列表
	 */
	@RequestMapping(value = "/queryuserapp/{userNo}", produces = { "application/json;charset=UTF-8" })
	@ResponseBody
	public Map<String, Object> queryuserapp(@PathVariable("userNo") String userNo,int start ,int num) {
		Map<String, Object> result = new HashMap<String, Object>();
		List<roominfo> data = roominfoservice.queryuserapp(userNo, start, num);
		result = AppInterfaceUtil.createResult(200, data, null);
		return result;
	}
	/**
	 * app搜索我的出租房列表
	 */
	@RequestMapping(value = "/search/{roomTitle}", produces = { "application/json;charset=UTF-8" })
	@ResponseBody
	public Map<String, Object> search(@PathVariable("roomTitle") String roomTitle,int start ,int num) {
		Map<String, Object> result = new HashMap<String, Object>();
		List<roominfo> data = roominfoservice.searchroom(roomTitle,start,num);
		result = AppInterfaceUtil.createResult(200, data, null);
		return result;
	}
}
