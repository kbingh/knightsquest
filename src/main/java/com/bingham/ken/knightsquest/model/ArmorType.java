package com.bingham.ken.knightsquest.model;

import javax.persistence.*;

@Entity
@Table(name = "armor_type")
public class ArmorType {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long armorTypeId;

    @Column(name = "armor_type")
    public String armorType;

    @Column(name = "_value")
    public Integer value;

    @Column(name = "strength")
    public Integer strength;

    public Long getArmorTypeId() {
        return armorTypeId;
    }

    public String getArmorType() {
        return armorType;
    }

    public void setArmorType(String armorType) {
        this.armorType = armorType;
    }

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

    public Integer getStrength() {
        return strength;
    }

    public void setStrength(Integer strength) {
        this.strength = strength;
    }
}
