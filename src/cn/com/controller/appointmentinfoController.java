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
 * ԤԼ��ÿ�����
 */
@Controller
@RequestMapping("appointmentinfoController")
public class appointmentinfoController {
	@Autowired
	private appointmentinfoService appointmentservice;

	/**
	 * �û��鿴 ��ѯ����ԤԼ����Ϣjson
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
	 * ��ѯĳ����Ϣjson
	 */
	@RequestMapping(value = "/queryAppontInfo/{appointmentNo}", produces = { "application/json;charset=UTF-8" })
	@ResponseBody
	public appointmentinfo queryone(@PathVariable("appointmentNo") String appointmentNo) {
		return null;
	}

	/**
	 * 
	 * ����ĳ����Ϣ
	 */
	@RequestMapping(value = "/updateAppontInfo")
	public void updateappoint(appointmentinfo appointmentinfo) {

	}

	/**
	 * 
	 * ������Ϣ
	 */
	@RequestMapping(value = "/insertAppontInfo")
	public void insertappoint(appointmentinfo appointmentinfo) {

	}

	/**
	 * ��̨���ݷ��ݲ鿴 ��ѯ����ԤԼ����Ϣ����ҳ��
	 */
	@RequestMapping("/queryAppontInfoList/{roomNo}/{appointmentState}")
	public ModelAndView querylistview(@PathVariable("appointmentState") String appointmentState) {
		return null;
	}

	/**
	 * 
	 * ��ѯĳ����Ϣ����ҳ��
	 */
	@RequestMapping("/queryAppontInfo/{appointmentNo}")
	public ModelAndView queryoneview(@PathVariable("appointmentNo") String appointmentNo) {
		return null;
	}
}
