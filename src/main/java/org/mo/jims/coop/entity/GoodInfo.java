/***********************************************************************
 * Module:  TbGoodInfo.java
 * Author:  YK
 * Purpose: Defines the Class TbGoodInfo
 ***********************************************************************/
package org.mo.jims.coop.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.mo.open.common.util.Sequence;

/**
 * 商品信息
 */
public class GoodInfo implements Serializable {

	private static final long serialVersionUID = 1L;

	private java.lang.String id;

	private java.lang.String name;

	private java.lang.String abbreviation;

	private java.lang.String origin;

	private float unitCost;

	private java.lang.String pack;

	private java.lang.String approvalNum;

	private java.lang.String batchNum;

	private java.lang.String memo;

	private Date time;

	private ProviderInfo providerInfo;

	private List<Sell> sell;

	private List<SellReturn> sellReturn;

	private List<Stock> stock;

	private List<StockReturn> stockReturn;

	public GoodInfo() {
		super();
	}

	public GoodInfo(String id, String name, String abbreviation, String origin,
			float unitCost, String pack, String approvalNum, String batchNum,
			String memo, Date time) {
		super();
		this.id = id;
		this.name = name;
		this.abbreviation = abbreviation;
		this.origin = origin;
		this.unitCost = unitCost;
		this.pack = pack;
		this.approvalNum = approvalNum;
		this.batchNum = batchNum;
		this.memo = memo;
		this.time = time;
	}

	public GoodInfo(String name, String abbreviation, String origin,
			float unitCost, String pack, String approvalNum, String batchNum,
			String memo) {
		super();
		this.id = "g" + Sequence.nextId();
		this.name = name;
		this.abbreviation = abbreviation;
		this.origin = origin;
		this.unitCost = unitCost;
		this.pack = pack;
		this.approvalNum = approvalNum;
		this.batchNum = batchNum;
		this.memo = memo;
	}

	public java.lang.String getId() {
		return id;
	}

	public void setId(java.lang.String id) {
		this.id = id;
	}

	public java.lang.String getName() {
		return name;
	}

	public void setName(java.lang.String name) {
		this.name = name;
	}

	public java.lang.String getAbbreviation() {
		return abbreviation;
	}

	public void setAbbreviation(java.lang.String abbreviation) {
		this.abbreviation = abbreviation;
	}

	public java.lang.String getOrigin() {
		return origin;
	}

	public void setOrigin(java.lang.String origin) {
		this.origin = origin;
	}

	public float getUnitCost() {
		return unitCost;
	}

	public void setUnitCost(float unitCost) {
		this.unitCost = unitCost;
	}

	public java.lang.String getPack() {
		return pack;
	}

	public void setPack(java.lang.String pack) {
		this.pack = pack;
	}

	public java.lang.String getApprovalNum() {
		return approvalNum;
	}

	public void setApprovalNum(java.lang.String approvalNum) {
		this.approvalNum = approvalNum;
	}

	public java.lang.String getBatchNum() {
		return batchNum;
	}

	public void setBatchNum(java.lang.String batchNum) {
		this.batchNum = batchNum;
	}

	public java.lang.String getMemo() {
		return memo;
	}

	public void setMemo(java.lang.String memo) {
		this.memo = memo;
	}

	public Date getTime() {
		return time;
	}

	public void setTime(Date time) {
		this.time = time;
	}

	public List<Sell> getSell() {
		return sell;
	}

	public void setSell(List<Sell> sell) {
		this.sell = sell;
	}

	public List<SellReturn> getSellReturn() {
		return sellReturn;
	}

	public void setSellReturn(List<SellReturn> sellReturn) {
		this.sellReturn = sellReturn;
	}

	public List<Stock> getStock() {
		return stock;
	}

	public void setStock(List<Stock> stock) {
		this.stock = stock;
	}

	public List<StockReturn> getStockReturn() {
		return stockReturn;
	}

	public void setStockReturn(List<StockReturn> stockReturn) {
		this.stockReturn = stockReturn;
	}

	public ProviderInfo getProviderInfo() {
		return providerInfo;
	}

	public void setProviderInfo(ProviderInfo providerInfo) {
		this.providerInfo = providerInfo;
	}

	@Override
	public String toString() {
		return "GoodInfo [id=" + id + ", name=" + name + ", abbreviation="
				+ abbreviation + ", origin=" + origin + ", unitCost="
				+ unitCost + ", pack=" + pack + ", approvalNum=" + approvalNum
				+ ", batchNum=" + batchNum + ", memo=" + memo + "]";
	}

}