class Solution {
	
	public void reverse(int arr[], int s, int l) {
		while (s < l) {
			int temp = arr[s];
			arr[s] = arr[l];
			arr[l] = temp;
			s++;
			l--;
		}
	}
	public void rotateArr(int arr[], int d) {
		// code here
		d = d % arr.length;
		
		reverse(arr, 0, d - 1);
		
		reverse(arr, d, arr.length - 1);
		
		reverse(arr, 0, arr.length - 1);
		
	}
}
