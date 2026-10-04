

class Solution {
    public int[][] merge(int[][] intervals) {
        if(intervals.length <= 1){
            return intervals;
        }

        Arrays.sort(intervals, (a,b) -> Integer.compare(a[0],b[0]));

        List<int[]> list = new ArrayList<>();
        int[] curr = intervals[0];
        list.add(curr);

        for(int i=1;i<intervals.length;i++){
            int[] next = intervals[i];
            if(next[0] <= curr[1]){
                curr[1] = Math.max(curr[1],next[1]);
            }else{
                curr = next;
                list.add(curr);
            }
        }

        return list.toArray(new int[list.size()][]);
    }
}
