package com.gxd.example;


import com.gxd.example.batis.conf.BatisConfig;
import com.gxd.example.batis.dao.TMapper;
import com.gxd.example.batis.service.TService;
import com.gxd.example.batis.util.MysqlSession;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.mapping.Environment;
import org.apache.ibatis.session.Configuration;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.ibatis.transaction.jdbc.JdbcTransactionFactory;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import javax.sql.DataSource;
import java.util.List;
import java.util.Map;

@Slf4j(topic = "e")
public class BatisTest {

	@Test
	public void defaultBatis() {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(BatisConfig.class);
		TService service = ctx.getBean(TService.class);
		Map<String, Object> resultMap = service.queryForMap(1);
		List<Map<String, Object>> resultList = service.queryForList();
		log.debug("resultMap:{}",resultMap);
		log.debug("---------------------------");
		log.debug("resultList:{}",resultList);

	}

	@Test
	public void onlyBatis() {
		BatisConfig config = new BatisConfig();
		DataSource dataSource = config.dataSource();
		JdbcTransactionFactory transactionFactory = new JdbcTransactionFactory();
		Environment environment = new Environment("development", transactionFactory, dataSource);
		Configuration configuration = new Configuration(environment);
		configuration.addMapper(TMapper.class);
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(configuration);
		SqlSession sqlSession = sqlSessionFactory.openSession();
		TMapper mapper = sqlSession.getMapper(TMapper.class);
		Map<String, Object> resultMap = mapper.queryForMap(1);
		log.debug("resultMap:{}",resultMap);
	}

	@Test
	public void customBatis() {
		TMapper mapper = MysqlSession.getMapper(TMapper.class);
		System.out.println(mapper);
		mapper.queryForMap(1);
	}

}
