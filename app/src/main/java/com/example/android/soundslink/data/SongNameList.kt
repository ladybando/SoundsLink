package com.example.android.soundslink.data

val allSongsList: ArrayList<String?> = arrayListOf()

//list by station and create allList by adding them to allList array
val flashSongList: ArrayList<String?> =
    arrayListOf("Out of Touch",
        "Four Little Diamonds",
        "Billie Jean",
        "Your Love",
        "Life's What You Make It",
        "Run to You",
        "Call Me",
        "Running with the Night",
        "Self Control",
        "Kiss the Dirt (Falling Down the Mountain)",
        "Owner of a Lonely Heart")
val vrockSongList: ArrayList<String?> = arrayListOf(
    "You've Got Another Thing Comin'",
    "Too Young to Fall in Love",
    "Peace Sells",
    "Dangerous Bastard",
    "Turn Up the Radio",
    "I Wanna Rock",
    "Bark at the Moon",
    "Madhouse",
    "2 Minutes to Midnight",
    "Raining Blood",
    "Cumin' Atcha Live",
    "Yankee Rose"
)
val waveSongList: ArrayList<String?> = arrayListOf(
    "Two Tribes",
    "Pale Shelter",
    "Kids in America",
    "Atomic",
    "I Ran (So Far Away)",
    "(Keep Feeling) Fascination",
    "99 Luftballons",
    "Love My Way",
    "Gold",
    "Hyperactive!",
    "Obsession",
    "Never Say Never",
    "Sunglasses at Night"
)
val emotionSongList: ArrayList<String?> = arrayListOf(
    "Africa",
    "Crockett's Theme",
    "Missing You",
    "(I Just) Died in Your Arms",
    "Waiting for a Girl Like You",
    "Broken Wings",
    "More Than This",
    "Tempted",
    "Keep On Loving You",
    "Sister Christian",
    "Never Too Much",
    "Wow"
)
val espantosoSongList: ArrayList<String?> = arrayListOf(
    "A Gozar Con Mi Combo",
    "The Bull is Wrong",
    "Yo Te Miré",
    "Latin Flute",
    "Mama Papa Tú",
    "Me and You Baby (Picao y Tostao)",
    "Mambo Mucho Mambo",
    "La Vida Es Una Lenteja",
    "Expansions",
    "Añunga Ñunga",
    "Super Strut",
    "Jamay",
    "Maracaibo Oriental",
    "Mambo Gozón"
)
val wildstyleSongList: ArrayList<String?> = arrayListOf(
    "Pump Me Up",
    "One for the Treble",
    "Clear",
    "Al-Naafiysh (The Soul)",
    "Rockit",
    "Looking for the Perfect Beat",
    "Get It Girl",
    "Rock Box",
    "Bassline",
    "The Smurf",
    "Magic's Wand",
    "More Bounce to the Ounce",
    "The Message",
    "The Breaks",
    "Hip Hop, Be Bop (Don't Stop)"
)
val feverSongList: ArrayList<String?> = arrayListOf(
    "And the Beat Goes On",
    "Act Like You Know",
    "Get Down Saturday Night",
    "Automatic",
    "I'll Be Good",
    "All Night Long",
    "Ghetto Life",
    "Wanna Be Startin' Somethin'",
    "Shame",
    "Behind the Groove",
    "Juicy Fruit",
    "Summer Madness",
    "Last Night a D.J. Saved My Life"
)

class SongNameList {
    fun addToAllSongs(): ArrayList<String?> {
        allSongsList.addAll(flashArtistList)
        allSongsList.addAll(vrockArtistList)
        allSongsList.addAll(vrockArtistList)
        allSongsList.addAll(vrockArtistList)
        allSongsList.addAll(vrockArtistList)
        allSongsList.addAll(vrockArtistList)
        return allSongsList
    }
}