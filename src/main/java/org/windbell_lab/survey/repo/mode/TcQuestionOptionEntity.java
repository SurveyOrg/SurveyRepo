package org.windbell_lab.survey.repo.mode;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by morning on 2017/3/20.
 * 调查选项信息
 */
@Entity
@Table(name = "tc_question_option")
public class TcQuestionOptionEntity extends BaseEntity {
	private static final long serialVersionUID = -2211897756588802105L;
	/**
	* indexCode : 调查指标编码
	*/ 
	private long indexCode;
	/**
	* optionCode : 选项编码
	*/ 
	private long optionCode;
	/**
	* optionName : 选项名称
	*/ 
	private String optionName;
	/**
	* optionUrl : 选项URL
	*/ 
	private String optionUrl;

	@Basic
	@Column(name = "index_code")
	public long getIndexCode() {
		return indexCode;
	}

	public void setIndexCode(long indexCode) {
		this.indexCode = indexCode;
	}

	@Basic
	@Column(name = "option_code")
	public long getOptionCode() {
		return optionCode;
	}

	public void setOptionCode(long optionCode) {
		this.optionCode = optionCode;
	}

	@Basic
	@Column(name = "option_name")
	public String getOptionName() {
		return optionName;
	}

	public void setOptionName(String optionName) {
		this.optionName = optionName;
	}

	@Basic
	@Column(name = "option_url")
	public String getOptionUrl() {
		return optionUrl;
	}

	public void setOptionUrl(String optionUrl) {
		this.optionUrl = optionUrl;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;

		TcQuestionOptionEntity that = (TcQuestionOptionEntity) o;

		if (indexCode != that.indexCode)
			return false;
		if (optionCode != that.optionCode)
			return false;
		if (optionName != null ? !optionName.equals(that.optionName) : that.optionName != null)
			return false;
		if (optionUrl != null ? !optionUrl.equals(that.optionUrl) : that.optionUrl != null)
			return false;

		return true;
	}

	@Override
	public int hashCode() {
		int result = 0;
		result = 31 * result + (int) (indexCode ^ (indexCode >>> 32));
		result = 31 * result + (int) (optionCode ^ (optionCode >>> 32));
		result = 31 * result + (optionName != null ? optionName.hashCode() : 0);
		result = 31 * result + (optionUrl != null ? optionUrl.hashCode() : 0);
		return result;
	}
}
