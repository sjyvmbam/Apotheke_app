package Service;

import Dao.DaoConnection;
import Dao.DaoConnectionImp;
import model.Medikament;

import java.util.ArrayList;
import java.util.List;

public class LagerServiceImp implements LagerService {
    private DaoConnection repository = new DaoConnectionImp();


    @Override
    public String addMedikament(Medikament medikament) {
        List<Medikament> medikaments= repository.findAll();
        for(int i=0; i<medikaments.size();i++){
            if(medikaments.get(i).getPharmazentralnummer()==medikament.getPharmazentralnummer()){
                return "medikament existiert schon";
            }
        }
        repository.addNewMedikament(medikament);
        return "medikament wurde hinzugefuegt.";

    }

    @Override
    public String verkaufenMedikament(Medikament medikament) {
        Medikament medikamentList= repository.findOne(medikament.getPharmazentralnummer());

            if(medikamentList.getPharmazentralnummer()== medikament.getPharmazentralnummer() &&
                    medikamentList.getStueckzahl()>0 && medikament.getStueckzahl()<=medikamentList.getStueckzahl()) {
                repository.reduktieren(medikament);
                return "Danke fuer Ihr Einkauf";
            }
            return "Danke Medikament wurde ausverkauft oder haben wir es nicht";
    }

    public void erstellenFileToCsv(){
        repository.erstellenCsv();
    }

    public void erstellungPdf(){
        repository.erstellenPdf();
    }

    @Override
    public String aufstocken(Medikament medikament){
        List<Medikament>medikamentList= repository.findAll();
        try {
            for (int i = 0; i < medikamentList.size(); i++) {
                if (medikamentList.get(i).getPharmazentralnummer() == medikament.getPharmazentralnummer()) {
                    repository.erhoehen(medikament);
                    return "Die stueck wurde erfolgreich erhoeht";
                }
            }
        }catch(Exception e){
            System.err.println(e);
        }
        return "Medikament ist nicht in unserer Lager";
    }
    @Override
    public List<Medikament> findAllMedikament(){
        List<Medikament>medikaments=new ArrayList<>();
        try{
            medikaments= repository.findAll();
        }catch(Exception e){
            System.err.println(e);
        }
        return medikaments;    }

}

















