package sample_04_11;

public class Television {
	int channel;
	int volume;
	boolean onOff;
	
	void pr(){
		System.out.println(channel+" "+volume+" "+onOff);
	}

	//int volumeUP(int up_data){
	//	int vol=volume; 
	//	vol+=up_data;
	//	return vol;
	//}
	
	void volumeUP(int data){
		if(onOff == false){
			System.out.println("TV Die");
			return;//method ������ �ǹ�
			}
		
		volume+=data;
		//<-�̰��� �� ���� �ҽ�
	}
	
	void volumeUP(){
		if(onOff == false){
			System.out.println("TV Die");
			return;//method ������ �ǹ�
			}
		
		volume+=1;
		
	}
	
}
