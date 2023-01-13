public class MyGraph {
    private int[][] graph;
    private boolean[] visited;
    public MyGraph(int n) {
        graph = new int[n][n];
        visited = new boolean[n];

        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                graph[i][j] = 0;
            }
        }
        for (int i = 0; i < n; i++){
            visited[i] = false;
        }
    }

    public void addEdge(int from, int to){
        graph[from][to] = 1;
        graph[to][from] = 1;
    }
    @Override
    public String toString(){
        int n = graph[0].length;
        String returnValue = "";
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                returnValue = returnValue + graph[i][j] + "\t";
            }
            returnValue = returnValue + "\n";
        }
        return returnValue;
    }

    public void bfs(int start){
    }

    public static void main(String[] args) {
        MyGraph aGraph = new MyGraph(5);

        aGraph.addEdge(0,1);
        aGraph.addEdge(4,1);
        aGraph.addEdge(3,1);
        aGraph.addEdge(3,1);

        System.out.println(aGraph.toString());
    }
}
