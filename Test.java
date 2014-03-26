
public class Test {
	int a;
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test t  = new Test();
		t.add();
		Test.sub();
	}
	
	public void add(){
		Test01 t1 = new Test01();
		/* add joyana
		   강광구는 아주 멋있다.
		   김은주는 너무 이쁘다.
		*/
		Test01.test01_sub();
	}
	
	public static void sub(){
		
	}

}

class Test01 {
	public void test01_add() {
		
	}

	public static void test01_sub() {
		
		new Test01().test01_add();
		
		Test01 t02 = new Test01();
		t02.test01_add();
	}
}
