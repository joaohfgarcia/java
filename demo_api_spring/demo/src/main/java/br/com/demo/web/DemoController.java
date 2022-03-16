package br.com.demo.web;

import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/demo")
public class DemoController {

    @GetMapping
    public String callGET(){
        return "Verb GET actived";
    }


    @PostMapping
    public String callPOST(){
        return "Verb POST actived";
    }

    @PutMapping
    public String callPUT(){
        return "Verb PUT actived";
    }

    @DeleteMapping
    public String callDELETE(){
    return "Verb DELETE actived";
    }

}
