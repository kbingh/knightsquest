package com.bingham.ken.knightsquest.model;

import javax.persistence.*;

@Entity
@Table(name = "armor")
public class Armor extends Provision<ArmorType>{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long armorId;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "armor_type_id")
    private ArmorType armorType;


    @Override
    public ArmorType getType() {
        return null;
    }

    @Override
    public void setType(ArmorType armorType) {

    }

    @Override
    public Long getId() {
        return null;
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

    }

    @Override
    public Integer getValue() {
        return null;
    }
}
