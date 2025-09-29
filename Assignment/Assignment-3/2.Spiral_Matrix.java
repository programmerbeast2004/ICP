class Solution {
    public List<Integer> spiralOrder(int[][] arr) {
        List<Integer> lst=new ArrayList<>();
        if(arr==null || arr.length==0){
            return lst;
        }
        
        int minc=0;
        int minr=0;
        int maxc=arr[0].length - 1;
        int maxr=arr.length - 1;

        while(minr<=maxr && minc<=maxc){ 
            for(int i=minc;i<=maxc;i++){
                lst.add(arr[minr][i]);
            }
            minr++;
            for(int i=minr;i<=maxr;i++) {
                lst.add(arr[i][maxc]);
            }
            maxc--;
            if(minr<=maxr){
                for(int i=maxc;i>=minc;i--){
                    lst.add(arr[maxr][i]);
                }
                maxr--;
            }
            if (minc<=maxc) {
                for(int i=maxr;i>=minr;i--){
                    lst.add(arr[i][minc]);
                }
                minc++;
            }
        }
        return lst;
    }
}