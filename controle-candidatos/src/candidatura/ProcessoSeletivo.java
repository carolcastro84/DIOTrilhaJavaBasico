package candidatura;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

import javax.lang.model.util.ElementScanner14;

public class ProcessoSeletivo {
    

    public static void main(String[] args) {
        String[] candidatosSelecionados = new String[5];
        selecaoCandidatos(candidatosSelecionados);
        imprimirSelecionados(candidatosSelecionados);

        for (String candidato: candidatosSelecionados){
            entrandoEmContato(candidato);
        }
    }

    static void entrandoEmContato(String candidato){

        int tentativasRealizadas = 1;
        boolean continuarTentando = true;
        boolean atendeu = false;

        do {
            atendeu = atender();
            continuarTentando = !atendeu;
            if (continuarTentando)
                tentativasRealizadas++;
            else
                System.out.println("Atendeu");
        }while (continuarTentando && tentativasRealizadas < 3);

        if (atendeu){
            System.out.println(candidato + " conseguimos contato na " + tentativasRealizadas + " tentativa");
        }
        else {
            System.out.println(candidato + " Não conseguimos contato");
        }
    }

    static boolean atender(){
        return new Random().nextInt(3) == 1;
    }

    static double valorPretendido(){
        return ThreadLocalRandom.current().nextDouble(1800,2200);
    }

    static void imprimirSelecionados(String[] listaCandidatos){
        for (int indice = 0; indice < listaCandidatos.length; indice++){
            if (!(listaCandidatos[indice] == null))
                System.out.println("Candidato número " + (indice+1) + " é o candidato " + listaCandidatos[indice]);
        }

        for(String candidato: listaCandidatos){
            if (!(candidato == null))
                System.out.println("Candidato selecionado foi candidato " + candidato);
        }
    }

    static void selecaoCandidatos(String[] candidatosSelecionadoslista){
        String[] candidatos = {"Felipe", "Marcia", "Julia", "Paulo", "Augusto", "Monica", "Fabricio", "Mirela", "Daniela", "Jorge"};
        
        int candidadtosSelecionados = 0;
        int candidatoAtual = 0;
        double salarioBase = 2000.0;
        

        while (candidadtosSelecionados < 5 && candidatoAtual < candidatos.length){
            String candidato = candidatos[candidatoAtual];
            double salarioPretendido = valorPretendido();
            if (salarioBase >= salarioPretendido){
                candidatosSelecionadoslista[candidadtosSelecionados] = candidato;
                candidadtosSelecionados++;
                System.out.println("Candidato selecionado " + candidato + " com o valor " + salarioPretendido);
            }

            candidatoAtual++;

        }
    }

    static void imprimirSelecionados(){

    }

    static void analisarCandidato(double salarioPretendido){
        double salarioBase = 2000.0;

        if (salarioBase > salarioPretendido){
            System.out.println("Ligar para o candidato");
        }else if (salarioBase == salarioPretendido)
            System.out.println("Ligar para o candidato com contra proposta");
        else 
            System.out.println("Aguardar demais candidatos");
    }
}
