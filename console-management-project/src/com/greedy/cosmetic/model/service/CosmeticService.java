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
		
		sqlSession.commit();
		
		sqlSession.close();
		
		return cosmeticList;
	}

	public int registCosmetic(CosmeticDTO cosmetic) {
		
		SqlSession sqlSession = getSqlSession();
		
		mapper = sqlSession.getMapper(CosmeticMapper.class);

		int registResult = mapper.registCosmetic(cosmetic);
		
		sqlSession.commit();
		
		sqlSession.close();
		
		return registResult;
	}

	public List<CosmeticDTO> searchMenuByNameOrCategory(Map<String, Object> parameter) {
		
		SqlSession sqlSession = getSqlSession();
		
		mapper = sqlSession.getMapper(CosmeticMapper.class);
		List<CosmeticDTO> cosmeticList = mapper.searchMenuByNameOrCategory(parameter);
		
		sqlSession.commit();
		
		sqlSession.close();
		
		return cosmeticList;
	}

	public boolean updateCosmetic(CosmeticDTO cosmetic) {
		SqlSession sqlSession = getSqlSession();
		mapper = sqlSession.getMapper(CosmeticMapper.class);

		int result = mapper.updateCosmetic(cosmetic);
		
		if(result > 0 ) {
            sqlSession.commit();
		}else {
            sqlSession.rollback();
		}
		sqlSession.close();
		
		return result > 0 ? true : false;
	}

	public boolean deleteCosmetic(int code) {
		SqlSession sqlSession = getSqlSession();
		mapper = sqlSession.getMapper(CosmeticMapper.class);
		
		int result = mapper.deleteCosmetic(code);
		
		if(result > 0) {
			sqlSession.commit();
		} else {
			sqlSession.rollback();
		}
		
		sqlSession.close();
		
		return result > 0 ? true : false;
	}

}
