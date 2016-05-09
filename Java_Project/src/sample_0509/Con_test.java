package sample_0509;

class Par {
	Par() {
		System.out.println("Par con");
	}

	Par(int x) {
		System.out.println("Par con" + x);
	}
}

class child extends Par {
	public child(int y) {
		super(y);// 안써도잘 돌아가지만 적으면 일반적으로 말을하는 구나->굳이 왜쓸까? 한가지쓰임이있으니까.
		System.out.println("child con");
	}

	public child() {
		System.out.println("child con nothing");
	}

	public static class Con_test {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			child c1 = new child(5);
			child c2 = new child();
		}
	}

}