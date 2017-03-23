package org.windbell_lab.survey.repo.mode;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by morning on 2017/3/20.
 * 调查项目信息
 */
@Entity
@Table(name = "tc_question_item")
public class TcQuestionItemEntity extends BaseEntity {
	private static final long serialVersionUID = -3110382835718373823L;
	/**
	* questionCode : 问卷编码
	*/
	private long questionCode;
	/**
	* itemCode : 调查项编码
	*/
	private long itemCode;
	/**
	* itemName : 调查项名称
	*/
	private String itemName;

	@Basic
	@Column(name = "question_code")
	public long getQuestionCode() {
		return questionCode;
	}

	public void setQuestionCode(long questionCode) {
		this.questionCode = questionCode;
	}

	@Basic
	@Column(name = "item_code")
	public long getItemCode() {
		return itemCode;
	}

	public void setItemCode(long itemCode) {
		this.itemCode = itemCode;
	}

	@Basic
	@Column(name = "item_name")
	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;

		TcQuestionItemEntity that = (TcQuestionItemEntity) o;
		if (questionCode != that.questionCode)
			return false;
		if (itemCode != that.itemCode)
			return false;
		if (itemName != null ? !itemName.equals(that.itemName) : that.itemName != null)
			return false;
		return true;
	}

	@Override
	public int hashCode() {
		int result = 0;
		result = 31 * result + (int) (questionCode ^ (questionCode >>> 32));
		result = 31 * result + (int) (itemCode ^ (itemCode >>> 32));
		result = 31 * result + (itemName != null ? itemName.hashCode() : 0);
		return result;
	}
}
