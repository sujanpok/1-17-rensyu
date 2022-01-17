package スジャン;
import java.util.Scanner;
public class hello1 {
	
	
		  public static void main(String[] args) {
			  Scanner myOb = new Scanner(System.in);
			  System.out.println("名前入力:");
			  String name = myOb.nextLine();
			  System.out.println("年齢入力:");
			  
			  int age = myOb.nextInt();
			  
			  System.out.println(" 労働時間:");
			  int i = myOb.nextInt();
			  System.out.println("名前: " + name); 
			    System.out.println("年齢: " + age); 
		    clou myig = new clou();
		    
		    //時給　int
		    int jikyu= myig.getjikyu(age);
		    System.out.println("時給は:"+jikyu+"円");
		    //kyukei
		    int qk =  myig.qke(i);
		    System.out.println("休憩時間:"+(qk)+"h");
		    
		    
		    int syunyu= clou.myMethod(i,jikyu,qk);
		    
		    System.out.println("給料は："+syunyu+"円");
		  }
		}






package スジャン;

public	class clou {
	 
	
	  static int myMethod(int i, int jikyu,int qke) { 
		  
	int realWorkTime = getRealworkTime(i,qke); 
		 
		  return realWorkTime*jikyu;
		   
		  }
	private static int getRealworkTime(int i, int qke) {
		// TODO 自動生成されたメソッド・スタブ
		return i-qke;
	}
	public int getjikyu(int age) {
		// TODO 自動生成されたメソッド・スタブ
		int jikyu = 0;
		switch (age) {
		case 10:
			jikyu=1000;
			break;
		case 30:
			jikyu=2000;
			break;

		default:
			jikyu=3000;
			break;
		}
		
		
		return jikyu;
	}
	public int qke(int i) {
	
			
		return i/10;
	}
	  
	}

