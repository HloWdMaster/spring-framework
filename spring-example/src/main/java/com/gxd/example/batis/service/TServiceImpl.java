package com.gxd.example.batis.service;

import com.gxd.example.batis.dao.TMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class TServiceImpl implements TService {

	@Autowired
	TMapper tMapper;


	@Override
	public List<Map<String, Object>> queryForList() {
		return tMapper.queryForList();
	}

	@Override
	public Map<String, Object> queryForMap(Integer id) {
		return tMapper.queryForMap(id);
	}
}
