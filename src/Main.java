public class Main {
    public static void main(String[] args) {
       //Criação de lista vazia
        List list = new List();
        System.out.println("Array:" + list);

        //Verificando se uma lista está vazia
        System.out.println("Array está vazia? " + list.isEmpty());
        //Verificando se uma lista está cheia
        if(list.isFull()){
            System.out.println("Lista está cheia");
        }else{
            System.out.println("List não está cheia");
        }
        //obter tamanho da lista
        System.out.println("Tamanho da lista: " + list.getSize());

        //Obter/modificar o valor de um elemento em uma determinada
        // posição
            //adcionando elementos
        list.insert(1,10);
        list.insert(2, 23);
        list.insert(3, 44);
        System.out.println("Lista com elementos: " + list);
        System.out.println("Adcionando elemento 55 no index 3, " +
                "posição 4");
        list.insert(4, 55);
        System.out.println("Obtendo o valor no index 3, posição 4: ");
        System.out.println(list.getElement(4));
        System.out.println("Substituindo item no index 2, posição " +
                "3, por 11");
        list.replace(3, 11);
        System.out.println("Lista após as modificações: ");
        System.out.println(list);

        //remover um elemento de uma determinada posição
        System.out.println("Removendo elemento no index 2, posição " +
                "3");
        int removedElement = list.remove(3);
        System.out.println("Elemento removido: " + removedElement);
        System.out.println("Lista após as modificações: ");
        System.out.println(list);

    }
}