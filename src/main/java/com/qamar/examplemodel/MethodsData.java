package com.qamar.examplemodel;

import java.util.List;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collation = "outgoing")
public class MethodsData {
	
	private int[] arr;
	private List<String> duplicate;
	private String whitespace;
	public int[] getArr() {
		return arr;
	}
	public void setArr(int[] arr) {
		this.arr = arr;
	}
	public List<String> getDuplicate() {
		return duplicate;
	}
	public void setDuplicate(List<String> duplicate) {
		this.duplicate = duplicate;
	}
	public String getWhitespace() {
		return whitespace;
	}
	public void setWhitespace(String whitespace) {
		this.whitespace = whitespace;
	}
	public MethodsData() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "MethodsData [arr=" + arr + ", duplicate=" + duplicate + ", whitespace=" + whitespace + "]";
	}
	
	
	

}
