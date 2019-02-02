package tree;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Keys_and_Rooms {

	public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        Queue<Integer> q = new LinkedList<>();
        int[] visited = new int[rooms.size()];
        q.offer(0);
        while(!q.isEmpty()){
            int front = q.poll();
            if(visited[front] == 1)   continue;
            visited[front] = 1;
            for(int i : rooms.get(front)){
                q.offer(i);
            }
        }
        int n = 0;
        for(int i = 0; i < visited.length; ++i){
            n += visited[i];
        }
        return n == rooms.size();
    }
}
