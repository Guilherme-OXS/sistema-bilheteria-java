public class Eventos {
    private String nome;
    private String data;
    private int quantidadeMaxima;
    private int quantidadeAtual;
    private double preçoEvento;

    // guarda eventos
    public Eventos(String a ,String b,int c,double d){
        this.nome = a;
        this.data = b;
        this.quantidadeMaxima = c;
        this.quantidadeAtual = quantidadeMaxima;
        this.preçoEvento = d;
    }

    public void mostraEvento(){
        Ferramentas.print(nome);
        Ferramentas.print(data);
        Ferramentas.print(quantidadeAtual);
        Ferramentas.print(preçoEvento);
    }

    public int getQuantidadeAtual() {
        return quantidadeAtual;
    }
}