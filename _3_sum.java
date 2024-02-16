import java.util.*;
public class _3_sum {
    public  List<List<Integer>> threeSum(int[] nums) {
    Set<List<Integer>> res  = new HashSet<>();
    if(nums.length==0) return new ArrayList<>(res);
    Arrays.sort(nums);
    for(int i=0; i<nums.length-2;i++){
        int j =i+1;
       int  k = nums.length-1;
        while(j<k){
            int sum = nums[i]+nums[j]+nums[k];
            if(sum==0)res.add(Arrays.asList(nums[i],nums[j++],nums[k--]));
            else if (sum >0) k--;
            else if (sum<0) j++;
        }

    }
    return new ArrayList<>(res);

}
}// class Solution {
//public List<List<Integer>> threeSum(int[] nums) {
//List<List<Integer>> ans = new ArrayList<>();
//Arrays.sort(nums);
//for (int i = 0 ; i < nums.length - 2; i++) {
//  if (i > 0 && nums[i] == nums[i-1]) {
//      continue;
//  }
//  int j  = i + 1;
//  int k = nums.length - 1;
//  while (j<k){
//      int sum = nums[i] + nums[j] + nums[k];
//      if (sum == 0){
//          List<Integer> li = new ArrayList<>();
//          li.add(nums[i]);
//          li.add(nums[j]);
//          li.add(nums[k]);
//          ans.add(li);
//          while (j<k && nums[j] == nums[j+1]){
//              j++;
//          }
//          while (j<k && nums[k] == nums[k-1]){
//              k--;
//          }
//          j++;
//          k--;
//      } else if (sum<0){
//          j++;
//      } else{
//          k--;
//      }
//  }
//}
//return ans;

//}
//}
class Solutiossssn {
public List<List<Integer>> threeSum(int[] nums) {
Arrays.sort(nums);
boolean[] bitmap = new boolean[100001];
for (int n : nums) {
 if (n > 0) {
     bitmap[n] = true;
 }
}
ArrayList<List<Integer>> result = new ArrayList();
int f = -10000000;
int s = -10000000;
int max = nums[nums.length - 1];
for (int i = 0; i < nums.length - 2; i++) {
 if (nums[i] == f) {
     continue;
 }
 f = nums[i];
 if (f > 0) {
     break;
 }
 for (int j = i + 1; j < nums.length - 1; j++) {
     if (nums[j] == s) {
         continue;
     }
     s = nums[j];
     int req = 0 - f - s;
     if (req > max) {
         continue;
     }
     if (req < 0) {
         break;
     }
     if (req == s && nums[j + 1] == s) {
         result.add(List.of(f, s, req));
     }
     else if (req > s && bitmap[req]) {
         result.add(List.of(f, s, req));
     }
 }
}
return result;
}
}
