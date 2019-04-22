package cn.com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import cn.com.bean.userinfo;
import cn.com.service.userinfoService;

@Controller
@RequestMapping("userinfoController")
public class userinfoController {
	@Autowired
	private userinfoService userinfoservice;
	/**
	 * 注册
	 */

	/**
	 * 登录web
	 */
	@RequestMapping("/weblogin")
	public ModelAndView loginweb(userinfo userinfo) {
		ModelAndView mav =new ModelAndView();
		userinfoservice.login(userinfo);
		if(userinfo.getUserType()==0) {
			mav.setViewName("index");
			return mav;
		}
		else {
			mav.setViewName("login");
			return mav;
		}
	}
	/**
	 * 修改个人信息
	 */
	@RequestMapping("/updateuserInfo")
	public void updateuserInfo(userinfo userinfo) {
		
	}
	/**
	 * 获取用户列表json
	 */
	@RequestMapping(value="/queryuserinfoList",produces={"application/json;charset=UTF-8"})
	@ResponseBody
	public List<userinfo> queryuserinfoList(){
		return null;
		
	}
	/**
	 * 获取用户列表web
	 */
	@RequestMapping("/queryuserinfoListweb")
	public ModelAndView queryuserinfolistweb() {
		return null;
		
	}
	/**
	 * 获取个人信息json
	 */
	@RequestMapping(value="/queryuserinfo",produces={"application/json;charset=UTF-8"})
	@ResponseBody
	public userinfo queryuserinfo(@PathVariable("userNo") String userNo){
		return null;
		
	}
	/**
	 * 获取个人信息web
	 */
	@RequestMapping("/queryuserinfoweb")
	public ModelAndView queryuserinfoweb(@PathVariable("userNo") String userNo) {
		return null;
		
	}
}
