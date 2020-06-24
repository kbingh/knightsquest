package com.bingham.ken.knightsquest.model;

import javax.persistence.*;

@Entity
@Table(name = "character_class")
public class CharacterClass {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long characterClassId;

    @Column(name = "character_class")
    private String characterType;

    public Long getCharacterClassId() {
        return characterClassId;
    }

    public String getCharacterType() {
        return characterType;
    }

    public void setCharacterType(String characterType) {
        this.characterType = characterType;
    }
}
