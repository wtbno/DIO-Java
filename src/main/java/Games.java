import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Games {

    public static void main(String[] args) {

        //Criar lista
        List<String> games = new ArrayList<>();

        //Adicionar dados, os dados inseridos abaixo devem ter como referência a string citada acima como p. ex.
        //a string games

        games.add("Resident Evil 2");
        games.add("Resident Evil 3");
        games.add("Resident Evil 4");
        games.add("The Legend of Zelda Majoras Mask");
        games.add("Sekiro");
        games.add("Batman The Arkhan Knight");
        games.add("Batman The Arkhan City");
        games.add("Dragon Age 2");
        games.add("Dragon Age 3");
        games.add("GTA V");
        games.add("The Legend of Zelda Ocarina Of Time");

        //Imprimir resultados
        System.out.println("-->" + games);

        Collections.sort(games); //Ordenação por ordem alfabética

        System.out.println("-->" + games);//Imprimir novos parâmetros add

        System.out.println("Contagem " + games.stream().count());//Retorna a contagem de elementos do stream

        //Retorna o elemento com maior número de letras
        System.out.println("Maior numero de letras" + games.stream().max(Comparator.comparingInt(String::length)));

        //Retorna o elemento com menor número de letras
        System.out.println("Menor numero de letras" + games.stream().min(Comparator.comparingInt(String::length)));

        // Retorna somente os 3 primeiros items da coleção
        System.out.println("Retorna os 3 primeiros elementos da coleção: " + games.stream().limit(3).collect(Collectors.toList()));

        // Exibe cada elemento no console, e depois retorna a mesma coleção
        System.out.println("Retorna elementos: " + games.stream().peek(System.out::println).collect(Collectors.toList()));

        // Exibe cada elemento no console sem retornar outra coleção
        System.out.println("Retorna os elementos novamente:");
        games.stream().forEach(System.out::println);

        //Retorna uma nova coleção, com os nomes concatenados a quant. de letras de cada nome
        System.out.println("Retorna uma nova coleção com a quantidade de letras:" + games.stream()
                .map(game -> game
                 .concat(" - ")
                        .concat(String.valueOf(game.length()))
                )
                .collect(Collectors.toList())
        );

        // Retorna elementos que contém a letra K no nome
        System.out.println("Com letra k no nome: " + games.stream()
                   .filter((game) -> game.toLowerCase().contains("k"))
                   .collect(Collectors.toList())
        );
    }
}
