package com.jt.easy.array.d201903;
import java.util.HashMap;
import java.util.Map;

public class SJT10_1TwoSum {
    //思路：用map存储当前数组元素及其索引作为下一个查找的另一半，若在map中再次找到（另一半），resolved
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> map = new HashMap<Integer,Integer>();
        for(int i=0; i < nums.length ; i++)
        {            
            //if(nums[i] <= target) 输入的数正负都可以 error1
            //{
                int buNum = target-nums[i];
                if(map.get(buNum)!=null)//找对象，找到，就成对
                {
                    return new int[] {map.get(buNum),i};//领证
                }
                map.put(nums[i],i);//没找到，在map登记，有合适的再说                
            //}
        }
        return null;
    }
    public static void main(String[] args)
	{ 
    	SJT10_1TwoSum jt1TwoSum = new SJT10_1TwoSum();
		int[] test = {2, 7, 11, 15};	
		int[] result = jt1TwoSum.twoSum(test,9);
        for (int i = 0; i < result.length; i++)
		{
			System.out.println(result[i] + " ");
		}
        int[] test2 = {-3, 4, 3, 90};	
		int[] result2 = jt1TwoSum.twoSum(test2,0);
        for (int i = 0; i < result2.length; i++)
		{
			System.out.println(result2[i] + " ");
		}
	}
}