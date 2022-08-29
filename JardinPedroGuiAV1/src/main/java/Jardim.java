public class Jardim {

    //Atributos explicitos da classe escola
    String nomeDono;
    String contato;
    String endereco;

    //Array de arvores - Atributo implicito por composicao
    Arvore []arvores = new Arvore[10];

    //Construtor do Jardim
    public Jardim(String nomeDonoJardim, String contato, String endereco){
        this.nomeDono = nomeDonoJardim;
        this.contato = contato;
        this.endereco = endereco;
    }

    //Metodos
    //1 adicionar arvore ao jardim
    public void addArvore(Arvore arvore){
        // Percorrendo o array de arvores
        for (int i = 0; i < arvores.length; i++) {
        // comparacao das posicoes para verificar se nao existe nenhuma arvore cadastrada
            if(arvores[i] == null ){
                arvores[i] = arvore;
                break;
            }
        }
    }

    //2 replantar arvore no jardim
    void replantar(){
        // Percorrendo o array de arvores
        for (int i = 0; i < arvores.length; i++) {
            // comparacao das posicoes para verificar se existe uma arvore cadastrada
            if(arvores[i] != null ){
                if(arvores[i].altura >= 50 && arvores[i].diametro >= 3){
                    System.out.println("A arvore da especie "+ arvores[i].especie + " ja deve ser replantada");
                }
            }
        }

    }

    // 3 precoMedio das arvores do jardim
    void precoMedio(){
        int medioPreco = 0;
        int contadorArvores = 0;
        // Percorrendo o array de arvores
        for (int i = 0; i < arvores.length; i++) {
            // comparacao das posicoes para verificar se existe uma arvore cadastrada
            if(arvores[i] != null ){
            medioPreco = (int) (arvores[i].preco + medioPreco);
            contadorArvores++;
            }
        }
        System.out.println(" O preco medio das arvores do jardim eh de: "+ medioPreco/contadorArvores);
    }

    // 4 Mostrando Informacoes das arvores e do jardim
    void mostraInfo(){
        System.out.println("-----Informacoes do Jardim------");
        System.out.println("Dono do jardim: "+ nomeDono );
        System.out.println("Contato: "+ contato );
        System.out.println("Endereco: "+ endereco);
        System.out.println("----Informacoes das arvores do jardim----");
        // Percorrendo o array de arvores
        for (int i = 0; i < arvores.length; i++) {
            // comparacao das posicoes para verificar se existe uma arvore cadastrada
            if(arvores[i] != null ){
                System.out.println("Especie: "+ arvores[i].especie);
                System.out.println("Altura: "+ arvores[i].altura);
                System.out.println("Diametro: "+ arvores[i].diametro);
                System.out.println("Preco: "+ arvores[i].preco);
            }
        }

    }

}
