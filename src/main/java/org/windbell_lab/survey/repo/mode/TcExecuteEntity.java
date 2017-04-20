package org.windbell_lab.survey.repo.mode;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by morning on 2017/3/20.
 * 调查表信息
 */
@Entity
@Table(name = "tc_execute")
public class TcExecuteEntity extends BaseEntity {
	private static final long serialVersionUID = 2888432303139607285L;
	/**
	* applyId : 报名ID
	*/
	private long applyId;
	/**
	* executeStatus : 调查进度
	* 0:未开始
	* 1：进行中
	* 2：完成
	*/
	private int executeStatus;

	@Basic
	@Column(name = "apply_id")
	public long getApplyId() {
		return applyId;
	}

	public void setApplyId(long applyId) {
		this.applyId = applyId;
	}

	@Basic
	@Column(name = "execute_status")
	public int getExecuteStatus() {
		return executeStatus;
	}

	public void setExecuteStatus(int executeStatus) {
		this.executeStatus = executeStatus;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;

		TcExecuteEntity that = (TcExecuteEntity) o;

		if (applyId != that.applyId)
			return false;
		if (executeStatus != that.executeStatus)
			return false;

		return true;
	}

	@Override
	public int hashCode() {
		int result = 0;
		result = 31 * result + (int) (applyId ^ (applyId >>> 32));
		result = 31 * result + executeStatus;
		return result;
	}

	@Override
	public String toString() {
		return String.format(
				"TcExecuteEntity [applyId=%s, executeStatus=%s, getId()=%s, getVersion()=%s, getDelFlag()=%s, getCreator()=%s, getCreateTime()=%s, getUpdater()=%s, getUpdateTime()=%s]",
				applyId, executeStatus, getId(), getVersion(), getDelFlag(), getCreator(), getCreateTime(),
				getUpdater(), getUpdateTime());
	}
	
}
