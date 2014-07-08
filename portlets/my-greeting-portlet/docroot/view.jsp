<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@ taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui" %>
<%@ page import="javax.portlet.PortletPreferences" %>
<%@ taglib uri="http://liferay.com/tld/theme" prefix="liferay-theme"%>

<liferay-theme:defineObjects />
<portlet:defineObjects />

<liferay-ui:success key="success" message="Greeting saved successfully!" />
<liferay-ui:error key="error" message="Sorry, an error prevented saving your greeting" />

<% 
   PortletPreferences prefs = renderRequest.getPreferences(); 
   String greeting = (String)prefs.getValue("greeting", "Hello! Welcome to our portal.");
   String email = (String)prefs.getValue("email", "default@gmail.com");
%>

<p>
<liferay-ui:message key="welcome-x" arguments="<%= user.getScreenName() %>" /> <%= greeting %>
</p>
<p><%= email %></p>

<portlet:renderURL var="editGreetingURL">
    <portlet:param name="mvcPath" value="/edit.jsp" />
</portlet:renderURL>

<portlet:renderURL var="sendEmailURL">
    <portlet:param name="mvcPath" value="/email.jsp" />
</portlet:renderURL>

<p><a href="<%= editGreetingURL %>">Edit greeting</a></p>
<p><a href="<%= sendEmailURL %>">ermflail this greeting</a></p>
