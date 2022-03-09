package com.gxd.example.batis.dao;

import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;

public interface TMapper {

	@Select("select * from t")
	List<Map<String, Object>> queryForList();

	@Select("select * from t where id =#{id}")
	Map<String, Object> queryForMap(Integer id);

}
