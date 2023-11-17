package it.crea.si.liferay.portlet;

import it.crea.si.liferay.constants.FraUsersPortletKeys;

import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;

import javax.portlet.Portlet;

import org.osgi.service.component.annotations.Component;

/**
 * @author francesco.amato
 */
@Component(
	immediate = true,
	property = {
		"com.liferay.portlet.display-category=Fra Portlets",
		"com.liferay.portlet.header-portlet-css=/css/main.css",
		"com.liferay.portlet.instanceable=true",
		"javax.portlet.display-name=FraUsers",
		"javax.portlet.init-param.template-path=/",
		"javax.portlet.init-param.view-template=/view.jsp",
		"javax.portlet.name=" + FraUsersPortletKeys.FRAUSERS,
		"javax.portlet.resource-bundle=content.Language",
		"javax.portlet.security-role-ref=power-user,user"
	},
	service = Portlet.class
)
public class FraUsersPortlet extends MVCPortlet {
}