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
    
    public void quickSort(int[] list, int leftBound, int rightBound){
        
        int pivot = partition(list, leftBound, rightBound);
        
        if(leftBound < pivot - 1){
            quickSort(list, leftBound, pivot - 1);
        }
        
        if(rightBound > pivot + 1){
            quickSort(list, pivot + 1, rightBound);
        }
        
    }
    
    /*****************************************
    * Description: sorter using the quick sort methods
    * 
    * Interface:
    * ****************************************/
    
    public int partition(int[] list, int low, int high){
        int pivotIndex = high;
        int dataSaver;
        high--;
        while(low < high){
            while(list[low] < list[pivotIndex]){
                low++;
            }
            while(list[high] > list[pivotIndex]){
                high--;
            }
            dataSaver = list[low];
            list[low] = list[high];
            list[high] = dataSaver;
            low++;
            high--;
        }
        dataSaver = list[low];
        list[low] = list[pivotIndex];
        list[pivotIndex] = dataSaver;
        pivotIndex = low;
        return pivotIndex;
    }
    //*** Setters ***
    
} // end of public class
