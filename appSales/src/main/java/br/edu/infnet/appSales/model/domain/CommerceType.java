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
public enum CommerceType {
    COMMERCIAL_ROOM("Commercial room"),
    STORE("store");
    
    private String description;
    
    CommerceType(String description) {
        this.description = description;
    }
    
    public String getDescription() {
        return this.description;
    }
}
