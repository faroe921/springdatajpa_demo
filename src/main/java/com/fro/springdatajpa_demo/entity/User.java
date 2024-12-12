package com.fro.springdatajpa_demo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

/**
 * @Auther: Nino
 * @Date: 2024/12/12 - 12 - 12 - 下午8:27
 * @Description: com.fro.springdatajpa_demo.entity
 * @version: 1.0
 */
@Entity
@Table(name = "t_user01")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User implements Serializable {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "username")
    private String username;
    @Column(name = "address")
    private String address;
    @Column(name = "gender")
    private String gender;
}
