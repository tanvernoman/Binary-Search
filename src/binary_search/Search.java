/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package binary_search;

import java.util.ArrayList;

/**
 *
 * @author afnan
 */
public class Search {
    private static final int list_size = 25;
    private ArrayList<Integer> the_list;

    public Search() {
        the_list = new ArrayList<>();
        the_list.add(10);
        the_list.add(19);
        the_list.add(12);
        the_list.add(9);
        the_list.add(20);
        the_list.add(13);
        
        
    }
    
    

    //Bubble sort method for descending order

    public int sortTheList() {
        int j;
        boolean flag = true;
        int temp;
        int nswap = 0;
        while (flag) {
            flag = false;
            nswap++;
            for (j = 0; j < the_list.size() - 1; j++) {
                if (the_list.get(j) < the_list.get(j + 1)) {
                    temp = the_list.get(j);
                    the_list.set(j, the_list.get(j + 1));
                    the_list.set(j + 1, temp);
                    flag = true;

                }
            }
        }

        System.out.println("Bubble sort passess :" + nswap);
        return the_list.size();
    }

    public int binarySearch(int value) {
        int left = 0;
        int right = the_list.size();

        int binary_search_passes = 0;
        while (left <= right) {
            binary_search_passes++;
            int middle = (left+right) / 2;
            if (value == the_list.get(middle)) {
                System.out.println(middle + "found ");
                return middle;
            } else if (value < the_list.get(middle)) {
                left = middle + 1;
                
            } else {
                right = middle - 1;
            }

        }
        System.out.println("not found");
        System.out.println("Binary search passes" + binary_search_passes);
        return -1;
    }

    public int displayElements() {
        for (int i = 0; i < the_list.size(); i++) {
            System.out.println(the_list.get(i));
        }
        return the_list.size();
    }

}


