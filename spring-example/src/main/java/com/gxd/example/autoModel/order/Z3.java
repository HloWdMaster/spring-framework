package com.gxd.example.autoModel.order;


import lombok.extern.slf4j.Slf4j;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Slf4j(topic = "e")
@Order(3)
@Component("3")
public class Z3 {

	public Z3() {
		log.debug("order-{}",this.getClass().getAnnotation(Order.class).value());
	}
}
