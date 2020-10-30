package repository;

import java.util.ArrayList;
import java.util.List;

import model.Campeonato;

public class CampeonatoRepository {
	
public List<Campeonato> listaCampeonatos = new ArrayList<Campeonato>();
	
	//pega na lista
	public Campeonato getCampeonato() {
		return new Campeonato();
	}
	
	//pega todas as listas
	public List<Campeonato> getAllCampeonato(){
		return new ArrayList<Campeonato>();
	}
	
	//grava na lista
	public void setCampeonato(Campeonato campeonato) {
	}

}
