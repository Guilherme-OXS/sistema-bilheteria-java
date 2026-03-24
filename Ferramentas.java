public class Ferramentas {
    // ferramenta para facilitar o print
    public static void print(Object n){
        System.out.println(n);
    }
    // limpar console
    public static void limpar(){
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
    // esperar algum segundos
    public static void pausar(int segundos){
        try{Thread.sleep(segundos*1000);}catch(InterruptedException e){
            print("Erro,Mas esta sob controle");
        }
    }
}