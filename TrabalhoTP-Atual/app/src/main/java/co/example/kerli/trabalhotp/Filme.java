package co.example.kerli.trabalhotp;

public class Filme {

    String filme;
    String genero;
    String diretor;
    int Lancamento;
    int Faixa_Etaria;

    public Filme(){
        filme=null;
        genero=null;
        diretor=null;
        Lancamento=0;
        Faixa_Etaria=0;
    }

    public Filme(String filme,String genero,String diretor,int Lancamento,int Faixa_Etaria){
        this.filme=filme;
        this.genero=genero;
        this.diretor=diretor;
        this.Lancamento=Lancamento;
        this.Faixa_Etaria=Faixa_Etaria;
    }

    //SETs e Gets//

    public String getFilme(){
        return filme;
    }
    public String getGenero(){
        return genero;
    }
    public String getDiretor(){
        return diretor;
    }
    public int getfaixa(){
        return Faixa_Etaria;
    }
    public int getlancamento(){
        return Lancamento;
    }
    public void setFilme(String filme) {
        this.filme = filme;
    }
    public void setGenero(String genero) {
        this.genero = genero;
    }
    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }
    public void setFaixa_Etaria(int faixa_Etaria) {
        Faixa_Etaria = faixa_Etaria;
    }
    public void setLancamento(int lancamento) {
        Lancamento = lancamento;
    }
}
