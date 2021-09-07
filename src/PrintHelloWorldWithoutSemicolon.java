
public class PrintHelloWorldWithoutSemicolon {
	public static void main(String args[]) {
		//method 1
		if(System.out.printf("Hello world" +"\n")==null) {
		}
		
		//method 2
		if(System.out.append("Hello world" +"\n")==null) {
		}
		
		//method 3
		if(System.out.printf("Hello world").equals(null)) {
			
		}
	}

}
