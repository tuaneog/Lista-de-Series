package com.spring.series.utils;

import com.spring.series.model.SeriesVistas;
import com.spring.series.repository.SeriesVistasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Component
public class DummyData {

    @Autowired
    SeriesVistasRepository seriesVistasRepository;

    //tudo que é posto nesse método vai ser executado conforme a aplicação for subindo
    //@PostConstruct
    public void saveSeriesVistas(){

        List<SeriesVistas> seriesVistasList = new ArrayList<>();
        SeriesVistas seriesVistas1 = new SeriesVistas();
        seriesVistas1.setNome("Something in the Rain");
        seriesVistas1.setResenha("teste teste teste");
        seriesVistas1.setPais("Coreia");

        SeriesVistas seriesVistas2 = new SeriesVistas();
        seriesVistas2.setNome("Flower of Evil");
        seriesVistas2.setResenha("teste teste teste");
        seriesVistas2.setPais("Coreia");

        SeriesVistas seriesVistas3 = new SeriesVistas();
        seriesVistas3.setNome("Before you get married");
        seriesVistas3.setResenha("teste teste teste");
        seriesVistas3.setPais("Taiwan");

        seriesVistasList.add(seriesVistas1);
        seriesVistasList.add(seriesVistas2);
        seriesVistasList.add(seriesVistas3);

        for(SeriesVistas seriesVistas: seriesVistasList){
            SeriesVistas serieVistasSaved = seriesVistasRepository.save(seriesVistas);
            System.out.println(serieVistasSaved.getId());
        }


    }
}
