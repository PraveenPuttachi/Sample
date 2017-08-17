
public class Except {
public void throwUnhandledAlertException() throws Exception{
	int[] a={1,2,3};
	System.out.println(a[4]);
}

public void handleException(){
	try{
	new  Except().throwUnhandledAlertException();
	}catch(Exception e){
		//System.out.println("Exception Name: "+e.getClass().getName());
		System.out.println("Exception Name: "+e.getClass().getSimpleName().equalsIgnoreCase("ArrayIndexOutOfBoundsException"));
		//System.out.println("Exception Name: "+e.getClass().getCanonicalName());
		//System.out.println("Exception Name: "+e.getClass().getTypeName());
		if(e.getClass().getSimpleName().equalsIgnoreCase("ArrayIndexOutOfBoundsException")==true){
			driver.close();
		}
	}
	}
public static void main(String[] args) {
	new Except().handleException();
}
}
