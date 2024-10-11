package org.launchcode.codingevents.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by Chris Bay
 */
@Controller
@RequestMapping("events")
public class EventController {

    private static HashMap<String,String> events = new HashMap<>();
    String image;

    @GetMapping
    public String displayAllEvents(Model model) {
//        List<String> events = new ArrayList<>();
//        HashMap<String,String> events = new HashMap<>();
//        events.put("Code With Pride", "some description for Code With Pride");
//        events.put("Strange Loop","some description for Strange Loop");
//        events.put("Apple WWDC","some description for Apple WWDC");
//        events.put("SpringOne Platform","some description for SpringOne Platform");
        model.addAttribute("events", events);
        model.addAttribute("image",image);
        return "events/index";
    }

    @GetMapping("create")
    public String processCreateEventForm(){
        return "events/create";
    }

    @PostMapping("create")
    public String  submitForm(@RequestParam String eName,String eDesc,String eImage){
         image = eImage;
        events.put(eName,eDesc);
        return "redirect:/events";
    }


}
