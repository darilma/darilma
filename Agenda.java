package projeto;

import java.util.ArrayList;

public class Agenda {
	private ArrayList<Contato> contato;

	public Agenda() {
		this.contato = new ArrayList<Contato>();
	}

	public void adicionarContato(Contato contato) {
		this.contato.add(contato);
	}

	public Contato buscarContato(String nome) {
		 for (Contato contato : contato) {
	            if (contato.getNome().equals(nome)) {
	                return contato;
	            }
	        }
	        return null;
	}

	public void removeContato( Contato contato ) {
		this.contato.remove(contato);
		
	}

	public String listarContato(String contao) {
		String saida = "";
		int i = 0;
		for (Contato contato : contato) {
			saida += " \nAgenda de Contato [ " + (i++) + " ]" + "\n";
			saida += contato.toString();
		}
		return saida;
	}

	public void editarContato(Contato contato) {
		
		System.out.println(contato.toString());

	}



}
