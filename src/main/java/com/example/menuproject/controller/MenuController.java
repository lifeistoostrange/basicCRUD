package com.example.menuproject.controller;

import com.example.menuproject.entity.Menu;
import com.example.menuproject.service.MenuService;
import lombok.Builder;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping(value = "/menu")
@Builder
public class MenuController {

    private final MenuService menuService;

//    @GetMapping(value = "/get")
//    public Menu getMenu() {
//        System.out.println("GetMapping initiated");
//
//        return null;
//    }

    @GetMapping("/mother")
    public List<Menu> getAllMenuWithNullMother() {
        System.out.println("Getmapping initiated");
        return menuService.getMenuWithNullMother();
    }

    @GetMapping("/child")
    public List<Menu> getAllMenuChildren() {
        System.out.println("Getmapping initiated");
        return menuService.getMenusWithNonNullMother();
    }

    @PutMapping("/put")
    public Menu putMenu(Menu menu) {
        System.out.println("Put Menu initiated");

        return null;
    }
}
