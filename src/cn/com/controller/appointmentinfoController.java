package cn.com.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import cn.com.bean.appointmentinfo;
import cn.com.service.appointmentinfoService;
import cn.com.utils.AppInterfaceUtil;

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
	public Map<String, Object> querylist(@PathVariable("userNo") String userNo,
			@PathVariable("appointmentState") String appointmentState, int start, int num, int type) {
		Map<String, Object> result = new HashMap<String, Object>();
		List<appointmentinfo> data = appointmentservice.queryallapp(userNo, appointmentState, start, num, type);
		result = AppInterfaceUtil.createResult(200, data, null);
		return result;
	}

	/**
	 * 
	 * 查询某个信息json
	 */
	@RequestMapping(value = "/queryAppontInfo/{appointmentNo}", produces = { "application/json;charset=UTF-8" })
	@ResponseBody
	public Map<String, Object> queryone(@PathVariable("appointmentNo") String appointmentNo) {
		Map<String, Object> result = new HashMap<String, Object>();
		appointmentinfo data = appointmentservice.queryoneapp(appointmentNo);
		result = AppInterfaceUtil.createResult(200, data, null);
		return result;
	}

	/**
	 * 
	 * 更新某个信息的状态和时间
	 */
	@RequestMapping(value = "/updateAppontInfo", produces = { "application/json;charset=UTF-8" })
	@ResponseBody
	public Map<String, Object> updateappoint(appointmentinfo appointmentinfo) {
		Map<String, Object> result = new HashMap<String, Object>();
		if (appointmentservice.update(appointmentinfo))
			result = AppInterfaceUtil.createResult(200, null, null);
		else
			result = AppInterfaceUtil.createResult(500, null, null);
		return result;
	}

	/**
	 * 
	 * 新增信息
	 */
	@RequestMapping(value = "/insertAppontInfo", produces = { "application/json;charset=UTF-8" })
	@ResponseBody
	public Map<String, Object> insertappoint(appointmentinfo appointmentinfo) {
		Map<String, Object> result = new HashMap<String, Object>();
		if (appointmentservice.insert(appointmentinfo))
			result = AppInterfaceUtil.createResult(200, null, null);
		else
			result = AppInterfaceUtil.createResult(500, null, null);
		return result;
	}

	/**
	 * 后台根据房屋查看 查询所有预约表信息返回页面
	 */
	@RequestMapping("/queryAppontInfoList/{appointmentState}")
	public ModelAndView querylistview(@PathVariable("appointmentState") String appointmentState) {
		ModelAndView mdv = new ModelAndView();
		List<appointmentinfo> appo = appointmentservice.queryallbystate(appointmentState);
		mdv.addObject("appo", appo);
		mdv.setViewName("/appointment");
		return mdv;
	}

	
}
