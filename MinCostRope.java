import java.util.PriorityQueue;

public class MinCostRope {
    public static int minCostToConnectRopes(int[] ropes) {
        // Step 1: Create a Min Heap (Priority Queue) to store the rope lengths
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        // Step 2: Add all rope lengths to the Min Heap
        for (int rope : ropes) {
            minHeap.add(rope);
        }

        int totalCost = 0;

        // Step 3: Keep connecting the two smallest ropes until one rope remains
        while (minHeap.size() > 1) {
            // Step 3.1: Extract the two smallest ropes
            int first = minHeap.poll();
            int second = minHeap.poll();

            // Step 3.2: Compute the cost of connecting them
            int cost = first + second;
            totalCost += cost;

            // Step 3.3: Add the combined rope back to the heap
            minHeap.add(cost);
        }

        // Step 4: Return the total minimum cost
        return totalCost;
    }

    public static void main(String[] args) {
        int[] ropes1 = {4, 3, 2, 6}; // Example 1
        System.out.println(minCostToConnectRopes(ropes1)); // Output: 29

        int[] ropes2 = {1, 2, 3}; // Example 2
        System.out.println(minCostToConnectRopes(ropes2)); // Output: 9
    }
}
