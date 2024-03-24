package com.akhil.products;

import java.sql.Date;

public class Product {
	
	private String proId;
	private String proName;
	private Double proPrice;
	private String proBrand;
	private String proMadeIn;
	private Date proMnfgDate;
	private Date proExpDate;
	private byte[] proImage;
	private byte[] proAudio;
	private byte[] provideo;
	
	
	public byte[] getProAudio() {
		return proAudio;
	}
	public void setProAudio(byte[] proAudio) {
		this.proAudio = proAudio;
	}
	public byte[] getProvideo() {
		return provideo;
	}
	public void setProvideo(byte[] provideo) {
		this.provideo = provideo;
	}
	public String getProId() {
		return proId;
	}
	public void setProId(String proId) {
		this.proId = proId;
	}
	public String getProName() {
		return proName;
	}
	public void setProName(String proName) {
		this.proName = proName;
	}
	public Double getProPrice() {
		return proPrice;
	}
	public void setProPrice(Double proPrice) {
		this.proPrice = proPrice;
	}
	public String getProBrand() {
		return proBrand;
	}
	public void setProBrand(String proBrand) {
		this.proBrand = proBrand;
	}
	public String getProMadeIn() {
		return proMadeIn;
	}
	public void setProMadeIn(String proMadeIn) {
		this.proMadeIn = proMadeIn;
	}
	public Date getProMnfgDate() {
		return proMnfgDate;
	}
	public void setProMnfgDate(Date proMnfgDate) {
		this.proMnfgDate = proMnfgDate;
	}
	public Date getProExpDate() {
		return proExpDate;
	}
	public void setProExpDate(Date proExpDate) {
		this.proExpDate = proExpDate;
	}
	public byte[] getProImage() {
		return proImage;
	}
	public void setProImage(byte[] proImage) {
		this.proImage = proImage;
	}
	
}
