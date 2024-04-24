package com.techacademy;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class NowController {

    @GetMapping("/now")
    public String getNow(Model model) {//Modelクラスのインスタンスが引数、Modelクラスはテンプレートにデータを受け渡すために利用するクラス
        // 現在時刻を文字列として取得
        String now = LocalDateTime.now().format( DateTimeFormatter.ofPattern("HH:mm:ss") );
        // 文字列をModelに登録
        model.addAttribute("msg", "現在時刻：" + now);//第一引数がデータの名前、第二引数がデータの値
        // now.htmlに画面遷移
        return "now";
    }
}