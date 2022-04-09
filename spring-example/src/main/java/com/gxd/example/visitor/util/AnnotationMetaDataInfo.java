package com.gxd.example.visitor.util;

import lombok.Data;

/**
 * 描述注解信息
 */
@Data
public class AnnotationMetaDataInfo {

	// 注解类型
	private Class annotationType;
	// 注解作用的类
	private String annotationSource;
	// 注解的名字
	private String annotationName;
}
