package br.com.brunoedubems.agendadortarefas.business.mapper;

import br.com.brunoedubems.agendadortarefas.business.dto.TarefasDTO;
import br.com.brunoedubems.agendadortarefas.infrastructure.entity.TarefasEntity;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface TarefasConverter {

    TarefasEntity paraTarefaEntity(TarefasDTO dto);

    TarefasDTO paraTarefaDTO(TarefasEntity entity);

    List<TarefasEntity> paraListaTarefasEntity(List<TarefasDTO> dto);

    List<TarefasDTO> paraListaTarefasDTO(List<TarefasEntity> entity);
}
