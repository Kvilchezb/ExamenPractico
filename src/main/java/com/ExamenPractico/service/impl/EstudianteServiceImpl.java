package com.ExamenPractico.service.impl;

import com.ExamenPractico.domain.Estudiante;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.ExamenPractico.dao.EstudianteDao;
import com.ExamenPractico.service.EstudianteService;

@Service
public class EstudianteServiceImpl implements EstudianteService {
    
    @Autowired
    private EstudianteDao estudianteDao;

    @Override
    @Transactional(readOnly=true)
    public List<Estudiante> getEstudiantes() {        
        return estudianteDao.findAll();
    }

    @Override
    @Transactional(readOnly=true)
    public Estudiante getEstudiante(Estudiante estudiante) {
        return estudianteDao.findById(estudiante.getIdEstudiante()).orElse(null);
    }

    @Override
    @Transactional
    public void save(Estudiante estudiante) {
        estudianteDao.save(estudiante);
    }

    @Override
    @Transactional
    public void delete(Estudiante estudiante) {
        estudianteDao.delete(estudiante);
    }
    
    
    
}
