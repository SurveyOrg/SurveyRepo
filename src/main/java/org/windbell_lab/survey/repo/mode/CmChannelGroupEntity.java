package org.windbell_lab.survey.repo.mode;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by morning on 2017/3/20.
 */
@Entity
@Table(name = "cm_channel_group")
public class CmChannelGroupEntity extends BaseEntity {
	private static final long serialVersionUID = -954588378268168373L;
	private long id;
	private long groupCode;
	private String groupName;
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

		CmChannelGroupEntity that = (CmChannelGroupEntity) o;

		if (id != that.id)
			return false;
		if (groupCode != that.groupCode)
			return false;
		if (delFlag != that.delFlag)
			return false;
		if (groupName != null ? !groupName.equals(that.groupName) : that.groupName != null)
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
		result = 31 * result + (int) (groupCode ^ (groupCode >>> 32));
		result = 31 * result + (groupName != null ? groupName.hashCode() : 0);
		result = 31 * result + delFlag;
		result = 31 * result + (creator != null ? creator.hashCode() : 0);
		result = 31 * result + (createTime != null ? createTime.hashCode() : 0);
		result = 31 * result + (updater != null ? updater.hashCode() : 0);
		result = 31 * result + (updateTime != null ? updateTime.hashCode() : 0);
		return result;
	}
}
