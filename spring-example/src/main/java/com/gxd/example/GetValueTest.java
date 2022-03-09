package com.gxd.example;

import com.gxd.example.log.EagleComponent;

import java.lang.reflect.Field;

public class GetValueTest {
	public static void main(String[] args) {
		EagleComponent component = new EagleComponent();

		try {
			Field name = component.getClass().getDeclaredField("name");
			Object o = name.get(component);
			System.out.println(o);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
