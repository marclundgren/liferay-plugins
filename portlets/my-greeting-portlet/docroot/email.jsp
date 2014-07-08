<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@ taglib uri="http://liferay.com/tld/aui" prefix="aui" %>
<%@ page import="com.liferay.portal.kernel.util.ParamUtil" %>
<%@ page import="com.liferay.portal.kernel.util.Validator" %>
<%@ page import="javax.portlet.PortletPreferences" %>

<portlet:defineObjects />

<% 
   PortletPreferences prefs = renderRequest.getPreferences(); 
   String email = (String)prefs.getValue("email", "default@gmail.com");
%>

<portlet:actionURL var="sendEmailURL" name="sendEmail">
    <portlet:param name="mvcPath" value="/email.jsp" />
</portlet:actionURL>

<aui:form action="<%= sendEmailURL %>" method="post">
        <aui:input label="email" name="email" type="text" value="<%=email %>" />
        <aui:button label="flim" name="flam" type="submit" />
</aui:form>


<portlet:renderURL var="viewGreetingURL">
        <portlet:param name="mvcPath" value="/view.jsp" />
</portlet:renderURL>

<p><a href="<%= viewGreetingURL %>">&larr; Back</a></p>