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
   private int yearContruction;
   private double condominiumValue;
   private ApartmentType apartmentType;
   
   private List<Apartment> apartments;
   
//   public String consultApartment() {
//       
//   }
   
   public List<Apartment> getApartments() {
       return apartments;
   }
   
}
