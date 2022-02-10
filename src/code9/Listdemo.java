package code9;

import java.util.ArrayList;

public class Listdemo {
    public static void main (String arg[]){
        //creating list that contains string elements
        ArrayList<String> list1 = new ArrayList<>();
        // creating that list that contain all type of data
        ArrayList list2 = new ArrayList();
        list1.add("isra");
        list1.add("ishal");
        list1.add("nimra");
        list1.add("yufa");
        list1.add("rabbiya");
        list2.add(8);
        list2.add('a');
        list2.add(" isra");
        list2.add(900.100);
        list2.add("psl");


        System.out.println(" list 1 is " + list1);
        System.out.println(" list2 is "+ list2);
        // getting elemetn fromthe ist
        String name =  list1.get(2);
        System.out.println(" required name is "+ name);
        // getting elements here we right object for this list becoz we dont know the type
        Object obj  = list2.get(3);
        /// iterating with enhanced for loop
        System.out.println(" iterating with enhance for loop");
        for (String str:list1){
            System.out.println(str);
        }
        //// with simple for loop
        System.out.println(" here is the list using simple for loop ");
        for ( int i =0; i<list1.size();i++)
        {
            System.out.println(list1.get(i));
        }




    }
}
