package org.windbell_lab.anteater.base.mode;

import java.io.Serializable;

public class Mode extends StampMode implements Serializable {

	private static final long serialVersionUID = -1187379867504599372L;
	
	private boolean isDeleted;

	public Mode() {
		super();
	}

	public boolean isDeleted() {
		return isDeleted;
	}

	public void setDeleted(boolean isDeleted) {
		this.isDeleted = isDeleted;
	}
	
	
}
