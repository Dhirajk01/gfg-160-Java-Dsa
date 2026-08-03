class Solution {
	public int getSecondLargest(int[] arr) {
		// code here
		int firstMax = 0;
		int secMax = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > firstMax) {
				secMax = firstMax;
				firstMax = arr[i];
			}
			else if (arr[i] > secMax && arr[i] != firstMax) {
				secMax = arr[i];
			}
			
		}
		
		// handle if all element same
		int ans = (secMax==0) ? -1 : secMax;
		
		return ans;
	}
}
