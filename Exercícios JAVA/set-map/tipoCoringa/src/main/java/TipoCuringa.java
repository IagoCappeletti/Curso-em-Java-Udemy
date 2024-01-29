import java.util.Arrays;
import java.util.List;

/*Com tipos curinga podemos fazer métodos
que recebem um genérico de "qualquer tipo".
Porém não é possível adicionar dados a uma
coleção de tipo curinga
*/

public class TipoCuringa {
    public static void main(String[] args) {

        List<Integer> myInts = Arrays.asList(5, 2, 10);
        printList(myInts);
    }
    public static void printList(List<?> list) {
        for (Object obj : list) {
            System.out.println(obj);
        }
    }
}
