package com.eventoapp.repository;

import com.eventoapp.model.Evento;
import org.springframework.data.repository.CrudRepository;

public interface EventoRepository extends CrudRepository <Evento, String> {

}
