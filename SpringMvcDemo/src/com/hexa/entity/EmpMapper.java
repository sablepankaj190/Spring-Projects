package com.hexa.entity;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class EmpMapper implements RowMapper<Emp>{

	@Override
	public Emp mapRow(ResultSet rs, int rowno) throws SQLException {
		System.out.println(rowno);
		Emp emp = new Emp(rs.getInt("emp_id"), rs.getString("emp_name"),
				            rs.getDouble("emp_sal"), rs.getString("emp_dept"), rs.getDate("emp_doj").toLocalDate());
		return emp;
	} 

}