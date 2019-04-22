package cn.com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import cn.com.bean.appointmentinfo;
import cn.com.service.appointmentinfoService;

/**
 * 
 * 预约表得控制器
 */
@Controller
@RequestMapping("appointmentinfoController")
public class appointmentinfoController {
	@Autowired
	private appointmentinfoService appointmentservice;

	/**
	 * 用户查看 查询所有预约表信息json
	 */
	@RequestMapping(value = "/queryAppontInfoList/{userNo}/{appointmentState}", produces = {
			"application/json;charset=UTF-8" })
	@ResponseBody
	public appointmentinfo querylist(@PathVariable("userNo") String userNo,
			@PathVariable("appointmentState") String appointmentState, int start, int num, int type) {
		return null;
	}

	/**
	 * 
	 * 查询某个信息json
	 */
	@RequestMapping(value = "/queryAppontInfo/{appointmentNo}", produces = { "application/json;charset=UTF-8" })
	@ResponseBody
	public appointmentinfo queryone(@PathVariable("appointmentNo") String appointmentNo) {
		return null;
	}

	/**
	 * 
	 * 更新某个信息
	 */
	@RequestMapping(value = "/updateAppontInfo")
	public void updateappoint(appointmentinfo appointmentinfo) {

	}

	/**
	 * 
	 * 新增信息
	 */
	@RequestMapping(value = "/insertAppontInfo")
	public void insertappoint(appointmentinfo appointmentinfo) {

	}

	/**
	 * 后台根据房屋查看 查询所有预约表信息返回页面
	 */
	@RequestMapping("/queryAppontInfoList/{roomNo}/{appointmentState}")
	public ModelAndView querylistview(@PathVariable("appointmentState") String appointmentState) {
		return null;
	}

	/**
	 * 
	 * 查询某个信息返回页面
	 */
	@RequestMapping("/queryAppontInfo/{appointmentNo}")
	public ModelAndView queryoneview(@PathVariable("appointmentNo") String appointmentNo) {
		return null;
	}
}
