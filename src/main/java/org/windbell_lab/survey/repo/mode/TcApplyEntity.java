package org.windbell_lab.survey.repo.mode;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * Created by morning on 2017/3/20.
 */
@Entity
@Table(name = "tc_apply")
public class TcApplyEntity extends BaseEntity{
	private static final long serialVersionUID = -2181101647637669850L;
	private long id;
    private long publishId;
    private long surveyorCode;
    private long channelCode;
    private BigDecimal price;
    private int applyStatus;
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
    @Column(name = "publish_id")
    public long getPublishId() {
        return publishId;
    }

    public void setPublishId(long publishId) {
        this.publishId = publishId;
    }

    @Basic
    @Column(name = "surveyor_code")
    public long getSurveyorCode() {
        return surveyorCode;
    }

    public void setSurveyorCode(long surveyorCode) {
        this.surveyorCode = surveyorCode;
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
    @Column(name = "price")
    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    @Basic
    @Column(name = "apply_status")
    public int getApplyStatus() {
        return applyStatus;
    }

    public void setApplyStatus(int applyStatus) {
        this.applyStatus = applyStatus;
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

        TcApplyEntity that = (TcApplyEntity) o;

        if (id != that.id) return false;
        if (publishId != that.publishId) return false;
        if (surveyorCode != that.surveyorCode) return false;
        if (channelCode != that.channelCode) return false;
        if (applyStatus != that.applyStatus) return false;
        if (delFlag != that.delFlag) return false;
        if (price != null ? !price.equals(that.price) : that.price != null) return false;
        if (creator != null ? !creator.equals(that.creator) : that.creator != null) return false;
        if (createTime != null ? !createTime.equals(that.createTime) : that.createTime != null) return false;
        if (updater != null ? !updater.equals(that.updater) : that.updater != null) return false;
        if (updateTime != null ? !updateTime.equals(that.updateTime) : that.updateTime != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (int) (publishId ^ (publishId >>> 32));
        result = 31 * result + (int) (surveyorCode ^ (surveyorCode >>> 32));
        result = 31 * result + (int) (channelCode ^ (channelCode >>> 32));
        result = 31 * result + (price != null ? price.hashCode() : 0);
        result = 31 * result + applyStatus;
        result = 31 * result + delFlag;
        result = 31 * result + (creator != null ? creator.hashCode() : 0);
        result = 31 * result + (createTime != null ? createTime.hashCode() : 0);
        result = 31 * result + (updater != null ? updater.hashCode() : 0);
        result = 31 * result + (updateTime != null ? updateTime.hashCode() : 0);
        return result;
    }
}
