
import java.util.ArrayList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Hridi
 */
class Storage<Type> {

    Type v;
    String str;

    public Type getV() {
        return v;
    }

    public void setV(Type v) {
        this.v = v;
    }

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }

    public void show() {
        System.out.println(v.toString());
    }

    public void showAgain() {
        System.out.println(v.getClass());
    }

}

public class GenericExample {

    public static void main(String[] args) {

        Storage<String> obj = new Storage();
        obj.v = "5";
        obj.setV("15");
        obj.show();
        obj.showAgain();
//        List v = new ArrayList();
//        v.add(5);
//        v.add("CSE215");
//        v.add(9.5);
//        int i = Integer.parseInt(v.get(0).toString());
//        System.out.println(i);
    }
}
