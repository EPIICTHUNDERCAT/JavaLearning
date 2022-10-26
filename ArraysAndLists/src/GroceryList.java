import java.util.ArrayList;

public class GroceryList {

    private ArrayList<String> groceryList = new ArrayList<String>();

    public void addGroceryItem(String item) {
        groceryList.add(item);

    }

    public void printGroceryList() {

        System.out.println("you have");
        for (int i = 0; i < groceryList.size(); i++) {

            System.out.println((i + 1) + ".  " + groceryList.get(i));
        }


    }

    public void modifyGroceryList(int pos, String newItem) {
        groceryList.set(pos, newItem);

        System.out.println("Groc item: " + (pos + 1) + " has been modded.");

    }

    public void removeGroceryItem(int pos) {

        String item = groceryList.get(pos);
        groceryList.remove(pos);
    }

    //    public String findItem(String item) {
//
//        boolean exists = groceryList.contains(item);
//        if (exists) {
//            System.out.println("Item does exist " + item);
//            return item;
//
//        }
//        return "Item does not exist";
//    }
    public String findItem(String item) {

//        boolean exists = groceryList.contains(item);
        int pos = groceryList.indexOf(item);
        if (pos >= 0) {
            System.out.println("Item does exist " + item + " in position" + pos);
            return groceryList.get(pos);

        }
        return null;
    }

    public modifyGroceryItem(String newItem){

    }

}
