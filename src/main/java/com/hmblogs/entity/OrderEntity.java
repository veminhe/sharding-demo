package com.hmblogs.entity;

import lombok.Data;
import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "t_order")
@Data
public class OrderEntity implements Serializable {


    @Id
    @Column(name = "order_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long orderId;

    private Integer userId;

    private Integer status = 1;
}

