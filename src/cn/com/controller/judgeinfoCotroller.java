package cn.com.controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import cn.com.bean.judgeinfo;
import cn.com.service.judgeinfoServie;
import cn.com.utils.AppInterfaceUtil;

@Controller
@RequestMapping("judgeinfoCotroller")
public class judgeinfoCotroller {
	@Autowired
	private judgeinfoServie judgeinfoservie;

	/*
	 * 查询房屋评价room
	 */
	@RequestMapping(value = "/queryroomJudgeList/{roomNo}", produces = { "application/json;charset=UTF-8" })
	@ResponseBody
	public Map<String, Object> queryroomJudgeList(@PathVariable("roomNo") String roomNo, int start, int num) {
		Map<String, Object> result = new HashMap<String, Object>();
		List<judgeinfo> data = judgeinfoservie.queryallapp(roomNo, start, num);
		result = AppInterfaceUtil.createResult(200, data, null);
		return result;

	}

	/*
	 * 查询房屋评价user
	 */
	@RequestMapping(value = "/queryuserJudgeList/{userNo}", produces = { "application/json;charset=UTF-8" })
	@ResponseBody
	public Map<String, Object> queryuserJudgeList(@PathVariable("userNo") String userNo, int start, int num) {
		Map<String, Object> result = new HashMap<String, Object>();
		List<judgeinfo> data = judgeinfoservie.queryallappuser(userNo, start, num);
		result = AppInterfaceUtil.createResult(200, data, null);
		return result;

	}

	/*
	 * 新增一个评价
	 */
	@RequestMapping(value = "/insertJudegList", produces = { "application/json;charset=UTF-8" })
	@ResponseBody
	public Map<String, Object> insert(judgeinfo judgeinfo) {
		Map<String, Object> result = new HashMap<String, Object>();
		 SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
		 String date = df.format(new Date());
		 judgeinfo.setJudgeDate(date);
		 judgeinfo.setJudgeState("-1");
		if (judgeinfoservie.insertjudge(judgeinfo))
			result = AppInterfaceUtil.createResult(200, null, null);
		else
			result = AppInterfaceUtil.createResult(500, null, null);
		return result;
	}

	/*
	 * 修改一个评价状态
	 */
	@RequestMapping("/updateJudge/{judgeNo}/{judgeState}")
	public String update(@PathVariable("judgeNo") String judgeNo, @PathVariable("judgeState") String judgeState) {
		judgeinfo judgeinfo = new judgeinfo();
		judgeinfo.setJudgeNo(judgeNo);
		judgeinfo.setJudgeState(judgeState);
		judgeinfoservie.update(judgeinfo);
		return "redirect:/judgeinfoCotroller/queryallweb/0";
	}

	/**
	 * web查看评价列表
	 */
	@RequestMapping("/queryallweb/{judgeState}")
	public ModelAndView queryallweb(@PathVariable("judgeState") String judgeState) {
		ModelAndView mad = new ModelAndView();
		mad.addObject("judge", judgeinfoservie.queryallweb(judgeState));
		mad.setViewName("/judge");
		return mad;
	}
}
