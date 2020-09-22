package br.digital.house.hamburgueria

fun main() {
    val carrinho = Carrinho()
    val produto = Produto(2F, "Refri")

    carrinho.adicionaProduto(produto)
    println(carrinho.valorTotal())
}