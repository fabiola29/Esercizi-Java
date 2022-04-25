

public class Esame {

	String nome;
	int CFU;
	int voto;
	boolean lode;
	
	
	public Esame(String nome, int CFU, int voto, boolean lode) throws ExamException {
		super();
		
		setNome(nome);
		setCFU(CFU);
		setVoto(voto);
		setLode(lode);
		
		throw new ExamException();
	}
	
	
	
	@Override
	public String toString() {
		return "Esame [nome=" + nome + ", CFU=" + CFU + ", voto=" + voto + ", lode=" + lode + "]";
	}



	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) throws InvalidNomeException {
		if(nome == null) {
			throw new InvalidNomeException();
		}
		this.nome = nome;
	}
	
	
	
	public int getCFU() {
		return CFU;
	}
	public void setCFU(int CFU) throws InvalidCFUException {
		if(CFU < 0) {
			throw new InvalidCFUException();
		}
		this.CFU = CFU;
	}
	
	
	public int getVoto() {
		return voto;
	}
	public void setVoto(int voto) throws InvalidVotoException {
		if(voto < 0 || voto > 30) {
			throw new InvalidVotoException();
		}
		this.voto = voto;
	}
	public boolean isLode() {
		return lode;
	}
	public void setLode(boolean lode) throws InvalidVotoException {
		if(lode && this.voto != 30) {
			throw new InvalidVotoException();
		}
		this.lode = lode;
	}
	
}