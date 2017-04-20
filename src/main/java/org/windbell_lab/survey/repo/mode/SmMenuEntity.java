package org.windbell_lab.survey.repo.mode;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by morning on 2017/3/20.
 * 菜单信息
 */
@Entity
@Table(name = "sm_menu")
public class SmMenuEntity extends BaseEntity {
	private static final long serialVersionUID = -3193875207328443281L;
	/**
	* menuCode : 菜单编码
	*/ 
	private long menuCode;
	/**
	* menuName : 菜单名称
	*/ 
	private String menuName;
	/**
	* parentCode : 上级菜单
	*/ 
	private long parentCode;
	/**
	* menuUrl : 菜单url
	*/ 
	private String menuUrl;
	/**
	* note : 备注
	*/ 
	private String note;


	@Basic
	@Column(name = "menu_code")
	public long getMenuCode() {
		return menuCode;
	}

	public void setMenuCode(long menuCode) {
		this.menuCode = menuCode;
	}

	@Basic
	@Column(name = "menu_name")
	public String getMenuName() {
		return menuName;
	}

	public void setMenuName(String menuName) {
		this.menuName = menuName;
	}

	@Basic
	@Column(name = "parent_code")
	public long getParentCode() {
		return parentCode;
	}

	public void setParentCode(long parentCode) {
		this.parentCode = parentCode;
	}

	@Basic
	@Column(name = "menu_url")
	public String getMenuUrl() {
		return menuUrl;
	}

	public void setMenuUrl(String menuUrl) {
		this.menuUrl = menuUrl;
	}

	@Basic
	@Column(name = "note")
	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;

		SmMenuEntity that = (SmMenuEntity) o;

		if (menuCode != that.menuCode)
			return false;
		if (parentCode != that.parentCode)
			return false;
		if (menuName != null ? !menuName.equals(that.menuName) : that.menuName != null)
			return false;
		if (menuUrl != null ? !menuUrl.equals(that.menuUrl) : that.menuUrl != null)
			return false;
		if (note != null ? !note.equals(that.note) : that.note != null)

			return false;
		return true;
	}

	@Override
	public int hashCode() {
		int result = 0;
		result = 31 * result + (int) (menuCode ^ (menuCode >>> 32));
		result = 31 * result + (menuName != null ? menuName.hashCode() : 0);
		result = 31 * result + (int) (parentCode ^ (parentCode >>> 32));
		result = 31 * result + (menuUrl != null ? menuUrl.hashCode() : 0);
		result = 31 * result + (note != null ? note.hashCode() : 0);
		return result;
	}

	@Override
	public String toString() {
		return String.format(
				"SmMenuEntity [menuCode=%s, menuName=%s, parentCode=%s, menuUrl=%s, note=%s, getId()=%s, getVersion()=%s, getDelFlag()=%s, getCreator()=%s, getCreateTime()=%s, getUpdater()=%s, getUpdateTime()=%s]",
				menuCode, menuName, parentCode, menuUrl, note, getId(), getVersion(), getDelFlag(), getCreator(),
				getCreateTime(), getUpdater(), getUpdateTime());
	}
	
}
