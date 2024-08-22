package com.example.menuproject.repository;


import com.example.menuproject.entity.Menu;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MenuRepository extends JpaRepository<Menu, Long> {

    List<Menu> findByMenuMotherIsNull();

    List<Menu> findByMenuMotherIsNotNull();

    List<Menu> findByMenuMother(Menu mother);

    List<Menu> findByMenuMotherId(Integer id);

}
