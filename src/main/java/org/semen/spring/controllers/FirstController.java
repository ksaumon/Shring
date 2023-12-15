package org.semen.spring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

@Controller
//@RequestMapping("/first") данная анатация перед классом говорит что обращаться нужно не /hello а /first/hello
// и /first/goodbye
public class FirstController {
    @GetMapping("/hello")
    public String helloPage(HttpServletRequest request) {
        String name = request.getParameter("name");
        String surname = request.getParameter("surname");
        System.out.println("Hello " + name + " " + surname);
        return "first/hello";
    }

    @GetMapping("/goodbye")
    public String goodByePage(@RequestParam("name") String name,
                              @RequestParam("surname") String surname) {// при данной обработки пришедших
        //с гет запросом параметров нужно прописыват URL не просто /goodbye а /goodbye?name=Jon&surname=Tomson
        // иначе будет ошибка или написать @RequestParam("name", required = false) String name,
        //                              @RequestParam("surname", required = false) String surname ошибки не будет.
        System.out.println("Hello " + name + " " + surname);
        return "first/goodbye";
    }
}
