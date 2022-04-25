
public class Cliente {

	 //ATTRIBUTI
	private String Nome;
	private String Cognome;
	private String CodiceFiscale;
	private String email;
	private String telefono;
	
	
	//COSTRUTTORI
	
	public Cliente(String nome, String cognome, String codiceFiscale, String email, String telefono) {
		setNome(nome);
		setCognome(cognome);
		setCodiceFiscale(codiceFiscale);
		this.setEmail(email);
		this.setTelefono(telefono);
	}

	

//	@Override
//	public int hashCode() {
//		final int prime = 31;
//		int result = 1;
//		result = prime * result + ((CodiceFiscale == null) ? 0 : CodiceFiscale.hashCode());
//		result = prime * result + ((Cognome == null) ? 0 : Cognome.hashCode());
//		result = prime * result + ((Nome == null) ? 0 : Nome.hashCode());
//		result = prime * result + ((email == null) ? 0 : email.hashCode());
//		result = prime * result + ((telefono == null) ? 0 : telefono.hashCode());
//		return result;
//	}



//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		Cliente other = (Cliente) obj;
//		if (CodiceFiscale == null) {
//			if (other.CodiceFiscale != null)
//				return false;
//		} else if (!CodiceFiscale.equals(other.CodiceFiscale))
//			return false;
//		if (Cognome == null) {
//			if (other.Cognome != null)
//				return false;
//		} else if (!Cognome.equals(other.Cognome))
//			return false;
//		if (Nome == null) {
//			if (other.Nome != null)
//				return false;
//		} else if (!Nome.equals(other.Nome))
//			return false;
//		if (email == null) {
//			if (other.email != null)
//				return false;
//		} else if (!email.equals(other.email))
//			return false;
//		if (telefono == null) {
//			if (other.telefono != null)
//				return false;
//		} else if (!telefono.equals(other.telefono))
//			return false;
//		return true;
//	}



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

}

