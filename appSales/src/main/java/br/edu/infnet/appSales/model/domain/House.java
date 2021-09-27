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
public class House extends Property {
    private float buildingArea;
    private int rooms;
    private int parkingSpaces;
    private int yearConstruction;
    private int floors;
    
    private List<House> houses;

    public House(float buildingArea, int rooms, int parkingSpaces, int yearConstruction, int floors) {
        this.buildingArea = buildingArea;
        this.rooms = rooms;
        this.parkingSpaces = parkingSpaces;
        this.yearConstruction = yearConstruction;
        this.floors = floors;
    }
    
    public float getBuildingArea() {
        return buildingArea;
    }

    public void setBuildingArea(float buildingArea) {
        this.buildingArea = buildingArea;
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

    public int getFloors() {
        return floors;
    }

    public void setFloors(int floors) {
        this.floors = floors;
    }

    @Override
    public List<House> listProperties() {
        return houses;
    }
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        
        
        sb.append(floors);
	sb.append(";");
	sb.append(rooms);
	sb.append(";");
        sb.append(buildingArea);
	sb.append(";");
        sb.append(parkingSpaces);
	sb.append(";");
        sb.append(yearConstruction);
        return super.toString(); 
    }
    
    
}
