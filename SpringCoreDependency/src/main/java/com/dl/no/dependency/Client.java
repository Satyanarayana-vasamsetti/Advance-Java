package com.dl.no.dependency;

interface Brand{
	public abstract String honda();
}

class car implements Brand{

	@Override
	public String honda() {
		return "Honda Civic";
	}
	
}
class bike implements Brand{

	@Override
	public String honda() {
		return "Honda sp125";
	}
	
}
public class Client {
	public static void main(String[] args) {
		Brand b = new car();
		System.out.println(b.honda());
		Brand b1 = new bike();
		System.out.println(b1.honda());
	}
}
