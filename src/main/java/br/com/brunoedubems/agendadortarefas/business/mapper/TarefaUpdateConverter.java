package br.com.brunoedubems.agendadortarefas.business.mapper;

import br.com.brunoedubems.agendadortarefas.business.dto.TarefasDTO;
import br.com.brunoedubems.agendadortarefas.infrastructure.entity.TarefasEntity;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.NullValuePropertyMappingStrategy;

@Mapper(componentModel = "spring", nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
public interface TarefaUpdateConverter {

    void updateTarefas(TarefasDTO tarefasDTO, @MappingTarget TarefasEntity tarefasEntity);

}
