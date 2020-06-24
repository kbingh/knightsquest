package com.bingham.ken.knightsquest.model;

public interface Item<T> {

    T getType();
    void setType(T t);
    Long getId();
    void setCondition(int condition);
    Integer getCondition();
    void setValue(int value);
    Integer getValue();
}
