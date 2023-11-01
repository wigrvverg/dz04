package by.tranning.simplestapp.main;

public class Main10 {

	public static void main(String[] args) {
		double r1 = 3;
		double r2 = 4;
		double s1 = Math.PI * Math.pow(r1, 2);
		double s2 = Math.PI * Math.pow(r2, 2);
		if (s1 > s2) {
			System.out.println("площадь второго круга меньше");
		}
		if (s1 < s2) {
			System.out.println("площадь первого круга меньше");

		}
	}
}
