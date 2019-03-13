class Solution{
for (int i = 0; i < nums.length; i++) {
				int a =target-nums[i];
				for (int j = i+1; j < nums.length; j++) {
					if (a==nums[j]) {
						return new int[] {i,j};
					}
					
				}
			}
    		return null;
        
}
