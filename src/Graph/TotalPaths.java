package Graph;

import java.util.Arrays;

public class TotalPaths {
	
	public static int totalPaths(int source,int destination,Graph graph){
		boolean[] visited=new boolean[graph.vertexCount];
		Arrays.fill(visited, false);
		int pathCount=0;
		pathCount=totalPathUtil(source, destination, visited, pathCount, graph);
		return pathCount;
    	}
	
	public static int totalPathUtil(int source,int destination,boolean[] visited,int pathCount,Graph graph){
		graph.vertex[source].visited=true;
		if(source==destination){
			pathCount++;
		}
		else{
			for(int i=0;i<graph.vertexCount;i++){
				if(graph.adjMatrix[source][i]==1 && graph.vertex[i].visited==false){
						pathCount=totalPathUtil(i, destination, visited, pathCount, graph);
				}
			}
		}
		graph.vertex[source].visited=false;
		return pathCount;
	}

	public static void main(String[] args) {
		Graph graph=new Graph();
		graph.addVertex(0);
		graph.addVertex(1);
		graph.addVertex(2);
		graph.addVertex(3);
		graph.addVertex(4);
		graph.addEdge(0, 1); 
		graph.addEdge(0, 2); 
		graph.addEdge(0, 3); 
		graph.addEdge(2, 0); 
		graph.addEdge(2, 1); 
		graph.addEdge(1, 3); 
		System.out.println(totalPaths(0, 4, graph));
	}

}
