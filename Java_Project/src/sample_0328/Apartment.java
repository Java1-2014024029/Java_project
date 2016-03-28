
package sample_0328;

public class Apartment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=9 ;i>=1;i--){
			for(int j = 1;j<=8;j++){
				if(j>=6 && i>=6) break;
				System.out.print((i*100+j)+" ");
			}
			System.out.println(" ");
		}
	}
}
