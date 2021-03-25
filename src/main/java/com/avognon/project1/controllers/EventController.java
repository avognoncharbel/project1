package com.avognon.project1.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("events")
public class EventController {

    private static     List<String> eventList = new ArrayList<>();

    @PostMapping("create")
    public String createEvent(@RequestParam String eventName){
        eventList.add(eventName);
        return "redirect:";

    }


    @GetMapping()
    public String myEvents(Model model){

        model.addAttribute("myList",eventList);
        return "events/index";
    }

    @GetMapping("create")
    public String renderCreateEventForm(){
        return "events/create";
    }





}
