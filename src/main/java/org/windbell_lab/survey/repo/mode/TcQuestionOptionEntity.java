package org.windbell_lab.survey.repo.mode;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by morning on 2017/3/20.
 */
@Entity
@Table(name = "tc_question_option")
public class TcQuestionOptionEntity extends BaseEntity {
	private static final long serialVersionUID = -2211897756588802105L;
	private long id;
	private long indexCode;
	private long optionCode;
	private String optionName;
	private String optionUrl;
	private int delFlag;
	private Long creator;
	private Timestamp createTime;
	private Long updater;
	private Timestamp updateTime;

	@Id
	@Column(name = "id")
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

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

	@Basic
	@Column(name = "del_flag")
	public int getDelFlag() {
		return delFlag;
	}

	public void setDelFlag(int delFlag) {
		this.delFlag = delFlag;
	}

	@Basic
	@Column(name = "creator")
	public Long getCreator() {
		return creator;
	}

	public void setCreator(Long creator) {
		this.creator = creator;
	}

	@Basic
	@Column(name = "create_time")
	public Timestamp getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Timestamp createTime) {
		this.createTime = createTime;
	}

	@Basic
	@Column(name = "updater")
	public Long getUpdater() {
		return updater;
	}

	public void setUpdater(Long updater) {
		this.updater = updater;
	}

	@Basic
	@Column(name = "update_time")
	public Timestamp getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Timestamp updateTime) {
		this.updateTime = updateTime;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;

		TcQuestionOptionEntity that = (TcQuestionOptionEntity) o;

		if (id != that.id)
			return false;
		if (indexCode != that.indexCode)
			return false;
		if (optionCode != that.optionCode)
			return false;
		if (delFlag != that.delFlag)
			return false;
		if (optionName != null ? !optionName.equals(that.optionName) : that.optionName != null)
			return false;
		if (optionUrl != null ? !optionUrl.equals(that.optionUrl) : that.optionUrl != null)
			return false;
		if (creator != null ? !creator.equals(that.creator) : that.creator != null)
			return false;
		if (createTime != null ? !createTime.equals(that.createTime) : that.createTime != null)
			return false;
		if (updater != null ? !updater.equals(that.updater) : that.updater != null)
			return false;
		if (updateTime != null ? !updateTime.equals(that.updateTime) : that.updateTime != null)
			return false;

		return true;
	}

	@Override
	public int hashCode() {
		int result = (int) (id ^ (id >>> 32));
		result = 31 * result + (int) (indexCode ^ (indexCode >>> 32));
		result = 31 * result + (int) (optionCode ^ (optionCode >>> 32));
		result = 31 * result + (optionName != null ? optionName.hashCode() : 0);
		result = 31 * result + (optionUrl != null ? optionUrl.hashCode() : 0);
		result = 31 * result + delFlag;
		result = 31 * result + (creator != null ? creator.hashCode() : 0);
		result = 31 * result + (createTime != null ? createTime.hashCode() : 0);
		result = 31 * result + (updater != null ? updater.hashCode() : 0);
		result = 31 * result + (updateTime != null ? updateTime.hashCode() : 0);
		return result;
	}
}
