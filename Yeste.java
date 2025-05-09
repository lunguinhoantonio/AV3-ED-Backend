import tiposInvestimento.*;
import register.Registro;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Yeste {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Registro<Object> registros = new Registro<>();
        
        List<TesouroSelic> listaTSelic = new ArrayList<>();
        List<Acao> listaAcoes = new ArrayList<>();
        List<Poupanca> listaPoupanca = new ArrayList<>();
        List<CDB> listaCDB = new ArrayList<>();
        int opc;
        do {
            System.out.println("Selecione a opcao desejada:");
            System.out.println("0 - Finalizar programa");
            System.out.println("1 - Fazer investimento");
            System.out.println("2 - Listar simulações");
            System.out.print("Selecao: ");
            opc = sc.nextInt();
            sc.nextLine();

            switch(opc){
                case 1:
                    int tipo;
                    do {
                        System.out.println("Selecione um tipo de investimento:");
                        System.out.println("0 - Voltar ao menu principal");
                        System.out.println("1 - Poupanca");
                        System.out.println("2 - CDB");
                        System.out.println("3 - Tesouro Selic");
                        System.out.println("4 - Acoes");
                        System.out.print("Tipo: ");
                        tipo = sc.nextInt();
                        sc.nextLine();

                        double capital;
                        int tempo;
                        switch (tipo) {
                            case 1:
                                do {
                                    System.out.print("Informe o capital inicial (R$): ");
                                    capital = sc.nextDouble();
                                    if (capital <= 0) {
                                        System.out.println("O investimento inicial não deve ser menor ou igual a 0");
                                    }
                                } while (capital <= 0);
                                do {
                                    System.out.print("Informe o tempo em meses: ");
                                    tempo = sc.nextInt();
                                    if (tempo < 0) {
                                        System.out.println("O tempo não pode ser negativo!");
                                    }
                                } while (tempo < 0);
                                listaPoupanca.add(new Poupanca(capital, tempo));
                                listaPoupanca.getLast().calcValorFinal();
                                System.out.print("Resultado de " + listaPoupanca.getLast().getQuantMeses() + (listaPoupanca.getLast().getQuantMeses() == 1 ? " mês" : " meses") + ": ");
                                System.out.printf("R$%.2f\n", listaPoupanca.getLast().getMontante());
                                System.out.printf("Rendeu %.2f%%!\n", listaPoupanca.getLast().getPorcRendimento());
                                registros.add(listaPoupanca.getLast());
                                break;
                            case 2:
                                do {
                                    System.out.print("Informe o capital inicial (R$): ");
                                    capital = sc.nextDouble();
                                    if (capital <= 0) {
                                        System.out.println("O investimento inicial não deve ser menor ou igual a 0");
                                    }
                                } while (capital <= 0);
                                do {
                                    System.out.print("Informe o tempo em anos: ");
                                    tempo = sc.nextInt();
                                    if (tempo < 0) {
                                        System.out.println("O tempo não pode ser negativo!");
                                    }
                                } while (tempo < 0);
                                listaCDB.add(new CDB(capital, tempo));
                                listaCDB.getLast().calcValorFinal();
                                System.out.print("Resultado de " + listaCDB.getLast().getQuantAnos() + (listaCDB.getLast().getQuantAnos() == 1 ? " ano" : " anos") + ": ");
                                System.out.printf("R$%.2f\n", listaCDB.getLast().getMontante());
                                System.out.printf("Rendeu %.2f%%!\n", listaCDB.getLast().getPorcRendimento());
                                registros.add(listaCDB.getLast());
                                break;
                            case 3:
                                do {
                                    System.out.print("Informe o capital inicial (R$): ");
                                    capital = sc.nextDouble();
                                    if (capital <= 0) {
                                        System.out.println("O investimento inicial não deve ser menor ou igual a 0");
                                    }
                                } while (capital <= 0);
                                do {
                                    System.out.print("Informe o tempo em anos: ");
                                    tempo = sc.nextInt();
                                    if (tempo < 0) {
                                        System.out.println("O tempo não pode ser negativo!");
                                    }
                                } while (tempo < 0);
                                listaTSelic.add(new TesouroSelic(capital, tempo));
                                listaTSelic.getLast().calcValorFinal();
                                System.out.print("Resultado de " + listaTSelic.getLast().getQuantAnos() + (listaTSelic.getLast().getQuantAnos() == 1 ? " ano" : " anos") + ": ");
                                System.out.printf("R$%.2f\n", listaTSelic.getLast().getMontante());
                                System.out.printf("Rendeu %.2f%%!\n", listaTSelic.getLast().getPorcRendimento());
                                registros.add(listaTSelic.getLast());
                                break;
                            case 4:
                                do {
                                    System.out.print("Informe o capital inicial (R$): ");
                                    capital = sc.nextDouble();
                                    if (capital <= 0) {
                                        System.out.println("O investimento inicial não deve ser menor ou igual a 0");
                                    }
                                } while (capital <= 0);
                                do {
                                    System.out.print("Informe o tempo em meses: ");
                                    tempo = sc.nextInt();
                                    if (tempo < 0) {
                                        System.out.println("O tempo não pode ser negativo!");
                                    }
                                } while (tempo < 0);
                                listaAcoes.add(new Acao(capital, tempo));
                                listaAcoes.getLast().calcValorFinal();
                                System.out.print("Resultado de " + listaAcoes.getLast().getQuantMeses() + (listaAcoes.getLast().getQuantMeses() == 1 ? " mês" : " meses") + ": ");
                                System.out.printf("R$%.2f\n", listaAcoes.getLast().getMontante());
                                System.out.print(listaAcoes.getLast().getPorcRendimento() < 0 ? "Desvalorizou " : "Valorizou ");
                                System.out.println(listaAcoes.getLast().getPorcRendimento() < 0 ? String.format("%.2f", Math.abs(listaAcoes.getLast().getPorcRendimento())) + "%" : String.format("%.2f", listaAcoes.getLast().getPorcRendimento()) + "%");
                                registros.add(listaAcoes.getLast());
                                break;
                            default:
                                System.out.println("Tipo inválido!");
                        }

                    } while (tipo != 0);
                    break;
                case 2:
                    if (registros.isEmpty()) {
                        System.out.println("Nenhuma simulação feita!");
                        break;
                    }

                    for (Object r : registros.getRegistros()) {
                        System.out.println(r);
                    }

                    break;
                default:
                    System.out.println("Opcao invalida!");
                    break;
            }
        }while(opc != 0);
        sc.close();
    }
}