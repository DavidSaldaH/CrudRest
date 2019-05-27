package com.davsalhe.crudrest.com.davsalhe.repo;

import com.davsalhe.crudrest.com.davsalhe.model.Persona;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IPersonaRepo extends JpaRepository<Persona, Integer> {
    
}
