package AD1.Theory_Assignment3;
// Java program to implement
// the above approach
import java.util.*;

class GFG{

// Function to insert vertices to adjacency list
static void insert(ArrayList<Integer> adj[],
				int u, int v)
{
	
	// Insert a vertex v to vertex u
	adj[u].add(v);
	return;
}

// Function to display adjacency list
static void printList(ArrayList<Integer> adj[], 
					int V)
{
	for(int i = 0; i < V; i++)
	{
		System.out.print(i);

		for(int j : adj[i])
			System.out.print(" --> " + j);
			
		System.out.println();
	}
	System.out.println();
}

// Function to convert adjacency
// list to adjacency matrix
static int[][] convert(ArrayList<Integer> adj[],
					int V)
{
	
	// Initialize a matrix
	int [][]matrix = new int[V][V];

	for(int i = 0; i < V; i++) 
	{
		for(int j : adj[i])
			matrix[i][j] = 1;
	}
	return matrix;
}

// Function to display adjacency matrix
static void printMatrix(int[][] adj, int V)
{
	for(int i = 0; i < V; i++) 
	{
		for(int j = 0; j < V; j++)
		{
			System.out.print(adj[i][j] + " ");
		}
		System.out.println();
	}
	System.out.println();
}

// Driver code
public static void main(String[] args)
{
	int V = 5;
	ArrayList<Integer> []adjList = new ArrayList[V];
	for(int i = 0; i < adjList.length; i++)
		adjList[i] = new ArrayList<Integer>();
		
	// Inserting edges
	insert(adjList, 0, 1);
	insert(adjList, 0, 4);
	insert(adjList, 1, 0);
	insert(adjList, 1, 2);
	insert(adjList, 1, 3);
	insert(adjList, 1, 4);
	insert(adjList, 2, 1);
	insert(adjList, 2, 3);
	insert(adjList, 3, 1);
	insert(adjList, 3, 2);
	insert(adjList, 3, 4);
	insert(adjList, 4, 0);
	insert(adjList, 4, 1);
	insert(adjList, 4, 3);
	// Display adjacency list
	System.out.print("Adjacency List: \n");
	printList(adjList, V);
	// Function call which returns
	// adjacency matrix after conversion
	int[][] adjMatrix = convert(adjList, V);
	// Display adjacency matrix
	System.out.print("Adjacency Matrix: \n");
	printMatrix(adjMatrix, V);
}
}

// This code is contributed by amal kumar choubey

