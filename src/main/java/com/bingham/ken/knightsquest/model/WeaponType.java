package com.bingham.ken.knightsquest.model;

import javax.persistence.*;

@Entity
@Table(name = "weapon_type")
public class WeaponType {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long weaponTypeId;

    @Column(name = "weapon_type")
    private String weaponType;

    @Column(name = "_value")
    private String value;

    @Column(name = "damage")
    private String damage;

    public Long getWeaponTypeId() {
        return weaponTypeId;
    }

    public String getWeaponType() {
        return weaponType;
    }

    public void setWeaponType(String weaponType) {
        this.weaponType = weaponType;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getDamage() {
        return damage;
    }

    public void setDamage(String damage) {
        this.damage = damage;
    }
}
