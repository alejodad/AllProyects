import java.util.Scanner;
public class HelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExternalHelloWorld saludo = new ExternalHelloWorld();
		Scanner key = new Scanner(System.in);
		System.out.println("Cual es tu nombre?");
		System.out.println(saludo.HelloWorld(key.nextLine()));
		key.close();
		
		
	}

}
