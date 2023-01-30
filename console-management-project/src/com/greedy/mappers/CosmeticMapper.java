package com.greedy.mappers;

import java.util.List;

import com.greedy.cosmetic.model.dto.CosmeticDTO;

public interface CosmeticMapper {

	List<CosmeticDTO> selectAllCosmetic();

	List<CosmeticDTO> registCosmetic(CosmeticDTO cosmeticDTO);


}
