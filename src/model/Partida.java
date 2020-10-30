package model;

public class Partida {
	public int id;
	public int mandanteid;
	public int golsmandante;
	public int visitanteid;
	public int golsvisitante;
	public int campeonatoid;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getMandanteid() {
		return mandanteid;
	}
	public void setMandanteid(int mandanteid) {
		this.mandanteid = mandanteid;
	}
	public int getGolsmandante() {
		return golsmandante;
	}
	public void setGolsmandante(int golsmandante) {
		this.golsmandante = golsmandante;
	}
	public int getVisitanteid() {
		return visitanteid;
	}
	public void setVisitanteid(int visitanteid) {
		this.visitanteid = visitanteid;
	}
	public int getGolsvisitante() {
		return golsvisitante;
	}
	public void setGolsvisitante(int golsvisitante) {
		this.golsvisitante = golsvisitante;
	}
	public int getCampeonatoid() {
		return campeonatoid;
	}
	public void setCampeonatoid(int campeonatoid) {
		this.campeonatoid = campeonatoid;
	}
}
