package com.test.form.portlet;

import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;
import com.test.form.constants.FormPortletKeys;

import javax.portlet.Portlet;

import org.osgi.service.component.annotations.Component;

/**
 * @author Pedro Rodriguez
 */
@Component(immediate = true, property = { "com.liferay.portlet.display-category=User Form",
		"com.liferay.portlet.header-portlet-css=/css/main.css", "com.liferay.portlet.instanceable=true",
		"javax.portlet.display-name=Form", "javax.portlet.init-param.template-path=/",
		"javax.portlet.init-param.view-template=/view.jsp", "javax.portlet.name=" + FormPortletKeys.FORM,
		"javax.portlet.resource-bundle=content.Language",
		"javax.portlet.security-role-ref=power-user,user" }, service = Portlet.class)
public class FormPortlet extends MVCPortlet {
}