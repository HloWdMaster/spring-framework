package com.gxd.example.autoModel._01_inject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.DependsOn;
import org.springframework.stereotype.Component;

@Component
@DependsOn()
public class A {
	//	@Autowired
//	public L lb;
//	@Autowired
//	public List<L> lb;
//	@Autowired
//	public Map<String,L> lb;
//	@Resource
	@Autowired
	public L lb;
}
