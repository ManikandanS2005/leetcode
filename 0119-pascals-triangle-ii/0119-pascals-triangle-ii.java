class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> ar=new ArrayList<Integer>();
        long  res=1;

        for(int i=0;i<=rowIndex;i++)
        {
             ar.add((int)res);
            res=res*(rowIndex-i);
            res=res/(i+1);
           
        }
        return ar;
    }
}