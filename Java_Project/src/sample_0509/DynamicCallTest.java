package sample_0509;

abstract class Aanimal {
	abstract void sound();// {	System.out.println("Aanimal Ŭ������ sound()");	}
}

class Dog extends Aanimal {
	private int d = 11;
	@Override//�����ִ°� ����,Ʋ���� ��Ʋ���� �˷��ش�.����override �ϰٴ� �˸��°�.
	void sound() {
		System.out.println("�۸�"+d);//private �� �ƹ��� ������ public �� ���ľ� �����մ�.
	}
}

class Cat extends Aanimal {
	private int c = 99;
	@Override
	void sound() {
		System.out.println("�߿�"+c);
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
