package ProblemasComuns

import Listas.Livro

fun listaLivrosNull(){
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
    val livro3 = null
    val livro4 = null
    val livro5 = null
    val livro6 = Livro(
        titulo = "Memorias postumas",
        autor = "Machado de assis",
        anoPublicacao = 1881
    )
    val livro7 = Livro(
        titulo = "Iracema",
        autor = "Gabriel de Alencar",
        anoPublicacao = 1942,
        editora = "Editora B"
    )
    val livro8 = Livro(
        titulo = "Alo mae",
        autor = "Gabriel Jesus",
        anoPublicacao = 2017,
        editora = "Editora B"
    )

    val listaDeLivrosNull: MutableList<Livro?> = mutableListOf(livro1, livro2, livro3, livro4, livro5, livro6, livro7, livro8)
    listaDeLivrosNull.imprime()

    val listaLivros: MutableList<Livro> = mutableListOf(livro6, livro7, livro8)
    listaLivros
        .groupBy { it.editora ?: "Editora Desconhecida"}
        .forEach { (editora, livros) ->
            println("Editora: $editora - Títulos: ${livros.joinToString { it.titulo }}")
        }
}

fun MutableList<Livro?>.imprime() {
    val livroFormatado = this
        .filterNotNull()
        .joinToString(separator = "\n") {
            "-> ${it.titulo} de ${it.autor}"
        }
    println("\n### Livros ###\n$livroFormatado")
}