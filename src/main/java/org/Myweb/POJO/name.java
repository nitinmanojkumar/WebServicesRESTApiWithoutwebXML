package org.Myweb.POJO;

public class name {

	private String fristNM;
	private String lastNM;
	
	public name(String fristNM, String lastNM) {
		this.fristNM = fristNM;
		this.lastNM = lastNM;
	}

	@Override
	public String toString() {
		return "name [fristNM=" + fristNM + ", lastNM=" + lastNM + "]";
	}
	
	
}
