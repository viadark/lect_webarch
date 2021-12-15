package dto;

import java.sql.*;

import javax.management.monitor.StringMonitorMBean;

import sun.util.calendar.BaseCalendar.Date;

public class ProductionDTO {
    String name;
    int quantity;
    String prod;
    public ProductionDTO(){
        name="";
        quantity=0;
        prod = null;
    }
    public ProductionDTO(String name, int quantity, String prod) {
        this.name = name;
        this.quantity = quantity;
        this.prod = prod;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
    
    public void setQuantity(int quantity){
        this.quantity = quantity;
    }
    public int getQuantity(){
        return this.quantity;
    }
    
    public void setProd(String prod){
        this.prod = prod;
    }
    public String getProd(){
        return this.prod;
    }
}