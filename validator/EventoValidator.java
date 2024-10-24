package com.gallo.examen01.validator;

import com.gallo.examen01.entity.Evento;
import com.gallo.examen01.exception.ValidateException;

public class EventoValidator {

	public static void save(Evento evento) {
		if (evento.getNombre() == null || evento.getNombre().trim().isEmpty()) {
			throw new ValidateException("El nombre es requerido");
		}
		if (evento.getDescripcion() == null || evento.getDescripcion().trim().isEmpty()) {
			throw new ValidateException("La descripción es requerida");
		}
		if (evento.getCosto() == null || evento.getCosto() < 0) {
			throw new ValidateException("El costo debe ser mayor o igual a 0");
		}
	}
}
