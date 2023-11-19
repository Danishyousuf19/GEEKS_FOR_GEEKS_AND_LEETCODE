import java.util.ArrayList;
import java.util.Arrays;

public class interssection_of_arr {
public int[] intersect(int[] nums1, int[] nums2) {
	ArrayList<Integer>list=new ArrayList<>();
	int i=0;int j=0;
	Arrays.sort(nums1);
	Arrays.sort(nums2);
	while(i<nums1.length&&j<nums2.length) {
		if(nums1[i]>nums2[j])j++;
		else if(nums1[i]<nums2[j])i++;
		else {
			list.add(nums1[i]);
			i++;j++;
		}
	} int[] res=new int[list.size()];
	int k = 0;
    while(k < list.size()){
        res[k] = list.get(k);
        k++;
    }
       
        return res;
    }
public int[] intnersect(int[] nums1, int[] nums2) {
    int[] temp = new int[1001];
    for(int i = 0;i < nums1.length; i++){
        temp[nums1[i]]++;
    }
    ArrayList<Integer> arr = new ArrayList<>();
    for(int i = 0; i < nums2.length ;i++){
        if(temp[nums2[i]] > 0){
            arr.add(nums2[i]);
            temp[nums2[i]]--;
        }
    }
    int[] res = new int[arr.size()];
    for(int i = 0; i<arr.size(); i++){
        res[i] = arr.get(i);
    }
    return res;
}
}
