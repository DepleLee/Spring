package org.spring.controller;

import javax.sql.DataSource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:config/data.xml"})
@Log4j // 롬복을 이용해서 로그 기록하는 객체 생성
public class JDBCClient {
	@Autowired
	private ApplicationContext context;
	//왜이랭
	@Test
	public void dataSourceTest() {
		DataSource ds = (DataSource)context.getBean("dataSource");
		try {
			log.info(ds.getConnection());
			log.info("성공!");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
}
