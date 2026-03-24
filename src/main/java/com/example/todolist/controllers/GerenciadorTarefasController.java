package com.example.todolist.controllers;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.todolist.models.Tarefa;

@Controller
@RequestMapping({"", "/"})
public class GerenciadorTarefasController {

    private List<Tarefa> listaTarefas = new ArrayList<>();

    public GerenciadorTarefasController(){
        // Tarefa t1 = new Tarefa("Ler um bom livro", LocalDate.now());
        // listaTarefas.add(t1);

        // Tarefa t2 = new Tarefa("Levar o cachorro para passear", LocalDate.now());
        // listaTarefas.add(t2);

        // Tarefa t3 = new Tarefa("Marcar dentista", LocalDate.now());
        // listaTarefas.add(t3);
    }

    @GetMapping
    public String todos(Model model){

        model.addAttribute("todoList", listaTarefas);

        return "todo_list";

    }

    @PostMapping("/add")
    public String add(Tarefa tarefa){


        this.listaTarefas.add(tarefa);

        return "redirect:/";

    }

}
