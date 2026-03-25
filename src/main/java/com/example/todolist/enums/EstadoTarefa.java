package com.example.todolist.enums;

public enum EstadoTarefa {

    EM_ANDAMENTO("Em andamento"),
    FEITO ("Feito");

    private String descricao;

    private EstadoTarefa(String descricao){
        this.descricao = descricao;
    }

    public String getDescricao(){
        return this.descricao;
    }



}
