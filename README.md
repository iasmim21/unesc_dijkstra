# unesc_dijkstra
Projeto desenvolvido para atividade da disciplina de Teoria dos Grafos.


Com base no grafo da imagem abaixo, através da programação, conseguir identificar o melhor caminho de um ponto a outro:

![image](https://user-images.githubusercontent.com/60973376/230232860-be7b0e66-77ed-4c1f-82fb-82522dc06258.png)

Nesse projeto, é sólicitado ao usuário o ponto de início e fim, retornando o melhor trajeto e qual a sua distância:

![image](https://user-images.githubusercontent.com/60973376/230233054-ced4e43d-5515-44d9-bcd5-486cae39eb77.png)

<hr>


### WeightedPseudograph
WeightedPseudograph é uma classe da biblioteca de grafos JGraphT, que é uma implementação Java de estruturas de dados e algoritmos para grafos. A classe WeightedPseudograph representa um grafo ponderado não direcionado, que é um grafo que contém arestas com pesos associados.

### DijkstraShortestPath
DijkstraShortestPath é uma classe da biblioteca de grafos JGraphT, que é uma implementação Java de estruturas de dados e algoritmos para grafos. A classe DijkstraShortestPath é usada para encontrar o caminho mais curto entre dois vértices em um grafo ponderado, utilizando o algoritmo de Dijkstra.

----

## Pré-requisitos

Antes de executar este projeto, você deve ter as seguintes ferramentas instaladas em seu computador:

- JDK 17 ou superior
- Maven 3.6 ou superior

-----

## Executando o projeto

Para executar o projeto, siga estas etapas:

1. Clone este repositório em sua máquina:

```bash
bashCopy code
git clone https://github.com/iasmim21/unesc_dijkstra.git
```

2. Navegue até o diretório raiz do projeto:

```bash
bashCopy code
cd unesc_dijkstra
```

3. Compile o projeto usando o Maven:

```bash
Copy code
mvn clean install
```

4. Execute o projeto usando o Maven:

```bash
bashCopy code
mvn exec:java -Dexec.mainClass=dijkstra.Main
```
