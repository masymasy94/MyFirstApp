package liste.base

import sqlite.Monster

class MostriBase {

    constructor(){}

    fun getMostriBase(): List<Monster> {
        var result : MutableList<Monster> = mutableListOf()

        Monster("",
            "",
            "",
            "",
            null,
            "",
            null,
            "",
            "",
            null,
            null,
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
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
            ""
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
                10.0,
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
                "",
                "",
                "",
                "",
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
                4,
                ""
            )
        )
        result.add(
            Monster("Angelo Deva",
                "Medio",
                "celestiale",
                " legale buono",
                136,
                " (16d8 + 64)",
                17,
                " (armatura naturale)",
                " 9 m, volo 27 m",
                10.0,
                5900,
                " Saggezza +9, Carisma +9",
                " Intuizione +9, Percezione +9",
                "scurovisione 36 m, Percezione passiva 19",
                " tutte, telepatia 36 m",
                "Armi Angeliche#Gli attacchi con arma del deva sono magici. " +
                        "Quando il deva colpisce con qualsiasi arma, l’arma infligge 4d8 " +
                        "danni radianti aggiuntivi (già compresi nell’attacco).@" +
                        "Incantesimi Innati#La caratteristica da incantatore innato del " +
                        "deva è il Carisma (CD 17 per i tiri salvezza degli incantesimi). Il " +
                        "deva può lanciare in maniera innata i seguenti incantesimi, con " +
                        "l’uso delle sole componenti verbali: " +
                        "A volontà: individuazione del bene e del male " +
                        "1/giorno: comunione, rianimare morti@" +
                        "Resistenza alla Magia#Il deva ha vantaggio ai tiri salvezza " +
                        "contro incantesimi e altri effetti magici.",
                "Multiattacco#Il deva effettua due attacchi da mischia.@" +
                        "Mazza#Attacco con arma da mischia: +8 a colpire, portata 1,5 " +
                        "m, un bersaglio. " +
                        "Colpisce: 7 (1d6 + 4) danni contundenti più 18 (4d8) danni radianti.@" +
                        "Tocco Guaritore (3/Giorno)#Il deva entra a contatto con un’altra " +
                        "creatura. Il bersaglio recupera magicamente 20 (4d8 + 2) punti " +
                        "ferita ed è libero da qualsiasi cecità, malattia, maledizione, " +
                        "sordità o veleno.@" +
                        "Mutare Forma#Il deva può trasformarsi magicamente in un " +
                        "umanoide o bestia il cui grado di sfida sia pari o inferiore al proprio, " +
                        "o tornare alla sua vera forma. Alla morte ritorna alla sua vera forma. " +
                        "Qualsiasi equipaggiamento stia indossando o trasportando viene " +
                        "assorbito o trasportato nella nuova forma (a scelta del deva). " +
                        "Nella nuova forma, il deva mantiene le sue statistiche di gioco e la " +
                        "facoltà di parlare, ma la sua CA, metodi di movimento, Forza, " +
                        "Destrezza e sensi speciali vengono rimpiazzati da quelli della nuova " +
                        "forma, e ottiene qualsiasi statistica o capacità (eccetto i privilegi di " +
                        "classe, azioni leggendarie e azioni da tana) possedute dalla sua nuova " +
                        "forma e non dalla sua originale.",
                "",
                "",
                "",
                "",
                "",
                "",
                18,
                4,
                18,
                4,
                17,
                3,
                18,
                4,
                20,
                5,
                20,
                5,
                ""
            )
        )

        result.add(
            Monster("Angelo Planetar",
                "Grande",
            "celestiale",
            "legale buono",
            200,
            " (16d10 + 112)",
            19,
            " (armatura naturale)",
            " 12 m, volo 36 m",
            16.0,
            15000,
            " Costituzione +12, Saggezza +11, Carisma +12",
            " Percezione +11 ",
            " visione del vero 36 m, Percezione passiva 21",
            " tutte, telepatia 36 m",
            "Armi Angeliche#Gli attacchi con arma del planetar sono magici. " +
                    "Quando colpisce con qualsiasi arma, l’arma infligge 5d8 danni " +
                    "radianti aggiuntivi (già compresi nell’attacco).@" +
                    "Consapevolezza Divina#Il planetar riconosce immediatamente le " +
                    "bugie.@" +
                    "Incantesimi Innati#La caratteristica da incantatore innato del " +
                    "planetario è il Carisma (CD 20 per i tiri salvezza degli " +
                    "incantesimi). Il planetario può lanciare in maniera innata i " +
                    "seguenti incantesimi, senza bisogno di componenti materiali: " +
                    "A volontà: individuazione del bene e del male, invisibilità (solo " +
                    "personale) " +
                    "3/giorno: barriera di lame, colpo infuocato, dissolvi il bene e il " +
                    "male, rianimare morti " +
                    "1/giorno: comunione, controllare tempo atmosferico, piaga degli " +
                    "insetti@" +
                    "Resistenza alla Magia#Il planetar ha vantaggio ai tiri salvezza " +
                    "contro incantesimi e altri effetti magici.",
            "Multiattacco#Il planetar effettua due attacchi da mischia.@" +
                    "Spadone#Attacco con arma da mischia: +12 a colpire, portata " +
                    "1,5 m, un bersaglio. " +
                    "Colpisce: 21 (4d6 + 7) danni taglienti più 22 (5d8) danni radianti.@" +
                    "Tocco Guaritore (4/Giorno)#Il planetar entra a contatto con " +
                    "un’altra creatura. Il bersaglio recupera magicamente 30 (6d8 + 3) " +
                    "punti ferita ed è libero da qualsiasi cecità, malattia, maledizione, " +
                    "sordità o veleno.",
            "",
            "",
                "",
                "",
                "",
                "",
            24,
            7,
            20,
            5,
            24,
            7,
            19,
            4,
            22,
            6,
            25,
            7,
                ""
        ))

        result.add(
            Monster("Angelo Solar",
                "Grande",
                "celestiale",
                "legale buono",
                243,
                "(18d10 + 144)",
                21,
                "(armatura naturale)",
                "15 m, volo 45 m",
                21.0,
                33000,
                "Intelligenza +14, Saggezza +14, Carisma +17",
                "Percezione +14",
                "visione del vero 36 m, Percezione passiva 24",
                "tutte, telepatia 36 m",
                "Armi Angeliche#Gli attacchi con arma del solar sono magici. " +
                        "Quando colpisce con qualsiasi arma, l’arma infligge 6d8 danni " +
                        "radianti aggiuntivi (già compresi nell’attacco).@" +
                        "Consapevolezza Divina#Il solar riconosce immediatamente le " +
                        "bugie.@" +
                        "Incantesimi Innati#La caratteristica da incantatore innato del " +
                        "solar è il Carisma (CD 25 per i tiri salvezza degli incantesimi). Il  " +
                        "solar può lanciare in maniera innata i seguenti incantesimi, senza " +
                        "bisogno di componenti materiali: " +
                        "A volontà: individuazione del bene e del male, invisibilità (solo " +
                        "personale) " +
                        "3/giorno: barriera di lame, colpo infuocato, dissolvi il bene e il " +
                        "male, resurrezione " +
                        "1/giorno: comunione, controllare tempo atmosferico@" +
                        "Resistenza alla Magia#Il solar ha vantaggio ai tiri salvezza " +
                        "contro incantesimi e altri effetti magici.",
                "Multiattacco#Il solar effettua due attacchi con lo spadone.@" +
                        "Spadone#Attacco con arma da mischia: +15 a colpire, portata " +
                        "1,5 m, un bersaglio. " +
                        "Colpisce: 22 (4d6 + 8) danni taglienti più 27 (6d8) danni radianti. " +
                        "Arco Lungo dell’Uccisione. Attacco con arma a distanza: +13 a " +
                        "colpire, gittata 45/180 m, un bersaglio. " +
                        "Colpisce: 15 (2d8 + 6) danni perforanti più 27 (6d8) danni radianti. " +
                        "Se il bersaglio è una creatura con 100 punti ferita o meno, deve " +
                        "riuscire un tiro salvezza di Costituzione CD 15 o morire.@" +
                        "Spada Volante#Il solare libera il suo spadone perché fluttui " +
                        "magicamente in uno spazio non occupato entro 1,5 metri da lui. " +
                        "Se il solare può vedere la spada, con un’azione bonus le può " +
                        "ordinare mentalmente di volare per un massimo di 15 metri ed " +
                        "effettuare un attacco contro un bersaglio o ritornare nella mano " +
                        "del solare. Se la spada fluttuante è bersaglio di un effetto, si " +
                        "considera come se fosse impugnata dal solare. Se il solare muore, " +
                        "la spada fluttuante cade a terra.@" +
                        "Tocco Guaritore (4/Giorno)#Il solare entra a contatto con " +
                        "un’altra creatura. Il bersaglio recupera magicamente 40 (8d8 + 4)  " +
                        "punti ferita ed è libero da qualsiasi cecità, malattia, maledizione, " +
                        "sordità o veleno.",
                "Esplosione Incandescente (Costa 2 Azioni)#Il solare emette " +
                        "energia magica divina. Ogni creatura di sua scelta, in un raggio di 3 " +
                        "metri, deve effettuare un tiro salvezza di Destrezza CD 23, subendo " +
                        "14 (4d6) danni da fuoco più 14 (4d6) danni radianti se fallisce il tiro " +
                        "salvezza, o la metà se lo riesce.@" +
                        "Sguardo Accecante (Costa 3 Azioni)#Il solare prende a " +
                        "bersaglio una creatura entro 9 metri e che possa vedere. Se il " +
                        "bersaglio può vedere il solare, il bersaglio deve riuscire un tiro " +
                        "salvezza di Costituzione CD 15 o restare accecato finché un " +
                        "incantesimo come ristorare inferiore non rimuoverà la cecità.@" +
                        "Teletrasporto#Il solare si teletrasporta magicamente fino a 36 metri " +
                        "di distanza, insieme a tutto l’equipaggiamento che sta indossando o " +
                        "trasportando, in uno spazio non occupato e che può vedere.",
                "Il solare può effettuare 3 azioni leggendarie, scelte tra le opzioni " +
                        "seguenti. Può usare solo un’opzione leggendaria alla volta e solo " +
                        "al termine del turno di un’altra creatura. Il solare recupera le " +
                        "azioni leggendarie spese all’inizio del proprio turno.",
                "radiante, contundente, perforante e tagliente",
                "necrotico, veleno",
                "",
                "affascinato, avvelenato, sfinimento, " +
                        "spaventato",
                26,
                8,
                22,
                6,
                26,
                8,
                25,
                7,
                25,
                7,
                30,
                10,
                ""
            )
        )

        result.add(
            Monster("Ankheg",
                "Grande",
                "mostruosità",
                "disallineato",
                39,
                "(6d10 + 6)",
                14,
                "(armatura naturale), 11 mentre è prono",
                " 9 m, scavo 3 m",
                2.0,
                450,
                "scurovisione 18 m, percezione tellurica 18 m, Percezione ",
                "",
                "scurovisione 18 m, percezione tellurica 18 m, Percezione passiva 11",
                "",
                "",
                "Morso#Attacco con arma da mischia: +5 a colpire, portata 1,5 " +
                        "m, un bersaglio. " +
                        "Colpisce: 10 (2d6 + 3) danni taglienti più 3 (1d6) danni da acido. " +
                        "Se il bersaglio è una creatura di taglia Grande o inferiore, è " +
                        "afferrata (CD 13 per fuggire). Fino al termine dell’afferrare, " +
                        "l’ankheg può mordere solo la creatura afferrata e ha vantaggio ai " +
                        "tiri di attacco contro di essa.@" +
                        "Spruzzo Acido (Ricarica 6)#L’ankheg sputa acido in una linea " +
                        "lunga 9 metri e larga 1,5 metri, purché non stia afferrando " +
                        "nessuna creatura. Ogni creatura su quella linea deve effettuare un " +
                        "tiro salvezza di Destrezza CD 13, e subire 10 (3d6) danni da " +
                        "acido se fallisce il tiro salvezza, o la metà di questi danni se lo " +
                        "riesce",
                "",
                "",
                "",
                "",
                "",
                "",
                17,
                3,
                11,
                0,
                13,
                1,
                1,
                -5,
                13,
                1,
                -2,
                6,
                ""
            )
        )

        result.add(
            Monster("Arpia",
                "Media",
                "mostruosità",
                "caotico malvagio",
                38,
                " (7d8 + 7)",
                11,
                "",
                "6 m, volo 12 m",
                1.0,
                200,
                "",
                "",
                "Percezione passiva 10",
                "Comune",
                "",
                "Multiattacco#L’armatura effettua due attacchi: uno con gli " +
                        "artigli e uno con il randello.@" +
                        "Artigli#Attacco con arma da mischia: +3 a colpire, portata 1,5 " +
                        "m, un bersaglio. " +
                        "Colpisce: 6 (2d4 + 1) danni taglienti.@" +
                        "Randello#Attacco con arma da mischia: +3 a colpire, portata 1,5 " +
                        "m, un bersaglio. " +
                        "Colpisce: 3 (1d4 + 1) danni contundenti.@" +
                        "Canto Ammaliatore#L’arpia canta una melodia magica. Ogni " +
                        "umanoide e gigante entro 90 metri dall’arpia e che possa udire la " +
                        "canzone deve riuscire un tiro salvezza di Saggezza CD 11 o " +
                        "restare affascinato fino al termine della canzone. L’arpia deve " +
                        "effettuare un’azione bonus durante il suo prossimo turno per " +
                        "continuare a cantare. Può smettere di cantare in qualsiasi " +
                        "momento. Il canto ha termine se l’arpia è inabile. " +
                        "Mentre è affascinato dall’arpia, un bersaglio è inabile e ignora le " +
                        "canzoni di altre arpie. Se il bersaglio affascinato si trova a più di " +
                        "1,5 metri dall’arpia, il bersaglio deve muoversi durante il proprio " +
                        "turno per dirigersi verso l’arpia usando la via più diretta. Egli " +
                        "non eviterà attacchi di opportunità, ma prima di muoversi in un " +
                        "terreno pericoloso, come lava o un pozzo, e prima di subire " +
                        "danno da qualsiasi fonte che non sia l’arpia, il bersaglio potrà " +
                        "ripetere il tiro salvezza. Una creatura può ripetere il tiro salvezza " +
                        "al termine di ciascun proprio turno. Se il tiro salvezza ha " +
                        "successo, l’effetto ha termine per quel bersaglio. " +
                        "Un bersaglio che riesce il tiro salvezza è immune al canto di " +
                        "quell’arpia per le successive 24 ore.",
                "",
                "",
                "",
                "",
                "",
                "",
                12,
                1,
                13,
                1,
                12,
                1,
                7,
                -2,
                10,
                0,
                13,
                1,
                ""
            )
        )

        result.add(
            Monster("Azer",
                "Media",
                "elementale",
                "legale neutrale",
                39,
                "(6d8 + 12)",
                17,
                "(armatura naturale, scudo)",
                "9 m",
                2.0,
                450,
                " Costituzione +4",
                "",
                "Percezione passiva 11",
                "Ignan",
                "Armi Riscaldate#Quando l’azer colpisce con un’arma da mischia " +
                        "in metallo, infligge 3 (1d6) danni da fuoco aggiuntivi (già inclusi " +
                        "nell’attacco).@" +
                        "Corpo Riscaldato#Una creatura che entri a contatto con l’azer o " +
                        "lo colpisca con un attacco da mischia mentre si trova entro 1,5 " +
                        "metri da lui subisce 5 (1d10) danni da fuoco.@" +
                        "Fuoco Vivente#Un azer non ha bisogno di cibo, bevande o di " +
                        "dormire.@" +
                        "Illuminazione#L’azer irradia luce intensa in un raggio di 3 metri " +
                        "e luce fioca per ulteriori 3 metri.",
                "Martello da Guerra. Attacco con arma da mischia: +5 a colpire, " +
                        "portata 1,5 m, un bersaglio. " +
                        "Colpisce: 7 (1d8 + 3) danni contundenti, o 8 (1d10 + 3) danni " +
                        "contundenti se usato a due mani per effettuare un attacco da " +
                        "mischia, più 3 (1d6) danni da fuoco. ",
                "",
                "",
                "",
                "fuoco, veleno",
                "",
                "avvelenato",
                17,
                3,
                12,
                1,
                15,
                2,
                12,
                1,
                13,
                1,
                10,
                0,
                ""
            )
        )

        result.add(
            Monster("Basilisco",
                "Media",
                "mostruosità",
                "disallineato",
                52,
                "(8d8 + 16)",
                15,
                "(armatura naturale)",
                "6 m",
                3.0,
                700,
                "",
                "",
                "scurovisione 18 m, Percezione passiva 9",
                "",
                "Sguardo Pietrificante#Se una creatura comincia il suo turno entro 9 " +
                        "metri dal basilisco e i due si possono vedere vicendevolmente, se non " +
                        "è inabile il basilisco può obbligare la creatura ad effettuare un tiro " +
                        "salvezza di Costituzione CD 12. Se la creatura fallisce il tiro " +
                        "salvezza, inizia magicamente a trasformarsi in pietra ed è intralciata. " +
                        "La creatura deve ripetere il tiro salvezza al termine del suo prossimo " +
                        "turno. Se lo riesce, l’effetto termina. Se lo fallisce, la creatura è " +
                        "pietrificata finché non viene liberata dall’incantesimo ristorare " +
                        "superiore o altra magia. " +
                        "Una creatura che non sia sorpresa, può distogliere lo sguardo per " +
                        "evitare il tiro salvezza all’inizio del suo turno. In quel caso, non " +
                        "potrà vedere il basilisco fino all’inizio del suo prossimo turno, " +
                        "quando potrà distogliere nuovamente lo sguardo. Se nel " +
                        "frattempo dovesse guardare il basilisco, dovrebbe " +
                        "immediatamente effettuare il tiro salvezza. " +
                        "Se il basilisco si trova entro 9 metri dal suo riflesso a luce intensa " +
                        "e lo vede, lo scambia per un rivale e diventa il bersaglio del " +
                        "proprio sguardo. ",
                "Morso#Attacco con arma da mischia: +5 a colpire, portata 1,5 " +
                        "m, un bersaglio. " +
                        "Colpisce: 10 (2d6 + 3) danni perforanti più 7 (2d6) danni da veleno.",
                "",
                "",
                "",
                "",
                "",
                "",
                16,
                3,
                8,
                -1,
                15,
                2,
                2,
                4,
                8,
                -1,
                7,
                -2,
                ""
            )
        )

        result.add(
            Monster("Behir",
                "Enorme",
                "mostruosità",
                "neutrale malvagio",
                168,
                "(16d12 + 64)",
                17,
                "(armatura naturale)",
                "15 m, scalata 12 m",
                11.0,
                7200,
                "",
                "Furtività +7, Percezione +6",
                "scurovisione 27 m, Percezione passiva 16",
                "Draconico",
                "",
                "Multiattacco#Il behir effettua due attacchi: uno con il morso e " +
                        "uno per stritolare.@" +
                        "Morso#Attacco con arma da mischia: +10 a colpire, portata 3 m, " +
                        "un bersaglio.@" +
                        "Colpisce: 22 (3d10 + 6) danni perforanti. " +
                        "Stritolare#Attacco con arma da mischia: +10 a colpire, portata " +
                        "1,5 m, una creatura di taglia Grande o inferiore. " +
                        "Colpisce: 17 (2d10 + 6) danni contundenti più 17 (2d10 + 6) " +
                        "danni taglienti. Il bersaglio è afferrato (CD 16 per fuggire) Se il " +
                        "behir non sta già stritolando un’altra creatura, il bersaglio è " +
                        "afferrato e intralciato fino al termine dell’afferrare.@" +
                        "Inghiottire#Il behir effettua una attacco di morso contro un " +
                        "bersaglio di taglia Media o inferiore che sta afferrando. Se " +
                        "l’attacco colpisce, il bersaglio è inghiottito, e l’afferrare ha " +
                        "termine. Il bersaglio inghiottito è accecato e intralciato, ha " +
                        "copertura totale contro gli attacchi e altri effetti all’esterno del " +
                        "behir, e subisce 21 (6d6) danni da acido all’inizio di ciascun " +
                        "turno del behir. Il behir può inghiottire solo una creatura alla " +
                        "volta. " +
                        "Se il behir subisce 30 o più danni in un singolo turno da una " +
                        "creatura che ha inghiottito, deve riuscire un tiro salvezza di " +
                        "Costituzione CD 14 al termine di quel turno o vomitare la " +
                        "creatura, che ricade prona in uno spazio entro 3 metri dal behir. " +
                        "Se il behir muore, una creatura inghiottita non è più intralciata da " +
                        "esso e può uscire dal cadavere utilizzando 4,5 metri di " +
                        "movimento, uscendo prona.@" +
                        "Soffio di Fulmine (Ricarica 5-6)#Il behir esala fulmini in una " +
                        "linea lunga 6 metri e larga 1,5 metri. Ogni creatura su quella " +
                        "linea deve effettuare un tiro salvezza di Destrezza CD 16 e subire " +
                        "66 (12d10) danni da fulmine se fallisce il tiro salvezza, o la metà " +
                        "di questi danni se lo riesce.",
                "",
                "",
                "",
                "fulmine",
                "",
                "",
                23,
                6,
                16,
                3,
                18,
                4,
                7,
                -2,
                14,
                2,
                12,
                1,
                ""
            )
        )

        result.add(
            Monster("Bugbear",
                "Media",
                " umanoide (goblinoide)",
                "caotico malvagio",
                27,
                "(5d8 + 5)",
                16,
                "(armatura di pelle, scudo)",
                "9 m",
                1.0,
                200,
                "",
                "Furtività +6, Sopravvivenza +2",
                "scurovisione 18 m, Percezione passiva 10",
                "Comune, Goblin",
                "Attacco di Sorpresa#Se il bugbear sorprende una creatura e la " +
                        "colpisce con un attacco durante il primo round di combattimento, " +
                        "il bersaglio subisce 7 (2d6) danni aggiuntivi dall’attacco.@" +
                        "Bruto#Un’arma da mischia infligge un dado aggiuntivo di danno " +
                        "quando il bugbear colpisce con essa (già incluso nell’attacco).",
                "Mazza Chiodata#Attacco con arma da mischia: +4 a colpire, " +
                        "portata 1,5 m, un bersaglio. " +
                        "Colpisce: 11 (2d8 + 2) danni perforanti.@" +
                        "Giavellotto#Attacco con arma da mischia o a Distanza: +4 a " +
                        "colpire, portata 1,5 m o gittata 9/36 m, un bersaglio. " +
                        "Colpisce: 9 (2d6 + 2) danni perforanti in mischia o 5 (1d6 + 2) " +
                        "danni perforanti a gittata.",
                "",
                "",
                "",
                "",
                "",
                "",
                15,
                2,
                14,
                2,
                13,
                1,
                8,
                -1,
                11,
                0,
                9,
                -1,
                ""
            )
        )

        result.add(
            Monster("Bulette",
                "Grande",
                "mostruosità",
                "disallineato",
                94,
                "(9d10 + 45)",
                17,
                "(armatura naturale)",
                "12 m, scavo 12 m",
                5.0,
                1800,
                "",
                "Percezione +6",
                "scurovisione 18 m, percezione tellurica 18 m, Percezione " +
                        "passiva 16",
                "",
                "Salto da Fermo#Un bulette può saltare in lungo fino a 9 metri e " +
                        "in alto fino a 4,5 metri, con o senza la rincorsa.",
                "Morso#Attacco con arma da mischia: +7 a colpire, portata 1,5 " +
                        "m, un bersaglio. " +
                        "Colpisce: 30 (4d12 + 4) danni perforanti.@" +
                        "Salto Letale#Se il bulette può saltare di almeno 4,5 metri come " +
                        "parte del suo movimento, può usare poi questa azione per " +
                        "atterrare in piedi in uno spazio che contiene una o più creature. " +
                        "Ciascuna di queste creature deve riuscire un tiro salvezza di " +
                        "Forza o Destrezza CD 16 (a scelta del bersaglio) o venire gettata " +
                        "prona e subire 14 (3d6 + 4) danni contundenti più 14 (3d6 + 4) " +
                        "danni taglienti. Se il tiro salvezza riesce, la creatura subisce solo " +
                        "la metà dei danni, non è gettata prona, e viene spinta di 1,5 metri " +
                        "fuori dello spazio del bulette in uno spazio non occupato a scelta " +
                        "della creatura. Se non ci sono spazi non occupati a gittata, la " +
                        "creatura cade prona nello spazio del bulette.",
                "",
                "",
                "",
                "",
                "",
                "",
                19,
                4,
                11,
                0,
                21,
                5,
                2,
                -4,
                10,
                0,
                5,
                -3,
                ""
            )
        )

        result.add(
            Monster("Centauro",
                "Grande",
                "mostruosità",
                "neutrale buono",
                45,
                "(6d10 + 12)",
                12,
                "",
                "15 m",
                2.0,
                450,
                "",
                "Atletica +6, Percezione +3, Sopravvivenza +3",
                "Percezione passiva 13",
                "Elfico, Silvano",
                "Carica#Se il centauro si muove di almeno 9 metri diretto verso il " +
                        "bersaglio e colpisce con un attacco di picca durante lo stesso " +
                        "turno, il bersaglio subisce 10 (3d6) danni perforanti aggiuntivi. ",
                "Multiattacco#Il centauro effettua due attacchi: uno con la picca e " +
                        "uno con gli zoccoli o due con l’arco lungo.@" +
                        "Picca#Attacco con arma da mischia: +6 a colpire, portata 3 m, " +
                        "un bersaglio. " +
                        "Colpisce: 9 (1d10 + 4) danni perforanti. " +
                        "Zoccoli#Attacco con arma da mischia: +6 a colpire, portata 1,5 " +
                        "m, un bersaglio. " +
                        "Colpisce: 11 (2d6 + 4) danni contundenti.@" +
                        "Arco Lungo#Attacco con arma a Distanza: +4 a colpire, gittata " +
                        "45/180 m, un bersaglio. " +
                        "Colpisce: 6 (1d8 + 2) danni perforanti.",
                "",
                "",
                "",
                "",
                "",
                "",
                18,
                4,
                14,
                2,
                14,
                2,
                9,
                -1,
                13,
                1,
                11,
                0,
                ""
            )
        )

        result.add(
            Monster("Chimera",
                "Grande",
                "mostruosità",
                "caotico malvagio",
                114,
                "(12d10 + 48)",
                14,
                "(armatura naturale)",
                " 9 m, volo 18 m",
                6.0,
                2300,
                "",
                "Percezione +8",
                "scurovisione 18 m, Percezione passiva 18",
                "comprende il Draconico ma non può parlare",
                "",
                "Multiattacco#La chimera effettua tre attacchi: uno con il morso, " +
                        "uno con le corna e uno con gli artigli. Quando il soffio infuocato " +
                        "è disponibile, può usare il soffio al posto del morso o delle corna. " +
                        "Artigli. Attacco con arma da mischia: +7 a colpire, portata 1,5 " +
                        "m, un bersaglio. " +
                        "Colpisce: 11 (2d6 + 4) danni taglienti.@" +
                        "Corna#Attacco con arma da mischia: +7 a colpire, portata 1,5 m, " +
                        "un bersaglio. " +
                        "Colpisce: 10 (1d12 + 4) danni contundenti.@" +
                        "Morso#Attacco con arma da mischia: +7 a colpire, portata 1,5 " +
                        "m, un bersaglio. " +
                        "Colpisce: 11 (2d6 + 4) danni perforanti.@" +
                        "Soffio Infuocato (Ricarica 5-6)#La testa di drago esala fuoco in " +
                        "un cono di 4,5 metri. Ogni creatura in quell’area deve effettuare " +
                        "un tiro salvezza di Destrezza CD 15 e subire 31 (7d8) danni da " +
                        "fuoco se fallisce il tiro salvezza, o la metà di questi danni se lo " +
                        "riesce. ",
                "",
                "",
                "",
                "",
                "",
                "",
                19,
                4,
                11,
                0,
                19,
                4,
                3,
                -4,
                14,
                2,
                10,
                0,
                ""
            )
        )

        result.add(
            Monster("Chuul",
                "Grande",
                "aberrazione",
                "caotico malvagio",
                93,
                " (11d10 + 33)",
                16,
                "(armatura naturale)",
                "9 m, nuoto 9 m",
                4.0,
                1100,
                "",
                " Percezione +4",
                " scurovisione 18 m, Percezione passiva 14",
                "comprende la Parlata delle Profondità ma non può " +
                        "parlare",
                "Anfibio#Il chuul può respirare aria e acqua.@" +
                        "Senso della Magia#Il chuul percepisce la magia entro 36 metri " +
                        "da sé. Questo tratto funziona come l’incantesimo individuazione " +
                        "del magico ma di per sé non è magico.",
                "Multiattacco#Il chuul effettua due attacchi con le chele. Se il " +
                        "chuul sta afferrando una creatura, può anche usare i suoi " +
                        "tentacoli una volta.@" +
                        "Chele#Attacco con arma da mischia: +6 a colpire, portata 3 m, " +
                        "un bersaglio. " +
                        "Colpisce: 11 (2d6 + 4) danni contundenti. Un bersaglio è " +
                        "afferrato (CD 14 per fuggire) se è di taglia Grande o inferiore e il " +
                        "chuul non sta già afferrando altre due creature.@" +
                        "Tentacoli#Una creatura afferrata dal chuul deve riuscire un tiro " +
                        "salvezza di Costituzione CD 13 o restare avvelenata per 1 " +
                        "minuto. Fino al termine dell’avvelenamento, il bersaglio è " +
                        "paralizzato. Il bersaglio può ripetere il tiro salvezza al termine di " +
                        "ciascun suo turno, terminando l’effetto per sé in caso di successo.",
                "",
                "",
                "",
                "veleno",
                "",
                "avvelenato",
                19,
                4,
                10,
                0,
                16,
                3,
                5,
                -3,
                11,
                0,
                5,
                -3,
                ""
            )
        )

        result.add(
            Monster("Coboldo",
                "Piccola",
                "umanoide (coboldo)",
                "legale malvagio",
                5,
                "(2d6 - 2)",
                12,
                "",
                "9 m",
                0.125,
                25,
                "",
                "",
                "scurovisione 18 m, Percezione passiva 8",
                "Comune, Draconico",
                "Sensibilità alla Luce#Mentre è alla luce del sole, il coboldo ha " +
                        "svantaggio ai tiri per colpire, oltre che alle prove di Saggezza " +
                        "(Percezione) basate sulla vista.@" +
                        "Tattiche di Branco#Il coboldo ha vantaggio ai tiri per colpire " +
                        "contro una creatura se almeno uno degli alleati del coboldo si " +
                        "trova entro 1,5 metri dalla creatura e quell’alleato non è inabile",
                "Pugnale#Attacco con arma da mischia: +4 a colpire, portata 1,5 " +
                        "m, un bersaglio." +
                        "Colpisce: 4 (1d4 + 2) danni perforanti.@" +
                        "Fionda#Attacco con arma a distanza: +4 a colpire, gittata 9/36 " +
                        "m, un bersaglio. " +
                        "Colpisce: 4 (1d4 + 2) danni contundenti.",
                "",
                "",
                "",
                "",
                "",
                "",
                7,
                -2,
                15,
                2,
                9,
                -1,
                8,
                -1,
                7,
                -2,
                8,
                -1,
                ""
            )
        )

        result.add(
            Monster("Cockatrice",
                "Piccola",
                "mostruosità",
                "disallineato",
                27,
                "(6d6 + 6)",
                11,
                "",
                "6 m, volo 12 m",
                0.5,
                100,
                "",
                "",
                "scurovisione 18 m, Percezione passiva 11",
                "",
                "",
                "Morso#Attacco con arma da mischia: +3 a colpire, portata 1,5 " +
                        "m, una creatura. " +
                        "Colpisce: 3 (1d4 + 1) danni perforanti, e il bersaglio deve " +
                        "riuscire un tiro salvezza di Costituzione CD 11 per non essere " +
                        "magicamente pietrificato. Se fallisce il tiro salvezza, la creatura " +
                        "inizia a trasformarsi in pietra ed è intralciata. Al termine del " +
                        "turno successivo deve ripetere il tiro salvezza. Se lo riesce, " +
                        "l’effetto ha termine. Se lo fallisce, la creatura è pietrificata per 24 " +
                        "ore.",
                "",
                "",
                "",
                "",
                "",
                "",
                6,
                -2,
                12,
                1,
                12,
                1,
                2,
                -4,
                13,
                1,
                5,
                -3,
                ""
            )
        )

        result.add(
            Monster("Couatl",
                "Media",
                "celestiale",
                "legale buono",
                97,
                "(13d8 + 39)",
                19,
                "(armatura naturale)",
                "9 m, volo 9 m",
                4.0,
                1100,
                "Costituzione +5, Saggezza +7, Carisma +6",
                "",
                "visione del vero 36 m, Percezione passiva 15",
                "tutte, telepatia 36 m",
                "Armi Magiche#Gli attacchi con armi del couatl sono magici.@" +
                        "Incantesimi Innati#La caratteristica da incantatore innato del " +
                        "couatl è il Carisma (CD dei tiri salvezza degli incantesimi 14). Il " +
                        "couatl può lanciare questi incantesimi in maniera innata, usando " +
                        "solo componenti verbali: " +
                        "A volontà: individuazione del bene e del male, individuazione del " +
                        "magico, individuazione dei pensieri " +
                        "3/giorno ciascuno: benedizione, creare cibo e acqua, cura ferite, " +
                        "protezione dai veleni, ristorare inferiore, santuario, scudo " +
                        "1/giorno ciascuno: ristorare superiore, scrutare, sogno@" +
                        "Mente Protetta#Il couatl è immune allo scrutare e qualsiasi " +
                        "effetto che percepisca le sue emozioni, legga i suoi pensieri o " +
                        "individui la sua posizione.",
                "Morso#Attacco con arma da mischia: +8 a colpire, portata 1,5 " +
                        "m, una creatura. " +
                        "Colpisce: 8 (1d6 + 5) danni perforanti, e il bersaglio deve " +
                        "riuscire un tiro salvezza di Costituzione CD 13 o restare " +
                        "avvelenato per 24 ore. Fino al termine dell’avvelenamento, il " +
                        "bersaglio è privo di sensi. Un’altra creatura può effettuare " +
                        "un’azione per risvegliare il bersaglio.@" +
                        "Stritolare#Attacco con arma da mischia: +6 a colpire, portata 3 " +
                        "m, una creatura di taglia Media o inferiore. " +
                        "Colpisce: 10 (2d6 + 3) danni contundenti, e il bersaglio è afferrato " +
                        "(CD 15 per fuggire). Fino al termine dell’afferrare, il bersaglio è " +
                        "intralciato, e il couatl non può stritolare un altro bersaglio.@" +
                        "Mutare Forma#Il couatl può trasformarsi magicamente in un " +
                        "umanoide o bestia il cui grado di sfida sia pari o inferiore al proprio, " +
                        "o tornare alla sua vera forma. Alla morte ritorna alla sua vera forma. " +
                        "Qualsiasi equipaggiamento stia indossando o trasportando viene " +
                        "assorbito o trasportato nella nuova forma (a scelta del couatl). " +
                        "Nella nuova forma, il couatl mantiene le sue statistiche di gioco e la " +
                        "facoltà di parlare, ma la sua CA, metodi di movimento, Forza, " +
                        "Destrezza e altre azioni vengono rimpiazzati da quelli della nuova " +
                        "forma, e ottiene qualsiasi statistica o capacità (eccetto i privilegi di " +
                        "classe, azioni leggendarie e azioni da tana) possedute dalla sua nuova " +
                        "forma e non dalla sua originale. Se la nuova forma ha un attacco di " +
                        "morso, il couatl può usare il proprio morso nella nuova forma.",
                "",
                "",
                "radiante",
                "psichico; contundente, perforante e " +
                        "tagliente di attacchi non magici ",
                "",
                "",
                16,
                3,
                20,
                5,
                17,
                3,
                18,
                4,
                20,
                5,
                18,
                4,
                ""
            )
        )

        result.add(
            Monster("Cumulo Strisciante",
                "Grande",
                "pianta",
                "disallineato",
                136,
                "(16d10 + 48)",
                15,
                "(armatura naturale)",
                "6 m, nuoto 6 m",
                5.0,
                1800,
                "",
                "Furtività +2",
                "vista cieca 18 m (cieco oltre questo raggio), Percezione " +
                        "passiva 10",
                "",
                "Assorbimento dei Fulmini#Ogni qual volta il cumulo strisciante " +
                        "subisce danni da fulmine, non subisce danni e recupera un " +
                        "numero di punti ferita pari al danno da fulmine inferto.",
                "Multiattacco#Il cumulo strisciante effettua due attacchi di " +
                        "schianto. Se entrambi gli attacchi colpiscono una creatura di " +
                        "taglia Media o inferiore, il bersaglio è afferrato (CD 14 per " +
                        "fuggire) e il cumulo strisciante usa Avvolgere su di esso.@" +
                        "Schianto#Attacco con arma da mischia: +7 a colpire, portata 1,5 " +
                        "m, un bersaglio. " +
                        "Colpisce: 13 (2d8 + 4) danni contundenti.@" +
                        "Avvolgere#Il cumulo strisciante avvolge una creatura di taglia " +
                        "Media o inferiore che ha afferrato. Il bersaglio avvolto è " +
                        "accecato, intralciato e impossibilitato a respirare, e deve riuscire " +
                        "un tiro salvezza di Costituzione CD 14 all’inizio di ciascun turno " +
                        "del tumulo o subire 13 (2d8 + 4) danni contundenti. Se il cumulo " +
                        "si muove, il bersaglio avvolto si muove con esso. Il cumulo può " +
                        "avvolgere solo una creatura alla volta.",
                "",
                "",
                "freddo, fuoco",
                "fulmine",
                "",
                "accecato, assordato, sfinimento",
                18,
                4,
                8,
                -1,
                16,
                3,
                5,
                -3,
                10,
                0,
                5,
                -3,
                ""
            )

        )

        result.add(
            Monster("Balor",
                "Enorme",
                "immondo (demone)",
                "caotico malvagio",
                262,
                "(21d12 + 126)",
                19,
                "(armatura naturale)",
                "12 m, volo 24 m",
                19.0,
                22000,
                "Forza +14, Costituzione +12, Saggezza +9, " +
                        "Carisma +12",
                "",
                "visione del vero 36 m, Percezione passiva 13",
                "Abissale, telepatia 36 m",
                "Armi Magiche#Gli attacchi con arma del demone sono magici.@" +
                        "Aura di Fuoco#All’inizio di ciascun turno del demone, ciascuna " +
                        "creatura entro 1,5 metri da lui subisce 10 (3d6) danni da fuoco, e " +
                        "gli oggetti infiammabili che si trovano nell’aura e che non sono " +
                        "indossati o trasportati prendono fuoco. Una creatura che entri a " +
                        "contatto con il demone o lo colpisca con un attacco da mischia " +
                        "mentre si trova entro 1,5 metri da esso subisce 10 (3d6) danni da " +
                        "fuoco.@" +
                        "Resistenza alla Magia#Il demone ha vantaggio ai tiri salvezza " +
                        "contro incantesimi e altri effetti magici.@" +
                        "Spasmo Mortale#Quando il demone muore, esplode; ciascuna " +
                        "creatura entro 9 metri da esso deve effettuare un tiro salvezza di " +
                        "Destrezza CD 20, subendo 70 (20d6) danni da fuoco se fallisce il " +
                        "tiro salvezza, o la metà di questi danni se lo riesce. L’esplosione " +
                        "appicca il fuoco agli oggetti infiammabili che non sono indossati " +
                        "o trasportati, e distrugge le armi del demone",
                "Multiattacco#Il demone effettua due attacchi: uno con la spada " +
                        "lunga e uno con la frusta.@" +
                        "Frusta#Attacco con arma da mischia: +14 a colpire, portata 9 m, " +
                        "un bersaglio. " +
                        "Colpisce: 15 (2d6 + 8) danni taglienti più 10 (3d6) danni da " +
                        "fuoco, e il bersaglio deve riuscire un tiro salvezza di Forza CD " +
                        "20 o venire trascinato 7,5 metri verso il demone.@" +
                        "Spada Lunga#Attacco con arma da mischia: +14 a colpire, " +
                        "portata 3 m, un bersaglio. " +
                        "Colpisce: 21 (3d8 + 8) danni taglienti più 13 (3d8) danni da " +
                        "fulmine. Se il demone ottiene un colpo critico, tira il danno tre " +
                        "volte, invece che due.@" +
                        "Teletrasporto#Il demone si teletrasporta magicamente, insieme a " +
                        "tutto l’equipaggiamento che indossa o trasporta, in uno spazio " +
                        "non occupato e che può vedere entro 36 metri. ",
                "",
                "",
                "freddo, fulmine; contundente, perforante e " +
                        "tagliente di attacchi non magici",
                "fuoco, veleno",
                "",
                "avvelenato",
                26,
                8,
                15,
                2,
                22,
                6,
                20,
                5,
                16,
                3,
                22,
                6,
                ""
            )
        )

        result.add(
            Monster("Dretch",
                "Piccola",
                "immondo (demone)",
                "caotico malvagio",
                18,
                "(4d6 + 4)",
                11,
                "(armatura naturale)",
                "6 m",
                0.25,
                50,
                "",
                "",
                "scurovisione 18 m, Percezione passiva 9",
                "Abissale, telepatia 18 m (funziona solo con le " +
                        "creature che comprendono l’Abissale)",
                "",
                "Multiattacco#Il demone effettua due attacchi: uno con il morso e " +
                        "uno con gli artigli.@" +
                        "Artigli#Attacco con arma da mischia: +2 a colpire, portata 1,5 " +
                        "m, un bersaglio. " +
                        "Colpisce: 5 (2d4) danni taglienti.@" +
                        "Morso#Attacco con arma da mischia: +2 a colpire, portata 1,5 " +
                        "m, un bersaglio. " +
                        "Colpisce: 3 (1d6) danni perforanti.@" +
                        "Nube Fetida (1/Giorno)#Un disgustoso gas verde si estende in " +
                        "un raggio di 3 metri dal demone. Il gas si propaga intorno agli " +
                        "angoli, e la sua area è oscurata leggermente. Rimane per 1 " +
                        "minuto o finché non viene disperso da un forte vento. Qualsiasi " +
                        "creatura che inizi il proprio turno in quell’area deve riuscire un " +
                        "tiro salvezza di Costituzione CD 11 o restare avvelenata fino " +
                        "all’inizio del suo prossimo turno. Mentre è avvelenato in questo " +
                        "modo, il bersaglio, durante il suo turno, può effettuare solo " +
                        "un’azione o un’azione bonus, ma non entrambe, e non può " +
                        "effettuare reazioni.",
                "",
                "",
                "freddo, fulmine, fuoco",
                "veleno",
                "",
                "avvelenato",
                11,
                0,
                11,
                0,
                12,
                1,
                5,
                -3,
                8,
                -1,
                3,
                -4,
                ""
            )
        )

        result.add(
            Monster("Glabrezu",
                "Grande",
                "immondo (demone)",
                "caotico malvagio",
                157,
                "(15d10 + 75)",
                17,
                "(armatura naturale)",
                "12 m",
                9.0,
                5000,
                "Forza +9, Costituzione +9, Saggezza +7, Carisma\n" +
                        "+7",
                "",
                "visione del vero 36 m, Percezione passiva 13",
                "Abissale, telepatia 36 m",
                "Incantesimi Innati#La caratteristica da incantatore del demone è " +
                        "l’Intelligenza (CD dei tiri salvezza degli incantesimi 16). Il " +
                        "demone può lanciare questi incantesimi in maniera innata, senza " +
                        "bisogno di componenti materiali: " +
                        "A volontà: dissolvi magie, individuazione del magico, oscurità " +
                        "1/giorno ciascuno: confusione, parola del potere stordire, volare@" +
                        "Resistenza alla Magia#Il demone ha vantaggio ai tiri salvezza " +
                        "contro incantesimi e altri effetti magici. ",
                "Multiattacco#Il demone effettua quattro attacchi: due con le " +
                        "chele e due con i pugni. In alternativa, può effettuare due attacchi " +
                        "con le chele e lanciare un incantesimo.@" +
                        "Chela#Attacco con arma da mischia: +9 a colpire, portata 3 m, " +
                        "un bersaglio. " +
                        "Colpisce: 16 (2d10 + 5) danni contundenti. Se il bersaglio è una " +
                        "creatura di taglia Media o inferiore, è afferrato (CD 15 per " +
                        "fuggire). Il glabrezu possiede due chele, ciascuna delle quali può " +
                        "afferrare un bersaglio.@" +
                        "Pugno#Attacco in mischia con arma: +9 a colpire, portata 1,5 m, " +
                        "un bersaglio. " +
                        "Colpisce: 7 (2d4 + 2) danni contundenti. ",
                "",
                "",
                "freddo, fulmine, fuoco; contundente, " +
                        "perforante e tagliente di attacchi non magici",
                "veleno",
                "",
                "avvelenato",
                20,
                5,
                15,
                2,
                21,
                5,
                19,
                4,
                17,
                3,
                16,
                3,
                ""
            )
        )

        result.add(
            Monster("Hezrou",
                "Grande",
                "immondo (demone)",
                "caotico malvagio",
                136,
                "(13d10 + 65)",
                16,
                "(armatura naturale)",
                "9 m",
                8.0,
                3900,
                "Forza +7, Costituzione +8, Saggezza +4",
                "",
                "scurovisione 36 m, Percezione passiva 11",
                "Abissale, telepatia 36 m",
                "Fetore#Qualsiasi creatura che inizi il suo turno entro 3 metri dal " +
                        "demone, deve riuscire un tiro salvezza di Costituzione CD 14 o " +
                        "restare avvelenata fino all’inizio del proprio turno. Se riesce il " +
                        "tiro salvezza, la creatura è immune al fetore del demone " +
                        "gracidante per 24 ore.@" +
                        "Resistenza alla Magia#Il demone ha vantaggio ai tiri salvezza " +
                        "contro incantesimi e altri effetti magici.",
                "Multiattacco#Il demone effettua tre attacchi: uno con il morso e " +
                        "due con gli artigli.@" +
                        "Artiglio#Attacco con arma da mischia: +7 a colpire, portata 1,5 " +
                        "m, un bersaglio. " +
                        "Colpisce: 11 (2d6 + 4) danni taglienti.@" +
                        "Morso#Attacco con arma da mischia: +7 a colpire, portata 1,5 " +
                        "m, un bersaglio. " +
                        "Colpisce: 15 (2d10 + 4) danni perforanti. ",
                "",
                "",
                " freddo, fulmine, fuoco; contundente, " +
                        "perforante e tagliente di attacchi non magici",
                "veleno",
                "",
                "avvelenato",
                19,
                4,
                17,
                3,
                20,
                5,
                5,
                -2,
                12,
                1,
                13,
                1,
                ""
            )
        )

        result.add(
            Monster("Marilith",
                "Grande",
                "immondo (demone)",
                "caotico malvagio",
                189,
                "(18d10 + 90)",
                18,
                "(armatura naturale)",
                "12 m",
                16.0,
                15000,
                "Forza +9, Costituzione +10, Saggezza +8, Carisma " +
                        "+10",
                "",
                "visione del vero 36 m, Percezione passiva 13",
                "Abissale, telepatia 36 m",
                "Armi Magiche#Gli attacchi con armi del demone sono magici.@" +
                        "Reattivo#Il demone può effettuare una reazione durante ciascun " +
                        "turno di combattimento.@" +
                        "Resistenza alla Magia#Il demone ha vantaggio ai tiri salvezza " +
                        "contro incantesimi e altri effetti magici.",
                "Multiattacco#Il demone effettua sette attacchi: sei con le spade " +
                        "lunghe e uno con la coda.@" +
                        "Coda#Attacco con arma da mischia: +9 a colpire, portata 3 m, " +
                        "una creatura. " +
                        "Colpisce: 15 (2d10 + 4) danni contundenti. Se il bersaglio è di " +
                        "taglia Media o inferiore, è afferrato (CD 19 per fuggire). Fino al " +
                        "termine dell’afferrare, il bersaglio è intralciato, e il demone può " +
                        "colpire automaticamente il bersaglio con la coda, ma non può " +
                        "effettuare attacchi di coda contro altri bersagli.@" +
                        "Spada Lunga#Attacco con arma da mischia: +9 a colpire, " +
                        "portata 1,5 m, un bersaglio. " +
                        "Colpisce: 13 (2d8 + 4) danni taglienti.",
                "",
                "",
                " freddo, fulmine, fuoco; contundente, " +
                        "perforante e tagliente di attacchi non magici",
                "veleno",
                "",
                "avvelenato",
                18,
                4,
                20,
                5,
                20,
                5,
                18,
                4,
                16,
                3,
                20,
                5,
                "Parata#Il demone somma 5 alla sua CA contro un attacco da " +
                        "mischia che lo colpirebbe. Per farlo, il demone deve poter vedere " +
                        "il suo attaccante e impugnare un’arma da mischia."
            )
        )

        result.add(
            Monster("Nalfeshnee",
                "Grande",
                "immondo (demone)",
                "caotico malvagio",
                184,
                "(16d10 + 96)",
                18,
                "(armatura naturale)",
                "",
                13.0,
                10000,
                "Costituzione +11, Intelligenza +9, Saggezza +6, " +
                        "Carisma +7",
                "",
                "scurovisione 36 m, Percezione passiva 11",
                "Abissale, telepatia 36 m",
                "Resistenza alla Magia#Il demone ha vantaggio ai tiri salvezza " +
                        "contro incantesimi e altri effetti magici.",
                "Multiattacco#Il demone usa, se possibile, Aureola di Orrore. Poi " +
                        "effettua tre attacchi: uno con il morso e due con gli artigli.@" +
                        "Artiglio#Attacco con arma da mischia: +10 a colpire, portata 3 " +
                        "m, un bersaglio. " +
                        "Colpisce: 15 (3d6 + 5) danni taglienti.@" +
                        "Morso#Attacco con arma da mischia: +10 a colpire, portata 1,5 " +
                        "m, un bersaglio. " +
                        "Colpisce: 32 (5d10 + 5) danni perforanti.@" +
                        "Aureola di Orrore (Ricarica 5-6)#Il demone emette una luce " +
                        "magica multicolore e scintillante. Ogni creatura entro 4,5 metri " +
                        "dal demone e che possa vedere la luce, deve riuscire un tiro " +
                        "salvezza di Saggezza CD 15 o restare spaventata per 1 minuto. " +
                        "Una creatura può ripetere il tiro salvezza al termine di ciascun " +
                        "suo turno, terminando l’effetto per sé se lo riesce. Se il tiro " +
                        "salvezza della creatura riesce o l’effetto ha termine per essa, la " +
                        "creatura è immune all’Aureola di Orrore del demone gemente " +
                        "per le successive 24 ore.@" +
                        "Teletrasporto#Il demone si teletrasporta, insieme a tutto " +
                        "l’equipaggiamento che sta indossando o trasportando, in uno " +
                        "spazio non occupato che possa vedere fino a 36 metri di distanza",
                "",
                "",
                "freddo, fulmine, fuoco; contundente, " +
                        "perforante e tagliente di attacchi non magici",
                "veleno",
                "",
                "avvelenato",
                21,
                5,
                10,
                0,
                22,
                6,
                19,
                4,
                12,
                1,
                15,
                2,
                ""
            )
        )

        result.add(
            Monster("Quasit",
                "Minuscola",
                "immondo (demone, mutaforma)",
                "caotico malvagio",
                7,
                "(3d4)",
                13,
                "",
                "12 m (3 m, volo 12 m in forma di pipistrello; 12 m, " +
                        "scalata 12 m in forma di centopiedi; 12 m, nuoto 12 m in forma " +
                        "di rospo)",
                1.0,
                200,
                "",
                "Furtività +5",
                "scurovisione 36 m, Percezione passiva 10",
                "Abissale, Comune",
                "Mutaforma#Il demone può usare la sua azione per trasformarsi " +
                        "in una forma bestiale da pipistrello, centopiedi o rospo, o per " +
                        "tornare alla sua vera forma. Le sue statistiche sono le stesse in " +
                        "tutte le forme, sebbene gli attacchi possano variare per alcune di " +
                        "esse. Qualsiasi equipaggiamento stia indossando o trasportando " +
                        "non viene trasformato. Alla morte ritorna alla sua vera forma.@" +
                        "Resistenza alla Magia#Il demone ha vantaggio ai tiri salvezza " +
                        "contro incantesimi e altri effetti magici.",
                "Artigli (Morso in Forma di Bestia)#Attacco con arma da " +
                        "mischia: +4 a colpire, portata 1,5 m, un bersaglio. " +
                        "Colpisce: 5 (1d4 + 3) danni perforanti. Se il bersaglio è una " +
                        "creatura, deve riuscire un tiro salvezza di Costituzione CD 10 o " +
                        "subire 5 (2d4) danni da veleno e restare avvelenato per 1 minuto. " +
                        "La creatura può ripetere il tiro salvezza al termine di ciascun suo " +
                        "turno, ponendo termine all’effetto se lo riesce.@" +
                        "Invisibilità#Il demone resta invisibile finché non attacca o " +
                        "termina la sua concentrazione. Qualsiasi cosa che il demone stia " +
                        "trasportando o indossando resta invisibile finché rimane in " +
                        "contatto con il demone.@" +
                        "Spavento (1/Giorno)#Una creatura scelta dal demone che si trovi " +
                        "entro 6 metri da lui, deve riuscire un tiro salvezza di Saggezza " +
                        "CD 10 o restare spaventata per 1 minuto. Il bersaglio può ripetere " +
                        "il tiro salvezza al termine di ciascun suo turno, con svantaggio se " +
                        "il demone è in linea di visuale, ponendo termine all’effetto " +
                        "prematuramente se riesce il tiro salvezza.",
                "",
                "",
                "freddo, fulmine, fuoco; contundente, " +
                        "perforante e tagliente di attacchi non magici",
                "veleno",
                "",
                "avvelenato",
                5,
                -3,
                17,
                3,
                10,
                0,
                7,
                -2,
                10,
                0,
                10,
                0,
                ""
            )
        )

        result.add(
            Monster("Vrock",
                "Grande",
                "immondo (demone)",
                "caotico malvagio",
                104,
                "(11d10 + 44)",
                15,
                "(armatura naturale)",
                "12 m, volo 18 m",
                6.0,
                2300,
                "Destrezza +5, Saggezza +4, Carisma +2",
                "",
                "scurovisione 36 m, Percezione passiva 11",
                "Abissale, telepatia 36 m",
                "Resistenza alla Magia#Il demone ha vantaggio ai tiri salvezza " +
                        "contro incantesimi e altri effetti magici.",
                "Multiattacco#Il demone effettua due attacchi: uno con il becco e " +
                        "uno con gli speroni.@" +
                        "Becco#Attacco con arma da mischia: +6 a colpire, portata 1,5 m, " +
                        "un bersaglio. " +
                        "Colpisce: 10 (2d6 + 3) danni perforanti.@" +
                        "Speroni#Attacco con arma da mischia: +6 a colpire, portata 1,5 " +
                        "m, un bersaglio. " +
                        "Colpisce: 14 (2d10 + 3) danni taglienti.@" +
                        "Spore (Ricarica 6)#Una nube di spore tossiche si diffonde in un " +
                        "raggio di 4,5 metri intorno al demone. Le spore si propagano " +
                        "intorno agli angoli. Ogni creatura in quell’area deve riuscire un " +
                        "tiro salvezza di Costituzione CD 14 o restare avvelenata. Mentre " +
                        "è avvelenato in questo modo, un bersaglio subisce 5 (1d10) danni " +
                        "da veleno all’inizio di ciascun suo turno. Il bersaglio può ripetere " +
                        "il tiro salvezza al termine di ciascun suo turno, ponendo termine " +
                        "all’effetto se lo riesce. Anche svuotare una fiala di acqua sacra " +
                        "sul bersaglio pone termine all’effetto.@" +
                        "Strillo Stordente (1/Giorno)#Il demone emette uno strillo " +
                        "orripilante. Ogni creatura entro 6 metri da esso e che lo possa " +
                        "udire, e non sia un demone, deve riuscire un tiro salvezza di " +
                        "Costituzione CD 14 o restare stordita fino al termine del " +
                        "prossimo turno del demone.",
                "",
                "",
                " freddo, fulmine, fuoco; contundente, " +
                        "perforante e tagliente di attacchi non magici",
                "veleno",
                "",
                "avvelenato",
                17,
                3,
                15,
                2,
                18,
                4,
                8,
                -1,
                13,
                1,
                8,
                -1,
                ""
            )
        )

        result.add(
            Monster("Destriero da Incubo",
                "Grande",
                "immondo",
                "neutrale malvagio",
                68,
                "(8d10 + 24)",
                13,
                "(armatura naturale)",
                "18 m, volo 24 m",
                3.0,
                700,
                "",
                "",
                "Percezione passiva 11",
                "comprende Abissale, Comune e Infernale ma non può " +
                        "parlare",
                "Conferire Resistenza al Fuoco#Il destriero da incubo può " +
                        "conferire resistenza al danno da fuoco a chiunque lo cavalchi.@" +
                        "Illuminazione#Il destriero da incubo irradia luce intensa in un " +
                        "raggio di 3 metri e luce fioca per ulteriori 3 metri.",
                "Zoccoli#Attacco con arma da mischia: +6 a colpire, portata 1,5 " +
                        "m, un bersaglio. " +
                        "Colpisce: 13 (2d8 + 4) danni contundenti più 7 (2d6) danni da " +
                        "fuoco.@" +
                        "Passo Etereo#Il destriero da incubo e fino a tre creature " +
                        "consenzienti entro 1,5 metri da esso possono entrare " +
                        "magicamente nel Piano Etereo dal Piano Materiale e viceversa.",
                "",
                "",
                "",
                "",
                "",
                "",
                18,
                4,
                15,
                2,
                16,
                3,
                10,
                0,
                13,
                1,
                15,
                2,
                ""
            )
        )

        result.add(
            Monster("Diavolo Barbuto",
                "Media",
                "immondo (diavolo)",
                "legale malvagio",
                52,
                "(8d8 + 16)",
                13,
                "(armatura naturale)",
                "9 m",
                3.0,
                700,
                "Forza +5, Costituzione +4, Saggezza +2",
                "",
                "scurovisione 36 m, Percezione passiva 10",
                "Infernale, telepatia 36 m",
                "Resistenza alla Magia#Il diavolo ha vantaggio ai tiri salvezza " +
                        "contro incantesimi e altri effetti magici.@" +
                        "Risoluto#Il diavolo non può essere spaventato finché riesce a " +
                        "vedere una creatura alleata entro 9 metri da lui.@" +
                        "Vista del Diavolo#La scurovisione del diavolo non è limitata " +
                        "dall’oscurità magica.",
                "Multiattacco#Il diavolo effettua due attacchi: uno con la barba e " +
                        "uno con il falcione.@" +
                        "Barba#Attacco con arma da mischia: +5 a colpire, portata 1,5 m, " +
                        "una creatura. " +
                        "Colpisce: 6 (1d8 + 2) danni perforanti, e il bersaglio deve " +
                        "riuscire un tiro salvezza di Costituzione CD 12 o restare " +
                        "avvelenato per 1 minuto. Mentre è avvelenato in questo modo, il " +
                        "bersaglio non può recuperare punti ferita. Il bersaglio può " +
                        "ripetere il tiro salvezza al termine di ciascun suo turno, " +
                        "terminando l’effetto se riesce il tiro salvezza.@" +
                        "Falcione#Attacco con arma da mischia: +5 a colpire, portata 3 " +
                        "m, un bersaglio. " +
                        "Colpisce: 8 (1d10 + 3) danni taglienti. Se il bersaglio è una " +
                        "creatura, ad esclusione di costrutti e non morti, deve riuscire un " +
                        "tiro salvezza di Costituzione CD 12 o perdere 5 (1d10) punti " +
                        "ferita all’inizio di ciascun suo turno a causa della ferita infernale. " +
                        "Ogni volta che il diavolo colpisce il bersaglio ferito con questo " +
                        "attacco, il danno inflitto dalla ferita aumenta di 5 (1d10). " +
                        "Qualsiasi creatura può effettuare un’azione per bloccare la ferita " +
                        "con una prova riuscita di Saggezza (Medicina) CD 12. La ferita " +
                        "si richiude anche nel caso in cui il bersaglio riceva della magia " +
                        "guaritrice.",
                "",
                "",
                "freddo; contundente, perforante e tagliente " +
                        "di attacchi non magici che non siano argentati",
                "fuoco, veleno",
                "",
                "avvelenato",
                16,
                3,
                15,
                2,
                15,
                2,
                9,
                -1,
                11,
                0,
                11,
                0,
                ""
            )
        )

        // todo continuare da "Diavolo delle Catene"

        return result
    }
}