package com.esme.meetme.application;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.UUID;

class Location{
    public Double longitude;
    public Double latitude;
}

class ageRange {
    public Integer min;
    public Integer max;
}

public class Users implements Serializable{
    public UUID id;
    public Date created;
    public Location position;
    public String email;

    public Integer gender;
    public Integer attraction;
    public Integer coverSize;
    public ageRange ageRange;

    public String name;
    public String city;
    public Date birthday;
    public String description;
    public ArrayList<String> pictures;

    public Users(){
        this.position = new Location();
        this.ageRange = new ageRange();
        this.pictures = new ArrayList<String>();
    }
}
