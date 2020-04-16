class Solution {
    public int lastStoneWeight(int[] stones) {

        //  The elements of the priority queue are ordered by default in natural order.
        // We need max element at top so that when we poll the queue we get maximum element.(out of all the elements present in a queue).
        // Collections.reverseOrder() is used to reverse the natural ordering. So that we get the max element at the top of the priority queue.


PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        for(int value: stones){
            pq.add(value);
        }
        while(pq.size() > 1)
        {
            int x = pq.poll();
            int y = pq.poll();
            if(x != y)
            {
                pq.add(x-y);
            }
        }
        return pq.size() == 0? 0: pq.peek();      
    }
}