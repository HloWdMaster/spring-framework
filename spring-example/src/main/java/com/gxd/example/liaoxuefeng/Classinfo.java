package com.gxd.example.liaoxuefeng;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

import static java.lang.invoke.MethodHandles.lookup;

public class Classinfo extends AbstractInfo {

	public static void main(String[] args) {

//		log.info("324");
//		printClassInfo(lookup().getClass());
//		printClassInfo("".getClass());
//		printClassInfo(Runnable.class);
//		printClassInfo(java.time.Month.class);
//		printClassInfo(String[].class);
//		printClassInfo(long[].class);
//		printClassInfo(byte[].class);
//		printClassInfo(short[].class);
//		printClassInfo(int[].class);
//		printClassInfo(char[].class);
//		printClassInfo(double[].class);
//		printClassInfo(float[].class);
//		printClassInfo(boolean[].class);
//		printClassInfo(int.class);
		Modifier modifier = new Modifier();

		for (Field field : modifier.getClass().getFields()) {
			printFieldInfo(field,modifier);

		}

	}

	static void printFieldInfo(Field field, Modifier modifier) {
		try {
			System.out.println("filedName: " + field.getName() + ", \tbit value:\t " + getBinaryValueStr(((Integer) field.get(modifier)).intValue()));
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}
	}

	static String getBinaryValueStr(int value) {
		return Integer.toBinaryString(value);
	}

	static void printClassInfo(Class cls) {
		System.out.println("Class name: " + cls.getName());
		System.out.println("Simple name: " + cls.getSimpleName());
		if (cls.getPackage() != null) {
			System.out.println("Package name: " + cls.getPackage().getName());
		}
		System.out.println("is interface: " + cls.isInterface());
		System.out.println("is enum:" + cls.isEnum());
		System.out.println("is array: " + cls.isArray());
		System.out.println("is primitive: " + cls.isPrimitive());
		System.out.println("=============================");
		System.out.println();
	}
}
