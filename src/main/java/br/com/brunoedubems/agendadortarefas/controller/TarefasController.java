package br.com.brunoedubems.agendadortarefas.controller;

import br.com.brunoedubems.agendadortarefas.business.TarefasService;
import br.com.brunoedubems.agendadortarefas.business.dto.TarefasDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/tarefas")
@RequiredArgsConstructor
public class TarefasController {

    private final TarefasService tarefasService;

    @PostMapping
    public ResponseEntity<TarefasDTO> gravarTarefas(@RequestHeader("Authorization") String token, @RequestBody TarefasDTO dto) {
        return ResponseEntity.ok(tarefasService.gravarTarefa(token, dto));
    }

}
