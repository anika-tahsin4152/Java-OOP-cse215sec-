/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Hridi
 */
public class ClothingItem extends Product {

    private String fabricType;

    public ClothingItem(String name, double price, String fabricType) {
        super(name, price);
        this.fabricType = fabricType;
    }

    public String getFabricType() {
        return fabricType;
    }

    public void setFabricType(String fabricType) {
        this.fabricType = fabricType;
    }

    @Override
    public void changePrice(double percentage) {
        setPrice(getPrice() - (percentage / 100) * getPrice());
    }

    @Override
    public String toString() {
        return "ClothingItem : " + super.toString() + ", Fabric Type: " + fabricType;
    }

}
