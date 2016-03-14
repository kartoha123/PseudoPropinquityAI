package com.bunjlabs.pseudopropinquityai;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Row {

    private IntegerProperty id;
    private StringProperty figureA;
    private StringProperty figureB;
    private StringProperty propinquity;

    public Row() {
        id = new SimpleIntegerProperty(0);
        figureA = new SimpleStringProperty("not set");
        figureB = new SimpleStringProperty("not set");
        propinquity = new SimpleStringProperty("no");
    }

    public Row(int id, String figureA, String figureB, String propinquity) {
        this.id = new SimpleIntegerProperty(id);
        this.figureA = new SimpleStringProperty(figureA);
        this.figureB = new SimpleStringProperty(figureB);
        this.propinquity = new SimpleStringProperty(propinquity);
    }

    public int getId() {
        return id.get();
    }

    public String getFigureA() {
        return figureA.get();
    }

    public String getFigureB() {
        return figureB.get();
    }

    public String getPropinquity() {
        return propinquity.get();
    }

}
