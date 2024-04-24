package com.techacademy;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LinkController {

    @GetMapping("/link")
    public String getLink(Model model) {
        model.addAttribute("id", "123");//テンプレートに値（名前が id で値が 123）を渡しています。
        return "link";
    }
}