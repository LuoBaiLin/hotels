package com.integration.action.order;
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
public class SaveOrderAction extends ActionSupport {
	private Order order;
	private User user;
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
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
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
	public Order getOrder() {
		return order;
	}
	public void setOrder(Order order) {
		this.order = order;
	}
	public OrderService getOrderService() {
		return orderService;
	}
	public void setOrderService(OrderService orderService) {
		this.orderService = orderService;
	}
	@SuppressWarnings("unchecked")
	@Override
	public String execute() throws Exception {
		Map request = (Map) ActionContext.getContext().get("request");
		request.put("listRoom", this.roomService.findAllRoom());
		return SUCCESS;
	}
	public String add() {
		// 判断房间是否开放
		Room roomUser = this.roomService.findRoomById(room.getRoomid());
		if (roomUser.getStatus() == 0) {
			HttpServletRequest request = ServletActionContext.getRequest();
			HttpSession session = request.getSession();
			User user = (User) session.getAttribute("user");
			order.setUserid(user.getUserid());
			// 预定
			this.orderService.saveOrder(order);
			// 设置房间为满（有客人）
			roomUser.setStatus(1);
			this.roomService.updateRoom(roomUser);
			return "addSuc";
		} else {
			message = "该房间已经有客人入住了。";
			return "addFail";
		}
	}
}