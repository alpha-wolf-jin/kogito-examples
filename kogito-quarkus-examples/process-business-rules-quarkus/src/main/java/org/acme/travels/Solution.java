package org.acme.travels;


public class Solution {

	private java.lang.String start;
	private java.lang.String end;
	private java.lang.String path;
	private int cost;

	public Solution() {
	}

	public java.lang.String getStart() {
		return this.start;
	}

	public void setStart(java.lang.String start) {
		this.start = start;
	}

	public java.lang.String getEnd() {
		return this.end;
	}

	public void setEnd(java.lang.String end) {
		this.end = end;
	}

	public java.lang.String getPath() {
		return this.path;
	}

	public void setPath(java.lang.String path) {
		this.path = path;
	}

	public int getCost() {
		return this.cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}

	public Solution(java.lang.String start, java.lang.String end,
			java.lang.String path, int cost) {
		this.start = start;
		this.end = end;
		this.path = path;
		this.cost = cost;
	}

}
