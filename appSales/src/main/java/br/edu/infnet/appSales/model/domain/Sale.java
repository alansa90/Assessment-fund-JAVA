/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.infnet.appSales.model.domain;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

/**
 *
 * @author Alan Sá
 */
public class Sale {

    private String description;
    private LocalDateTime date;
    private Client client;
    private Property property;
    private List<Property> properties;

    public Sale() {
        date = LocalDateTime.now();
    }

    @Override
    public String toString() {

        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        StringBuilder sb = new StringBuilder();
        sb.append(description);
        sb.append(";");
        sb.append(date.format(format));
        sb.append(";");
        sb.append(client.toString());
        sb.append(";");
        sb.append(property.toString());
        return sb.toString();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Property getProperty() {
        return property;
    }

    public void setProdutos(Property property) {
        this.property = property;
    }
}
