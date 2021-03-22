/********************************************************************
 * Programmer: Lauren M
 * Class:  CS40S
 *
 * Assignment: A2
 *
 * Description: Searcher object
 ***********************************************************************/

// import libraries as needed here

public class Searcher {
    //*** Class Variables ***
    
    //*** Instance Variables ***
    
    //*** Constructors ***
    
    /*****************************************
    * Description: constructor for the searcher object
    * 
    * Interface:
    * ****************************************/
    public Searcher(){
        
    }
    
    //*** Getters ***
    
    public int linearSearch(int[] list, int length, int key){
        int keyIndex = -1;
        int counter = 0;
        while(counter < length - 1){
            
            if(list[counter] == key){
                keyIndex = counter;
            }
            
            counter++;
        }
        
        return keyIndex;
    }
    
    public int linearSearchSorted(int[] list, int length, int key){
        int keyIndex = -1;
        int counter = 0;
        while(keyIndex == -1 && counter < length - 1){
            
            if(list[counter] == key){
                keyIndex = counter;
            } else {
                if(list[counter] > key){
                    counter = length;
                }
            }
            
            counter++;
        }
        return keyIndex;
    }
    
    public int binarySearch(int[] list, int high, int low, int key){
        int keyIndex = -1;
        int mid = (high + 1) / 2;
        if(high > low){
            if(list[mid] > key){
                binarySearch(list, mid, low, key);
            } else {
                binarySearch(list, high, mid, key);
            }
        } else {
            if(list[mid] == key){
                keyIndex = mid;
            }
        }
        
        return keyIndex;
    }
    
    //*** Setters ***
    
} // end of public class
