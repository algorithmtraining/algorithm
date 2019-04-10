class SolutionJae {

    public List<Integer> findDisappearedNumbers(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length && count < nums.length; i++)
        {
            int current = i;
            int next = nums[i] - 1;
            int temp = next;
            if (nums[current] == 0) {
                continue;
            }
            while (next >= 0){
                temp = nums[next] - 1;
                if (nums[next] != 0){
                    nums[next] = 0;
                    count++;
                }
                next = temp;
            }
        }

        List<Integer> result = new ArrayList<>();
        for (int j = 0; j < nums.length; j++){
            if (nums[j] != 0){
                result.add(j+1);
            }
        }
        return result;
    }
}
