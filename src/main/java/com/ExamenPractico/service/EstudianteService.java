package com.ExamenPractico.service;

import com.ExamenPractico.domain.Estudiante;
import java.util.List;

public interface EstudianteService {
    
    // Se obtiene un listado de clientes en un List
    public List<Estudiante> getEstudiantes();
    
    // Se obtiene un Estudiante, a partir del id de un estudiante
    public Estudiante getEstudiante(Estudiante estudiante);
    
    // Se inserta un nuevo estudiante si el id del estudiante esta vacío
    // Se actualiza un estudiante si el id del estudiante NO esta vacío
    public void save(Estudiante estudiante);
    
    // Se elimina el estudiante que tiene el id pasado por parámetro
    public void delete(Estudiante estudiante);
    
}
