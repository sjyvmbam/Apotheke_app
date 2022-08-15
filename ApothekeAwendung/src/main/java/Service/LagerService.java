package Service;

import model.Medikament;

import java.util.List;

public interface LagerService {


    String addMedikament(Medikament medikament);

    String verkaufenMedikament(Medikament medikament);

    void erstellenFileToCsv();

    List<Medikament> findAllMedikament();

    void erstellungPdf();
    String aufstocken(Medikament medikamentList);

}
