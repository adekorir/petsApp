package com.felix.pets;

import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

import java.util.Date;

public class Pet {

    private StringProperty name, owner, species, sex;
    private ObjectProperty<Date> birth, death;

    {
        name = new SimpleStringProperty(this, "name", "");
        owner = new SimpleStringProperty(this, "owner", "");
        species = new SimpleStringProperty(this, "species", "");
        sex = new SimpleStringProperty(this, "sex", "");

        birth = new SimpleObjectProperty<>(this, "birth");
        death = new SimpleObjectProperty<>(this, "death");
    }

    public Pet() {
        super();
    }

    public Pet(String name, String owner, String species, String sex, Date birth, Date death) {
        super();

        this.name.setValue(name);
        this.owner.setValue(owner);
        this.species.setValue(species);
        this.sex.setValue(sex);
        this.birth.setValue(birth);
        this.death.setValue(death);
    }

    public String getName() {
        return name.get();
    }

    public void setName(String name) {
        this.name.set(name);
    }

    public StringProperty nameProperty() {
        return name;
    }

    public String getOwner() {
        return owner.get();
    }

    public void setOwner(String owner) {
        this.owner.set(owner);
    }

    public StringProperty ownerProperty() {
        return owner;
    }

    public String getSpecies() {
        return species.get();
    }

    public void setSpecies(String species) {
        this.species.set(species);
    }

    public StringProperty speciesProperty() {
        return species;
    }

    public String getSex() {
        return sex.get();
    }

    public void setSex(String sex) {
        this.sex.set(sex);
    }

    public StringProperty sexProperty() {
        return sex;
    }

    public Date getBirth() {
        return birth.get();
    }

    public void setBirth(Date birth) {
        this.birth.set(birth);
    }

    public ObjectProperty<Date> birthProperty() {
        return birth;
    }

    public Date getDeath() {
        return death.get();
    }

    public void setDeath(Date death) {
        this.death.set(death);
    }

    public ObjectProperty<Date> deathProperty() {
        return death;
    }

    @Override
    public String toString() {
        return getName();
    }
}

