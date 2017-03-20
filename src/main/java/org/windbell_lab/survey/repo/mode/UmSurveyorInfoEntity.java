package org.windbell_lab.survey.repo.mode;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by morning on 2017/3/20.
 */
@Entity
@Table(name = "um_surveyor_info")
public class UmSurveyorInfoEntity {
    private long id;
    private long surveyorCode;
    private String surveyorName;
    private long provinceCode;
    private long cityCode;
    private long countyCode;
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
    @Column(name = "surveyor_code")
    public long getSurveyorCode() {
        return surveyorCode;
    }

    public void setSurveyorCode(long surveyorCode) {
        this.surveyorCode = surveyorCode;
    }

    @Basic
    @Column(name = "surveyor_name")
    public String getSurveyorName() {
        return surveyorName;
    }

    public void setSurveyorName(String surveyorName) {
        this.surveyorName = surveyorName;
    }

    @Basic
    @Column(name = "province_code")
    public long getProvinceCode() {
        return provinceCode;
    }

    public void setProvinceCode(long provinceCode) {
        this.provinceCode = provinceCode;
    }

    @Basic
    @Column(name = "city_code")
    public long getCityCode() {
        return cityCode;
    }

    public void setCityCode(long cityCode) {
        this.cityCode = cityCode;
    }

    @Basic
    @Column(name = "county_code")
    public long getCountyCode() {
        return countyCode;
    }

    public void setCountyCode(long countyCode) {
        this.countyCode = countyCode;
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

        UmSurveyorInfoEntity that = (UmSurveyorInfoEntity) o;

        if (id != that.id) return false;
        if (surveyorCode != that.surveyorCode) return false;
        if (provinceCode != that.provinceCode) return false;
        if (cityCode != that.cityCode) return false;
        if (countyCode != that.countyCode) return false;
        if (delFlag != that.delFlag) return false;
        if (surveyorName != null ? !surveyorName.equals(that.surveyorName) : that.surveyorName != null) return false;
        if (creator != null ? !creator.equals(that.creator) : that.creator != null) return false;
        if (createTime != null ? !createTime.equals(that.createTime) : that.createTime != null) return false;
        if (updater != null ? !updater.equals(that.updater) : that.updater != null) return false;
        if (updateTime != null ? !updateTime.equals(that.updateTime) : that.updateTime != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (int) (surveyorCode ^ (surveyorCode >>> 32));
        result = 31 * result + (surveyorName != null ? surveyorName.hashCode() : 0);
        result = 31 * result + (int) (provinceCode ^ (provinceCode >>> 32));
        result = 31 * result + (int) (cityCode ^ (cityCode >>> 32));
        result = 31 * result + (int) (countyCode ^ (countyCode >>> 32));
        result = 31 * result + delFlag;
        result = 31 * result + (creator != null ? creator.hashCode() : 0);
        result = 31 * result + (createTime != null ? createTime.hashCode() : 0);
        result = 31 * result + (updater != null ? updater.hashCode() : 0);
        result = 31 * result + (updateTime != null ? updateTime.hashCode() : 0);
        return result;
    }
}
