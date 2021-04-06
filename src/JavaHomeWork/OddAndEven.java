package JavaHomeWork;

import java.util.ArrayList;
import java.util.*;
public class OddAndEven {
        public int[] reOrderArray (int[] array) {
            ArrayList<Integer> oldList = new ArrayList<Integer>();
            ArrayList<Integer> newList = new ArrayList<Integer>();
            int[] array2 = new int[array.length];
            int mid = (array.length-1) / 2;
            for(int i=0;i<array.length;i++){
                if(array[i] % 2 == 0){
                    newList.add(array[i]);
                }else{
                    oldList.add(array[i]);
                }
            }
            for(int i=0;i<oldList.size();i++){
                array2[i] = oldList.get(i);
            }
            int index = oldList.size();
            for(int i=0;i<newList.size();i++){
                array2[index] = newList.get(i);
                index++;
            }
            return array2;
        }


    }


