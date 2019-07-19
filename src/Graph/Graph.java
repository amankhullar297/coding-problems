package Graph;


public class Graph {
	Vertex[] vertex;
	int adjMatrix[][];
	int vertexCount;
	public Graph() {
		vertex=new Vertex[20];
		adjMatrix=new int[20][20];
		vertexCount=0;
		for(int i=0;i<20;i++)
		{
			for(int j=0;j<20;j++)
			{
				adjMatrix[i][j]=0;
			}	
		}
		for(int i=0;i<vertexCount;i++)
		{
			vertex[i].visited=false;
		}
	}
	
	public void addVertex(int value){
		vertex[vertexCount++]=new Vertex(value);
	}
	
	public void addEdge(int start,int end){
		adjMatrix[start][end]=1;
		adjMatrix[end][start]=1;
	}
}
