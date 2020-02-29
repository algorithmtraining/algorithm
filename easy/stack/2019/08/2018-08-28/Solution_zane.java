class Solution {
    public String removeOuterParentheses(String S) {
        int lnum = 1;
        int rnum = 0;
        StringBuilder sBuilder = new StringBuilder();
        for(int i=1;i<S.length();i++){
            if(S.charAt(i)=='('){
                lnum ++;
            }else{
                rnum++;
            }

            if(lnum == rnum){
                i++;
                lnum =1;
                rnum =0;
            }else{
                sBuilder.append(S.charAt(i));
            }
        }
        return sBuilder.toString();
    }

    public static void main(String arg[]) {
        Solution solution  = new  Solution();
      String tmep =  solution.removeOuterParentheses("(((())))");
      System.out.println(tmep);
    }
}