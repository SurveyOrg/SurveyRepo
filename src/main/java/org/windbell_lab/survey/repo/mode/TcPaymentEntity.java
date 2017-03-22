package org.windbell_lab.survey.repo.mode;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * Created by morning on 2017/3/20.
 * 酬金信息表
 */
@Table(name = "tc_payment")
public class TcPaymentEntity extends BaseEntity {
	private static final long serialVersionUID = -6560627718365707698L;
	/**
	* executeId : 调查表ID
	*/
	private long executeId;
	/**
	* money : 支付金额
	* 0:未支付 
	* 1：已支付
	*/
	private BigDecimal money;
	/**
	* payStatus : 支付状态
	*/
	private int payStatus;

	@Basic
	@Column(name = "execute_id")
	public long getExecuteId() {
		return executeId;
	}

	public void setExecuteId(long executeId) {
		this.executeId = executeId;
	}

	@Basic
	@Column(name = "money")
	public BigDecimal getMoney() {
		return money;
	}

	public void setMoney(BigDecimal money) {
		this.money = money;
	}

	@Basic
	@Column(name = "pay_status")
	public int getPayStatus() {
		return payStatus;
	}

	public void setPayStatus(int payStatus) {
		this.payStatus = payStatus;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;

		TcPaymentEntity that = (TcPaymentEntity) o;

		if (executeId != that.executeId)
			return false;
		if (payStatus != that.payStatus)
			return false;
		if (money != null ? !money.equals(that.money) : that.money != null)
			return false;

		return true;
	}

	@Override
	public int hashCode() {
		int result = 0;
		result = 31 * result + (int) (executeId ^ (executeId >>> 32));
		result = 31 * result + (money != null ? money.hashCode() : 0);
		result = 31 * result + payStatus;
		return result;
	}
}
