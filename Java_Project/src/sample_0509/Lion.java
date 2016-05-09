package sample_0509;

public class Lion extends Animal {
	private int legs=4;
	void roar(){	
		weight = 10;
		System.out.println("roar()가 호출되었음"+weight);	
		}
	void setPicture(String x){
		picture = x;
		System.out.println(picture);
	}
}
