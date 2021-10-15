package ProjetoAdote;

import java.util.ArrayList;
import java.util.Scanner;

public class Adote {

	public static void main(String[] args) {
//DECLARAÇÃO DE VARIAVEIS
	    Scanner input = new Scanner(System.in);
	    int animal;
        String cast;
        String sexo;
        String ambc = null;
        String amba = null;
        String porte;
        int qtd = 0;
        int op;
//OBJETOS
        //Contem info dos animais cadastrados no sistema
        cachorroegato cachorro1 = new cachorroegato("CACHORRO","Bini","Macho","Castrado","Vacinado","Sim","Não","Marrom","Dobermann","Grande");
        cachorroegato cachorro2 = new cachorroegato("CACHORRO","Amelia","Femea","Não Castrado","Vacinado","Sim","Não","Preto","Viralata","Pequeno");
        cachorroegato cachorro3 = new cachorroegato("CACHORRO","Claudinho","Macho"," Não Castrado","Não Vacinado","Não","Sim","Branco/Preto","Dalmata","Pequeno");
        cachorroegato cachorro4 = new cachorroegato("CACHORRO","Estrela","Femea","Castrado","Não Vacinado","Sim","Não","Branco","Viralata","Grande");
        
        cachorroegato	gato1	= new cachorroegato("GATO","Gio","Macho","Castrado","Vacinado","Sim","Não","Branco","Viralata","Grande");
        cachorroegato	gato2	= new cachorroegato("GATO","Shie","Femea","Não Castrado","Vacinado","Não","Não","Listrado","Viralata","Pequeno");
        cachorroegato	gato3	= new cachorroegato("GATO","Andreia","Femea","Castrado","Não Vacinado","Não","Sim","Marrom","Viralata","Grande");
        cachorroegato	gato4	= new cachorroegato("GATO","Kevin","Macho","Não Castrado","Não Vacinado","Não","Não","Preto","Viralata","Grande");
    
//ARRAYLIST 
        //Separa os objetos do tipo gato e cachorro
        ArrayList<cachorroegato> cachorros = new ArrayList<>();
        ArrayList<cachorroegato> gatos = new ArrayList<>();
//ADICIONAMENTO OBJETOS DENTRO DO ARRAYLIST
        cachorros.add(cachorro1);
        cachorros.add(cachorro2);
        cachorros.add(cachorro3);
        cachorros.add(cachorro4);
        
        gatos.add(gato1);
        gatos.add(gato2);
        gatos.add(gato3);
        gatos.add(gato4);
        
        
        System.out.println("==================================================================================");
        System.out.println("==========================BEM-VINDE À <VIRALA-TÁ/>!!!=============================");
        System.out.println("==================================================================================\n\n");
        System.out.println("Você deseja adotar Cachorro ou Gato?\n");
        System.out.println("(1)CACHORRO\n");
        System.out.println("(2)GATO\n");
        System.out.println("Opção: ");animal=input.nextInt();
        
switch(animal){
        case 1: //CACHORROS
        	//IMPRIME LISTA DE CACHORROS DISPONÍVEIS
        	System.out.println("\n\nLista de Cachorrinhos para adoção: ");
        	for(int i = 0; i < 4;i++) {
            System.out.println(cachorros.get(i));
            System.out.println("\n-----------------------------------");
        	}
        	System.out.println("\n-----------------------------------");
        	System.out.println("\n\nDeseja adotar quantos?");
        	qtd = input.nextInt();
        
        	//FILTRAR LISTA POR CARACTERISTICAS ESPECIFICAS
        	System.out.println("\nDeseja filtrar por caracteristicas?");
        	System.out.println("\n-----------------------------------");
        	System.out.println("\n(1) SIM");
        	System.out.println("\n(2) NãO");
        	System.out.println("\nOPÇÃO:");op=input.nextInt();
        	System.out.println("\n-----------------------------------");

        		switch(op) {
        			case 1:

        				for(int i = 0; qtd != i ; i++ ){
        				System.out.println("Filtrar Se esta castrado?");
        				System.out.println("Sim = 1");
        				System.out.println("Não = 0");
        				int r = input.nextInt();

        				switch (r) {
                        case 0 -> cast = "Não Castrado";
                        case 1 -> cast = "Castrado";
                        default -> throw new IllegalStateException("Unexpected value: " + r);
        				}

                        System.out.println("Masculino = 1");
                        System.out.println("Feminino = 2");
                        int s = input.nextInt();
                        switch (s) {
                        case 1 -> sexo = "Macho";
                        case 2 -> sexo = "Femea";
                        default -> throw new IllegalStateException("Unexpected value: " + s);
                        }
                            
                        System.out.println("Preferencialmente o cachorro seria bom para viver em que ambiente?");
                        System.out.println("Apto = 0");
                        System.out.println("Casa = 1");
                        System.out.println("Ambos = 2");
                        int a = input.nextInt();
                        if(a == 0) {
                    	ambc = "Não";
                    	amba = "Sim";
                        }
                        else if(a == 1) {
                    	ambc = "Sim";
                    	amba = "Não";
                        }
                        else if(a == 2) {
                    	amba = "Sim";
                    	ambc = "Sim";
                        }
                    
                        System.out.println("Preferencialmente o cachorro seria de qual Porte?");
                        System.out.println("Pequeno = 0");
                        System.out.println("Grande = 1");
                        System.out.println("Medio = 2");
                        int c = input.nextInt();
                        switch(c) {
                        case 0 -> porte = "Pequeno";
                        case 1 -> porte = "Grande";
                        case 2 -> porte = "Medio";
                        default -> throw new IllegalStateException("Unexpected value: " + c);
                        }
                   
                    
                        //ANALISE DAS CARACTERISTICAS SELECIONADAS PELO USUARIO                  
                        for(int h = 0; h < 4; h++){
                        if(cachorros.get(h).castrado == cast && cachorros.get(h).sexo == sexo && cachorros.get(h).porte == porte && cachorros.get(h).Apto == amba && cachorros.get(h).Casa == ambc)
                            System.out.println(cachorros.get(h));
                        }
                }
                break;

    			case 2:
                System.out.println("Qual doguinho deseja adotar?");  
                break;
        }break;
        		
        		
        case 2://GATOS
        	//IMPRIME LISTA DE CACHORROS DISPONÍVEIS
        	System.out.println("\n\nLista de Gatinhos para adoção: ");
        	for(int i = 0; i < 4;i++) {
            System.out.println(gatos.get(i));
            System.out.println("\n-----------------------------------");
        	}
        	System.out.println("\n-----------------------------------");
        	System.out.println("\n\nDeseja adotar quantos?");
        	qtd = input.nextInt();
        	
        	//FILTRAR LISTA POR CARACTERISTICAS ESPECIFICAS
        	System.out.println("\nDeseja filtrar por caracteristicas?");
        	System.out.println("\n-----------------------------------");
        	System.out.println("\n(1) SIM");
        	System.out.println("\n(2) NãO");
        	System.out.println("\nOPÇÃO:");op=input.nextInt();
        	System.out.println("\n-----------------------------------");
        	
        		switch(op) {
        		case 1:
        			for(int i = 0; qtd != i ; i++ ){
        				System.out.println("Filtrar Se esta castrado?");
        				System.out.println("Sim = 1");
        				System.out.println("Não = 0");
        				int r = input.nextInt();

        				switch (r) {
                        case 0 -> cast = "Não Castrado";
                        case 1 -> cast = "Castrado";
                        default -> throw new IllegalStateException("Unexpected value: " + r);
        				}

                        System.out.println("Macho = 1");
                        System.out.println("Femea = 2");
                        int s = input.nextInt();
                        switch (s) {
                        case 1 -> sexo = "Macho";
                        case 2 -> sexo = "Femea";
                        default -> throw new IllegalStateException("Unexpected value: " + s);
                        }
                            
                        System.out.println("Preferencialmente o cachorro seria bom para viver em que ambiente?");
                        System.out.println("Apto = 0");
                        System.out.println("Casa = 1");
                        System.out.println("Ambos = 2");
                        int a = input.nextInt();
                        if(a == 0) {
                    	ambc = "Não";
                    	amba = "Sim";
                        }
                        else if(a == 1) {
                    	ambc = "Sim";
                    	amba = "Não";
                        }
                        else if(a == 2) {
                    	amba = "Sim";
                    	ambc = "Sim";
                        }
                    
                        System.out.println("Preferencialmente o gato seria de qual Porte?");
                        System.out.println("Pequeno = 0");
                        System.out.println("Grande = 1");
                        System.out.println("Medio = 2");
                        int c = input.nextInt();
                        switch(c) {
                        case 0 -> porte = "Pequeno";
                        case 1 -> porte = "Grande";
                        case 2 -> porte = "Medio";
                        default -> throw new IllegalStateException("Unexpected value: " + c);
                        }
                   
                    
                        //ANALISE DAS CARACTERISTICAS SELECIONADAS PELO USUARIO                  
                        for(int h = 0; h < 4; h++){
                        if(gatos.get(h).castrado == cast && gatos.get(h).sexo == sexo && gatos.get(h).porte == porte && gatos.get(h).Apto == amba && gatos.get(h).Casa == ambc)
                            System.out.println(gatos.get(h));
                        }
                }
        			break;
        		case 2:
                    System.out.println("Qual doguinho deseja adotar?");  
                    
                    break;
        		}
        	
}
    }
	}