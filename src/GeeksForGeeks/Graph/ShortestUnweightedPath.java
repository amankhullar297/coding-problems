package Graph;

import java.util.LinkedList;
import java.util.Queue;

public class ShortestUnweightedPath {
	
	public static int[] shortestUnweightedPath(Vertex source,Graph graph){
		int[] distance=new int[graph.vertexCount];
		int[] path=new int[graph.vertexCount];
		for(int i=0;i<distance.length;i++){
			distance[i]=-1;
		}
		distance[source.value]=0;
		Queue<Vertex> queue=new LinkedList<>();
		int v,w;
		queue.offer(source);
		while(!queue.isEmpty()){
			 v=queue.poll().value;
			 for(int j=0;j<graph.vertexCount;j++){
				 if(graph.adjMatrix[v][j]==1){
					 if(distance[j]==-1){
					 w=graph.vertex[j].value;
					 distance[w]=distance[v]+6;
					 path[w]=v;
					 queue.offer(graph.vertex[j]);
					 }
				  }
			 }
		}
		return distance;
	}

	public static void main(String[] args) {
		Graph graph=new Graph();
		graph.addVertex(0);
		graph.addVertex(1);
		graph.addVertex(2);
		graph.addEdge(1, 2);
		int[] distance=shortestUnweightedPath(graph.vertex[1], graph);
		for(int i=0;i<distance.length;i++){
			if(i==graph.vertex[1].value)
				continue;
			System.out.println(distance[i]);
		}
	}

}
