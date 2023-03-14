import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
       //Criação de lista vazia
        int initialCapacity = 10;
        ArrayList<Integer> list = new ArrayList<Integer>(initialCapacity);
        System.out.println("Array:" + list);

        //Verificando se uma lista está vazia
        System.out.println("Array está vazia? " + list.isEmpty());
        //Verificando se uma lista está cheia
        if(initialCapacity == list.size()){
            System.out.println("Lista está cheia");
        }else{
            System.out.println("List não está cheia");
        }
        //obter tamanho da lista
        System.out.println("Tamanho da lista: " + list.size());

        //Obter/modificar o valor de um elemento em uma determinada
        // posição
            //adcionando elementos
        list.add(10);
        list.add(23);
        list.add(44);
        System.out.println("Lista com elementos: " + list);
        System.out.println("Adcionando o elemento 55 no index 1, " +
                "posição 2");
        list.add(1, 55);
        System.out.println("Substituindo o elemento na posição 3, " +
                "index 2, por 99");
        int previousElement = list.set(2, 99);
        System.out.println("Elemento substituido: " + previousElement);
        System.out.println("Lista após as modificações: ");
        System.out.println(list);

        //remover um elemento de uma determinada posição
        System.out.println("Removendo elemento no index 3, posição " +
                "4");
        int removedElement = list.remove(3);
        System.out.println("Elemento removido: " + removedElement);
        System.out.println("Lista após as modificações: ");
        System.out.println(list);

    }
}