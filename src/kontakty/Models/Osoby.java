package kontakty.Models;

import java.util.Date;

public class Osoby {

	  private int idOsoby ;
	  private String osobaImie ;
	  private String osobaNazwisko;
	  private String osobaEmail ;
	  private String osobaTelefonDom ;
	  private String osobaTelefonPraca ;
	  private String osobaAdresUlica;
	  private String osobaAdresNrDomu ;
	  private String  osobaAdresNrMieszkania ;
	  private String osobaAdresMiasto;
	  private String osobaAdresKodPocztowy ;
	  private Date osobaUrodziny ;
	
	  public Osoby() {
		
	  }

	public Osoby(int idOsoby, String osobaImie, String osobaNazwisko, String osobaEmail, String osobaTelefonDom,
			String osobaTelefonPraca, String osobaAdresUlica, String osobaAdresNrDomu, String osobaAdresNrMieszkania,
			String osobaAdresMiasto, String osobaAdresKodPocztowy, Date osobaUrodziny) {
		super();
		this.idOsoby = idOsoby;
		this.osobaImie = osobaImie;
		this.osobaNazwisko = osobaNazwisko;
		this.osobaEmail = osobaEmail;
		this.osobaTelefonDom = osobaTelefonDom;
		this.osobaTelefonPraca = osobaTelefonPraca;
		this.osobaAdresUlica = osobaAdresUlica;
		this.osobaAdresNrDomu = osobaAdresNrDomu;
		this.osobaAdresNrMieszkania = osobaAdresNrMieszkania;
		this.osobaAdresMiasto = osobaAdresMiasto;
		this.osobaAdresKodPocztowy = osobaAdresKodPocztowy;
		this.osobaUrodziny = osobaUrodziny;
	}

	public int getIdOsoby() {
		return idOsoby;
	}

	public void setIdOsoby(int idOsoby) {
		this.idOsoby = idOsoby;
	}

	public String getOsobaImie() {
		return osobaImie;
	}

	public void setOsobaImie(String osobaImie) {
		this.osobaImie = osobaImie;
	}

	public String getOsobaNazwisko() {
		return osobaNazwisko;
	}

	public void setOsobaNazwisko(String osobaNazwisko) {
		this.osobaNazwisko = osobaNazwisko;
	}

	public String getOsobaEmail() {
		return osobaEmail;
	}

	public void setOsobaEmail(String osobaEmail) {
		this.osobaEmail = osobaEmail;
	}

	public String getOsobaTelefonDom() {
		return osobaTelefonDom;
	}

	public void setOsobaTelefonDom(String osobaTelefonDom) {
		this.osobaTelefonDom = osobaTelefonDom;
	}

	public String getOsobaTelefonPraca() {
		return osobaTelefonPraca;
	}

	public void setOsobaTelefonPraca(String osobaTelefonPraca) {
		this.osobaTelefonPraca = osobaTelefonPraca;
	}

	public String getOsobaAdresUlica() {
		return osobaAdresUlica;
	}

	public void setOsobaAdresUlica(String osobaAdresUlica) {
		this.osobaAdresUlica = osobaAdresUlica;
	}

	public String getOsobaAdresNrDomu() {
		return osobaAdresNrDomu;
	}

	public void setOsobaAdresNrDomu(String osobaAdresNrDomu) {
		this.osobaAdresNrDomu = osobaAdresNrDomu;
	}

	public String getOsobaAdresNrMieszkania() {
		return osobaAdresNrMieszkania;
	}

	public void setOsobaAdresNrMieszkania(String osobaAdresNrMieszkania) {
		this.osobaAdresNrMieszkania = osobaAdresNrMieszkania;
	}

	public String getOsobaAdresMiasto() {
		return osobaAdresMiasto;
	}

	public void setOsobaAdresMiasto(String osobaAdresMiasto) {
		this.osobaAdresMiasto = osobaAdresMiasto;
	}

	public String getOsobaAdresKodPocztowy() {
		return osobaAdresKodPocztowy;
	}

	public void setOsobaAdresKodPocztowy(String osobaAdresKodPocztowy) {
		this.osobaAdresKodPocztowy = osobaAdresKodPocztowy;
	}

	public Date getOsobaUrodziny() {
		return osobaUrodziny;
	}

	public void setOsobaUrodziny(Date osobaUrodziny) {
		this.osobaUrodziny = osobaUrodziny;
	}
	
	  
	
	
	
	
}
