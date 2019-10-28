package CaseStudy_FuramaResort.Commons;

import javax.print.attribute.standard.NumberUp;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DataInput {
    private static final String REXFLOAT = "^([+-]?\\d*\\.?\\d*)$";
    private static final String REXINTERGER = "[+-]?[0-9][0-9]*";
    private static String regexName = "\\p{Upper}(\\p{Lower}+\\s?)";
    private static final String REXNAME = "(" + regexName + "){0,3}";
    //    private static final String REXNAME = "[A-Z][a-z]*";
    private static String massage = "Massage";
    private static String karaoke = "Karaoke";
    private static String drink = "Drink";
    private static String food = "Food";
    private static String car = "Car";

    public static boolean checkName(String name) {
        return name.matches(REXNAME);
    }

    public static boolean checkArea(float area) {
        return String.valueOf(area).matches(REXFLOAT) && area >= 30;
    }

    public static boolean checkCost(float cost) {
        return String.valueOf(cost).matches(REXFLOAT) && cost > 0;
    }

    public static boolean checkMaxNumberOfPerson(byte number) {
        return String.valueOf(number).matches(REXINTERGER) && number > 0 && number <= 20;
    }

    public static boolean checkNumberOfFloor(byte number) {
        return String.valueOf(number).matches(REXINTERGER) && number > 0;
    }

    public static boolean checkServiceIncluded(String serviceIncluded) {
        return (serviceIncluded.equals(massage) || serviceIncluded.equals(karaoke) || serviceIncluded.equals(drink) ||
                serviceIncluded.equals(food) || serviceIncluded.equals(car));
    }
}
