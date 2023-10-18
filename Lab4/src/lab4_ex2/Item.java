/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4_ex2;

/**
 *
 * @author vuduchai
 */
public class Item implements Sellable{
    private String barcode;
    private String description;
    private double unitPrice;

    public Item(String barcode, String description, double unitPrice) {
        this.barcode = barcode;
        this.description = description;
        this.unitPrice = unitPrice;
    }

    @Override
    public String toString() {
        return "Item{" + "barcode=" + barcode + ", description=" + description + ", unitPrice=" + unitPrice + '}';
    }

    @Override
    public double getPrice() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getReceiptLine() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
