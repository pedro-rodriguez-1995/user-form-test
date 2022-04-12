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

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.test.userfsb.exception.NoSuchUserfException;
import com.test.userfsb.model.Userf;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the userf service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see UserfUtil
 * @generated
 */
@ProviderType
public interface UserfPersistence extends BasePersistence<Userf> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link UserfUtil} to access the userf persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the userfs where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching userfs
	 */
	public java.util.List<Userf> findByUuid(String uuid);

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
	public java.util.List<Userf> findByUuid(String uuid, int start, int end);

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
	public java.util.List<Userf> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Userf>
			orderByComparator);

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
	public java.util.List<Userf> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Userf>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first userf in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching userf
	 * @throws NoSuchUserfException if a matching userf could not be found
	 */
	public Userf findByUuid_First(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<Userf>
				orderByComparator)
		throws NoSuchUserfException;

	/**
	 * Returns the first userf in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching userf, or <code>null</code> if a matching userf could not be found
	 */
	public Userf fetchByUuid_First(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Userf>
			orderByComparator);

	/**
	 * Returns the last userf in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching userf
	 * @throws NoSuchUserfException if a matching userf could not be found
	 */
	public Userf findByUuid_Last(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<Userf>
				orderByComparator)
		throws NoSuchUserfException;

	/**
	 * Returns the last userf in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching userf, or <code>null</code> if a matching userf could not be found
	 */
	public Userf fetchByUuid_Last(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Userf>
			orderByComparator);

	/**
	 * Returns the userfs before and after the current userf in the ordered set where uuid = &#63;.
	 *
	 * @param id the primary key of the current userf
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next userf
	 * @throws NoSuchUserfException if a userf with the primary key could not be found
	 */
	public Userf[] findByUuid_PrevAndNext(
			long id, String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<Userf>
				orderByComparator)
		throws NoSuchUserfException;

	/**
	 * Removes all the userfs where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public void removeByUuid(String uuid);

	/**
	 * Returns the number of userfs where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching userfs
	 */
	public int countByUuid(String uuid);

	/**
	 * Caches the userf in the entity cache if it is enabled.
	 *
	 * @param userf the userf
	 */
	public void cacheResult(Userf userf);

	/**
	 * Caches the userfs in the entity cache if it is enabled.
	 *
	 * @param userfs the userfs
	 */
	public void cacheResult(java.util.List<Userf> userfs);

	/**
	 * Creates a new userf with the primary key. Does not add the userf to the database.
	 *
	 * @param id the primary key for the new userf
	 * @return the new userf
	 */
	public Userf create(long id);

	/**
	 * Removes the userf with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the userf
	 * @return the userf that was removed
	 * @throws NoSuchUserfException if a userf with the primary key could not be found
	 */
	public Userf remove(long id) throws NoSuchUserfException;

	public Userf updateImpl(Userf userf);

	/**
	 * Returns the userf with the primary key or throws a <code>NoSuchUserfException</code> if it could not be found.
	 *
	 * @param id the primary key of the userf
	 * @return the userf
	 * @throws NoSuchUserfException if a userf with the primary key could not be found
	 */
	public Userf findByPrimaryKey(long id) throws NoSuchUserfException;

	/**
	 * Returns the userf with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the userf
	 * @return the userf, or <code>null</code> if a userf with the primary key could not be found
	 */
	public Userf fetchByPrimaryKey(long id);

	/**
	 * Returns all the userfs.
	 *
	 * @return the userfs
	 */
	public java.util.List<Userf> findAll();

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
	public java.util.List<Userf> findAll(int start, int end);

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
	public java.util.List<Userf> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Userf>
			orderByComparator);

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
	public java.util.List<Userf> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Userf>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the userfs from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of userfs.
	 *
	 * @return the number of userfs
	 */
	public int countAll();

}