package com.springcore.reference;

public class B {
	
	
	
private int y;

public int getY() {
	return y;
}

public void setY(int y) {
	this.y = y;
}

public B() {
	super();
	// TODO Auto-generated constructor stub
}

public B(int y) {
	super();
	this.y = y;
}

@Override
public String toString() {
	StringBuilder builder = new StringBuilder();
	builder.append("B [y=");
	builder.append(y);
	builder.append("]");
	return builder.toString();
}




}
