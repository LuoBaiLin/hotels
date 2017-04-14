package com.integration.dao.impl;
import java.util.List;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import com.integration.entity.Admin;
import com.integration.dao.AdminDAO;
public class AdminDAOImpl extends HibernateDaoSupport implements AdminDAO {
	@SuppressWarnings("unchecked")
	public List<Admin> findAllAdmin() {
		String hql = "from Admin admin order by admin.username desc)";
		return (List<Admin>) this.getHibernateTemplate().find(hql);
	}
	public Admin findAdminById(Integer id) {
		return (Admin) this.getHibernateTemplate().get(Admin.class, id);
	}
	public void removeAdmin(Admin admin) {
		this.getHibernateTemplate().delete(admin);
	}
	public void saveAdmin(Admin admin) {
		this.getHibernateTemplate().save(admin);
	}
	public void updateAdmin(Admin admin) {
		this.getHibernateTemplate().update(admin);
	}
	@SuppressWarnings("unchecked")
	public Admin loginAdmin(Admin admin) {
		String hql = "from Admin admin where admin.username='"
				+ admin.getUsername() + "' and admin.password='"
				+ admin.getPassword() + "'";
		List<Admin> admins = (List<Admin>) this.getHibernateTemplate()
				.find(hql);
		if (admins.size() > 0) {
			return admins.get(0);
		}
		return null;
	}

}
