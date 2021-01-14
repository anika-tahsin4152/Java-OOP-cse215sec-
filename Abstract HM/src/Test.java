
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Hridi
 */
public class Test {

    public static void main(String[] args) {
        Product p1 = new ElectronicDevice("Mobile", 15000, "Xiaomi note 6 pro", "One year");
        ClothingItem p2 = new ClothingItem("Sharee", 20000, "Moslin");
        ElectronicDevice p3 = new ElectronicDevice("Laptop", 530, "Asus vivoBook", "Two Years");
        p3.changePrice(10);
        p2.changePrice(20);
        ((ElectronicDevice) p1).setWarranty("6 months");
        ArrayList<Product> products = new ArrayList<Product>();
        products.add(p1);
        products.add(p2);
        products.add(p3);

        for (int i = 0; i < products.size(); i++) {
            if (products.get(i) instanceof ClothingItem) 
            {
                System.out.println((ClothingItem) (products.get(i)));
            } else if (products.get(i) instanceof ElectronicDevice)
            {
                System.out.println((ElectronicDevice) (products.get(i)));
            }

        }

    }

}
