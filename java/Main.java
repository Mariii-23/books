
public class Main {
    public static void main(String[] args) {
        String[] array = {"Sandes de Atum", "Chocolate", "Arroz"};

        int array_[][] = {{1, 1, 1}, {2, 2, 2}};

        for (int i = 0; i < array.length; i++)
          System.out.print(array[i] + " ");

        System.out.print("\n");

        for (String elem : array)
          System.out.print(elem + " ");

        System.out.print("\n");

        int sfinal = 0;

        // Somar todos os elementos da matriz
        for (int[] l_elem : array_)
          for (int elem : l_elem)
            sfinal += elem;
        System.out.print(sfinal);
    }
}