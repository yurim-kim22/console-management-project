package com.greedy.cosmetic.controller;

import java.util.List;
import java.util.Map;

import com.greedy.cosmetic.model.dto.CosmeticDTO;
import com.greedy.cosmetic.model.service.CosmeticService;
import com.greedy.cosmetic.views.PrintResult;
import com.greedy.cosmetic.model.service.*;

public class CosmeticController {
	
	private final CosmeticService cosmeticService;
	private final PrintResult printResult;
	
	public CosmeticController() {
		
		cosmeticService = new CosmeticService();
		printResult = new PrintResult();

	}
	
	//전체 조회
	public void selectAllCosmetic() {
		
		List<CosmeticDTO> cosmeticList = cosmeticService.selectAllCosmetic();
		
		if(cosmeticList != null) {
			printResult.printCosmeticList(cosmeticList);
		}else {
			printResult.printErrorMessage("selectList");
		}
	}

	//추가
	public void registCosmetic(Map<String, String> inputCosmetic) {
		//Map으로 전달된 데이터 꺼내서 DTO에 담아서 Service로 전달
		CosmeticDTO cosmeticDTO = new CosmeticDTO();
		cosmeticDTO.setCategoryCode(Integer.valueOf(inputCosmetic.get("cosmeticCode")));
		cosmeticDTO.setCosmeticName(inputCosmetic.get("name"));
		cosmeticDTO.setCosmeticPrice(Integer.valueOf(inputCosmetic.get("price")));
		cosmeticDTO.setCategoryCode(Integer.valueOf(inputCosmetic.get("categoryCode")));
		cosmeticDTO.setStockStatus(inputCosmetic.get("stock"));
		
//		int registResult = cosmeticService.registCosmetic(cosmeticDTO);
		
		if(cosmeticService.registCosmetic(cosmeticDTO) > 0) {
			printResult.printSuccessMessage("insert");
		}else {
			printResult.printErrorMessage("insert");
		}
	}


}
