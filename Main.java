
import java.util.Scanner;
import java.util.Locale;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // get the language

        System.out.println("Enter the language");
        System.out.println("Available languages: are 1. English 2. Hindi ");

        // now ask in the language hindi
        System.out.println("भाषा दर्ज करें");
        System.out.println("उपलब्ध भाषाएं हैं 1. अंग्रेज़ी 2. हिंदी");


        // take int input from user
        int language = scanner.nextInt();

        // set the language
        if (language == 1) {
            Locale.setDefault(new Locale("en", "US"));
        } else if (language == 2) {
            Locale.setDefault(new Locale("hi", "IN"));
        } else {
            System.out.println("Invalid language");
        }

        scanner.nextLine();

        System.out.println(Translator.translate("ask_name"));
        String name = scanner.nextLine();
        System.out.println(Translator.translate("ask_id"));
        String id = scanner.nextLine();
        System.out.println(Translator.translate("ask_salary"));
        int salary = scanner.nextInt();
        Employee employee = new Employee(name, id, salary);
        System.out.println(Translator.translate("name") + ": " + employee.getName());
        System.out.println(Translator.translate("id") + ": " + employee.getId());
        System.out.println(Translator.translate("basic_salary") + ": " + employee.getBasicSalary());
        System.out.println(Translator.translate("hra") + ": " + employee.getHra());
        System.out.println(Translator.translate("da") + ": " + employee.getDa());
        System.out.println(Translator.translate("ta") + ": " + employee.getTa());
        System.out.println(Translator.translate("tax") + ": " + employee.getTax());
        System.out.println(Translator.translate("pf") + ": " + employee.getPf());
        System.out.println(Translator.translate("gross_salary") + ": " + employee.getGrossSalary());
        System.out.println(Translator.translate("net_salary") + ": " + employee.getNetSalary());
    }
}
