package com.gxd.example.visitor.util;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * 描述类信息
 */
@Data
public class MetadataInfo {
	/**
	 * 类上的注解信息
	 */
	private List<AnnotationMetaDataInfo> list = new ArrayList<>();
	/**
	 * 类的全限定名
	 */
	private String classFullName;
}
