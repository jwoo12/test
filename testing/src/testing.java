
public class testing {

	
	public testing(){
		
	}
	
	public void singletonarraytest(){
		
		SingletonExample.getSingletonArrayInstance().add("testing");
		
		for (int i = 0; i < SingletonExample.getSingletonArrayInstance().size() ; i++){
			
			System.out.println(SingletonExample.getSingletonArrayInstance().get(i));
			
			
		}
		
		
		
	}
	
	
}
