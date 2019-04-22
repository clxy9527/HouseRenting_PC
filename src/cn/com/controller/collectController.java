package cn.com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import cn.com.bean.collect;
import cn.com.service.collectService;

@Controller
@RequestMapping("collectController")
/**
 * 
 * �ղر�ÿ�����
 */
public class collectController {
	@Autowired
	private collectService collectservice;

	/**
	 * 
	 * ��ѯ�ղ��б���Ϣjson
	 */
	@RequestMapping(value = "/querycollectList/{userNo}", produces = { "application/json;charset=UTF-8" })
	@ResponseBody
	public List<collect> querycollectList(@PathVariable("userNo") String userNo) {
		return null;
	}

	/**
	 * ����
	 */
	@RequestMapping(value = "/insertCollect/{state}/{roomNo}/{userNo}")
	@ResponseBody
	public void insertcollect(collect collect) {

	}

	/**
	 * updateĳ���ղ��б���Ϣjson state����0��ɾ��
	 */
	@RequestMapping(value = "/updateCollect/{roomNo}/{userNo}")
	public void deletecollect(@PathVariable("roomNo") String roomNo, @PathVariable("userNo") String userNo) {

	}


}
