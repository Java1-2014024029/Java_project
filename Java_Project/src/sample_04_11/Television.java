package sample_04_11;

public class Television {
	private int channel;
	private int volume;
	private boolean onOff;
	
	public void pr(){
		System.out.println(channel+" "+volume+" "+onOff);
	}

	//int volumeUP(int up_data){
	//	int vol=volume; 
	//	vol+=up_data;
	//	return vol;
	//}
	
	public void volumeUP(int data){
		if(onOff == false){
			System.out.println("TV Die");
			return;//method ������ �ǹ�
			}
		
		volume+=data;
		//<-�̰��� �� ���� �ҽ�
	}
	
	public void volumeUP(){
		if(onOff == false){
			System.out.println("TV Die");
			return;//method ������ �ǹ�
			}
		
		volume+=1;
		
	}
	
}
