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
 * Provides a wrapper for {@link UserfLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see UserfLocalService
 * @generated
 */
public class UserfLocalServiceWrapper
	implements ServiceWrapper<UserfLocalService>, UserfLocalService {

	public UserfLocalServiceWrapper(UserfLocalService userfLocalService) {
		_userfLocalService = userfLocalService;
	}

	@Override
	public com.test.userfsb.model.Userf addUserf(
		String name, String surname, String email, java.util.Date birthdate,
		java.util.Date creationdate) {

		return _userfLocalService.addUserf(
			name, surname, email, birthdate, creationdate);
	}

	/**
	 * Adds the userf to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect UserfLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param userf the userf
	 * @return the userf that was added
	 */
	@Override
	public com.test.userfsb.model.Userf addUserf(
		com.test.userfsb.model.Userf userf) {

		return _userfLocalService.addUserf(userf);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _userfLocalService.createPersistedModel(primaryKeyObj);
	}

	/**
	 * Creates a new userf with the primary key. Does not add the userf to the database.
	 *
	 * @param id the primary key for the new userf
	 * @return the new userf
	 */
	@Override
	public com.test.userfsb.model.Userf createUserf(long id) {
		return _userfLocalService.createUserf(id);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _userfLocalService.deletePersistedModel(persistedModel);
	}

	/**
	 * Deletes the userf with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect UserfLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param id the primary key of the userf
	 * @return the userf that was removed
	 * @throws PortalException if a userf with the primary key could not be found
	 */
	@Override
	public com.test.userfsb.model.Userf deleteUserf(long id)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _userfLocalService.deleteUserf(id);
	}

	/**
	 * Deletes the userf from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect UserfLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param userf the userf
	 * @return the userf that was removed
	 */
	@Override
	public com.test.userfsb.model.Userf deleteUserf(
		com.test.userfsb.model.Userf userf) {

		return _userfLocalService.deleteUserf(userf);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _userfLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _userfLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _userfLocalService.dynamicQuery();
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return _userfLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.test.userfsb.model.impl.UserfModelImpl</code>.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @return the range of matching rows
	 */
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {

		return _userfLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.test.userfsb.model.impl.UserfModelImpl</code>.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching rows
	 */
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {

		return _userfLocalService.dynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return _userfLocalService.dynamicQueryCount(dynamicQuery);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @param projection the projection to apply to the query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {

		return _userfLocalService.dynamicQueryCount(dynamicQuery, projection);
	}

	@Override
	public com.test.userfsb.model.Userf fetchUserf(long id) {
		return _userfLocalService.fetchUserf(id);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _userfLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _userfLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _userfLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _userfLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	 * Returns the userf with the primary key.
	 *
	 * @param id the primary key of the userf
	 * @return the userf
	 * @throws PortalException if a userf with the primary key could not be found
	 */
	@Override
	public com.test.userfsb.model.Userf getUserf(long id)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _userfLocalService.getUserf(id);
	}

	/**
	 * Returns a range of all the userfs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.test.userfsb.model.impl.UserfModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of userfs
	 * @param end the upper bound of the range of userfs (not inclusive)
	 * @return the range of userfs
	 */
	@Override
	public java.util.List<com.test.userfsb.model.Userf> getUserfs(
		int start, int end) {

		return _userfLocalService.getUserfs(start, end);
	}

	/**
	 * Returns the number of userfs.
	 *
	 * @return the number of userfs
	 */
	@Override
	public int getUserfsCount() {
		return _userfLocalService.getUserfsCount();
	}

	/**
	 * Updates the userf in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect UserfLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param userf the userf
	 * @return the userf that was updated
	 */
	@Override
	public com.test.userfsb.model.Userf updateUserf(
		com.test.userfsb.model.Userf userf) {

		return _userfLocalService.updateUserf(userf);
	}

	@Override
	public UserfLocalService getWrappedService() {
		return _userfLocalService;
	}

	@Override
	public void setWrappedService(UserfLocalService userfLocalService) {
		_userfLocalService = userfLocalService;
	}

	private UserfLocalService _userfLocalService;

}