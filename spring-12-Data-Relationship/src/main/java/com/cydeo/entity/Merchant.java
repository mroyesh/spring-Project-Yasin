package com.cydeo.entity;


import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.support.GenericBeanDefinition;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@Table(name="merchants")
public class Merchant {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String code;
    private BigDecimal transactionFee;
    private BigDecimal commissionRate;
    private Integer paymentDelayCount;

    @OneToMany(mappedBy = "merchant") //in OneToMany relationship, ownership belongs to many side
    private List<Payment> paymentList;


    public Merchant(String name, String code, BigDecimal transactionFee, BigDecimal commissionRate, Integer paymentDelayCount) {
        this.name = name;
        this.code = code;
        this.transactionFee = transactionFee;
        this.commissionRate = commissionRate;
        this.paymentDelayCount = paymentDelayCount;
    }
}
