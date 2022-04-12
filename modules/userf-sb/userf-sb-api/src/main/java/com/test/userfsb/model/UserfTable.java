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

import com.liferay.petra.sql.dsl.Column;
import com.liferay.petra.sql.dsl.base.BaseTable;

import java.sql.Types;

import java.util.Date;

/**
 * The table class for the &quot;Userf_Userf&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see Userf
 * @generated
 */
public class UserfTable extends BaseTable<UserfTable> {

	public static final UserfTable INSTANCE = new UserfTable();

	public final Column<UserfTable, String> uuid = createColumn(
		"uuid_", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<UserfTable, Long> id = createColumn(
		"id_", Long.class, Types.BIGINT, Column.FLAG_PRIMARY);
	public final Column<UserfTable, String> name = createColumn(
		"name", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<UserfTable, String> surname = createColumn(
		"surname", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<UserfTable, String> email = createColumn(
		"email", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<UserfTable, Date> birthdate = createColumn(
		"birthdate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<UserfTable, Date> creationdate = createColumn(
		"creationdate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);

	private UserfTable() {
		super("Userf_Userf", UserfTable::new);
	}

}