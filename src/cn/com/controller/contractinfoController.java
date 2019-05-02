package cn.com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import cn.com.bean.contractinfo;
import cn.com.service.contractinfoService;

@Controller
@RequestMapping("contractinfoController")
public class contractinfoController {
	/**
	 * 
	 * 合同表得控制器
	 */
	@Autowired
	private contractinfoService contractinfoservice;

	/**
	 * 查询所有列表
	 *
	 */
	@RequestMapping("/queryContractList")
	@ResponseBody
	public contractinfo queryContractList(@PathVariable("userNo") String userNo) {
		return null;

	}
	/**
	 * 查询某个合同
	 *
	 */
	@RequestMapping("/queryContract")
	@ResponseBody
	public contractinfo queryContract(@PathVariable("userNo") String userNo) {
		return null;

	}
	/**
	 * 修改合同/删除，修改一下状态而已
	 *
	 */
	@RequestMapping("/updateContract")
	public String updateContract(contractinfo contractinfo) {
		contractinfoservice.update(contractinfo);
		return "redirect:/contractinfoController/queryContractweb/"+contractinfo.getContractNo()+"";
	}
	/**
	 * 新增合同
	 *
	 */
	@RequestMapping("/insertContract")
	public void insertContract(contractinfo contractinfo) {
		
	}
	/**
	 * 查询所有列表
	 *
	 */
	@RequestMapping("/queryContractListweb")
	public ModelAndView queryContractListweb() {
		ModelAndView mav =new ModelAndView();
		mav.addObject("contract",contractinfoservice.queryall());
		mav.setViewName("contract");
		return mav;

	}
	/**
	 * 查询某个合同web
	 *
	 */
	@RequestMapping("/queryContractweb/{contractNo}")
	public ModelAndView queryContractweb(@PathVariable("contractNo") String contractNo) {
		ModelAndView mav =new ModelAndView();
		mav.addObject("contract",contractinfoservice.queryone(contractNo));
		mav.setViewName("/contractinfo");
		return mav;

	}
}
