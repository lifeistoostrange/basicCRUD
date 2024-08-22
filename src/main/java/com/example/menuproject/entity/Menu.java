package com.example.menuproject.entity;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

@Entity
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Builder
@DynamicInsert
@DynamicUpdate
@Table
public class Menu {

    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    Long id;

    @Column(nullable = false, name = "menu_name")
    String menuName;

    @Column(name = "menu_desc")
    String menuDesc;

    @Column(name = "menu_order", unique = true)
    Integer menuOrder;

    @Column(name = "menu_mother")
    String menuMother;

}
