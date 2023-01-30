package com.greedy.mappers;

import java.util.List;
import java.util.Map;

import com.greedy.cosmetic.model.dto.CosmeticDTO;

public interface CosmeticMapper {

	List<CosmeticDTO> selectAllCosmetic();

	int registCosmetic(CosmeticDTO cosmetic);

	List<CosmeticDTO> searchMenuByNameOrCategory(Map<String, Object> parameter);

	int updateCosmetic(CosmeticDTO cosmetic);

	int deleteCosmetic(int code);


}
