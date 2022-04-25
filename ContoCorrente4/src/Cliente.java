
public class Cliente {

	 //ATTRIBUTI
	public String Nome;
	public String Cognome;
	public String CodiceFiscale;
	public String email;
	public String telefono;
	
	
	//COSTRUTTORI
	
	public Cliente(String nome, String cognome, String codiceFiscale, String email, String telefono) {
		setNome(nome);
		setCognome(cognome);
		setCodiceFiscale(codiceFiscale);
		this.setEmail(email);
		this.setTelefono(telefono);
	}


	public String getCognome() {
		return Cognome;
	}


	public void setCognome(String cognome) {
		Cognome = cognome;
	}


	public String getNome() {
		return Nome;
	}


	public void setNome(String nome) {
		Nome = nome;
	}


	public String getCodiceFiscale() {
		return CodiceFiscale;
	}


	public void setCodiceFiscale(String codiceFiscale) {
		CodiceFiscale = codiceFiscale;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getTelefono() {
		return telefono;
	}


	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}


	@Override
	public String toString() {
		return "Cliente [Nome=" + Nome + ", Cognome=" + Cognome + ", CodiceFiscale=" + CodiceFiscale + ", email="
				+ email + ", telefono=" + telefono + "]";
	}

	
	
}
