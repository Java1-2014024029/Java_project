package sample_0509;

abstract class Aanimal {
	abstract void sound();// {	System.out.println("Aanimal 클래스의 sound()");	}
}

class Dog extends Aanimal {
	private int d = 11;
	@Override//적어주는게 예의,틀린지 안틀린지 알려준다.내가override 하겟다 알리는것.
	void sound() {
		System.out.println("멍멍"+d);//private 는 아무도 못쓴다 public 을 거쳐야 쓸수잇다.
	}
}

class Cat extends Aanimal {
	private int c = 99;
	@Override
	void sound() {
		System.out.println("야옹"+c);
		}
 }
public class DynamicCallTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Aanimal animal = new Aanimal();
		Aanimal dog = new Dog();
		Aanimal cat = new Cat();
		
		Aanimal obj;
		
		//obj = animal ;		obj.sound();
		
		dog.sound();
		cat.sound();
		
				
		//test(animal);		
		test(dog);		
		test(cat);
	}
	static void test(Aanimal temp) {temp.sound(); }
}
