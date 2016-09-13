package com.yq.servlet;

import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServlet;

import com.yq.dao.CustomerDao;
import com.yq.dao.LanguageDao;
import com.yq.dao.impl.CustomerDaoImpl;
import com.yq.dao.impl.LanguageDaoImpl;
import com.yq.entity.Customer;
import com.yq.jdbc.ConnectionFactory;

public class CheckCustomerServlet extends HttpServlet {

	private static final long serialVersionUID = 2L;
	private CustomerDao customerDao = new CustomerDaoImpl();
	private LanguageDao languageDao = new LanguageDaoImpl();

	public boolean check(Customer cust) {

		Connection conn = null;

		try {
			conn = ConnectionFactory.getInstance().makeConnection();

			conn.setAutoCommit(false);

			ResultSet resultSet = customerDao.get(conn, cust);

			while (resultSet.next()) {
				return true;
			}
		} catch (Exception e) {
			e.printStackTrace();
			try {
				conn.rollback();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		} finally {
			try {
				conn.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		return false;
	}

	public List<Customer> readResult() {

		List<Customer> list = new ArrayList<Customer>();

		Connection conn = null;
		ResultSet rs = null;
		try {
			conn = ConnectionFactory.getInstance().makeConnection();

			conn.setAutoCommit(false);

			rs = customerDao.get(conn);

			while (rs.next()) {
				int customer_id = rs.getInt("customer_id");
				String first_name = rs.getString("first_name");
				String last_name = rs.getString("last_name");
				String email = rs.getString("email");
				int address_id = rs.getInt("address_id");
				Date create_date = rs.getDate("create_date");
				Customer customer = new Customer( customer_id, first_name, last_name , email, address_id, create_date);
				list.add(customer);
			}
			return list;

		} catch (Exception e) {
			e.printStackTrace();
			try {
				conn.rollback();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		} finally {
			try {
				conn.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		return null;
	}

	public List<String> readLanguageId() {

		List<String> list = new ArrayList<String>();

		Connection conn = null;
		ResultSet rs = null;
		try {
			conn = ConnectionFactory.getInstance().makeConnection();

			conn.setAutoCommit(false);

			rs = languageDao.get(conn);

			while (rs.next()) {
				String language = rs.getString("name");
				list.add(language);
			}
			return list;

		} catch (Exception e) {
			e.printStackTrace();
			try {
				conn.rollback();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		} finally {
			try {
				conn.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		return null;
	}
}

