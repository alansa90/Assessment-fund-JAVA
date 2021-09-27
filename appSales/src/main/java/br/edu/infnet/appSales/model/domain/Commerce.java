/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.infnet.appSales.model.domain;

import java.util.List;

/**
 *
 * @author alkin
 */
public class Commerce extends Property {
   private int floor;
   private int number;
   private String buildingName;
   private int parkingSpaces;
   private int yearConstruction;
   private double condominiumValue;
   private CommerceType commerceType;
   
   public Commerce (int floor, int number, String buildingName, int rooms, int parkingSpaces, int yearConstruction, double condominiumValue, CommerceType commerceType) {
        this.floor = floor;
        this.number = number;
        this.buildingName = buildingName;
        this.parkingSpaces = parkingSpaces;
        this.yearConstruction = yearConstruction;
        this.commerceType = commerceType;      
   }
   
   private List<Commerce> commerces;
   
   @Override
   public List<Commerce> listProperties() {
       return commerces;
   }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getBuildingName() {
        return buildingName;
    }

    public void setBuildingName(String buildingName) {
        this.buildingName = buildingName;
    }

    public int getParkingSpaces() {
        return parkingSpaces;
    }

    public void setParkingSpaces(int parkingSpaces) {
        this.parkingSpaces = parkingSpaces;
    }

    public int getYearConstruction() {
        return yearConstruction;
    }

    public void setYearConstruction(int yearConstruction) {
        this.yearConstruction = yearConstruction;
    }

    public double getCondominiumValue() {
        return condominiumValue;
    }

    public void setCondominiumValue(double condominiumValue) {
        this.condominiumValue = condominiumValue;
    }

    public CommerceType getCommerceType() {
        return commerceType;
    }

    public void setCommerceType(CommerceType commerceType) {
        this.commerceType = commerceType;
    }
   
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        
        
        sb.append(floor);
	sb.append(";");
	sb.append(number);
	sb.append(";");
        sb.append(buildingName);
	sb.append(";");
        sb.append(parkingSpaces);
	sb.append(";");
        sb.append(yearConstruction);
	sb.append(";");
        sb.append(condominiumValue);
        sb.append(";");
        sb.append(commerceType);
        return super.toString(); 
    }
}
