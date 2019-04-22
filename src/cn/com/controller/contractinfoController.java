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
	 * ��ͬ���ÿ�����
	 */
	@Autowired
	private contractinfoService contractinfoservice;

	/**
	 * ��ѯ�����б�
	 *
	 */
	@RequestMapping("/queryContractList")
	@ResponseBody
	public contractinfo queryContractList(@PathVariable("userNo") String userNo) {
		return null;

	}
	/**
	 * ��ѯĳ����ͬ
	 *
	 */
	@RequestMapping("/queryContract")
	@ResponseBody
	public contractinfo queryContract(@PathVariable("userNo") String userNo) {
		return null;

	}
	/**
	 * �޸ĺ�ͬ/ɾ�����޸�һ��״̬����
	 *
	 */
	@RequestMapping("/updateContract")
	public void updateContract(contractinfo contractinfo) {
		
	}
	/**
	 * ������ͬ
	 *
	 */
	@RequestMapping("/insertContract")
	public void insertContract(contractinfo contractinfo) {
		
	}
	/**
	 * ��ѯ�����б�
	 *
	 */
	@RequestMapping("/queryContractListweb")
	public ModelAndView queryContractListweb() {
		return null;

	}
	/**
	 * ��ѯĳ����ͬweb
	 *
	 */
	@RequestMapping("/queryContractweb")
	public ModelAndView queryContractweb(@PathVariable("userNo") String userNo) {
		return null;

	}
}