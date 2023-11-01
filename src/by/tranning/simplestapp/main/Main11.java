package by.tranning.simplestapp.main;

public class Main11 {

	public static void main(String[] args) {
		double a1 = 4;
		double b1 = 3;
		double c1 = 1;
		double a2 = 4;
		double b2 = 5;
		double c2 = 6;
		double s1 = Math.sqrt(((a1+b1+c1)/2)*(((a1+b1+c1)/2)-a1)*(((a1+b1+c1)/2)-b1)*(((a1+b1+c1)/2)-c1));
		double s2 = Math.sqrt(((a2+b2+c2)/2)*(((a2+b2+c2)/2)-a2)*(((a2+b2+c2)/2)-b2)*(((a2+b2+c2)/2)-c2));
		if (s1 > s2) {
			System.out.println("площадь первого треугольника больше");
		}
		if (s1 < s2) {
			System.out.println("площадь второго треугольника больше");

		}

	}

}
