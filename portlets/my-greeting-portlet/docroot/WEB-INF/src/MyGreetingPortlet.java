package com.liferay.samples;

import java.io.IOException;
import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletException;
import javax.portlet.PortletPreferences;
import com.liferay.util.bridges.mvc.MVCPortlet;
import com.liferay.portal.kernel.servlet.SessionMessages;
import com.liferay.portal.kernel.servlet.SessionErrors;

public class MyGreetingPortlet extends MVCPortlet {
   public void setGreeting(
    ActionRequest actionRequest, ActionResponse actionResponse)
    throws IOException, PortletException {
      PortletPreferences prefs = actionRequest.getPreferences();
      String greeting = actionRequest.getParameter("greeting");

      if (greeting != null) {
         try {
            prefs.setValue("greeting", greeting);
            prefs.store();
            SessionMessages.add(actionRequest, "success");
         }
         catch(Exception e) {
            SessionErrors.add(actionRequest, "error");
         }
      }
   }

   public void sendEmail(
    ActionRequest actionRequest, ActionResponse actionResponse)
    throws IOException, PortletException {
      // Add code here to send an email
      PortletPreferences prefs = actionRequest.getPreferences();
      String email = actionRequest.getParameter("email");

      if (email != null) {
         try {
            prefs.setValue("email", email);
            prefs.store();
            SessionMessages.add(actionRequest, "success");
         }
         catch(Exception e) {
            SessionErrors.add(actionRequest, "error");
         }
      }
   }
}