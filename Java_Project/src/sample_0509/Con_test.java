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
		super(y);// �Ƚᵵ�� ���ư����� ������ �Ϲ������� �����ϴ� ����->���� �־���? �Ѱ��������������ϱ�.
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