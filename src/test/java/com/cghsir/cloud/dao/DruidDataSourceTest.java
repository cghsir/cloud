package com.cghsir.cloud.dao;

import com.cghsir.cloud.BaseTest;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import javax.sql.DataSource;
import java.sql.SQLException;



public class DruidDataSourceTest extends BaseTest {

	@Autowired
	private DataSource dataSource;

	/**
	 * 测试druid数据源
	 * @throws SQLException
	 */
	@Test
	public void testOpenDruidDataSource() throws SQLException {
		System.out.println(dataSource.getConnection());
	}

}
