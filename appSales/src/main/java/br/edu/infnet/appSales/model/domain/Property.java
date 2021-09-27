/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.infnet.appSales.model.domain;

import java.util.List;

/**
 *
 * @author Alan Sá
 */
public abstract class Property {
    private int id;
    private String address;
    private String neighborhood;
    private String city;
    private String description;
    private float totalArea;
    private double propertyValue;
    private Situation situation;
    
    public Property () {
        
    }
    
    public Property (
            String address, 
            String neighborhood, 
            String city, 
            String description,
            float totalArea, 
            double propertyValue, 
            Situation situation) {
        
        this.address = address;
        this.neighborhood = neighborhood;
        this.city = city;
        this.description = description;
        this.totalArea = totalArea;
        this.situation = situation;  
    }
    
    public abstract List listProperties();
    
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNeighborhood() {
        return neighborhood;
    }

    public void setNeighborhood(String neighborhood) {
        this.neighborhood = neighborhood;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public float getTotalArea() {
        return totalArea;
    }

    public void setTotalArea(float totalArea) {
        this.totalArea = totalArea;
    }

    public double getPropertyValue() {
        return propertyValue;
    }

    public void setPropertyValue(double propertyValue) {
        this.propertyValue = propertyValue;
    }

    public Situation getSituation() {
        return situation;
    }

    public void setSituation(Situation situation) {
        this.situation = situation;
    }
    
       
    @Override 
    public String toString() {
        StringBuilder sb = new StringBuilder();
        
        sb.append(id);
	sb.append(";");
	sb.append(address);
	sb.append(";");
        sb.append(neighborhood);
	sb.append(";");
	sb.append(city);
	sb.append(";");
        sb.append(description);
	sb.append(";");
        sb.append(totalArea);
	sb.append(";");
        sb.append(propertyValue);
	sb.append(";");
        sb.append(situation);
		
	return sb.toString();
        
    }
}
