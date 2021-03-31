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
    
    public int binarySearch(int[] list, int low, int high, int key){
        int mid = (high + low) / 2;
        if(high < low){
                return - 1;
            }
        if(list[mid] == key){
            return mid;
        } else {
                if(key > list[mid]){
                    return binarySearch(list, mid + 1, high, key);
                } else {
                    return binarySearch(list, low, mid - 1, key);
                }
        }
    }
    
    //*** Setters ***
    
} // end of public class
