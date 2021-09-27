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
public class Apartment extends Property {
   private int floor;
   private int number;
   private String buildingName;
   private int rooms;
   private int parkingSpaces;
   private int yearConstruction;
   private double condominiumValue;
   private ApartmentType apartmentType;
   
   private List<Apartment> apartments;


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

    public int getRooms() {
        return rooms;
    }

    public void setRooms(int rooms) {
        this.rooms = rooms;
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

    public ApartmentType getApartmentType() {
        return apartmentType;
    }

    public void setApartmentType(ApartmentType apartmentType) {
        this.apartmentType = apartmentType;
    }

    public List<Apartment> getApartments() {
        return apartments;
    }

    public void setApartments(List<Apartment> apartments) {
        this.apartments = apartments;
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
	sb.append(rooms);
	sb.append(";");
        sb.append(parkingSpaces);
	sb.append(";");
        sb.append(yearConstruction);
	sb.append(";");
        sb.append(condominiumValue);
        sb.append(";");
        sb.append(apartmentType);
        return super.toString(); 
    }
   
   
   
   @Override
   public List<Apartment> listProperties() {
       return apartments;
   }
   
}
