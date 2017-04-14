package com.integration.service.impl;
import java.util.List;
import com.integration.entity.Order;
import com.integration.entity.User;
import com.integration.dao.OrderDAO;
import com.integration.service.OrderService;
public class OrderServiceImpl implements OrderService {
	private OrderDAO orderDao;

	public OrderDAO getOrderDao() {
		return orderDao;
	}
	public void setOrderDao(OrderDAO orderDao) {
		this.orderDao = orderDao;
	}
	public List<Order> findAllOrder() {
		return this.orderDao.findAllOrder();
	}
	public Order findOrderById(Integer id) {
		return this.orderDao.findOrderById(id);
	}
	public void removeOrder(Order order) {
		this.orderDao.removeOrder(order);
	}
	public void saveOrder(Order order) {
		this.orderDao.saveOrder(order);
	}
	public void updateOrder(Order order) {
		this.orderDao.updateOrder(order);
	}
	public List<Order> getUserOrder(User user) {
		return this.orderDao.getUserOrder(user);
	}
	public Order findOrderByUseridAndRoomid(int userid, int roomid) {
		return this.orderDao.findOrderByUseridAndRoomid(userid, roomid);
	}
}
