package com.example.demo.entities;

import ch.qos.logback.core.joran.spi.NoAutoStart;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;
import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;
@Entity
@Setter
@Getter
@Data
@AllArgsConstructor
@ToString
@Table(name="Order")
public class Order implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_order")
    private Long id_order;

    @Column(name = "OrderName")
    private String Name ;

    public Order() {

    }

    public Order(String name) {
        Name = name;
    }
}
