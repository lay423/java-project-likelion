package algorithm.week12.java1207;

import java.security.Key;
import java.util.PriorityQueue;

public class Scoville {
    public int solution(int[] scoville, int K) {
        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> a - b);
        for (int i = 0; i < scoville.length; i++) {
            pq.add(scoville[i]);
        }
        int answer =0;
        while (pq.peek() < K && pq.size()>=2) {
            int mix = pq.poll() + (pq.poll() * 2);
            pq.add(mix);
            answer++;
        }
        if(pq.peek() < K) return -1;
        return answer;
    }
    public static void main(String[] args) {

    }
}
