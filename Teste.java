import java.util.ArrayList;

/*
public class TesteApp {
	static double nota = 0;

	static void printaGrupoTeste(ArrayList<Boolean> testes, String titulo, double peso) {
		System.out.print("conjunto de testes - " + titulo + ": ");
		int acertos = 0;
		for (boolean teste : testes) {
			if (teste) {
				System.out.print("o");
				acertos++;
			} else {
				System.out.print("x");
			}
		}
		double notaGrupo = acertos * peso / testes.size();
		System.out.println(" - " + acertos + "/" + testes.size() + "(" + notaGrupo + ")");
		nota += notaGrupo;
	}
	public static void main(String[] args) {
		ArrayList<Boolean> t1 = new ArrayList<>();
		ArrayList<Boolean> t2 = new ArrayList<>();
		ArrayList<Boolean> t3 = new ArrayList<>();
		
		Mago mago = new Mago ("H.Potter",10);			//vida:100 e magia:10
		Guerreiro guerreiro = new Guerreiro("Aragorn"); //vida:250
		
		t1.add(mago instanceof Personagem);				//testa herança Mago é um Personagem
		t1.add(guerreiro instanceof Personagem);		//testa herança Guerreiro é um Personagem
		t1.add(mago.getMagia()==10);
		t1.add(mago.getMaxMagia()==10);
		t1.add(mago.getMaxVida()==100);
		t1.add(mago.getVida()==100);
		t1.add(guerreiro.getVida()==250);
		t1.add(guerreiro.isVivo());
		t1.add(guerreiro.toString().equals("Aragorn - vida:250/250"));

		mago.passaTurno();					//não ganha magia, pois já tem o máximo
		guerreiro.passaTurno();				//não ganha vida, pois já tem o máximo
		//os dois se atacam
		mago.ataca(guerreiro);				//mago (vida:100 mp:6) guerreiro (vida:200) 
		guerreiro.ataca(mago);				//mago (vida:75 mp:6) guerreiro (vida:200)
		//passa o turno
		mago.passaTurno();					//ganha 2 de magia
		guerreiro.passaTurno();				//ganha 10 de vida
		
		t2.add(mago.getMagia()==8);			//magia = 10-4+2
		t2.add(mago.getVida()==75);			//vida = 100-25
		t2.add(guerreiro.getVida()==210);	//vida = 250-50+10
		t2.add(mago.toString().equals("H.Potter - vida:75/100 - Magia:8/10"));
		
		//mais ataques
		mago.ataca(guerreiro);				//mago (vida:75 mp:4) guerreiro (vida:160) - ataque mágico 
		mago.ataca(guerreiro);				//mago (vida:75 mp:0) guerreiro (vida:110) - ataque mágico
		mago.ataca(guerreiro);				//mago (vida:75 mp:0) guerreiro (vida:105) - ataque sem magia
		guerreiro.ataca(mago);				//mago (vida:50 mp:0) guerreiro (vida:105)
		guerreiro.ataca(mago);				//mago (vida:25 mp:0) guerreiro (vida:105)
		guerreiro.ataca(mago);				//mago (vida:0 mp:0) guerreiro (vida:105)

		t2.add(mago.getMagia()==0);			
		t2.add(mago.getVida()==0);			
		t2.add(guerreiro.getVida()==105);
		t2.add(guerreiro.isVivo());
		t2.add(!mago.isVivo());
		
		mago.passaTurno();					//ganha nada pois morreu
		guerreiro.passaTurno();				//ganha 10 de vida
		mago.ataca(guerreiro);				//não consegue pois morreu
		guerreiro.ataca(mago);				//nada ocorre pois mago morreu
		
		t3.add(mago.getMagia()==0);			
		t3.add(mago.getVida()==0);			
		t3.add(guerreiro.getVida()==115);
		
		Mago magoSupremo = new Mago("Gandalf",80);
		
		magoSupremo.ataca(guerreiro);	//guerreiro fica com 65 de vida
		magoSupremo.ataca(guerreiro);	//guerreiro fica com 15 de vida
		magoSupremo.ataca(guerreiro);	//guerreiro fica com 0 de vida
		guerreiro.ataca(magoSupremo);	//nada ocorre, guerreiro morreu
		guerreiro.passaTurno();			//nada ocorre, guerreiro morreu

		t3.add(magoSupremo.getMagia()==68);			
		t3.add(!guerreiro.isVivo());			
		t3.add(guerreiro.getVida()==0);

		System.out.println("---Game Over!---");
		System.out.println(mago);
		System.out.println(magoSupremo);
		System.out.println(guerreiro);

		System.out.println("\n---resultados dos testes!---");
		printaGrupoTeste(t1, "grupo de testes 1", 2.5); // o --> acerto, x --> erro
		printaGrupoTeste(t2, "grupo de testes 2", 4); // o --> acerto, x --> erro
		printaGrupoTeste(t3, "grupo de testes 3", 3.5); // o --> acerto, x --> erro
		System.out.println("Nota Parcial: " + nota + "/10");
	}
  */
  }
