package com.gxd.example.autoModel.order;

import lombok.extern.slf4j.Slf4j;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Slf4j(topic = "e")
@Order(2)
@Component("1")
public class Z1 {

	public Z1() {
		log.debug("order-{}",this.getClass().getAnnotation(Order.class).value());
	}
}
