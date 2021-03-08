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
    * Description: brief description of the methods purpose
    * 
    * Interface:
    * 
    * @param        each parameter of the method should be listed with an @param
    * @param        parametername description of parameter
    * 
    * @return       any return value will be noted here
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
    * Description: brief description of the methods purpose
    * 
    * Interface:
    * 
    * @param        each parameter of the method should be listed with an @param
    * @param        parametername description of parameter
    * 
    * @return       any return value will be noted here
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
    
    //*** Setters ***
    
} // end of public class
