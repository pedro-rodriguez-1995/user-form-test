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

package com.test.userfsb.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link UserfService}.
 *
 * @author Brian Wing Shun Chan
 * @see UserfService
 * @generated
 */
public class UserfServiceWrapper
	implements ServiceWrapper<UserfService>, UserfService {

	public UserfServiceWrapper(UserfService userfService) {
		_userfService = userfService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _userfService.getOSGiServiceIdentifier();
	}

	@Override
	public UserfService getWrappedService() {
		return _userfService;
	}

	@Override
	public void setWrappedService(UserfService userfService) {
		_userfService = userfService;
	}

	private UserfService _userfService;

}