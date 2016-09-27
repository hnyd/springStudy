package com.du.spring.entity;

public class Stage {

	private Stage() {
		
	}
	
	private static class StageSingletonHolder {
		private static Stage instance = new Stage();
	}
	
	public static Stage getInstance() {
		return StageSingletonHolder.instance;
	}
	
}
