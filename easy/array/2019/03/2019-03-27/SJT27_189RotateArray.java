package com.jt.easy.array.d201903;
/*

*/
public class SJT27_189RotateArray
{
	public void rotate(int[] nums, int k) {
        if(nums==null || nums.length<=1 || k==0 || k%nums.length==0) return;
        int len = nums.length;   
        int var = nums[0];//要将其归为的值
        int temp;//为被插入位置的值的备份
        int index=0;
        int indexUsed=0;//err1:某个数在位置i转k个位置，有可能最后又回到了i位置（位置i，i+k，i+2k,..上的数更新了）,而其他位置如i+1，i+k+1，i+2k+1,..等没更新
        for(int n=1; n<=len; n++)
        {
            temp = nums[(index+k)%len];//先备份
            nums[(index+k)%len]=var;//移到最终位置
            var = temp;
            index = (index+k)%len;
            if(index==indexUsed)
            {
                index++;
                indexUsed++;
                var=nums[index];
            }
                
        }
    }
    public static void main(String[] args)
	{
    	SJT27_189RotateArray array = new SJT27_189RotateArray();
    	int[] a = new int[] {1,2,3,4,5,6};
    	array.rotate(a, 2);
    	for (int i = 0; i < a.length; i++)
		{
			System.out.println(a[i] + " ");
		}
	}
}
/*

*/