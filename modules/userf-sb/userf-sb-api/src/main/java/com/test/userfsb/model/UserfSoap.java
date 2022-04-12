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

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.test.userfsb.service.http.UserfServiceSoap}.
 *
 * @author Brian Wing Shun Chan
 * @deprecated As of Athanasius (7.3.x), with no direct replacement
 * @generated
 */
@Deprecated
public class UserfSoap implements Serializable {

	public static UserfSoap toSoapModel(Userf model) {
		UserfSoap soapModel = new UserfSoap();

		soapModel.setUuid(model.getUuid());
		soapModel.setId(model.getId());
		soapModel.setName(model.getName());
		soapModel.setSurname(model.getSurname());
		soapModel.setEmail(model.getEmail());
		soapModel.setBirthdate(model.getBirthdate());
		soapModel.setCreationdate(model.getCreationdate());

		return soapModel;
	}

	public static UserfSoap[] toSoapModels(Userf[] models) {
		UserfSoap[] soapModels = new UserfSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static UserfSoap[][] toSoapModels(Userf[][] models) {
		UserfSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new UserfSoap[models.length][models[0].length];
		}
		else {
			soapModels = new UserfSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static UserfSoap[] toSoapModels(List<Userf> models) {
		List<UserfSoap> soapModels = new ArrayList<UserfSoap>(models.size());

		for (Userf model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new UserfSoap[soapModels.size()]);
	}

	public UserfSoap() {
	}

	public long getPrimaryKey() {
		return _id;
	}

	public void setPrimaryKey(long pk) {
		setId(pk);
	}

	public String getUuid() {
		return _uuid;
	}

	public void setUuid(String uuid) {
		_uuid = uuid;
	}

	public long getId() {
		return _id;
	}

	public void setId(long id) {
		_id = id;
	}

	public String getName() {
		return _name;
	}

	public void setName(String name) {
		_name = name;
	}

	public String getSurname() {
		return _surname;
	}

	public void setSurname(String surname) {
		_surname = surname;
	}

	public String getEmail() {
		return _email;
	}

	public void setEmail(String email) {
		_email = email;
	}

	public Date getBirthdate() {
		return _birthdate;
	}

	public void setBirthdate(Date birthdate) {
		_birthdate = birthdate;
	}

	public Date getCreationdate() {
		return _creationdate;
	}

	public void setCreationdate(Date creationdate) {
		_creationdate = creationdate;
	}

	private String _uuid;
	private long _id;
	private String _name;
	private String _surname;
	private String _email;
	private Date _birthdate;
	private Date _creationdate;

}