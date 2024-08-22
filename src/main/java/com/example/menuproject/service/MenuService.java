package com.example.menuproject.service;

import com.example.menuproject.entity.Menu;

import java.util.List;

public interface MenuService {

    //모든 메뉴 가져오기
    List<Menu> getAllMenuList();

    List<Menu> getMenuWithNullMother ();

    List<Menu> getMenusWithNonNullMother ();

    List<Menu> findMenuByMotherId(Integer motherId);
}
