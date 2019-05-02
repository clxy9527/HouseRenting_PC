package cn.com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.com.bean.roomdevice;
import cn.com.mapper.roomdeviceMapper;

@Service("roomdeviceService")
public class roomdeviceService {
	@Autowired private roomdeviceMapper roomdevicemapper;
	public roomdevice query(String roomNo) {
		return roomdevicemapper.query(roomNo);
	}
	public boolean update(roomdevice roomdevice) {
		return roomdevicemapper.update(roomdevice);
	}
	public boolean insert(roomdevice roomdevice) {
		return roomdevicemapper.insert(roomdevice);
	}
}
