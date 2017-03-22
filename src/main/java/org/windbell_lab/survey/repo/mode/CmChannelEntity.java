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


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CmChannelEntity that = (CmChannelEntity) o;

        if (channelCode != that.channelCode) return false;
        if (type != that.type) return false;
        if (company != that.company) return false;
        if (channelName != null ? !channelName.equals(that.channelName) : that.channelName != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = 0;
        result = 31 * result + (int) (channelCode ^ (channelCode >>> 32));
        result = 31 * result + (channelName != null ? channelName.hashCode() : 0);
        result = 31 * result + (int) (type ^ (type >>> 32));
        result = 31 * result + (int) (company ^ (company >>> 32));
        return result;
    }
}
