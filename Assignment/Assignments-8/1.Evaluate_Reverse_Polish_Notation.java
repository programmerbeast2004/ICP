class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer>st=new Stack<>();
        for(String token:tokens){
            if(isOperator(token)){
                int a=st.pop();
                int b=st.pop();
                int ans=applyOperator(token,b,a);
                st.push(ans);
            }else{
                st.push(Integer.parseInt(token));
            }
        }
        return st.pop();
    }
    public boolean isOperator(String s){
        return s.equals("+") || s.equals("*") || s.equals("-") || s.equals("/");
    }
    public int applyOperator(String s,int a,int b){
        switch(s){
            case "+":return a+b;
            case "-":return a-b;
            case "*":return a*b;
            case "/":return a/b;
            default:throw new IllegalArgumentException("Invalid");
        }
    }
}