package CaseStudy_FuramaResort.Commons;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DataInput {
    static Scanner input;
    private static Pattern DATE_PATTERN = Pattern.compile(
            "^(29/02/(2000|2400|2800|(19|2[0-9](0[48]|[2468][048]|[13579][26]))))$" +
                    "|^((0[1-9]|1[0-9]|2[0-8])/02/((19|2[0-9])[0-9]{2}))$" +
                    "|^((0[1-9]|[12][0-9]|3[01])/(0[13578]|10|12)/((19|2[0-9])[0-9]{2}))$" +
                    "|^((0[1-9]|[12][0-9]|30)/(0[469]|11)/((19|2[0-9])[0-9]{2}))$");
    private static final String REXEMAIL = "^([\\w-\\.]+){1,64}@([\\w&&[^_]]+){2,255}.[a-z]{2,}$";
    private static final String REXNAME = "([\\p{Lu}]|([\\p{Lu}][\\p{Ll}]{1,8}))(\\s([\\p{Lu}]|[\\p{Lu}][\\p{Ll}]{1,10})){0,5}$";

    public static boolean checkEmail(String email) {
        return email.matches(REXEMAIL);
    }

    /**
     * check birthday
     *
     * @param birthday
     * @return
     */
    public static boolean checkBirthday(String birthday) {
        return DATE_PATTERN.matcher(birthday).matches();
    }

    /**
     * check ten
     *
     * @param name
     * @return
     */
    public static boolean checkName(String name) {
        return name.matches(REXNAME);
    }

    // check so thuc
    public static Float checkFloat(String content, String error) {
        while (true) {
            try {
                input = new Scanner(System.in);
                System.out.println(content);
                return input.nextFloat();
            } catch (Exception ex) {
                System.out.println(error);
            }
        }
    }
    public static int checkInteger(String content, String error) {
        while (true) {
            try {
                input = new Scanner(System.in);
                System.out.println(content);
                return input.nextInt();
            } catch (Exception ex) {
                System.out.println(error);
            }
        }
    }

    public static boolean checkServiceIncluded(String serviceIncluded) {
        String car = "Car";
        String food = "Food";
        String drink = "Drink";
        String karaoke = "Karaoke";
        String massage = "Massage";
        return (serviceIncluded.equals(massage) || serviceIncluded.equals(karaoke) || serviceIncluded.equals(drink) ||
                serviceIncluded.equals(food) || serviceIncluded.equals(car));
    }

    /**
     * chuan hoa du lieu
     *
     * @param name
     * @return
     */
    public static String validString(String name) {
        String result = "";
        name = name.toLowerCase().trim().replaceAll("\\s+", " ");
        for (int i = 0; i < name.length(); i++) {
            if (i == 0 || String.valueOf(name.charAt(i - 1)).equals(" ")) {
                result += String.valueOf(name.charAt(i)).toUpperCase();
                continue;
            }
            result += name.charAt(i);
        }
        return result;
    }
}

