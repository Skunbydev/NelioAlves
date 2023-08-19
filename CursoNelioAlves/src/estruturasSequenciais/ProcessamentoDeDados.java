package estruturasSequenciais;

public class ProcessamentoDeDados {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				// Exemplo 1:

				int x, y;

				x = 5;

				y = 2 * x;

				// Exemplo 2:
				int xx;
				double yy;

				xx = 5;
				yy = xx * 2;

				// Exemplo 3:

				double b1, B, h, area;

				b1 = 6.0; // Para números double, use ponto.
				B = 8.0; // Para números float, use .f exemplo: 8F
				h = 5.0;

				area = (b1 + B) / 2.0 * h;

				// Exemplo 4:

				int a1, b2;
				double resultado;

				a1 = 5;
				b2 = 2;

				resultado = (double) a1 / b2; // para transformar em double, use (double)

				// Exemplo 5:

				double a2;
				int b3;

				a2 = 5.0;
				b3 = (int) a2; // Se deixar apenas o numero vai dar erro de sintaxe

				System.out.println(b3);

				System.out.println(x);
				System.out.println(y);
				System.out.println(xx);
				System.out.println(yy);
				System.out.println(area);
				System.out.println(resultado);


	}

}
