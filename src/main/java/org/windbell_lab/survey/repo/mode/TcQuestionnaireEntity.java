package org.windbell_lab.survey.repo.mode;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by morning on 2017/3/20.
 * 问券信息
 */
@Entity
@Table(name = "tc_questionnaire")
public class TcQuestionnaireEntity extends BaseEntity {
	private static final long serialVersionUID = 1595080357764490214L;
	/**
	* questionCode : 问券编号
	*/
	private long questionCode;
	/**
	* questionName : 问券名称
	*/
	private String questionName;

	@Basic
	@Column(name = "question_code")
	public long getQuestionCode() {
		return questionCode;
	}

	public void setQuestionCode(long questionCode) {
		this.questionCode = questionCode;
	}

	@Basic
	@Column(name = "question_name")
	public String getQuestionName() {
		return questionName;
	}

	public void setQuestionName(String questionName) {
		this.questionName = questionName;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;

		TcQuestionnaireEntity that = (TcQuestionnaireEntity) o;
		if (questionCode != that.questionCode)
			return false;
		if (questionName != null ? !questionName.equals(that.questionName) : that.questionName != null)
			return false;

		return true;
	}

	@Override
	public int hashCode() {
		int result = 0;
		result = 31 * result + (int) (questionCode ^ (questionCode >>> 32));
		result = 31 * result + (questionName != null ? questionName.hashCode() : 0);
		return result;
	}

	@Override
	public String toString() {
		return String.format(
				"TcQuestionnaireEntity [questionCode=%s, questionName=%s, getId()=%s, getVersion()=%s, getDelFlag()=%s, getCreator()=%s, getCreateTime()=%s, getUpdater()=%s, getUpdateTime()=%s]",
				questionCode, questionName, getId(), getVersion(), getDelFlag(), getCreator(), getCreateTime(),
				getUpdater(), getUpdateTime());
	}
	
}
