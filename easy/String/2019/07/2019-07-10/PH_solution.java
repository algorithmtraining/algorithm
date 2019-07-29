class Solution {
    public boolean isValid(String s) { //出现左括弧则进栈；

　                                    //　出现右括弧则首先检测栈是否为空，

　　　　                              //若栈空则表明此右括弧多余，表达式不匹配。

　　　                             　 //否则和栈顶数据比较，若匹配则栈顶出栈。

　　　　                              //否则表明表达式不匹配；

　　                                //最后若栈空，则表明匹配成功；否则表明不匹配。
                                  //Runtime: 1 ms, faster than 98.30% of Java online submissions for Valid Parentheses.
                                 //Memory Usage: 34.1 MB, less than 100.00% of Java online submissions for Valid Parentheses.                            
                                     
        Stack<Character> stack = new Stack<Character>() ;
        char[] cc= s.toCharArray();
        int i =0;
        for(;i<cc.length;i++)
        {
            if(cc[i] == '(' || cc[i] =='{' || cc[i] == '[')
            {
                stack.push(cc[i]);
            }

            else{
                if(!stack.empty())
                {
                    if(cc[i] == ')')
                    {
                        if(stack.peek() == '(')
                        {
                            stack.pop();
                            continue; 
                        }
                         else
                        {
                            return false;
                        }

                    }
                    if(cc[i] == '}')
                    {
                        if(stack.peek() == '{')
                        {
                            stack.pop();
                            continue;
                        }
                        else
                        {
                            return false;
                        }
                    }
                    if(cc[i] == ']')
                    {
                        if(stack.peek() == '[')
                        {
                            stack.pop();
                            continue;
                        }
                        else
                        {
                            return false;
                        }
                    }

                    else{
                        return false;
                    }
                }
             else{
                 return false;
                }
            }
        }
        if(stack.empty() && i == cc.length)
        {
            return true;
        }
        else return false;
    }
}
