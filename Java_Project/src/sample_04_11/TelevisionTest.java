package sample_04_11;

public class TelevisionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Television mytv = new Television();
		Television yourtv = new Television();
		Television testtv = mytv;
		
		mytv.channel(18);
		mytv.volume = 20;
		mytv.onOff = true;
		mytv.volumeUP();
		//mytv.onOff = false;
		//mytv.volume = mytv.volumeUP(30);
		//mytv.volumeUP(30);
		//System.out.println(mytv.channel+" "+mytv.volume+" "+mytv.onOff);
		mytv.pr();
		
		yourtv.channel = 18;
		yourtv.volume = 20;
		yourtv.onOff = true;
		
		//System.out.println(yourtv.channel+" "+yourtv.volume+" "+yourtv.onOff);
		yourtv.pr();
		mytv.channel = 231;
		
		//System.out.println(testtv.channel+" "+testtv.volume+" "+testtv.onOff);
		testtv.pr();
		//testtv = null;
	}

}
//리모콘 만들기~!~!