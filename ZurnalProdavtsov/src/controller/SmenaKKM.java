package controller;

public class SmenaKKM {
	
	String date;
	String Prodavets;
	String namberSmena;
	String namberKassa;
	double zet;
	double nal;
	double bezNal;
	double rashod;
	double otklonenie;
	boolean udalen; //не участвует в расчете.....нужно сделать права на изменение
	
	String timeBeforeWork;//время прибытия на работу....количество минут опоздания ...и сумма штрафа
	String ProdavetsSmenshhik;
	String Tovaroved;
	
	public String getTovaroved() {
		return Tovaroved;
	}

	public void setTovaroved(String tovaroved) {
		Tovaroved = tovaroved;
	}

	public double otclonenieRaschet() {
		otklonenie = (nal + bezNal + rashod)- zet;
		return otklonenie;
		}
	
	public String getDate() {
		return date;
	}
	
	public void setDate(String date) {
		this.date = date;
	}
	
	public String getProdavets() {
		return Prodavets;
	}
	
	public void setProdavets(String prodavets) {
		Prodavets = prodavets;
	}
	
	public String getNamberSmena() {
		return namberSmena;
	}
	
	public void setNamberSmena(String string) {
		this.namberSmena = string;
	}
	
	public String getNamberKassa() {
		return namberKassa;
	}
	
	public void setNamberKassa(String namberKassa) {
		this.namberKassa = namberKassa;
	}
	
	public double getZet() {
		return zet;
	}
	
	public double getBezNal() {
		return bezNal;
	}

	public void setBezNal(double bezNal) {
		
		this.bezNal =bezNal;
	}

	public void setZet(double zet) {
		this.zet = zet;
	}
	
	public double getNal() {
		return nal;
	}
	
	public void setNal(double nal) {
		this.nal = nal;
	}
	
	public double getRashod() {
		return rashod;
	}
	
	public void setRashod(double rashod) {
		this.rashod = rashod;
	}
	/////////////////////////////////////////////////////////////////////
	//
	public double getOtklonenie() {
		return otklonenie;
	}
	
	//public void setOtklonenie(double otklonenie) {
	//	this.otklonenie = otklonenie;
	//}
	////////////////////////////////////////////////////////////////////
	public boolean isUdalen() {
		return udalen;
	}
	
	public void setUdalen(boolean udalen) {
		this.udalen = udalen;
	}
	
	public String getTimeBeforeWork() {
		return timeBeforeWork;
	}
	
	public void setTimeBeforeWork(String timeBeforeWork) {
		this.timeBeforeWork = timeBeforeWork;
	}
	
	public String getProdavetsSmenshhik() {
		return ProdavetsSmenshhik;
	}
	
	public void setProdavetsSmenshhik(String prodavetsSmenshhik) {
		ProdavetsSmenshhik = prodavetsSmenshhik;
	}
}
