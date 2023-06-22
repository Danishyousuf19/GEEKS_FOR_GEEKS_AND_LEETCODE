import java.util.*;
public class opperations_on_array_list {
    // Function to insert element into list
    public static void insert(ArrayList<Integer> list, int x)
    {
        // Your code here
         list.add(x);
        
    }
    
    // Function to sort list in Increasing order
    public static void IncOrder(ArrayList<Integer> list)
    {
        Collections.sort(list);
        
    }
    
    // Function to search element in the lise
    // val : element to be searched
    public static void Search(ArrayList<Integer> list, int val)
    {
        
        
        int flag = -1;
if(list.contains(val)) {
           flag = list.indexOf(val);
           System.out.println(flag);
       }
        if(flag == -1){
            System.out.println("-1");
        }
       
        
    }
    
    // Function to sort list in decreasing order
    public static void DecOrder(ArrayList<Integer> list)
    {
       Collections.sort(list,Collections.reverseOrder());
    }
}
}
