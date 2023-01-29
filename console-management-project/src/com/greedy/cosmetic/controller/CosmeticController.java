package com.greedy.cosmetic.controller;

import java.util.List;

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
	

	public void selectAllCosmetic() {//전체 조회
		
		List<CosmeticDTO> cosmeticList = cosmeticService.selectAllCosmetic();//셀렉트한 결과물이 리스트로 들어감
		
		if(cosmeticList != null) {
			printResult.printCosmeticList(cosmeticList);
		}else {
			printResult.printErrorMessage("selectList");
		}
	}

}
