
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Locale;
import java.util.Properties;

public class Translator {
    private static Properties properties = new Properties();

    public static String translate(String key) {

        try {
            properties.load(new FileInputStream("messages_" + Locale.getDefault().getLanguage() + "_" + Locale.getDefault().getCountry() + ".properties"));
        } catch (IOException e) {

            System.out.print("");


        }

        try {
                        properties.load(new FileInputStream("messages_en_US.properties"));
        } catch (IOException e) {

            // pass
            System.out.println("No messages found for en_US");
        }



        return properties.getProperty(key);
    }
}
