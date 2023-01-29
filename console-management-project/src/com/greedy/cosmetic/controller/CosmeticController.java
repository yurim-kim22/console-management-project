package com.greedy.cosmetic.controller;

public class CosmeticController {

	public void selectAllCosmetic() {//메뉴 전체 조회
		
		List<CosmeticDTO> cosmeticList = cosmeticService.selectAllCosmetic();
		
		
	}

}
