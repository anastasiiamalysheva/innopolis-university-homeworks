package ru.malysheva.task23;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;


public class BasketImplementation implements Basket {


    @Override
    public void addProduct(String product, int quantity) {
        ArrayList<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(getProductQuantity("a"));
        list2.add(getProductQuantity("b"));
        list2.add(getProductQuantity("c"));
        list2.add(getProductQuantity("d"));


        printList(list);
        printList(list2);
        ListIterator<String> it = list.listIterator(list.size());

    }


    @Override
    public void removeProduct(String product) {


    }

    @Override
    public void updateProductQuantity(String product, int quantity) {

    }

    @Override
    public void clear() {

    }

    @Override
    public List<String> getProducts() {
        return null;
    }

    @Override
    public int getProductQuantity(String product) {

        return 0;
    }

    public static void printList(List list) {
        for (Object obj : list) {
            System.out.print(obj == null ? "null" : obj.toString());
            System.out.print(" ");
        }
        System.out.println(" ");

    }

}


