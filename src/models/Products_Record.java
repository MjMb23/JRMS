/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;


public class Products_Record {
    private int productID;
    private double productPrice;
    private String productName;

    public Products_Record(int productID, String productName,double productPrice) {
        this.productID = productID;
        this.productPrice = productPrice;
        this.productName = productName;
    }
    
    public Products_Record(){
        this.productID = productID;
        this.productPrice = productPrice;
        this.productName = productName;
    }
    

    public int getProductID() {
        return productID;
    }

    public void setProductID(int productID) {
        this.productID = productID;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }
    
}
