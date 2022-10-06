package com.valtech.training.corejava;

public enum Gender {

	MALE(1),FEMALE(-1),OTHER(0);
	private int value;
	public int getValue() {
		return value;
	}
	private Gender(int value)
	{
		this.value=value;
		
	}
	public static void main(String[] args) {
		for( Gender g: Gender.values()) {
			System.out.println(g+ " "+g.getValue());
		}
	}
}
