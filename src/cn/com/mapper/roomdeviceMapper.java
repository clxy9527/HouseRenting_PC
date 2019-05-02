package cn.com.mapper;

import cn.com.bean.roomdevice;

public interface roomdeviceMapper {
	public boolean insert(roomdevice roomdevice);
	public boolean update(roomdevice roomdevice);
	public roomdevice query(String roomNo);
}
