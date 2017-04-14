package com.integration.service;
import java.util.List;
import com.integration.entity.Room;
public interface RoomService {
	public void saveRoom(Room room);
	public List<Room> findAllRoom();			
	public void removeRoom(Room room);
	public void updateRoom(Room room);	
	public Room findRoomById(Integer id);	
}
