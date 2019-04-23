package cn.com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.com.bean.userinfo;
import cn.com.mapper.userinfoMapper;

@Service("userinfoService")
public class userinfoService {
	@Autowired
	private userinfoMapper userinfomapper;

	// 注册
	public boolean register(userinfo userinfo) {
		if (userinfo.getUserNo() != null && userinfo.getLoginPassword() != null) {
			userinfomapper.insert(userinfo);
			return true;
		} else {
			return false;
		}

	}

	// 登录
	public userinfo login(userinfo userinfo) {
		String password = userinfo.getLoginPassword();
		userinfo u2 = userinfomapper.queryuser(userinfo.getUserNo());
		if (u2.getLoginPassword().equals(password)) {
			return u2;
		} else {
			return userinfo;
		}
	}

	// 查询列表
	public List<userinfo> queryallweb() {
		List<userinfo> info = userinfomapper.queryallweb();
		return info;
	}

	// 查询某个人信息
	public userinfo queryuser(String userNo) {
		userinfo uf = userinfomapper.queryuser(userNo);
		return uf;

	}
}
