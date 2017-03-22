package org.windbell_lab.survey.repo.mode;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by morning on 2017/3/20.
 */
@Entity
@Table(name = "cm_channel")
public class CmChannelEntity extends BaseEntity{
	private static final long serialVersionUID = -6989104356513300309L;
	private long id;
    /**
    * channelCode : 渠道
    */ 
    private long channelCode;
    /**
    * channelName : 渠道名称
    */ 
    private String channelName;
    /**
    * type : 渠道类型
    */ 
    private long type;
    /**
    * company : 部门
    */ 
    private long company;
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
    @Column(name = "channel_code")
    public long getChannelCode() {
        return channelCode;
    }

    public void setChannelCode(long channelCode) {
        this.channelCode = channelCode;
    }

    @Basic
    @Column(name = "channel_name")
    public String getChannelName() {
        return channelName;
    }

    public void setChannelName(String channelName) {
        this.channelName = channelName;
    }

    @Basic
    @Column(name = "type")
    public long getType() {
        return type;
    }

    public void setType(long type) {
        this.type = type;
    }

    @Basic
    @Column(name = "company")
    public long getCompany() {
        return company;
    }

    public void setCompany(long company) {
        this.company = company;
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
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CmChannelEntity that = (CmChannelEntity) o;

        if (id != that.id) return false;
        if (channelCode != that.channelCode) return false;
        if (type != that.type) return false;
        if (company != that.company) return false;
        if (delFlag != that.delFlag) return false;
        if (channelName != null ? !channelName.equals(that.channelName) : that.channelName != null) return false;
        if (creator != null ? !creator.equals(that.creator) : that.creator != null) return false;
        if (createTime != null ? !createTime.equals(that.createTime) : that.createTime != null) return false;
        if (updater != null ? !updater.equals(that.updater) : that.updater != null) return false;
        if (updateTime != null ? !updateTime.equals(that.updateTime) : that.updateTime != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (int) (channelCode ^ (channelCode >>> 32));
        result = 31 * result + (channelName != null ? channelName.hashCode() : 0);
        result = 31 * result + (int) (type ^ (type >>> 32));
        result = 31 * result + (int) (company ^ (company >>> 32));
        result = 31 * result + delFlag;
        result = 31 * result + (creator != null ? creator.hashCode() : 0);
        result = 31 * result + (createTime != null ? createTime.hashCode() : 0);
        result = 31 * result + (updater != null ? updater.hashCode() : 0);
        result = 31 * result + (updateTime != null ? updateTime.hashCode() : 0);
        return result;
    }
}
