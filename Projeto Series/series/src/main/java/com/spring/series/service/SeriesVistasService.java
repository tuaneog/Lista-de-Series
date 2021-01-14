package com.spring.series.service;

import com.spring.series.model.SeriesVistas;

import java.util.List;

public interface SeriesVistasService {

    List<SeriesVistas> findAll();
    SeriesVistas findById(Long id);
    SeriesVistas save(SeriesVistas seriesVistas);
    void delete(SeriesVistas vistas);
}
