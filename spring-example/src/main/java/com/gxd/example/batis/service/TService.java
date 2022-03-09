package com.gxd.example.batis.service;

import java.util.List;
import java.util.Map;

public interface TService {
	public List<Map<String, Object>> queryForList();

	Map<String, Object> queryForMap(Integer id);
}
