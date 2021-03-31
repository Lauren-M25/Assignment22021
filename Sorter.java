/********************************************************************
 * Programmer: Lauren M
 * Class:  CS340S
 *
 * Assignment: A2
 *
 * Description: Sorter object
 ***********************************************************************/

// import libraries as needed here
import java.util.*;
import javax.swing.*;

public class Sorter {
    //*** Class Variables ***
    
    //*** Instance Variables ***
    
    ArrayFunctions  arrayFunctions = new ArrayFunctions(20);
    
    //*** Constructors ***
    
    /*****************************************
    * Description: constructer for the sorter object
    * 
    * Interface:
    * ****************************************/
    
    public Sorter(){
        
    }
    
    
    //*** Getters ***
    
    /*****************************************
    * Description: sorter ursing the bubble sort method
    * 
    * Interface:
    * ****************************************/
    
    public void bubbleSort(int[] list, int length){
        int dataSaver = 0;
        for(int i = 0; i < length; i++){
            for(int j = 0; j < length - 1; j++){
                if(list[j] > list[j+1]){
                    dataSaver = list[j+1];
                    list[j+1] = list[j];
                    list[j] = dataSaver;
                }
            }
        }
    }
    
    /*****************************************
    * Description: sorter using the selection sort method
    * 
    * Interface:
    * ****************************************/
    
    public void selectionSort(int[] list, int length){
        int dataSaver = 0;
        for(int endofthelist = length - 1; endofthelist >= 0; endofthelist--){
            int largestValue = list[endofthelist];
            int largestValueIndex = endofthelist;
            for(int i = 0; i < endofthelist; i++){
                if(list[i] > largestValue){
                    largestValue = list[i];
                    largestValueIndex = i;
                }
            }
            dataSaver = list[endofthelist];
            list[endofthelist] = largestValue;
            list[largestValueIndex] = dataSaver;
       }
    }
    
    /*****************************************
    * Description: sorter using the quick sort methods
    * 
    * Interface:
    * ****************************************/
    
    public void quickSort(int[] list, int left, int bigIndex){
        int right = bigIndex;
        int pivot = partition(list, left, right);
        if(left < pivot - 1){
            quickSort(list, left, pivot - 1);
        }
        
        if(right > pivot){
            quickSort(list, pivot, right);
        }
        
    }
    
    /*****************************************
    * Description: sorter using the quick sort methods
    * 
    * Interface:
    * ****************************************/
    
    public int partition(int[] list, int low, int high){
        int pivot = list[(high + low) / 2];
        int dataSaver;
        while(low <= high){
            
            while(list[low] < pivot){
                low++;
            }
            
            while(list[high] > pivot){
                high--;
            }
            
            if(low <= high){
                dataSaver = list[low];
                list[low] = list[high];
                list[high] = dataSaver;
                low++;
                high--;
            }
        }
        return low;
    }
    //*** Setters ***
    
} // end of public class
