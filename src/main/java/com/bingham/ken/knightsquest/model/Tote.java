package com.bingham.ken.knightsquest.model;

import javax.persistence.*;

@Entity
@Table(name = "tote")
public class Tote extends Provision<ToteType>{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long toteId;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "tote_type_id")
    private ToteType toteType;

    @Column(name = "_condition")
    private Integer contition;

    @Column(name = "_value")
    private Integer value;

    public Long getToteId() {
        return toteId;
    }


    @Override
    public ToteType getType() {
        return toteType;
    }

    @Override
    public void setType(ToteType toteType) {
        this.toteType = toteType;
    }

    @Override
    public Long getId() {
        return toteId;
    }

    public void setToteType(ToteType toteType){

        this.toteType = toteType;
    }

    @Override
    public void setCondition(int condition) {
        this.contition = condition;
    }

    @Override
    public Integer getCondition() {
        return contition;
    }

    @Override
    public void setValue(int value) {
        this.value = value;
    }

    @Override
    public Integer getValue() {
        return value;
    }
}
