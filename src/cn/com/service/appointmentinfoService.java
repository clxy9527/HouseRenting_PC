package cn.com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.com.bean.appointmentinfo;
import cn.com.mapper.appointmentinfoMapper;

@Service("appointmentinfoService")
public class appointmentinfoService {
	@Autowired
	private appointmentinfoMapper appointmentinfomapper;

	public List<appointmentinfo> queryallbystate(String appointmentState) {
		return appointmentinfomapper.queryallweb(appointmentState);
	}

	public boolean insert(appointmentinfo appointmentinfo) {
		return appointmentinfomapper.insertappoint(appointmentinfo);
	};

	public boolean update(appointmentinfo appointmentinfo) {
		return appointmentinfomapper.updateappoint(appointmentinfo);
	}

	public List<appointmentinfo> queryallapp(String userNo, String appointmentState, int start, int num, int type) {
		return appointmentinfomapper.queryallapp(userNo, appointmentState, start, num, type);
	}
	public appointmentinfo queryoneapp(String appointmentNo){
		return appointmentinfomapper.queryoneapp(appointmentNo);
	}
}
