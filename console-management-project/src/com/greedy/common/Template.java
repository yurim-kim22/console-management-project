package com.greedy.common;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class Template {
	
	private static SqlSessionFactory sqlSessionFactory;
	
	public static SqlSession getSqlSession() {
		
		//싱글톤 패턴으로 하나의 객체만 만들기
		if(sqlSessionFactory == null) {
			String resource = "mybatis-config.xml";
			
			try {
				
				InputStream inputStream = Resources.getResourceAsStream(resource);
				sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
						
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		return sqlSessionFactory.openSession(false);//바로 sqlSession 반환시킴
	}

}










