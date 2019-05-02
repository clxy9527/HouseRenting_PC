package cn.com.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import cn.com.bean.userinfo;
import cn.com.service.roominfoService;
import cn.com.service.userinfoService;
import cn.com.utils.AppInterfaceUtil;
import cn.com.utils.Static;
import cn.com.utils.idCreated;

@Controller
@RequestMapping("userinfoController")
public class userinfoController {
	@Autowired
	private userinfoService userinfoservice;
	@Autowired
	private roominfoService roominfoservice;

	/**
	 * ע��
	 */
	@RequestMapping(value="/regist",produces={"application/json;charset=UTF-8"})
	@ResponseBody
	public Map<String, Object> regist(String userName, String phone, String password, int userType) {
		Map<String, Object> result = new HashMap<String, Object>();
		if (userType == 0) {
			// ���ⷽ
			idCreated ic = new idCreated();
			userinfo uinfo = new userinfo();
			uinfo.setPhone(phone);
			uinfo.setUserName(userName);
			uinfo.setUserType(userType);
			uinfo.setLoginPassword(password);
			uinfo.setUserNo("S" + ic.getNo());
			userinfoservice.register(uinfo);
			result = AppInterfaceUtil.createResult(200, null, null);
		}
		if (userType == 1) {
			// �ⷽ��
			idCreated ic = new idCreated();
			userinfo uinfo = new userinfo();
			uinfo.setPhone(phone);
			uinfo.setUserName(userName);
			uinfo.setUserType(userType);
			uinfo.setLoginPassword(password);
			uinfo.setUserNo("C" + ic.getNo());
			userinfoservice.register(uinfo);
			result = AppInterfaceUtil.createResult(200, null, null);
		}
		return result;
	}

	/**
	 * ��¼app
	 */
	@RequestMapping(value="/applogin",produces={"application/json;charset=UTF-8"})
	@ResponseBody
	public Map<String, Object> applogin(userinfo userinfo, HttpSession session) {
		Map<String, Object> result = new HashMap<String, Object>();
		userinfo u2 = userinfoservice.login(userinfo);
		System.out.println("userinfo===>>>>" + u2.getUserType());
		session.setAttribute("name", u2.getUserName());
		session.setAttribute("no", u2.getUserNo());
		if (userinfo.getUserType() == 0) {
			AppInterfaceUtil.createResult(200, null, null);
		} else {
			result = AppInterfaceUtil.createResult(200, null, null);
		}
		return result;
	}

	/**
	 * ��¼web
	 */
	@RequestMapping("/weblogin")
	public ModelAndView loginweb(userinfo userinfo, HttpSession session) {
		ModelAndView mav = new ModelAndView();
		userinfo u2 = userinfoservice.login(userinfo);
		System.out.println("userinfo===>>>>" + u2.getUserType());
		session.setAttribute("name", u2.getUserName());
		session.setAttribute("no", u2.getUserNo());
		if (userinfo.getUserType() == 0) {
			mav.addObject("user", u2);
			mav.addObject("roomlist", roominfoservice.queryall());
			mav.setViewName("index");
			return mav;
		} else {
			mav.setViewName("login");
			return mav;
		}
	}

	/**
	 * �޸ĸ�����Ϣ
	 */
	@RequestMapping(value="/updateuserInfo",produces={"application/json;charset=UTF-8"})
	@ResponseBody
	public Map<String, Object> updateuserInfo(userinfo userinfo) {
		Map<String, Object> result = new HashMap<String, Object>();
		if (userinfoservice.update(userinfo))
			AppInterfaceUtil.createResult(200, null, null);
		else
			AppInterfaceUtil.createResult(500, null, null);
		return result;
	}

	/**
	 * ��ȡ�û��б�web
	 */
	@RequestMapping("/queryuserinfoListweb")
	public ModelAndView queryuserinfolistweb() {
		ModelAndView mav = new ModelAndView();
		mav.addObject("user", userinfoservice.queryallweb());
		mav.setViewName("user");
		return mav;

	}

	/**
	 * ��ȡ������Ϣjson
	 */
	@RequestMapping(value = "/queryuserinfo/{userNo}", produces = { "application/json;charset=UTF-8" })
	@ResponseBody
	public Map<String, Object> queryuserinfo(@PathVariable("userNo") String userNo) {
		userinfo uc = new userinfo();
		Map<String, Object> result = new HashMap<String, Object>();
		uc = userinfoservice.queryuser(userNo);
		if (uc.getUserName() != null) {
			result = AppInterfaceUtil.createResult(200, uc, null);
		} else {
			result = AppInterfaceUtil.createResult(500, null, null);
		}
		return result;

	}
}
