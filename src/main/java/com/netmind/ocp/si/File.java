package com.netmind.ocp.si;

public class File implements Measurable {
	
	private int length;
	private int sent;

	public File(int length, int sent) {
		this.length = length;
		this.sent = sent;
	}

	public int getLength() {
		// TODO Auto-generated method stub
		return length;
	}

	public int getSent() {
		// procesado complejo de lo que se ha enviado ya a descarga
		return sent;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public void setSent(int sent) {
		this.sent = sent;
	}

}
