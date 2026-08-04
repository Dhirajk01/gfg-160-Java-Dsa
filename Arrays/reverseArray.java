class Solution {
	public void reverseArray(int arr[]) {
		// code here
		int s = 0;
		int l = arr.length - 1;
		while (s <= l) {
			int temp = arr[s];
			arr[s] = arr[l];
			arr[l] = temp;
			s++;
			l--;
		}
		
	}
}
