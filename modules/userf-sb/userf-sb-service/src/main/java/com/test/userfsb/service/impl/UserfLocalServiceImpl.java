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

package com.test.userfsb.service.impl;

import com.liferay.portal.aop.AopService;
import com.test.userfsb.model.Userf;
import com.test.userfsb.service.base.UserfLocalServiceBaseImpl;

import java.util.Date;

import org.osgi.service.component.annotations.Component;

/**
 * The implementation of the userf local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are
 * added, rerun ServiceBuilder to copy their definitions into the
 * <code>com.test.userfsb.service.UserfLocalService</code> interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security
 * checks based on the propagated JAAS credentials because this service can only
 * be accessed from within the same VM.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see UserfLocalServiceBaseImpl
 */
@Component(property = "model.class.name=com.test.userfsb.model.Userf", service = AopService.class)
public class UserfLocalServiceImpl extends UserfLocalServiceBaseImpl {

	public Userf addUserf(String name, String surname, String email, Date birthdate, Date creationdate) {
		Userf userf = new com.test.userfsb.model.impl.UserfImpl();
		userf.setName(name);
		userf.setSurname(surname);
		userf.setEmail(email);
		userf.setBirthdate(birthdate);
		userf.setCreationdate(creationdate);

		long userid = counterLocalService.increment(Userf.class.getName());

		userf.setId(userid);

		return addUserf(userf);
	}

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this class directly. Use
	 * <code>com.test.userfsb.service.UserfLocalService</code> via injection or a
	 * <code>org.osgi.util.tracker.ServiceTracker</code> or use
	 * <code>com.test.userfsb.service.UserfLocalServiceUtil</code>.
	 */
}