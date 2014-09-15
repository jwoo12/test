import java.util.ArrayList;


public class main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
//		SingletonExample.getSingletonInstance().printSingleton();
//		SingletonExample.getSingletonInstance().printSingleton();
//		SingletonExample.getSingletonInstance().printSingleton();
//		SingletonExample.getSingletonInstance().printSingleton();
		
		
		ArrayList a = new ArrayList();
		
		a.add("addAll");
		
		SingletonExample.getSingletonArrayInstance().addAll(a);
		
		for (int i = 0; i < SingletonExample.getSingletonArrayInstance().size() ; i++){
			
			System.out.println(SingletonExample.getSingletonArrayInstance().get(i));
			
			
		}
		
//		
//		SingletonExample.getSingletonArrayInstance();
//		SingletonExample.getSingletonArrayInstance().add("main");
//		SingletonExample.getSingletonArrayInstance().add("main2");
//		//System.out.println(SingletonExample.getSingletonArrayInstance().get(0));
//		
//		testing t = new testing();
//		t.singletonarraytest();
//		
//		SingletonExample.getSingletonArrayInstance().addAll(arg0)
		
		
		
		
	}

}
