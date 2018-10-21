package com.jsfbean;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;

@ManagedBean(name="anasayfa")
@SessionScoped
public class AnasayfaBean {

	
	@ManagedProperty(value = "#{kayit}")
	private KayitBilgisiBean kayitBean;
	
	
	private List<KayitBilgisiBean> liste;
	
	@PostConstruct
	public void baslangic() {
		liste = kayitBean.getKayit();
	}
	
	@PreDestroy
	public void son() {
		
		
	}
	public AnasayfaBean() {
		
	}


	public KayitBilgisiBean getKayitBean() {
		return kayitBean;
	}


	public void setKayitBean(KayitBilgisiBean kayitBean) {
		this.kayitBean = kayitBean;
	}


	public List<KayitBilgisiBean> getListe() {
		return liste;
	}


	public void setListe(List<KayitBilgisiBean> liste) {
		this.liste = liste;
	}



	

}
