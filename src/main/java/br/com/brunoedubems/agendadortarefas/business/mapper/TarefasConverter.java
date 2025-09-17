package br.com.brunoedubems.agendadortarefas.business.mapper;

import br.com.brunoedubems.agendadortarefas.business.dto.TarefasDTO;
import br.com.brunoedubems.agendadortarefas.infrastructure.entity.TarefasEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface TarefasConverter {

    TarefasEntity paraTarefaEntity(TarefasDTO dto);

    TarefasDTO paraTarefaDTO(TarefasEntity entity);
}
