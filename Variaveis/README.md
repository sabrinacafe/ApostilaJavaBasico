# 📌 Variáveis em Java

## 🔹 O que são Variáveis?
Em **Java**, uma variável pode ser entendida como uma "caixinha" onde armazenamos valores que podem ser utilizados durante a execução do programa. Esses valores podem ser números, textos, caracteres, entre outros.

## 🔹 Java é Fortemente Tipado
Java é uma **linguagem fortemente tipada**, o que significa que **sempre é necessário definir o tipo de dado** que será armazenado na variável antes de usá-la. Diferente de linguagens como Python ou JavaScript, que permitem o uso de variáveis sem especificar um tipo, no Java é obrigatório declarar explicitamente o tipo de dado.

## 🔹 Como Declarar Variáveis em Java
A declaração de uma variável em Java segue a estrutura:

```java
tipo nomeDaVariavel = valor;
```

## 🔹 Regras para Criar Variáveis

- O nome da variável **não pode começar com números**.
- Pode conter **letras, números e `_` (underline)**, mas **não pode conter espaços**.
- Deve seguir um **nome significativo** para facilitar a leitura do código.
- Por convenção, utilizamos o formato **camelCase**, onde a primeira palavra começa com letra minúscula e as seguintes iniciam com maiúscula.  
  **Exemplos**:
  ```java
  int minhaIdade = 25;
  double quantidadeMaxima = 100.5;
    ```

🔹 Diferença entre Declaração e Inicialização
Declaração: Criamos a variável sem atribuir um valor inicial.
Inicialização: Atribuímos um valor à variável.
📌 Exemplo:
```java
int numero;  // Declaração da variável
numero = 10; // Inicialização da variável
```

⚠️ Atenção: Se tentar usar uma variável sem inicializá-la, o compilador mostrará um erro.

```java
int valor;
System.out.println(valor); // ERRO! A variável não foi inicializada.
```