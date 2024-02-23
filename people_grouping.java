import java.util.*;

public class people_grouping {
	public static List<List<Integer>> groupThePeople(int[] groupSizes) {
        // Initialize a list to store the result
        List<List<Integer>> result = new ArrayList<>();
        
        // Map to store groups where key is group size and value is a list of people
        Map<Integer, List<Integer>> groups = new HashMap<>();
        
        // Iterate through the array of group sizes
        for (int i = 0; i < groupSizes.length; ++i) {
            // Get the group size for the current person
            int size = groupSizes[i];
            
            // Get or create a list for this group size
            List<Integer> group;
            if (groups.containsKey(size)) {
                group = groups.get(size);
            } else {
                group = new ArrayList<>();
                groups.put(size, group);
            }
            
            // Add the person to the group
            group.add(i);
            
            // If the group size matches the number of people in the list, add it to the result
            if (group.size() == size) {
                result.add(group);
                // Create a new empty list for the next group of the same size
                groups.put(size, new ArrayList<>());
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] groupSizes = {3, 3, 3, 3, 3, 1, 3};
        List<List<Integer>> groupedPeople = groupThePeople(groupSizes);
        System.out.println("Grouped people: " + groupedPeople);
    }
}
