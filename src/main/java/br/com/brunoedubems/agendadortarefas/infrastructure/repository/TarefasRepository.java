package br.com.brunoedubems.agendadortarefas.infrastructure.repository;

import br.com.brunoedubems.agendadortarefas.infrastructure.entity.TarefasEntity;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface TarefasRepository extends MongoRepository<TarefasEntity, String> {

}
