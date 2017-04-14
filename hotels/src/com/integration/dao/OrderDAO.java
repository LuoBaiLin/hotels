package com.integration.dao;
import java.util.List;
import com.integration.entity.Order;
import com.integration.entity.User;
public interface OrderDAO {
	public void saveOrder(Order order);
	public List<Order> findAllOrder();
	public void removeOrder(Order order);
	public void updateOrder(Order order);
	public Order findOrderById(Integer id);
	public List<Order> getUserOrder(User user);
	public Order findOrderByUseridAndRoomid(int userid, int roomid);
}
