import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter weight in pounds: ");
        double weight = scan.nextDouble();

        System.out.print("Enter height in inches: ");
        double height = scan.nextDouble();

        Pound pounds = new Pound(weight);
        Inch inches = new Inch(height);
        BMI bmi = new BMI(pounds, inches);

        System.out.println("BMI is " + bmi.getBMI());
        System.out.println(bmi.bmiInterpretation());
        scan.close();
    }
}
