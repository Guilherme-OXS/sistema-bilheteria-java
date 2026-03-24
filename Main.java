import  java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Eventos evento = new Eventos("Festa","12/30/10",50,100);
        boolean menu = true;
        int escolha;
        Ferramentas.limpar();
        while (menu){
            Ferramentas.print("Escolha uma opçao:");
            Ferramentas.print("[2]ver Eventos:");
            Ferramentas.print("[3]Fecha");
            escolha = ler.nextInt();
            ler.nextLine();
            switch (escolha) {
                case 2:
                    Ferramentas.limpar();
                    evento.mostraEvento();
                    break;
                case 3:
                    Ferramentas.print("fechando Programa");
                    menu = false;
                    Ferramentas.pausar(1);
                    break;
                default:
                    Ferramentas.limpar();
                    Ferramentas.print("Opçao invalida!\n");
                    break;
            }
        }
        ler.close();
	}
}