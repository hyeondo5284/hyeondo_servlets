package org.hyeondo.servlets.chap11.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

@FunctionalInterface
public interface RowMapper<T> {
	T mapRow(ResultSet rs) throws SQLException;
}
