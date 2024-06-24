package br.fatecrl.DemoMVC.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.fatecrl.DemoMVC.Models.Sorveteria;

@RestController
@RequestMapping("/api/sorveteria")
public class SorveteriaAPIController
{
    private static final List<Sorveteria> sorveteria = new ArrayList<Sorveteria>();

    public SorveteriaAPIController()
    {
        sorveteria.add(new Sorveteria("picolé", "chocolate", 2.10f));
        sorveteria.add(new Sorveteria("pote", "flocos", 16.50f));
        sorveteria.add(new Sorveteria("casquinha", "baunilha", 2.50f));
    }

    @GetMapping
    public List<Sorveteria> getSorveteria()
    {
         return sorveteria;
    }
}
