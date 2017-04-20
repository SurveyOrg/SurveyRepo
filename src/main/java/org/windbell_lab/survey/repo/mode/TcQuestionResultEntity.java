package org.windbell_lab.survey.repo.mode;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by morning on 2017/3/20.
 * 调查结果表
 * 
 */
@Entity
@Table(name = "tc_question_result")
public class TcQuestionResultEntity extends BaseEntity {
	private static final long serialVersionUID = 1900736145213451471L;
	/**
	* optionCode : 选项编码
	*/
	private long optionCode;
	/**
	* optionValue : 结果值
	*/
	private String optionValue;

	@Basic
	@Column(name = "option_code")
	public long getOptionCode() {
		return optionCode;
	}

	public void setOptionCode(long optionCode) {
		this.optionCode = optionCode;
	}

	@Basic
	@Column(name = "option_value")
	public String getOptionValue() {
		return optionValue;
	}

	public void setOptionValue(String optionValue) {
		this.optionValue = optionValue;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;

		TcQuestionResultEntity that = (TcQuestionResultEntity) o;

		if (optionCode != that.optionCode)
			return false;
		if (optionValue != null ? !optionValue.equals(that.optionValue) : that.optionValue != null)
			return false;

		return true;
	}

	@Override
	public int hashCode() {
		int result = 0;
		result = 31 * result + (int) (optionCode ^ (optionCode >>> 32));
		result = 31 * result + (optionValue != null ? optionValue.hashCode() : 0);
		return result;
	}

	@Override
	public String toString() {
		return String.format(
				"TcQuestionResultEntity [optionCode=%s, optionValue=%s, getId()=%s, getVersion()=%s, getDelFlag()=%s, getCreator()=%s, getCreateTime()=%s, getUpdater()=%s, getUpdateTime()=%s]",
				optionCode, optionValue, getId(), getVersion(), getDelFlag(), getCreator(), getCreateTime(),
				getUpdater(), getUpdateTime());
	}
	
}
