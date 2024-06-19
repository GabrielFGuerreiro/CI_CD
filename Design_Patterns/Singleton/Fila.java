package Singleton;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Fila
{

    private static Fila instancia = null;

    // Lista que representa a fila de documentos
    private List<String> filaDeDocumentos;

    // Documentos pré-definidos na fila
    private String[] documentosIniciais = {"Documento1.pdf", "Documento2.doc", "Documento3.txt"};

    private Fila()
    {
        filaDeDocumentos = new ArrayList<>();
        for (String documento : documentosIniciais)
        {
            filaDeDocumentos.add(documento);
        }
    }
//=====//
    public static Fila getInstance()
    {
        if (instancia == null) {instancia = new Fila();}
        return instancia;
    }
//=====//
    public void imprimirDocumento(String documento)
    {
        if (filaDeDocumentos.contains(documento))
        {
            System.out.println("Imprimindo documento: " + documento);
            filaDeDocumentos.remove(documento);
        }
        else
        {
            System.out.println("Documento não encontrado na fila: " + documento);
        }
    }
//=====//
    public void removerDocumento(String documento)
    {
        if (filaDeDocumentos.contains(documento))
        {
            filaDeDocumentos.remove(documento);
            System.out.println("Documento removido da fila: " + documento);
        }
        else
        {
            System.out.println("Documento não encontrado na fila: " + documento);
        }
    }
//=====//
    public void removerTodosDocumentos()
    {
        filaDeDocumentos.clear();
        System.out.println("Todos os documentos removidos da fila.");
    }
//=====//
    public void mostrarFila()
    {
        System.out.println("Documentos na fila:");
        for (String documento : filaDeDocumentos)
        {
            System.out.println(documento);
        }
    }
//=====//
    public void exibirMenu()
    {
        Scanner scanner = new Scanner(System.in);
        int escolha;
        String documento;

        do
        {
            System.out.println("\n### Menu ###");
            System.out.println("1. Imprimir documento");
            System.out.println("2. Remover documento");
            System.out.println("3. Remover todos os documentos");
            System.out.println("4. Mostrar fila de documentos");
            System.out.println("0. Sair");

            System.out.print("Escolha uma opção: ");
            escolha = scanner.nextInt();
            scanner.nextLine(); // Limpar o buffer do scanner

            switch (escolha)
            {
                case 1:
                    System.out.print("Digite o nome do documento a ser impresso: ");
                    documento = scanner.nextLine();
                    imprimirDocumento(documento);
                    break;
                case 2:
                    System.out.print("Digite o nome do documento a ser removido: ");
                    documento = scanner.nextLine();
                    removerDocumento(documento);
                    break;
                case 3:
                    removerTodosDocumentos();
                    break;
                case 4:
                    mostrarFila();
                    break;
                case 0:
                    System.out.println("Saindo do programa...");
                    break;
                default:
                    System.out.println("Opção inválida. Escolha novamente.");
            }

        } while (escolha != 0);

        scanner.close();
    }
}
