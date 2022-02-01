package questionone;

public class Agenda {
    
    private Pessoa pessoas[] = new Pessoa[10];

    public Agenda(){
        for(int i=0; i<10; i++){
            pessoas[i] = new Pessoa();
        }
    }

    public void ArmazenaPessoa(String nome, int nascimento, double altura){
        for(int a=0; a<10; a++){
            if(pessoas[i].GetNome() == null){
                pessoas[i].SetNome(nome);
                pessoas[i].SetNascimento(nascimento);
                pessoas[i].SetAltura(altura);
                i=10;
            }else{
                if(i==10){
                    System.out.println("Agenda lotada");
                }
            }
        }
    }

    public void RemovePessoa(String nome){
        for(int i=0; i<10; i++){
            
            if(pessoas[i].GetNome() == nome){
                pessoas[i].SetNome("");
                pessoas[i].SetNascimento(0);
                pessoas[i].SetAltura(0);
                System.out.println("Pessoa removida");
                
            }else{
                if(i==10){
                    System.out.println("Essa pessoa nao consta na agenda");
                }
            }
        }
    }

    public void BuscaPessoa(String no){
        for(int i=0; i<10; i++){
            
            if(pessoas[i].GetNome() == no){
                System.out.println("Pessoa na posicao "+i+" da agenda");
                
            }else{
                if(i==10){
                    System.out.println("Pessoa nao constada na agenda");
                }
            }
        }
    }

    public void ImprimeAgenda() {
        for(int i=0; i<10; i++){
            pessoas[i].Imprime();
        }
    }

    public void ImprimePessoa(int i) {
        pessoas[i].Imprime();
    }

}