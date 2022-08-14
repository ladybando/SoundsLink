package com.example.android.soundslink.data

//list of artist names

class ArtistNameList {
val flashArtistList: ArrayList<String?> = arrayListOf(
    "Hall & Oates",
    "Light Orchestra",
    "Michael Jackson",
    "The Outfield",
    "Talk Talk",
    "Bryan Adams",
    "Wang Chung",
    "Lionel Richie",
    "Laura Branigan",
    "INXS",
    "Yes",
)

val vrockArtistList: ArrayList<String?> = arrayListOf(
    "Judas Priest",
    "Mötley Crüe",
    "Megadeth",
    "Love Fist",
    "Autograph",
    "Twisted Sister",
    "Ozzy Osbourne",
    "Anthrax",
    "Iron Maiden",
    "Slayer",
    "Tesla",
    "David Lee Roth"
)

val waveArtistList: ArrayList<String?> = arrayListOf(
    "Frankie Goes to Hollywood",
    "Tears for Fear",
    "Kim Wilde",
    "Blondie",
    "A Flock of Seagulls",
    "The Human League",
    "Nena",
    "The Psychedelic Furs",
    "Spandau Ballet",
    "Thomas Dolby",
    "Animotion",
    "Romeo Void",
    "Corey Hart"
)

val emotionArtistList: ArrayList<String?> = arrayListOf(
    "Toto",
    "Jan Hammer",
    "John Waite",
    "Cutting Crew",
    "Foreigner",
    "Mr.Mister",
    "Roxy Music",
    "Squeeze",
    "REO Speedwagon",
    "Night Ranger",
    "Luther Vandross",
    "Kate Bush"
)

val espantosoArtistList: ArrayList<String?> = arrayListOf(
    "Cachao",
    "Alpha Banditos",
    "Tres Apenas Como Eso",
    "Deodato",
    "Mongo Santamaría",
    "Machito and his Afro-Cuban Orchestra",
    "Unaesta",
    "Lonnie Liston Smith",
    "Irakere",
    "Deodato",
    "Xavier Cugat and his Orchestra",
    "Benny Moré",
    "Tito Puente"
)

val wildstyleArtistList: ArrayList<String?> = arrayListOf(
    "The Whispers",
    "Fat Larry's Band",
    "Oliver Cheatham",
    "Pointer Sisters",
    "René & Angela",
    "Mary Jane Girls",
    "Rick James",
    "Michael Jackson",
    "Evelyn \"Champagne\" King",
    "Teena Marie",
    "Mtume",
    "Kool & the Gang",
    "Indeep"
)
val allArtistsList: ArrayList<String?> = arrayListOf()


    fun addToArtist(): ArrayList<String?> {
        allArtistsList.addAll(emotionArtistList)
        allArtistsList.addAll(espantosoArtistList)
        allArtistsList.addAll(flashArtistList)
        allArtistsList.addAll(vrockArtistList)
        allArtistsList.addAll(waveArtistList)
        allArtistsList.addAll(wildstyleArtistList)
        return allArtistsList
    }

}