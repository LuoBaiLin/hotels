package com.integration.action.order;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.apache.struts2.ServletActionContext;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.integration.entity.Room;
import com.integration.entity.Order;
import com.integration.entity.User;
import com.integration.service.RoomService;
import com.integration.service.OrderService;
@SuppressWarnings("serial")
public class OrderServiceAction extends ActionSupport {
	private Room room;
	private OrderService orderService;
	private RoomService roomService;
	private String message;
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public Room getRoom() {
		return room;
	}
	public void setRoom(Room room) {
		this.room = room;
	}
	public OrderService getOrderService() {
		return orderService;
	}
	public void setOrderService(OrderService orderService) {
		this.orderService = orderService;
	}
	public RoomService getRoomService() {
		return roomService;
	}
	public void setRoomService(RoomService roomService) {
		this.roomService = roomService;
	}
	// 得到用户所预定的房间
	@SuppressWarnings("unchecked")
	public String execute() throws Exception {
		//得到orders的当前用户的订单 
		HttpServletRequest request = ServletActionContext.getRequest();
		HttpSession session = request.getSession();
		User user = (User) session.getAttribute("user");
		List<Order> orders = this.orderService.getUserOrder(user);
		//根据用户的order.getRoomid得到用户所定的房间存入hotels
		List<Room> rooms = new ArrayList<Room>();
		if (orders.size() > 0) {
			for (Order order : orders) {
				rooms.add((Room)this.roomService.findRoomById(order
						.getRoomid()));
			}
		}
		//保存用户所定的房间hotels到listUserHotel里面，在jsp里面取出来显示 
		Map requestList = (Map) ActionContext.getContext().get("request");
		requestList.put("listUserRoom", rooms);
		return SUCCESS;
	}
	// 退订
	public String delete() {
		HttpServletRequest request = ServletActionContext.getRequest();
		HttpSession session = request.getSession();
		User user = (User) session.getAttribute("user");
		// 删除订单
		Order order = this.orderService.findOrderByUseridAndRoomid(user
				.getUserid(), room.getRoomid());
		this.orderService.removeOrder(order);
		// 设置房间为空，无客人
		Room roomUser = this.roomService.findRoomById(room.getRoomid());
		roomUser.setStatus(0);
		this.roomService.updateRoom(roomUser);
		message = "退订房间成功。";
		return "delSuc";
	}
}