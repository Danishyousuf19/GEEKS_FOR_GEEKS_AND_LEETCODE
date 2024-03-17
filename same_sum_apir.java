import java.util.*;

public class same_sum_apir {
	public static int countPairs(LinkedList<Integer> head1, LinkedList<Integer> head2,
            int x) {
HashSet<Integer> set = new HashSet<>();
int count = 0;
for (int num : head1)
set.add(num);
for (int num : head2)
if (set.contains(x - num))
  count++;
return count;
}
}
