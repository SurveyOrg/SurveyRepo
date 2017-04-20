package org.windbell_lab.survey.repo.mode;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by morning on 2017/3/20.
 * 调查员信息表
 */
@Entity
@Table(name = "um_surveyor_info")
public class UmSurveyorInfoEntity extends BaseEntity {
	private static final long serialVersionUID = -4834614658258518325L;
	/**
	* surveyorCode : 用户编码
	*/
	private long surveyorCode;
	/**
	* surveyorName : 名称
	*/
	private String surveyorName;
	/**
	* provinceCode : 省
	*/
	private long provinceCode;
	/**
	* cityCode : 市
	*/
	private long cityCode;
	/**
	* countyCode : 县
	*/
	private long countyCode;

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

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;

		UmSurveyorInfoEntity that = (UmSurveyorInfoEntity) o;
		if (surveyorCode != that.surveyorCode)
			return false;
		if (provinceCode != that.provinceCode)
			return false;
		if (cityCode != that.cityCode)
			return false;
		if (countyCode != that.countyCode)
			return false;
		if (surveyorName != null ? !surveyorName.equals(that.surveyorName) : that.surveyorName != null)
			return false;

		return true;
	}

	@Override
	public int hashCode() {
		int result = 0;
		result = 31 * result + (int) (surveyorCode ^ (surveyorCode >>> 32));
		result = 31 * result + (surveyorName != null ? surveyorName.hashCode() : 0);
		result = 31 * result + (int) (provinceCode ^ (provinceCode >>> 32));
		result = 31 * result + (int) (cityCode ^ (cityCode >>> 32));
		result = 31 * result + (int) (countyCode ^ (countyCode >>> 32));
		
		return result;
	}

	@Override
	public String toString() {
		return String.format(
				"UmSurveyorInfoEntity [surveyorCode=%s, surveyorName=%s, provinceCode=%s, cityCode=%s, countyCode=%s, getId()=%s, getVersion()=%s, getDelFlag()=%s, getCreator()=%s, getCreateTime()=%s, getUpdater()=%s, getUpdateTime()=%s]",
				surveyorCode, surveyorName, provinceCode, cityCode, countyCode, getId(), getVersion(), getDelFlag(),
				getCreator(), getCreateTime(), getUpdater(), getUpdateTime());
	}
	
}
