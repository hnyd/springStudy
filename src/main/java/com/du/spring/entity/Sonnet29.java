package com.du.spring.entity;

public class Sonnet29 implements Poem {

	private static String LINES = "this is poem..........";
	
	public Sonnet29() {
	}
	
	@Override
	public void recite() {
		System.out.println(LINES);
	}

}
