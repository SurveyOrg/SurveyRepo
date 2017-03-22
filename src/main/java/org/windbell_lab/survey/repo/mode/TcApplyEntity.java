package org.windbell_lab.survey.repo.mode;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * Created by morning on 2017/3/20.
 * 报名
 */
@Entity
@Table(name = "tc_apply")
public class TcApplyEntity extends BaseEntity {
	private static final long serialVersionUID = -2181101647637669850L;
	/**
	* publishId : 发布ID
	*/ 
	private long publishId;
	/**
	* surveyorCode : 调查员编码
	*/ 
	private long surveyorCode;
	/**
	* channelCode : 渠道编码
	*/ 
	private long channelCode;
	/**
	* price : 报价
	*/ 
	private BigDecimal price;
	/**
	* applyStatus : 报名状态
	* 0:未选中
	* 1：选中
	*/ 
	private int applyStatus;

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

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;

		TcApplyEntity that = (TcApplyEntity) o;

		if (publishId != that.publishId)
			return false;
		if (surveyorCode != that.surveyorCode)
			return false;
		if (channelCode != that.channelCode)
			return false;
		if (applyStatus != that.applyStatus)
			return false;
		if (price != null ? !price.equals(that.price) : that.price != null)
			return false;

		return true;
	}

	@Override
	public int hashCode() {
		int result = 0;
		result = 31 * result + (int) (publishId ^ (publishId >>> 32));
		result = 31 * result + (int) (surveyorCode ^ (surveyorCode >>> 32));
		result = 31 * result + (int) (channelCode ^ (channelCode >>> 32));
		result = 31 * result + (price != null ? price.hashCode() : 0);
		result = 31 * result + applyStatus;
		return result;
	}
}
