import java.util.Locale;

public class Main {

	public static void main(String[] args) {

		String produto1 = "Computador";
		String produto2 = "Office";
		int age = 30;
		int code = 5290;
		char gender = 'F';
		double prince1 = 2100.0;
		double prince2 = 650.0;
		double measure = 53.234567;

		System.out.println("Products:");
		System.out.printf("%s ,which price is $ %.2f %n",produto1,prince1);
		System.out.printf("%s ,which price is $ %.2f %n%n",produto2,prince2);
		
		System.out.printf("Record : %d years, code %d ande gender : %s %n",age,code,gender);
		
		System.out.printf("Measue with eight decimal places: %f %n",measure);
		System.out.printf("Rouded(tree decimal places): %.3f %n",measure);
		Locale.setDefault(Locale.US);
		System.out.printf("US decimal point: %.3f %n",measure);
		
	}

}