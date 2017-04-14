package com.integration.action.room;
import com.opensymphony.xwork2.ActionSupport;
import com.integration.entity.Room;
import com.integration.service.RoomService;
@SuppressWarnings("serial")
public class SaveRoomAction extends ActionSupport {
	private Room room;
	public RoomService roomService;
	public Room getRoom() {
		return room;
	}
	public void setRoom(Room room) {
		this.room = room;
	}
	public RoomService getRoomService() {
		return roomService;
	}
	public void setRoomService(RoomService roomService) {
		this.roomService = roomService;
	}
	@Override
	public String execute() throws Exception {
		this.roomService.saveRoom(room);
		return SUCCESS;
	}
}
