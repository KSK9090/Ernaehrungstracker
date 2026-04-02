package ernährungstracker;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;

public class Essen2 {
    public static void main(String[] args) throws IOException {

    boolean schleife = true;

    while (schleife) {
        System.out.println("Was knusperst du?: ");
        Scanner sc = new Scanner(System.in);
        String knusper = sc.nextLine();
    
        knusper = "100g " + knusper;
        String api = "https://api.edamam.com/api/nutrition-data?app_id=83c4adbb&app_key=c1cd4ed3de78d43b6de8acd5e5abf1f7&ingr=" +
        knusper.replace(" ", "%20");
    
    //System.out.println(api);

    URL url = new URL(api);
    HttpURLConnection conn = (HttpURLConnection) url.openConnection();
    conn.setRequestMethod("GET");

    BufferedReader read = new BufferedReader(
    new InputStreamReader(conn.getInputStream())
    );

    FileWriter fw = new FileWriter("ernährungstracker/taeglich2.txt", true);

    String apiSingle;
    String apiAntwort = "";

    while ((apiSingle = read.readLine()) != null) {
        apiAntwort += apiSingle;

        int start = apiAntwort.indexOf("ENERC_KCAL");
        //System.out.println(apiAntwort.indexOf("ENERC_KCAL"));

        
        
        int index = apiAntwort.indexOf("\"quantity\":", start);
        //System.out.println(index);


        int kalStart = index + 11;
        int kalEnde = apiAntwort.indexOf(",", kalStart);

        String kal = apiAntwort.substring(kalStart, kalEnde);
        double kalWert = Double.parseDouble(kal);

        System.out.printf("%.2f Kalorien pro 100g\n", kalWert);


        fw.write(knusper + " " + String.format("%.2f", kalWert) + " kcal\n");

    
    }

fw.close();
read.close();



    




}






    // Filewriter kommt nach API ergebnis erst mit rein, quasi variable essen (knusper) + API response ____FileWriter fw = new FileWriter("ernährungstracker/taeglich2.txt", true);


    }
}




