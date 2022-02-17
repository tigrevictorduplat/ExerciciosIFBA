# 3°TIB - IFBA Campus Camaçari - 2022
**Disciplina LPII - _Prof Fábio_**
 
**Alunos:**
> - _Shaiane Nascimento,_
> - _Pedro Lucas,_    
> - _Mayra Silva,_
> - _Víctor Tigre._

*** 
## Exercício I
1. Crie a classe `Lutador` com as características: *nome, nacionalidade, idade, altura, peso, vitorias, derrotas e empates*. A classe `Lutador` terá os seguintes métodos:

> - apresentacao: mostrar todos os dados do lutador

> - ganharLuta: quando chamado irá incrementar o número de vitórias do lutador

> - perderLuta: incrementa o número de derrotas do lutador

> - empatarLuta: incrementar o número de empates

2. No projeto anterior, crie a classe `Luta` com os seguintes atributos: *desafiado e  desafiante e data.* Os atributos desafiado e desafiante serão objetos da classe `Lutador`.
> Implemente o método `Lutar()` que receberá o resultado da luta podendo ser 0 (houve empate), 1 (o desafiado ganhou) ou 2 (o desafiante ganhou).
> O método `Lutar()` cuidará de atribuir as vitórias, as derrotas ou os empates dos lutadores envolvidos de acordo com o resultado recebido.


3. No projeto anterior, crie a classe `Principal` com o método main e *instancie* lutadores e *marque* lutas para eles. Os dados dos lutadores, das lutas e dos resultados serão informados pelo usuário.

--- 

## Exercício II
- Crie a classe `Imovel`, que possui um endereço e um preço.
- Crie uma classe `ImovelNovo`, que herda de `Imovel` e possui um preço adicional.
- Crie métodos de acesso e impressão deste preço adicional.
- Crie uma classe `ImovelVelho` que herda de `Imovel` e possui um desconto no preço.
- Crie métodos de acesso e impressão para este desconto.
- Crie uma classe de `Teste` com o método main.
Neste método:
> - Peça para o usuário digitar 1 para um novo imóvel ou 2 para um imóvel velho.
> - Conforme a definição do usuário, solicite o endereço, o preço e o adicional/desconto e instancie a classe de acordo com a escolha do tipo de imóvel.
> - Imprima o valor final do imóvel.

---
### OBS:
> Muitos que lerem vão perceber que o exercício pediu apenas para somar ou subtrair o preço a depender da categoria. Mas, buscando diferenciar a lógica entre um *`Imóvel Novo`* e um *`Imóvel Antigo`* eu apliquei o decréscimo na forma de porcentagem.
> A lógica que eu segui é que talvez *Imóveis Velhos* pudessem ter uma taxa fixa (a depender da Corretora) de **desvalorização**. Enquanto isso, a **valorização** é extremamente variável, seja por estar ou não mobiliado, por estar ou não bem localizado, ou quaisquer outras variavéis dentro disso.   