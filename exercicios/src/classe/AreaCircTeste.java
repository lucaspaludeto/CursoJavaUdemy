package classe;

public class AreaCircTeste {
	
	public static void main(String[] args) {
		
		AreaCirc a = new AreaCirc(5.6);
		a.raio = 10;
		System.out.println(a.area());
		
		System.out.println(AreaCirc.area(100));
		System.out.println(AreaCirc.PI);
		System.out.println(Math.PI);
	}

}
