package com.app.ymsq.dto.saller.station;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
public class StationPickDTO implements Serializable{
	    /**
	     *  取件码  
	     */
	    private String code;

	    /**
	     *  取件预约时间
	     */
	    private Date receiveBespeakTime;

	    /**
	     *  取件价格
	     */
	    private BigDecimal receivePrice;

	    /**
	     * 商家名称
	     */
	    private String sellerName;

	    /**
	     * 商家编号
	     */
	    private String sellerNo;

	    /**
	     * 用户ID
	     */
	    private Integer userId;

	    private static final long serialVersionUID = 1L;

		public String getCode() {
			return code;
		}

		public void setCode(String code) {
			this.code = code;
		}

		public Date getReceiveBespeakTime() {
			return receiveBespeakTime;
		}

		public void setReceiveBespeakTime(Date receiveBespeakTime) {
			this.receiveBespeakTime = receiveBespeakTime;
		}

		public BigDecimal getReceivePrice() {
			return receivePrice;
		}

		public void setReceivePrice(BigDecimal receivePrice) {
			this.receivePrice = receivePrice;
		}

		public String getSellerName() {
			return sellerName;
		}

		public void setSellerName(String sellerName) {
			this.sellerName = sellerName;
		}

		public String getSellerNo() {
			return sellerNo;
		}

		public void setSellerNo(String sellerNo) {
			this.sellerNo = sellerNo;
		}

		public Integer getUserId() {
			return userId;
		}

		public void setUserId(Integer userId) {
			this.userId = userId;
		}


	    
}
