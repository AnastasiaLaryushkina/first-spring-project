package ru.itgirl.firstspringproject.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class FirstController {

    @GetMapping("/dayOfWeek")
    public String getDay(@RequestParam(value = "day") String day) {

        try {
            Weekday today = Weekday.valueOf(day.toUpperCase());
            return today.getMessage();
        } catch (Exception e) {
            return "Неверный день недели";
        }



    }
}

