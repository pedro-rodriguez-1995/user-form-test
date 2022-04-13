<%@ include file="/init.jsp" %>
<%@ taglib uri="http://liferay.com/tld/util" prefix="liferay-util" %>
<%@ taglib uri="http://liferay.com/tld/captcha" prefix="liferay-captcha" %>

<%@ page import="com.liferay.portal.kernel.captcha.CaptchaTextException"%>
<%@page import="java.util.List" %>
<%@page import="com.test.userfsb.model.Userf" %>
<%@page import="java.text.SimpleDateFormat;" %>
<portlet:defineObjects />
    <portlet:actionURL name="addUserf" var="addUserf" />
	<portlet:resourceURL id="captcha" var="captchaResourceURL"/>
	<portlet:actionURL name="listUserf" var="listUserf" />
	

	<liferay-ui:success  key="save-success"/>
	<liferay-ui:error  key="save-error" />
    
	<liferay-ui:tabs names="tab1,tab2" tabsValues="tab1,tab2" >
    <liferay-ui:section>
    
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
		
		        </aui:fieldset>
		<liferay-captcha:captcha  url="<%= captchaResourceURL %>"/>
		        <aui:button-row>
		            <aui:button type="submit"></aui:button>
		            <aui:button type="reset" value="clear"/>
		        </aui:button-row>
		</aui:form>
	</div>
    </liferay-ui:section>
    <liferay-ui:section>
        
        <h3><liferay-ui:message key="list-title" /></h3>
        <aui:form action="<%= listUserf %>" id="frmUser" name="<portlet:namespace />fm">
        <%
        @SuppressWarnings("unchecked")
        List<Userf> userlist = (List<Userf>) portletSession.getAttribute("userlist");
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
      	  
        %>
        <aui:button type="submit" value="refresh-form"></aui:button>
        <table class="table">
  <thead>
    <tr>
      <th scope="col"><liferay-ui:message key="form-user-name" /></th>
      <th scope="col"><liferay-ui:message key="form-user-surname" /></th>
      <th scope="col"><liferay-ui:message key="form-user-email" /></th>
      <th scope="col"><liferay-ui:message key="form-user-date" /></th>
      <th scope="col"></th>
    </tr>
  </thead>
  <tbody>
  <% 
  	if(userlist!=null){
  	for(Userf userf : userlist){ %>
    <tr>
      <th scope="row"><%=userf.getName() %></th>
      <td><%=userf.getSurname() %></td>
      <td><%=userf.getEmail() %></td>
      <td><%=format.format(userf.getBirthdate())%></td>
      <td></td>
    </tr>
    <%} }%>
  </tbody>
</table>

</aui:form>   
        
        
    </liferay-ui:section>
  
</liferay-ui:tabs>
