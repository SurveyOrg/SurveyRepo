package org.windbell_lab.survey.repo.mode;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by morning on 2017/3/20.
 * 发布信息
 */
@Entity
@Table(name = "tc_publish")
public class TcPublishEntity extends BaseEntity {
	private static final long serialVersionUID = -4326042424697801632L;
	/**
	* questionCode : 问卷编码
	*/
	private long questionCode;
	/**
	* publishStatus : 发布状态
	* 0:未发布
	* 1：发布中
	* 2：结束
	*/
	private int publishStatus;

	@Basic
	@Column(name = "question_code")
	public long getQuestionCode() {
		return questionCode;
	}

	public void setQuestionCode(long questionCode) {
		this.questionCode = questionCode;
	}

	@Basic
	@Column(name = "publish_status")
	public int getPublishStatus() {
		return publishStatus;
	}

	public void setPublishStatus(int publishStatus) {
		this.publishStatus = publishStatus;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;

		TcPublishEntity that = (TcPublishEntity) o;

		if (questionCode != that.questionCode)
			return false;
		if (publishStatus != that.publishStatus)
			return false;

		return true;
	}

	@Override
	public int hashCode() {
		int result = 0;
		result = 31 * result + (int) (questionCode ^ (questionCode >>> 32));
		result = 31 * result + publishStatus;
		return result;
	}

	@Override
	public String toString() {
		return String.format(
				"TcPublishEntity [questionCode=%s, publishStatus=%s, getId()=%s, getVersion()=%s, getDelFlag()=%s, getCreator()=%s, getCreateTime()=%s, getUpdater()=%s, getUpdateTime()=%s]",
				questionCode, publishStatus, getId(), getVersion(), getDelFlag(), getCreator(), getCreateTime(),
				getUpdater(), getUpdateTime());
	}
	
}
