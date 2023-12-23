import java.util.*;

public class cordinate {
	

	     public boolean isPathCrossing(String path) {
	         Set<String> set = new HashSet<>();
	         set.add("0-0");
	         int x = 0;
	         int y = 0;

	         for (char c : path.toCharArray()) {
	             switch (c) {
	                 case 'N':
	                     y++;
	                     break;
	                 case 'S':
	                     y--;
	                     break;
	                 case 'W':
	                     x--;
	                     break;
	                 case 'E':
	                     x++;
	                     break;                                                    
	                 default:
	                     break;
	             }
	             String coordinates = getCoordinates(x, y);
	             if (set.contains(coordinates)) {
	                 return true;
	             }
	             set.add(coordinates);
	         }           
	         return false;
	     }

	     private String getCoordinates(int x, int y) {
	         StringBuilder stringBuilder = new StringBuilder();
	         stringBuilder.append(x);
	         stringBuilder.append("-");
	         stringBuilder.append(y);
	         return stringBuilder.toString();
	     }
	 }
	 
//	 class Solution {
//	      public boolean isPathCrossing(String path) {
//	         Map<Character, Pair<Integer, Integer>> moves = new HashMap();
//	         moves.put('N', new Pair(0, 1));
//	         moves.put('S', new Pair(0, -1));
//	         moves.put('W', new Pair(-1, 0));
//	         moves.put('E', new Pair(1, 0));
//	         
//	         Set<Pair<Integer, Integer>> visited = new HashSet();
//	         visited.add(new Pair(0, 0));
//	         
//	         int x = 0;
//	         int y = 0;
//	         
//	         for (Character c : path.toCharArray()) {
//	             Pair<Integer, Integer> curr = moves.get(c);
//	             int dx = curr.getKey();
//	             int dy = curr.getValue();
//	             x += dx;
//	             y += dy;
//	             
//	             Pair<Integer, Integer> pair = new Pair(x, y);
//	             if (visited.contains(pair)) {
//	                 return true;
//	             }
//	             
//	             visited.add(pair);
//	         }
//	         
//	         return false;
//	     }
	 


}
