package com.chub.Graph;

import com.chub.Graph.StorageMethod.*;
import java.util.ArrayList;

public class Graph{
	OrGraph orGraph;
	UnorGraph unorGraph;
	boolean isWeightedGraph = false;
	boolean isOrgraph = false;
	boolean graphOnList = false;
	int noEdgeValue = 0;
	int existEdgeValue = 1;
	int numVertex = 0;
	int numEdge = 0;
	int[][] matrix;
	ArrayList <ArrayList <Pair>> list;
	
	
	////////////////////////////////////////////////////////
	public Graph (boolean isOrgraph, boolean isWeightedGraph){
		this.isOrgraph = isOrgraph;
		this.isWeightedGraph = isWeightedGraph;
	}
	
	public Graph (boolean isOrgraph, boolean isWeightedGraph, int noEdgeValue, int existEdgeValue){
		this.isOrgraph = isOrgraph;
		this.isWeightedGraph = isWeightedGraph;
		this.noEdgeValue = noEdgeValue;
		this.existEdgeValue = existEdgeValue;
	}
	
	public Graph (){ }
	
	////////////////////////////////////////////////////////
	
	public void input (){
		list = new ArrayList <ArrayList <Pair>> ();
		InputGraph input = new InputGraph (this);
	}
	
	public void output (){
		OutputGraph output = new OutputGraph (this);
	}
	
	public void info (){
		System.out.println ("---------Information about your graph---------");
		System.out.println ("Is orgraph - " + isOrgraph + ".");
		System.out.println ("Is weighted graph - " + isWeightedGraph + ".");
		if (!graphOnList){
			System.out.println ("Storage method - matrix.");
		}
		else{
			System.out.println ("Storage method - list.");
		}
		if (!isWeightedGraph){
			System.out.println ("Exist edge value - " + existEdgeValue + ".");
		}
		System.out.println ("No edge value - " + noEdgeValue + ".");
		System.out.println ("Number of vertices - " + numVertex + ".");
		System.out.println ("----------------------------------------------");
	}
}