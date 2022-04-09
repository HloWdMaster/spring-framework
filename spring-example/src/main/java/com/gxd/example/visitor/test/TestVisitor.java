package com.gxd.example.visitor.test;

import com.gxd.example.visitor.util.MetadataInfo;
import com.gxd.example.visitor.util.MyClassVisitor;
import org.junit.Test;
import org.springframework.asm.ClassReader;
import org.springframework.asm.SpringAsmInfo;

import java.io.IOException;

public class TestVisitor {
	public static final int PARSING_OPTIONS = ClassReader.SKIP_DEBUG
			| ClassReader.SKIP_CODE | ClassReader.SKIP_FRAMES;

	@Test
	public void test() {
		MyClassVisitor myClassVisitor = new MyClassVisitor(SpringAsmInfo.ASM_VERSION);
		try {
			ClassReader classReader = new ClassReader("com.gxd.example.visitor.bean.V_A");
			classReader.accept(myClassVisitor,PARSING_OPTIONS);
		} catch (IOException e) {
			e.printStackTrace();
		}

		MetadataInfo metadataInfo = myClassVisitor.getMetadataInfo();
	}

}
