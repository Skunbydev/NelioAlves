package estruturaCondicional;

public class EscopoDeInicializacao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double price = 400.00;
		double discount = 0;
		
		if (price < 200) {
			discount = price * 0.01;
		} else {
			discount = price * 0.05;
		}
			

      System.out.println(discount);
	
		
		
	} 

}


