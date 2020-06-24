package com.bingham.ken.knightsquest.model;

import javax.persistence.*;

@Entity
@Table(name = "character_type")
public class CharacterType {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long characterTypeId;

    @Column(name = "character_type")
    private String characterType;

    public Long getCharacterTypeId() {
        return characterTypeId;
    }

    public String getCharacterType() {
        return characterType;
    }

    public void setCharacterType(String characterType) {
        this.characterType = characterType;
    }
}
