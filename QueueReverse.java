/*
Dado um inteiro k e uma fila de inteiros, inverter a ordem dos primeiros
k elementos da fila, deixando os demais elementos na mesma ordem relativa.
Exemplo: [1,2,3,4,5] --> k = 4 --> [4,3,2,1,5]

SOLUÇÃO:
1 - Para os k primeiros elementos:
- Desenfileirar o elemento x;
- Reordenar (k-1) elementos;
- Enfileirar elemento x
2 - Para os n-k elementos:
- desenfileirar;
- enfileirar
*/

import java.util.LinkedList;
import java.util.Queue;

public class QueueReverse {

    public static Queue<Integer> reverseFirstK(Queue<Integer> queue, int k) {
        solve(queue, k);
        int n = queue.size() - k;
        while (n-- > 0) {
            int element = queue.remove();
            queue.add(element);
        }
        return queue;
    }

    private static void solve(final Queue<Integer> queue, final int k) {
        if (k == 0) return;
        int element = queue.remove();
        solve(queue, k-1);
        queue.add(element);
    }


    // Para testar:

    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.add(5);
        System.out.println(reverseFirstK(queue,3));
    }
}
