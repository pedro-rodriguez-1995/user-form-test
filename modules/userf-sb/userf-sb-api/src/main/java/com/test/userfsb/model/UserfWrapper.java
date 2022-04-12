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

package com.test.userfsb.model;

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link Userf}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Userf
 * @generated
 */
public class UserfWrapper
	extends BaseModelWrapper<Userf> implements ModelWrapper<Userf>, Userf {

	public UserfWrapper(Userf userf) {
		super(userf);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("id", getId());
		attributes.put("name", getName());
		attributes.put("surname", getSurname());
		attributes.put("email", getEmail());
		attributes.put("birthdate", getBirthdate());
		attributes.put("creationdate", getCreationdate());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		String name = (String)attributes.get("name");

		if (name != null) {
			setName(name);
		}

		String surname = (String)attributes.get("surname");

		if (surname != null) {
			setSurname(surname);
		}

		String email = (String)attributes.get("email");

		if (email != null) {
			setEmail(email);
		}

		Date birthdate = (Date)attributes.get("birthdate");

		if (birthdate != null) {
			setBirthdate(birthdate);
		}

		Date creationdate = (Date)attributes.get("creationdate");

		if (creationdate != null) {
			setCreationdate(creationdate);
		}
	}

	@Override
	public Userf cloneWithOriginalValues() {
		return model.cloneWithOriginalValues();
	}

	/**
	 * Returns the birthdate of this userf.
	 *
	 * @return the birthdate of this userf
	 */
	@Override
	public Date getBirthdate() {
		return model.getBirthdate();
	}

	/**
	 * Returns the creationdate of this userf.
	 *
	 * @return the creationdate of this userf
	 */
	@Override
	public Date getCreationdate() {
		return model.getCreationdate();
	}

	/**
	 * Returns the email of this userf.
	 *
	 * @return the email of this userf
	 */
	@Override
	public String getEmail() {
		return model.getEmail();
	}

	/**
	 * Returns the ID of this userf.
	 *
	 * @return the ID of this userf
	 */
	@Override
	public long getId() {
		return model.getId();
	}

	/**
	 * Returns the name of this userf.
	 *
	 * @return the name of this userf
	 */
	@Override
	public String getName() {
		return model.getName();
	}

	/**
	 * Returns the primary key of this userf.
	 *
	 * @return the primary key of this userf
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the surname of this userf.
	 *
	 * @return the surname of this userf
	 */
	@Override
	public String getSurname() {
		return model.getSurname();
	}

	/**
	 * Returns the uuid of this userf.
	 *
	 * @return the uuid of this userf
	 */
	@Override
	public String getUuid() {
		return model.getUuid();
	}

	@Override
	public void persist() {
		model.persist();
	}

	/**
	 * Sets the birthdate of this userf.
	 *
	 * @param birthdate the birthdate of this userf
	 */
	@Override
	public void setBirthdate(Date birthdate) {
		model.setBirthdate(birthdate);
	}

	/**
	 * Sets the creationdate of this userf.
	 *
	 * @param creationdate the creationdate of this userf
	 */
	@Override
	public void setCreationdate(Date creationdate) {
		model.setCreationdate(creationdate);
	}

	/**
	 * Sets the email of this userf.
	 *
	 * @param email the email of this userf
	 */
	@Override
	public void setEmail(String email) {
		model.setEmail(email);
	}

	/**
	 * Sets the ID of this userf.
	 *
	 * @param id the ID of this userf
	 */
	@Override
	public void setId(long id) {
		model.setId(id);
	}

	/**
	 * Sets the name of this userf.
	 *
	 * @param name the name of this userf
	 */
	@Override
	public void setName(String name) {
		model.setName(name);
	}

	/**
	 * Sets the primary key of this userf.
	 *
	 * @param primaryKey the primary key of this userf
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the surname of this userf.
	 *
	 * @param surname the surname of this userf
	 */
	@Override
	public void setSurname(String surname) {
		model.setSurname(surname);
	}

	/**
	 * Sets the uuid of this userf.
	 *
	 * @param uuid the uuid of this userf
	 */
	@Override
	public void setUuid(String uuid) {
		model.setUuid(uuid);
	}

	@Override
	protected UserfWrapper wrap(Userf userf) {
		return new UserfWrapper(userf);
	}

}