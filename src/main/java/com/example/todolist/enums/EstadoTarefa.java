package com.example.todolist.enums;

public enum EstadoTarefa {

    EM_ANDAMENTO("Em andamento"),
    FEITO ("Feito");

    private String descricao;

    EstadoTarefa(String descricao){
        this.descricao = descricao;
    }

    public String getDescricao(){
        return this.descricao;
    }

    

}
