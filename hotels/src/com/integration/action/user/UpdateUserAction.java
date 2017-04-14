package com.integration.action.user;
import com.opensymphony.xwork2.ActionSupport;
import com.integration.entity.User;
import com.integration.service.UserService;
@SuppressWarnings("serial")
public class UpdateUserAction extends ActionSupport {
	private User user;
	private UserService service;
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public UserService getService() {
		return service;
	}
	public void setService(UserService service) {
		this.service = service;
	}
	@Override
	public String execute() throws Exception {
		this.service.update(user);
		return SUCCESS;
	}
}