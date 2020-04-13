package liste.base

import sqlite.Monster

class MostriBase {

    constructor(){}

    fun getMostriBase(): List<Monster> {
        var result : MutableList<Monster> = mutableListOf()

        Monster(null,
            null,
            null,
            null,
            null,
            null,
            null,
            null,
            null,
            null,
            null,
            null,
            null,
            null,
            null,
            null,
            null,
            null,
            null,
            null,
            null,
            null,
            null,
            null,
            null,
            null,
            null,
            null,
            null,
            null,
            null
        )


        result.add(
            Monster("Aboleth",
                "Grande",
                "aberrazione",
                "legale malvagio",
                135,
                "(18d10 + 36)",
                17,
                " (armatura naturale)",
                " 3 m, nuoto 12 m ",
                10,
                5900,
                "Costituzione +6, Intelligenza +8, Saggezza +6",
                "Percezione +10, Storia +12",
                "Scurovisione 36 m, Percezione passiva 20",
                "Parlata delle Profondità, telepatia 36 m",
                "Anfibio#L’aboleth può respirare aria e acqua.@" +
                        "Nube di Muco#Mentre è sott’acqua, l’aboleth è avvolto da muco " +
                        "mutante. Una creatura che entri a contatto con l’aboleth, o che lo " +
                        "colpisca con un attacco da mischia mentre si trova entro 1,5 " +
                        "metri da esso, deve effettuare un tiro salvezza di Costituzione " +
                        "CD 14. Se lo fallisce, la creatura resta ammalata per 1d4 ore. La " +
                        "creatura ammalata può respirare solo sott’acqua.@" +
                        "Sonda Telepatica#Se una creatura comunica telepaticamente con " +
                        "l’aboleth, e l’aboleth può vederla, l’aboleth ne apprende i più " +
                        "grandi desideri",
                "Multiattacco#L’aboleth effettua tre attacchi con i tentacoli@" +
                        "Tentacolo#Attacco con arma da mischia: +9 a colpire, portata 3 " +
                        "m, un bersaglio." +
                        "Colpisce: 12 (2d6 + 5) danni contundenti. Se il bersaglio è una " +
                        "creatura, deve riuscire un tiro salvezza di Costituzione CD 14 o " +
                        "divenire ammalato. La malattia non produce alcun effetto per 1 " +
                        "minuto e può essere rimossa da qualsiasi magia che curi le " +
                        "malattie. Dopo 1 minuto, la pelle della creatura ammalata diventa " +
                        "trasparente e viscida, la creatura non può recuperare punti ferita a " +
                        "meno che non sia sott’acqua, e la malattia può essere rimossa " +
                        "solo da guarire o un altro incantesimo cura malattie di 6° livello " +
                        "o più alto. Quando la creatura si trova al di fuori di un corpo " +
                        "d’acqua, subisce 6 (1d12) danni da acido ogni 10 minuti a meno " +
                        "che la sua pelle non venga bagnata prima che siano passati questi " +
                        "10 minuti.@" +
                        "Coda#Attacco con arma da mischia: +9 a colpire, portata 3 m, " +
                        "un bersaglio. " +
                        "Colpisce: 15 (3d6 + 5) danni contundenti.@" +
                        "Schiavizzare (3/Giorno)#L’aboleth prende a bersaglio una " +
                        "creatura che può vedere entro 9 metri da esso. Il bersaglio deve " +
                        "riuscire un tiro salvezza di Saggezza CD 14 o restare affascinato " +
                        "magicamente dall’aboleth finché l’aboleth muore o i due si " +
                        "trovano su piani di esistenza differenti. Il bersaglio affascinato è " +
                        "sotto il controllo dell’aboleth e non può effettuare reazioni. " +
                        "L’aboleth e il bersaglio possono comunicare telepaticamente tra " +
                        "di loro a qualsiasi distanza. " +
                        "Ogniqualvolta il bersaglio affascinato subisce danni, può ripetere " +
                        "il tiro salvezza. Se lo riesce, l’effetto termina. Non più di una " +
                        "volta ogni 24 ore, può ripetere il tiro salvezza quando si trova " +
                        "almeno a 1,5 chilometri di distanza dall’aboleth.",
                "Individuare#L’aboleth effettua una prova di Saggezza (Percezione).@" +
                        "Risucchio Psichico (Costa 2 Azioni)#Una creatura affascinata " +
                        "dall’aboleth subisce 10 (3d6) danni psichici, e l’aboleth recupera un " +
                        "numero di punti ferita pari al danno subito dalla creatura.@" +
                        "Spazzata di Coda#L’aboleth effettua un attacco di coda.",
                "L’aboleth può effettuare 3 azioni leggendarie, scelte tra le " +
                        "opzioni seguenti. Può usare solo un’opzione leggendaria alla " +
                        "volta e solo al termine del turno di un’altra creatura. L’aboleth " +
                        "recupera le azioni leggendarie spese all’inizio del proprio turno.",
                21,
                5,
                9,
                -1,
                18,
                4,
                15,
                2,
                15,
                2,
                18,
                4
            )
        )

        return result
    }
}