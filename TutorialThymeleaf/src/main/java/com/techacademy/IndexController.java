package com.techacademy;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {
    //@Controller アノテーションはクラスに付けられ
    //このクラスがHTTPリクエストを受けつけるクラスであることを示します。
    @GetMapping("/")
    public String getIndex() {
        // index.htmlに画面遷移
        return "index";
    }
}