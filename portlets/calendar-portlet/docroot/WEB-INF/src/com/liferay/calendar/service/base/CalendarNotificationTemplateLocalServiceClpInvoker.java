/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.liferay.calendar.service.base;

import com.liferay.calendar.service.CalendarNotificationTemplateLocalServiceUtil;

import java.util.Arrays;

/**
 * @author Eduardo Lundgren
 * @generated
 */
public class CalendarNotificationTemplateLocalServiceClpInvoker {
	public CalendarNotificationTemplateLocalServiceClpInvoker() {
		_methodName0 = "addCalendarNotificationTemplate";

		_methodParameterTypes0 = new String[] {
				"com.liferay.calendar.model.CalendarNotificationTemplate"
			};

		_methodName1 = "createCalendarNotificationTemplate";

		_methodParameterTypes1 = new String[] { "long" };

		_methodName2 = "deleteCalendarNotificationTemplate";

		_methodParameterTypes2 = new String[] { "long" };

		_methodName3 = "deleteCalendarNotificationTemplate";

		_methodParameterTypes3 = new String[] {
				"com.liferay.calendar.model.CalendarNotificationTemplate"
			};

		_methodName4 = "dynamicQuery";

		_methodParameterTypes4 = new String[] {  };

		_methodName5 = "dynamicQuery";

		_methodParameterTypes5 = new String[] {
				"com.liferay.portal.kernel.dao.orm.DynamicQuery"
			};

		_methodName6 = "dynamicQuery";

		_methodParameterTypes6 = new String[] {
				"com.liferay.portal.kernel.dao.orm.DynamicQuery", "int", "int"
			};

		_methodName7 = "dynamicQuery";

		_methodParameterTypes7 = new String[] {
				"com.liferay.portal.kernel.dao.orm.DynamicQuery", "int", "int",
				"com.liferay.portal.kernel.util.OrderByComparator"
			};

		_methodName8 = "dynamicQueryCount";

		_methodParameterTypes8 = new String[] {
				"com.liferay.portal.kernel.dao.orm.DynamicQuery"
			};

		_methodName9 = "dynamicQueryCount";

		_methodParameterTypes9 = new String[] {
				"com.liferay.portal.kernel.dao.orm.DynamicQuery",
				"com.liferay.portal.kernel.dao.orm.Projection"
			};

		_methodName10 = "fetchCalendarNotificationTemplate";

		_methodParameterTypes10 = new String[] { "long" };

		_methodName11 = "fetchCalendarNotificationTemplateByUuidAndGroupId";

		_methodParameterTypes11 = new String[] { "java.lang.String", "long" };

		_methodName12 = "getCalendarNotificationTemplate";

		_methodParameterTypes12 = new String[] { "long" };

		_methodName13 = "getActionableDynamicQuery";

		_methodParameterTypes13 = new String[] {  };

		_methodName15 = "getExportActionableDynamicQuery";

		_methodParameterTypes15 = new String[] {
				"com.liferay.portal.kernel.lar.PortletDataContext"
			};

		_methodName16 = "deletePersistedModel";

		_methodParameterTypes16 = new String[] {
				"com.liferay.portal.model.PersistedModel"
			};

		_methodName17 = "getPersistedModel";

		_methodParameterTypes17 = new String[] { "java.io.Serializable" };

		_methodName18 = "getCalendarNotificationTemplatesByUuidAndCompanyId";

		_methodParameterTypes18 = new String[] { "java.lang.String", "long" };

		_methodName19 = "getCalendarNotificationTemplatesByUuidAndCompanyId";

		_methodParameterTypes19 = new String[] {
				"java.lang.String", "long", "int", "int",
				"com.liferay.portal.kernel.util.OrderByComparator"
			};

		_methodName20 = "getCalendarNotificationTemplateByUuidAndGroupId";

		_methodParameterTypes20 = new String[] { "java.lang.String", "long" };

		_methodName21 = "getCalendarNotificationTemplates";

		_methodParameterTypes21 = new String[] { "int", "int" };

		_methodName22 = "getCalendarNotificationTemplatesCount";

		_methodParameterTypes22 = new String[] {  };

		_methodName23 = "updateCalendarNotificationTemplate";

		_methodParameterTypes23 = new String[] {
				"com.liferay.calendar.model.CalendarNotificationTemplate"
			};

		_methodName74 = "getBeanIdentifier";

		_methodParameterTypes74 = new String[] {  };

		_methodName75 = "setBeanIdentifier";

		_methodParameterTypes75 = new String[] { "java.lang.String" };

		_methodName80 = "addCalendarNotificationTemplate";

		_methodParameterTypes80 = new String[] {
				"long", "long",
				"com.liferay.calendar.notification.NotificationType",
				"java.lang.String",
				"com.liferay.calendar.notification.NotificationTemplateType",
				"java.lang.String", "java.lang.String",
				"com.liferay.portal.service.ServiceContext"
			};

		_methodName81 = "deleteCalendarNotificationTemplate";

		_methodParameterTypes81 = new String[] {
				"com.liferay.calendar.model.CalendarNotificationTemplate"
			};

		_methodName82 = "deleteCalendarNotificationTemplates";

		_methodParameterTypes82 = new String[] { "long" };

		_methodName83 = "fetchCalendarNotificationTemplate";

		_methodParameterTypes83 = new String[] {
				"long", "com.liferay.calendar.notification.NotificationType",
				"com.liferay.calendar.notification.NotificationTemplateType"
			};

		_methodName84 = "updateCalendarNotificationTemplate";

		_methodParameterTypes84 = new String[] {
				"long", "java.lang.String", "java.lang.String",
				"java.lang.String", "com.liferay.portal.service.ServiceContext"
			};
	}

	public Object invokeMethod(String name, String[] parameterTypes,
		Object[] arguments) throws Throwable {
		if (_methodName0.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes0, parameterTypes)) {
			return CalendarNotificationTemplateLocalServiceUtil.addCalendarNotificationTemplate((com.liferay.calendar.model.CalendarNotificationTemplate)arguments[0]);
		}

		if (_methodName1.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes1, parameterTypes)) {
			return CalendarNotificationTemplateLocalServiceUtil.createCalendarNotificationTemplate(((Long)arguments[0]).longValue());
		}

		if (_methodName2.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes2, parameterTypes)) {
			return CalendarNotificationTemplateLocalServiceUtil.deleteCalendarNotificationTemplate(((Long)arguments[0]).longValue());
		}

		if (_methodName3.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes3, parameterTypes)) {
			return CalendarNotificationTemplateLocalServiceUtil.deleteCalendarNotificationTemplate((com.liferay.calendar.model.CalendarNotificationTemplate)arguments[0]);
		}

		if (_methodName4.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes4, parameterTypes)) {
			return CalendarNotificationTemplateLocalServiceUtil.dynamicQuery();
		}

		if (_methodName5.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes5, parameterTypes)) {
			return CalendarNotificationTemplateLocalServiceUtil.dynamicQuery((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0]);
		}

		if (_methodName6.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes6, parameterTypes)) {
			return CalendarNotificationTemplateLocalServiceUtil.dynamicQuery((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0],
				((Integer)arguments[1]).intValue(),
				((Integer)arguments[2]).intValue());
		}

		if (_methodName7.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes7, parameterTypes)) {
			return CalendarNotificationTemplateLocalServiceUtil.dynamicQuery((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0],
				((Integer)arguments[1]).intValue(),
				((Integer)arguments[2]).intValue(),
				(com.liferay.portal.kernel.util.OrderByComparator<?>)arguments[3]);
		}

		if (_methodName8.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes8, parameterTypes)) {
			return CalendarNotificationTemplateLocalServiceUtil.dynamicQueryCount((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0]);
		}

		if (_methodName9.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes9, parameterTypes)) {
			return CalendarNotificationTemplateLocalServiceUtil.dynamicQueryCount((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0],
				(com.liferay.portal.kernel.dao.orm.Projection)arguments[1]);
		}

		if (_methodName10.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes10, parameterTypes)) {
			return CalendarNotificationTemplateLocalServiceUtil.fetchCalendarNotificationTemplate(((Long)arguments[0]).longValue());
		}

		if (_methodName11.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes11, parameterTypes)) {
			return CalendarNotificationTemplateLocalServiceUtil.fetchCalendarNotificationTemplateByUuidAndGroupId((java.lang.String)arguments[0],
				((Long)arguments[1]).longValue());
		}

		if (_methodName12.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes12, parameterTypes)) {
			return CalendarNotificationTemplateLocalServiceUtil.getCalendarNotificationTemplate(((Long)arguments[0]).longValue());
		}

		if (_methodName13.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes13, parameterTypes)) {
			return CalendarNotificationTemplateLocalServiceUtil.getActionableDynamicQuery();
		}

		if (_methodName15.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes15, parameterTypes)) {
			return CalendarNotificationTemplateLocalServiceUtil.getExportActionableDynamicQuery((com.liferay.portal.kernel.lar.PortletDataContext)arguments[0]);
		}

		if (_methodName16.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes16, parameterTypes)) {
			return CalendarNotificationTemplateLocalServiceUtil.deletePersistedModel((com.liferay.portal.model.PersistedModel)arguments[0]);
		}

		if (_methodName17.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes17, parameterTypes)) {
			return CalendarNotificationTemplateLocalServiceUtil.getPersistedModel((java.io.Serializable)arguments[0]);
		}

		if (_methodName18.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes18, parameterTypes)) {
			return CalendarNotificationTemplateLocalServiceUtil.getCalendarNotificationTemplatesByUuidAndCompanyId((java.lang.String)arguments[0],
				((Long)arguments[1]).longValue());
		}

		if (_methodName19.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes19, parameterTypes)) {
			return CalendarNotificationTemplateLocalServiceUtil.getCalendarNotificationTemplatesByUuidAndCompanyId((java.lang.String)arguments[0],
				((Long)arguments[1]).longValue(),
				((Integer)arguments[2]).intValue(),
				((Integer)arguments[3]).intValue(),
				(com.liferay.portal.kernel.util.OrderByComparator<com.liferay.calendar.model.CalendarNotificationTemplate>)arguments[4]);
		}

		if (_methodName20.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes20, parameterTypes)) {
			return CalendarNotificationTemplateLocalServiceUtil.getCalendarNotificationTemplateByUuidAndGroupId((java.lang.String)arguments[0],
				((Long)arguments[1]).longValue());
		}

		if (_methodName21.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes21, parameterTypes)) {
			return CalendarNotificationTemplateLocalServiceUtil.getCalendarNotificationTemplates(((Integer)arguments[0]).intValue(),
				((Integer)arguments[1]).intValue());
		}

		if (_methodName22.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes22, parameterTypes)) {
			return CalendarNotificationTemplateLocalServiceUtil.getCalendarNotificationTemplatesCount();
		}

		if (_methodName23.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes23, parameterTypes)) {
			return CalendarNotificationTemplateLocalServiceUtil.updateCalendarNotificationTemplate((com.liferay.calendar.model.CalendarNotificationTemplate)arguments[0]);
		}

		if (_methodName74.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes74, parameterTypes)) {
			return CalendarNotificationTemplateLocalServiceUtil.getBeanIdentifier();
		}

		if (_methodName75.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes75, parameterTypes)) {
			CalendarNotificationTemplateLocalServiceUtil.setBeanIdentifier((java.lang.String)arguments[0]);

			return null;
		}

		if (_methodName80.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes80, parameterTypes)) {
			return CalendarNotificationTemplateLocalServiceUtil.addCalendarNotificationTemplate(((Long)arguments[0]).longValue(),
				((Long)arguments[1]).longValue(),
				(com.liferay.calendar.notification.NotificationType)arguments[2],
				(java.lang.String)arguments[3],
				(com.liferay.calendar.notification.NotificationTemplateType)arguments[4],
				(java.lang.String)arguments[5], (java.lang.String)arguments[6],
				(com.liferay.portal.service.ServiceContext)arguments[7]);
		}

		if (_methodName81.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes81, parameterTypes)) {
			return CalendarNotificationTemplateLocalServiceUtil.deleteCalendarNotificationTemplate((com.liferay.calendar.model.CalendarNotificationTemplate)arguments[0]);
		}

		if (_methodName82.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes82, parameterTypes)) {
			CalendarNotificationTemplateLocalServiceUtil.deleteCalendarNotificationTemplates(((Long)arguments[0]).longValue());

			return null;
		}

		if (_methodName83.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes83, parameterTypes)) {
			return CalendarNotificationTemplateLocalServiceUtil.fetchCalendarNotificationTemplate(((Long)arguments[0]).longValue(),
				(com.liferay.calendar.notification.NotificationType)arguments[1],
				(com.liferay.calendar.notification.NotificationTemplateType)arguments[2]);
		}

		if (_methodName84.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes84, parameterTypes)) {
			return CalendarNotificationTemplateLocalServiceUtil.updateCalendarNotificationTemplate(((Long)arguments[0]).longValue(),
				(java.lang.String)arguments[1], (java.lang.String)arguments[2],
				(java.lang.String)arguments[3],
				(com.liferay.portal.service.ServiceContext)arguments[4]);
		}

		throw new UnsupportedOperationException();
	}

	private String _methodName0;
	private String[] _methodParameterTypes0;
	private String _methodName1;
	private String[] _methodParameterTypes1;
	private String _methodName2;
	private String[] _methodParameterTypes2;
	private String _methodName3;
	private String[] _methodParameterTypes3;
	private String _methodName4;
	private String[] _methodParameterTypes4;
	private String _methodName5;
	private String[] _methodParameterTypes5;
	private String _methodName6;
	private String[] _methodParameterTypes6;
	private String _methodName7;
	private String[] _methodParameterTypes7;
	private String _methodName8;
	private String[] _methodParameterTypes8;
	private String _methodName9;
	private String[] _methodParameterTypes9;
	private String _methodName10;
	private String[] _methodParameterTypes10;
	private String _methodName11;
	private String[] _methodParameterTypes11;
	private String _methodName12;
	private String[] _methodParameterTypes12;
	private String _methodName13;
	private String[] _methodParameterTypes13;
	private String _methodName15;
	private String[] _methodParameterTypes15;
	private String _methodName16;
	private String[] _methodParameterTypes16;
	private String _methodName17;
	private String[] _methodParameterTypes17;
	private String _methodName18;
	private String[] _methodParameterTypes18;
	private String _methodName19;
	private String[] _methodParameterTypes19;
	private String _methodName20;
	private String[] _methodParameterTypes20;
	private String _methodName21;
	private String[] _methodParameterTypes21;
	private String _methodName22;
	private String[] _methodParameterTypes22;
	private String _methodName23;
	private String[] _methodParameterTypes23;
	private String _methodName74;
	private String[] _methodParameterTypes74;
	private String _methodName75;
	private String[] _methodParameterTypes75;
	private String _methodName80;
	private String[] _methodParameterTypes80;
	private String _methodName81;
	private String[] _methodParameterTypes81;
	private String _methodName82;
	private String[] _methodParameterTypes82;
	private String _methodName83;
	private String[] _methodParameterTypes83;
	private String _methodName84;
	private String[] _methodParameterTypes84;
}