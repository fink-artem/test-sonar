package ru.test.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Entity(name = "car")
@NoArgsConstructor
@AllArgsConstructor
public class CarEntity {

    @Id
    private int id;

    private String name;

}
