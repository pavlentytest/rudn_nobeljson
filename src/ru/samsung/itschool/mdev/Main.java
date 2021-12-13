package ru.samsung.itschool.mdev;

import com.google.gson.Gson;
import ru.samsung.itschool.mdev.model.Category;
import ru.samsung.itschool.mdev.model.Laureate;
import ru.samsung.itschool.mdev.model.Nobel;
import ru.samsung.itschool.mdev.model.NobelPrize;

import javax.net.ssl.HttpsURLConnection;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        /*
           https://api.nobelprize.org/2.1/nobelPrizes?
           nobelPrizeYear=2000
           &
           yearTo=2021
           &
           nobelPrizeCategory=phy
         */

           String baseUrl = "https://api.nobelprize.org/2.1/nobelPrizes";
           int nobelPrizeYear = 2000;
           int yearTo = 2021;
           String nobelPrizeCategory = "phy";
           String url = baseUrl + "?nobelPrizeYear="+nobelPrizeYear+
                        "&yearTo="+yearTo+"&nobelPrizeCategory="+nobelPrizeCategory;

           HttpsURLConnection connection;
           URL u = new URL(url);
           connection = (HttpsURLConnection) u.openConnection();
           connection.setConnectTimeout(10000);
           connection.connect();

           int status = connection.getResponseCode();
           System.out.println(status);

           ArrayList<String> lines = new ArrayList<>();

           if(status == 200) {
                  Scanner scan = new Scanner(connection.getInputStream());
                  while(scan.hasNext()) {
                         lines.add(scan.nextLine());
                  }
           }

           String savePath = "C:\\Users\\Pavel\\IdeaProjects\\untitled169\\result.txt";
           Path path = Path.of(savePath);
           //Files.createFile(path);
           Files.write(path,lines);

           // https://www.jsonschema2pojo.org/

           List<String> readlines = Files.readAllLines(path);
           StringBuilder stringBuilder = new StringBuilder();
           for(int i=0;i<readlines.size();i++) {
                  stringBuilder.append(readlines.get(i));
           }
           Gson gson = new Gson();
           Nobel nobel = gson.fromJson(stringBuilder.toString(), Nobel.class);

           System.out.println(nobel.getNobelPrizes().get(0).getLaureates().get(0).getKnownName().getEn());
           //System.out.println(nobel.getNobelPrizes().get(0).getLaureates().get(0).));






    }
}
