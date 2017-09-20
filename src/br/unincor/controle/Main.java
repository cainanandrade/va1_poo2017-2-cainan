package br.unincor.controle;

import java.util.ArrayList;
import java.util.List;

import br.unincor.exception.EvolucaoException;
import br.unincor.model.Pokemon;
import br.unincor.view.Usuario;

public class Main {

	public static void main(String[] args) {
		Usuario user = new Usuario();
		
		Operacoes op = new Operacoes();
		
		Integer qntPokemons = user.recebeInteiro("Entre com a quantidade "
				+ "de Pokemons: ");
		
		while (qntPokemons == null)
			qntPokemons = user.recebeInteiro("Entre com a quantidade "
					+ "de Pokemons: ");
		
		List<Pokemon> listaPok = new ArrayList<Pokemon>();
		
		for (int i = 0; i < qntPokemons; i++) {			
			Pokemon pokemon = new Pokemon(user.recebeTexto("Nome: "), 
					user.recebeTexto("Tipo: "), user.recebeDouble("Peso: "),
					user.recebeDouble("Altura: "));
			
			listaPok.add(pokemon);
		}
		
		for (int i = 0; i < listaPok.size(); i++) {
			try {
				op.evoluir(listaPok.get(i));
				user.exibeMsg("O POKEMON EVOLUIU!!!");
			} catch (EvolucaoException ee) {
				ee.getMessage();
				user.exibeMsgErro("O POKEMON NÃO POSSUI PONTOS DE COMBATE "
						+ "SUFICIENTES PARA EVOLUIR!!!");
			} 
		}
		
		user.exibeMsg("Maior CP: \n\n\n" + op.maiorCp(listaPok).verDados());
		
		user.exibeMsg("Menor CP: \n\n\n" + op.menorCp(listaPok).verDados());
		
		
	}

}
