package com.app.admin.controller;

import java.util.LinkedHashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class GraphController {

    @GetMapping("/barChart")
    public String barChart(Model model)
    {
        Map<String, Integer> data = new LinkedHashMap<String, Integer>();
        data.put("Imdad", 30);
        data.put("Tabish", 70);
        data.put("Faiz", 85);
        data.put("Amit", 75);
        data.put("Feroz", 45);
        model.addAttribute("keySet", data.keySet());
        model.addAttribute("values", data.values());
        return "barChart";

    }

    @GetMapping("/pieChart")
    public String pieChart(Model model) {
        model.addAttribute("pass", 90);
        model.addAttribute("fail", 10);
        return "pieChart";

    }

    @GetMapping("/linebar")
    public String lineBar(Model model)
    {
        Map<String, Integer> data = new LinkedHashMap<String, Integer>();
        data.put("Jan", 30);
        data.put("Feb", 50);
        data.put("Mar", 70);
        data.put("Apr", 90);
        data.put("May", 25);
        data.put("Jun", 25);
        data.put("Jul", 25);
        data.put("Aug", 25);
        data.put("Sep", 25);
        data.put("Oct", 25);
        data.put("Nov", 25);
        data.put("Dec", 25);
        model.addAttribute("keySet", data.keySet());
        model.addAttribute("values", data.values());
        return "linebar";

    }




}
