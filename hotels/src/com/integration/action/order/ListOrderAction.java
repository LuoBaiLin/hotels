package com.integration.action.order;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.integration.entity.Room;
import com.integration.entity.Order;
import com.integration.service.RoomService;
import com.integration.service.OrderService;
@SuppressWarnings("serial")
public class ListOrderAction extends ActionSupport {
	private Order order;
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
		//�õ�orders�������û��Ķ��� 
		List<Order> orders = this.orderService.findAllOrder();
		//�����û���order.getRoomid�õ��û������ķ������hotels
		List<Room> rooms = new ArrayList<Room>();
		if (orders.size() > 0) {
			for (Order order : orders) {
				rooms.add((Room) this.roomService.findRoomById(order
						.getRoomid()));
			}
		}
		//�����û������ķ���hotels��listAllHotel���棬��jsp����ȡ������ʾ 
		Map requestList = (Map) ActionContext.getContext().get("request");
		requestList.put("listAllRoom", rooms);
		return SUCCESS;
	}
}