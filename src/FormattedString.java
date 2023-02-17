import java.util.Scanner;

public class FormattedString {
    public static void main(String[] args) {
        String name = "Aryaman";
        String intro = "My name is Aryaman Bhavsar. I live in Indore";
        String city = "Indore";
        int age = 21;

        String formatted = String.format("My name is %s. I live in %s. My age is %d",name,city,age);

        System.out.println(formatted);

        System.out.println(name.length());

        System.out.println(name.isEmpty());

        System.out.println(name.toUpperCase());

        System.out.println(name.equals(city));
        System.out.println(name.equalsIgnoreCase(city));

        System.out.println(intro.replace("Indore","Pune"));

        System.out.println(intro.contains("Indore"));

        Scanner sc = new Scanner(System.in);
        System.out.println("Write your company name::");

        String CompanyName = sc.next();

        System.out.printf("You work in %s!!, Great!!",CompanyName);
    }
}
