package com.davsalhe.crudrest.com.davsalhe.controller;

import com.davsalhe.crudrest.com.davsalhe.model.Persona;
import com.davsalhe.crudrest.com.davsalhe.repo.IPersonaRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class UController {

    @Autowired
    private IPersonaRepo repoPer;

    @GetMapping("/welcome")
    public String greeting(@RequestParam(name = "name", required = false, defaultValue = "World") String name, Model model) {
        Persona per = new Persona();
        per.setId(1);
        per.setNombre("David");
        per.setApellido("Saldarriaga");
        per.setEdad(23);
        repoPer.save(per);
        model.addAttribute("name", name);
        return "welcome";
    }

    @GetMapping("/listar")
    public String greeting(Model model) {
        model.addAttribute("personas", repoPer.findAll());
        return "welcome";
    }
}
