package com.shop.controller;

import com.shop.dto.ItemDto;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/thymeleaf")
public class ThymeleafController {

    @GetMapping("/ex01")
    public String thymeleafExample01(Model model){
        model.addAttribute("data","타임리프입니다.");
        System.out.println(model.getAttribute("data"));
        return "thymeleafEx/thymeleafEx01";
    }

    @GetMapping("/ex02")
    public String thymeleafExample02(Model model){
        ItemDto itemDto = new ItemDto();


        return "thymeleafEx/thymeleafEx02";
    }
}
