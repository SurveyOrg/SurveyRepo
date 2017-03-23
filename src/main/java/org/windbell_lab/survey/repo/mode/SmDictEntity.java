package org.windbell_lab.survey.repo.mode;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by morning on 2017/3/20.
 * 字典信息
 */
@Entity
@Table(name = "sm_dict")
public class SmDictEntity extends BaseEntity {
	private static final long serialVersionUID = -7838960836572295370L;
	/**
	* groupCode : 组编码
	*/ 
	private long groupCode;
	/**
	* groupValue : 组值
	*/ 
	private String groupValue;
	/**
	* itemCode : 属性编码
	*/ 
	private long itemCode;
	/**
	* itemValue : 属性值
	*/ 
	private String itemValue;
	/**
	* parentCode : 上级属性
	*/ 
	private long parentCode;

	@Basic
	@Column(name = "group_code")
	public long getGroupCode() {
		return groupCode;
	}

	public void setGroupCode(long groupCode) {
		this.groupCode = groupCode;
	}

	@Basic
	@Column(name = "group_value")
	public String getGroupValue() {
		return groupValue;
	}

	public void setGroupValue(String groupValue) {
		this.groupValue = groupValue;
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
	@Column(name = "item_value")
	public String getItemValue() {
		return itemValue;
	}

	public void setItemValue(String itemValue) {
		this.itemValue = itemValue;
	}

	@Basic
	@Column(name = "parent_code")
	public long getParentCode() {
		return parentCode;
	}

	public void setParentCode(long parentCode) {
		this.parentCode = parentCode;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;

		SmDictEntity that = (SmDictEntity) o;

		if (groupCode != that.groupCode)
			return false;
		if (itemCode != that.itemCode)
			return false;
		if (parentCode != that.parentCode)
			return false;
		if (groupValue != null ? !groupValue.equals(that.groupValue) : that.groupValue != null)
			return false;
		if (itemValue != null ? !itemValue.equals(that.itemValue) : that.itemValue != null)
			return false;

		return true;
	}

	@Override
	public int hashCode() {
		int result = 0;
		result = 31 * result + (int) (groupCode ^ (groupCode >>> 32));
		result = 31 * result + (groupValue != null ? groupValue.hashCode() : 0);
		result = 31 * result + (int) (itemCode ^ (itemCode >>> 32));
		result = 31 * result + (itemValue != null ? itemValue.hashCode() : 0);
		result = 31 * result + (int) (parentCode ^ (parentCode >>> 32));
		return result;
	}

	@Override
	public String toString() {
		return String.format(
				"SmDictEntity [groupCode=%s, groupValue=%s, itemCode=%s, itemValue=%s, parentCode=%s, getId()=%s, getVersion()=%s, getDelFlag()=%s, getCreator()=%s, getCreateTime()=%s, getUpdater()=%s, getUpdateTime()=%s]",
				groupCode, groupValue, itemCode, itemValue, parentCode, getId(), getVersion(), getDelFlag(),
				getCreator(), getCreateTime(), getUpdater(), getUpdateTime());
	}
	
}
