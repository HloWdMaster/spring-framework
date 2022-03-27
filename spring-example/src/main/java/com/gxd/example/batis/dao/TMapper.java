package com.gxd.example.batis.dao;

import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;

public interface TMapper {

	@Select("select * from t")
	public abstract List<Map<String, Object>> queryForList();

	@Select("select * from t where id =#{id}")
	public abstract Map<String, Object> queryForMap(Integer id);


}
