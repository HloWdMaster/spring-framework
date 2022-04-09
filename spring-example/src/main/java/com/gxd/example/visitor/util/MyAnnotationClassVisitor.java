package com.gxd.example.visitor.util;

import org.springframework.asm.AnnotationVisitor;
import org.springframework.asm.Opcodes;
import org.springframework.asm.Type;
import org.springframework.util.ClassUtils;

import java.util.List;

public class MyAnnotationClassVisitor extends AnnotationVisitor {

	public MyAnnotationClassVisitor(String descriptor, List<AnnotationMetaDataInfo> metaDataInfoList,String fullClassName)  {
		super(Opcodes.ASM7);
		try {
			// 注解名字
			String className = Type.getType(descriptor).getClassName();
			Class<?> aClass = null;
			aClass = ClassUtils.forName(className, Thread.currentThread().getContextClassLoader());
			AnnotationMetaDataInfo info = new AnnotationMetaDataInfo();
			// 注解类型
			info.setAnnotationType(aClass);
			// 注解名字
			info.setAnnotationName(aClass.getSimpleName());
			// 注解作用的类名
			info.setAnnotationSource(fullClassName);
			metaDataInfoList.add(info);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

	}
}
