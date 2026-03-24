package com.example.todolist.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping({"", "/"})
public class TodoListController {

    @GetMapping
    public String todos(Model model){

        List<String> todoList = new ArrayList<>();

        todoList.add("Ler um bom livro");
        todoList.add("Levar o cachorro para passear");
        todoList.add("Marcar dentista");

        model.addAttribute("todoList", todoList);

        return "todo_list";

    }

    @PostMapping("/add")
    public String add(){

        System.out.println("método add invocado");


        return "";

    }
    


}
