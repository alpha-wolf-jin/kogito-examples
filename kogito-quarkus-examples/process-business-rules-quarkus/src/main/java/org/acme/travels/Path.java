package org.acme.travels;

public class Person {

	private java.lang.String start;
	private java.lang.String end;
	private int cost;
	private java.lang.String record;
	private org.acme.travels.Path child_left;
	private org.acme.travels.Path child_right;

	public Path() {
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

	public int getCost() {
		return this.cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}

	public java.lang.String getRecord() {
		return this.record;
	}

	public void setRecord(java.lang.String record) {
		this.record = record;
	}

	public org.acme.travels.Path getChild_left() {
		return this.child_left;
	}

	public void setChild_left(org.acme.travels.Path child_left) {
		this.child_left = child_left;
	}

	public org.acme.travels.Path getChild_right() {
		return this.child_right;
	}

	public void setChild_right(org.acme.travels.Path child_right) {
		this.child_right = child_right;
	}

	public Path(java.lang.String start, java.lang.String end, int cost,
			java.lang.String record, org.acme.travels.Path child_left,
			org.acme.travels.Path child_right) {
		this.start = start;
		this.end = end;
		this.cost = cost;
		this.record = record;
		this.child_left = child_left;
		this.child_right = child_right;
	}

}
