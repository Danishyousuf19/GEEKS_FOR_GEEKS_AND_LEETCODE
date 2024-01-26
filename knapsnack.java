import java.util.Arrays;
import java.util.Comparator;

public class knapsnack {
	class Item {
	    int value, weight;
	    Item(int x, int y){
	        this.value = x;
	        this.weight = y;
	    }
	}
	

	class Solution
	{
	    //Function to get the maximum total value in the knapsack.
	    
	        // Your code here
	    // Sorting items based on value-to-weight ratio in descending order.
	    public double fractionalKnapsack(int capacity, Item[] items, int numItems) {
	    // Sorting items based on value-to-weight ratio in descending order.
	        Arrays.sort(items, new Comparator<Item>() {
	            @Override
	            public int compare(Item item1, Item item2) {
	                double ratio1 = (double) item1.value / item1.weight;
	                double ratio2 = (double) item2.value / item2.weight;
	                return Double.compare(ratio2, ratio1);
	            }
	        });

	    // Variables to store the result and track the current position in the sorted list.
	    double totalValue = 0;
	    int currentPosition = 0;

	    // Loop until either the knapsack is full or all items are considered.
	    while (currentPosition < numItems) {
	        if (items[currentPosition].weight <= capacity) {
	            totalValue += items[currentPosition].value;
	            capacity -= items[currentPosition].weight;
	        } else {
	            totalValue += (capacity * ((double) items[currentPosition].value / items[currentPosition].weight));
	            break;
	        }

	        currentPosition++;
	    }

	    return totalValue;
	    }
	}
}
