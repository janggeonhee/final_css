package com.jdl.css.border.model.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jdl.css.border.model.vo.BorderVo;

@Repository
public class BorderDao {

	@Autowired
	private SqlSessionTemplate sqlSession;

	public List<BorderVo> borderListSelect(String bCateGory) {
		System.out.println("dao" + bCateGory);
		return sqlSession.selectList("BorderMapper.BorderListSelect", bCateGory);
	}

	
}
