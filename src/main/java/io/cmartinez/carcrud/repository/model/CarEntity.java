package io.cmartinez.carcrud.repository.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name="cars")
@Getter
@Setter
public class CarEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(nullable = false, length = 6, name = "patente")
    private String plateCode;
    @Column(nullable = false, length = 30)
    private String brand;
    @Column(nullable = false, length = 30)
    private String model;
    @Column(nullable = false, length = 10)
    private String color;
}
