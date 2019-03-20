public class SolutionJae{
    public List<Integer> getRow(int rowIndex) {
        List<Integer> res = new ArrayList<>(rowIndex+1);
        int ori = 1;  // 保存计算前的值
        int tmp = ori; // 临时变量
        for (int i = 0; i <= rowIndex; i++){
            if (i == 0){
                res.add(1);
            }
            for (int j = 1; j <= i; j++){
                if (j == i){
                    res.add(1);
                }else{
                    tmp = res.get(j);
                    res.set(j, res.get(j) + ori);
                    ori = tmp;
                }
            }
        }
        return res;
    }
}
