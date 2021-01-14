package com.spring.series.service.serviceimpl;

import com.spring.series.model.SeriesVistas;
import com.spring.series.repository.SeriesVistasRepository;
import com.spring.series.service.SeriesVistasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SeriesVistasServiceImpl implements SeriesVistasService {

    //ponto de injeção do repository para usar as instancias do repository
    @Autowired
    SeriesVistasRepository seriesVistasRepository;

    @Override
    public List<SeriesVistas> findAll() {
        return seriesVistasRepository.findAll();
    }

    @Override
    public SeriesVistas findById(Long id) {
        return seriesVistasRepository.findById(id).get(); //como o findById retorna um Optional, .get() é para retornar SeriesVistas
    }

    @Override
    public SeriesVistas save(SeriesVistas seriesVistas) {
        return seriesVistasRepository.save(seriesVistas);
    }

    @Override
    public void delete(SeriesVistas vistas) {
        seriesVistasRepository.delete(vistas);

    }
}
