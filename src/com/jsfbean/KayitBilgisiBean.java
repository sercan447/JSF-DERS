package com.jsfbean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.NoneScoped;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.SessionScoped;

@ManagedBean(name="kayit")
@SessionScoped
public class KayitBilgisiBean implements Serializable{
	
private List<KayitBilgisiBean> kayit = null;
	
	private String adiniz;
	private String soyadiniz;
	private String adres;
	private String kimlikno;
	private String cinsiyet;
	private String sehir;
	private String takim;
	
	private ArrayList<String> diller = new ArrayList<>();
	private List<String> kutuphane = new ArrayList<>();

	@PostConstruct
	public void init() {
		kayit = new ArrayList<>();
	}
	
	public KayitBilgisiBean() {
		
	}


	public String getAdiniz() {
		return adiniz;
	}


	public void setAdiniz(String adiniz) {
		this.adiniz = adiniz;
	}


	public String getSoyadiniz() {
		return soyadiniz;
	}


	public void setSoyadiniz(String soyadiniz) {
		this.soyadiniz = soyadiniz;
	}


	public String getAdres() {
		return adres;
	}


	public void setAdres(String adres) {
		this.adres = adres;
	}


	public String getKimlikno() {
		return kimlikno;
	}


	public void setKimlikno(String kimlikno) {
		this.kimlikno = kimlikno;
	}


	public String getCinsiyet() {
		return cinsiyet;
	}


	public void setCinsiyet(String cinsiyet) {
		this.cinsiyet = cinsiyet;
	}


	public String getSehir() {
		return sehir;
	}


	public void setSehir(String sehir) {
		this.sehir = sehir;
	}


	public String getTakim() {
		return takim;
	}


	public void setTakim(String takim) {
		this.takim = takim;
	}


	public ArrayList<String> getDiller() {
		return diller;
	}


	public void setDiller(ArrayList<String> diller) {
		this.diller = diller;
	}


	public List<String> getKutuphane() {
		return kutuphane;
	}


	public void setKutuphane(List<String> kutuphane) {
		this.kutuphane = kutuphane;
	}

	
	
	
	public List<KayitBilgisiBean> getKayit() {
		return kayit;
	}


	public void setKayit(List<KayitBilgisiBean> kayit) {
		this.kayit = kayit;
	}

	
	

	@Override
	public String toString() {
		return "KayitBilgisiBean [adiniz=" + adiniz + ", soyadiniz=" + soyadiniz + ", adres=" + adres + ", kimlikno="
				+ kimlikno + ", cinsiyet=" + cinsiyet + ", sehir=" + sehir + ", takim=" + takim + ", diller=" + diller
				+ ", kutuphane=" + kutuphane + "]";
	}


	public void ActionSonucu() {
		
		
		KayitBilgisiBean b = new KayitBilgisiBean();
		b.setAdiniz(this.adiniz);
		b.setSoyadiniz(this.soyadiniz);
		b.setAdres(getAdres());
		b.setKimlikno(getKimlikno());
		b.setSehir(this.getSehir());
		b.setCinsiyet(getCinsiyet());
		b.setTakim(getTakim());
		b.setDiller(getDiller());
		b.setKutuphane(getKutuphane());
		
		kayit.add(b);

		
		for(KayitBilgisiBean t : kayit) {
			System.out.println("Adý : "+t.getAdiniz());
		}

		
//		
//		System.out.println("Soyadý :"+this.soyadiniz);
//		System.out.println("Adres : "+this.adres);
//		System.out.println("Kimlik NO:"+this.kimlikno);
//		System.out.println("Cinsiyet : "+this.cinsiyet);
//		System.out.println("Sehir : "+this.sehir);
//		System.out.println("Takým : "+this.takim);
//		System.out.println("Kullanýlan Diller : "+this.diller);
//		System.out.println("Kutuphane : "+this.kutuphane);
//		
		
		
	}
	
	
}
