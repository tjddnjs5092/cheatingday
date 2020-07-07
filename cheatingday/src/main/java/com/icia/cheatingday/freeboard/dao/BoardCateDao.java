package com.icia.cheatingday.freeboard.dao;

import org.apache.ibatis.annotations.Select;


public interface BoardCateDao {
	@Select("select b_category category from boardcate where b_cateno=#{cateno} and rownum=1")
	public String findByCateno(Integer cateno);
}