import java.util.ArrayList;

public class SingletonExample {

	// Static member holds only one instance of the
	// SingletonExample class
	private static SingletonExample singletonInstance;
	
	private static ArrayList list;

	// SingletonExample prevents any other class from instantiating
	private SingletonExample() {
	}

	public static ArrayList getSingletonArrayInstance() {
		if (null == list) {
			list = new ArrayList();
			System.out.println("Creating new array instance");
		}
		return list;
	}
	
	public void addArray (String add){
		
		list.add(add);
		
		
	}
	
	public void printSingletonArray() {
		for(int i = 0; i < list.size(); i++){
			
			System.out.println(list.get(i));
			
		}
	}
	
	
	
	// Providing Global point of access
	public static SingletonExample getSingletonInstance() {
		if (null == singletonInstance) {
			singletonInstance = new SingletonExample();
			System.out.println("Creating new instance");
		}
		return singletonInstance;
	}

	public void printSingleton() {
		System.out.println("Inside print Singleton");
	}
}
