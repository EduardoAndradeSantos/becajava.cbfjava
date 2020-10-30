package repository;

import java.util.ArrayList;
import java.util.List;

import model.Posicao;

public class PosicaoRepository {
	
	public List<Posicao> listaPosicoes = new ArrayList<Posicao>();
	
	//pega na lista
	public Posicao getPosicao() {
		return new Posicao();
	}
	
	//pega todas as listas
	public List<Posicao> getAllPosicao(){
		return new ArrayList<Posicao>();
	}
	
	//grava na lista
	public void setPosicao(Posicao posicao) {
	}
}