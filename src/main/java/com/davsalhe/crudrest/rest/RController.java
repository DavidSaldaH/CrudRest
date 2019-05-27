package com.davsalhe.crudrest.rest;


import com.davsalhe.crudrest.com.davsalhe.model.Persona;
import com.davsalhe.crudrest.com.davsalhe.repo.IPersonaRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/personas")
public class RController {

    @Autowired
    private IPersonaRepo repoPer;

    @GetMapping
    public List<Persona> listar() {
        return repoPer.findAll();
    }

    @PostMapping
    public void crear(@RequestBody Persona per) {
        repoPer.save(per);
    }

    @PutMapping
    public void editar(@RequestBody Persona per) {
        repoPer.save(per);
    }

    @DeleteMapping(value = "/{id}")
    public void retirar(@PathVariable("id") Integer id) {
        repoPer.deleteById(id);
    }
}
