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

package com.test.userfsb.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.test.userfsb.model.Userf;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;
import org.osgi.util.tracker.ServiceTracker;

/**
 * The persistence utility for the userf service. This utility wraps <code>com.test.userfsb.service.persistence.impl.UserfPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see UserfPersistence
 * @generated
 */
public class UserfUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static void clearCache(Userf userf) {
		getPersistence().clearCache(userf);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public static long countWithDynamicQuery(DynamicQuery dynamicQuery) {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#fetchByPrimaryKeys(Set)
	 */
	public static Map<Serializable, Userf> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<Userf> findWithDynamicQuery(DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<Userf> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<Userf> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<Userf> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static Userf update(Userf userf) {
		return getPersistence().update(userf);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static Userf update(Userf userf, ServiceContext serviceContext) {
		return getPersistence().update(userf, serviceContext);
	}

	/**
	 * Returns all the userfs where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching userfs
	 */
	public static List<Userf> findByUuid(String uuid) {
		return getPersistence().findByUuid(uuid);
	}

	/**
	 * Returns a range of all the userfs where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>UserfModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of userfs
	 * @param end the upper bound of the range of userfs (not inclusive)
	 * @return the range of matching userfs
	 */
	public static List<Userf> findByUuid(String uuid, int start, int end) {
		return getPersistence().findByUuid(uuid, start, end);
	}

	/**
	 * Returns an ordered range of all the userfs where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>UserfModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of userfs
	 * @param end the upper bound of the range of userfs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching userfs
	 */
	public static List<Userf> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<Userf> orderByComparator) {

		return getPersistence().findByUuid(uuid, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the userfs where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>UserfModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of userfs
	 * @param end the upper bound of the range of userfs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching userfs
	 */
	public static List<Userf> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<Userf> orderByComparator, boolean useFinderCache) {

		return getPersistence().findByUuid(
			uuid, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first userf in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching userf
	 * @throws NoSuchUserfException if a matching userf could not be found
	 */
	public static Userf findByUuid_First(
			String uuid, OrderByComparator<Userf> orderByComparator)
		throws com.test.userfsb.exception.NoSuchUserfException {

		return getPersistence().findByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the first userf in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching userf, or <code>null</code> if a matching userf could not be found
	 */
	public static Userf fetchByUuid_First(
		String uuid, OrderByComparator<Userf> orderByComparator) {

		return getPersistence().fetchByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the last userf in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching userf
	 * @throws NoSuchUserfException if a matching userf could not be found
	 */
	public static Userf findByUuid_Last(
			String uuid, OrderByComparator<Userf> orderByComparator)
		throws com.test.userfsb.exception.NoSuchUserfException {

		return getPersistence().findByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the last userf in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching userf, or <code>null</code> if a matching userf could not be found
	 */
	public static Userf fetchByUuid_Last(
		String uuid, OrderByComparator<Userf> orderByComparator) {

		return getPersistence().fetchByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the userfs before and after the current userf in the ordered set where uuid = &#63;.
	 *
	 * @param id the primary key of the current userf
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next userf
	 * @throws NoSuchUserfException if a userf with the primary key could not be found
	 */
	public static Userf[] findByUuid_PrevAndNext(
			long id, String uuid, OrderByComparator<Userf> orderByComparator)
		throws com.test.userfsb.exception.NoSuchUserfException {

		return getPersistence().findByUuid_PrevAndNext(
			id, uuid, orderByComparator);
	}

	/**
	 * Removes all the userfs where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public static void removeByUuid(String uuid) {
		getPersistence().removeByUuid(uuid);
	}

	/**
	 * Returns the number of userfs where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching userfs
	 */
	public static int countByUuid(String uuid) {
		return getPersistence().countByUuid(uuid);
	}

	/**
	 * Caches the userf in the entity cache if it is enabled.
	 *
	 * @param userf the userf
	 */
	public static void cacheResult(Userf userf) {
		getPersistence().cacheResult(userf);
	}

	/**
	 * Caches the userfs in the entity cache if it is enabled.
	 *
	 * @param userfs the userfs
	 */
	public static void cacheResult(List<Userf> userfs) {
		getPersistence().cacheResult(userfs);
	}

	/**
	 * Creates a new userf with the primary key. Does not add the userf to the database.
	 *
	 * @param id the primary key for the new userf
	 * @return the new userf
	 */
	public static Userf create(long id) {
		return getPersistence().create(id);
	}

	/**
	 * Removes the userf with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the userf
	 * @return the userf that was removed
	 * @throws NoSuchUserfException if a userf with the primary key could not be found
	 */
	public static Userf remove(long id)
		throws com.test.userfsb.exception.NoSuchUserfException {

		return getPersistence().remove(id);
	}

	public static Userf updateImpl(Userf userf) {
		return getPersistence().updateImpl(userf);
	}

	/**
	 * Returns the userf with the primary key or throws a <code>NoSuchUserfException</code> if it could not be found.
	 *
	 * @param id the primary key of the userf
	 * @return the userf
	 * @throws NoSuchUserfException if a userf with the primary key could not be found
	 */
	public static Userf findByPrimaryKey(long id)
		throws com.test.userfsb.exception.NoSuchUserfException {

		return getPersistence().findByPrimaryKey(id);
	}

	/**
	 * Returns the userf with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the userf
	 * @return the userf, or <code>null</code> if a userf with the primary key could not be found
	 */
	public static Userf fetchByPrimaryKey(long id) {
		return getPersistence().fetchByPrimaryKey(id);
	}

	/**
	 * Returns all the userfs.
	 *
	 * @return the userfs
	 */
	public static List<Userf> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the userfs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>UserfModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of userfs
	 * @param end the upper bound of the range of userfs (not inclusive)
	 * @return the range of userfs
	 */
	public static List<Userf> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the userfs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>UserfModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of userfs
	 * @param end the upper bound of the range of userfs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of userfs
	 */
	public static List<Userf> findAll(
		int start, int end, OrderByComparator<Userf> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the userfs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>UserfModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of userfs
	 * @param end the upper bound of the range of userfs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of userfs
	 */
	public static List<Userf> findAll(
		int start, int end, OrderByComparator<Userf> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the userfs from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of userfs.
	 *
	 * @return the number of userfs
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static UserfPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<UserfPersistence, UserfPersistence>
		_serviceTracker;

	static {
		Bundle bundle = FrameworkUtil.getBundle(UserfPersistence.class);

		ServiceTracker<UserfPersistence, UserfPersistence> serviceTracker =
			new ServiceTracker<UserfPersistence, UserfPersistence>(
				bundle.getBundleContext(), UserfPersistence.class, null);

		serviceTracker.open();

		_serviceTracker = serviceTracker;
	}

}