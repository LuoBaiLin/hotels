package com.integration.action.user;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.apache.struts2.ServletActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.integration.entity.User;
import com.integration.service.UserService;
@SuppressWarnings("serial")
public class UserAction extends ActionSupport {
	private User user;
	private UserService userService;
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
	public UserService getUserService() {
		return userService;
	}
	public void setUserService(UserService userService) {
		this.userService = userService;
	}
	@Override
	public String execute() throws Exception {

		return SUCCESS;
	}
	public String login() throws Exception {
		User userLogin = userService.loginUser(user);
		if (userLogin != null) {
			HttpServletRequest request = ServletActionContext.getRequest();
			HttpSession session = request.getSession();
			session.setAttribute("user", userLogin);
			return SUCCESS;
		}
		return INPUT;
	}
	public String loginOut() throws Exception {
		HttpServletRequest request = ServletActionContext.getRequest();
		HttpSession session = request.getSession();
		session.removeAttribute("user");
		return INPUT;
	}
	public String userUpdateInfo() {
		HttpServletRequest request = ServletActionContext.getRequest();
		HttpSession session = request.getSession();
		User user = (User) session.getAttribute("user");
		this.user = this.userService.findById(user.getUserid());
		return "userUpdate";
	}
	public String updateUser() {
		this.userService.update(user);
		message = "修改信息成功。";
		return "updateSuc";
	}
}