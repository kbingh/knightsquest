package com.bingham.ken.knightsquest.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "_character")
public class Character {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "character_id")
    private Long characterId;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "character_type_id")
    private CharacterType characterType;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "character_class_id")
    private CharacterClass characterClass;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinTable(
            name = "character_tote",
            joinColumns = @JoinColumn(name = "character_id"),
            inverseJoinColumns = @JoinColumn(name = "tote_id")
    )
    private List<Tote> toteList;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinTable(
            name = "character_money",
            joinColumns = @JoinColumn(name = "character_id"),
            inverseJoinColumns = @JoinColumn(name = "money_id")
    )
    private List<Money> moneyList;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinTable(
            name = "character_weapon",
            joinColumns = @JoinColumn(name = "character_id"),
            inverseJoinColumns = @JoinColumn(name = "weapon_id")
    )
    private List<Weapon> weaponList;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinTable(
            name = "character_armor",
            joinColumns = @JoinColumn(name = "character_id"),
            inverseJoinColumns = @JoinColumn(name = "armor_id")
    )
    private List<Armor> armorList;

    @Column(name = "character_name")
    private String characterName;

    @Column(name = "sex")
    private String sex;

    @Column(name = "strength")
    private Integer strength;

    @Column(name = "weight_limit")
    private Integer weightLimit;

    @Column(name = "charisma")
    private Integer charisma;

    @Column(name = "constitution")
    private Integer constitution;

    @Column(name = "alignment")
    private String alignment;

    @Column(name = "active")
    private boolean active;

    public Long getCharacterId() {
        return characterId;
    }

    public CharacterType getCharacterType() {
        return characterType;
    }

    public void setCharacterType(CharacterType characterType) {
        this.characterType = characterType;
    }

    public CharacterClass getCharacterClass() {
        return characterClass;
    }

    public void setCharacterClass(CharacterClass characterClass) {
        this.characterClass = characterClass;
    }

    public List<Tote> getToteList() {
        return toteList;
    }

    public void setToteList(List<Tote> toteList) {
        this.toteList = toteList;
    }

    public List<Money> getMoneyList() { return moneyList; }

    public void setMoneyList(List<Money> moneyList) { this.moneyList = moneyList; }

    public List<Weapon> getWeaponList() { return weaponList; }

    public void setWeaponList(List<Weapon> weaponList) { this.weaponList = weaponList; }

    public List<Armor> getArmorList() { return armorList; }
    public void setArmorList(List<Armor> armorList) { this.armorList = armorList; }

    public String getCharacterName() {
        return characterName;
    }

    public void setCharacterName(String characterName) {
        this.characterName = characterName;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Integer getStrength() {
        return strength;
    }

    public void setStrength(Integer strength) {
        this.strength = strength;
    }

    public Integer getWeightLimit() {
        return weightLimit;
    }

    public void setWeightLimit(Integer weightLimit) {
        this.weightLimit = weightLimit;
    }

    public Integer getCharisma() {
        return charisma;
    }

    public void setCharisma(Integer charisma) {
        this.charisma = charisma;
    }

    public Integer getConstitution() {
        return constitution;
    }

    public void setConstitution(Integer constitution) {
        this.constitution = constitution;
    }

    public String getAlignment() {
        return alignment;
    }

    public void setAlignment(String alignment) {
        this.alignment = alignment;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }
}
