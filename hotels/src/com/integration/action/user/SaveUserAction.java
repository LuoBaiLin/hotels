package com.integration.action.user;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.apache.struts2.ServletActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.integration.entity.User;
import com.integration.service.UserService;
@SuppressWarnings("serial")
public class SaveUserAction extends ActionSupport {
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
		// 调用service相关的方法，完成实际的业务处理
		this.service.save(this.user);
		return SUCCESS;
	}
	public String register() throws Exception {
		// 调用service相关的方法，完成实际的业务处理
		this.service.save(this.user);
		HttpServletRequest request = ServletActionContext.getRequest();
		HttpSession session = request.getSession();
		session.setAttribute("user", this.user);
		return "regSuc";
	}
}