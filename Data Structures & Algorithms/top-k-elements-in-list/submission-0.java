class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer>mp=new HashMap<>();
        for(int a:nums){
            mp.put(a,mp.getOrDefault(a,0)+1);
        }
        PriorityQueue<Integer> pq=new PriorityQueue<>((a,b)->mp.get(a)-mp.get(b));
            for(int d:mp.keySet()){
                pq.offer(d);
                if(pq.size()>k){
                    pq.poll();
                }
            }
            int[] ans=new int[k];
            for(int i=k-1;i>=0;i--){
                ans[i]=pq.poll();
            }
            return ans;
        }
    }

