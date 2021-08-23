class Solution {
    public int solution(int n, int[][] computers) {
        int answer = 0;
        boolean[] visited = new boolean[computers.length];
        
        for(int i=0; i<computers.length; i++)
            visited[i]=false;
        
        for(int i=0; i<computers.length; i++){
            if(visited[i]==false){
                answer++;
                dfs(i,visited,computers);
            }
        }
        return answer;
    }
    public void dfs(int now, boolean[] visited, int[][] computers){
        visited[now]=true;
        for(int i=0; i<computers.length; i++){
            if(visited[i]==false&&computers[now][i]==1)
                dfs(i,visited,computers);
        }
    }
}