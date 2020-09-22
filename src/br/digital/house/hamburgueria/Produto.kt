package br.digital.house.hamburgueria

open class Produto(var preco:Float, var nome:String) {

    fun capturaPreco (): Float {
        return preco * 2
    }
}