package org.windbell_lab.survey.repo.mode;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by morning on 2017/3/20.
 * 渠道组信息
 */
@Entity
@Table(name = "cm_channel_group")
public class CmChannelGroupEntity extends BaseEntity {
	private static final long serialVersionUID = -954588378268168373L;
	/**
	* groupCode : 组编码
	*/ 
	private long groupCode;
	/**
	* groupName : 组名称
	*/ 
	private String groupName;

	@Column(name = "group_code")
	public long getGroupCode() {
		return groupCode;
	}

	public void setGroupCode(long groupCode) {
		this.groupCode = groupCode;
	}

	@Basic
	@Column(name = "group_name")
	public String getGroupName() {
		return groupName;
	}

	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}


	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;

		CmChannelGroupEntity that = (CmChannelGroupEntity) o;

		if (groupCode != that.groupCode)
			return false;
		if (groupName != null ? !groupName.equals(that.groupName) : that.groupName != null)
			return false;

		return true;
	}

	@Override
	public int hashCode() {
		int result = 0;
		result = 31 * result + (int) (groupCode ^ (groupCode >>> 32));
		result = 31 * result + (groupName != null ? groupName.hashCode() : 0);
		return result;
	}
}
