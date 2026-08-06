class Solution {
	void nextPermutation(int[] arr) {
		// code here
		int n = arr.length;
		int i = n - 2;
		int j = n - 1;
		
		// find pivot element
		int idx = -1;
		while (i >= 0 && arr[i] >= arr[i + 1]) {
			i--;
			
		}
		//	store pivot index
		idx = i;
		
		// if element is sorted then reverse
		if (idx == -1) {
			int start = 0;
			int last = n - 1;
			
			while (start<last) {
				int temp = arr[start];
				arr[start] = arr[last];
				arr[last] = temp;
				start++;
				last--;
				
			}
			return;
		}
		
		// find element greater than pivot element
		int idx1 = -1;
		while (j >= 0) {
			if (arr[idx] < arr[j]) {
				break;
			}
			j--;
			
		}
		
		idx1 = j;
		
		// swap pivot element with greater element
		int t = arr[idx1];
		arr[idx1] = arr[idx];
		arr[idx] = t;
		
		// reverse all element from pivot index +1
		idx = idx + 1;
		int l = n - 1;
		
		while (idx < l) {
			int temp = arr[idx];
			arr[idx] = arr[l];
			arr[l] = temp;
			idx++;
			l--;
		}
	}
}
