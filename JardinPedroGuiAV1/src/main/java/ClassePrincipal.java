import java.util.Scanner;

public class ClassePrincipal {

    public static void main(String[] args) {
        //Criando variavel para armazenar a entrada de dados
        Scanner teclado = new Scanner(System.in);

        Jardim jardim = new Jardim("Pedro Gui", "35988944988","Oswaldo Campos do Amaral 860");

        boolean flag = true; // Flag de controle do while

        while (flag == true){
            System.out.println("----Bem-vindo ao seu Jardim----");
            System.out.println("Escolha uma opcao ");
            System.out.println("1 Adicionar uma nova arvore");
            System.out.println("2 Verificar qual arvore deve ser replantada");
            System.out.println("3 Verificar o preco medio das arvores contidas no jardim");
            System.out.println("4 Mostrar as informacoes das arvores e do jardim ");
            int opcao = teclado.nextInt();// Variavel de dados para opcao
            teclado.nextLine(); // limpando buffer
            switch (opcao){
                case 1:
                    // Criando arvore que sera adicionada no array arvore
                    Arvore arvore = new Arvore();
                    System.out.println("Especie da arvore: ");
                    arvore.especie =   teclado.nextLine();
                    System.out.println("Altura da arvore: ");
                    arvore.altura = teclado.nextFloat();
                    teclado.nextLine();
                    System.out.println("Diametro da arvore: ");
                    arvore.diametro = teclado.nextFloat();
                    System.out.println("Preco da arvore: ");
                    arvore.preco = teclado.nextFloat();

                    //Adicionando arvore ao jardim
                    jardim.addArvore(arvore);

                    break;

                case 2:
                    jardim.replantar();
                    break;

                case 3:
                    jardim.precoMedio();
                    break;

                case 4:
                    jardim.mostraInfo();
                    break;

                default:
                    System.out.println("Opção inválida !!");
                    break;

            }

        }




    }






}
