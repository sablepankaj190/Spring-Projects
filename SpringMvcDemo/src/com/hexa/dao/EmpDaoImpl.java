package com.hexa.dao;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.hexa.entity.Emp;
import com.hexa.entity.EmpMapper;

@Repository("mydao")
public class EmpDaoImpl implements IDao {
	
	@Autowired
	private JdbcTemplate jt;
	

	@Override
	public int editEmployee(int eid, double sal) {
		String sql = "update hexa_employee set emp_sal =? where emp_id =?";
		Object[] params = {sal, eid};
		int rows = jt.update(sql, params);
		return rows;
	}

	@Override
	public Map<String, Object> getEmployee(int eid) {
		String sql = "select * from hexa_employee where emp_id=?";
		Object[] params = {eid};
		Map<String, Object> row = jt.queryForMap(sql, params);
		return row;
	}

	@Override
	public List<Map<String, Object>> getEmployee(String branch) {
		String sql = "select * from hexa_employee where emp_dept=?";
		Object[] params = {branch};
		List<Map<String, Object>> list = jt.queryForList(sql, params);
		return list;
	}

	@Override
	public Emp viewEmployee(int eid) {
		String sql = "select * from hexa_employee where emp_id=?";
		Object[] params = {eid};
		Emp emp = jt.queryForObject(sql, params, new EmpMapper());
		return emp;
	}

	@Override
	public List<Emp> viewEmployee(String branch) {
		String sql = "select * from hexa_employee where emp_dept=?";
		Object[] params = {branch};
		List<Emp> lst = jt.query(sql, params, new EmpMapper());
		return lst;
	}

	@Override
	public List<Emp> viewEmployee() {
		String sql = "select * from hexa_employee";
		Object[] params = {};
		List<Emp> lst = jt.query(sql, params, new EmpMapper());
		return lst;
	}

}
