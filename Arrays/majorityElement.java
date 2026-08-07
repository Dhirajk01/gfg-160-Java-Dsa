import java.util.Collections;
import java.util.ArrayList;
import java.util.HashMap;

class Solution {
    public ArrayList<Integer> findMajority(int[] arr) {
        
        ArrayList<Integer> ans = new ArrayList<>();

        HashMap<Integer, Integer> h = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            h.put(arr[i], h.getOrDefault(arr[i], 0) + 1);
        }

        int n = (int) (arr.length / 3);

        for (int it : h.keySet()) {
            if (h.get(it) > n) {
                ans.add(it);
            }
        }

        Collections.sort(ans);
        return ans;
    }
}
