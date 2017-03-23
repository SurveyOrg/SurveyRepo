package org.windbell_lab.survey.repo.mode;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by morning on 2017/3/20.
 * 分组情况信息
 */
@Entity
@Table(name = "cm_channel_group_detail")
public class CmChannelGroupDetailEntity extends BaseEntity {
	private static final long serialVersionUID = 429968509704142333L;
	/**
	* groupCode : 组编码
	*/
	private long groupCode;
	/**
	* channelCode : 渠道编码
	*/
	private long channelCode;
	/**
	* isSelected : 是否选中标志
	* 1:选中
	* 0:未选中
	*/
	private int isSelected;

	@Basic
	@Column(name = "group_code")
	public long getGroupCode() {
		return groupCode;
	}

	public void setGroupCode(long groupCode) {
		this.groupCode = groupCode;
	}

	@Basic
	@Column(name = "channel_code")
	public long getChannelCode() {
		return channelCode;
	}

	public void setChannelCode(long channelCode) {
		this.channelCode = channelCode;
	}

	@Basic
	@Column(name = "is_selected")
	public int getIsSelected() {
		return isSelected;
	}

	public void setIsSelected(int isSelected) {
		this.isSelected = isSelected;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;

		CmChannelGroupDetailEntity that = (CmChannelGroupDetailEntity) o;

		if (groupCode != that.groupCode)
			return false;
		if (channelCode != that.channelCode)
			return false;
		if (isSelected != that.isSelected)
			return false;

		return true;
	}

	@Override
	public int hashCode() {
		int result = 0;
		result = 31 * result + (int) (groupCode ^ (groupCode >>> 32));
		result = 31 * result + (int) (channelCode ^ (channelCode >>> 32));
		result = 31 * result + isSelected;
		return result;
	}

	@Override
	public String toString() {
		return String.format(
				"CmChannelGroupDetailEntity [groupCode=%s, channelCode=%s, isSelected=%s, getId()=%s, getVersion()=%s, getDelFlag()=%s, getCreator()=%s, getCreateTime()=%s, getUpdater()=%s, getUpdateTime()=%s]",
				groupCode, channelCode, isSelected, getId(), getVersion(), getDelFlag(), getCreator(), getCreateTime(),
				getUpdater(), getUpdateTime());
	}
	
}
