package org.spring.controller;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.spring.mapper.MemberMapper;
import org.spring.model.MemberVO;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:config/data.xml"})
@Log4j // 롬복을 이용해서 로그 기록하는 객체 생성
public class MyBatisClient {
	//개발자가 객체생성을 하는 것이 아닌, 스프링이 객체 생성을 하게 만듬
	@Inject
	private SqlSessionFactory sqlFactory;
	@Inject
	private MemberMapper MemberMapper;
	
	@Test
	public void testFactory() {
		log.info(sqlFactory);
	}
	@Test
	public void testSesstion() {
		try(SqlSession se = sqlFactory.openSession();) {
		log.info(se);
		List<MemberVO> users = MemberMapper.getAllMembers();
		System.out.println(users);
		
		MemberVO param = new MemberVO();
		param.setId("hong");
		param.setPwd("asd");
		
		MemberVO result = MemberMapper.getMember(param);
		System.out.println(result);
		
		} catch (Exception e) {
			e.printStackTrace();
		log.info("실패!");
		}

	}
	
	
}
