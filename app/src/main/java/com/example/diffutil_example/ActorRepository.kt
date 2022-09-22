package com.example.diffutil_example

class ActorRepository {

    private val actors = listOf(
        Actor(1, "Jack Nicholson", 10, 1937, "https://images.squarespace-cdn.com/content/v1/5ae4ecccfcf7fd2d8744ace5/1525209348827-ZW06N5A58G7UYVTV1Y6N/jacknicholson300.jpg"),
        Actor(2, "Marlon Brando", 9, 1924, "https://m.media-amazon.com/images/M/MV5BMTg3MDYyMDE5OF5BMl5BanBnXkFtZTcwNjgyNTEzNA@@._V1_.jpg"),
        Actor(3, "Robert De Niro", 8, 1943, "https://cdn.britannica.com/00/213300-050-ADF31CD9/American-actor-Robert-De-Niro-2019.jpg?w=400&h=300&c=crop"),
        Actor(4, "Al Pacino", 7, 1940, "https://cdn.britannica.com/45/196745-050-66D0F975/Al-Pacino-Scarface-Brian-De-Palma.jpg"),
        Actor(5, "Tom Hanks", 4, 1956,"https://upload.wikimedia.org/wikipedia/commons/a/a9/Tom_Hanks_TIFF_2019.jpg"),
    )

    val actorsSortedByRating: List<Actor>
        get() = actors.sortedByDescending { it.rating }

    val actorsSortedByName: List<Actor>
        get() = actors.sortedBy { it.name }

    val actorsSortedByYearOfBirth: List<Actor>
        get() = actors.sortedBy { it.yearOfBirth }

}