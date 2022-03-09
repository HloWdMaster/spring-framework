package com.gxd.example.autoModel.order;

import lombok.extern.slf4j.Slf4j;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Slf4j(topic = "e")
@Order(1)
@Component("2")
public class Z2 {

	public Z2() {
		log.debug("order-{}",this.getClass().getAnnotation(Order.class).value());
	}
}
