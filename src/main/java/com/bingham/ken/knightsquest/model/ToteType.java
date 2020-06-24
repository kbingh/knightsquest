package com.bingham.ken.knightsquest.model;

import javax.persistence.*;

@Entity
@Table(name = "tote_type")
public class ToteType {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long toteTypeId;

    @Column(name = "tote_type")
    private String toteType;

    @Column(name = "capacity")
    private Integer capacity;

    @Column(name = "_value")
    private Integer value;

    public Long getToteTypeId() {
        return toteTypeId;
    }

    public String getToteType() {
        return toteType;
    }

    public void setToteType(String toteType) {
        this.toteType = toteType;
    }

    public Integer getCapacity() {
        return capacity;
    }

    public void setCapacity(Integer capacity) {
        this.capacity = capacity;
    }

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }
}
