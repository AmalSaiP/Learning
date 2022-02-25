package AssistedPracProj.DiamondProb;

public class Main implements First,Second {
	public void show() {
		
		First.super.show();
		Second.super.show();
		
	}


	public static void main(String[] args) {
		
			Main test = new Main();
			
			test.show();
		
	}

}
