/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.infnet.appSales.model.domain;

/**
 *
 * @author Alan Sá
 */
public enum Situation {
    FOR_SALE("For Sale"),
    FOR_RENT("For Rent"),
    FOR_SALE_OR_RENT("For Sale or Rent"),
    SOLD("Sold"),
    RENTED("Rented");
    
    private String description;
    
    Situation(String description) {
        this.description = description;
    }
    
    public String getDescription() {
        return this.description;
    }
}
