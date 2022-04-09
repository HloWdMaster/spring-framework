package com.gxd.example.visitor.util;

import lombok.Getter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.asm.AnnotationVisitor;
import org.springframework.asm.ClassVisitor;

@Slf4j(topic = "e")
@Getter
public class MyClassVisitor extends ClassVisitor {

	MetadataInfo metadataInfo = new MetadataInfo();

	public MyClassVisitor(int asmVersion) {
		super(asmVersion);
	}

	@Override
	public void visit(int version, int access, String name, String signature, String superName, String[] interfaces) {
		log.debug("name:{}",name);
		log.debug("interfaces:{}",interfaces);
		metadataInfo.setClassFullName(name);
	}

	@Override
	public AnnotationVisitor visitAnnotation(String descriptor, boolean visible)  {
		return new MyAnnotationClassVisitor(descriptor,metadataInfo.getList(),metadataInfo.getClassFullName());
	}

	@Override
	public void visitEnd() {
		log.debug("end");
	}


}
