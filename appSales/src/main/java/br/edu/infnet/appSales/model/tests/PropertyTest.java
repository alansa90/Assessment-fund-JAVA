/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.infnet.appSales.model.tests;

import br.edu.infnet.appSales.model.domain.Apartment;
import br.edu.infnet.appSales.model.domain.ApartmentType;
import br.edu.infnet.appSales.model.domain.Commerce;
import br.edu.infnet.appSales.model.domain.CommerceType;
import br.edu.infnet.appSales.model.domain.House;
import br.edu.infnet.appSales.model.domain.Situation;
import br.edu.infnet.appSales.model.exceptions.EmptyAddressException;
import br.edu.infnet.appSales.model.exceptions.EmptySituationException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Alan Sá
 */
public class PropertyTest {
    public static void main(String[] args) {
            House house1 = new House(44,2,0,2017,1);
        try {
            house1.setAddress("Praça henrique gonzales, 150");
            house1.setNeighborhood("Tomas Coelho");
            house1.setCity("Rio de Janeiro");
            house1.setDescription("casa de vila");
            house1.setTotalArea(50);
            house1.setPropertyValue(200000);
            house1.setSituation(Situation.FOR_SALE);
            System.out.println(house1);
        } catch (EmptySituationException | EmptyAddressException e) {
            System.out.println(e.getMessage());
        }
        
        House house2 = new House(44,2,0,2017,1);
        try {
            house2.setAddress("");
            house2.setNeighborhood("Tomas Coelho");
            house2.setCity("Rio de Janeiro");
            house2.setDescription("casa de vila");
            house2.setTotalArea(50);
            house2.setPropertyValue(200000);
            System.out.println(house2);
        } catch (EmptySituationException | EmptyAddressException e) {
            System.out.println(e.getMessage());
        }
        
        Apartment apartment1 = new Apartment(1, 105, "DE PAOLLI", 3, 2, 1975, 1250.5, ApartmentType.DEFAULT);
             
        
        try {
            apartment1.setAddress("Praça henrique gonzales, 150");
            apartment1.setNeighborhood("Tomas Coelho");
            apartment1.setCity("Rio de Janeiro");
            apartment1.setDescription("casa de vila");
            apartment1.setTotalArea(50);
            apartment1.setPropertyValue(200000);
            apartment1.setSituation(Situation.FOR_SALE);
            System.out.println(apartment1);
        } catch (EmptySituationException | EmptyAddressException e) {
            System.out.println(e.getMessage());
            throw new EmptySituationException(e.getMessage());
        }
        
        Apartment apartment2 = new Apartment(1, 105, "TOWER OF SUN", 3, 2, 1975, 1250.5, ApartmentType.DEFAULT);
        
        try {
            apartment2.setAddress("");
            apartment2.setNeighborhood("Tomas Coelho");
            apartment2.setCity("Rio de Janeiro");
            apartment2.setDescription("casa de vila");
            apartment2.setTotalArea(50);
            apartment2.setPropertyValue(200000);
            System.out.println(apartment2);
        } catch (EmptySituationException e) {
            System.out.println(e.getMessage());
        }
        
        Commerce commerce1 = new Commerce(1, 1500, "LOJA A", 0, 0, 1927, 750, CommerceType.STORE);
        
        try {
            commerce1.setAddress("Praça henrique gonzales, 150");
            commerce1.setNeighborhood("Centro");
            commerce1.setCity("Rio de Janeiro");
            commerce1.setDescription("Store");
            commerce1.setTotalArea(50);
            commerce1.setPropertyValue(200000);
            commerce1.setSituation(Situation.FOR_SALE);
            System.out.println(commerce1);
        } catch (EmptySituationException | EmptyAddressException e) {
            System.out.println(e.getMessage());
        }
        
        Commerce commerce2 = new Commerce(15, 1501, "BUILD ENTERPRISE", 0, 0, 2000, 2550, CommerceType.COMMERCIAL_ROOM);
        
        try {
            commerce2.setAddress("");
            commerce2.setNeighborhood("Centro");
            commerce2.setCity("Rio de Janeiro");
            commerce2.setDescription("Commercial room");
            commerce2.setTotalArea(50);
            commerce2.setPropertyValue(200000);
            System.out.println(commerce2);
        } catch (EmptySituationException | EmptyAddressException e) {
            System.out.println(e.getMessage());
        }
        
        
        List<Apartment> apartments = new ArrayList<Apartment>();
        List<House> houses = new ArrayList<House>();
        List<Commerce> commerces = new ArrayList<Commerce>();
        
        apartments.add(apartment1);
        apartments.add(apartment2);
        houses.add(house1);
        houses.add(house2);
        commerces.add(commerce1);
        commerces.add(commerce2);
        
    }

}
