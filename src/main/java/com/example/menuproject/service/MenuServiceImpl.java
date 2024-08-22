package com.example.menuproject.service;

import com.example.menuproject.entity.Menu;
import com.example.menuproject.repository.MenuRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
@RequiredArgsConstructor
public class MenuServiceImpl implements MenuService {
    private final MenuRepository menuRepository;

    public List<Menu> getAllMenuList() {
        return menuRepository.findAll();
    }

    public Menu saveMenu(Menu menu) {
        return menuRepository.save(menu);
    }

    public List<Menu> getMenuWithNullMother() {
        return menuRepository.findByMenuMotherIsNull();
    }

    public List<Menu> getMenusWithNonNullMother() {
        return menuRepository.findByMenuMotherIsNotNull();
    }

    public List<Menu> findMenuByMotherId(Integer motherId) {
        return menuRepository.findByMenuMotherId(motherId);
    }

}
