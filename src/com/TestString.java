package com;

public class TestString {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("java");
		MyString my = new MyString("my");
		System.out.println(my);
		StringBuffer sbuffer = new StringBuffer("buffer");
		System.out.println(sbuffer);
	}

}

class MyString{
	String msg;
	MyString(String msg){
		this.msg = msg;
	}
//	public String toString(){
//		return this.msg;
//	}
}


