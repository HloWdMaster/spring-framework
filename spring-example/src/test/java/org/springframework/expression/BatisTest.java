package org.springframework.expression;


import com.gxd.example.batis.conf.BatisConfig;
import com.gxd.example.batis.service.TService;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

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

}
