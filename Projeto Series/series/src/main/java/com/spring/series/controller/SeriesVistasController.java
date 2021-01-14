package com.spring.series.controller;

import com.spring.series.model.SeriesVistas;
import com.spring.series.service.SeriesVistasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller //recebe a requisições dos clientes
public class SeriesVistasController {

    @Autowired
    SeriesVistasService seriesVistasService;

    @GetMapping(value = "/seriesvistas")
    public ModelAndView getSeriesVistas(){
        ModelAndView mv = new ModelAndView("seriesvistas");
        List<SeriesVistas> seriesVistas = seriesVistasService.findAll();
        mv.addObject("seriesvistas", seriesVistas);
        return mv;
    }



}
