package com.cghsir.cloud;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.sql.DataSource;
import java.sql.SQLException;


@RunWith(SpringRunner.class)
@SpringBootTest
public class DruidDataSourceTest {

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
