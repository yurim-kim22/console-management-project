package com.greedy.cosmetic.model.service;


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
		List<CosmeticDTO> cosmeticList = mapper.selectAllCosmetic();
		
		sqlSession.close();
		
		return cosmeticList;
	}

	public int registCosmetic(CosmeticDTO cosmeticDTO) {
		
		SqlSession sqlSession = getSqlSession();
		
		mapper = sqlSession.getMapper(CosmeticMapper.class);
		List<CosmeticDTO> cosmeticList = mapper.registCosmetic(cosmeticDTO);
		
		sqlSession.close();
		
		return cosmeticList;
	}

}
