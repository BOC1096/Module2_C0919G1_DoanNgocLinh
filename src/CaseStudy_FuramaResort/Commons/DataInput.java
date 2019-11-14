package CaseStudy_FuramaResort.Commons;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;
import java.util.regex.Pattern;

public class DataInput {
    static Scanner input;
    //regular ngay thang nam dd/mm/yyyy( co tinh so ngay thang 2 theo nam nhuan)
    private static Pattern DATE_PATTERN = Pattern.compile(
            "^(29/02/(2000|2400|2800|(19|2[0-9](0[48]|[2468][048]|[13579][26]))))$" +
                    "|^((0[1-9]|1[0-9]|2[0-8])/02/((19|2[0-9])[0-9]{2}))$" +
                    "|^((0[1-9]|[12][0-9]|3[01])/(0[13578]|10|12)/((19|2[0-9])[0-9]{2}))$" +
                    "|^((0[1-9]|[12][0-9]|30)/(0[469]|11)/((19|2[0-9])[0-9]{2}))$");
    // regular email theo dinh dang  abc123@abc123.abc
    private static final String REXEMAIL = "^([\\w-\\.]+){1,64}@([\\w&&[^_]]+){2,255}.[a-z]{2,}$";
    // regular ten nhap vao: Aaaa Bbbb [\p{Lu}]|
    private static final String REXNAME = "([\\p{Lu}][\\p{Ll}]{1,8})(\\s([\\p{Lu}]|[\\p{Lu}][\\p{Ll}]{1,10})){0,5}$";

    public static boolean checkEmail(String email) {
        return email.matches(REXEMAIL);
    }


    public static boolean checkBirthday(String birthday) {
        return DATE_PATTERN.matcher(birthday).matches();
    }

    // kiem tra chuoi nhap vao
    public static boolean checkName(String name) {
        return name.matches(REXNAME);
    }

    // bat nguoi dung nhap vao so thuc
    public static Float checkFloat(String content, String error) {
        while (true) {
            try {
                input = new Scanner(System.in);
                System.out.print(content);
                return input.nextFloat();
            } catch (Exception ex) {
                System.out.print(error);
            }
        }
    }

    // ham bat nguoi dung nhap vao so nguyen
    public static int checkInteger(String content, String error) {
        while (true) {
            try {
                input = new Scanner(System.in);
                System.out.print(content);
                return input.nextInt();
            } catch (Exception ex) {
                System.out.print(error);
            }
        }
    }

    // nhap dich vu di kem theo quy dinh
    public static boolean checkServiceIncluded(String serviceIncluded) {
        return (serviceIncluded.equals("Food") || serviceIncluded.equals("Karaoke") || serviceIncluded.equals("Drink") ||
                serviceIncluded.equals("Massage") || serviceIncluded.equals("Car"));
    }

    // chuan  hoa du lieu nhap vao theo dang  Aaaa Bbb
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

    public static String validateNameCustomer() {
        while (true) {
            try {
                input = new Scanner(System.in);
                System.out.println("Enter name Customer: ");
                String name = input.nextLine();
                if (!name.matches(REXNAME)) {
                    throw new IncorrectNameException("Name invalid, please try again");
                }
                return name;
            } catch (IncorrectNameException ex) {
                System.out.println(ex);
            }
        }
    }

    public static String validateBirthday() {
        while (true) {
            try {
                input = new Scanner(System.in);
                System.out.println("Enter Birthday (dd/mm/yyyy): ");
                String birthday = input.nextLine();
                if (!DATE_PATTERN.matcher(birthday).matches()) {
                    throw new BirthdayFormatException("Format Birthday invalid!! Please Try again");
                }
                String[] birthdayArray = birthday.split("/");
                int year = Integer.parseInt(birthdayArray[2]);
                int month = Integer.parseInt(birthdayArray[1]);
                int day = Integer.parseInt(birthdayArray[0]);
                LocalDate birthdate = LocalDate.of(year, month, day);
                LocalDate now = LocalDate.now();
                long age = Period.between(birthdate, now).getYears();
                if (age < 18 || age > 125) {
                    throw new IncorrectBirthdayException("Incorrect Birthday Age >= 18!! Please Try again");
                }
                return birthday;
            } catch (BirthdayFormatException | IncorrectBirthdayException ex) {
                System.out.println(ex);
            }
        }
    }
}