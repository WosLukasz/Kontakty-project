package kontakty.Models;

public class UserAcount {

	  private int iduser ;
	  private String userImie ;
	  private String userNazwisko ;
	  private String username ;
	  private String password ;
	
	  	  
	  public UserAcount() {
		
		
	  }

	public UserAcount(int iduser, String userImie, String userNazwisko, String username, String password) {
		super();
		this.iduser = iduser;
		this.userImie = userImie;
		this.userNazwisko = userNazwisko;
		this.username = username;
		this.password = password;
	}

	public int getIduser() {
		return iduser;
	}

	public void setIduser(int iduser) {
		this.iduser = iduser;
	}

	public String getUserImie() {
		return userImie;
	}

	public void setUserImie(String userImie) {
		this.userImie = userImie;
	}

	public String getUserNazwisko() {
		return userNazwisko;
	}

	public void setUserNazwisko(String userNazwisko) {
		this.userNazwisko = userNazwisko;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
			

}
