package it.crea.si.liferay.actions;

import com.liferay.portal.kernel.portlet.bridges.mvc.MVCActionCommand;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCRenderCommand;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import org.osgi.service.component.annotations.Component;

import it.crea.si.liferay.constants.FraUsersPortletKeys;

@Component(
		property = {
			"javax.portlet.name=" + FraUsersPortletKeys.FRAUSERS,
			"mvc.command.name=users_list"
		},
		service = MVCActionCommand.class
	)
public class FraUsersListMVCActionCommand implements MVCActionCommand  {

	
	public String list(
			RenderRequest renderRequest, RenderResponse renderResponse)
		throws PortletException {
System.out.println("ecchilo action");
		return "/users/userslist.jsp";
	}

	@Override
	public boolean processAction(ActionRequest arg0, ActionResponse arg1) throws PortletException {
		// TODO Auto-generated method stub
		System.out.println("ecchilo action");
		return true;
	}

}
