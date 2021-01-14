package com.spring.series.repository;

import com.spring.series.model.SeriesVistas;
import org.springframework.data.jpa.repository.JpaRepository;

//acesso a metodo a métodos prontos, findAll, FindById, save, delete
public interface SeriesVistasRepository extends JpaRepository<SeriesVistas, Long> {

}
