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
 * 收藏表得控制器
 */
public class collectController {
	@Autowired
	private collectService collectservice;

	/**
	 * 
	 * 查询收藏列表信息json
	 */
	@RequestMapping(value = "/querycollectList/{userNo}", produces = { "application/json;charset=UTF-8" })
	@ResponseBody
	public List<collect> querycollectList(@PathVariable("userNo") String userNo) {
		return null;
	}

	/**
	 * 新增
	 */
	@RequestMapping(value = "/insertCollect/{state}/{roomNo}/{userNo}")
	@ResponseBody
	public void insertcollect(collect collect) {

	}

	/**
	 * update某个收藏列表信息json state传入0是删除
	 */
	@RequestMapping(value = "/updateCollect/{roomNo}/{userNo}")
	public void deletecollect(@PathVariable("roomNo") String roomNo, @PathVariable("userNo") String userNo) {

	}


}
