package model;

import Dao.DaoConnectionImp;

import java.util.ArrayList;
import java.util.List;

public class Lager {
    private int id;
    private List<Medikament> medikament=new ArrayList<>();


    public Lager(){

    }
    public Lager(int id, List<Medikament> medikament){
        this.id=id;
        this.medikament=medikament;
    }



    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public List<Medikament> getMedikament() {
        return medikament;
    }

    public void setMedikament(List<Medikament> medikament) {
        this.medikament = medikament;
    }


}



/*
 public void addMedikament(Medikament medikament){
        this.medikament.add(medikament);
        int id= this.medikament.get(0).getId();
        int stücke=this.medikament.get(0).getStueckzahl();
        int referenzProdukt= this.medikament.get(0).getPharmazentralnummer();
        insertion(referenzProdukt,stücke);

    }

    public void aufstocken (List <Medikament> medikament){
          this.medikament.addAll(medikament);
        for (int i=0; i< this.medikament.size();i++) {
            int stücke = this.medikament.get(i).getStueckzahl();
            int referenzProdukt = this.medikament.get(i).getPharmazentralnummer();
            erhoehen(referenzProdukt, stücke);
        }


    }
    public void verkaufen(List <Medikament> medikament){
        this.medikament.addAll(medikament);
        for (int i=0; i< this.medikament.size();i++) {
            int id= this.medikament.get(i).getId();
            int stücke = this.medikament.get(i).getStueckzahl();
            int referenzProdukt = this.medikament.get(i).getPharmazentralnummer();
            reduktieren(id,referenzProdukt, stücke);
        }

    }
 */

