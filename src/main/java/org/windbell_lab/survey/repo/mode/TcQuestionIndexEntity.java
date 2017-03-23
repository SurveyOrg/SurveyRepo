package org.windbell_lab.survey.repo.mode;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by morning on 2017/3/20.
 * 调查指标信息
 */
@Entity
@Table(name = "tc_question_index")
public class TcQuestionIndexEntity extends BaseEntity {
	private static final long serialVersionUID = 4764570478291520255L;
	/**
	* itemCode : 调查项编码
	*/
	private long itemCode;
	/**
	* indexCode : 调查指标编码
	*/
	private long indexCode;
	/**
	* indexName : 调查指标名称
	*/
	private String indexName;

	@Basic
	@Column(name = "item_code")
	public long getItemCode() {
		return itemCode;
	}

	public void setItemCode(long itemCode) {
		this.itemCode = itemCode;
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
	@Column(name = "index_name")
	public String getIndexName() {
		return indexName;
	}

	public void setIndexName(String indexName) {
		this.indexName = indexName;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;

		TcQuestionIndexEntity that = (TcQuestionIndexEntity) o;
		if (itemCode != that.itemCode)
			return false;
		if (indexCode != that.indexCode)
			return false;
		if (indexName != null ? !indexName.equals(that.indexName) : that.indexName != null)
			return false;
		return true;
	}

	@Override
	public int hashCode() {
		int result = 0;
		result = 31 * result + (int) (itemCode ^ (itemCode >>> 32));
		result = 31 * result + (int) (indexCode ^ (indexCode >>> 32));
		result = 31 * result + (indexName != null ? indexName.hashCode() : 0);
		return result;
	}

	@Override
	public String toString() {
		return String.format(
				"TcQuestionIndexEntity [itemCode=%s, indexCode=%s, indexName=%s, getId()=%s, getVersion()=%s, getDelFlag()=%s, getCreator()=%s, getCreateTime()=%s, getUpdater()=%s, getUpdateTime()=%s]",
				itemCode, indexCode, indexName, getId(), getVersion(), getDelFlag(), getCreator(), getCreateTime(),
				getUpdater(), getUpdateTime());
	}
	
}
