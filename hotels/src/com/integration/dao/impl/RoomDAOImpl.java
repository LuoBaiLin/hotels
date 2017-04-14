package com.integration.dao.impl;
import java.util.List;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import com.integration.entity.Room;
import com.integration.dao.RoomDAO;
public class RoomDAOImpl extends HibernateDaoSupport implements RoomDAO {
	@SuppressWarnings("unchecked")
	public List<Room> findAllRoom() {
		String hql = "from Room room order by room.roomid desc";
		return (List<Room>) this.getHibernateTemplate().find(hql);
	}
	public Room findRoomById(Integer id) {
		return (Room) this.getHibernateTemplate().get(Room.class, id);
	}
	public void removeRoom(Room room) {
		this.getHibernateTemplate().delete(room);
	}
	public void saveRoom(Room room) {
		this.getHibernateTemplate().save(room);
	}
	public void updateRoom(Room room) {
		this.getHibernateTemplate().update(room);
	}
}
