package com.ingesoft.PC.Servicio;

import com.ingesoft.PC.Modelo.Pensamiento;
import com.ingesoft.PC.Repositorio.PensamientoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PensamientoService{
    private final PensamientoRepository pensamientoRepository;

    public PensamientoService(PensamientoRepository pensamientoRepository) {
        this.pensamientoRepository = pensamientoRepository;
    }

    public List<Pensamiento> obtenerTodosPensamientos() {
        return pensamientoRepository.findAll();
    }

    public Pensamiento guardarPensamiento(Pensamiento pensamiento) {
        return pensamientoRepository.save(pensamiento);
    }

    public Pensamiento darMeGusta(Long id) {
        Pensamiento pensamiento = pensamientoRepository.findById(id).orElseThrow();
        pensamiento.setMeGusta(pensamiento.getMeGusta() + 1);
        return pensamientoRepository.save(pensamiento);
    }
}
