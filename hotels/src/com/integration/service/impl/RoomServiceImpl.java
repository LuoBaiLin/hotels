package com.integration.service.impl;
import java.util.List;
import com.integration.entity.Room;
import com.integration.dao.RoomDAO;
import com.integration.service.RoomService;
public class RoomServiceImpl implements RoomService {
	private RoomDAO roomDao;
	public RoomDAO getRoomDao() {
		return roomDao;
	}
	public void setRoomDao(RoomDAO roomDao) {
		this.roomDao = roomDao;
	}
	public List<Room> findAllRoom() {
		return this.roomDao.findAllRoom();
	}
	public Room findRoomById(Integer id) {
		return this.roomDao.findRoomById(id);
	}
	public void removeRoom(Room room) {
		this.roomDao.removeRoom(room);
	}
	public void saveRoom(Room room) {
		this.roomDao.saveRoom(room);
	}
	public void updateRoom(Room room) {
		this.roomDao.updateRoom(room);
	}
}
