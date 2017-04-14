package com.integration.action.admin;
import com.opensymphony.xwork2.ActionSupport;
import com.integration.entity.Admin;
import com.integration.service.AdminService;
@SuppressWarnings("serial")
public class SaveAdminAction extends ActionSupport {
	private Admin admin;
	private AdminService adminService;
	public Admin getAdmin() {
		return admin;
	}
	public void setAdmin(Admin admin) {
		this.admin = admin;
	}
	public AdminService getAdminService() {
		return adminService;
	}
	public void setAdminService(AdminService adminService) {
		this.adminService = adminService;
	}
	public String execute() throws Exception {
		this.adminService.saveAdmin(admin);
		return SUCCESS;
	}
}