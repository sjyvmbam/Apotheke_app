import Dao.DaoConnectionImp;
import Service.LagerServiceImp;
import Service.LagerService;
import com.google.gson.Gson;
import model.Medikament;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class LagerApp {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Willkommen in  der App");
        System.out.println("wollen Sie Den App starten? yes or no");
        String anwort= scanner.nextLine();

        while(anwort.equals("yes") || anwort.equals("YES")){
            new DaoConnectionImp().createTable();
            LagerService lagerService = new LagerServiceImp();
            List<Medikament>medikaments=lagerService.findAllMedikament();
            Gson json=new Gson();
            String jsonData= json.toJson(medikaments);
            System.out.println(jsonData);
            System.out.println(lagerService.addMedikament(new Medikament("ibuprofen",0023434,120)));
            //System.out.println(lagerService.verkaufenMedikament(new Medikament(1,7423434,200)));
            //System.out.println(lagerService.aufstocken(new Medikament(1,7423434,50)));

            System.out.println("continue?");
            anwort= scanner.nextLine();
        }
        System.out.println("aufwiedersehen bis nächste mal ");



        //getConnection();
        //createTable();
        //insertInTAble();
       // new DaoConnection().createTable();
        //new LagerService().AllTrainingLaden();
        //new LagerService().addMikament();
        //new LagerService().verkaufen();
       // new LagerService().erhoehenStück();
      //  new LagerService().erstellenFileToCsv();
       //new DaoConnection().insertInTAble();

    }






}