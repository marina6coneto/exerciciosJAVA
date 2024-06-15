
# Estrutura de Dados e Algoritmos em Java

Este repositório contém implementações de diferentes problemas e estruturas de dados em Java. Cada arquivo de código aborda um problema específico ou uma estrutura de dados, conforme descrito abaixo.

## Arquivos

### 1. BalanceamentoDeColchetes.java

**Pacote:** `main.problem`

Este arquivo contém uma solução para o problema de balanceamento de colchetes em uma expressão. A função `solve` verifica se os colchetes, parênteses e chaves em uma expressão estão devidamente balanceados.

- **Função `solve(String expression)`**: 
  - **Entrada:** Uma string contendo a expressão a ser verificada.
  - **Saída:** Um booleano indicando se a expressão está balanceada.
  - **Exemplo de uso:**
    ```java
    System.out.println(solve("2 * (3 + 4 + 5 * [2 + 3)]")); // false
    System.out.println(solve("[2 * (3 + 4 + 5 * [2 + 3] / (2 + (3 (7 + 5) * 9) * 6) * [5 + 8] + 17) + 2]")); // true
    ```

### 2. QueueReverse.java

**Pacote:** `main.problem`

Este arquivo contém uma solução para o problema de reverter os primeiros K elementos de uma fila.

- **Função `reverseFirstK(Queue<Integer> queue, int k)`**: 
  - **Entrada:** Uma fila de inteiros e um número K.
  - **Saída:** A fila com os primeiros K elementos revertidos.
  - **Exemplo de uso:**
    ```java
    Queue<Integer> queue = new LinkedList<>();
    queue.add(1);
    queue.add(2);
    queue.add(3);
    queue.add(4);
    queue.add(5);
    System.out.println(reverseFirstK(queue, 3)); // [3, 2, 1, 4, 5]
    ```

### 3. LargestTreeValues.java

**Pacote:** `main.problem`

Este arquivo contém uma solução para encontrar o maior valor em cada nível de uma árvore binária.

- **Função `largestValues(Tree tree)`**: 
  - **Entrada:** Um objeto `Tree` representando a árvore binária.
  - **Saída:** Uma lista de inteiros contendo o maior valor de cada nível da árvore.
  - **Exemplo de uso:**
    ```java
    Tree tree = new Tree();
    tree.insert(100);
    tree.insert(10);
    tree.insert(5);
    tree.insert(6);
    tree.insert(1);
    tree.insert(7);
    tree.insert(5);
    System.out.println(largestValues(tree)); // [100, 10, 7]
    ```

### 4. Tree.java

**Pacote:** `main.problem`

Este arquivo define a estrutura de dados de uma árvore binária e várias operações associadas a ela, como inserção e travessias (pré-ordem, em-ordem, pós-ordem e BFS).

- **Classe `Tree`**:
  - **Método `insert(int value)`**: Insere um valor na árvore.
  - **Método `preOrder()`**: Imprime os valores da árvore em pré-ordem (raiz, esquerda, direita).
  - **Método `inOrder()`**: Imprime os valores da árvore em ordem (esquerda, raiz, direita).
  - **Método `posOrder()`**: Imprime os valores da árvore em pós-ordem (esquerda, direita, raiz).
  - **Método `BFS()`**: Imprime os valores da árvore em ordem de largura (BFS).
  - **Exemplo de uso:**
    ```java
    Tree tree = new Tree();
    tree.insert(37);
    tree.insert(11);
    tree.insert(66);
    tree.insert(8);
    tree.insert(17);
    tree.insert(42);
    tree.insert(72);

    System.out.println("############");
    tree.preOrder();
    System.out.println("############");
    tree.inOrder();
    System.out.println("############");
    tree.posOrder();
    System.out.println("############");
    tree.BFS();
    ```
