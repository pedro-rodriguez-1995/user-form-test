<%@ include file="/init.jsp" %>
<%@ taglib uri="http://liferay.com/tld/util" prefix="liferay-util" %>
<%@ taglib uri="http://liferay.com/tld/captcha" prefix="liferay-captcha" %>
<%@ page import="com.liferay.portal.kernel.captcha.CaptchaTextException"%>

    	
	<portlet:actionURL name="addUserf" var="addUserf" />
	<portlet:resourceURL id="captcha" var="captchaResourceURL"/>

	<liferay-ui:success  key="save-success"/>
	<liferay-ui:error  key="save-error" />

	
    <div>
    	<h3><liferay-ui:message key="form-title" /></h3>
		<aui:form action="<%= addUserf %>" id="frmUser" name="<portlet:namespace />fm">	
		        <aui:fieldset>	
		            <aui:input type="text" name="formUserName" required="true" style="background: white" >
		            	<aui:validator name="maxLength">20</aui:validator>
		            </aui:input>
			    	<aui:input  type="text" name="formUserSurname" required="true" style="background: white">
			    		<aui:validator name="maxLength">20</aui:validator>
		            </aui:input>
			    	<aui:input  type="date" name="formUserDate" required="true" style="background: white">
			    		
		            </aui:input>
			    	<aui:input  type="email" name="formUserEmail" required="true" style="background: white">
			    		<aui:validator name="maxLength">40</aui:validator>
		            </aui:input>
		<liferay-captcha:captcha  url="<%= captchaResourceURL %>"/>
		        </aui:fieldset>
		
		        <aui:button-row>
		            <aui:button type="submit"></aui:button>
		            <aui:button type="reset" value="clear"/>
		        </aui:button-row>
		</aui:form>
	</div>
