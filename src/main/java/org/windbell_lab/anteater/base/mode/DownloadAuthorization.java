package org.windbell_lab.anteater.base.mode;

import javax.persistence.Entity;

@Entity
public class DownloadAuthorization extends Mode {
	private static final long serialVersionUID = -8856325182864638867L;
	/**
	 * 证书编号
	 */
	String code;
	/**
	 * 授权人主机
	 */
	String hostAddress;
	/**
	 * 被授权人信息
	 */
	String postscript;
	/**
	 * 备注
	 */
	String remark;

	public DownloadAuthorization() {
		super();
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getHostAddress() {
		return hostAddress;
	}

	public void setHostAddress(String hostAddress) {
		this.hostAddress = hostAddress;
	}

	public String getPostscript() {
		return postscript;
	}

	public void setPostscript(String postscript) {
		this.postscript = postscript;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

}
