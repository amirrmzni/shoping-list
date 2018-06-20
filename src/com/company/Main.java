package com.company;

// Import Scanner class from java.util
import java.util.Scanner;

public class Main {
    // Initlize the scanner for keyboard inputs.
    private static Scanner keyborad = new Scanner(System.in);
    private static ShoppingList todayList = new ShoppingList();

    public static void main(String[] args) {
        System.out.printf("Hello\n How can I be at your service?\n");
        todayList.addItemToList("Tomato");
        todayList.addItemToList("Banana");
        todayList.showItems();
        todayList.modifyItem(1, "Potato");
        todayList.removeItem(2);
        todayList.gotoItem("Khiar");
        todayList.gotoItem("Potato");
    }
}
