package com.bingham.ken.knightsquest.model;

import javax.persistence.*;

@Entity
@Table(name = "money_type")
public class MoneyType {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long moneyTypeId;

    @Column(name = "money_type")
    private String moneyType;

    @Column(name = "_value")
    private Integer value;

    public Long getMoneyTypeId() {
        return moneyTypeId;
    }

    public void setMoneyTypeId(Long moneyTypeId) {
        this.moneyTypeId = moneyTypeId;
    }

    public String getMoneyType() {
        return moneyType;
    }

    public void setMoneyType(String moneyType) {
        this.moneyType = moneyType;
    }

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }
}
