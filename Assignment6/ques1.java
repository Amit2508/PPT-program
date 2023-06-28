class Solution {
    public int[] diStringMatch(String s) {
        int len = s.length(),b=0,e=len,i=0;
        int res[]= new int[len+1];
        int id=-1;
        char ch[]=s.toCharArray();
        for(i=0;i<len;i++){
            if(ch[i]=='I'){
                res[i]=b;
                b++;
            }
            else{
                res[i]=e;
                e--;
            }
        }
        res[i]=b;
        return res;
    }
}
