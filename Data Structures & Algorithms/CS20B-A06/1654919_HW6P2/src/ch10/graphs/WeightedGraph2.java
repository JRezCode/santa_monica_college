package ch10.graphs;

import java.util.Arrays;

import ch04.queues.*;

public class WeightedGraph2<T> extends WeightedGraph<T> {

	//countEdges accepts a parameterized object and returns count of connections with vertices
	public int countEdges(T node) {
		//initialize variable
		int edges = 0;

		//process each of the vertices in the array
		for (int i = 0; i<vertices.length; i++) {
			if(vertices[i]!=null) {
				//System.out.println(vertices[i]);		//for self check
				if(edgeExists(node,vertices[i]))	
				//calls edgeExists() method and increases count
					edges++;
			}
		}
		return edges;
	}

	public int commonConnections(QueueInterface<T> toVertices, QueueInterface<T> toVertices2) {
		//Implements a comparator or iterator here instead perhaps??
		//Only works for up to 100 common connections
		T hold1[] = (T[]) new Object[100];
		int i = 0;
		while(!toVertices.isEmpty()) {
			hold1[i] = (T) toVertices.dequeue();		//dequeue all from vertex a into array
			i++;
		}
		System.out.print("V1 connections: ");
		for (T e : hold1) {
			if(e!=null)
				System.out.print(e+",");
		}
		System.out.println();

		//Now compare it to the vertex b dequeue
		int result = 0;
		System.out.print("V2 connections: ");
		while(!toVertices2.isEmpty()) {
			T hold = toVertices2.dequeue();
			System.out.print(String.valueOf(hold.toString())+",");
			for (int c = 0; c< hold1.length;c++){
				if(String.valueOf(hold).equals(hold1[c]))
					result++;		
				}	
			}
		
		System.out.print("\nIn common:  ");
		return result;
	}
	
}	
//		//Another way of comparing the values in the vertices array
//		int index_1 = 0 ;
//		int index_2 = 0 ;
//		boolean found_one = false;
//		boolean found_both;
//		for (int i = 0; i<vertices.length; i++) {
//			if(vertices[i].equals(String.valueOf(a)) || vertices[i].equals(String.valueOf(b))) {
//				if(found_one)
//				{
//					index_2=i;
//					found_both=true;
//				}
//				else
//				{	
//					index_1=i;
//					found_one=true;
//				}
//			}
//		}
//		int edges = 0;
//		for(int i = 0; i<vertices.length; i++)
//		{			
//			if(edgeExists(vertices[index_1],vertices[i]) && edgeExists(vertices[index_2],vertices[i]))
//				edges++;
//		}		
//		return edges;
//	}
