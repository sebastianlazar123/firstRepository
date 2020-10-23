package ex6;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.charset.StandardCharsets;


public class Main {

    public static void main( String args[] ) {
        // String to be scanned to find the pattern.
        //Path filePath = Paths.get(args[0]);
        //String line = Files.readString(filePath, StandardCharsets.US_ASCII);
       String line = "sebi@gmail.com gaga@gmail.com \n gagasfj@yahoo.com \n sasha@icloud.ro babusca ";
       String pattern = "^([\\w-\\.]+){1,64}@([\\w&&[^_]]+){2,255}.[a-z]{2,}$";
        // Create a Pattern object
        String[] array= line.split("\\s+");
        Pattern r = Pattern.compile(pattern);
        for (String element: array) {
        Matcher m = r.matcher(element);
        if (m.find( )) {
            System.out.println("Found user: " + m.group(0) );
        }else {
            System.out.println("No match for");
            System.out.println(element);
        }



           //System.out.println(element);
        }
    }
}
