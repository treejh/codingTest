import java.util.ArrayList;
import java.util.Stack;

class Solution {
    public ArrayList<Integer>[] adjList;
    public int N, answer;

    class Node {
        int id;
        boolean visited; // false=처음 방문, true=자식 처리 완료
        Node(int id) { this.id = id; visited=false; }
    }

    public int solution(int n, int[][] wires) {
        N = n;
        answer = n - 1;
        adjList = new ArrayList[n + 1];
        for (int i = 1; i <= n; i++) {
            adjList[i] = new ArrayList<>();
        }

        for (int[] wire : wires) {
            adjList[wire[0]].add(wire[1]);
            adjList[wire[1]].add(wire[0]);
        }

        int[] subTreeSize = new int[n + 1]; // 각 노드 서브트리 크기
        boolean[] visited = new boolean[n + 1];
        Stack<Node> stack = new Stack<>();
        stack.push(new Node(1));

        while (!stack.isEmpty()) {
            Node node = stack.peek();

            if (!node.visited) {
                node.visited = true; // 자식 탐색 시작
                visited[node.id] = true;

                for (int next : adjList[node.id]) {
                    if (!visited[next]) {
                        stack.push(new Node(next));
                    }
                }
            } else {
                stack.pop(); // 자식 처리 완료
                int sum = 0;

                for (int next : adjList[node.id]) {
                    if (subTreeSize[next] > 0) { // 이미 처리된 자식
                        sum += subTreeSize[next];
                        answer = Math.min(answer, Math.abs(N - 2 * subTreeSize[next]));
                    }
                }

                subTreeSize[node.id] = sum + 1; // 자기 자신 포함
            }
        }

        return answer;
    }
}
