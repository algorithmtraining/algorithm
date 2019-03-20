public class SolutionJae{
    public List<List<Integer>> generate(int numRows){
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> tmp = null;

        for (int i = 0; i < numRows; i++){
            tmp = new ArrayList<Integer>();
            for (int j = 0; j <= i; j++){
                // 每一行的首尾元素都为1
                if (j == 0 || j == i){
                    tmp.add(1);
                }else{
                    tmp.add(res.get(i - 1).get(j - 1) + res.get(i - 1).get(j));
                }
            }
            res.add(tmp);
        }
        return res;
    }
}
