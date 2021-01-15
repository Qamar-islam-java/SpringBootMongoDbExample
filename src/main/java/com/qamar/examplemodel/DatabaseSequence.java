package com.qamar.examplemodel;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/*We will create a collection that'll store the auto-incremented sequence for other collections. 
We'll call this collection database_sequences. It can be created using either the mongo shell 
or MongoDB Compass.*/

@Document(collection="database_sequence")
public class DatabaseSequence {

	@Id
	private String id;
	private long seq;
	public DatabaseSequence() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public long getSeq() {
		return seq;
	}
	public void setSeq(long seq) {
		this.seq = seq;
	}
	@Override
	public String toString() {
		return "DatabaseSequence [id=" + id + ", seq=" + seq + "]";
	}
	
}
