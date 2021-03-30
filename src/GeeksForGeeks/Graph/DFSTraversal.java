package Graph;
import java.util.Stack;
public class DFSTraversal {
	
	public static void dfsTraversal(Graph graph){
		Stack<Vertex> stack=new Stack<>();
		stack.push(graph.vertex[0]);
		graph.vertex[0].visited=true;
		System.out.println(graph.vertex[0].value);
		while(!stack.isEmpty()){
			int v=getUnvisitedElement(stack.peek().value, graph);
			if(v==-1){
				stack.pop();
			}
			else{
				graph.vertex[v].visited=true;
				System.out.println(graph.vertex[v].value);
				stack.push(graph.vertex[v]);
			}
		}
	}
	
	public static int getUnvisitedElement(int v,Graph graph){
		for(int i=0;i<graph.vertexCount;i++){
		if(graph.adjMatrix[v][i]==1 && graph.vertex[i].visited==false){
				return i;
			} 
		}
		return -1;
	}
	
	public static void main(String[] args){
		Graph graph=new Graph();
		graph.addVertex(0);
		graph.addVertex(1);
		graph.addVertex(2);
		graph.addVertex(3);
		graph.addVertex(4);
		graph.addVertex(5);
		graph.addVertex(6);
		graph.addVertex(7);
		graph.addEdge(0, 4);
		graph.addEdge(4, 1);
		graph.addEdge(4, 7);
		graph.addEdge(1, 2);
		graph.addEdge(1, 5);
		graph.addEdge(5, 6);
		graph.addEdge(6, 7);
		graph.addEdge(2, 3);
		for(int i=0;i<graph.vertexCount;i++)
		{
			for(int j=0;j<graph.vertexCount;j++)
			{
				System.out.print(graph.adjMatrix[i][j]+" ");
			}
			System.out.println();
		}
		dfsTraversal(graph);
	}
}