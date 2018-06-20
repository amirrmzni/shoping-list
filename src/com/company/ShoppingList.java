package com.company;

import java.util.ArrayList;

public class ShoppingList {
    public ArrayList<String> shopingList = new ArrayList<String> ();


    // This is for adding an item.
    public void addItemToList (String item){
        shopingList.add(item);
    }

    // For show the list
    public void showItems (){
        if (shopingList.size() == 0){
            System.out.print("There is no item in your list.");
        }
        else{
            System.out.println("You have "+shopingList.size()+" items.");
            for (int i=0; i< shopingList.size();i++){
                System.out.println((i + 1) + ". " + shopingList.get(i));
            }
        }
    }
    public void modifyItem (int position, String newName){
        shopingList.set(position-1, newName);
        System.out.println((position+1) + ". Item has been removed.");
    }
    // This is code for removing item from the list with position.
    public void removeItem (int position){
        shopingList.remove(position-1);
    }
    // This code is for searching items through the list.
    public String gotoItem (String seekItem){
        int position = shopingList.indexOf(seekItem);
        if (position >= 0){
            return shopingList.get(position);
        }
        return null;
    }
}