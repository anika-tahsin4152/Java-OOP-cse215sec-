/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Hridi
 */
public class ElectronicDevice extends Product {

    private String model;
    private String warranty;

    public ElectronicDevice(String name, double price, String model,
            String warranty) {
        super(name, price);
        this.model = model;
        this.warranty = warranty;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getWarranty() {
        return warranty;
    }

    public void setWarranty(String warranty) {
        this.warranty = warranty;
    }

    @Override
    public void changePrice(double percentage) {
        setPrice(getPrice() + (percentage / 100) * (getPrice()));
    }

    @Override
    public String toString() {
        return "ElectronicDevice : " + super.toString() + ", Model: " + model + ", Warranty: " + warranty;
    }

}
