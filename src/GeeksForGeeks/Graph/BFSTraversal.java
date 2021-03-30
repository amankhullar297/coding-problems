package Graph;

import java.util.LinkedList;
import java.util.Queue;

public class BFSTraversal {

	public static void bfsTraversal(Graph graph){
		Queue<Vertex> queue=new LinkedList<>();
		queue.offer(graph.vertex[0]);
		System.out.println(graph.vertex[0].value);
		graph.vertex[0].visited=true;
		while(!queue.isEmpty()){
			int v=queue.poll().value;
			for(int i=0;i<graph.vertexCount;i++){
				if(graph.adjMatrix[v][i]==1 && graph.vertex[i].visited==false){
					System.out.println(graph.vertex[i].value);
					queue.offer(graph.vertex[i]);
					graph.vertex[i].visited=true;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		Graph graph=new Graph();
		graph.addVertex(0);
		graph.addVertex(1);
		graph.addVertex(2);
		graph.addVertex(3);
		graph.addVertex(4);
		graph.addVertex(5);
		graph.addVertex(6);
		graph.addVertex(7);
		graph.addEdge(0, 1);
		graph.addEdge(1, 2);
		graph.addEdge(2, 3);
		graph.addEdge(2, 4);
		graph.addEdge(1, 7);
		graph.addEdge(7, 4);
		graph.addEdge(4, 5);
		graph.addEdge(4, 6);
		for(int i=0;i<graph.vertexCount;i++)
		{
			for(int j=0;j<graph.vertexCount;j++)
			{
				System.out.print(graph.adjMatrix[i][j]+" ");
			}
			System.out.println();
		}
		bfsTraversal(graph);
	}
}
