package com.jee.d11112021.serialize;

import java.io.Serializable;

public class Address implements Serializable {
    //if we use transient,this will not be serialized
    //while deserialized, the property value will set to its default value
    transient String street; 
//    String street;
    String country;

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    @Override
    public String toString() {
        return new StringBuffer("Street : ").append(this.street)
                .append(" Country : ").append(this.country).toString();
    }
   
}
