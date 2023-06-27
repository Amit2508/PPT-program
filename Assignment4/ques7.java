class Solution {
    public int maxCount(int m, int n, int[][] ops) {
        int k=ops.length;
        for (int i=0;i<k;i++)
        {
            int z=ops[i][0] ,x=ops[i][1];
            n=Math.min(n,x);
            m=Math.min(m,z);
        }
        return (m*n);
    }
}
