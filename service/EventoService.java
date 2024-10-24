package com.gallo.examen01.service;

import com.gallo.examen01.entity.Evento;
import java.util.List;

public interface EventoService {
	public List<Evento> findAll();
	public Evento findById(int id);
	public Evento save(Evento evento);
	public void delete(int id);
}
