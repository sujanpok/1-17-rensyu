public class DemoBean {

	private String username;
	
	private int age;
	
	private boolean isMen;
	
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public boolean isMen() {
		return isMen;
	}

	public void setMen(boolean isMen) {
		this.isMen = isMen;
	}

	
}






public class exam3 {
	public DemoBean getBean(DemoBean dbean) {
		
		System.out.println(dbean.getUsername());
		System.out.println(dbean.getAge());
		System.out.println(dbean.isMen());
		
		dbean.setUsername("ll");
 		dbean.setAge(18);
 		dbean.setMen(false);
 		return dbean;
		
	}
	
}




package スジャン;

public class Vehicle {

 	public static void move()
 	{
 		DemoBean dbean= new DemoBean();
 		
 		dbean.setUsername("pz");
 		dbean.setAge(30);
 		dbean.setMen(true);
 		
 		
 		exam3 ex = new exam3();
 		DemoBean dd = ex.getBean(dbean);
 	
 		System.out.println(dbean.getUsername());
		System.out.println(dbean.getAge());
		System.out.println(dbean.isMen());
 	}
 	  public static void main(String[] args) {
 		 move();
 		  }


}

