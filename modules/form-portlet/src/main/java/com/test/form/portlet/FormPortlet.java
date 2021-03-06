package com.test.form.portlet;

import com.liferay.captcha.util.CaptchaUtil;
import com.liferay.mail.kernel.model.MailMessage;
import com.liferay.mail.kernel.service.MailServiceUtil;
import com.liferay.portal.kernel.captcha.CaptchaException;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;
import com.liferay.portal.kernel.servlet.SessionErrors;
import com.liferay.portal.kernel.servlet.SessionMessages;
import com.liferay.portal.kernel.theme.ThemeDisplay;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.WebKeys;
import com.test.form.constants.FormPortletKeys;
import com.test.userfsb.model.Userf;
import com.test.userfsb.service.UserfLocalServiceUtil;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import java.util.List;

import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.Portlet;
import javax.portlet.ProcessAction;

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

	@ProcessAction(name = "addUserf")
	public void addUserf(ActionRequest request, ActionResponse response) {

		String name = ParamUtil.getString(request, "formUserName");
		String surname = ParamUtil.getString(request, "formUserSurname");
		String email = ParamUtil.getString(request, "formUserEmail");

		String sdate = ParamUtil.getString(request, "formUserDate");
		LocalDate ldate = LocalDate.parse(sdate);
		Date birthdate = Date.from(ldate.atStartOfDay().atZone(ZoneId.systemDefault()).toInstant());
		Date creationdate = new Date();

		try {

			CaptchaUtil.check(request);
			UserfLocalServiceUtil.addUserf(name, surname, email, birthdate, creationdate);
			sendEmail(email, name, surname);
			SessionMessages.add(request, "save-success");
		} catch (CaptchaException e) {

			SessionErrors.add(request, "save-error");
		}

	}

	@ProcessAction(name = "listUserf")
	public void listUserf(ActionRequest request, ActionResponse response) {
		ThemeDisplay td = (ThemeDisplay) request.getAttribute(WebKeys.THEME_DISPLAY);
		List<Userf> userlist = UserfLocalServiceUtil.listUserf();

		request.getPortletSession().setAttribute("userlist", userlist);

	}

	public void sendEmail(String email, String name, String surname) {
		try {
			InternetAddress fromAddress = new InternetAddress("test.pedro1995@gmail.com");

			InternetAddress toAddress = new InternetAddress(email);

			MailMessage mailMessage = new MailMessage();
			mailMessage.setFrom(fromAddress);
			mailMessage.setTo(toAddress);
			mailMessage.setSubject("User created");
			mailMessage.setBody(name + " " + surname + " thanks for creating an account");
			MailServiceUtil.sendEmail(mailMessage);

		} catch (AddressException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}