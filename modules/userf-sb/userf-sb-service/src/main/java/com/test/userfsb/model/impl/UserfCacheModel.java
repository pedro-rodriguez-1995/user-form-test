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

package com.test.userfsb.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.test.userfsb.model.Userf;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing Userf in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class UserfCacheModel implements CacheModel<Userf>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof UserfCacheModel)) {
			return false;
		}

		UserfCacheModel userfCacheModel = (UserfCacheModel)object;

		if (id == userfCacheModel.id) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, id);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(15);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", id=");
		sb.append(id);
		sb.append(", name=");
		sb.append(name);
		sb.append(", surname=");
		sb.append(surname);
		sb.append(", email=");
		sb.append(email);
		sb.append(", birthdate=");
		sb.append(birthdate);
		sb.append(", creationdate=");
		sb.append(creationdate);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public Userf toEntityModel() {
		UserfImpl userfImpl = new UserfImpl();

		if (uuid == null) {
			userfImpl.setUuid("");
		}
		else {
			userfImpl.setUuid(uuid);
		}

		userfImpl.setId(id);

		if (name == null) {
			userfImpl.setName("");
		}
		else {
			userfImpl.setName(name);
		}

		if (surname == null) {
			userfImpl.setSurname("");
		}
		else {
			userfImpl.setSurname(surname);
		}

		if (email == null) {
			userfImpl.setEmail("");
		}
		else {
			userfImpl.setEmail(email);
		}

		if (birthdate == Long.MIN_VALUE) {
			userfImpl.setBirthdate(null);
		}
		else {
			userfImpl.setBirthdate(new Date(birthdate));
		}

		if (creationdate == Long.MIN_VALUE) {
			userfImpl.setCreationdate(null);
		}
		else {
			userfImpl.setCreationdate(new Date(creationdate));
		}

		userfImpl.resetOriginalValues();

		return userfImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		id = objectInput.readLong();
		name = objectInput.readUTF();
		surname = objectInput.readUTF();
		email = objectInput.readUTF();
		birthdate = objectInput.readLong();
		creationdate = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		if (uuid == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(uuid);
		}

		objectOutput.writeLong(id);

		if (name == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(name);
		}

		if (surname == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(surname);
		}

		if (email == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(email);
		}

		objectOutput.writeLong(birthdate);
		objectOutput.writeLong(creationdate);
	}

	public String uuid;
	public long id;
	public String name;
	public String surname;
	public String email;
	public long birthdate;
	public long creationdate;

}