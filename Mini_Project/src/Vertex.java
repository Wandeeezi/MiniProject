import java.util.ArrayList;

/**
 * 
 */

/**
 * @author MC
 *
 */
public class Vertex {
	
	private String data;
	private ArrayList<Edge> edges;
	
	public Vertex(String InputData)
	{
		this.data = InputData;
		this.edges = new ArrayList<Edge>();
	}
	
	public void addEdge(Vertex endVertex,Integer weight)
	{
		this.edges.add(new Edge(this,endVertex,weight));
	}
	
	public void removeEdge(Vertex endVertex)
	{
		this.edges.removeIf(edge -> edge.getEnd().equals(endVertex));
		
	}

	public String getData() {
		return this.data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public ArrayList<Edge> getEdges() {
		return this.edges;
	}

	public void setEdges(ArrayList<Edge> edges) {
		this.edges = edges;
	}
	
	
	public void print(boolean showweight) {
	    String message = "";

	    if (this.edges.size() == 0) {
	        System.out.println(this.data + " -->>");
	        return;
	    }

	    for (int i = 0; i < this.edges.size(); i++) {
	        if (i == 0) {
	            message += this.edges.get(i).getStart().data + " -->> ";
	        }

	        message += this.edges.get(i).getEnd().data;

	        if (showweight) {
	            message += " (" + this.edges.get(i).getWeight() + ")";
	        }
	        
	        if(i != this.edges.size() - 1) {
	        	message += " ";
	        }
	    }
	    System.out.println(message);
	}
}
