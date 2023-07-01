import java.util.HashMap;

public class single_times {
	static int singleElement(int[] arr , int N) {
		
		HashMap <Integer,Integer> map=new HashMap<>();
		for(int i=0;i<N;i++) {
			int n=arr[i];
			if(map.containsKey(n)) {
				map.put(n, map.get(n)+1);
			}
			else {
				map.put(n, 1);
			}
		}
		for(int key:map.keySet()) {
			if(map.get(key)<2)
			return key;
		}
        return -1;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
