/**  
* @Title: BaseEntity.java
* @Package org.windbell_lab.survey.repo.mode
* TODO
* @author MN 
* 2017年3月22日 下午6:02:32
* @version V1.0  
*/
package org.windbell_lab.survey.repo.mode;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Date;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Version;

import org.hibernate.annotations.Generated;
import org.hibernate.annotations.GenerationTime;

/**
 * Created by morning on 2017/3/22.
 */
@MappedSuperclass
public class BaseEntity implements Serializable {

	private static final long serialVersionUID = 1652098178707497549L;

	private long id;
	/**
	 * 版本号
	 */
	private Long version;
	/**
	* delFlag : 删除标记 
	* 0 未删除
	* 1 已删除
	*/
	private int delFlag;
	/**
	* creator : 创建人ID
	*/
	private Long creator;
	/**
	* createTime : 创建时间
	*/
	private Date createTime;
	/**
	* updater : 修改人ID
	*/
	private Long updater;
	/**
	* updateTime : 最后一次修改时间
	*/
	private Date updateTime;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	@Version
	public Long getVersion() {
		return version;
	}

	public void setVersion(Long version) {
		this.version = version;
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
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "create_time", columnDefinition = "timestamp default CURRENT_TIMESTAMP")
	@Generated(GenerationTime.INSERT)
	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
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

	public Date getUpdateTime() {
		return updateTime;
	}

	@Basic
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "update_time", columnDefinition = "timestamp default CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP")
	@Generated(GenerationTime.ALWAYS)
	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

}
