package com.example.firstproject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller //먼저 얘가 컨트롤러라고 선언을 해줌!
public class FirstController {

    @GetMapping("/hi") //hi라고 입력 받았을 때 그리팅스 머스타치 찾아서 그걸 반환~
    public String niceToMeetYou(Model model) {
        // 드디어 이제 메소드 만들어줄 차례~
        model.addAttribute("username", "지혜");
        return "greetings"; //템플릿 안에 그리팅스라는 거 알아서 찾아서 브라우저로 전송해줌! (머스타치의 이름만 넣어주면 됨!)
    }
}
