

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Aula_95 {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();

        list.add("Maria");
        list.add("Alex");
        list.add("Bob");
        list.add("Anna");

        list.add(2, "Marcos");// Adicionando nome da lista entre as posições 1 Alex e 2 Bob//

        System.out.println(list.size()); // Imprime o tamanho da lista em quantidade de nomes//

        for (String x : list) {
            System.out.println(x);
        }
        System.out.println("--------------------------------------");
        list.remove("Anna"); //Remove o nome da Lista//
        //list.remove(1); //Remove da Lista a posição solicitada//

        list.removeIf(x -> x.charAt(0) == 'M');
        for (String x : list) {
            System.out.println(x);
        }
        System.out.println("--------------------------------------");
        System.out.println("Index of Bob " + list.indexOf("Bob"));
        System.out.println("Index of Marco " + list.indexOf("Marco"));
        List<String> result =list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());
        for (String x : list) {
            System.out.println(x);
        }
        System.out.println("--------------------------------------");
        String name = list.stream().filter(x -> x.charAt(0) == 'j').findFirst().orElse(null);
        System.out.println(name);
    }
}
// Aula Java Comgit addpleto, aprendendo a trabalhar com listagem e inicialização de Lambda