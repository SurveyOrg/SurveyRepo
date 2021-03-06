package org.windbell_lab.anteater.base.mode;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.Generated;
import org.hibernate.annotations.GenerationTime;

@MappedSuperclass
public class StampMode extends BaseMode implements Serializable {

	private static final long serialVersionUID = -182859833292091180L;

	/**
	 * 创建时间人
	 */
	@Column(name = "CREATOR")
	private String creator;
	/**
	 * 最后一次修改人
	 */
	@Column(name = "UPDATER")
	private String updater;
	/**
	 * 创建时间
	 */
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "CREATE_TIME", columnDefinition = "timestamp default CURRENT_TIMESTAMP")
	@Generated(GenerationTime.INSERT)
	private Date createTime;
	/**
	 * 最后一次修改时间
	 */
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "UPDATE_TIME", columnDefinition = "timestamp default CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP")
	@Generated(GenerationTime.ALWAYS)
	private Date updateTime;

	public StampMode() {
		super();
	}

	public String getCreator() {
		return creator;
	}

	public void setCreator(String creator) {
		this.creator = creator;
	}

	public String getUpdater() {
		return updater;
	}

	public void setUpdater(String updater) {
		this.updater = updater;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

}
