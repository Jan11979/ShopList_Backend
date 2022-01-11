package com.example.sl_backend.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("sl")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class ControllerShopList {

    @GetMapping(path = "/miau")
    public String getMiau() {
        System.out.println("getMiau Called");
        return "Miau2000";
    }
}

