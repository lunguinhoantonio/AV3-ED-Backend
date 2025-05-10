import tiposInvestimento.*;
import register.Registro;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Yeste {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Registro registros = new Registro();
        
        List<TesouroSelic> listaTSelic = new ArrayList<>();
        List<Acao> listaAcoes = new ArrayList<>();
        List<Poupanca> listaPoupanca = new ArrayList<>();
        List<CDB> listaCDB = new ArrayList<>();
        int opc;
        double capital;
        int tempo;
        do {
            System.out.println("Selecione a opcao desejada:");
            System.out.println("0 - Finalizar programa");
            System.out.println("1 - Fazer investimento");
            System.out.println("2 - Listar simulações");
            System.out.println("3 - Buscar simulações");
            System.out.println("4 - Remover simulação");
            System.out.println("5 - Editar simulação");
            System.out.print("Selecao: ");
            opc = sc.nextInt();
            sc.nextLine();

            switch(opc){
                case 0:
                    break;
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
                        switch (tipo) {
                            case 0:
                                break;
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
                                    if (tempo <= 0) {
                                        System.out.println("O tempo não pode ser negativo ou igual a zero!");
                                    }
                                } while (tempo <= 0);
                                listaPoupanca.add(new Poupanca(capital, tempo));
                                listaPoupanca.getLast().calcValorFinal();
                                System.out.print("Resultado de " + listaPoupanca.getLast().getTempoInvestido() + (listaPoupanca.getLast().getTempoInvestido() == 1 ? " mês" : " meses") + ": ");
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
                                    if (tempo <= 0) {
                                        System.out.println("O tempo não pode ser negativo ou igual a zero!");
                                    }
                                } while (tempo <= 0);
                                listaCDB.add(new CDB(capital, tempo));
                                listaCDB.getLast().calcValorFinal();
                                System.out.print("Resultado de " + listaCDB.getLast().getTempoInvestido() + (listaCDB.getLast().getTempoInvestido() == 1 ? " ano" : " anos") + ": ");
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
                                    if (tempo <= 0) {
                                        System.out.println("O tempo não pode ser negativo ou igual a zero!");
                                    }
                                } while (tempo <= 0);
                                listaTSelic.add(new TesouroSelic(capital, tempo));
                                listaTSelic.getLast().calcValorFinal();
                                System.out.print("Resultado de " + listaTSelic.getLast().getTempoInvestido() + (listaTSelic.getLast().getTempoInvestido() == 1 ? " ano" : " anos") + ": ");
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
                                    if (tempo <= 0) {
                                        System.out.println("O tempo não pode ser negativo ou igual a zero!");
                                    }
                                } while (tempo <= 0);
                                listaAcoes.add(new Acao(capital, tempo));
                                listaAcoes.getLast().calcValorFinal();
                                System.out.print("Resultado de " + listaAcoes.getLast().getTempoInvestido() + (listaAcoes.getLast().getTempoInvestido() == 1 ? " mês" : " meses") + ": ");
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
                case 3:
                    if (registros.isEmpty()) {
                        System.out.println("Nenhuma simulação feita!");
                        break;
                    }
                    int idProcura;
                    do {
                        System.out.print("Insira um ID para buscar: ");
                        idProcura = sc.nextInt();
                        if (registros.exists(idProcura) == -1) {
                            System.out.println("Simulação não encontrada!");
                        }
                    } while (registros.exists(idProcura) == -1);
                    System.out.println(registros.get(idProcura));
                    break;
                case 4:
                    if (registros.isEmpty()) {
                        System.out.println("Nenhuma simulação feita!");
                        break;
                    }
                    int idRemove;
                    do {
                        System.out.print("Insira um ID para remover: ");
                        idRemove = sc.nextInt();
                        if (registros.exists(idRemove) == -1) {
                            System.out.println("Simulação não encontrada!");
                        }
                    } while (registros.exists(idRemove) == -1);
                    sc.nextLine();
                    char confirm;
                    do {
                        System.out.println("\"" + registros.get(idRemove) + "\"");
                        System.out.print("Tem certeza que deseja remover? [S/N]: ");
                        confirm = sc.nextLine().toUpperCase().charAt(0);
                        if (confirm == 'S') {
                            registros.remove(idRemove);
                            System.out.println("Simulação removida!");
                            break;
                        } else if (confirm != 'S' && confirm != 'N') {
                            System.out.println("Opção inválida!");
                        }
                    } while (confirm != 'S' && confirm != 'N');
                    break;
                case 5:
                    if (registros.isEmpty()) {
                        System.out.println("Nenhuma simulação feita!");
                        break;
                    }
                    int idEdit;
                    do {
                        System.out.print("Insira um ID para editar: ");
                        idEdit = sc.nextInt();
                        if (registros.exists(idEdit) == -1) {
                            System.out.println("Simulação não encontrada!");
                        }
                    } while (registros.exists(idEdit) == -1);
                    System.out.println("Digite o atributo para editar: ");
                    System.out.println("1. Capital inicial (R$)");
                    System.out.println("2. Quantidade de tempo");
                    System.out.print("Resposta: ");
                    int resp = sc.nextInt();
                    sc.nextLine();
                    switch (resp) {
                        case 1:
                            do {
                                System.out.println("Capital inicial antiga: R$" + String.format("%.2f", registros.get(idEdit).getCapital()));
                                System.out.print("Novo capital inicial (R$): ");
                                capital = sc.nextDouble();
                                if (capital <= 0) {
                                    System.out.println("O investimento inicial não deve ser menor ou igual a 0");
                                }
                            } while (capital <= 0);
                            registros.get(idEdit).setCapital(capital);
                            System.out.println("O investimento foi atualizado com novos valores!");
                            break;
                        case 2:
                            boolean isAnual = registros.get(idEdit).getClass().getSimpleName().equals("TesouroSelic") || registros.get(idEdit).getClass().getSimpleName().equals("CDB");
                            do {
                                System.out.print(isAnual ? "Informe o tempo em anos: " : "Informe o tempo em meses: ");
                                tempo = sc.nextInt();
                                if (tempo <= 0) {
                                    System.out.println("O tempo não pode ser negativo ou igual a zero!");
                                }
                            } while (tempo <= 0);
                            registros.get(idEdit).setTempoInvestido(tempo);
                            System.out.println("O investimento foi atualizado com novo tempo!");
                            break;
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
