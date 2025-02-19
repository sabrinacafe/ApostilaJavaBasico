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


# 🚀 Inicialização em Java

A linha `public static void main(String[] args)` é o **ponto de entrada** de um programa Java. Vamos analisar cada palavra e entender seu significado:

---

## 🔹 Explicação Geral
Em Java, **todo programa começa a execução a partir do método `main`**.  
O interpretador Java (**JVM - Java Virtual Machine**) procura esse método para iniciar a execução do código.

---

## 🔹 Significado de Cada Palavra

```java
public static void main(String[] args)
```

### 🟢 `public` (Modificador de Acesso)
- Significa que o método `main` pode ser acessado de **qualquer parte** do programa.
- É necessário que seja `public`, pois a **JVM precisa chamá-lo de fora da classe**.

### 🔵 `static` (Método Estático)
- Indica que o método pertence à **classe** e **não** a uma instância específica.
- Como o `main` é chamado pela JVM antes da criação de qualquer objeto, ele precisa ser `static` para ser acessado diretamente.

### 🟡 `void` (Tipo de Retorno)
- Indica que o método **não retorna nenhum valor**.
- O método `main` apenas executa comandos, mas **não retorna nada para quem o chamou**.

### 🟠 `main` (Nome do Método)
- É o **nome obrigatório** do método principal que a JVM procura ao iniciar um programa.
- Se o nome for diferente de `main`, o programa **não será executado** corretamente.

### 🔴 `(String[] args)` (Parâmetro do Método)
- Representa um **array de Strings** que pode ser passado como argumento ao executar o programa via terminal.
- **Útil para receber valores digitados pelo usuário** ao iniciar o programa.

### 📌 Exemplo de execução com argumentos no terminal:
```sh
java MinhaClasse argumento1 argumento2
```
- `args[0]` será `"argumento1"`
- `args[1]` será `"argumento2"`

---

# 🏗️ **Dados Primitivos em Java**
Os **dados primitivos** são os tipos de dados mais básicos da linguagem Java. Eles armazenam valores simples e não são objetos.

## 🔹 **Dados Primitivos Abordados**
| Tipo    | Descrição |
|---------|------------|
| `int`   | Números inteiros (ex: `10`, `-5`) |
| `float` | Números de ponto flutuante de **precisão simples** (ex: `3.14f`, `-2.5f`) |
| `double` | Números de ponto flutuante de **precisão dupla** (ex: `3.1415926535`, `-5.9876`) |
| `char`  | Um único caractere (ex: `'A'`, `'9'`, `'#'`) |
| `boolean` | Valores **verdadeiros** (`true`) ou **falsos** (`false`) |
| `byte`  | Números inteiros pequenos (de `-128` a `127`) |
| `short` | Números inteiros menores que um `int` (de `-32.768` a `32.767`) |
| `long`  | Números inteiros maiores que um `int` (ex: `123456789012345L`) |

---

## 📌 **Exemplo de Declaração de Variáveis Primitivas**
```java
public class TiposPrimitivos {
    public static void main(String[] args) {
        int idade = 25;
        float altura = 1.75f;
        double preco = 99.99;
        char letra = 'J';
        boolean ativo = true;
        byte pequenosNumeros = 120;
        short numeroCurto = 32000;
        long numeroGrande = 1234567890L;

        System.out.println("Idade: " + idade);
        System.out.println("Altura: " + altura);
        System.out.println("Preço: " + preco);
        System.out.println("Letra: " + letra);
        System.out.println("Está ativo? " + ativo);
    }
}
```

---

## 📌 **Resumo**
✔️ O método `main` é obrigatório para a execução do programa.  
✔️ Java é **fortemente tipado**, o que significa que **sempre** devemos definir o tipo de uma variável antes de usá-la.  
✔️ Existem **8 tipos primitivos** em Java, cada um com sua função específica.

Agora você já entende melhor como o Java inicializa seus programas e como lidar com **variáveis primitivas**! 🚀
```