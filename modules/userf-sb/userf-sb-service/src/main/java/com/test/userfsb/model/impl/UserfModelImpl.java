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

import com.liferay.expando.kernel.model.ExpandoBridge;
import com.liferay.expando.kernel.util.ExpandoBridgeFactoryUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.json.JSON;
import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.impl.BaseModelImpl;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.test.userfsb.model.Userf;
import com.test.userfsb.model.UserfModel;
import com.test.userfsb.model.UserfSoap;

import java.io.Serializable;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationHandler;
import java.sql.Types;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.BiConsumer;
import java.util.function.Function;

/**
 * The base model implementation for the Userf service. Represents a row in the
 * &quot;Userf_Userf&quot; database table, with each column mapped to a property
 * of this class.
 *
 * <p>
 * This implementation and its corresponding interface <code>UserfModel</code>
 * exist only as a container for the default property accessors generated by
 * ServiceBuilder. Helper methods and all application logic should be put in
 * {@link UserfImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see UserfImpl
 * @generated
 */
@JSON(strict = true)
public class UserfModelImpl extends BaseModelImpl<Userf> implements UserfModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a
	 * userf model instance should use the <code>Userf</code> interface instead.
	 */
	public static final String TABLE_NAME = "Userf_Userf";

	public static final Object[][] TABLE_COLUMNS = { { "uuid_", Types.VARCHAR }, { "id_", Types.BIGINT },
			{ "name", Types.VARCHAR }, { "surname", Types.VARCHAR }, { "email", Types.VARCHAR },
			{ "birthdate", Types.TIMESTAMP }, { "creationdate", Types.TIMESTAMP } };

	public static final Map<String, Integer> TABLE_COLUMNS_MAP = new HashMap<String, Integer>();

	static {
		TABLE_COLUMNS_MAP.put("uuid_", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("id_", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("name", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("surname", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("email", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("birthdate", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("creationdate", Types.TIMESTAMP);
	}

	public static final String TABLE_SQL_CREATE = "create table Userf_Userf (uuid_ VARCHAR(75) null,id_ LONG not null primary key,name VARCHAR(75) null,surname VARCHAR(75) null,email VARCHAR(75) null,birthdate DATE null,creationdate DATE null)";

	public static final String TABLE_SQL_DROP = "drop table Userf_Userf";

	public static final String ORDER_BY_JPQL = " ORDER BY userf.id ASC";

	public static final String ORDER_BY_SQL = " ORDER BY Userf_Userf.id_ ASC";

	public static final String DATA_SOURCE = "liferayDataSource";

	public static final String SESSION_FACTORY = "liferaySessionFactory";

	public static final String TX_MANAGER = "liferayTransactionManager";

	/**
	 * @deprecated As of Athanasius (7.3.x), replaced by
	 *             {@link #getColumnBitmask(String)}
	 */
	@Deprecated
	public static final long UUID_COLUMN_BITMASK = 1L;

	/**
	 * @deprecated As of Athanasius (7.3.x), replaced by
	 *             {@link #getColumnBitmask(String)}
	 */
	@Deprecated
	public static final long ID_COLUMN_BITMASK = 2L;

	/**
	 * @deprecated As of Athanasius (7.3.x), with no direct replacement
	 */
	@Deprecated
	public static void setEntityCacheEnabled(boolean entityCacheEnabled) {
	}

	/**
	 * @deprecated As of Athanasius (7.3.x), with no direct replacement
	 */
	@Deprecated
	public static void setFinderCacheEnabled(boolean finderCacheEnabled) {
	}

	/**
	 * Converts the soap model instance into a normal model instance.
	 *
	 * @param soapModel the soap model instance to convert
	 * @return the normal model instance
	 * @deprecated As of Athanasius (7.3.x), with no direct replacement
	 */
	@Deprecated
	public static Userf toModel(UserfSoap soapModel) {
		if (soapModel == null) {
			return null;
		}

		Userf model = new UserfImpl();

		model.setUuid(soapModel.getUuid());
		model.setId(soapModel.getId());
		model.setName(soapModel.getName());
		model.setSurname(soapModel.getSurname());
		model.setEmail(soapModel.getEmail());
		model.setBirthdate(soapModel.getBirthdate());
		model.setCreationdate(soapModel.getCreationdate());

		return model;
	}

	/**
	 * Converts the soap model instances into normal model instances.
	 *
	 * @param soapModels the soap model instances to convert
	 * @return the normal model instances
	 * @deprecated As of Athanasius (7.3.x), with no direct replacement
	 */
	@Deprecated
	public static List<Userf> toModels(UserfSoap[] soapModels) {
		if (soapModels == null) {
			return null;
		}

		List<Userf> models = new ArrayList<Userf>(soapModels.length);

		for (UserfSoap soapModel : soapModels) {
			models.add(toModel(soapModel));
		}

		return models;
	}

	public UserfModelImpl() {
	}

	@Override
	public long getPrimaryKey() {
		return _id;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _id;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long) primaryKeyObj).longValue());
	}

	@Override
	public Class<?> getModelClass() {
		return Userf.class;
	}

	@Override
	public String getModelClassName() {
		return Userf.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		Map<String, Function<Userf, Object>> attributeGetterFunctions = getAttributeGetterFunctions();

		for (Map.Entry<String, Function<Userf, Object>> entry : attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<Userf, Object> attributeGetterFunction = entry.getValue();

			attributes.put(attributeName, attributeGetterFunction.apply((Userf) this));
		}

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Map<String, BiConsumer<Userf, Object>> attributeSetterBiConsumers = getAttributeSetterBiConsumers();

		for (Map.Entry<String, Object> entry : attributes.entrySet()) {
			String attributeName = entry.getKey();

			BiConsumer<Userf, Object> attributeSetterBiConsumer = attributeSetterBiConsumers.get(attributeName);

			if (attributeSetterBiConsumer != null) {
				attributeSetterBiConsumer.accept((Userf) this, entry.getValue());
			}
		}
	}

	public Map<String, Function<Userf, Object>> getAttributeGetterFunctions() {
		return _attributeGetterFunctions;
	}

	public Map<String, BiConsumer<Userf, Object>> getAttributeSetterBiConsumers() {

		return _attributeSetterBiConsumers;
	}

	private static Function<InvocationHandler, Userf> _getProxyProviderFunction() {

		Class<?> proxyClass = ProxyUtil.getProxyClass(Userf.class.getClassLoader(), Userf.class, ModelWrapper.class);

		try {
			Constructor<Userf> constructor = (Constructor<Userf>) proxyClass.getConstructor(InvocationHandler.class);

			return invocationHandler -> {
				try {
					return constructor.newInstance(invocationHandler);
				} catch (ReflectiveOperationException reflectiveOperationException) {

					throw new InternalError(reflectiveOperationException);
				}
			};
		} catch (NoSuchMethodException noSuchMethodException) {
			throw new InternalError(noSuchMethodException);
		}
	}

	private static final Map<String, Function<Userf, Object>> _attributeGetterFunctions;
	private static final Map<String, BiConsumer<Userf, Object>> _attributeSetterBiConsumers;

	static {
		Map<String, Function<Userf, Object>> attributeGetterFunctions = new LinkedHashMap<String, Function<Userf, Object>>();
		Map<String, BiConsumer<Userf, ?>> attributeSetterBiConsumers = new LinkedHashMap<String, BiConsumer<Userf, ?>>();

		attributeGetterFunctions.put("uuid", Userf::getUuid);
		attributeSetterBiConsumers.put("uuid", (BiConsumer<Userf, String>) Userf::setUuid);
		attributeGetterFunctions.put("id", Userf::getId);
		attributeSetterBiConsumers.put("id", (BiConsumer<Userf, Long>) Userf::setId);
		attributeGetterFunctions.put("name", Userf::getName);
		attributeSetterBiConsumers.put("name", (BiConsumer<Userf, String>) Userf::setName);
		attributeGetterFunctions.put("surname", Userf::getSurname);
		attributeSetterBiConsumers.put("surname", (BiConsumer<Userf, String>) Userf::setSurname);
		attributeGetterFunctions.put("email", Userf::getEmail);
		attributeSetterBiConsumers.put("email", (BiConsumer<Userf, String>) Userf::setEmail);
		attributeGetterFunctions.put("birthdate", Userf::getBirthdate);
		attributeSetterBiConsumers.put("birthdate", (BiConsumer<Userf, Date>) Userf::setBirthdate);
		attributeGetterFunctions.put("creationdate", Userf::getCreationdate);
		attributeSetterBiConsumers.put("creationdate", (BiConsumer<Userf, Date>) Userf::setCreationdate);

		_attributeGetterFunctions = Collections.unmodifiableMap(attributeGetterFunctions);
		_attributeSetterBiConsumers = Collections.unmodifiableMap((Map) attributeSetterBiConsumers);
	}

	@JSON
	@Override
	public String getUuid() {
		if (_uuid == null) {
			return "";
		} else {
			return _uuid;
		}
	}

	@Override
	public void setUuid(String uuid) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_uuid = uuid;
	}

	/**
	 * @deprecated As of Athanasius (7.3.x), replaced by
	 *             {@link #getColumnOriginalValue(String)}
	 */
	@Deprecated
	public String getOriginalUuid() {
		return getColumnOriginalValue("uuid_");
	}

	@JSON
	@Override
	public long getId() {
		return _id;
	}

	@Override
	public void setId(long id) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_id = id;
	}

	@JSON
	@Override
	public String getName() {
		if (_name == null) {
			return "";
		} else {
			return _name;
		}
	}

	@Override
	public void setName(String name) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_name = name;
	}

	@JSON
	@Override
	public String getSurname() {
		if (_surname == null) {
			return "";
		} else {
			return _surname;
		}
	}

	@Override
	public void setSurname(String surname) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_surname = surname;
	}

	@JSON
	@Override
	public String getEmail() {
		if (_email == null) {
			return "";
		} else {
			return _email;
		}
	}

	@Override
	public void setEmail(String email) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_email = email;
	}

	@JSON
	@Override
	public Date getBirthdate() {
		return _birthdate;
	}

	@Override
	public void setBirthdate(Date birthdate) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_birthdate = birthdate;
	}

	@JSON
	@Override
	public Date getCreationdate() {
		return _creationdate;
	}

	@Override
	public void setCreationdate(Date creationdate) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_creationdate = creationdate;
	}

	public long getColumnBitmask() {
		if (_columnBitmask > 0) {
			return _columnBitmask;
		}

		if ((_columnOriginalValues == null) || (_columnOriginalValues == Collections.EMPTY_MAP)) {

			return 0;
		}

		for (Map.Entry<String, Object> entry : _columnOriginalValues.entrySet()) {

			if (!Objects.equals(entry.getValue(), getColumnValue(entry.getKey()))) {

				_columnBitmask |= _columnBitmasks.get(entry.getKey());
			}
		}

		return _columnBitmask;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(0, Userf.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public Userf toEscapedModel() {
		if (_escapedModel == null) {
			Function<InvocationHandler, Userf> escapedModelProxyProviderFunction = EscapedModelProxyProviderFunctionHolder._escapedModelProxyProviderFunction;

			_escapedModel = escapedModelProxyProviderFunction.apply(new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		UserfImpl userfImpl = new UserfImpl();

		userfImpl.setUuid(getUuid());
		userfImpl.setId(getId());
		userfImpl.setName(getName());
		userfImpl.setSurname(getSurname());
		userfImpl.setEmail(getEmail());
		userfImpl.setBirthdate(getBirthdate());
		userfImpl.setCreationdate(getCreationdate());

		userfImpl.resetOriginalValues();

		return userfImpl;
	}

	@Override
	public int compareTo(Userf userf) {
		long primaryKey = userf.getPrimaryKey();

		if (getPrimaryKey() < primaryKey) {
			return -1;
		} else if (getPrimaryKey() > primaryKey) {
			return 1;
		} else {
			return 0;
		}
	}

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof Userf)) {
			return false;
		}

		Userf userf = (Userf) object;

		long primaryKey = userf.getPrimaryKey();

		if (getPrimaryKey() == primaryKey) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return (int) getPrimaryKey();
	}

	/**
	 * @deprecated As of Athanasius (7.3.x), with no direct replacement
	 */
	@Deprecated
	@Override
	public boolean isEntityCacheEnabled() {
		return true;
	}

	/**
	 * @deprecated As of Athanasius (7.3.x), with no direct replacement
	 */
	@Deprecated
	@Override
	public boolean isFinderCacheEnabled() {
		return true;
	}

	@Override
	public void resetOriginalValues() {
		_columnOriginalValues = Collections.emptyMap();

		_columnBitmask = 0;
	}

	@Override
	public CacheModel<Userf> toCacheModel() {
		UserfCacheModel userfCacheModel = new UserfCacheModel();

		userfCacheModel.uuid = getUuid();

		String uuid = userfCacheModel.uuid;

		if ((uuid != null) && (uuid.length() == 0)) {
			userfCacheModel.uuid = null;
		}

		userfCacheModel.id = getId();

		userfCacheModel.name = getName();

		String name = userfCacheModel.name;

		if ((name != null) && (name.length() == 0)) {
			userfCacheModel.name = null;
		}

		userfCacheModel.surname = getSurname();

		String surname = userfCacheModel.surname;

		if ((surname != null) && (surname.length() == 0)) {
			userfCacheModel.surname = null;
		}

		userfCacheModel.email = getEmail();

		String email = userfCacheModel.email;

		if ((email != null) && (email.length() == 0)) {
			userfCacheModel.email = null;
		}

		Date birthdate = getBirthdate();

		if (birthdate != null) {
			userfCacheModel.birthdate = birthdate.getTime();
		} else {
			userfCacheModel.birthdate = Long.MIN_VALUE;
		}

		Date creationdate = getCreationdate();

		if (creationdate != null) {
			userfCacheModel.creationdate = creationdate.getTime();
		} else {
			userfCacheModel.creationdate = Long.MIN_VALUE;
		}

		return userfCacheModel;
	}

	@Override
	public String toString() {
		Map<String, Function<Userf, Object>> attributeGetterFunctions = getAttributeGetterFunctions();

		StringBundler sb = new StringBundler((4 * attributeGetterFunctions.size()) + 2);

		sb.append("{");

		for (Map.Entry<String, Function<Userf, Object>> entry : attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<Userf, Object> attributeGetterFunction = entry.getValue();

			sb.append(attributeName);
			sb.append("=");
			sb.append(attributeGetterFunction.apply((Userf) this));
			sb.append(", ");
		}

		if (sb.index() > 1) {
			sb.setIndex(sb.index() - 1);
		}

		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		Map<String, Function<Userf, Object>> attributeGetterFunctions = getAttributeGetterFunctions();

		StringBundler sb = new StringBundler((5 * attributeGetterFunctions.size()) + 4);

		sb.append("<model><model-name>");
		sb.append(getModelClassName());
		sb.append("</model-name>");

		for (Map.Entry<String, Function<Userf, Object>> entry : attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<Userf, Object> attributeGetterFunction = entry.getValue();

			sb.append("<column><column-name>");
			sb.append(attributeName);
			sb.append("</column-name><column-value><![CDATA[");
			sb.append(attributeGetterFunction.apply((Userf) this));
			sb.append("]]></column-value></column>");
		}

		sb.append("</model>");

		return sb.toString();
	}

	private static class EscapedModelProxyProviderFunctionHolder {

		private static final Function<InvocationHandler, Userf> _escapedModelProxyProviderFunction = _getProxyProviderFunction();

	}

	private String _uuid;
	private long _id;
	private String _name;
	private String _surname;
	private String _email;
	private Date _birthdate;
	private Date _creationdate;

	public <T> T getColumnValue(String columnName) {
		columnName = _attributeNames.getOrDefault(columnName, columnName);

		Function<Userf, Object> function = _attributeGetterFunctions.get(columnName);

		if (function == null) {
			throw new IllegalArgumentException("No attribute getter function found for " + columnName);
		}

		return (T) function.apply((Userf) this);
	}

	public <T> T getColumnOriginalValue(String columnName) {
		if (_columnOriginalValues == null) {
			return null;
		}

		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		return (T) _columnOriginalValues.get(columnName);
	}

	private void _setColumnOriginalValues() {
		_columnOriginalValues = new HashMap<String, Object>();

		_columnOriginalValues.put("uuid_", _uuid);
		_columnOriginalValues.put("id_", _id);
		_columnOriginalValues.put("name", _name);
		_columnOriginalValues.put("surname", _surname);
		_columnOriginalValues.put("email", _email);
		_columnOriginalValues.put("birthdate", _birthdate);
		_columnOriginalValues.put("creationdate", _creationdate);
	}

	private static final Map<String, String> _attributeNames;

	static {
		Map<String, String> attributeNames = new HashMap<>();

		attributeNames.put("uuid_", "uuid");
		attributeNames.put("id_", "id");

		_attributeNames = Collections.unmodifiableMap(attributeNames);
	}

	private transient Map<String, Object> _columnOriginalValues;

	public static long getColumnBitmask(String columnName) {
		return _columnBitmasks.get(columnName);
	}

	private static final Map<String, Long> _columnBitmasks;

	static {
		Map<String, Long> columnBitmasks = new HashMap<>();

		columnBitmasks.put("uuid_", 1L);

		columnBitmasks.put("id_", 2L);

		columnBitmasks.put("name", 4L);

		columnBitmasks.put("surname", 8L);

		columnBitmasks.put("email", 16L);

		columnBitmasks.put("birthdate", 32L);

		columnBitmasks.put("creationdate", 64L);

		_columnBitmasks = Collections.unmodifiableMap(columnBitmasks);
	}

	private long _columnBitmask;
	private Userf _escapedModel;

	@Override
	public Userf cloneWithOriginalValues() {
		// TODO Auto-generated method stub
		return null;
	}

}