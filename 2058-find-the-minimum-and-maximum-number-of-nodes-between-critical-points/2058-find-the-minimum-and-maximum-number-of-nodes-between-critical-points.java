class Solution {
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        if(head.next.next==null){
            return new int[]{-1,-1};
        }
        int[] arr = new int[2];
        ListNode a = head;
        ListNode b = a.next;
        ListNode c = a.next.next;
        int idx = 1;
        int ridx =-1;
        int lidx=-1;
        int min =Integer.MAX_VALUE;
        int prevCritIdx = -1;
        while(c!=null){
            if((b.val<a.val && b.val<c.val)||(b.val>a.val && b.val>c.val)){
                if(lidx==-1){
                    lidx=idx;
                }
                ridx=idx;
                if((idx-prevCritIdx)<min && prevCritIdx!=-1){
                    min=idx-prevCritIdx;
                }
                prevCritIdx=idx;
            }
            a=a.next;
            b=b.next;
            c=c.next;
            idx++;
        }
        if(prevCritIdx==-1 || prevCritIdx == lidx){
            return new int[]{-1,-1};
        }
        int max = ridx-lidx;
        arr[1]=max;
        arr[0]=min;
        return arr;
    }
}