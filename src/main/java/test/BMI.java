package test;

import java.util.*;

public class BMI {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter next person's information");
        System.out.print("height (in inches)? ");
        double heightOne = scanner.nextDouble();
        System.out.print("weight (in pounds)? ");
        double weightOne = scanner.nextDouble();
        System.out.println();
        System.out.println("Enter next person's information");
        System.out.print("height (in inches)? ");
        double heightTwo = scanner.nextDouble();
        System.out.print("weight (in pounds)? ");
        double weightTwo = scanner.nextDouble();
        System.out.println();
        double bmiOne = calculateBMI(heightOne,weightOne);
        System.out.println("Person 1 BMI = " + bmiOne);
        System.out.println(calculateWeightClass(bmiOne));
        double bmiTwo = calculateBMI(heightTwo, weightTwo);
        System.out.println("Person 2 BMI = " + bmiTwo);
        System.out.println(calculateWeightClass(bmiTwo));
        System.out.println("Difference = " + Math.abs(bmiOne - bmiTwo));
    }

    public static double calculateBMI (double height, double weight) {
        double bmi = weight / (height * height) * 703;
        return bmi;
    }

    public static String calculateWeightClass (double bmi) {
        if (bmi < 18.5) {
            return "overweight";
        } else if (18.5 < bmi && bmi < 24.9) {
            return "normal";
        } else if (25.0 < bmi && bmi < 29.9) {
            return "overweight";
        } else {
            return "obese";
        }
    }
}
