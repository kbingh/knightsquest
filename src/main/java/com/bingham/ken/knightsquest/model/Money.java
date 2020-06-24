package com.bingham.ken.knightsquest.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "money")
public class Money extends Provision<MoneyType> {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long moneyId;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "money_type_id")
    private MoneyType moneyType;

    @Column(name = "amount")
    private Integer amount;

    @Column(name = "total_value")
    private Integer totalValue;


    @Override
    public MoneyType getType() {
        return moneyType;
    }

    @Override
    public void setType(MoneyType moneyType) {
         this.moneyType = moneyType;
    }

    @Override
    public Long getId() {
        return moneyId;
    }

    public void setAmount(int amount){

        this.amount = amount;
    }

    public Integer getAmount(){

        return amount;
    }

    @Override
    public void setCondition(int condition) {

    }

    @Override
    public Integer getCondition() {
        return null;
    }

    @Override
    public void setValue(int value) {
        this.totalValue = value;
    }

    @Override
    public Integer getValue() {
        return totalValue;
    }
}
