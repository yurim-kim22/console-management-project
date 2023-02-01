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
		CosmeticDTO cosmetic = new CosmeticDTO();
//		cosmetic.setCategoryCode(Integer.valueOf(inputCosmetic.get("cosmeticCode")));
		cosmetic.setCosmeticName(inputCosmetic.get("name"));
		cosmetic.setCosmeticPrice(Integer.valueOf(inputCosmetic.get("price")));
		cosmetic.setCategoryCode(Integer.valueOf(inputCosmetic.get("categoryCode")));
		cosmetic.setStockStatus(inputCosmetic.get("stock"));
		
		int registResult = cosmeticService.registCosmetic(cosmetic);
		
		if(registResult > 0) {
			printResult.printSuccessMessage("insert");
		}else {
			printResult.printErrorMessage("insert");
		}
	}

	//카테고리 이름 또는 제품 이름으로 조회(SELECT)
	public void searchMenuByNameOrCategory(Map<String, Object> parameter) {
		List<CosmeticDTO> cosmeticList = cosmeticService.searchMenuByNameOrCategory(parameter);
		
		if(cosmeticList != null) {
			printResult.printCosmeticList(cosmeticList);
		}else {
			printResult.printErrorMessage("selectSearch");
		}
	
	}

	//수정하기
	public void updateCosmetic(Map<String, String> inputUpdate) {
		CosmeticDTO cosmetic = new CosmeticDTO();
		cosmetic.setCosmeticCode(Integer.valueOf(inputUpdate.get("cosmeticCode")));
		cosmetic.setCosmeticName(inputUpdate.get("name"));
		cosmetic.setCosmeticPrice(Integer.valueOf(inputUpdate.get("price")));
		cosmetic.setCategoryCode(Integer.valueOf(inputUpdate.get("categoryCode")));
//		cosmetic.setStockStatus(inputUpdate.get("stock"));
		
		if(cosmeticService.updateCosmetic(cosmetic)) {
			printResult.printSuccessMessage("update");
		}else {
			printResult.printErrorMessage("update");
		}
		
	}

	public void deleteCosmetic( Map<String, String> parameter) {
		int code = Integer.parseInt(parameter.get("code"));
		
		if(cosmeticService.deleteCosmetic(code)) {
			printResult.printSuccessMessage("delete");
		} else {
			printResult.printErrorMessage("delete");
		}
	}
	



}
