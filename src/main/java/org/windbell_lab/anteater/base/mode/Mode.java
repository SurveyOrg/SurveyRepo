package org.windbell_lab.anteater.base.mode;

import java.io.Serializable;

import javax.persistence.MappedSuperclass;

@MappedSuperclass
public class Mode extends StampMode implements Serializable {

	private static final long serialVersionUID = -1187379867504599372L;

	/**
	 * 逻辑删除标志位
	 * true：已删除
	 * false：未删除
	 */
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
