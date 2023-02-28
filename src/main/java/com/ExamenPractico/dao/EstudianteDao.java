package com.ExamenPractico.dao;

import com.ExamenPractico.domain.Estudiante;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EstudianteDao extends JpaRepository <Estudiante,Long> {
    
}
