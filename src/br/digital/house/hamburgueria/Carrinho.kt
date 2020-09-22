package br.digital.house.hamburgueria

class Carrinho(){
    val listaProdutos = mutableListOf<Produto>()

    // adiciona um ou mais produtos no carrinho
    fun adicionaProduto(vararg produtos: Produto) = listaProdutos.addAll(produtos)

    // calcula valor total do carrinho
    fun valorTotal(): Float {
        var total = 0F
        listaProdutos.forEach {
            total += it.preco
        }
        return total
    }
}