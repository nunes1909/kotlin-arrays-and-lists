package ProblemasComuns

import Listas.Livro
import Listas.imprime

fun usaPrateleira(){

    val livro1 = Livro(
        titulo = "Grande sertão",
        autor = "Joao Guimaraes",
        anoPublicacao = 1956
    )
    val livro2 = Livro(
        titulo = "Minha vida de menina",
        autor = "Helena Morley",
        anoPublicacao = 1942,
        editora = "Editora A"
    )
    val livro3 = Livro(
        titulo = "Memorias postumas",
        autor = "Machado de assis",
        anoPublicacao = 1881
    )
    val livro4 = Livro(
        titulo = "Iracema",
        autor = "Gabriel de Alencar",
        anoPublicacao = 1942,
        editora = "Editora B"
    )
    val livro5 = Livro(
        titulo = "Alo mae",
        autor = "Gabriel Jesus",
        anoPublicacao = 2017,
        editora = "Editora City"
    )

    val lista: MutableList<Livro> = mutableListOf(livro1, livro2, livro3, livro4, livro5)

    val prateleira = Prateleira(
        genero = "Literatura",
        livros = lista
    )

    prateleira.organizaPorAutor().imprime()
    prateleira.organizaPorAno().imprime()
}

fun List<Livro>.imprime() {
    val livroFormatado = this
        .filterNotNull()
        .joinToString(separator = "\n") {
            "-> ${it.titulo} de ${it.autor}"
        }
    println("\n### Livros ###\n$livroFormatado")
}