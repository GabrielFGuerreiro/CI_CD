package br.fatecrl.DemoMVC.controllers;

import java.util.ArrayList;
import java.util.List;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import br.fatecrl.DemoMVC.Models.Sorveteria;

@Controller
@RequestMapping("sorveteria")
public class SorveteriaController
{
    private static final List<Sorveteria> sorveteria = new ArrayList<Sorveteria>();

    public SorveteriaController()
    {
        sorveteria.add(new Sorveteria("picolé", "chocolate", 2.10f));
        sorveteria.add(new Sorveteria("pote", "flocos", 16.50f));
        sorveteria.add(new Sorveteria("casquinha", "baunilha", 2.50f));
    }

    @GetMapping
    public String getSorveteria(Model model)
    {
        model.addAttribute("sorveteria", sorveteria);
        return "sorveteria";
    }
}
