
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Locale;
import java.util.Properties;

public class Translator {
    private static Properties properties = new Properties();

    public static String translate(String key) {

        // System.out.println("messages_" + Locale.getDefault().getLanguage() + "_" + Locale.getDefault().getCountry() + ".properties");

        try {
            properties.load(new FileInputStream("messages_" + Locale.getDefault().getLanguage() + "_" + Locale.getDefault().getCountry() + ".properties"));
        } catch (IOException e) {

            System.out.println("No messages found for " + Locale.getDefault().getLanguage() + "_" + Locale.getDefault().getCountry());


        }



        return properties.getProperty(key);
    }
}
