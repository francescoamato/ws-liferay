package it.crea.si.liferay.actions;

import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCRenderCommand;
import com.liferay.portal.kernel.service.UserLocalServiceUtil;

import java.util.List;

import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import org.osgi.service.component.annotations.Component;

import it.crea.si.liferay.constants.FraUsersPortletKeys;

@Component(
		property = {
			"javax.portlet.name=" + FraUsersPortletKeys.FRAUSERS,
			"mvc.command.name=render_users_list"
		},
		service = MVCRenderCommand.class
	)
public class FraUsersListMVCRenderCommand implements MVCRenderCommand  {

	@Override
	public String render(
			RenderRequest renderRequest, RenderResponse renderResponse)
		throws PortletException {

int userCount = UserLocalServiceUtil.getUsersCount();
List<User> users = UserLocalServiceUtil.getUsers(0, userCount);

for (User user:users) {
    System.out.println("User Name: " + user.getFullName());
}
renderRequest.setAttribute("users", users);
		return "/users/userslist.jsp";
	}

}
