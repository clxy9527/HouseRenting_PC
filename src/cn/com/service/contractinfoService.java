package cn.com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.com.bean.contractinfo;
import cn.com.mapper.contractinfoMapper;

@Service("contractinfoService")
public class contractinfoService {
	@Autowired
	private contractinfoMapper contractinfomapper;
	public List<contractinfo> queryall (){
		return contractinfomapper.queryallweb();
	}
	public contractinfo queryone(String contractNo) {
		return contractinfomapper.querycontractinfo(contractNo);
	}
	public void update(contractinfo contractinfo) {
		contractinfomapper.updatecontractinfo(contractinfo);
		
	}
}
