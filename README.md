# PetLucas

A PetLucas é um e-commerce que vende produtos de animais como ração, camas, brinquedos, remédios etc. para seu bichano. Esse sistema foi desenvolvido como um trabalho para a disciplina de Linguagem de Programação 2, do curso de ADS da escola IFSP Câmpus Hortolândia. O e-commerce é bem simples e não envolve o uso de tecnologias avançadas como banco de dados e interface de frontend como HTML, CSS e JavaScript, foi feito apenas em Java, usando o Java Swing para representar as interfaces gráficas do e-commerce.

# Funcionalidades

- Login fixo para o usuário acessar o site;
- Tela inicial com produtos mais comprados e produtos recomendados;
- Tela de produtos gerais, exibindo todos os produtos do e-commerce;
- Filtros para facilitar a busca de produtos;
- Tela de produto individual, com a melhor visualização do produto e suas informações;
- Escolha de quantidade para um produto; 
- Tela de carrinho para visualizar todos os produtos para a compra;
- Tela de pagamento com 4 opções para pagar, sendo elas: pix, boleto, cartão de crédito e cartão de débito.

# Tecnologias utilizadas

<img src="https://cdn.jsdelivr.net/gh/devicons/devicon@latest/icons/java/java-original.svg" alt="Java" title="Java" width="70px" height="70px" />

# Estrutura do projeto

```text
PetLucas/
├── build/classes/ # Arquivos gerados ao compilar o projeto
├── nbproject/ # Pasta com configurações e informações do netbeans
├── src/
|   ├── Assets/
|   |   ├── Fonts/ # Fontes usadas no site
|   |   └── Images/ # Imagens dos produtos e ícones
|   ├── Components/ # Cards de produtos de diferentes formas
|   |   ├── CardProduto.form
|   |   ├── CardProduto.java
|   |   ├── CardProdutoCarrinho.form
|   |   ├── CardProdutoCarrinho.java
|   |   ├── CardProdutosRecomendados.form
|   |   └── CardProdutosRecomendados.java
|   ├── PetLucas_Telas/ # Estilização e lógica das telas do e-commerce
|   |   ├── TelaCarrinho.form
|   |   ├── TelaCarrinho.java
|   |   ├── TelaHome.form
|   |   ├── TelaHome.java
|   |   ├── TelaLogin.form
|   |   ├── TelaLogin.java
|   |   ├── TelaPagamento.form
|   |   ├── TelaPagamento.java
|   |   ├── TelaProdutoIndividual.form
|   |   ├── TelaProdutoIndividual.java
|   |   ├── TelaProdutos.form
|   |   └── TelaProdutos.java
|   └── petlucas/ # Classes de produto e inicialização
|       ├── ItemCarrinho.java
|       ├── PetLucas.java
|       └── Produto.java
├── build.xml # Instruções de construção do projeto
├── manifest.mf # Informações que podem ser utilizadas na execução de arquivos JAR
└── README.md # Documentação geral do projeto
```