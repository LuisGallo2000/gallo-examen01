package com.gallo.examen01.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.gallo.examen01.entity.Evento;
import com.gallo.examen01.exception.NoDataFoundException;
import com.gallo.examen01.repository.EventoRepository;
import com.gallo.examen01.service.EventoService;

@Service
public class EventoServiceImpl implements EventoService {
	@Autowired
	private EventoRepository repository;

	@Override
	@Transactional(readOnly = true)
	public List<Evento> findAll() {
		return repository.findAll();
	}

	@Override
	@Transactional(readOnly = true)
	public Evento findById(int id) {
		return repository.findById(id)
				.orElseThrow(() -> new NoDataFoundException("No existe un evento con ese ID"));
	}

	@Override
	@Transactional
	public Evento save(Evento evento) {
		return repository.save(evento);
	}

	@Override
	@Transactional
	public void delete(int id) {
		Evento evento = repository.findById(id)
				.orElseThrow(() -> new NoDataFoundException("No existe un evento con ese ID"));
		repository.delete(evento);
	}
}
