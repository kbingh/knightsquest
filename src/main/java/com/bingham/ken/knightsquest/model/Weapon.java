package com.bingham.ken.knightsquest.model;

import javax.persistence.*;

@Entity
@Table(name = "weapon")
public class Weapon extends Provision<WeaponType>{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long weaponId;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "weapon_type_id" )
    private WeaponType weaponType;

    @Column(name = "_value")
    private Integer value;

    @Column(name = "damage_adj")
    private Integer damageAdj;

    @Column(name = "weapon_name")
    private String weaponName;

    @Column(name = "_condition")
    private Integer condition;

    @Override
    public WeaponType getType() {
        return weaponType;
    }

    @Override
    public void setType(WeaponType weaponType) {
        this.weaponType = weaponType;
    }

    @Override
    public Long getId() {
        return weaponId;
    }

    @Override
    public void setCondition(int condition) {
        this.condition = condition;
    }

    @Override
    public Integer getCondition() {
        return condition;
    }

    @Override
    public void setValue(int value) {
        this.value = value;
    }

    @Override
    public Integer getValue() {
        return value;
    }

    public String getWeaponName() {
        return weaponName;
    }

    public void setWeaponName(String weaponName) {
        this.weaponName = weaponName;
    }

    public Integer getDamageAdj() {
        return damageAdj;
    }

    public void setDamageAdj(Integer damageAdj) {
        this.damageAdj = damageAdj;
    }


}
