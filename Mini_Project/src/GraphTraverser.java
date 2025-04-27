import java.util.ArrayList;

public class GraphTraverser {

    public static void depthFirstTraversal(Vertex start, ArrayList<Vertex> visited) {
		System.out.println(start.getData());
		
		for(Edge e: start.getEdges()) {
			Vertex neighbor = e.getEnd();
			
			if(!visited.contains(neighbor)) {
				visited.add(neighbor);
				depthFirstTraversal(neighbor, visited);
			}
		}
	}
	
	public static void breadthFirstSearch(Vertex start, ArrayList<Vertex> visited) {
		Queue visitQueue = new Queue();
		visitQueue.enqueue(start);
		while(!visitQueue.isEmpty()) {
			Vertex current = visitQueue.dequeue();
			System.out.println(current.getData());
			
			for(Edge e: current.getEdges()) {
				Vertex neighbor = e.getEnd();
				if(!visited.contains(neighbor)) {
					visited.add(neighbor);
					visitQueue.enqueue(neighbor);
				}
			}
		}
	}
}
