package com.example.todolist.models;

import java.time.LocalDate;
import java.util.UUID;

import com.example.todolist.enums.EstadoTarefa;

public class Tarefa {

    private UUID id;
    private String tarefa;
    private EstadoTarefa estado;
    private LocalDate dataLimite;

    public Tarefa(String tarefa, LocalDate dataLimite){
        this.id = UUID.randomUUID();
        this.tarefa = tarefa;
        this.estado = EstadoTarefa.EM_ANDAMENTO;
        this.dataLimite = dataLimite;
    }
    
    public UUID getId() {
        return id;
    }
    public void setId(UUID id) {
        this.id = id;
    }
    public String getTarefa() {
        return tarefa;
    }
    public void setTarefa(String tarefa) {
        this.tarefa = tarefa;
    }
    public EstadoTarefa getEstado() {
        return estado;
    }
    public void setEstado(EstadoTarefa estado) {
        this.estado = estado;
    }
    public LocalDate getDataLimite() {
        return dataLimite;
    }
    public void setDataLimite(LocalDate dataLimite) {
        this.dataLimite = dataLimite;
    }

    @Override
    public String toString() {
        return this.getTarefa();
    }

}
