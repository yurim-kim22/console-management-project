package com.greedy.cosmetic.model.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import com.greedy.cosmetic.model.dto.CosmeticDTO;

import com.greedy.mappers.CosmeticMapper;


import static com.greedy.common.Template.getSqlSession;

public class CosmeticService {
	
	private CosmeticMapper mapper;

	public List<CosmeticDTO> selectAllCosmetic() {

		SqlSession sqlSession = getSqlSession();
		mapper = sqlSession.getMapper(CosmeticMapper.class);
		
		List<CosmeticDTO> cosmeticList = mapper.selectAllMenu();
		
		sqlSession.close();
		
		return cosmeticList;
	}

}
