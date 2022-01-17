package スジャン;

public class Main {
    public static void main(String[] args) {
   
    	Add ca=new Add();
    	
    	ca.hiku();
    	
    }
}


package スジャン;

public interface Calc {

	int tasu();
	int hiku();
	int kake();
	int wari();
    
}



package スジャン;

public class Add implements Calc {

	@Override
	public int tasu() {
		// TODO 自動生成されたメソッド・スタブ
		return 1+1;
	}

	@Override
	public int hiku() {
		// TODO 自動生成されたメソッド・スタブ
		return 2-1;
	}

	@Override
	public int kake() {
		// TODO 自動生成されたメソッド・スタブ
		return 2*2;
	}

	@Override
	public int wari() {
		// TODO 自動生成されたメソッド・スタブ
		return 5/10;
	}
}
