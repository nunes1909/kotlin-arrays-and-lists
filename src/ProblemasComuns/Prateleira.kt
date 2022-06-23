package ProblemasComuns

import Listas.Livro

data class Prateleira(
    val genero: String,
    val livros: List<Livro>
) {
    fun organizaPorAutor(): List<Livro> = livros.sortedBy { it.autor }

    fun organizaPorAno(): List<Livro> = livros.sortedBy { it.anoPublicacao }
}