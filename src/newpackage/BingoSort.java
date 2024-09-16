package newpackage;

public class BingoSort {

    // Método principal de ordenamiento
    public static void sort(Comparable[] a) {
        int n = a.length;
        int largest = n - 1;
        
        // Repite el proceso hasta que todos los elementos estén ordenados
        while (largest > 0) {
            Comparable max = a[0];
            int maxIndex = 0;
            
            // Busca el mayor elemento en la parte no ordenada
            for (int i = 1; i <= largest; i++) {
                if (less(max, a[i])) {
                    max = a[i];
                    maxIndex = i;
                }
            }
            
            // Intercambia el mayor elemento con el último no ordenado
            exch(a, maxIndex, largest);
            
            // Reduce el tamaño de la pocicion no ordenada
            largest--;  
        }
    }

    // Método para comparar dos elementos
    private static boolean less(Comparable v, Comparable w) {
        return v.compareTo(w) < 0;
    }

    // Método para intercambiar dos elementos en el arreglo
    private static void exch(Comparable[] a, int i, int j) {
        Comparable temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    // Método para verificar si el arreglo está ordenado
    private static boolean isSorted(Comparable[] a) {
        for (int i = 1; i < a.length; i++) {
            if (less(a[i], a[i - 1])) return false;
        }
        return true;
    }

    // Método para imprimir el arreglo
    private static void show(Comparable[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }

    // Método main para ejecutar el algoritmo
    public static void main(String[] args) {
        /* Ejemplo: 
            lectura de una lista de cadenas*/
        String[] a = {"zebra", "manzana", "mango", "banana"};
        
        // Ordena el arreglo
        sort(a);  
        
         // Verifica si está ordenado
        assert isSorted(a); 
        
        // Muestra el arreglo ordenado
        show(a);  
    }
}
