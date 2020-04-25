package liste.base

import sqlite.Item

class OggettiMagiciBase {

    constructor()

    fun getOggettiBase(): List<Item> {
        var result: MutableList<Item> = mutableListOf()
        result.add(
            Item(
                "Ali del Volo",
                "Mentre indossi questa cappa, puoi usare un’azione per pronunciare la sua parola di comando, trasformandola in un paio di ali da pipistrello o da uccello che spuntano dalla tua schiena per 1 ora o finché non ripeti la parola di comando con un’azione. Le ali ti forniscono velocità di volo 18 metri. Quando scompaiono, non potrai più usarle per 1d12 ore.",
                "oggetto meraviglioso",
                0,
                "raro"
            )
        )
        result.add(
            Item(
                "Ammazza Draghi",
                "Ottieni un bonus di +1 ai tiri per colpire e danno effettuati con quest’arma magica. Quando colpisci un drago con quest’arma, il drago subisce 3d6 danni aggiuntivi del tipo dell’arma. Ai fini di quest’arma, “drago” è qualsiasi creatura del tipo drago",
                "arma (qualsiasi spada)",
                0,
                "raro"
            )
        )
        result.add(
            Item(
                "Ammazza Giganti",
                "Ottieni un bonus di +1 ai tiri per colpire e danno effettuati con quest’arma magica. Quando colpisci un gigante con quest’arma, il gigante subisce 2d6 danni aggiuntivi del tipo dell’arma e deve superare un tiro salvezza di Forza con CD 15 o cadere prono. Ai fini di quest’arma, “gigante” è qualsiasi creatura del tipo gigante.",
                "arma (qualsiasi ascia o spada)",
                0,
                "raro"
            )
        )
        result.add(
            Item(
                "Ampolla di Ferro",
                "Questa bottiglia di ferro ha un tappo di ottone. Puoi usare un’azione per" +
                        " pronunciare la parola di comando dell’ampolla, prendendo come bersaglio" +
                        " una creatura visibile entro 18 metri da te. Se il bersaglio è nativo di " +
                        "un piano di esistenza diverso da quello in cui ti trovi, deve superare un " +
                        "tiro salvezza di Saggezza con CD 17 o venir intrappolato nell’ampolla. Se " +
                        "il bersaglio è già stato intrappolato nell’ampolla, riceve vantaggio al tiro " +
                        "salvezza. Una volta intrappolata, la creatura rimarrà nell’ampolla finché " +
                        "non sarà liberata. L’ampolla può contenere solo una creatura alla volta. " +
                        "Una creatura intrappolata nell’ampolla non ha bisogno di respirare," +
                        "mangiare o dormire e non invecchia. Puoi usare un’azione per rimuovere" +
                        "il tappo dell’ampolla e liberare la creatura che contiene. La creatura sarà" +
                        " amichevole verso di te e i tuoi compagni per 1 ora e obbedirà ai vostri " +
                        "comandi per quella durata. Se non le impartisci comandi o gliene dai uno " +
                        "che provocherebbe la sua morte, si difenderà ma non compirà altre azioni." +
                        "Al termine della durata, la creatura agirà in base al suo normale comportamento" +
                        " e allineamento. L’incantesimo identificare rivela che una creatura si trova" +
                        " all’interno dell’ampolla, ma l’unico modo per determinare che sorta di " +
                        "creatura sia è di aprire l’ampolla. Un’ampolla di ferro appena scoperta " +
                        "potrebbe già contenere una creatura scelta dal GM o determinata casualmente. \n" +
                        "d100 Contiene\n" +
                        "1-50 Vuota\n" +
                        "51-54 Demone (tipo I)\n" +
                        "55-58 Demone (tipo II)\n" +
                        "59-62 Demone (tipo III)\n" +
                        "63-64 Demone (tipo IV)\n" +
                        "65 Demone (tipo V)\n" +
                        "66 Demone (tipo VI)\n" +
                        "67 Angelo Deva\n" +
                        "68-69 Diavolo (superiore)\n" +
                        "70-73 Diavolo (inferiore)\n" +
                        "74-75 Genio Djinni\n" +
                        "76-77 Genio Efreeti\n" +
                        "78-83 Elementale (qualsiasi)\n" +
                        "84-86 Persecutore invisibile\n" +
                        "87-90 Megera notturna\n" +
                        "91 Angelo Planetar\n" +
                        "92-95 Salamandra\n" +
                        "96 Angelo Solar\n" +
                        "97-99 Succube/Incubo\n" +
                        "100 Xorn\n",
                "oggetto meraviglioso",
                0,
                "leggendario"
            )
        )
        result.add(
            Item(
                "Amuleto dei Piani",
                "Richiede sintonia. Mentre indossi questo amuleto, puoi usare un’azione " +
                        "per nominare un luogo con cui sei familiare e che si trovi su di un altro " +
                        "piano di esistenza. Effettua una prova di Intelligenza con CD 15. Se la" +
                        " prova riesce, lanci l’incantesimo spostamento planare tramite l’amuleto." +
                        " Se la prova fallisce, tu e ciascuna creatura e oggetto entro 4,5 metri da" +
                        " te venite trasportati in una destinazione casuale. Tira un d20. Da 1 a 12" +
                        ", raggiungi una destinazione casuale sul piano che hai nominato. Da 13 a" +
                        " 20, raggiungi un piano dell’esistenza determinato casualmente.",
                "oggetto meraviglioso",
                0,
                "raro"
            )
        )
        result.add(
            Item(
                "Amuleto di Protezione dalla Individuazione e Localizzazione",
                "Richiede sintonia. Mentre indossi questo amuleto sei celato alla magia" +
                        " di divinazione. Non puoi essere preso come bersaglio da queste magie " +
                        "o percepito tramite sensori magici di scrutamento.",
                "oggetto meraviglioso",
                0,
                "non comune"
            )
        )
        result.add(
            Item(
                "Amuleto della Salute",
                "Richiede sintonia. Mentre indossi questo amuleto la tua Costituzione è " +
                        "19. L’amuleto non ha effetto se la tua Costituzione è già 19 o più alta.",
                "oggetto meraviglioso",
                0,
                "raro"
            )
        )
        result.add(
            Item(
                "Anello Accumula Incantesimi",
                "Richiede sintonia. Questo anello immagazzina gli incantesimi lanciati" +
                        "su di esso, conservandoli fino a che chi vi è in sintonia non ne faccia " +
                        "uso. L’anello può accumulare fino a 5 livelli di incantesimi alla volta." +
                        " Qualsiasi creatura può lanciare un incantesimo dal 1° al 5° livello " +
                        "sull’anello, toccandolo mentre lancia l’incantesimo. L’incantesimo non" +
                        " ha effetto, oltre quello di essere immagazzinato nell’anello. Se " +
                        "l’anello non può contenere l’incantesimo, lo slot incantesimo viene " +
                        "speso senza effetti. Il livello dello slot usato per lanciare" +
                        " l’incantesimo determina la quantità di spazio che occupa. Mentre " +
                        "indossi questo anello, puoi lanciare gli incantesimi che contiene. " +
                        "L’incantesimo usa il livello dello slot, la CD del tiro salvezza " +
                        "dell’incantesimo, il bonus per colpire dell’incantesimo e la caratteristica" +
                        " da incantatore dell’incantatore originale, ma per il resto è considerato " +
                        "come se fosse stato lanciato da te. Un incantesimo lanciato tramite questo " +
                        "anello non è più contenuto al suo interno, e libera spazio per altri incantesimi.",
                "anello",
                0,
                "raro"
            )
        )
        result.add(
            Item(
                "Anello dell’Ariete",
                "Richiede sintonia. Mentre indossi questo anello, puoi usare un’azione " +
                        "per spendere da 1 a 3 cariche per attaccare una creatura visibile entro " +
                        "18 metri da te. L’anello produce una testa di ariete spettrale ed " +
                        "effettua il suo tiro per colpire con un bonus di +7. Se colpisci, per" +
                        " ogni carica spesa, il bersaglio subisce 2d10 danni da forza e viene " +
                        "spinto di 1,5 metri lontano da te. In alternativa, puoi spendere da 1 a 3 " +
                        "cariche dell’anello con un’azione per tentare di rompere un oggetto" +
                        " visibile entro 18 metri da te che non sia indossato o trasportato." +
                        " L’anello effettua una prova di Forza con un bonus di +5 per ogni carica " +
                        "spesa. Questo anello ha 3 cariche, e recupera 1d3 cariche spese ogni " +
                        "mattina all’alba.",
                "anello",
                0,
                "raro"
            )
        )
        result.add(
            Item(
                "Anello di Caduta Morbida",
                "Richiede sintonia. Mentre cadi e indossi questo anello, scendi di 18 " +
                        "metri per round e non subisci danni dalla caduta.",
                "anello",
                0,
                "raro"
            )
        )
        result.add(
            Item(
                "Anello di Camminare sull’Acqua",
                "Mentre indossi questo anello, puoi stare in piedi o muoverti " +
                        "su qualsiasi superficie liquida come se fosse terreno solido.",
                "anello",
                0,
                "non comune"
            )
        )
        result.add(
            Item(
                "Anello del Calore",
                "Richiede sintonia. Mentre indossi questo anello, hai resistenza ai " +
                        "danni da freddo. Inoltre, tu e tutto quello che indossi e trasporti " +
                        "siete immuni agli effetti delle temperature basse fino a -45° C.",
                "anello",
                0,
                "non comune"
            )
        )
        result.add(
            Item(
                "Anello del Comando degli Elementali dell’Acqua",
                "Richiede sintonia. Questo anello è collegato al Piano Elementale " +
                        "dell’Acqua. Mentre lo indossi, hai vantaggio ai tiri per colpire contro " +
                        "gli elementali del Piano Elementale dell’Acqua, ed essi hanno svantaggio" +
                        " ai tiri per colpire effettuati contro di te. Puoi spendere 2 cariche" +
                        " dell’anello per lanciare dominare mostri su di un elementale dell’acqua." +
                        " Inoltre, puoi stare in piedi e camminare sulle superfici liquide come" +
                        " se fossero terreno solido. Puoi parlare e comprendere l’Aquan. Se aiuti" +
                        " a uccidere un elementale dell’acqua mentre sei in sintonia con l’anello," +
                        " ottieni accesso alle seguenti proprietà aggiuntive:  Puoi respirare " +
                        "sott’acqua e hai velocità di nuovo pari alla tua velocità di passeggio." +
                        "  Puoi lanciare tramite l’anello i seguenti incantesimi, spendendo " +
                        "il numero di cariche richieste: creare o distruggere acqua (1 carica)," +
                        " controllare tempo atmosferico (3 cariche), muro di ghiaccio (3 cariche)" +
                        " o tempesta di ghiaccio (2 cariche). L’anello ha 5 cariche. Recupera 1d4 " +
                        "+ 1 cariche ogni giorno all’alba. Gli incantesimi lanciati tramite" +
                        " l’anello hanno CD del tiro salvezza 17.",
                "anello",
                0,
                "leggendario"
            )
        )
        result.add(
            Item(
                "Anello del Comando degli Elementali dell’Aria",
                "Richiede sintonia. Questo anello è collegato al Piano Elementale" +
                        " dell’Aria. Mentre lo indossi, hai vantaggio ai tiri per colpire contro " +
                        "gli elementali del Piano Elementale dell’Aria, ed essi hanno svantaggio " +
                        "ai tiri per colpire effettuati contro di te. Puoi spendere 2 cariche dell’" +
                        "anello per lanciare dominare mostri su di un elementale dell’aria. Inoltre," +
                        " quando cadi, scendi di 18 metri per round e non subisci danni dalla caduta." +
                        " Puoi parlare e comprendere l’Auran. Se aiuti a uccidere un elementale dell’" +
                        "aria mentre sei in sintonia con l’anello, ottieni accesso alle seguenti " +
                        "proprietà aggiuntive:  Hai resistenza ai danni da fulmine.  Hai velocità " +
                        "di volo pari alla tua velocità di passeggio e puoi fluttuare.  Puoi lanciare " +
                        "tramite l’anello i seguenti incantesimi, spendendo il numero di cariche richieste: " +
                        "catena di fulmini (3 cariche), folata di vento (2 cariche) o muro di vento " +
                        "(1 carica). L’anello ha 5 cariche. Recupera 1d4 + 1 cariche ogni giorno all’" +
                        "alba. Gli incantesimi lanciati tramite l’anello hanno CD del tiro salvezza 17.",
                "anello",
                0,
                "leggendario"
            )
        )
        result.add(
            Item(
                "Anello del Comando degli Elementali del Fuoco",
                "Richiede sintonia. Questo anello è collegato al Piano Elementale del " +
                        "Fuoco. Mentre lo indossi, hai vantaggio ai tiri per colpire contro gli " +
                        "elementali del Piano Elementale del Fuoco, ed essi hanno svantaggio ai " +
                        "tiri per colpire effettuati contro di te. Puoi spendere 2 cariche dell’" +
                        "anello per lanciare dominare mostri su di un elementale del fuoco. " +
                        "Inoltre, hai resistenza ai danni da fuoco. Puoi parlare e comprendere " +
                        "l’Ignan. Se aiuti a uccidere un elementale del fuoco mentre sei in " +
                        "sintonia con l’anello, ottieni accesso alle seguenti proprietà aggiuntive: " +
                        " Hai immunità ai danni da fuoco.  Puoi lanciare tramite l’anello " +
                        "i seguenti incantesimi, spendendo il numero di cariche richieste: " +
                        "mani brucianti (1 carica), muro di fuoco (3 cariche) o palla di " +
                        "fuoco (2 cariche). L’anello ha 5 cariche. Recupera 1d4 + 1 cariche ogni " +
                        "giorno all’alba. Gli incantesimi lanciati tramite l’anello hanno CD del" +
                        " tiro salvezza 17.",
                "anello",
                0,
                "leggendario"
            )
        )
        result.add(
            Item(
                "Anello del Comando degli Elementali della Terra",
                "Richiede sintonia. Questo anello è collegato al Piano Elementale della " +
                        "Terra. Mentre lo indossi, hai vantaggio ai tiri per colpire contro gli elementali " +
                        "del Piano Elementale della Terra, ed essi hanno svantaggio ai tiri per colpire" +
                        " effettuati contro di te. Puoi spendere 2 cariche dell’anello per lanciare dominare" +
                        " mostri su di un elementale della terra. Inoltre, puoi muoverti su terreno " +
                        "difficile composto da macerie, pietre o terra come se fosse terreno normale. " +
                        "Puoi parlare e comprendere il Terran. Se aiuti a uccidere un elementale " +
                        "della terra mentre sei in sintonia con l’anello, ottieni accesso alle " +
                        "seguenti proprietà aggiuntive:  Hai resistenza ai danni da acido." +
                        "  Puoi muoverti attraverso la terra o la roccia solida come se fossero " +
                        "terreno difficile. Se vi termini il tuo turno, vieni proiettato fuori " +
                        "nello spazio non occupato più vicino che hai occupato per ultimo. " +
                        " Puoi lanciare tramite l’anello i seguenti incantesimi, spendendo il" +
                        " numero di cariche richieste: scolpire pietra (2 cariche), muro di pietra " +
                        "(3 cariche) o pelle di pietra (1 carica). L’anello ha 5 cariche. Recupera " +
                        "1d4 + 1 cariche ogni giorno all’alba. Gli incantesimi lanciati tramite " +
                        "l’anello hanno CD del tiro salvezza 17.",
                "anello",
                0,
                "leggendario"
            )
        )
        result.add(
            Item(
                "Anello di Elusione",
                "Richiede sintonia. Mentre indossi questo anello e fallisci un tiro " +
                        "salvezza di Destrezza, puoi usare la tua reazione per spendere 1 carica " +
                        "per riuscire il tiro salvezza che hai appena fallito. Questo anello ha 3 " +
                        "cariche, e recupera 1d3 cariche spese ogni mattina all’alba.",
                "anello",
                0,
                "raro"
            )
        )
        result.add(
            Item(
                "Anello dell’Evocazione dello Djinni",
                "Richiede sintonia. Mentre indossi quest’anello, puoi pronunciarne la" +
                        " parola di comando con un’azione per evocare uno specifico djinni del" +
                        " Piano Elementale dell’Aria. Lo djinni compare in uno spazio non occupato " +
                        "a tua scelta, entro 36 metri da te. Resta finché rimani concentrato " +
                        "(come se ti concentrassi su di un incantesimo), per un massimo di 1 ora," +
                        " o finché non scende a 0 punti ferita. Poi ritorna al suo piano natio. " +
                        "Finché resta evocato, lo djinni è amichevole verso di te e i tuoi compagni." +
                        " Obbedisce a qualsiasi comando gli dai, non importa la lingua usata. Se non " +
                        "gli impartisci ordini, lo djinni si difenderà dagli attacchi ma non effettuerà " +
                        "nessun’altra azione. Dopo la partenza dello djinni, esso non potrà più essere " +
                        "evocato prima che siano passate 24 ore, e se lo djinni muore l’anello perde" +
                        " la sua magia.",
                "anello",
                0,
                "leggendario"
            )
        )
        result.add(
            Item(
                "Anello di Influenza sugli Animali",
                "Mentre indossi questo anello, puoi usare un’azione per spendere 1 delle " +
                        "sue cariche per lanciare tramite esso uno dei seguenti incantesimi: amicizia " +
                        "con gli animali (CD del tiro salvezza 13), parlare con gli animali, paura " +
                        "(CD del tiro salvezza 13, prende come bersaglio solo bestie che hanno " +
                        "Intelligenza 3 o meno). Questo anello ha 3 cariche, e recupera 1d3 " +
                        "cariche spese ogni giorno all’alba.",
                "anello",
                0,
                "raro"
            )
        )
        result.add(
            Item(
                "Anello di Invisibilità",
                "Richiede sintonia. Mentre indossi quest’anello, puoi renderti invisibile" +
                        " con un’azione. Tutto ciò che indossi o trasporti diventa invisibile assieme" +
                        " a te. Resti invisibile finché l’anello non viene rimosso, attacchi o " +
                        "lanci un incantesimo, o finché non usi un’azione bonus per tornare visibile.",
                "anello",
                0,
                "leggendario"
            )
        )
        result.add(
            Item(
                "Anello di Libertà di Azione",
                "Richiede sintonia. Mentre indossi questo anello, il terreno difficile" +
                        " non ti costa movimento aggiuntivo. Inoltre, la magia non può né ridurre" +
                        " la tua velocità né renderti paralizzato o intralciato.",
                "anello",
                0,
                "raro"
            )
        )
        result.add(
            Item(
                "Anello del Nuoto",
                "Mentre indossi questo anello, hai velocità di nuoto 12 metri.",
                "anello",
                0,
                "non comune"
            )
        )
        result.add(
            Item(
                "Anello di protezione",
                "Richiede sintonia. Mentre indossi questo anello, hai un bonus di +1" +
                        " alla CA e ai tiri salvezza.",
                "anello",
                0,
                "raro"
            )
        )
        result.add(
            Item(
                "Anello Respingi Incantesimi",
                "Richiede sintonia. Mentre indossi quest’anello, hai vantaggio ai" +
                        " tiri salvezza contro qualsiasi incantesimo che prende come bersaglio " +
                        "solo te e non un’area di effetto. Inoltre, se ottieni 20 sul tiro salvezza" +
                        " e l’incantesimo è di 7° livello o più basso, l’incantesimo non ha effetto " +
                        "su di te e invece prende come bersaglio l’incantatore, utilizzando il " +
                        "livello dello slot, la CD del tiro salvezza dell’incantesimo, il bonus " +
                        "per colpire e la caratteristica da incantatore dell’incantatore originale.",
                "anello",
                0,
                "legendario"
            )
        )
        result.add(
            Item(
                "Anello di Rigenerazione",
                "Richiede sintonia. Mentre indossi questo anello, recuperi 1d6 punti " +
                        "ferita ogni 10 minuti, purché ti rimanga almeno 1 punto ferita. Se perdi " +
                        "una parte del corpo, l’anello fa sì che la parte mancante ricresca e" +
                        " ritorni alla sua completa funzionalità in 1d6 + 1 giorni, purché " +
                        "per tutto il periodo ti rimanga sempre almeno 1 punto ferita.",
                "anello",
                0,
                "molto raro"
            )
        )
        result.add(
            Item(
                "Anello di Resistenza.",
                "Richiede sintonia. Mentre indossi questo anello, hai resistenza a un" +
                        " tipo di danno. La gemma incastonata nell’anello indica il tipo di danno, che viene scelto o determinato casualmente dal GM." +
                        "d10   Tipo danno Gemma\n" +
                        "1   Acido      Perla\n" +
                        "2   Forza      Zaffiro\n" +
                        "3   Freddo     Tormalina\n" +
                        "4   Fulmine    Citrino\n" +
                        "5   Fuoco      Granato\n" +
                        "6   Necrotico  Giaietto\n" +
                        "7   Psichico   Giada\n" +
                        "8   Radiante   Topazio\n" +
                        "9   Tuono      Spinello\n" +
                        "10  Veleno     Ametista\n",
                "anello",
                0,
                "raro"
            )
        )
        result.add(
            Item(
                "Anello del Salto",
                "Richiede sintonia. Mentre indossi questo anello, con un’azione bonus  " +
                        "puoi lanciare tramite esso l’incantesimo saltare a volontà, ma il" +
                        " bersaglio puoi essere solo tu.",
                "anello",
                0,
                "non comune"
            )
        )
        result.add(
            Item(
                "Anello dello Scudo Mentale",
                "Richiede sintonia. Mentre indossi questo anello, sei immune alla magia " +
                        "che permette alle altre creature di leggere i tuoi pensieri, determinare" +
                        " se stai mentendo, conoscere il tuo allineamento, o apprendere che tipo di " +
                        "creatura sei. Le creature possono comunicare telepaticamente con te solo se" +
                        " glielo concedi. Puoi usare un’azione per far diventare invisibile l’anello" +
                        " fino a che un’altra azione non lo renderà di nuovo visibile, finché non " +
                        "lo rimuovi o muori. Se muori mentre indossi questo anello, la tua anima vi" +
                        " viene catturata, a meno che non ospiti già un’altra anima. Puoi decidere " +
                        "di rimanere nell’anello o raggiungere la vita ultraterrena. Finché la tua " +
                        "anima resta nell’anello, puoi comunicare telepaticamente con qualsiasi" +
                        " creatura lo indossi. Chi lo indossa non può impedire questa forma di" +
                        " comunicazione telepatica.",
                "anello",
                0,
                "non comune"
            )
        )
        result.add(
            Item(
                "Anello delle Stelle Cadenti",
                "Richiede sintonia all’esterno di notte. Mentre indossi questo anello " +
                        "a luce fioca o all’oscurità, puoi lanciare tramite esso luci danzanti e" +
                        " luce a volontà. Lanciare uno dei due incantesimi tramite l’anello richiede" +
                        " un’azione. L’anello ha 6 cariche per le seguenti altre proprietà. L’anello" +
                        " recupera 1d6 cariche spese ogni giorno all’alba. Luminescenza. Spendi 1 " +
                        "carica con un’azione per lanciare tramite l’anello luminescenza. Palla di" +
                        " Fulmini. Puoi spendere 2 cariche con un’azione per creare da una a quattro" +
                        " sfere di fulmini di 1 metro di diametro. Più sfere crei, meno potente " +
                        "sarà ciascuna sfera individualmente. Ogni sfera compare in uno spazio non " +
                        "occupato visibile entro 36 metri da te. La sfera dura finché ti concentri " +
                        "su di essa (come se ti concentrassi su di un incantesimo), fino a un " +
                        "massimo di 1 minuto. Ogni sfera irradia luce fioca in un raggio di 9 metri." +
                        " Con un’azione bonus, puoi muovere ciascuna sfera di massimo 9 metri, ma" +
                        " senza superare i 36 metri di distanza da te. Quando una creatura, a parte " +
                        "te, si trova entro 1,5 metri da una sfera, la sfera scarica i fulmini contro" +
                        " quella creatura e poi scompare. Quella creatura deve effettuare un tiro" +
                        " salvezza di Destrezza con CD 15. Se fallisce il tiro salvezza, la creatura" +
                        " subisce danni da fulmine in base al numero di sfere da te creato (4 sfere," +
                        " 2d4 danni; 3 sfere, 2d6 danni; 2 sfere, 5d4 danni; 1 sfera, 4d12 danni)." +
                        " Stelle Cadenti. Puoi spendere da 1 a 3 cariche con un’azione. Per ogni" +
                        " carica spesa, scagli un scintilla di luce dall’anello in un punto visibile " +
                        "entro 18 metri da te. Ogni creatura, in cubo di 4,5 metri di lato originante " +
                        "da quel punto, viene ricoperta di scintille e deve effettuare un tiro " +
                        "salvezza di Destrezza CD 15, subendo 5d4 danni da fuoco se lo fallisce," +
                        " o la metà di questi danni se lo supera.",
                "anello",
                0,
                "molto raro"
            )
        )
        result.add(
            Item(
                "Anello di Telecinesi",
                "Richiede sintonia. Mentre indossi questo anello, " +
                        "puoi lanciare a volontà l’incantesimo telecinesi, ma puoi prendere" +
                        " come bersaglio solo oggetti che non siano indossati o trasportati.",
                "anello",
                0,
                "molto raro"
            )
        )
        result.add(
            Item(
                "Anello dei Tre Desideri",
                "Mentre indossi quest’anello, puoi usare un’azione per " +
                        "spendere 1 delle sue 3 cariche per lanciare tramite esso l’incantesimo desiderio." +
                        " L’anello perde la sua magia quando usi l’ultima carica.",
                "anello",
                0,
                "leggendario"
            )
        )
        result.add(
            Item(
                "Anello della Vista ai Raggi X",
                "Richiede sintonia. Mentre indossi questo anello, puoi usare un’azione" +
                        " per pronunciarne la parola di comando. Quando lo fai, puoi vedere attraverso" +
                        " la materia solida per 1 minuto. Questa vista ha un raggio di 9 metri. " +
                        "Per te, gli oggetti solidi all’interno del raggio appaiono trasparenti e " +
                        "non impediscono alla luce di attraversarli. Questa vista può penetrare " +
                        "30 centimetri di pietra, 2,5 centimetri di metallo comune o fino a 90 " +
                        "centimetri di legno o terra. Le sostanze più dense bloccano la vista," +
                        " così come un sottile foglio di piombo. Ogni qualvolta usi di nuovo " +
                        "l’anello prima di aver terminato un riposo lungo, devi superare un " +
                        "tiro salvezza di Costituzione con CD 15 o guadagnare un livello di" +
                        " sfinimento.",
                "anello",
                0,
                "raro"
            )
        )
        result.add(
            Item(
                "Apparato del Granchio",
                "Quest’oggetto appare come un barile di ferro sigillato di taglia " +
                        "Grande e del peso di 250 chili. Il barile nasconde un fermo, che" +
                        " può essere trovato superando una prova di Intelligenza ( Indagare " +
                        ") con CD 20. Rimuover e il fermo apre uno scomparto a una delle estremità " +
                        "dell’apparato, che permette a due creature di taglia Media o inferiore di " +
                        "entrarvi dentro. All’estremità opposta sono disposte dieci leve, ciascuna " +
                        "in posizione neutrale, in grado d i muoversi verso l’alto o il basso. " +
                        "Quando vengono impiegate determinate leve, l’appar ato si trasforma e " +
                        "assomiglia a un’aragosta gigante. L’apparato è un oggetto Grande con " +
                        "le seguenti statistiche." +
                        "Classe Armatura: 20 Punti\n" +
                        "Ferita: 200\n" +
                        "Velocità: 9 m\n" +
                        "nuoto 9 m (o 0 m entrambi se le gambe e la coda non vengono estese)\n" +
                        "Immunità ai Danni: psichico, veleno\n" + "Per essere usato come veicolo, " +
                        "l’apparato necessita un pilota. Quando lo sportello dell’apparato viene" +
                        " chiuso, il compartimento è a tenuta stagna, e non fa filtrare aria o " +
                        "acqua. I compartimenti conservano aria sufficiente per 10 ore, divise " +
                        "per il numero di creature all’interno. L’apparato galleggia in acqua e" +
                        " può anche spingersi sott’acqua fino a una profondità di 270 metri." +
                        " Al di sotto di questa soglia, l’apparato subisce 2d6 danni contundenti " +
                        "al minuto a causa della pressione. Una creatura all’interno del " +
                        "compartimento può usare un’azione per muovere verso l’alto o il " +
                        "basso fino a due leve. Dopo ciascun uso, la leva torna alla sua" +
                        " posizione neutrale. Ogni leva, da sinistra a destra, funziona " +
                        "come mostrato sulla tabella seguente." +
                        "Leva Alto Basso\n" +
                        "1 Estende gambe e coda, permettendo all’apparato di camminare e nuotare." +
                        " Ritrae gambe e coda, riducendo la velocità dell’apparato a 0 e " +
                        "rendendolo incapace di beneficiare di bonus alla velocità.\n" +
                        "2 Apre l’oblò frontale. Chiude l’oblò frontale.\n" +
                        "3  Apre gli oblò laterali (due per lato). Chiude gli oblò laterali (due per lato).\n" +
                        "4 Estende due chele dal lato frontale dell’apparato. Ritrae le chele.\n" +
                        "5 Effettua un attacco con arma da mischia con ciascuna chela estesa: +8 al " +
                        "tiro per colpire, portata 1,5 m, un bersaglio. Colpisce: 7 (2d6) danni " +
                        "contundenti. Effettua un attacco con arma da mischia con ciascuna che la " +
                        "estesa: +8 al tiro per colpire, portata 1,5 m, un bersaglio. Colpisce: " +
                        "Il bersaglio è afferrato (CD 15 per fuggire).\n" +
                        "6 L’apparato cammina o nuota in avanti. L’apparato cammina o nuota indietro.\n" +
                        "7 L’apparato svolta di 90 gradi a sinistra. L’apparato svolta di 90 gradi a destra.\n" +
                        "8 Delle fessure frontali emettono luce intensa in un raggio di 9 metri e " +
                        "luce fioca per ulteriori 9 metri. Spegne le luci.\n" +
                        "9 L’apparato affonda di 6 metri nei liquidi. L’apparato risale di 6 metri dai liquidi.\n" +
                        "10 Sblocca e apre il portellone posteriore. Chiude e sigilla il portellone posteriore.\n",
                "Oggetto meraviglioso",
                0,
                "leggendario"
            )
        )
        result.add(
            Item(
                "Arco del Giuramento",
                "Richiede sintonia. Quando incocchi una freccia con questo arco, essa " +
                        "sussurra in Elfico “Rapida sconfitta ai miei nemici!”. Quando usi " +
                        "quest’arma per effettuare un attacco a distanza puoi, come parola di" +
                        " comando, dire “Rapida morte a te che mi hai recato torto!” Il bersaglio " +
                        "del tuo attacco diventa il tuo nemico giurato fino alla sua morte o all’" +
                        "alba del settimo giorno successivo. Puoi avere solo un nemico giurato" +
                        " alla volta. Quando il tuo nemico giurato muore, potrai sceglierne " +
                        "uno nuovo dopo la prossima alba. Quando effettui un tiro per colpire " +
                        "a distanza con quest’arma contro il tuo nemico giurato, hai vantaggio " +
                        "sul tiro. Inoltre, il bersaglio non riceve alcun beneficio dalla copertura" +
                        " che non sia una copertura totale, e non soffri svantaggio a causa della" +
                        " gittata lunga. Se l’attacco colpisce, il tuo nemico giurato subisce 3d6 danni" +
                        " perforanti. Finché il tuo nemico giurato è vivo, hai svantaggio al tiro " +
                        "per colpire con tutte le altre armi.",
                "arma (arco lungo)",
                0,
                "molto raro"
            )
        )
        result.add(
            Item(
                "Arma +1",
                "Hai un bonus ai tiri per colpire e ai tiri di danno effettuati con " +
                        "quest’arma. Il bonus è determinato dalla rarità dell’arma. Alcune armi " +
                        "magiche (in particolare le spade) possiedono delle ulteriori proprietà," +
                        " come l’emettere luce.",
                "arma (qualsiasi)",
                0,
                "non comune"
            )
        )
        result.add(
            Item(
                "Arma +2",
                "Hai un bonus ai tiri per colpire e ai tiri di danno effettuati con " +
                        "quest’arma. Il bonus è determinato dalla rarità dell’arma. Alcune armi " +
                        "magiche (in particolare le spade) possiedono delle ulteriori proprietà, " +
                        "come l’emettere luce.",
                "arma (qualsiasi)",
                0,
                "raro"
            )
        )
        result.add(
            Item(
                "Arma +3",
                "Hai un bonus ai tiri per colpire e ai tiri di danno effettuati con " +
                        "quest’arma. Il bonus è determinato dalla rarità dell’arma. Alcune armi " +
                        "magiche (in particolare le spade) possiedono delle ulteriori proprietà, " +
                        "come l’emettere luce.",
                "arma (qualsiasi)",
                0,
                "molto raro"
            )
        )
        result.add(
            Item(
                "Arma Perfida",
                "Quando ottieni 20 al tiro per colpire con quest’arma magica, " +
                        "il bersaglio subisce 7 danni aggiuntivi del tipo dell’arma.",
                "arma (qualsiasi)",
                0,
                "raro"
            )
        )
        result.add(
            Item(
                "Armatura +1",
                "Mentre indossi questa armatura ricevi un bonus alla tua Classe Armatura." +
                        " Il bonus è determinato dalla rarità dell’armatura.",
                "armatura (leggera, media o pesante)",
                0,
                "raro"
            )
        )
        result.add(
            Item(
                "Armatura +2",
                "Mentre indossi questa armatura ricevi un bonus alla tua Classe " +
                        "Armatura. Il bonus è determinato dalla rarità dell’armatura.",
                "armatura (leggera, media o pesante)",
                0,
                "molto raro"
            )
        )
        result.add(
            Item(
                "Armatura +3",
                "Mentre indossi questa armatura ricevi un bonus alla tua Classe Armatura." +
                        " Il bonus è determinato dalla rarità dell’armatura.",
                "armatura (leggera, media o pesante)",
                0,
                "leggendario"
            )
        )
        result.add(
            Item(
                "Armatura di Adamantio",
                "Mentre la indossi, qualsiasi colpo critico che subisci " +
                        "diventa un colpo normale.",
                "armatura (media o pesante, ma non di pelle)",
                0,
                "non comune"
            )
        )
        result.add(
            Item(
                "Armatura di Cuoio Borchiato Elegante",
                "Mentre la indossi, ottieni un bonus di +1 alla CA. Puoi anche usare " +
                        "un’azione bonus per pronunciare la parola di comando dell’armatura e far " +
                        "sì che l’armatura assuma l’aspetto di un comune abito o qualche altro tipo" +
                        " di armatura. Decidi tu l’aspetto, compreso il colore, lo stile e gli " +
                        "accessori, ma l’armatura mantiene il suo normale ingombro e peso. " +
                        "L’aspetto illusorio dura finché non usi di nuovo questa proprietà o" +
                        " ti togli l’armatura.",
                "armatura (cuoio borchiato)",
                0,
                "raro"
            )
        )
        result.add(
            Item(
                "Armatura Demoniaca",
                "Richiede sintonia. Mentre la indossi, ottieni un bonus di +1 alla CA," +
                        " e puoi comprendere e parlare l’Abissale. Inoltre, le manopole artigliate " +
                        "dell’armatura trasformano i colpi disarmati effettuati con le tue mani in" +
                        " armi magiche che infliggono danni taglienti, con un bonus di +1 ai tiri " +
                        "per colpire e ai tiri di danno e il d8 come dado di danno. Maledizione." +
                        " Una volta indossata questa armatura maledetta, non potrai più rimuoverla" +
                        " a meno che non diventi bersaglio dell’incantesimo rimuovi maledizione o " +
                        "una simile magia. Mentre indossi questa armatura, hai svantaggio ai tiri " +
                        "per colpire contro i demoni e ai tiri salvezza contro i loro incantesimi" +
                        " e capacità speciali.",
                "armatura (di piastre)",
                0,
                "molto raro"
            )
        )
        result.add(
            Item(
                "Armatura di Maglia Elfica",
                "Mentre la indossi, ottieni un bonus di +1 alla CA. Sei considerato " +
                        "competente con quest’armatura anche se non sei competente con le armature" +
                        " medie.",
                "armatura (giaco di maglia)",
                0,
                "raro"
            )
        )
        result.add(
            Item(
                "Armatura di Mithral",
                "Il mithral è un metallo leggero e flessibile. Un giaco di maglia o un" +
                        " pettorale di mithral possono essere indossati sotto abiti normali. Se l’" +
                        "armatura normalmente impone svantaggio alle prove di Destrezza (Furtività)" +
                        " o richiede un requisito di Forza, la versione in mithral dell’armatura non lo fa.",
                "armatura (media o pesante, ma non di pelle)",
                0,
                "non comune"
            )
        )
        result.add(
            Item(
                "Armatura di Piastre dell’Eterealità",
                "Richiede sintonia. Mentre la indossi, con un’azione puoi pronunciare la " +
                        "sua parola di comando per ottenere l’effetto dell’incantesimo forma eterea" +
                        " che dura 10 minuti o finché non rimuovi l’armatura o usi un’azione per " +
                        "pronunciare di nuovo la parola di comando. Questa proprietà dell’armatura " +
                        "non può essere usata di nuovo fino alla prossima alba.",
                "armatura (di piastre)",
                0,
                "leggendario"
            )
        )
        result.add(
            Item(
                "Armatura di Piastre dell’Invulnerabilità",
                "Mentre indossi questa armatura hai resistenza ai danni non magici. Inoltre, " +
                        "puoi usare un’azione per renderti immune ai danni non magici per 10 minuti" +
                        " o fino a che non starai più indossando questa armatura. Una volta usata " +
                        "l’armatura in questo modo, non potrai più usarla così fino alla prossima alba.",
                "armatura (di piastre)",
                0,
                "leggendario"
            )
        )
        result.add(
            Item(
                "Armatura di Piastre Nanica",
                "Mentre la indossi, ottieni un bonus di +2 alla CA. Inoltre, se un effetto" +
                        " ti muove sul terreno contro la tua volontà, puoi usare la tua reazione" +
                        " per ridurre di 3 metri la distanza di cui sei mosso.",
                "armatura (di piastre)",
                0,
                "molto raro"
            )
        )
        result.add(
            Item(
                "Armatura di Resistenza",
                "Richiede sintonia. Mentre la indossi, hai resistenza ad un tipo di danno." +
                        " Il GM sceglie il tipo tra le opzioni seguenti: acido, forza, freddo, " +
                        "fulmine, fuoco, necrotico, psichico, radiante, tuono o veleno.",
                "armatura (leggera, media o pesante)",
                0,
                "raro"
            )
        )
        result.add(
            Item(
                "Armatura di Scaglie di Drago",
                "Richiede sintonia. L’armatura di scaglie di drago è fatta con le scaglie" +
                        " di una specie di drago. Mentre la indossi, ottieni un bonus di +1 alla CA," +
                        " hai vantaggio ai tiri salvezza contro la Presenza Spaventosa e le armi a" +
                        " soffio dei draghi, e hai resistenza a un tipo di danno determinato dalla " +
                        "specie di drago che ha fornito le scaglie (Argento/freddo, Bianco/freddo," +
                        " Blu/fulmine, Bronzo/fulmine, Nero/acido, Oro/fuoco, Ottone/fuoco," +
                        " Rame/acido, Rosso/fuoco, Verde/veleno). Inoltre, con un’azione puoi " +
                        "focalizzare i tuoi sensi per determinare magicamente la distanza e" +
                        " la direzione in cui si trovi il drago più vicino entro 45 chilometri " +
                        "che sia della stessa specie dell’armatura. Quest’azione speciale non " +
                        "può essere più usata fino alla prossima alba.",
                "armatura (di scaglie)",
                0,
                "molto raro"
            )
        )
        result.add(
            Item(
                "Armatura di Vulnerabilità",
                "Richiede sintonia. Mentre la indossi, hai resistenza a uno dei seguenti " +
                        "ipi di danno: contundente, perforante o tagliente. Il GM sceglie il tipo." +
                        " Maledizione. L’armatura è maledetta, cosa che viene rivelata solo quando" +
                        " le viene lanciato sopra l’incantesimo identificare o vi entri in sintonia." +
                        " Entrare in sintonia con l’armatura ti maledice fino a quando non sarai " +
                        "bersaglio dell’incantesimo rimuovi maledizione o simili magie: rimuovere" +
                        " l’armatura non pone fine alla maledizione. Mentre sei maledetto, hai " +
                        "vulnerabilità a due dei tre tipi di danno associati con l’armatura " +
                        "(che non siano quello a cui hai resistenza).",
                "armatura (di piastre)",
                0,
                "raro"
            )
        )
        result.add(
            Item(
                "Ascia del Berserker",
                "Richiede sintonia. Hai un bonus di +1 ai tiri per colpire e ai tiri" +
                        " di danno effettuati con quest’arma magica. Inoltre, mentre sei in sintonia " +
                        "con quest’arma, i tuoi punti ferita massimi aumentano di 1 per ogni livello " +
                        "di esperienza che possiedi. Maledizione. L’ascia è maledetta, ed entrare " +
                        "in sintonia con essa estende la maledizione anche a te. Finché rimani " +
                        "maledetto, non vorrai separarti dall’ascia, tenendola sempre a portata." +
                        " Inoltre hai svantaggio ai tiri per colpire con armi diverse da questa," +
                        " a meno che non ci sia alcun avversario che tu possa vedere o sentire nel" +
                        " giro di 18 metri da te. Ogni qualvolta una creatura ostile ti danneggi " +
                        "mentre l’ascia è in tuo possesso, devi superare un tiro salvezza di" +
                        " Saggezza con CD 15 o entrare in berserk. Mentre sei in berserk, ogni " +
                        "round devi usare la tua azione per attaccare con l’ascia la creatura che " +
                        "si trovi più vicina a te. Se puoi effettuare attacchi extra come parte " +
                        "della tua azione Attaccare, puoi usare questi attacchi extra e muoverti " +
                        "per attaccare la creatura più vicina dopo aver abbattuto il primo bersaglio." +
                        " Se hai a disposizione più bersagli possibili, ne attacchi uno a caso. " +
                        "esti in berserk fino a che non inizi un turno senza creature visibili o " +
                        "udibili entro 18 metri da te.",
                "arma (qualsiasi ascia)",
                0,
                "raro"
            )
        )
        result.add(
            Item(
                "Bacchetta dei Dardi Incantati",
                "Mentre impugni questa bacchetta, puoi usare un’azione per spendere 1 o" +
                        " più delle sue cariche per lanciare tramite essa l’incantesimo dardo " +
                        "incantato. Per 1 carica, lanci l’incantesimo come se avessi usato uno" +
                        " slot di 1° livello, e incrementi il livello dello slot incantesimo di" +
                        " uno per ogni carica aggiuntiva che spendi. Questa bacchetta ha 7 cariche." +
                        " La bacchetta recupera 1d6 + 1 cariche spese all’alba di ciascun giorno. " +
                        "Tuttavia, se spendi l’ultima carica della bacchetta, tira un d20. Se ottieni" +
                        " 1, la bacchetta si riduce in polvere ed è distrutta.",
                "bacchetta",
                0,
                "non comune"
            )
        )
        result.add(
            Item(
                "Bacchetta dei Fulmini",
                "Richiede sintonia da parte di un incantatore. Mentre impugni questa bacchetta," +
                        " puoi usare un’azione per spendere 1 o più cariche per lanciare tramite essa" +
                        " l’incantesimo fulmine (CD del tiro salvezza 15). Per 1 carica, puoi " +
                        "lanciare la versione di 3° livello dell’incantesimo. Puoi aumentare lo " +
                        "slot incantesimo di uno per ogni ulteriore carica spesa. Questa bacchetta " +
                        "ha 7 cariche. La bacchetta recupera 1d6 + 1 cariche spese all’alba di ciascun " +
                        "giorno. Tuttavia, se spendi l’ultima carica della bacchetta, tira un d20. " +
                        "Se ottieni 1, la bacchetta si riduce in polvere ed è distrutta.",
                "bacchetta",
                0,
                "raro"
            )
        )
        result.add(
            Item(
                "Bacchetta di Individuazione del Magico",
                "Mentre impugni questa bacchetta, con un’azione puoi spendere 1 carica per" +
                        " lanciare tramite essa l’incantesimo individuazione del magico. Questa " +
                        "bacchetta ha 3 cariche, e recupera 1d3 cariche spese ogni mattina all’alba.",
                "bacchetta",
                0,
                "non comune"
            )
        )
        result.add(
            Item(
                "Bacchetta di Individuazione dei Nemici",
                "Richiede sintonia. Mentre impugni questa bacchetta, puoi usare un’azione" +
                        " e spendere 1 carica per pronunciarne la parola di comando. Per il minuto" +
                        " successivo, conosci in che direzione si trovi la creatura ostile più vicina" +
                        " entro 18 metri da te, ma non la distanza che vi separa. La bacchetta può" +
                        " percepire la presenza di creature ostili che siano eteree, invisibili, " +
                        "camuffate, o nascoste, oltre che di quelle in piena vista. L’effetto termina " +
                        "se smetti di impugnare la bacchetta. Questa bacchetta ha 7 cariche." +
                        " La bacchetta recupera 1d6 + 1 cariche spese all’alba di c iascun giorno." +
                        " Tuttavia, se spendi l’ultima carica della bacchetta, tira un d20. Se " +
                        "ottieni 1, la bacchetta si riduce in polvere ed è distrutta.",
                "bacchetta",
                0,
                "raro"
            )
        )
        result.add(
            Item(
                "Bacchetta del Mago da Guerra",
                "Richiede sintonia da parte di un incantatore. Mentre impugni questa" +
                        " bacchetta, ottieni un bonus ai tiri per colpire con gli incantesimi" +
                        " determinato dalla rarità della bacchetta. Inoltre, ignori metà" +
                        " copertura quando effettui un attacco con incantesimo.",
                "bacchetta",
                0,
                "non comune"
            )
        )
        result.add(
            Item(
                "Bacchetta del Mago da Guerra",
                "Richiede sintonia da parte di un incantatore. Mentre impugni questa" +
                        " bacchetta, ottieni un bonus ai tiri per colpire con gli incantesimi " +
                        "determinato dalla rarità della bacchetta. Inoltre, ignori metà" +
                        " copertura quando effettui un attacco con incantesimo.",
                "bacchetta",
                0,
                "raro"
            )
        )
        result.add(
            Item(
                "Bacchetta del Mago da Guerra",
                "Richiede sintonia da parte di un incantatore. Mentre impugni " +
                        "questa bacchetta, ottieni un bonus ai tiri per colpire con gli" +
                        " incantesimi determinato dalla rarità della bacchetta. Inoltre, " +
                        "ignori metà copertura quando effettui un attacco con incantesimo.",
                "bacchetta",
                0,
                "molto raro"
            )
        )
        result.add(
            Item(
                "Bacchetta della Metamorfosi",
                "Richiede sintonia da parte di un incantatore. Mentre impugni questa" +
                        " bacchetta, puoi usare un’azione per spendere 1 carica per lanciare tramite" +
                        " essa l’incantesimo metamorfosi (CD del tiro salvezza 15). Questa bacchetta" +
                        " ha 7 cariche. La bacchetta recupera 1d6 + 1 cariche spese all’alba di " +
                        "ciascun giorno. Tuttavia, se spendi l’ultima carica della bacchetta, " +
                        "tira un d20. Se ottieni 1, la bacchetta si riduce in polvere ed è distrutta.",
                "bacchetta",
                0,
                "molto raro"
            )
        )
        result.add(
            Item(
                "Bacchetta delle Meraviglie",
                "Richiede sintonia da parte di un icantatore. Mentre impugni questa bacchetta" +
                        ", puoi spendere 1 carica con un’azione e scegliere un bersaglio entro 36 " +
                        "metri da te. Il bersaglio può essere una creatura, un oggetto o un punto" +
                        " nello spazio. Il GM decide o determina casualmente cosa accadrà quando " +
                        "fai uso della bacchetta. Gli incantesimi lanciati tramite la bacchetta " +
                        "hanno CD del tiro salvezza 15. Se l’incantesimo normalmente ha una gittata" +
                        " espressa in metri, la gittata diventa 36 metri qualora non lo sia già. Se un" +
                        " effetto copre un’area, devi centrare l’incantesimo sul bersaglio e includervelo." +
                        " Se un effetto più agire su più soggetti possibili, il GM determina casualmente " +
                        "chi sia affetto. Questa bacchetta ha 7 cariche. La bacchetta recupera 1d6 +" +
                        " 1 cariche ogni giorno all’alba. Se spendi l’ultima carica della bacchetta, " +
                        "tira un d20. Se ottieni 1, la bacchetta si riduce in polvere ed è distrutta." +
                        "Ogni volta che fai uso della bacchetta delle meraviglie tira un d100 e consulta questa tabella." +
                        "d100 Contenuti\n" +
                        "01-05 Lanci lentezza.\n" +
                        "06-10 Lanci fuoco delle fate.\n" +
                        "11-15 Sei stordito fino all’inizio del tuo prossimo turno, e ritieni che sia " +
                        "accaduto qualcosa di stupefacente.\n" +
                        "16-20 Lanci folata di vento.\n" +
                        "21-25 Lanci individuazione dei pensieri sul bersaglio da te scelto. Se il " +
                        "tuo a bersaglio non è una creatura, subisci invece 1d6 danni psichici.\n" +
                        "26-30 Lanci nube maleodorante.\n" +
                        "31-33 Pioggia abbondante precipita in un raggio di 18 metri centrato sul" +
                        " bersaglio. L’area diventa oscurata leggermente. La pioggia continua a" +
                        " cadere fino all’inizio del tuo prossimo turno.\n" +
                        "34-36 Compare un animale nello spazio non occupato più vicino al " +
                        "bersaglio. L’animale non è sotto il tuo controllo e agisce come di " +
                        "norma. Tira un d100 per determinare che specie di animale compaia." +
                        " 01-25, un rinoceronte; 26-50, un elefante; 51-100, un ratto.\n" +
                        "37-46 Lanci fulmine.\n" +
                        "47-49 Una nube di 600 enormi farfalle riempie un raggio di 9 metri " +
                        "intorno al bersaglio. L’area diventa oscurata pesantemente. Le " +
                        "farfalle restano per 10 minuti.\n" +
                        "50-53 Ingrandisci il bersaglio come se avessi lanciato l’incantesimo " +
                        "ingrandire/ridurre. Se il bersaglio non può essere soggetto all’" +
                        "incantesimo, o se non è una creatura, tu diventi il bersaglio.\n" +
                        "54-58 Lanci oscurità.\n" +
                        "59-62 Erba folta spunta in un raggio di 18 metri intorno al bersaglio." +
                        " Se vi è già dell’erba, questa cresce di dieci volte e resta così per" +
                        " 1 minuto.\n" +
                        "63-65 Un oggetto a scelta del GM scompare sul Piano Etereo. L’oggetto" +
                        " non deve essere né indossato né trasportato, deve essere entro 36" +
                        " metri dal bersaglio, e non più grande di 3 metri in ciascuna dimensione.\n" +
                        "66-69 Ti rimpicciolisci come se avessi lanciato su di te l’incantesimo" +
                        " ingrandire/ridurre.\n" +
                        "70-79 Lanci palla di fuoco.\n" +
                        "80-84 Lanci invisibilità su di te.\n" +
                        "85-87 Sul bersaglio crescono delle foglie. Se hai scelto un " +
                        "punto nello spazio come bersaglio, le foglie spunteranno sulla creatura " +
                        "più vicina a quel punto. A meno che non vengano strappate, le foglie " +
                        "diventeranno marroni e cadranno dopo 24 ore.\n" +
                        "88-90 Un flusso di 1d4 x 10 gemme del valore di 1 mo ciascuna scaturisce " +
                        "dalla punta della bacchetta in una linea lunga 9 metri e larga 1,5 metri." +
                        " Ogni gemma infligge 1 danno contundente, e il loro danno totale è diviso" +
                        " equamente tra tutte le creature sulla linea.\n" +
                        "91-95 Una raffica di luci scintillanti e colorate si estende da te in un" +
                        " raggio di 9 metri. Tu e tutte le creature nell’area dovete superare un" +
                        " tiro salvezza di Costituzione con CD 15 o restare accecati per 1 minuto." +
                        " Una creatura può ripetere il tiro salvezza al termine di ciascun suo turno," +
                        " terminando l’effetto su di sé in caso lo superi.\n" +
                        "96-97 La pelle del bersaglio assume un colorito blu intenso per 1d10 giorni." +
                        " Se hai scelto un punto nello spazio, il soggetto sarà la creatura più " +
                        "vicina a quel punto.\n" +
                        "98-00 Se il bersaglio è una creatura, deve effettuare un tiro salvezza" +
                        " di Costituzione con CD 15. Se il bersaglio non è una creatura, il bersaglio " +
                        "diventi tu e sarai tu a effettuare il tiro salvezza. Se il tiro salvezza " +
                        "fallisce di 5 o più, il bersaglio è pietrificato. Se il tiro salvezza " +
                        "fallisce di meno, il bersaglio è intralciato e inizia a trasformarsi" +
                        " in pietra. Mentre è intralciato a questo modo, il bersaglio deve ripetere" +
                        " il tiro salvezza al termine di ciascun suo turno, diventando pietrificato " +
                        "in caso di fallimento o terminando l’effetto in caso di successo. Il" +
                        " bersaglio resta pietrificato finché non sarà liberato dall’incantesimo" +
                        " ristorare inferiore o simili magie.",
                "bacchetta",
                0,
                "raro"
            )
        )
        result.add(
            Item(
                "Bacchetta delle Palle di Fuoco",
                "Richiede sintonia da parte di un incantatore. Mentre impugni questa " +
                        "bacchetta, puoi usare un’azione per spendere 1 o più cariche per lanciare " +
                        "tramite essa l’incantesimo palla di fuoco (CD del tiro salvezza 15). Per 1 " +
                        "carica, lanci la versione di 3° livello dell’incantesimo. Puoi aumentare lo" +
                        " slot incantesimo di uno per ogni ulteriore carica spesa. Questa bacchetta ha " +
                        "7 cariche. La bacchetta recupera 1d6 + 1 cariche spese all’alba di ciascun" +
                        "giorno. Tuttavia, se spendi l’ultima carica della bacchetta, tira un d20." +
                        " Se ottieni 1, la bacchetta si riduce in polvere ed è distrutta.",
                "bacchetta",
                0,
                "raro"
            )
        )
        result.add(
            Item(
                "Bacchetta della Paralisi",
                "Richiede sintonia da parte di un incantatore. Mentre impugni questa " +
                        "bacchetta, puoi usare un’azione per spendere 1 carica per far sì che " +
                        "un sottile raggio parta dalla sua punta verso una creatura visibile entro " +
                        "18 metri da te. Il bersaglio deve superare un tiro salvezza di Costituzione " +
                        "con CD 15 o restare paralizzato per 1 minuto. Al termine di ciascun turno " +
                        "del bersaglio, questi può effettuare un tiro salvezza di Costituzione CD " +
                        "15, terminando l’effetto su di sé in caso lo superi. Questa bacchetta ha" +
                        " 7 cariche. La bacchetta recupera 1d6 + 1 cariche spese all’alba di" +
                        " ciascun giorno. Tuttavia, se spendi l’ultima carica della bacchetta" +
                        ", tira un d20. Se ottieni 1, la bacchetta si riduce in polvere ed" +
                        " è distrutta.",
                "bacchetta",
                0,
                "raro"
            )
        )
        result.add(
            Item(
                "Bacchetta della Paura",
                "Richiede sintonia. Questa bacchetta ha 7 cariche per le seguenti proprietà. La bacchetta recupera 1d6 + 1 cariche spese all’alba di ciascun giorno. Tuttavia, se spendi l’ultima carica della bacchetta, tira un d20. Se ottieni 1, la bacchetta si riduce in polvere ed è distrutta. Comando. Mentre impugni questa bacchetta, puoi usare un’azione per spendere 1 carica e comandare a un’altra creatura di scappare o strisciare, come per l’incantesimo comando (CD del tiro salvezza 15). Cono di Paura. Mentre impugni questa bacchetta, puoi usare un’azione per spendere 2 cariche, facendo sì che la punta della bacchetta emetta luce in un cono di 18 metri. Ogni creatura nel cono deve superare un tiro salvezza di Saggezza con CD 15 o restare spaventata da te per 1 minuto. Mentre è spaventata in questo modo, una creatura deve spendere i suoi turni cercando di muoversi più lontano possibile da te, e non può muoversi volontariamente entro 9 metri da te. Inoltre non può effettuare reazioni. Come sua azione, la creatura può usare solo l’azione Scattare o cercare di scappare da un effetto che le impedisca di muoversi. Se non può muoversi da nessuna parte, la creatura può usare l’azione Schivare. Al termine di ciascun suo turno, la creatura può ripetere il tiro salvezza, terminando l’effetto su di sé in caso lo superi.",
                "bacchetta",
                0,
                "raro"
            )
        )
        result.add(
            Item(
                "Bacchetta della Ragnatela",
                "Richiede sintonia da parte di un incantatore. " +
                        "Mentre la impugni, puoi usare un’azione" +
                        " per spendere 1 carica per lanciare tramite" +
                        " essa l’incantesimo ragnatela (CD del tiro salvezza 15). " +
                        "Questa bacchetta ha 7 cariche. La bacchetta recupera 1d6 + 1 cariche spese " +
                        "all’alba di ciascun giorno. Tuttavia, se spendi l’ultima carica della " +
                        "bacchetta, tira un d20. Se ottieni 1, la bacchetta si riduce in polvere " +
                        "ed è distrutta. ",
                "bacchetta",
                0,
                "non comune"
            )
        )
        result.add(
            Item(
                "Bacchetta dei Segreti",
                "Mentre impugni questa bacchetta, puoi usare un’azione per spendere 1 " +
                        "carica, e se una porta segreta o trappola si trova entro 9 metri da " +
                        "te, la bacchetta pulsa e punta a quella più vicina a te. La bacchetta" +
                        " ha 3 cariche. La bacchetta recupera 1d3 cariche spese all’alba di ciascun giorno.",
                "bacchetta",
                0,
                "non comune"
            )
        )
        result.add(
            Item(
                "Bacchetta del Vincolo",
                "Richiede sintonia da parte di un incantatore. Questa bacchetta" +
                        " ha 7 cariche per le seguenti proprietà. La bacchetta recupera 1d6" +
                        " + 1 cariche spese all’alba di ciascun giorno. Tuttavia, se spendi " +
                        "l’ultima carica della bacchetta, tira un d20. Se ottieni 1, la bacchetta" +
                        " si riduce in polvere ed è distrutta. Incantesimi. Mentre impugni questa" +
                        " bacchetta, puoi usare un’azione e spendere alcune delle sue cariche per" +
                        " lanciare uno dei seguenti incantesimi (CD del tiro salvezza 17): blocca " +
                        "mostri (5 cariche) o blocca persone (2 cariche). Fuga Assistita. " +
                        "Mentre impugni questa bacchetta, puoi usare la tua reazione e spendere " +
                        "1 carica per ottenere vantaggio ai tiri salvezza che effettui per evitare" +
                        " di restare paralizzato o intralciato, o puoi spendere 1 carica per" +
                        " ottenere vantaggio su qualsiasi prova effettuata per sfuggire un" +
                        " tentativo di afferrare.",
                "bacchetta",
                0,
                "raro"
            )
        )
        result.add(
            Item(
                "Barca Pieghevole",
                "Questo oggetto sembra una scatola di legno che misura 30 centimetri " +
                        "di lunghezza, 15 centimetri di larghezza e 15 centimetri di profondità. " +
                        "Pesa 2 chili e galleggia. Può essere aperta per porvi oggetti all’ interno." +
                        " Quest’oggetto possiede tre parole di comando, ciascuna delle quali richiede" +
                        " un’azione per essere pronunciata. Una parola di comando fa sì che la " +
                        "scatola si dispieghi in una barca lunga 3 metri, larga 1,2 metri e profonda" +
                        " 50 centimetri. La barca ha un paio di remi, un’ancora, un albero e una vela." +
                        " La barca può contenere fino a quattro creature di taglia Media. " +
                        "La seconda parola di comando fa sì che la scatola si dispieghi in una " +
                        "nave lunga 7,2 metri, larga 2,5 metri e profonda 2 metri. La nave ha " +
                        "un ponte, file di voga, cinque serie di remi, un remo direzionale, " +
                        "un’ancora, una cabina e un albero con la vela quadrata. La nave può " +
                        "contenere quindici creature di taglia Media. La terza parola di " +
                        "comando fa sì che la barca pieghevole ritorni a piegarsi nella scatola," +
                        " purché nessuna creatura sia a bordo. Qualsiasi oggetto a bordo che non " +
                        "possa entrare nella scatola resta fuori della scatola mentre questa si " +
                        "piega. Qualsiasi oggetto a bordo che possa entrare nella scatola, vi entra.",
                "Oggetto meraviglioso",
                0,
                "raro"
            )
        )
        result.add(
            Item(
                "Bastone di Avvizzimento",
                "Richiede sintonia da parte di un chierico, druido o warlock. Il bastone " +
                        "può essere impugnato come un bastone da combattimento magico. Se colpisci, " +
                        "infligge danni come un normale bastone da combattimento, e puoi spendere 1 " +
                        "carica per infliggere 2d10 danni necrotici aggiuntivi al bersaglio. Inoltre, " +
                        "il bersaglio deve superare un tiro salvezza di Costituzione con CD 15 o avere " +
                        "svantaggio per 1 ora a qualsiasi prova di caratteristica o tiro salvezza che " +
                        "richieda Forza o Costituzione. Questo bastone ha 3 cariche e recupera 1d3 " +
                        "cariche spese ogni mattina all’alba.",
                "bastone",
                0,
                "raro"
            )
        )
        result.add(
            Item(
                "Bastone dei Boschi",
                "Richiede sintonia da parte di un druido. Il bastone può essere impugnato" +
                        " come un bastone da combattimento magico che conferisce un bonus di +2 ai " +
                        "tiri per colpire e danno effettuati con esso. Quando lo impugni hai anche un " +
                        "bonus di +2 ai tiri per colpire con incantesimi. Questo bastone ha 10 cariche" +
                        " per le seguenti proprietà. Recupera 1d6 + 4 cariche spese ogni giorno all’alba." +
                        " Se spendi l’ultima carica del bastone, tira un d20. Se il risultato è 1, il " +
                        "bastone si annerisce, si trasforma in cenere, ed è distrutto. Incantesimi. " +
                        "Puoi usare un’azione per spendere 1 o più cariche del bastone per lanciare " +
                        "tramite esso uno dei seguenti incantesimi, utilizzando la tua CD del tiro " +
                        "salvezza degli incantesimi: amicizia con gli animali (1 carica), localizza " +
                        "animali e piante (1 carica), muro di spine (6 cariche), parlare con gli animali" +
                        " (3 cariche), pelle coriacea (2 cariche) o risveglio (5 cariche). Puoi inoltre" +
                        " usare un’azione per lanciare tramite il bastone l’incantesimo passare senza tracce" +
                        " senza spendere cariche. Forma d’Albero. Puoi usare un’azione per piantare un’estremità " +
                        "del bastone su terreno fertile e spendere 1 carica per trasformare il bastone in un " +
                        "albero vigoroso. L’albero è alto 18 metri, con un tronco di 1,5 metri di diametro; in" +
                        " cima i suoi rami si estendono per 6 metri. L’albero sembra un albero normale ma irradia " +
                        "una debole aura di magia di trasmutazione, qualora sia bersaglio dell’incantesimo " +
                        "individuazione del magico. Mentre sei in contatto con l’albero e usi un’altra azione" +
                        " per pronunciarne la parola di comando, riporti il bastone alla sua forma normale. " +
                        "Qualsiasi creatura sull’albero, cade quando questo si ritrasforma in bastone.",
                "bastone",
                0,
                "raro"
            )
        )
        result.add(
            Item(
                "Bastone dello Charme",
                "Richiede sintonia da parte di un bardo. chierico, druido, mago, stregone o warlock)" +
                        " Mentre impugni questo bastone, puoi usare un’azione per spendere 1 carica per lanciare " +
                        "tramite esso charme su persone, comando o comprendere linguaggi, utilizzando la tua CD dei " +
                        "tiri salvezza degli incantesimi. Il bastone può essere usato come bastone da combattimento " +
                        "magico. Se stai impugnando il bastone e fallisci un tiro salvezza contro un incantesimo di " +
                        "mmaliamento che prende come bersaglio solo te e non un’area, puoi trasformare il tiro salvezza " +
                        "fallito in un successo. Non potrai più usare questa proprietà del bastone fino all’alba del giorno" +
                        " successivo. Se riesci in un tiro salvezza contro un incantesimo di ammaliamento che prende come " +
                        "bersaglio solo te, con o senza l’intervento del bastone, puoi usare la tua reazione per spendere 1" +
                        " carica dal bastone e rivolgere l’incantesimo contro chi lo ha lanciato, come se l’incantesimo " +
                        "fosse stato lanciato da te. Il bastone ha 10 cariche, e recupera 1d8 + 2 cariche spese " +
                        "ogni giorno all’alba. Se spendi l’ultima carica, tira un d20. Se ottieni 1, il bastone" +
                        " diventa un bastone da combattimento normale.",
                "bastone",
                0,
                "raro"
            )
        )
        result.add(
            Item(
                "Bastone del Colpire",
                "Richiede sintonia. Questo bastone può essere impugnato come un bastone da" +
                        " combattimento magico che conferisce un bonus di +3 ai tiri per colpire e di " +
                        "danno effettuati con esso. Quando colpisci con un attacco da mischia facendo" +
                        " uso del bastone, puoi spendere fino a 3 delle sue cariche. Per ogni carica " +
                        "spesa, il bersaglio subisce 1d6 danni da forza aggiuntivi.",
                "bastone",
                0,
                "molto raro"
            )
        )
        result.add(
            Item(
                "Bastone del Fuoco",
                "Richiede sintonia da parte di un druido, mago, stregone o warlock. Mentre " +
                        "impugni questo bastone, hai resistenza al danno da fuoco. Inoltre, puoi " +
                        "usare un’azione per spendere 1 o più delle sue cariche per lanciare tramite " +
                        "esso uno dei seguenti incantesimi, utilizzando la tua CD dei tiri salvezza " +
                        "degli incantesimi: mani brucianti (1 carica), muro di fuoco (4 cariche) o" +
                        " palla di fuoco (3 cariche). Il bastone ha 10 cariche, e recupera 1d6 + " +
                        "4 cariche spese ogni giorno all’alba. Se spendi l’ultima carica del bastone, " +
                        "tira un d20. Se il risultato è 1, il bastone si annerisce, si trasforma in" +
                        " cenere, ed è distrutto.",
                "bastone",
                0,
                "molto raro"
            )
        )
        result.add(
            Item(
                "Bastone del Gelo",
                "Richiede sintonia da parte di un druido, mago, stregone o warlock. Mentre " +
                        "impugni questo bastone, hai resistenza ai danni da freddo. Inoltre, puoi usare" +
                        " un’azione per spendere 1 o più delle sue cariche per lanciare tramite esso uno" +
                        " dei seguenti incantesimi, utilizzando la tua CD dei tiri salvezza degli incantesimi: " +
                        "cono di freddo (5 cariche), muro di ghiaccio (4 cariche), nube di nebbia (1 carica)" +
                        " o tempesta di ghiaccio (4 cariche).Il bastone ha 10 cariche, e recupera 1d6 + 4 " +
                        "cariche spese ogni giorno all’alba. Se spendi l’ultima carica del bastone, tira" +
                        " un d20. Se il risultato è 1, il bastone si trasforma in acqua ed è distrutto.",
                "bastone",
                0,
                "molto raro"
            )
        )
        result.add(
            Item(
                "Bastone di Guarigione",
                "Richiede sintonia da parte di un bardo, chierico o druido. Mentre lo impugni," +
                        " puoi usare un’azione per spendere 1 o più delle sue cariche per lanciare tramite" +
                        " esso uno dei seguenti incantesimi, utilizzando la tua CD del tiro salvezza degli " +
                        "incantesimi e il tuo modificatore di abilità da incantatore: cura ferite (1 carica" +
                        " per livello dell’incantesimo, fino al 4°), ristorare inferiore (2 cariche), o" +
                        "cura ferite di massa (5 cariche). Questo bastone ha 10 cariche, e recupera 1d6 " +
                        "+ 4 cariche spese ogni giorno all’alba. Se spendi l’ultima carica del bastone, " +
                        "tira un d20. Se il risultato è 1, il bastone svanisce in un lampo di luce, perso per sempre.",
                "bastone",
                0,
                "raro"
            )
        )
        result.add(
            Item(
                "Bastone degli Insetti Sciamanti",
                "Richiede sintonia da parte di un bardo, chierico, druido, mago, stregone o warlock." +
                        " Questo bastone ha 10 cariche che puoi impiegare per usare le proprietà" +
                        " sotto descritte e recupera 1d6 + 4 cariche spese ogni giorno all’alba. Se" +
                        " spendi l’ultima carica del bastone, tira un d20. Se il risultato è 1, uno" +
                        " sciame di insetti consuma e distrugge il bastone, e poi si disperde. Incantesimi" +
                        ". Mentre impugni questo bastone, puoi usare un’azione per spendere le sue cariche ed " +
                        "lanciare uno dei seguenti incantesimi, utilizzando la tua CD del tiro salvezza " +
                        "degli incantesimi: insetto gigante (4 cariche) o piaga degli insetti (5 cariche)." +
                        " Nube di Insetti. Mentre impugni questo bastone, puoi usare un’azione e spendere " +
                        "1 carica per fa sì che uno sciame di insetti innocui si diffonda in un raggio di 9 " +
                        "metri intorno a te. Gli insetti rimangono per 10 minuti, rendendo l’area oscurata " +
                        "pesantemente per tutti tranne te. Lo sciame si muove assieme a te, rimanendo centrato" +
                        " su di te. Un vento di almeno 15 chilometri all’ora disperde lo sciame e termina" +
                        " l’effetto. Il bastone ha 10 cariche e recupera 1 d6 +4 cariche spese ogni giorno all ’ alba " +
                        ". Se spendi l ’ ultima carica tira un d20.Se ottieni 1, il bastone diventa un" +
                        " bastone da combattimento normale .",
                "bastone",
                0,
                "raro"
            )
        )
        result.add(
            Item(
                "Bastone del Pitone",
                "Richiede sintonia da parte di un chierico, druido o warlock. Puoi usare" +
                        " un’azione per pronunciare la parola di comando del bastone e scagliarlo " +
                        "sul terreno fino a 3 metri di distanza. Il bastone diventa un serpente " +
                        "costrittore gigante sotto il tuo controllo e agisce al proprio conteggio di " +
                        "iniziativa. Utilizzando un’azione bonus per pronunciare di nuovo la parola di" +
                        " comando, riporti il bastone alla sua forma normale nello spazio precedente mente " +
                        "occupato dal serpente. Durante il tuo turno puoi impartire ordini mentali al serpente" +
                        " finché si trova entro 18 metri da te e non sei inabile. Decidi tu quali azioni" +
                        " effettuerà il serpente e dove si muoverà durante il suo prossimo turno, oppure" +
                        " puoi i mpartirgli un comando generico, come quello di attaccare i tuoi nemici " +
                        "o difendere un luogo. Se il serpente viene ridotto a 0 punti ferita, muore e " +
                        "ritorna alla sua forma di bastone. Poi, il bastone si frantuma ed è distrutto." +
                        " Se il serpente si ritrasforma in forma di bastone prima di perdere tutti i" +
                        " suoi punti ferita, recupera tutti quelli persi.",
                "bastone",
                0,
                "non comune"
            )
        )
        result.add(
            Item(
                "Bastone del Potere",
                "Rchiede sintonia da parte di un mago, stregone o warlock. Questo bastone può " +
                        "essere impugnato come un bastone da combatt imento magico che conferisce un" +
                        " bonus di +2 ai tiri per colpire e danno effettuati con esso. Mentre lo impugni," +
                        " ricevi un bonus di +2 alla Classe Armatura, ai tiri salvezza, e ai tiri per " +
                        "colpire con incantesimi. Questo bastone ha 20 cariche per le seguenti proprietà. " +
                        "Recupera 2d8 + 4 cariche spese ogni giorno all’alba. Se spendi l’ultima carica del " +
                        "bastone, tira un d20. Se il risultato è 1, il bastone mantiene il suo bonus di +2 " +
                        "ai tiri per colpire e danno ma perde tutte le altre proprietà. Se il risultato è 20," +
                        " il bastone recupera 1d8 + 2 cariche. Colpo di Potere. Quando colpisci con un " +
                        "attacco in mischia usando questo bastone, puoi spendere 1 carica per infliggere " +
                        "1d6 danni da forza aggiuntivi al bersaglio. Incantesimi. Mentre impugni questo" +
                        " bastone, puoi usare un’azione per spendere 1 o più delle sue cariche per lanciare" +
                        " tramite esso uno dei seguenti incantesimi, utilizzando la tua CD del tiro" +
                        " salvezza degli incantesimi e la tua abilità da incantatore: blocca mostri (" +
                        "5 cariche), cono di freddo (5 cariche), globo di invulnerabilità (6 cariche)," +
                        " levitazione (2 cariche), muro di forza (5 cariche), palla di fuoco (versione" +
                        " di 5° livello, 5 cariche), dardo incantato (1 carica), raggio di indebolimento " +
                        "(1 carica) o fulmine (versione di 5° livello, 5 cariche). Colpo di Vendetta." +
                        " Puoi usare un’azione per spezzare il bastone sul tuo ginocchio o contro una" +
                        " superficie solida, eseguendo un colpo di vendetta. Il bastone viene distrutto" +
                        " e libera la sua magia rimanente in un’esplosione che si espande fino a " +
                        "riempire una s fera di 9 metri di raggio centrata su di esso. Hai il 50% di" +
                        " probabilità di viaggiare istantaneamente in un piano di esistenza a caso, " +
                        "evitando cos ì l’esplosione. Se non riesci a evitare l’effetto, subisci danni " +
                        "da forza pari a 16 x il numero di cariche ne l bastone. Ogni altra creatura nell’" +
                        "area deve effettuare un tiro salvezza di Destrezza con CD 17. Se il tiro salvezza " +
                        "fallisce, la creatura subisce un ammontare di danno basato sulla distanza dal punto" +
                        " di origine dell’esplosione, come mostrato sulla tabell a seguente. Se il tiro salvezza " +
                        "riesce, la creatura subisce la metà di questi danni." +
                        "Distanza dall ’ Origine Danno\n " +
                        "3 metri o meno   8 x il numero di cariche nel bastone\n" +
                        "Fino a 6 metri   6 x il numero di cariche nel bastone\n" +
                        "Fino a 9 metri   4 x il numero di cariche nel bastone\n",
                "bastone",
                0,
                "molto raro"
            )
        )
        result.add(
            Item(
                "Bastone dei Tuoni e Fulmini",
                "Richiede sintonia. Il bastone può essere impugnato come un bastone da combattimento " +
                        "magico che conferisce un bonus di +2 ai tiri per colpire e danno effettuati con esso." +
                        " Inoltre ha le seguenti proprietà. Quando viene usata una di queste proprietà, non se " +
                        "ne potrà più far uso fino all’alba successiva. Fulmine. Quando colpisci con un attacco in" +
                        " mischia usando il bastone, puoi far sì che il bersaglio subisca 2d6 danni da fulmine aggiuntivi" +
                        ". Tuono. Quando colpisci con un attacco in mischia usando il bastone, puoi far sì che il bastone" +
                        " emetta il suono di un tuono, udibile fino a 90 metri di distanza. Il bersaglio colpito " +
                        "deve superare un tiro salvezza di Costituzione con CD 17 o restare stordito fino al termine" +
                        " del tuo prossimo turno. Colpo Fulminante. Puoi usare un’azione per far sì che una fulmine" +
                        " balzi dalla punta del bastone in una linea larga 1,5 metri e lunga 36 metri. Ogni creatura" +
                        " sulla linea deve effettuare un tiro salvezza di Destrezza con CD 17, subendo 9d6 danni da" +
                        " fulmine se lo fallisce, o la metà di questi danni se lo supera. Rombo di Tuono. Puoi usare" +
                        " un’azione per far sì che il bastone produca un rombo di tuono assordante, udibile fino a " +
                        "180 metri di distanza. Ogni creatura entro 18 metri da te (te escluso) deve effettuare un tiro" +
                        " salvezza di Costituzione con CD 17. Se fallisce il tiro salvezza, la creatura subisce 2d6 danni da" +
                        " tuono e resta assordata per 1 minuto. Se supera il tiro salvezza, subisce la metà dei danni e non " +
                        "è assordata. Tuoni e Fulmini. Puoi usare un’azione per usare le proprietà Colpo Fulminante e Rombo" +
                        " di Tuono assieme. Farlo non consuma l’uso giornaliero di quelle proprietà, ma solo l’uso di questa.",
                "bastone",
                0,
                "molto raro"
            )
        )
        result.add(
            Item(
                "Battaglio dell’Apertura",
                "Questo tubo metallico cavo misura circa 30 centimetri di lunghezza e pesa " +
                        "0,5 chili. Puoi batterlo con un’azione, puntandolo verso un oggetto entro 36 metri che" +
                        " può essere aperto, come una porta o una serratura. Il battaglio emette un suono limpido, " +
                        "e una serratura o laccio dell’oggetto si apre a meno che il suono sia impedito dal raggiungere " +
                        "l’oggetto. Se non rimangono serrature o lacci da aprire, l’oggetto si apre da sé. " +
                        "Il battaglio può essere usato dieci volte.",
                "Oggetto meraviglioso",
                0,
                "raro"
            )
        )
        result.add(
            Item(
                "Borsa Conservante",
                "Lo spazio interno di questo sacco di tela è molto più grande di quanto le " +
                        "sue dimensioni esterne suggerirebbero, circa 60 centimetri all’ingresso e " +
                        "profondo 1,20 metri. La borsa può contenere fino a 250 chili, senza eccedere " +
                        "il volume di 1,8 metri3. La borsa pesa 7,5 chili, quale che sia il suo contenuto." +
                        " Recuperare un oggetto dalla borsa richiede l’uso di un’azione. Se la borsa " +
                        "è sovraccarica, perforata o strappata, la borsa si rompe ed è distrutta e il" +
                        " suo contenuto sparpagliato per il Piano Astrale. Se la borsa viene rivoltata, " +
                        "i suoi contenuti vengono espulsi, illesi, ma la borsa dev’essere rimessa nel verso " +
                        "giusto prima che possa essere riutilizzata. Le creature che respirano, piazzate " +
                        "nella borsa, possono sopravvivervi per un numero di minuti pari a 10 diviso il numero " +
                        "di creature (minimo 1 minuto), dopodiché inizieranno a soffocare. Piazzare una borsa " +
                        "conservante all’interno dello spazio extradimensionale generato da uno zainetto pratico, " +
                        "un buco portatile o simile oggetto, distrugge entrambi gli oggetti e apre un portale " +
                        "verso il Piano Astrale. Il portale origina nel punto in cui un oggetto è stato posto" +
                        " all’interno dell’altro. Qualsiasi creatura entro 3 metri dal portale viene risucchiata" +
                        " al suo interno e ricompare in un posto a caso sul Piano Astrale, poi il portale si " +
                        "richiude. Il portale è a senso unico e non può essere riaperto.",
                "Oggetto meraviglioso",
                0,
                "non comune"
            )
        )
        result.add(
            Item(
                "Borsa Divorante",
                "La borsa appare come una borsa conservante. Se la borsa viene rivolta le " +
                        "sue proprietà smettono di funzionare. La creatura extradimensionale attaccata" +
                        " alla borsa può percepire qualsiasi cosa vi venga posto all’interno. La materia" +
                        " animale o vegetale posta interamente dentro la borsa viene divorata ed è persa" +
                        " per sempre. Quando una parte di una creatura vivente viene posta nella borsa, " +
                        "c’è una probabilità del 50% che la creatura venga trascinata dentro la borsa. Una" +
                        " creatura all’interno della borsa può usare un’azione per cercare di fuggirne " +
                        "superando una prova di Forza con CD 15. Un’altra creatura può usare un’azione" +
                        " per afferrare la creatura all’interno della borsa e tirarla fuori, superando " +
                        "una prova di Forza con CD 20 (e sempre che non venga a sua volta trascinata " +
                        "dentro la borsa). Qualsiasi creatura che inizi il proprio turno all’interno" +
                        " della borsa viene divorata, il suo corpo distrutto. All’interno della borsa " +
                        "possono essere posti oggetti inanimati, fino a 27 dm3 di materiale. Tuttavia," +
                        " una volta al giorno, la borsa inghiotte qualsiasi oggetto posto al suo interno" +
                        " e lo risputa fuori in un altro piano di esistenza. Il GM determina il momento" +
                        " e il piano. Se la borsa venisse fatta a pezzi o strappata, è distrutta, e " +
                        "qualsiasi cosa contenga verrebbe trasportata in un luogo casuale del Piano Astrale.",
                "Oggetto meraviglioso",
                0,
                "molto raro"
            )
        )
        result.add(
            Item(
                "Borsa dei Fagioli",
                "All’interno di questa borsa si trovano 3d4 fagioli secchi." +
                        " La borsa pesa 250 grammi più 125 grammi per ogni fagiolo che " +
                        "contiene. Se riversi il contenuto della borsa sul terreno, i " +
                        "fagioli esplodono in un raggio di 3 metri. Ogni creatura nell’" +
                        "area, te compreso, deve effettuare un tiro salvezza di Destrezza" +
                        " con CD 15, subendo 5d4 danni da fuoco se lo fallisce, o la metà di " +
                        "questi danni se lo supera. Il fuoco incendia gli oggetti infiammabili" +
                        " nell’area che non siano indossati o trasportati. Se rimuovi il fagiolo" +
                        " dalla borsa, lo pianti nel terreno o la sabbia, e lo innaffi, il fagiolo" +
                        " produrrà un effetto 1 minuto dopo, a partire dal punto del terreno in cui " +
                        "è stato piantato. Il GM sceglie l’effetto o lo determina casualmente. Tira" +
                        " un d100 sulla tabella seguente per scoprire cosa accade quando pianti i " +
                        "fagioli della borsa dei fagioli." +
                        "d100   Effetto\n" +
                        "01      Spuntano 5d4 funghi. Se una creatura mangia un fungo, tira un dado." +
                        " Se il risultato è dispari, costui deve superare un tiro salvezza di Costituzione" +
                        " con CD 15 o subire 5d6 danni da veleno e restare avvelenato per 1 ora. Se " +
                        "il risultato è pari, costui ottiene 5d6 punti ferita temporanei per 1 ora.\n" +
                        "02-10   Erutta un geyser che sputa acqua, birra, succo di frutta, tè, aceto," +
                        " vino od olio (a discrezione del GM) 9 metri in aria per 1d12 round.\n" +
                        "11-20   Spunta un uomo albero. C’è una probabilità del 50% che l’uomo albero" +
                        " sia caotico malvagio e ti attacchi.\n" +
                        "21-30   Una statua di pietra animata con le tue fattezze si leva dal terreno. " +
                        "Essa comincerà a minacciarti verbalmente. Se dovessi andartene e altre persone" +
                        " giungessero sul posto, la statua ti descriverebbe come il più pericoloso dei " +
                        "criminali, e li esorterebbe ad cercarti e attaccarti. Se ti trovi sullo stesso " +
                        "piano di esistenza della statua, essa saprà sempre dove sei. Dopo 24 ore la " +
                        "statua diventerà inanimata.\n" +
                        "31-40   Un fuoco da campo che produce fiamme blu spunta dal terreno e brucia " +
                        "per 24 ore (o finché non viene spento).\n" +
                        "41-50   Sputano 1d6 + 6 funghi urlatori.\n" +
                        "51-60   Compaiono 1d4 + 8 rospi fuxia. Ogniqualvolta un rospo viene toccato," +
                        " si trasforma in un mostro di taglia Grande o inferiore a scelta del GM. " +
                        "Il mostro resta per 1 minuto e poi scompare in un sbuffo di fumo fuxia.\n" +
                        "61-70   Un bulette esce dal terreno e attacca.\n" +
                        "71-80   Cresce un albero da frutta. Possiede 1d10 + 20 frutti. 1d8 di questi " +
                        "funzionano come una pozione magica determinata a caso, mentre uno di loro " +
                        "funge da veleno ingerito del tipo determinato dal GM. L’albero svanisce dopo " +
                        "1 ora. I frutti raccolti invece rimangono, e mantengono la propria magia per " +
                        "30 giorni.\n" +
                        "81-90   Compare un nido con 1d4 + 3 uova. Qualsiasi creatura che mangi un uovo" +
                        " deve effettuare un tiro salvezza di Costituzione con CD 20. Se il tiro salvezza" +
                        " riesce, la creatura aumenta permanentemente il suo punteggio di caratteristica" +
                        " più basso di 1, scegliendo casualmente in caso di parità. Se il tiro salvezza " +
                        "fallisce, la creatura subisce 10d6 danni da forza a causa di un’esplosione magica" +
                        " al suo interno.\n" +
                        "91-90   Spunta dal terreno una piramide dalla base quadrata di 18 metri. All’" +
                        "interno c’è un sarcofago che contiene una mummia sovrana. La piramide è considerata" +
                        " come la tana della mummia sovrana, e il suo sarcofago contiene un tesoro a scelta del GM.\n" +
                        "100     Un enorme pianta di fagioli cresce sul posto, fino a un’altezza a scelta del GM" +
                        ". La cima conduce dovunque voglia il GM, che sia il castello di un gigante delle " +
                        "nuvole o un altro piano di esistenza.",
                "Oggetto meraviglioso",
                0,
                "raro"
            )
        )
        result.add(
            Item(
                "Borsa dei Trucchi",
                "Questa borsa dall’aspetto normale appare vuota. " +
                        "Allungare la mano all’interno della borsa, tuttavia," +
                        " rivela la presenza di un piccolo oggetto peloso. La " +
                        "borsa pesa 250 grammi. Puoi usare un’azione per estrarre" +
                        " l’oggetto peloso dalla borsa e scagliarlo fino a 6 metri " +
                        "di distanza. Quando l’oggetto atterra, si trasforma in una " +
                        "creatura determinata dal lancio di un d8 e consultando la tabella" +
                        " che corrisponde al colore della borsa. Vedi l’elenco dei mostri " +
                        "per le statistiche della creatura. La creatura svanisce all’alba" +
                        " successiva o quando viene ridotta a 0 punti ferita. La creatura" +
                        " è amichevole verso di te e i tuoi compagni, e agisce durante il tuo" +
                        " turno. Puoi usare un’azione bonus per ordinare alla creatura di " +
                        "muoversi e quale azione debba effettuare durante il suo prossimo" +
                        " turno, o darle ordini generici, come quello di attaccare i tuoi nemici." +
                        " In assenza di simili ordini, la creatura agisce in maniera appropriata " +
                        "alla sua natura e resterà per 10 minuti prima di svanire. Una volta che " +
                        "tre oggetti pelosi sono stati estratti dalla borsa, questa non potrà" +
                        "più essere usata fino alla prossima alba." +
                        "Borsa dei Trucchi Grigia\n" +
                        "d8   Creatura        d8   Creatura\n" +
                        "1    Donnola         5    Pantera\n" +
                        "2    Ratto gigante   6    Tasso gigante\n" +
                        "3    Tasso           7    Lupo crudele\n" +
                        "4    Cinghiale       8    Alce gigante\n" +
                        "Borsa dei Trucchi Ruggine\n" +
                        "d8   Creatura        d8   Creatura\n" +
                        "1    Ratto           5    Caprone gigante\n" +
                        "2    Gufo            6    Cinghiale gigante\n" +
                        "3    Mastino         7    Leone\n" +
                        "4    Caprone         8    Orso bruno\n" +
                        "Borsa dei Trucchi Marrone\n" +
                        "d8   Creatura        d8   Creatura\n" +
                        "1    Sciacallo       5    Orso nero\n" +
                        "2    Scimmione       6    Donnola gigante\n" +
                        "3    Babbuino        7    Iena gigante\n" +
                        "4    Becco d’ascia   8    Tigre",
                "Oggetto meraviglioso",
                0,
                "non comune"
            )
        )
        result.add(
            Item(
                "Bottiglia dell’Efreeti",
                "Questa bottiglia di ottone dipinta pesa 500 grammi." +
                        " Quando usi un’azione per rimuoverne il tappo, una" +
                        " nube di denso fumo fuoriesce dalla bottiglia. Al " +
                        "termine del tuo turno, il fumo si dissipa in un lampo" +
                        " di fuoco innocuo, e un efreeti compare in uno spazio non" +
                        " occupato entro 9 metri da te. La prima volta che la" +
                        " bottiglia viene aperta, il GM determina casualmente cosa accade." +
                        "d20     Effetto\n" +
                        "1-2     L’efreeti ti attacca. Dopo aver combattuto per 5 round, " +
                        "l’efreeti scompare e la bottiglia perde la sua magia.\n" +
                        "3-18    L’efreeti ti obbedisce per 1 ora, agendo ai tuoi comandi. Poi" +
                        " torna nella bottiglia, e un nuovo tappo lo può contenere. Il " +
                        "tappo non potrà essere rimosso prima che siano passate 24 ore. " +
                        "Le prossime due volte che la bottiglia viene aperta, si ripresenta" +
                        " lo stesso effetto. Se la bottiglia viene aperta una quarta volta," +
                        " l’efreeti scappa e scompare, e la bottiglia perde la sua magia.\n" +
                        "19-20 L’efreeti può lanciare l’incantesimo desiderio a tuo favore per tre volte." +
                        " Scompare quando conferisce il desiderio finale o dopo 1 ora, allorché la " +
                        "bottiglia perde la sua magia.\n ",
                "Oggetto meraviglioso",
                0,
                "molto raro"
            )
        )

        result.add(
            Item(
                "Bottiglia Fumante",
                "Dalla bocca di questa bottiglia di ottone fuoriesce continuamente " +
                        "del fumo, trattenuto dal suo tappo di piombo. La bottiglia pesa 500 grammi." +
                        " Quando usi un’azione per rimuovere il tappo, una nube di denso fumo si " +
                        "sparge in un raggio di 18 metri intorno alla bottiglia. L’area della nube è " +
                        "oscurata pesantemente. Per ciascun minuto in cui la bottiglia resta aperta e " +
                        "all’interno della nube, il raggio aumenta di 3 metri finché non raggiunge il " +
                        "raggio massimo di 36 metri. La nube persiste fino a quando la bottiglia resta aperta. " +
                        "Chiudere la bottiglia richiede che tu pronunci la sua parola di comando con un’azione." +
                        " Una volta chiusa la bottiglia, la nube si disperde dopo 10 minuti. Un vento moderato " +
                        "(dai 15 ai 30 km/h) può disperdere il fumo in 1 minuto, e un vento forte (più di 30 km/h) " +
                        "può disperderlo in 1 round.",
                "Oggetto meraviglioso",
                0,
                "non comune"
            )
        )
        result.add(
            Item(
                "Bracciali dell’Arciere",
                "Richiede sintonia. Mentre indossi questi bracciali, hai competenza con l’arco" +
                        " lungo e l’arco corto, e ottieni un bonus di +2 ai tiri di danno degli attacchi " +
                        "a distanza effettuati con queste armi.",
                "Oggetto meraviglioso",
                0,
                "non comune"
            )
        )
        result.add(
            Item(
                "Bracciali della Difesa",
                "Richiede sintonia. Mentre indossi questi bracciali, " +
                        "hai un bonus di +2 alla tua CA se non indossi nessuna armatura e non usi nessuno scudo.",
                "Oggetto meraviglioso",
                0,
                "raro"
            )
        )
        result.add(
            Item(
                "Braciere del Comando degli Elementali del Fuoco",
                "Mentre il fuoco arde all’interno di questo braciere di ottone, puoi " +
                        "usare un’azione per pronunciare la parola di comando del braciere ed " +
                        "evocare un elementale del fuoco, come se avessi lanciato l’incantesimo " +
                        "evoca elementali. Il braciere non può di nuovo essere usato a questo modo," +
                        " fino alla prossima alba. Il braciere pesa 2,5 chili.",
                "Oggetto meraviglioso",
                0,
                "raro"
            )
        )
        result.add(
            Item(
                "Brando del Gelo",
                "Richiede sintonia. Quando colpisci con un attacco che usi questa spada" +
                        " magica, il bersaglio subisce 1d6 danni da freddo aggiuntivi. Inoltre," +
                        " mentre impugni questa spada, hai resistenza ai danni da fuoco. A temperature" +
                        " gelide, la lama irradia luce intensa in un raggio di 3 metri e luce fioca per" +
                        " ulteriori 3 metri. Quando estrai quest’arma, puoi estinguere tutte le fiamme" +
                        " non magiche entro 9 metri da te. Questa proprietà non può essere usata più di una volta all’ora.",
                "arma (qualsiasi spada)",
                0,
                "molto raro"
            )
        )
        result.add(
            Item(
                "Brocca dell’Acqua Infinita",
                "Quest’ampolla tappata emette un suono di liquido quando viene smossa, come se contenesse acqua. La brocca pesa 1 chilo. Puoi usare un’azione per rimuovere il tappo e pronunciare una delle tre parole di comando, e a quel punto un ammontare di acqua fresca o acqua salata (a tua scelta) si riverserà fuori dell’ampolla, fino all’inizio del tuo prossimo turno. Scegli una delle opzioni seguenti:  “Ruscello” produce 4 litri d’acqua.  “Fontana” produce 20 litri d’acqua.  “Geyser” produce 150 litri d’acqua che vengono proiettati da un geyser lungo 9 metri e largo 30 centimetri. Con un’azione bonus, mentre impugni la brocca, puoi prendere come bersaglio del geyser una creatura visibile entro 9 metri da te. Il bersaglio deve superare un tiro salvezza di Forza con CD 13 o subire 1d4 danni contundenti e cadere prono. Invece di una creatura, puoi prendere come bersaglio un oggetto che non sia indossato o trasportato e che non pesi più di 100 chili. L’oggetto viene ribaltato o spinto 4,5 metri lontano da te.",
                "Oggetto meraviglioso",
                0,
                "non comune"
            )
        )
        result.add(
            Item(
                "Buco Portatile",
                "Questo elegante tessuto nero, soffice come la seta, si piega fino alle dimensioni di un fazzoletto. Si dispiega in uno strato circolare di 1,8 metri di diametro. Puoi usare un’azione per dispiegare un buco portatile e piazzarlo sopra o contro una superficie solida, sulla quale il buco portatile crea un foro extradimensionale profondo 3 metri. Lo spazio cilindrico all’interno del foro si trova su di un piano diverso, e quindi non può essere usato per aprire dei passaggi. Qualsiasi creatura all’interno di un buco portatile aperto può uscirne fuori arrampicandosi fuori di esso. Puoi usare un’azione per chiudere un buco portatile prendendo i margini del tessuto e ripiegandolo. Piegare il tessuto chiude il buco, e qualsiasi creatura od oggetto al suo interno rimane nello spazio extradimensionale. Non importa quello che contiene, il buco non pesa nulla. Se il buco viene ripiegato, una creatura all’interno dello spazio dimensionale del buco può usare un’azione per effettuare una prova di Forza con CD 10. Se la prova riesce, la creatura riesce a liberarsi e ricompare entro 1,5 metri dal buco portatile o della creatura che lo trasporta. Una creatura che respira può sopravvivere all’interno di un buco portatile chiuso per un massimo di 10 minuti, dopodiché iniziare a soffocare. Piazzare un buco portatile all’interno dello spazio extradimensionale creato da una borsa conservante, uno zainetto pratico o simile oggetto distrugge istantaneamente entrambi gli oggetti e apre un portale verso il Piano Astrale. Il portale origina dal punto in cui un oggetto è stato piazzato all’interno dell’altro. Qualsiasi creatura entro 3 metri dal portale viene risucchiata al suo interno e depositata in un luogo casuale del Piano Astrale. Poi il portale si chiude. Il portale è a senso unico e non può essere riaperto.",
                "Oggetto meraviglioso",
                0,
                "raro"
            )
        )
        result.add(
            Item(
                "Candela di Invocazione",
                "Richiede sintonia. Questa lunga e sottile candela è dedicata a una divinità" +
                        " e ne condivide l’allineamento. L’allineamento della candela può " +
                        "essere individuato dall’incantesimo individuazione del bene e male. " +
                        "Il GM sceglie il dio e l’allineamento associato a esso o lo determina casualmente." +
                        "d20     Allineamento\n" +
                        "1-2     Caotico malvagio\n" +
                        "3-4     Caotico neutrale\n" +
                        "5-7     Caotico buono\n" +
                        "8-9     Neutrale malvagio\n" +
                        "10-11   Neutrale\n" +
                        "12-13   Neutrale buono\n" +
                        "14-15   Legale malvagio\n" +
                        "16-17   Legale neutrale\n" +
                        "18-20   Legale buono\n" +
                        "( La magia della candela si attiva quando la candela viene accesa con un’azione. " +
                        "Dopo aver bruciato per 4 ore, la candela è distrutta. Puoi decidere di spegnerla " +
                        "anticipatamente per riutilizzarla più tardi. Dedurre il tempo che rimane alla " +
                        "candela prima di estinguersi a incrementi di 1 minuto, per determinare per " +
                        "quanto abbia bruciato la candela. Quando è accesa, la candela irradia luce " +
                        "fioca in un raggio di 9 metri. Qualsiasi creatura all’interno della luce e " +
                        "il cui allineamento corrisponda a quello della candela effettua tiri per " +
                        "colpire, tiri salvezza e prove di abilità con vantaggio. Inoltre, un chierico" +
                        " o druido all’interno della luce e il cui allineamento corrisponda a quello " +
                        "della candela, può lanciare gli incantesimi di 1° livello preparati senza " +
                        "spendere slot incantesimo, sebbene l’effetto dell’incantesimo è come se " +
                        "fosse lanciato usando uno slot di 1° livello. In alternativa, quando " +
                        "accendi la candela per la prima volta, puoi lanciare l’incantesimo portale. " +
                        "Farlo distrugge la candela)",
                "Oggetto meraviglioso",
                0,
                "molto raro"
            )
        )
        result.add(
            Item(
                "Cappa dell’Aracnide",
                "Richiede sintonia. Mentre indossi questo elegante abito di seta nera" +
                        " intessuto con fili d’argento, ottieni i seguenti benefici:  Hai " +
                        "resistenza ai danni da veleno.  Hai velocità di scalata pari alla tua " +
                        "velocità di passeggio.  Puoi muoverti verso l’alto, il basso e lungo" +
                        " superfici verticali e a testa in giù sui soffitti, tenendo le mani libere." +
                        "  Non puoi essere catturato da alcuna sorta di ragnatela e ti muovi attraverso " +
                        "le ragnatele come fossero terreno difficile.  Puoi usare un’azione per lanciare " +
                        "l’incantesimo ragnatela (CD del tiro salvezza 13). La ragnatela creata dall’" +
                        "incantesimo riempie il doppio della sua normale area. Una volta usata," +
                        " questa proprietà della cappa non può essere usata di nuovo fino alla " +
                        "prossima alba.",
                "Oggetto meraviglioso",
                0,
                "molto raro"
            )
        )
        result.add(
            Item(
                "Cappa di Distorsione",
                "Richiede sintonia. Mentre indossi questa cappa, essa proietta un’illusione " +
                        "che ti fa apparire come se stessi in un punto vicino alla tua reale posizione," +
                        " facendo sì che tutte le creature abbiano svantaggio ai tiri per colpire" +
                        " contro di te. Se subisci danni, la proprietà cessa di funzionare fino all’" +
                        "inizio del tuo prossimo turno. Questa proprietà è soppressa mentre sei inabile," +
                        " intralciato o altrimenti impossibilitato a muoverti.",
                "Oggetto meraviglioso",
                0,
                "raro"
            )
        )
        result.add(
            Item(
                "Cappa degli Elfi",
                "Richiede sintonia. Mentre indossi questa cappa tirando su il cappuccio," +
                        " le prove di Saggezza (Percezione) effettuate per notarti hanno svantaggio, " +
                        "e hai vantaggio alle prove di Destrezza (Furtività) effettuate per nasconderti." +
                        " Tirare su o giù il cappuccio richiede un’azione.",
                "Oggetto meraviglioso",
                0,
                "non comune"
            )
        )
        result.add(
            Item(
                "Cappa della Manta",
                "Mentre indossi questa cappa con il cappuccio tirato su, puoi respirare" +
                        " sott’acqua e hai velocità di nuoto 18 metri. Tirare su o giù il cappuccio " +
                        "richiede 1 azione.",
                "Oggetto meraviglioso",
                0,
                "non comune"
            )
        )
        result.add(
            Item(
                "Cappa del Pipistrello",
                "Richiede sintonia. Mentre indossi questa cappa, hai vantaggio alle prove " +
                        "di Destrezza (Furtività). In aree di luce fioca o oscurità, puoi afferrare " +
                        "i bordi della cappa con entrambe le mani e usarla per muoverti a velocità " +
                        "di volo 12 metri. Se dovessi smettere di tenere i bordi della cappa mentre" +
                        " voli a questo modo, perdi la tua velocità di volo. Mentre indossi la " +
                        "cappa in un’area di luce fioca o oscurità, puoi usare la tua azione per" +
                        " lanciare metamorfosi su di te, trasformandoti in un pipistrello. Quando " +
                        "sei in forma di pipistrello, mantieni i tuoi punteggi di Intelligenza, " +
                        "Saggezza e Carisma. La cappa non può essere impiegata di nuovo in questo " +
                        "modo fino alla prossima alba.",
                "Oggetto meraviglioso",
                0,
                "raro"
            )
        )
        result.add(
            Item(
                "Cappa di Protezione",
                "Richiede sintonia. Mentre indossi questa cappa, ottieni un bonus di " +
                        "+1 alla CA e ai tiri salvezza.",
                "Oggetto meraviglioso",
                0,
                "non comune"
            )
        )
        result.add(
            Item(
                "Cappello del Camuffamento",
                "Richiede sintonia. Mentre indossi questo cappello, puoi usare un’azione" +
                        " per lanciare a volontà l’incantesimo camuffare sé stesso. L’incantesimo termina " +
                        "quando il cappello viene rimosso.",
                "Oggetto meraviglioso",
                0,
                "non comune"
            )
        )
        result.add(
            Item(
                "Ceppi Dimensionali",
                "Puoi usare un’azione per piazzare queste manette su di una creatura inabile." +
                        " Le manette si adattano a qualsiasi creatura da taglia Piccola a Grande. Oltre" +
                        "a servire da comuni manette, i ceppi impediscono a una creatura legata con essi" +
                        " dall’usare qualsiasi metodo di movimento extradimensionale, compreso il teletrasporto" +
                        " o il viaggio verso piani diversi dell’esistenza. Tuttavia non impediscono" +
                        " a una creatura di attraversare un portale interdimensionale. Tu e qualsiasi" +
                        " creatura da te indicata quando fai uso dei ceppi potete usare un’azione per" +
                        " rimuoverli. Una volta ogni 30 giorni, la creatura legata può effettuare una" +
                        " prova di Forza (Atletica) con CD 30. Se la supera, la creatura si libera e distrugge i ceppi.",
                "Oggetto meraviglioso",
                0,
                "raro"
            )
        )
        result.add(
            Item(
                "Cerchietto dell’Esplosione",
                "Mentre indossi questo cerchietto, puoi usare un’azione per lanciare tramite" +
                        " esso l’incantesimo raggio rovente. Quando effettui gli attacchi dell’" +
                        "incantesimo, puoi farlo con bonus di attacco +5. Il cerchietto non potrà " +
                        "essere usato di nuovo a questo modo fino alla prossima alba.",
                "Oggetto meraviglioso",
                0,
                "non comune"
            )
        )
        result.add(
            Item(
                "Cinta dei Giganti",
                "Richiede sintonia. Mentre indossi questa cinta, il tuo punteggio " +
                        "raggiunge il punteggio conferito dalla cinta. Se il tuo punteggio" +
                        " di Forza è già pari o superiore al punteggio della cinta, l’oggetto " +
                        "non ha effetto su di te. Esistono quattro varianti di questa cinta," +
                        " corrispondenti ciascuna a una specie di veri giganti. La cinta del" +
                        " gigante di pietra e la cinta del gigante del gelo appaiono diverse," +
                        " ma hanno lo stesso effetto.\n" +
                        "Tipo  Forza  Rarità\n" +
                        "Gigante di collina            21    Raro\n" +
                        "Gigante di pietra/del gelo    23    Molto raro\n" +
                        "Gigante del fuoco             25    Molto raro\n" +
                        "Gigante delle nuvole          27    Leggendario\n" +
                        "Gigante delle tempeste        29    Leggendario",
                "Oggetto meraviglioso",
                0,
                "rarità varia"
            )
        )
        result.add(
            Item(
                "Cinta dei Nani",
                "Richiede sintonia. Mentre indossi questa cinta, ottieni i " +
                        "seguenti benefici:  Il tuo punteggio di Costituzione aumenta di 2," +
                        " fino a un massimo di 20.  Hai vantaggio alle prove di Carisma (Persuasione)" +
                        " effettuate per interagire con i nani. Inoltre, mentre sei in sintonia con la" +
                        " cinta, hai il 50% di probabilità ogni giorno all’alba di vederti spuntare" +
                        " una folta barba, se può crescerti, oppure di vedere la tua ancora più" +
                        "folta, se già la hai. Se non sei un nano, ottieni i seguenti benefici " +
                        "aggiuntivi quando indossi questa cinta:  Hai vantaggio ai tiri salvezza" +
                        " contro veleno e hai resistenza ai danni da veleno.  Hai scurovisione" +
                        " con una gittata di 18 metri.  Puoi parlare, leggere e scrivere in Nanico.",
                "Oggetto meraviglioso",
                0,
                "raro"
            )
        )
        result.add(
            Item(
                "Collana dell’Adattamento",
                "Richiede sintonia. Mentre indossi questa collana, puoi respirare " +
                        "normalmente in qualsiasi ambiente, e hai vantaggio ai tiri salvezza " +
                        "effettuati contro gas e vapori nocivi.",
                "Oggetto meraviglioso",
                0,
                "non comune"
            )
        )
        result.add(
            Item(
                "Colla Suprema",
                "Questa sostanza bianco lattea e viscosa può formare un legame adesivo" +
                        " permanente tra qualsiasi due oggetti. Deve essere contenuto in una giara o ampolla " +
                        "che è stata ricoperta all’interno di olio di scivolosità. Quando viene trovata, " +
                        "il suo contenitore ne tiene 1d6 + 1 per 30 grammi. 30 grammi di colla possono" +
                        " coprire una superficie quadrata di 30 centimetri di lato. La colla ci mette 1 " +
                        "minuto per fissarsi. Una volta fissata la colla, il legame creato può essere " +
                        "spezzato solo dal solvente universale o l’olio della forma eterea, o tramite l’incantesimo desiderio.",
                "Oggetto meraviglioso",
                0,
                "leggendario"
            )
        )
        result.add(
            Item(
                "Collana delle Palle di Fuoco",
                "Da questa collana pendono 1d6 + 3 sfere. Puoi usare un’azione per stacca" +
                        " re una sfera e lanciarla fino a 18 metri di distanza. Quando essa raggiunge" +
                        " il termine della sua traiettoria, la sfera detona come un incantesimo palla " +
                        "di fuoco di 3° livello (CD del tiro salvezza 15). Puoi lanciare più sfere, o" +
                        " anche l’intera collana, con un’azione. Quando lo fai, aumenta il livello" +
                        " della palla di fuoco di 1 per ogni sfera lanciata oltre la prima.",
                "Oggetto meraviglioso",
                0,
                "raro"
            )
        )
        result.add(
            Item(
                "Collana del Rosario",
                "Richiede sintonia da parte di un chierico, druido o paladino, Questa collana" +
                        " possiede 1d4 + 2 sfere magiche fatte di acquamarina, perla nera o topazio." +
                        " Possiede anche diverse sfere non magiche. Se una sfera magica venisse " +
                        "rimossa dalla collana, quella sfera perderebbe la sua magia. Esistono sei" +
                        " tipi di sfere magiche. Il GM decide il tipo di ciascuna sfera facente parte " +
                        "della collana. Una collana può avere più di una sfera dello stesso tipo. Per" +
                        " usarla, devi indossare la collana. Ogni sfera contiene un incantesimo che puoi" +
                        " lanciare con un’azione bonus (usando la tua CD del tiro salvezza degli incantesimi " +
                        "se richiede un tiro salvezza). Una volta che l’incantesimo di una sfera magica è " +
                        "stato lanciato, non potrai usare di nuovo quella sfera fino all’alba successiva." +
                        "d20   Sfera di…   Incantesimo\n" +
                        "1-6     Benedizione            benedizione\n" +
                        "7-12    Cura                   cura ferite (2° livello) o ristorare inferiore\n" +
                        "13-16   Favore                 ristorare superiore\n" +
                        "17-18   Punire                 punizione marchiante\n" +
                        "19      Convocare              alleato planare\n" +
                        "20      Camminare nel vento    camminare nel vento",
                "Oggetto meraviglioso",
                0,
                "raro"
            )
        )
        result.add(
            Item(
                "Corda da Arrampicata",
                "Questa corda di seta lunga 18 metri, pesa 1,5 chili e può sostenere fino a " +
                        "1.500 chili. Se impugni un’estremità della corda e usi un’azione per pronunciare" +
                        " la parola di comando, la corda si anima. Con un’azione bonus, puoi comandare " +
                        "all’altra estremità di muoversi verso una destinazione di tua scelta. Quell’" +
                        "estremità si muove di 3 metri durante il tuo turno quando riceve il tuo primo" +
                        " comando, e di 3 metri durante ciascun turno successivo finché non raggiunge " +
                        "la sua destinazione, fino alla sua lunghezza massima, o finché non le dici di " +
                        "fermarsi. Puoi anche dire alla corda di stringersi o sganciarsi da un oggetto, " +
                        "annodarsi o snodarsi, o riavvolgersi per essere trasportata. Se dici alla corda " +
                        "di compiere un nodo, grossi nodi compariranno a intervalli di 30 centimetri lungo " +
                        "la corda. Mentre è annodata, la corda diminuisce fino a un lunghezza di 15 metri " +
                        "e conferisce vantaggio alle prove effettuate per arrampicarvisi. La corda ha CA" +
                        " 20 e 20 punti ferita. Recupera 1 punto ferita ogni 5 minuti finché ha almeno 1 " +
                        "punto ferita. Se la corda scende a 0 punti ferita, è distrutta.",
                "Oggetto meraviglioso",
                0,
                "non comune"
            )
        )
        result.add(
            Item(
                "Corda dell’Intralciamento",
                "Questa corda è lunga 9 metri e pesa 1,5 chili. Se tieni un’estremità della" +
                        " corda e usi un’azione per pronunciare la sua parola di comando, l’altra estremità " +
                        "scatterà in avanti per impigliare una creatura visibile entro 6 metri da te." +
                        " Il bersaglio deve superare un tiro salvezza di Destrezza con CD 15 o restare" +
                        "intralciato. Puoi rilasciare la creatura usando un’azione bonus per pronunciare" +
                        " una seconda parola di comando. Un bersaglio intralciato dalla corda può usare" +
                        " un’azione per effettuare una prova di Forza o Destrezza con CD 15 (a scelta " +
                        "del bersaglio). Se la supera, la creatura non è più intralciata dalla corda. " +
                        "La corda ha CA 20 e 20 punti ferita. Recupera 1 punto ferita ogni 5 minuti " +
                        "finché ha almeno 1 punto ferita. se la corda scende a 0 punti ferita, è distrutta.",
                "Oggetto meraviglioso",
                0,
                "raro"
            )
        )
        result.add(
            Item(
                "Corno di Distruzione",
                "Puoi usare un’azione per pronunciare la parola di comando del corno e" +
                        " poi suonarlo, emettendo uno scoppio tonante in un cono di 9 metri e udibile" +
                        " fino a 180 metri di distanza. Ogni creatura all’interno del cono deve " +
                        "effettuare un tiro salvezza di Costituzione con CD 15. Se il tiro salvezza" +
                        " fallisce, la creatura subisce 5d6 danni da tuono e resta assordata per 1 " +
                        "minuto. Se il tiro salvezza riesce, la creatura subisce la metà dei danni e" +
                        " non è assordata. Le creature e gli oggetti fatti di vetro o cristallo hanno" +
                        " svantaggio al tiro salvezza e subiscono 10d6 danni da tuono anziché 5d6. " +
                        "Ogni uso della magia del corno ha il 20% di probabilità di farlo esplodere." +
                        " L’esplosione infligge 10d6 danni da fuoco a chi lo suona e distrugge il corno.",
                "Oggetto meraviglioso",
                0,
                "raro"
            )
        )
        result.add(
            Item(
                "Corno del Valhalla",
                "Puoi usare un’azione per suonare questo corno. Come risposta, entro" +
                        " 18 metri da te appaiono gli spiriti guerrieri di Asgard. Questi " +
                        "spiriti usano le statistiche dei berserker. Essi ritornano ad Asgard dopo 1 " +
                        "ora o quando scendono a 0 punti ferita. Una volta usato, il corno non potrà " +
                        "essere usato di nuovo prima che siano passati 7 giorni. Esistono tre tipi di " +
                        "corno del Valhalla, ognuno fatto di un metallo differente. Il tipo di corno " +
                        "determina quanti spiriti guerrieri rispondano all’evocazione, oltre al requisito " +
                        "necessario per l’uso. Il GM sceglie il tipo di corno o lo determina casualmente." +
                        "d100    Tipo    Berserker Evocati    Requisiti\n" +
                        "01-40    Argento    2d4 + 2     Nessuno\n" +
                        "41-75    Ottone     3d4 + 3     Competenza con tutte le armi semplici\n" +
                        "76-90    Bronzo     4d4 + 4     Competenza con tutte le armature medie\n" +
                        "91-100   Ferro      5d4 + 5     Competenza con tutte le armi da guerra" +
                        "Se suoni il corno senza soddisfarne i requisiti, gli spiriti guerrieri evocati ti " +
                        "attaccheranno. Se soddisfi i requisiti, essi saranno amichevoli verso di te e i " +
                        "tuoi compagni, ed eseguiranno i tuoi ordini.",
                "Oggetto meraviglioso",
                0,
                "raro (argento, ottone)"
            )
        )
        result.add(
            Item(
                "Corno del Valhalla",
                "Puoi usare un’azione per suonare questo corno. Come risposta, entro 18 metri da te " +
                        "appaiono gli spiriti guerrieri di Asgard. Questi spiriti usano le statistiche " +
                        "dei berserker. Essi ritornano ad Asgard dopo 1 ora o quando scendono a 0 punti " +
                        "ferita. Una volta usato, il corno non potrà essere usato di nuovo prima che siano " +
                        "passati 7 giorni. Esistono tre tipi di corno del Valhalla, ognuno fatto di un " +
                        "metallo differente. Il tipo di corno determina quanti spiriti guerrieri rispondano" +
                        " all’evocazione, oltre al requisito necessario per l’uso. Il GM sceglie il tipo di corno" +
                        " o lo determina casualmente.\n" +
                        "d100    Tipo    Berserker Evocati    Requisiti\n" +
                        "01-40    Argento    2d4 + 2     Nessuno\n" +
                        "41-75    Ottone     3d4 + 3     Competenza con tutte le armi semplici\n" +
                        "76-90    Bronzo     4d4 + 4     Competenza con tutte le armature medie\n" +
                        "91-100   Ferro      5d4 + 5     Competenza con tutte le armi da guerra" +
                        "Se suoni il corno senza soddisfarne i requisiti, gli spiriti guerrieri evocati ti " +
                        "attaccheranno. Se soddisfi i requisiti, essi saranno amichevoli verso di" +
                        " te e i tuoi compagni, ed eseguiranno i tuoi ordini.",
                "Oggetto meraviglioso",
                0,
                "molto raro (bronzo)"
            )
        )
        result.add(
            Item(
                "Corno del Valhalla",
                "Puoi usare un’azione per suonare questo corno. Come risposta, entro 18 metri da " +
                        "te appaiono gli spiriti guerrieri di Asgard. Questi spiriti usano le " +
                        "statistiche dei berserker. Essi ritornano ad Asgard dopo 1 ora o quando " +
                        "scendono a 0 punti ferita. Una volta usato, il corno non potrà essere " +
                        "usato di nuovo prima che siano passati 7 giorni. Esistono tre tipi di " +
                        "corno del Valhalla, ognuno fatto di un metallo differente. " +
                        "Il tipo di corno determina quanti spiriti guerrieri rispondano" +
                        " all’evocazione, oltre al requisito necessario per l’uso. Il GM " +
                        "sceglie il tipo di corno o lo determina casualmente.\n" +
                        "d100    Tipo    Berserker Evocati    Requisiti\n" +
                        "01-40    Argento    2d4 + 2     Nessuno\n" +
                        "41-75    Ottone     3d4 + 3     Competenza con tutte le armi semplici\n" +
                        "76-90    Bronzo     4d4 + 4     Competenza con tutte le armature medie\n" +
                        "91-100   Ferro      5d4 + 5     Competenza con tutte le armi da guerra" +
                        "Se suoni il corno senza soddisfarne i requisiti, gli spiriti guerrieri evocati ti " +
                        "attaccheranno. Se soddisfi i requisiti, essi saranno amichevoli verso di " +
                        "te e i tuoi compagni, ed eseguiranno i tuoi ordini.",
                "Oggetto meraviglioso",
                0,
                "leggendario (ferro) "
            )
        )
        result.add(
            Item(
                "Cubo di Forza",
                "Richiede sintonia. Questo cubo ha 2,5 centimetri di spigolo. Ogni " +
                        "faccia ha un marchio unico che può essere premuto. Il " +
                        "cubo inizia con 36 cariche, e recupera 1d20 cariche spese " +
                        "ogni giorno all’alba. Puoi usare un’azione per premere una" +
                        " delle facce del cubo, spendendo un numero di cariche basate" +
                        " sulla faccia del cubo, come mostrato sulla tabella Facce del " +
                        "Cubo di Forza. Ogni faccia ha un effetto diverso. Se al cubo non " +
                        "rimangono più cariche, non succede nulla. Altrimenti, si erge una " +
                        "barriera di forza invisibile, che forma un cubo di 4,5 metri di spigolo." +
                        " La barriera è centrata su di te, si muove con te, e dura per 1 minuto, " +
                        "fino a che non usi un’azione per premere la sesta faccia del cubo, o il " +
                        "cubo esa urisce le cariche. Puoi cambiare l’effetto della barriera premendo " +
                        "una faccia diversa del cubo e spendendo il numero di cariche richiesto," +
                        " resettandone la durata. Se il tuo movimento fa sì che la barriera entri a" +
                        " contatto con un oggetto solido che non può attraversare il cubo, finch é " +
                        "rimane la barriera non potrai avvicinarti all’oggetto.\n" +
                        "Facce del Cubo di Forza\n" +
                        "Faccia   Cariche   Effetto\n" +
                        "1        1         Gas, vento e nebbia non possono penetrare la barriera\n" +
                        "2        2         La materia non vivente non può attraversare la barriera. Muri, pavimenti " +
                        "e soffitti possono attraversarla a tua discrezione.\n" +
                        "3        3         La materia vivente non può attraversare la barriera.\n" +
                        "4        4         Gli effetti dell’incantesimo non possono attraversare la barriera.\n" +
                        "5        5         Nulla può attraversare la barriera. Muri, pavimenti e soffitti possono " +
                        "attraversarla a tua discrezione.\n" +
                        "6        0         La barriera si disattiva. il cubo perde cariche quando la barriera " +
                        "viene presa come bersaglio da certi incantesimi o entra a contatto con certi incantesimi " +
                        "o effetti di oggetti magici, come indicato nella tabella seguente." +
                        "Incantesimo o Oggetto     Cariche Perse\n" +
                        "Corno dell’esplosione    1d10\n" +
                        "Disintegrazione          1d12\n" +
                        "Muro di fuoco            1d4\n" +
                        "Passapareti              1d6\n" +
                        "Spruzzo prismatico       1d20",
                "Oggetto meraviglioso",
                0,
                "raro"
            )
        )
        result.add(
            Item(
                "Difensore",
                "Richiede sintonia. Ottieni un bonus di +3 ai tiri per colpire e " +
                        "danno effettuati con quest’arma magica. La prima volta che attacchi" +
                        " con questa spada durante un tuo turno, puoi trasferire parte o" +
                        " tutto il suo bonus alla tua Classe Armatura, invece di usare il " +
                        "bonus sugli attacchi di questo tur no. Il bonus così modificato rimane" +
                        " efficace fino all’inizio del tuo prossimo turno, ma dovrai impugnare" +
                        " la spada per ottenere il bonus alla CA da parte sua.",
                "arma (qualsiasi spada)",
                0,
                "leggendario"
            )
        )
        result.add(
            Item(
                "Elmo della Comprensione dei Linguaggi",
                "Mentre indossi questo elmo, puoi usare un’azione per lanciare a volontà" +
                        " tramite esso l’incantesimo comprendere linguaggi.",
                "Oggetto meraviglioso",
                0,
                "non comune"
            )
        )
        result.add(
            Item(
                "Elmo della Lucentezza",
                "Richiede sintonia. Questo elmo luminoso è incastonato con 1d10 diamanti, " +
                        "2d10 rubini, 3d10 opali di fuoco e 4d10 opali. Qualsiasi gemma estratta dall’" +
                        "elmo si riduce in polvere. Quando tutte le gemme sono rimosse o distrutte, l’elmo " +
                        "perde la sua magia. Mentre lo indossi ottieni i seguenti benefici:  Puoi usare " +
                        "un’azione per lanciare uno dei seguenti incantesimi (CD del tiro salvezza 18), " +
                        "usando una delle gemme dell’elmo del tipo specificato come componente: luce diurna " +
                        "(opale), muro di fuoco (rubino), palla di fuoco (opale di fuoco) o spruzzo prismatico" +
                        " (diamante). Quando l’incantesimo viene lanciato la gemma è distrutta e scompare dall’elmo." +
                        "  Finché possiede almeno un diamante, l’elmo emette luce fioca in un raggio di 9 metri quando " +
                        "almeno un non morto si trova entro quest’area. Qualsiasi non morto che inizi il suo turno " +
                        "all’interno dell’area subisce 1d6 danni radianti.  Finché l’elmo possiede almeno un " +
                        "rubino, hai resistenza ai danni da fuoco.  Finché l’elmo possiede almeno un opale di" +
                        " fuoco, puoi usare un’azione e pronunciare una parola di comando per far sì che un’arma " +
                        "che stai impugnando venga avvolta dalle fiamme. Le fiamme emettono luce intensa in un" +
                        " raggio di 3 metri e luce fioca per ulteriori 3 metri. Le fiamme sono innocue per te " +
                        "e per l’arma. Quando colpisci con un attacco sferrato con l’arma infiammata, il " +
                        "bersaglio subisce 1d6 danni da fuoco aggiuntivi. Le fiamme perdurano fino a quando " +
                        "non userai un’azione bonus per pronunciare la parola di comando di nuovo o fino" +
                        " a quando non lascerai cadere o rinfodererai l’arma. Se stai indossando l’elmo e " +
                        "subisci danni da fuoco in seguito al fallimento di un tiro salvezza contro un incantesimo," +
                        " tira un d20. Se il risultato è 1, l’elmo emette un fascio di luce tramite le gemme" +
                        " rimanenti. Ogni creatura entro 18 metri dall’elmo, a parte te, deve superare un tiro" +
                        " salvezza di Destrezza con CD 17 o venire colpita dal fascio, subendo danni radianti " +
                        "uguali al numero di gemme nell’elmo. Poi, le gemme e l’elmo vengono distrutti.",
                "Oggetto meraviglioso",
                0,
                "molto raro"
            )
        )
        result.add(
            Item(
                "Elmo della Telepatia",
                "Richiede sintonia. Mentre indossi questo elmo, puoi usare un’azione per" +
                        " lanciare tramite esso l’incantesimo individuazione dei pensieri (CD del" +
                        " tiro salvezza 13). Finché mantieni la concentrazione sull’incantesimo," +
                        " puoi usare un’azione bonus per inviare un messaggio telepatico alla " +
                        "creatura su cui sei concentrato. Essa può replicare (usando un’azione " +
                        "bonus per farlo) fino a quando continui a concentrarti su di lei. Mentre " +
                        "ti concentri su di una creatura con individuazione dei pensieri, puoi" +
                        " usare un’azione per lanciare tramite l’elmo l’incantesimo suggestione" +
                        " (CD del tiro salvezza 13) su quella creatura. Una volta usata, la " +
                        "proprietà suggestione non potrà essere usata di nuovo fino alla prossima alba.",
                "Oggetto meraviglioso",
                0,
                "non comune"
            )
        )
        result.add(
            Item(
                "Elmo del Teletrasporto",
                "Richiede sintonia. Mentre indossi questo elmo, puoi usare un’azione " +
                        "e spendere 1 carica per lanciare l’incantesimo teletrasporto tramite" +
                        " esso. L’elmo ha 3 cariche, e ne recupera 1d3 ogni mattina all’alba.",
                "Oggetto meraviglioso",
                0,
                "raro"
            )
        )

        result.add(
            Item(
                "Faretra Efficiente",
                "Ciascuno dei tre compartimenti della faretra è collegato a uno spazio " +
                        "extradimensionale che le permetta di trasportare numerosi oggetti non " +
                        "pesando mai più di 1 chilo. Il compartimento più piccolo può contenere " +
                        "fino a 60 frecce, saette od oggetti simili. Il compartimento mediano può" +
                        "contenere fino a 18 giavellotti od oggetti simili. Il compartimento più " +
                        "lungo può contenere fino a 6 oggetti lunghi, come archi, bastoni da" +
                        " combattimento o lance. Puoi estrarre qualsiasi oggetto contenuto nella " +
                        "faretra come se lo stessi prendendo da una normale faretra o fodero.",
                "Oggetto meraviglioso",
                0,
                "non comune"
            )
        )

        result.add(
            Item(
                "Fasce di Ferro del Vincolo",
                "Questa sfera di ferro arrugginita misura 7,5 " +
                        "centimetri di diametro e pesa 500 grammi." +
                        " Puoi usare un’azione per pronunciare una parola di comando e scagliare" +
                        " la sfera contro una creatura visibile di taglia Enorme o inferiore entro " +
                        "18 metri da te. La sfera si muove nell’aria, aprendosi in un reticolato di " +
                        "fasce metalliche. Effettua un tiro per colpire a distanza con un bonus di " +
                        "attacco pari al tuo modificatore di Destrezza più il tuo bonus di competenza. " +
                        "Se colpisci, il bersaglio è intralciato fino a quando non effettuerai un’azione" +
                        " bonus per pronunciare una parola di comando e liberarlo. Farlo, o mancare" +
                        " l’attacco, fa sì che le fasce si contraggano e ritornino a essere una sfera." +
                        " Una creatura, compresa quella intralciata, può usare un’azione per effettuare " +
                        "una prova di Forza con CD 20 per spezzare le fasce di ferro. Se la riesce, " +
                        "l’oggetto viene distrutto, e la creatura intralciata è libera. Se la prova " +
                        "fallisce, qualsiasi ulteriore tentativo effettuato dalla creatura fallisce " +
                        "automaticamente fino a quando non saranno trascorse 24 ore. Una volta che le" +
                        " fasce sono state usate non potranno più esserlo fino alla prossima alba.",
                "Oggetto meraviglioso",
                0,
                "raro"
            )
        )

        result.add(
            Item(
                "Fascetta dell’Intelletto",
                "Richiede sintonia. Mentre indossi questa" +
                        " fascetta la tua Intelligenza è 19. La fascetta non ha effetto se la tua " +
                        "Intelligenza è già 19 o più alta.",
                "Oggetto meraviglioso",
                0,
                "non comune"
            )
        )
        result.add(
            Item(
                "Filtro d’Amore Pozione",
                "non comune Resterai affascinato per 1 ora dalla prima creatura che vedrai" +
                        " entro 10 minuti da quando avrai bevuto questo filtro. Se la creatura è di" +
                        " una specie o genere da cui sei normalmente attratto, finché sei affascinato " +
                        "la considererai il tuo unico e grande amore.",
                "Oggetto meraviglioso",
                0,
                "non comune"
            )
        )
        result.add(
            Item(
                "Fortezza Istantanea",
                "Puoi usare un’azione per porre questo cubo di metallo di 2,5 " +
                        "centimetri di spigolo sul terreno e pronunciarne la parola di comando." +
                        " Il cubo cresce rapidamente fino a diventare una fortezza che resterà fino a" +
                        " quando userai un’azione per pronunciare la parola di comando che la congeda, " +
                        "la quale funziona solo quando la fortezza è vuota. La fortezza è una torre " +
                        "quadrata, 6 metri per lato e alta 9 metri, con feritoie su tutti i lati e " +
                        "spalti in cima. Il suo interno è diviso in due piani, con una scala che corre" +
                        " lungo una parete a congiungerli. La scala termina con una botola che si apre " +
                        "sul tetto. Quando viene attivata, la torre presenta una piccola porta sul lato" +
                        " rivolto verso di te. La porta si apre solo al tuo comando, che puoi pronunciare" +
                        " con un’azione bonus. È immune all’incantesimo scassinare e magie simili, come " +
                        "quella del battaglio dell’apertura. Ogni creatura nell’area in cui la fortezza " +
                        "compare deve effettuare un tiro salvezza di Destrezza con CD 15, subendo 10d10 " +
                        "danni contundenti se lo fallisce, o la metà di questi danni se lo riesce. In " +
                        "entrambi i casi, la creatura viene spinta in uno spazio fuori della fortezza " +
                        "ma in sua prossimità. Gli oggetti nell’area che non sono indossati o trasportati" +
                        " subiscono gli stessi danni e vengono spinti automaticamente. La torre è fatta " +
                        "di adamantio, e la sua magia le impedisce di venir ribaltata. Il tetto, la porta" +
                        " e le mura hanno 100 punti ferita ognuno, immunità ai danni dalle armi non magiche" +
                        " a eccezione delle armi da assedio, e resistenza a tutti gli altri danni. Solo " +
                        "l’incantesimo desiderio può riparare la fortezza (quest’uso dell’incantesimo è" +
                        " considerato come il replicare un incantesimo di 8° livello o inferiore). " +
                        "Ciascun lancio di desiderio fa sì che il tetto, la porta o una delle pareti " +
                        "recuperi 50 punti ferita.",
                "Oggetto meraviglioso",
                0,
                "raro"
            )
        )
        result.add(
            Item(
                "Gemma Elementale",
                "Questa gemma contiene una scintilla di energia elementale." +
                        " Quando usi un’azione per infrangere la gemma, questa evoca un elementale come " +
                        "se tu avessi lanciato l’incantesimo evoca elementali, e la magia della gemma" +
                        " svanisce. Il tipo di gemma determina l’elementale evocato dall’incantesimo. \n" +

                        "Gemma     Elementale Evocato\n" +
                        "Corindone rosso    Elementale del fuoco\n" +
                        "Diamante giallo    Elementale della terra\n" +
                        "Smeraldo           Elementale dell’acqua\n" +
                        "Zaffiro blu        Elementale dell’aria",
                "Oggetto meraviglioso",
                0,
                "non comune"
            )
        )
        result.add(
            Item(
                "Gemma della Luminosità",
                "Questo prisma ha 50 cariche. Mentre lo impugni, puoi usare un’azione per pronunciare" +
                        " una delle tre parole di comando per provocare uno dei seguenti effetti:" +
                        "  La prima parola di comando fa sì che la gemma produca una luce intensa nel" +
                        " raggio di 9 metri e luce fioca per ulteriori 9 metri. L’effetto non consuma cariche." +
                        " Dura finché non userai un’azione bonus per ripetere la parola di comando o " +
                        "finché non impiegherai un’altra funzione della gemma.  La seconda parola di " +
                        "comando spende 1 carica e fa sì che la gemma proietti una fascio di luce luminoso" +
                        " contro una creatura visibile entro 18 metri da te. La creatura deve superare" +
                        " un tiro salvezza di Costituzione con CD 15 o restare accecata per 1 minuto." +
                        " La creatura può ripetere il tiro salvezza al termine di ciascun suo turno, " +
                        "terminando l’effetto su di sé in caso lo superi.  La terza parola di comando " +
                        "spende 5 cariche e fa sì che la gemma irradi una luce accecante in un cono di 9" +
                        " metri originante da te. Ogni creatura all’interno del cono deve effettuare un " +
                        "tiro salvezza come se fosse stata colpita dal fascio creato dalla seconda parola " +
                        "di comando. Quando tutte le cariche della gemma sono state spese, la gemma diventa" +
                        " un comune gioiello del valore di 50 mo.",
                "Oggetto meraviglioso",
                0,
                "non comune"
            )
        )
        result.add(
            Item(
                "Gemma della Vista",
                "Richiede sintonia. Con un’azione, puoi pronunciare la parola di comando della gemma e " +
                        "spendere 1 carica. Per i successivi 10 minuti, quando guardi attraverso la gemma " +
                        "possiedi la visione del vero fino a 36 metri di distanza. La gemma ha 3 cariche," +
                        " e recupera 1d3 cariche spese ogni giorno all’alba.",
                "Oggetto meraviglioso",
                0,
                "raro"
            )
        )
        result.add(
            Item(
                "Giavellotto dei Fulmini",
                "Questo giavellotto è un’arma magica. Quando lo scagli e pronunci la sua parola di comando," +
                        " si trasforma in un fulmine, formando una linea larga 1,5 metri che si estende" +
                        " da te verso un bersaglio entro 36 metri. Ogni creatura sulla linea, escluso te " +
                        "e il bersaglio, deve effettuare un tiro salvezza di Destrezza con CD 13, subendo" +
                        " 4d6 danni da fulmine se lo fallisce o la metà di questi danni se lo riesce. Il " +
                        "fulmine ridiventa un giavellotto quando raggiunge il bersaglio. Se lo colpisce," +
                        " il bersaglio subisce i danni del giavellotto più 4d6 danni da fulmine. La " +
                        "proprietà del giavellotto non può più essere usata fino alla prossima alba." +
                        " Nel frattempo, il giavellotto può essere comunque usato come arma magica. ",
                "Arma (giavellotto)",
                0,
                "non comune"
            )
        )
        result.add(
            Item(
                "Guanti Afferra Proiettili ",
                "(richiede sintonia) " +
                        "Questi quanti sembrano quasi fondersi con la tua pelle quando li indossi. Quando un" +
                        " attacco con arma a distanza ti colpisce mentre li indossi, puoi usare la tua reazione" +
                        " per ridurre il danno di 1d10 + il tuo modificatore di Destrezza, purché tu abbia una" +
                        " mano libera. Se riduci il danno a 0, e il proiettile è piccolo a sufficienza da essere " +
                        "tenuto in mano, puoi afferrarlo.",
                "arma (giavellotto)",
                0,
                "non comune"
            )
        )
        result.add(
            Item(
                "Guanti d’Arme del Potere Ogre",
                "Richiede sintonia. Mentre indossi queste manopole la tua Forza è 19. Le " +
                        "manopole non hanno effetto se la tua Forza è già 19 o più alta.",
                "Oggetto meraviglioso",
                0,
                "non comune"
            )
        )
        result.add(
            Item(
                "Guanti del Nuoto e della Scalata",
                "Richiede sintonia. Mentre indossi entrambi questi guanti, la scalata e il" +
                        " nuoto non ti costano movimento aggiuntivo. Inoltre, hai un bonus di +5 alle " +
                        "prove di Forza (Atletica) effettuate mentre scali o nuoti.",
                "Oggetto meraviglioso",
                0,
                "non comune"
            )
        )
        result.add(
            Item(
                "Incensiere del Comando degli Elementali dell’Aria",
                "Mentre l’incenso brucia all’interno di questo incensiere, puoi usare un’" +
                        "azione per pronunciare la parola di comando del braciere ed evocare un " +
                        "elementale dell’aria, come se avessi lanciato l’incantesimo evoca elementali." +
                        " L’incensiere non può di nuovo essere usato a questo modo fino alla prossima alba." +
                        " Questo incensiere largo 15 centimetri e alto 30 centimetri assomiglia a un" +
                        " calice dalla copertura decorata. Pesa 0,5 chili.",
                "Oggetto meraviglioso",
                0,
                "raro"
            )
        )
        result.add(
            Item(
                "Ladra delle Nove Vite",
                "Richiede sintonia. Ottieni un bonus di +2 ai tiri per colpire e danno " +
                        "effettuati con quest’arma magica. Se ottieni un colpo critico contro una " +
                        "creatura che ha meno di 100 punti ferita, questa deve superare un tiro salvezza" +
                        " di Costituzione con CD 15 o venire immediatamente uccisa, mentre la spada" +
                        " ne risucchia la forza vitale dal corpo (i costrutti e i non morti sono immuni " +
                        "a questa proprietà). La spada ha 1d8 + 1 cariche, e perde 1 carica quando una" +
                        " creatura viene uccisa. Quando la spada non ha più cariche, perde questa proprietà.",
                "arma (qualsiasi spada)",
                0,
                "molto raro"
            )
        )
        result.add(
            Item(
                "Lama della Fortuna Arma",
                "Richiede sintonia,\n" +
                        "  Ottieni un bonus di +1 ai tiri per colpire e danno effettuati " +
                        "con quest ’ arma magica.Finché hai addosso la spada ricevi anche un \n" +
                        " bonus di +1 ai tiri salvezza ." +
                        " Fortuna. Se hai addosso la spada,\n" +
                        " puoi affidarti alla sua fortuna(non richiede un’ azione\n" +
                        "  ) per ripetere un tiro per colpire,\n" +
                        "  prova di caratteristica o tiro salvezza il cui risultato non ti soddisfa." +
                        " Sei obbligato a usare il secondo risultato del dado \n" +
                        " . Questa proprietà non può essere usata di nuovo fino alla prossima alba." +
                        "Desiderio." +
                        "Mentre la impugni,\n" +
                        "  puoi usare un ’ azione per spendere 1 carica e lanciare tramite essa l’incantesimo desiderio ." +
                        " Questa proprietà non \n" +
                        "  può essere usata di nuovo fino alla prossima alba. La spada ha 1d4 1 cariche," +
                        " e perde questa\n" +
                        "   proprietà se finisce le cariche.",
                "arma (qualsiasi spada)",
                0,
                "leggendario"
            )
        )
        result.add(
            Item(
                "Lama del Sole",
                "Richiede sintonia. Quest’oggetto sembra l’impugnatura di una spada lunga," +
                        " ma senza lama. Quando ne afferri l’impugnatura, puoi usare un’azione bonus " +
                        "per far sì che una lama di pura luminescenza si formi, o faccia sparire la" +
                        " lama inserita nell’impugnatura. Finché la spada esiste, questa spada lunga " +
                        "magica ha la proprietà precisione. Se sei competente con le spade corte o le " +
                        "spade lunghe, sei competente anche con la lama del sole. Ottieni un bonus di " +
                        "+2 ai tiri per colpire e danno effettuati con quest’arma, che infligge danni " +
                        "radianti anziché danni taglienti. Quando colpisci con essa una creatura non " +
                        "morta, il bersaglio subisce 1d8 danni radianti aggiuntivi. La lama luminosa " +
                        "della spada emette luce intensa in un raggio di 4,5 metri e luce fioca per " +
                        "ulteriori 4,5 metri. La luce è luce solare. Finché la lama è attiva, puoi " +
                        "usare un’azione per espandere o ridurre il raggio della luce intensa e fioca " +
                        "di 1,5 metri ciascuno, fino a un massimo di 9 metri o un minimo di 3 metri ciascuno.",
                "arma (spada lunga)",
                0,
                "raro"
            )
        )
        result.add(
            Item(
                "Lanciatore Nanico",
                "Richiede sintonia da parte di un nano. Ottieni un bonus di +3 ai tiri per" +
                        " colpire e danno effettuati con quest’arma magica. Essa ha la proprietà da " +
                        "lancio con una gittata normale di 6 metri e una gittata lunga di 18 metri." +
                        " Quando colpisci con un attacco a distanza usando quest’arma, essa infligge" +
                        " 1d8 danni aggiuntivi o, se il bersaglio è un gigante, 2d8 danni aggiuntivi." +
                        " Subito dopo l’attacco, l’arma vola indietro nella tua mano.",
                "arma (martello da guerra)",
                0,
                "molto raro"
            )
        )
        result.add(
            Item(
                "Lanterna della Rivelazione",
                "Mentre è accesa, questa lanterna coperta brucia per 6 ore con 1 pinta d’olio," +
                        " irradiando luce intensa in un raggio di 9 metri e luce fioca per ulteriori" +
                        " 9 metri. Le creature e gli oggetti invisibili sono resi visibili mentre " +
                        "si trovano sotto la luce intensa della lanterna. Puoi usare un’azione per" +
                        " abbassare la copertura, riducendo la luce a fioca con un raggio di 1,5 metri.",
                "Oggetto meraviglioso",
                0,
                "non comune"
            )
        )
        result.add(
            Item(
                "Lingua di Fuoco",
                "Richiede sintonia. Puoi usare un’azione bonus per pronunciare la parola " +
                        "di comando di questa spada magica, facendo sì che dalla sua lama eruttino" +
                        " fiamme. Queste fiamme irradiano luce intensa in un raggio di 12 metri e " +
                        "luce fioca per ulteriori 12 metri. Mentre la spada è in fiamme, infligge" +
                        " 2d6 danni da fuoco aggiuntivi a qualsiasi bersaglio colpisca. Le fiamme" +
                        " durano fino a che non usi un’azione bonus per pronunciare di nuovo la parola" +
                        " di comando o finché non lasci cadere o rinfoderi l’arma.",
                "arma (qualsiasi spada)",
                0,
                "raro"
            )
        )
        result.add(
            Item(
                "Mantella del Ciarlatano",
                "Mentre indossi questa mantella che odora lievemente di zolfo, puoi usarla" +
                        "per lanciare l’incantesimo porta dimensionale con un’azione. La proprietà di " +
                        "questa mantella non può essere usata di nuovo fino all’alba. Quando scompari," +
                        " ti lasci alle spalle una nube di fumo, e riappari alla tua destinazione all’" +
                        "interno di una simile nube di fumo. Questo fumo oscura leggermente lo spazio " +
                        "che hai lasciato e quello dove riappari, e si dissipa alla fine del tuo prossimo" +
                        " turno. Un vento leggero o più forte disperde il fumo.",
                "Oggetto meraviglioso",
                0,
                "raro"
            )
        )
        result.add(
            Item(
                "Mantello della Resistenza agli Incantesimi",
                "Richiede sintonia. Mentre indossi questa cappa, hai vantaggio ai tiri " +
                        "salvezza contro incantesimi.",
                "Oggetto meraviglioso",
                0,
                "raro"
            )
        )
        result.add(
            Item(
                "Manuale degli Esercizi Pratici",
                "Questo libro descrive esercizi atletici, e le sue parole sono soffuse di " +
                        "magia. Se trascorri 48 ore in un periodo di 6 giorni o meno a studiare i contenuti " +
                        "del libro e praticarne le indicazioni, il tuo punteggio di Forza aumenta di 2," +
                        " e così fa il tuo punteggio massimo per quella caratteristica. Poi il manuale" +
                        " perde la sua magia, per recuperarla dopo un secolo.",
                "Oggetto meraviglioso",
                0,
                "molto raro"
            )
        )
        result.add(
            Item(
                "Manuale dei Golem",
                "Questo tomo contiene le informazioni e incantamenti necessari a costruire un tipo" +
                        " particolare di golem. Il GM sceglie il tipo di golem che è possibile costruire" +
                        " o lo determina casualmente. Per decifrare e usare il manuale, devi essere un " +
                        "incantatore con almeno due slot incantesimo di 5° livello. Una creatura che non" +
                        " possa usare il manuale dei golem e provi a leggerlo, subisce 6d6 danni psichici." +
                        "d20     Golem     Tempo     Costo\n" +
                        "1-5     Argilla     30 giorni     65.000 mo\n" +
                        "6-17    Carne       60 giorni     50.000 mo\n" +
                        "18      Ferro       120 giorni    100.000 mo\n" +
                        "19-20   Pietra      90 giorni     80.000 mo" +
                        "Per creare un golem, devi trascorrere il tempo sopra indicato, lavorando senza" +
                        " interruzione con il manuale a disposizione e riposando per non più di 8 ore al giorno. " +
                        "Devi anche pagare il costo specificato per acquistare i materiali necessari. Una volta finito " +
                        "di creare il gol em, il libro viene consumato da fiamme arcane. Il golem si anima quando le" +
                        " ceneri del anuale saranno sparse su di esso. Sarà sotto il tuo controllo, e comprende e" +
                        " obbedisce gli ordini pronunciati da te.",
                "Oggetto meraviglioso",
                0,
                "molto raro"
            )
        )
        result.add(
            Item(
                "Manuale della Rapidità d’Azione",
                "Questo libro contiene esercizi di coordinazione ed equilibrio, e le sue parole " +
                        "sono soffuse di magia. Se trascorri 48 ore in un periodo di 6 giorni o meno a studiare " +
                        "i contenuti del libro e praticarne le indicazioni, il tuo punteggio di Destrezza aumenta di" +
                        " 2, e così fa il tuo punteggio massimo per quella caratteristica. Poi il manuale perde la " +
                        "sua magia, per recuperarla dopo un secolo.",
                "Oggetto meraviglioso",
                0,
                "molto raro"
            )
        )
        result.add(
            Item(
                "Manuale della Salute Fisica",
                "Questo libro contiene suggerimenti salutari e alimentari, e le sue parole sono " +
                        "soffuse di magia. Se trascorri 48 ore in un periodo di 6 giorni o meno a studiare " +
                        "i contenuti del libro e praticarne le indicazioni, il tuo punteggio di Costituzione " +
                        "aumenta di 2, e così fa il tuo punteggio massimo per quella caratteristica. Poi il " +
                        "manuale perde la sua magia, per recuperarla dopo un secolo.",
                "Oggetto meraviglioso",
                0,
                "molto raro"
            )
        )
        result.add(
            Item(
                "Martello dei Fulmini",
                "Ottieni un bonus di +1 ai tiri per colpire e di danno effettuati con quest’arma " +
                        "magica. Anatema dei Giganti (richiede sintonia). Devi indossare una cinta dei giganti" +
                        " (qualsiasi varietà) e i guanti d’arme della potenza ogre per sintonizzarti con quest’arma." +
                        " La sintonia termina se rimuovi uno qualsiasi di questi oggetti. Mentre sei in sintonia " +
                        "con quest’arma e la impugni, il tuo punteggio di Forza aumenta di 4 e può eccedere 20, " +
                        "ma non 30. Quando ottieni 20 sul tiro per colpire effettuato con quest’arma contro un gigante, " +
                        "il gigante deve superare un tiro salvezza di Costituzione con CD 17 o morire. Mentre sei in sintonia " +
                        "con esso, puoi spendere 1 carica ed effettuare un attacco con arma a distanza con il martello, " +
                        "scagliandolo come se avesse la proprietà da lancio con un gittata normale di 6 metri e una gittata" +
                        " lunga di 18 metri. Se l’attacco colpisce, il martello produce un tuono udibile fino a 90 metri " +
                        "di distanza. Il bersaglio e tutte le creature entro 9 metri da esso devono superare un tiro " +
                        "salvezza di Costituzione con CD 17 o restare stordite fino al termine del tuo prossimo turno. " +
                        "Il martello ha 5 cariche, e recupera 1d4 + 1 cariche spese ogni giorno all’alba.",
                "arma (maglio)",
                0,
                "leggendario"
            )
        )
        result.add(
            Item(
                "Mazza della Distruzione",
                "Richiede sintonia. Quando colpisci un immondo o un non morto con quest’arma magica, " +
                        "quella creatura subisce 2d6 danni radianti aggiuntivi. Se, dopo aver subito il danno, " +
                        "al bersaglio rimangono 25 punti ferita o meno, questi deve superare un tiro salvezza " +
                        "di Saggezza con CD 15 o venire distrutto. Se il tiro salvezza riesce, la creatura resta " +
                        "spaventata da te fino al termine del tuo prossimo turno. Mentre impugni quest’arma, essa" +
                        " irradia luce intensa in un raggio di 6 metri e luce fioca per ulteriori 6 metri.",
                "arma (mazza)",
                0,
                "raro"
            )
        )
        result.add(
            Item(
                "Mazza della Punizione",
                "Ottieni un bonus di +1 ai tiri per colpire e danno effettuati con quest’arma" +
                        " magica. Il bonus aumenta a +3 quando usi quest’arma per attaccare un costrutto." +
                        " Quando ottieni un 20 al tiro per colpire effettuato con quest’arma, il bersaglio " +
                        "subisce 7 danni contundenti aggiuntivi, o 14 danni contundenti aggiuntivi se è un " +
                        "costrutto. Se, dopo aver subito questi danni, a un costrutto restano 25 punti ferita " +
                        "o meno, viene distrutto.",
                "arma (mazza)",
                0,
                "raro"
            )
        )
        result.add(
            Item(
                "Mazza del Terrore",
                "Richiede sintonia. Mentre la impugni, puoi usare un’azione e spendere 1 carica" +
                        " per scatenare un’ondata di terrore. Ogni creatura di tua scelta, in un raggio" +
                        " di 9 metri a partire da te, deve superare un tiro salvezza di Saggezza con CD" +
                        " 15 o restare spaventata da te per 1 minuto. Mentre è spaventata a questo modo," +
                        " una creatura deve impiegare i suoi turni a cercare di muoversi più lontano possibile" +
                        " da te, e non può consapevolmente muoversi in uno spazio che sia entro 9 metri da te. " +
                        "Inoltre non può effettuare reazioni. Come sua azione, può usare solo l’azione Scattare" +
                        " o cercare di fuggire da un effetto che le impedisca di muoversi. Se non può muoversi" +
                        " da nessuna parte, la creatura può usare l’azione Schivare. Al termine di ciascun suo" +
                        " turno, la creatura può ripetere il tiro salvezza, terminando l’effetto per sé in caso lo" +
                        " superi. Quest’arma magica ha 3 cariche, e recupera 1d3 cariche ogni giorno all’alba.)",
                "Arma (mazza)",
                0,
                "raro"
            )
        )
        result.add(
            Item(
                "Mazzo delle Illusioni",
                "Questa scatola contiene un set di carte di pergamena. Un mazzo completo contiene " +
                        "34 carte, ognuna raffigurante una creatura diversa. Le creature rappresentate" +
                        " vengono lasciate alla discrezionalità del GM. Di solito i mazzi trovati in giro" +
                        " sono privi di 1d20 – 1 carte. La magia del mazzo funziona solo se le carte vengono" +
                        " pescate a caso (potete usare un mazzo di normali carte da gioco modificato per " +
                        "simulare il mazzo delle illusioni). Puoi usare un’azione per pescare una carta " +
                        "dal mazzo e scagliarla in un punto sul terreno a 9 metri da te. L’illusione di " +
                        "una o più creature si forma sopra la carta lanciata e rimane finché non viene dissolta." +
                        " La creatura illusoria sembra reale, della taglia appropriata, e si comporta come " +
                        "fosse una vera creatura, eccetto che non può recare danni. Finché resti entro 36 " +
                        "metri dalla creatura illusoria e puoi vederla, puoi usare un’azione per muoverla magicamente " +
                        "in qualsiasi punto entro 9 metri dalla carta. Qualsiasi interazione fisica con la creatura" +
                        " illusoria la rivela come illusione, dato che gli oggetti le passano attraverso. Qualcuno " +
                        "che usi un’azione per ispezionare visivamente la creatura, la identifica come illusoria " +
                        "superando una prova di Intelligenza (Indagare) con CD 15. La creatura le apparirà quindi" +
                        " trasparente. L’illusione permane finché la carta non viene mossa o l’illusione dissolta." +
                        " Quando l’illusione termina, l’immagine sulla carta scompare, e quella carta non potrà più essere usata." +
                        "Carta da Gioco     Illusione\n" +
                        "Asso di cuori      Drago rosso\n" +
                        "Re di cuori         Cavaliere e quattro guardie\n" +
                        "Regina di cuori     Succube o incubo\n" +
                        "Fante di cuori      Druido\n" +
                        "Dieci di cuore      Gigante delle nuvole\n" +
                        "Nove di cuori       Ettin\n" +
                        "Otto di cuori       Bugbear\n" +
                        "Due di cuori        Goblin\n" +
                        "Asso di quadri      Beholder\n" +
                        "Re di quadri        Arcimago e mago apprendista\n" +
                        "Regina di quadri    Megera notturna\n" +
                        "Fante di quadri     Assassino\n" +
                        "Dieci di quadri     Gigante del fuoco\n" +
                        "Nove di quadri      Oni\n" +
                        "Otto di quadri      Gnoll\n" +
                        "Due di quadri       Coboldo\n" +
                        "Asso di picche      Lich\n" +
                        "Re di picche        Sacerdote e due accoliti\n" +
                        "Regina di picche    Medusa\n" +
                        "Fante di picche     Veterano\n" +
                        "Dieci di picche     Gigante del gelo\n" +
                        "Nove di picche      Troll\n" +
                        "Otto di picche      Hobgoblin\n" +
                        "Due di picche       Goblin\n" +
                        "Asso di fiori       Golem di ferro\n" +
                        "Re di fiori         Capitano bandito e tre banditi\n" +
                        "Regina di fiori     Erinni\n" +
                        "Fante di fiori      Berserker\n" +
                        "Dieci di fiori      Gigante di collina\n" +
                        "Nove di fiori       Ogre\n" +
                        "Otto di fiori       Orco\n" +
                        "Due di fiori        Coboldo\n" +
                        "Jolly (2)           Tu (il proprietario del mazzo)",
                "Oggetto meraviglioso",
                0,
                "non comune"
            )
        )
        result.add(
            Item(
                "Mazzo delle Meraviglie",
                "Di solito lo si trova in un borsello o una scatola, che contiene delle carte " +
                        "fatte d’avorio o vello. La maggior parte di questi mazzi (il 75%) ha solo " +
                        "tredici carte, mentre i restanti mazzi ne hanno ventidue. Prima di pescare una carta, " +
                        "devi dichiarare quante carte intendi pescare e poi pescarle casualmente (puoi usare " +
                        "un mazzo di carte da gioco modificato per simulare il mazzo). Qualsiasi carta pescata in" +
                        " eccesso di questo numero non ha effetto. Altrimenti, appena peschi una carta dal mazzo," +
                        " la sua magia ha effetto. Devi pescare ciascuna carta entro 1 ora dalla pescata precedente." +
                        " Se non peschi il numero scelto di carte, il numero di carte rimanenti uscirà fuori dal" +
                        " mazzo spontaneamente e avrà effetto in contemporanea. Una volta estratta una carta, questa " +
                        "svanirà dall’esistenza. A meno che la carta non sia il Matto o il Buffone, la carta ricompare" +
                        " nel mazzo, rendendo possibile pescare due volte la stessa carta." +
                        "Carta da Gioco     Carta\n" +
                        "Asso di quadri     Visir*\n" +
                        "Re di quadri       Sole\n" +
                        "Regina di quadri   Luna\n" +
                        "Fante di quadri    Stella\n" +
                        "Due di quadri      Cometa*\n" +
                        "Asso di cuori      Fato*\n" +
                        "Re di cuori        Trono\n" +
                        "Regina di cuori    Chiave\n" +
                        "Fante di cuori     Cavaliere\n" +
                        "Due di cuori       Gemma*\n" +
                        "Asso di fiori      Speroni*\n" +
                        "Re di fiori        Il Vuoto\n" +
                        "Regina di fiori    Fiamme\n" +
                        "Fante di fiori     Teschio\n" +
                        "Due di fiori       Idiota°\n" +
                        "Asso di picche     Dongione*\n" +
                        "Re di picche       Rovina\n" +
                        "Regina di picche   Euriale\n" +
                        "Due di picche      Appeso*\n" +
                        "Jolly              Matto*\n" +
                        "Jolly              Buffone\n" +
                        "* Solo in mazzo da 22 carte\n" +
                        "Appeso (solo in mazzo da 22). La tua mente è sconvolta, e cambi allineamento. Il legale diventa " +
                        "caotico, il buono diventa malvagio e viceversa. Se sei neutrale puro o disallineato, questa " +
                        "carta non avrà alcun effetto su di te.\n" +
                        "Buffone. Ottieni 10.000 PE o puoi pescare due carte aggiuntive oltre alle tue pescate " +
                        "dichiarate.\n" +
                        "Cavaliere. Ottieni i servigi di un guerriero di 4° livello che compare in uno spazio a tua " +
                        "scelta entro 9 metri da te. Il guerriero è della tua stessa razza e ti servirà lealmente " +
                        "fino alla morte, credendo che sia stato il fato a portarlo al tuo servizio. Il personaggio " +
                        "è controllato da te.\n" +
                        "Chiave. Un’arma magica rara, molto rara o leggendaria con la quale sei competente compare " +
                        "tra le tue mani. Il GM determina di che tipo di arma si tratta.\n" +
                        "Cometa (solo in mazzo da 22). Se sconfiggi da solo il prossimo mostro o gruppo ostile che incontrerai," +
                        " otterrai abbastanza punti esperienza da guadagnare un livello. Altrimenti, questa carta non avrà effetto.\n" +
                        "Euriale. Sei maledetto dalla carta e subisci una penalità di -2 a tutti i tiri salvezza finché resterai " +
                        "maledetto a questo modo. Solo un dio o la magia della carta del Fato può porre fine a questa maledizione.\n" +
                        "Fato (solo in mazzo da 22). La struttura della realtà si dissolve e riforma, permettendoti di evitare " +
                        "o cancellare un evento come se non fosse mai accaduto. Puoi usare la magia di questa carta non appena " +
                        "l’hai pescata o aspettare un qualsiasi altro momento fino alla tua morte.\n" +
                        "Fiamme. Un potente diavolo diventa tuo nemico. Il diavolo cercherà di rovinare e infestare la tua esistenza," +
                        " assaporando le tue sofferenze fino al momento in cui cercherà di ucciderti. Questa inimicizia durerà fino" +
                        " alla morte tua o del diavolo.\n" +
                        "Furfante. Un personaggio non dei giocatori a scelta Un personaggio non dei giocatori a scelta del del GM " +
                        "diventa ostile nei tuoi confronti. L’identità del nuovo nemico è ignota fino a quando il PNG o qualcun altro " +
                        "la rivelerà. Nulla a meno di un desiderio o intervento divino potrà porre fine all’ostilità del PNG nei tuoi confronti.\n" +
                        "Gemma (solo in mazzo da 22). Davanti ai tuoi piedi compaiono venticinque gioielli del valore di 2.000 mo ciascuno o " +
                        "cinquanta gemme del valore di 1.000 mo ciascuna.\n" +
                        "Idiota (solo in mazzo da 22). Riduci permanentemente il tuo punteggio di Intelligenza di 1d4 + 1 (fino a un" +
                        " punteggio minimo di 1). Puoi pescare un’ulteriore carta prima delle tue altre pescate dichiarate." +
                        "Luna. Ricevi la capacità di lanciare l’incantesimo desiderio 1d3 volte.\n" +
                        "Matto (solo in mazzo da 22). Perdi 10.000 PE, scarti questa carta, e peschi di nuovo dal mazzo, contando " +
                        "entrambe le pescate come solo una delle tue pescate. Se perdere quel numero di PE ti farebbe perdere un livello," +
                        " rimarrai invece con il numero di PE appena sufficienti per mantenere il tuo livello.\n" +
                        "Rovina. Perdi tutte le ricchezze che hai con te, a parte gli altri oggetti magici. Attività, edifici e le terre" +
                        " che possiedi vengono perse nel modo che altera di meno la realtà. Qualsiasi documento che provi che tu sia il " +
                        "proprietario di qualcosa che hai perso a causa di questa carta, scompare.\n" +
                        "Sole. Ottieni 50.000 PE, e un oggetto meraviglioso (determinato dal GM) compare tra le tue mani.\n" +
                        "Sotterraneo (solo in mazzo da 22). Scompari e vieni Scompari e vieni sepolto in uno stato dsepolto in uno stato di " +
                        "animazione sospesa all’interno di i animazione sospesa all’interno di una sfera extradimensionale. Tutto " +
                        "ciò che stavi indossando o trasportando rimane nello spazio da te occupato quando sei scomparso. Rimarrai" +
                        " imprigionato finché non sarai ritrovato e rimosso dalla sfera. Non puoi essere essere localizzato tramite " +
                        "nessuna magia di divinazione, ma l’incantesimo desiderio può rivelare la posizione della tua prigione. Non " +
                        "si pescano ulteriori carte.\n" +
                        "Speroni (solo in mazzo da 22). Ogni oggetto magico che indossi o trasporti viene disintegrato. Gli artefatti" +
                        " in tuo possesso non vengono disintegrati, ma svaniscono.\n" +
                        "Stella. Aumenta un tuo punteggio di caratteristica di 2. Il punteggio può superare il 20, ma non può superare 24.\n" +
                        "Teschio. Evochi un avatara della morte (uno spettrale scheletro umanoide avvolto in una vestaglia nera e sbrindellata," +
                        " il quale impugna una falce spettrale). Esso compare in uno spazio a scelta del GM entro 3 metri da te e ti attacca, " +
                        "avvisando tutti gli altri che devi vincere la battaglia da solo. L’avatar combatte fino alla tua morte o finché non " +
                        "scende a 0 punti ferita, al che svanisce. Se qualcuno cerca di aiutarti, costui evocherà il proprio avatar della morte." +
                        " Una creatura uccisa da un avatar della morte non può essere riportata in vita.\n" +
                        "Trono. Ottieni la competenza nell’abilità Persuasione, e raddoppi il tuo bonus di competenza nelle prove effettuate con " +
                        "quell’abilità. Inoltre, ottieni il diritto di proprietà su di una piccola rocca da qualche parte nel mondo. Tuttavia," +
                        " la rocca è attualmente occupata da mostri, che dovrai cacciare prima di poterla rivendicare come tua.\n" +
                        "Visir (solo in mazzo da 22). In qualsiasi momento di tua scelta, entro un anno da quando hai pescato questa carta, " +
                        "puoi chiedere, meditando, risposta a una tua domanda e ricevere una risposta veritiera a essa. A parte fornire " +
                        "informazioni, la risposta può aiutarti a risolvere un problema complesso o un dilemma. In altre parole, la" +
                        " conoscenza è fornita assieme alla saggezza su come impiegarla.\n" +
                        "Vuoto. Questa carta nera è indice di disastro. La tua anima viene rapita dal corpo e imprigionata all’interno di " +
                        "un oggetto in un luogo a scelta del GM. Una o più potenti creature proteggono questo luogo. Finché la tua anima è " +
                        "così intrappolata, il tuo corpo è inabile. L’incantesimo desiderio non è in grado di ripristinare la tua anima, ma" +
                        " può rivelare il luogo in cui si trova l’oggetto che la contiene. Non si pescano più carte.",
                "Oggetto meraviglioso",
                0,
                "leggendario"
            )
        )
        result.add(
            Item(
                "Medaglione dei Pensieri",
                "Richiede sintonia. Mentre indossi questo medaglione, puoi usare un’azione e spendere 1 carica per lanciare " +
                        "tramite esso l’incantesimo individuazione dei pensieri (CD del tiro salvezza 13). Il medaglione ha 3 cariche, " +
                        "e recupera 1d3 cariche spese ogni giorno all’alba.",
                "Oggetto meraviglioso",
                0,
                "non comune"
            )
        )
        result.add(
            Item(
                "Miniatura dal Potere Meraviglioso",
                "Una miniatura dal potere meraviglioso è una statuetta di una bestia, piccola a sufficienza da entrare in" +
                        " tasca. Se usi un’azione per pronunciare una parola di comando e lanciare la miniatura in un punto del terreno" +
                        " entro 18 metri da te, la miniatura diventa una creatur a vivente. Se lo spazio in cui la creatura dovesse apparire " +
                        "è occupato da un’altra creatura o d oggetto, o se non c’è spazio sufficiente per la creatura, la miniatura non si " +
                        "trasforma. La creatura è amichevole nei confronti tuoi e dei tuoi compagni. Compren de i tuoi lingu aggi e " +
                        "obbedisce agli ordini impartitele. Se non le impartisci ordini, la creatura si difende ma non effettua altre azioni." +
                        " Vedi il Bestiario per le altre statistiche della creatura. La creatura resta per la durata specificata per ciascuna " +
                        "miniatura. Al termine della durata, la creatura ritorna alla sua forma di miniatura. Si trasforma anticipatamente se scende " +
                        "a 0 punti ferita o se usi un’azione per pronunciare la parola di comando di nuovo mentre la tocchi. Dopo che la creatura è " +
                        "tornata a essere una miniatura, le sue proprietà non possono più essere usate fino a quando non sarà trascorso un certo " +
                        "ammontare di tempo, come specificato nella descrizione della miniatura.\n" +
                        "Cane di Onice (Raro). Questa statuetta di onice raffigura un cane. Può diventare un mastino per un massimo di 6 ore. Il" +
                        " mastino ha Intelligenza 8 e può parlare Comune. Inoltre ha scurovisione con una gittata di 18 metri e può vedere le " +
                        "creature e gli oggetti invisibili entro quella gittata. Una volta usata, non può essere usata di nuovo prima che siano " +
                        "passati 7 giorni.\n" +
                        "Caprone d’Avorio (Raro). Queste statuette d’avorio di caproni sono sempre create in set da tre. Ogni caprone ha un " +
                        "aspetto unico e funziona in modo diverso dagli altri. Le loro proprietà sono le seguenti:  Il caprone del terrore " +
                        "può diventare un caprone gigante per un massimo di 3 ore. Il caprone non può attaccare, ma puoi rimuoverne i corni e" +
                        " usarli come armi. Un corno diventa una lancia da cavaliere +1 mentre l’altro diventa una spada lunga +2. Rimuovere un" +
                        " corno richiede un’azione, e le armi scompaiono e i corni ricompaiono quando il caprone torna alla sua forma di miniatura." +
                        " Inoltre, il caprone irradia un’aura di terrore con raggio 9 metri finché lo cavalchi. Qualsiasi creatura a te ostile che" +
                        " inizi il proprio turno all’interno dell’aura deve superare un tiro salvezza di Saggezza con CD 15 o restare spaventata" +
                        " dal caprone per 1 minuto, o finché il caprone non torna alla forma di miniatura. La creatura spaventata può ripetere il" +
                        " tiro salvezza al termine di ciascun suo turno, terminando l’effetto se lo supera. Una volta che ha riuscito il tiro salvezza" +
                        " contro questo effetto, una creatura è immune all’aura del caprone per le successive 24 ore. Una volta usata, la miniatura " +
                        "non può essere usato di nuovo prima che siano passati 15 giorni.  Il caprone del travaglio può diventare un caprone " +
                        "gigante per un massimo di 3 ore. Una volta usato, non può essere usato di nuovo prima che siano passati 30 giorni.  " +
                        "Il caprone del viaggio può d iventare un caprone Grande con le stesse statistiche di un cavallo da corsa. Ha 24 cariche," +
                        " e ciascuna ora o porzione di essa che trascorre in forma di bestia costa 1 carica. Finché ha cariche, lo puoi usare quanto" +
                        " ti pare. Una volta terminate le cariche, ritorna a essere una miniatura e non può essere usato di nuovo prima che siano " +
                        "passati 7 giorni, allorché avrà recuperato tutte le sue cariche.\n" +
                        "Corvo d’Argento (Non Comune). Questa statuetta d’argento raffigura un corvo. Può diventare un corvo per un massimo di 6 " +
                        "ore. Una volta usata, non può essere usata di nuovo prima che siano passati 2 giorni. Mentre è in forma di corvo, la miniatura" +
                        " ti permette di lanciare a volontà l’incantesimo messaggero animale su di essa.\n" +
                        "Destriero di Ossidiana (Molto Raro). Questa statuetta di ossidiana liscia diventa un incubo per un massimo di 24 ore. L’incubo" +
                        " combatte solo per difendersi. Una volta usata, non può essere usata di nuovo prima che siano passati 5 giorni. Se sei di " +
                        "allineamento buono, c’è una probabilità del 10% che ogni volta che la usi, la miniatura ignori i tuoi ordini, compreso " +
                        "l’ordine di tornare alla sua normale forma di miniatura. Se cavalchi l’incubo mentre ignora i tuoi ordini, venite entrambi " +
                        "trasportati ai Piani Inferi, dove l’incubo torna alla sua forma di miniatura.\n" +
                        "Elefante di Marmo (Raro). Questa statuetta di marmo è larga e alta circa 10 centimetri. Può diventare un elefante per un " +
                        "massimo di 24 ore. Una volta usata, non può essere usata di nuovo prima che siano passati 7 giorni.\n" +
                        "Grifone di Bronzo (Raro). Questa statuetta di bronzo raffigura un grifone rampante. Può diventare un grifone per un massimo " +
                        "di 6 ore. Una volta usata, non può essere usata di nuovo prima che siano passati 5 giorni.\n" +
                        "Gufo Serpentino (Raro). Questa statuetta serpentina di un gufo può diventare un gufo gigante per un massimo di 8 ore. " +
                        "Una volta usata, non può essere usata di nuovo prima che siano passati 2 giorni. Se vi trovate sullo stesso piano di esistenza," +
                        " il gufo può comunicare telepaticamente con te a qualsiasi distanza.\n" +
                        "Leoni d’Oro (Raro). Queste statuette d’oro di leoni sono sempre create a coppie. Puoi usare una o entrambe le miniature" +
                        " contemporaneamente. Ciascuna può diventare un leone per un massimo di 1 ora. Una volta usato uno dei leoni, questi non " +
                        "può essere usato di nuovo prima che siano passati 7 giorni.\n" +
                        "Mosca d’Ebano (Raro). Questa statuetta d’ebano raffigura un moscone. Può diventare una mosca gigante (vedi sotto) per un " +
                        "massimo di 12 ore, durante le quali può essere usata come cavalcatura. Una volta usata, non può essere usata di nuovo prima" +
                        " che siano passati 2 giorni.",
                "Oggetto meraviglioso",
                0,
                "non comune, raro, molto raro (vedi miniatura)"
            )
        )
        result.add(
            Item(
                "Munizione +1",
                "Hai un bonus ai tiri per colpire e ai tiri di danno effettuati con questo pezzo di munizione magica. Il" +
                        " bonus è determinato dalla rarità dell’arma. Una volta che colpisce un bersaglio, la munizione perde la sua magia.",
                "arma (qualsiasi munizione)",
                0,
                "non comune"
            )
        )
        result.add(
            Item(
                "Munizione +2",
                "Hai un bonus ai tiri per colpire e ai tiri di danno effettuati con questo pezzo di munizione magica." +
                        " Il bonus è determinato dalla rarità dell’arma. Una volta che colpisce un bersaglio, la munizione perde la sua magia.",
                "arma (qualsiasi munizione)",
                0,
                "raro"
            )
        )
        result.add(
            Item(
                "Munizione +3",
                "Hai un bonus ai tiri per colpire e ai tiri di danno effettuati con questo pezzo di munizione magica. " +
                        "Il bonus è determinato dalla rarità dell’arma. Una volta che colpisce un bersaglio, la munizione perde la sua magia.",
                "arma (qualsiasi munizione)",
                0,
                "molto raro"
            )
        )
        result.add(
            Item(
                "Munizione dell’Uccisione",
                "Se una creatura appartenente al tipo, razza o gruppo a cui la freccia dell’uccisione è associata " +
                        "subisce danni dalla freccia, la creatura deve effettuare un tiro salvezza di Costituzione con CD 17, " +
                        "subendo 6d10 danni perforanti aggiuntivi se lo fallisce, o la metà di questi danni se lo riesce. Una " +
                        "volta che la freccia dell’uccisione ha inflitto danni aggiuntivi alla creatura, diventa una freccia non magica.",
                "arma (freccia, saetta)",
                0,
                "molto raro"
            )
        )
        result.add(
            Item(
                "Occhi Affascinanti",
                "Richiede sintonia. Mentre indossi queste lenti di cristallo davanti agli occhi, puoi spendere 1" +
                        " carica con un’azione per lanciare l’incantesimo charme su persone (CD del tiro salvezza 13) su di un" +
                        " umanoide entro 9 metri da te, purché tu e il bersaglio vi possiate vedere. Le lenti hanno 3 cariche e " +
                        "recuperano tutte quelle spese ogni giorno all’alba.",
                "Oggetto meraviglioso",
                0,
                "non comune"
            )
        )
        result.add(
            Item(
                "Occhi dell’Aquila",
                "Richiede sintonia. Mentre indossi queste lenti di cristallo davanti agli occhi, hai vantaggio alle prove di Saggezza " +
                        "(Percezione) basate sulla vista. In condizioni di visibilità limpida, puoi distinguere i dettagli anche di creature e " +
                        "oggetti molto distanti delle dimensioni di 50 centimetri.",
                "Oggetto meraviglioso",
                0,
                "non comune"
            )
        )
        result.add(
            Item(
                "Occhi della Vista Dettagliata",
                "Mentre indossi queste lenti di cristallo davanti agli occhi, puoi vedere molto meglio del normale" +
                        " fino a una distanza di 30 centimetri. Hai vantaggio alle prove di Intelligenza (Indagare) basate sulla " +
                        "vista mentre perlustri un’area o studi un oggetto a distanza.",
                "Oggetto meraviglioso",
                0,
                "non comune"
            )
        )
        result.add(
            Item(
                "Occhiali da Notte",
                "Mentre indossi queste lenti scure, possiedi la scurovisione, con una gittata di 18 metri. Se già " +
                        "possiedi la scurovisione, indossare questi occhiali ne aumenta la gittata di 18 metri.",
                "Oggetto meraviglioso",
                0,
                "non comune"
            )
        )
        result.add(
            Item(
                "Olio di Affilatezza",
                "Quest’olio può ricoprire un’arma tagliente o perforante o fino a 5 munizioni taglienti o perforanti." +
                        " Applicare l’olio richiede 1 minuto. Per 1 ora, l’arma ricoperta dall’olio è magica e ha un bonus di +3 ai tiri per colpire e danno.",
                "pozione",
                0,
                "molto raro"
            )
        )
        result.add(
            Item(
                "Olio di Forma Eterea",
                "Una dose di olio è sufficiente a ricoprire una creatura di taglia Media o inferiore, e l’" +
                        "equipaggiamento che indossa e trasporta (è necessaria un’ulteriore fiala per ogni categoria di taglia sopra la Media)." +
                        " Applicare l’olio richiede 10 minuti. Dopodiché la creatura ottiene l’effetto dell’incantesimo forma eterea per 1 ora.",
                "pozione",
                0,
                "raro"
            )
        )
        result.add(
            Item(
                "Olio di Scivolosità",
                "L’olio può coprire una creatura di taglia Media o inferiore, insieme a tutto l’equipaggiamento che indossa" +
                        " o trasporta (è necessaria un’ulteriore fiala per ogni categoria di taglia sopra la Media). Applicare l’olio" +
                        " richiede 10 minuti. La creatura ottiene poi il beneficio dell’incantesimo libertà di movimento per 8 ore. " +
                        "In alternativa, con un’azione si può versare l’olio sul terreno, duplicando per 8 ore l’effetto dell’incantesimo" +
                        " unto su quell’area.",
                "pozione",
                0,
                "non comune"
            )
        )
        result.add(
            Item(
                "Palla di Cristallo",
                "Richiede sintonia. Una tipica palla di cristallo ha il diametro di circa 15 centimetri. Mentre la" +
                        " tocchi, puoi lanciare tramite essa l’incantesimo scrutare (CD del tiro salvezza 17). Le seguenti " +
                        "palle di cristallo varianti sono oggetti leggendari e hanno proprietà aggiuntive.\n" +
                        "Palla di Cristallo di Lettura del Pensiero. Questa palla di cristallo è di circa 12 centimetri" +
                        " di diametro. Mentre la tocchi, puoi lanciare tramite di essa l’incantesimo scrutare (CD del " +
                        "tiro salvezza 17). Puoi usare un’azione per lanciare l’incantesimo individuazione dei pensieri " +
                        "(CD del tiro salvezza 17) mentre stai scrutando tramite questa palla di cristallo, prendendo come " +
                        "bersaglio le creature che puoi vedere e si trovano entro 9 metri dal sensore dell’incantesimo. Non" +
                        " devi concentrarti su questo individuazione dei pensieri per mantenerlo per la sua durata, che termina " +
                        "quando termina scrutare.\n" +
                        "Palla di Cristallo di Telepatia. Questa palla di cristallo è di circa 12 centimetri di diametro. Mentre " +
                        "la tocchi, puoi lanciare tramite di essa l’incantesimo scrutare (CD del tiro salvezza 17). Mentre scruti " +
                        "tramite questa palla di cristallo, puoi comunicare telepaticamente con le creature che puoi vedere e si " +
                        "trovano entro 9 metri dal sensore dell’incantesimo. Puoi anche usare un’azione per lanciare l’incantesimo" +
                        " suggestione (CD del tiro salvezza 17) su una di queste creature tramite il sensore. Non devi concentrarti " +
                        "su questa suggestione per mantenerla per la sua durata, che termina se termina scrutare. Una volta usato, " +
                        "il potere suggestione della palla di cristallo non può essere usato di nuovo fino alla prossima alba.\n" +
                        "Palla di Cristallo di Visione del Vero. Questa palla di cristallo è di circa 12 centimetri di diametro." +
                        " Mentre la tocchi, puoi lanciare tramite di essa l’incantesimo scrutare (CD del tiro salvezza 17)." +
                        "Mentre scruti con questa palla di cristallo, hai visione del vero con un raggio di 36 metri centrato " +
                        "sul sensore dell’incantesimo.",
                "Oggetto meraviglioso",
                0,
                "molto raro o leggendario"
            )
        )
        result.add(
            Item(
                "Pantofole del Ragno",
                "Richiede sintonia. Mentre indossi queste scarpe leggere, puoi muoverti verso l’alto, il basso, e" +
                        " lungo superfici verticali e a testa in giù sul soffitto, lasciando libere le mani. Hai una velocità" +
                        " di scalata pari alla velocità di passeggio. Tuttavia, le pantofole non ti permettono di muoverti a " +
                        "questo modo su superfici scivolose, come quelle coperte da ghiaccio o da olio.",
                "Oggetto meraviglioso",
                0,
                "non comune"
            )
        )
        result.add(
            Item(
                "Pergamena degli Incantesimi",
                "Una pergamena degli incantesimi riporta le parole di un singolo incantesimo, " +
                        "scritte in un codice mistico. Se l’incantesimo è presente nella lista degli incantesimi " +
                        "della tua classe, puoi impiegare un’azione per leggere la pergamena e lanciare l’incantesimo" +
                        " senza dover fornire nessuno dei componenti dell’incantesimo. Altrimenti, l’incantesimo è " +
                        "incomprensibile. Se l’incantesimo è presente sulla lista degli incantesimi della tua classe," +
                        " puoi leggere la pergamena e lanciarne l’incantesimo senza dover provvedere alcuna componente" +
                        " materiale. Lanciare l’incantesimo leggendolo da una pergamena richiede il normale tempo di " +
                        "lancio dell’incantesimo. Una volta che l’incantesimo è stato lanciato, le parole sulla pergamena svaniscono, " +
                        "e la pergamena viene ridotta in polvere. Se il lancio viene interrotto, la pergamena non si dissolve. " +
                        "Il livello dell’incantesimo sulla pergamena determina la CD dei tiri salvezza e il bonus di attacco " +
                        "dell’incantesimo, oltre che alla rarità della pergamena, come indicato nella tabella Pergamene degli Incantesimi:\n" +
                        "Pergamene degli Incantesimi\n" +
                        "Livello dell’Incantesimo     Rarità         CD del Tiro Salvezza     Bonus di Attacco\n" +
                        "Trucchetto                   Comune         13                       +5\n" +
                        "1°                           Comune         13                       +5\n" +
                        "2°                           Non Comune     13                       +5\n" +
                        "3°                           Non Comune     15                       +7\n" +
                        "4°                           Raro           15                       +7\n" +
                        "5°                           Raro           17                       +9\n" +
                        "6°                           Molto Raro     17                       +9\n" +
                        "7°                           Molto Raro     18                       +10\n" +
                        "8°                           Molto Raro     18                       +10\n" +
                        "9°                           Leggendario    19                       +11" +
                        "Un incantesimo da mago su di una pergamena degli incantesimi può essere ricopiato nel" +
                        " libro degli incantesimi alla stessa maniera degli altri incantesimi. Quando un incantesimo" +
                        " viene ricopiato da una pergamena degli incantesimi, il copiatore deve riuscire una prova di" +
                        "Intelligenza (Arcano) con CD pari a 10 + il livello dell’incantesimo. Se la prova riesce, l’incantesimo " +
                        "viene copiato con successo. Che la prova riesca o fallisca, la pergamena degli incantesimi è distrutta.",
                "pergamena",
                0,
                "comune, non comune, raro, molto raro, leggendario (vedi pergamena)"
            )
        )
        result.add(
            Item(
                "Perla del Potere",
                "Richiede sintonia da parte di un incantatore. Mentre hai la perla con te, puoi usare un’azione per pronunciare" +
                        " la parola di comando della perla e recuperare uno slot incantesimo speso. Se lo slot incantesimo speso" +
                        " era di 4° livello o più alto, il nuovo slot è di 3° livello. Una volta usata, la perla non potrà essere" +
                        " usata di nuovo fino alla prossima alba.",
                "Oggetto meraviglioso ", 0, " non comune"
            )
        )
        result.add(
            Item(
                "Pietra Arcana",
                "Richiede sintonia. Esistono diversi tipi di pietra arcana, ogni tipo una specifica" +
                        " combinazione di forme e colori. Quando usi un’azione per lanciare una di queste pietre" +
                        " in aria, la pietra inizia a orbitare intorno alla tua testa alla distanza di 1d3 x 30 " +
                        "centimetri e ti conferisce un beneficio. Dopodiché, un’altra creatura dovrà usare un’azione " +
                        "per afferrare o imbrigliare la pietra e separarla da te, riuscendo in un tiro per colpire " +
                        "contro CA 24 o superando una prova di Destrezza (Acrobazia) con CD 24. Puoi usare un’azione " +
                        "per afferrare e mettere da parte la pietra, terminandone l’effetto. Una pietra ha CA 24, 10 punti" +
                        " ferita e resistenza a tutti i danni. Mentre orbita intorno alla tua testa è considerata un oggetto indossato.\n" +
                        "Agilità (molto raro). Mentre orbita intorno alla tua testa il tuo punteggio di Destrezza aumenta" +
                        " di 2, fino a un massimo di 20.\n" +
                        "Assorbimento (molto raro). Mentre orbita intorno alla tua testa, puoi usare la tua reazione per " +
                        "cancellare un incantesimo di 4° livello o inferiore lanciato da una creatura visibile e che " +
                        "prende a bersaglio solo te. Una volta che la pietra ha cancellato 20 livelli di incantesimi," +
                        " si esaurisce e diventa grigia opaca, perdendo la sua magia. Se sei preso a bersaglio da un " +
                        "incantesimo il cui livello è superiore al numero di livelli di incantesimo che rimangono alla" +
                        " pietra, la pietra non può cancellarlo.\n" +
                        "Autorità (molto raro). Mentre orbita intorno alla tua testa il tuo punteggio di Carisma aumenta" +
                        " di 2, fino a un massimo di 20.\n" +
                        "Consapevolezza (raro). Mentre orbita intorno alla tua testa non puoi essere sorpreso.\n" +
                        "Forza (molto raro). Mentre orbita intorno alla tua testa il tuo punteggio di Forza aumenta di 2, " +
                        "fino a un massimo di 20.\n" +
                        "Intelletto (molto raro). Mentre orbita intorno alla tua testa il tuo punteggio di Intelligenza aumenta " +
                        "di 2, fino a un massimo di 20.\n" +
                        "Intuizione (molto raro). Mentre orbita intorno alla tua testa il tuo punteggio di Saggezza aumenta di" +
                        " 2, fino a un massimo di 20.\n" +
                        "Protezione (raro). Mentre orbita intorno alla tua testa ottieni un bonus di +1 alla CA.\n" +
                        "Sostentamento (raro). Mentre orbita intorno alla tua testa non hai bisogno di mangiare né di bere.\n" +
                        "Riserva (raro). Accumula gli incantesimi lanciati su di esso, conservandoli fino a quando non ne farai uso." +
                        " La pietra può contenere fino a 3 livelli di incantesimi alla volta. Quando viene trovata, contiene 1d4 – 1" +
                        " livelli di incantesimi scelti dal GM. Qualsiasi creatura può lanciare un incantesimo di livello dal 1° al 3°" +
                        " sulla pietra, toccandola mentre l’incantesimo viene lanciato . L’incantesimo non avrà effetto, oltre quello " +
                        "di essere contenuto dalla pietra. Se la pietra non può contene re l’incantesimo, questi sarà sprecato senza" +
                        " produrre effetto. Il livello dello slot usato per produrre effetto. Il livello dello slot usato per " +
                        "lanciarelanciare l’incantesimo determina quanto spazio occupi.l’incantesimo determina quanto spazio occupi." +
                        " Mentre la pietra orbita intorno alla tua testa, puoi lanciare qualsiasi incantesimo contenga. L’incantesimo " +
                        "usa il livello dello slot, la CD del tiro salvezza dell’incantesimo, il bonus di attacco dell’incantesimo, e " +
                        "la caratteristica da incantatore dell’incantatore originale, ma per il resto è come se fosse stato lanciato " +
                        "da te. Dopodiché l’incantesimo non è più contenuto all’interno della pietra, liberando spazio.\n" +
                        "Tempra (molto raro). Mentre orbita intorno alla tua testa il tuo punteggio di Costituzione aumenta di 2, fino a un massimo di 20.",
                "oggetto meraviglioso",
                0,
                "raro, molto raro (vedi songolo oggetto)"
            )
        )
        result.add(
            Item(
                "Pietra della Buona Sorte",
                "Richiede sintonia. Finché la pietra è con te, ottieni un bonus di +1 alle prove di caratteristica e ai tiri salvezza.",
                "Oggetto meraviglioso",
                0,
                "non comune"
            )
        )
        result.add(
            Item(
                "Pietra del Controllo degli Elementali della Terra",
                "Se la pietra tocca terra, puoi usare un’azione per pronunciare la parola di comando ed evocare un elementale" +
                        " della terra, come se avessi lanciato l’incantesimo evocare elementali. La pietra non può di nuovo essere " +
                        "usata a questo modo, fino alla prossima alba. La pietra pesa 2,5 chili.",
                "Oggetto meraviglioso",
                0,
                "raro"
            )
        )
        result.add(
            Item(
                "Piffero delle Fogne",
                "Richiede sintonia. Devi essere competente con gli strumenti a fiato per usare questo piffero. Mentre" +
                        " sei in sintonia con questo piffero, i ratti normali e i ratti giganti sono indifferenti nei tuoi confronti" +
                        " e non ti attaccheranno a meno che non li minacci o li danneggi. Se con un’azione suoni il piffero, puoi " +
                        "usare un’azione bonus per spendere da 1 a 3 cariche, richiamando uno sciame di ratti per ogni carica spesa," +
                        " purché ci siano abbastanza ratti entro 750 metri da te da richiamare in questa maniera (a discrezione del GM)." +
                        " Se non ci sono abbastanza ratti da formare uno sciame, la carica è sprecata. Gli sciami richiamati si muovono verso " +
                        "la musica tramite la rotta più breve possibile, ma non sono in alcun altro modo sotto il tuo controllo. Il piffero ha" +
                        " 3 cariche e recupera 1d3 cariche spese ogni giorno all’alba. Ogni qualvolta uno sciame di ratti che non sia sotto il " +
                        "controllo di un’altra creatura si avvicina entro 9 metri da te mentre stai suonando il piffero, puoi effettuare una prova" +
                        " di Carisma contesa dalla prova di Saggezza dello sciame. Se perdi la contesa, lo sciame si comporta come di norma " +
                        "e non può essere di nuovo distratto dalla musica del piffero per le successive 24 ore. Se vinci la contesa, lo sciame " +
                        "è attratto dalla musica del piffero e diventa amichevole nei confronti tuoi e dei tuoi compagni fino a che continui a" +
                        " suonare il piffero con un’azione ogni round. Uno sciame amichevole obbedisce ai tuoi comandi. Se non impartisci ordini" +
                        " a uno sciame amichevole, questo si difenderà ma non compirà altre azioni. Se uno sciame amichevole all’inizio del " +
                        "turno non può udire la musica del piffero, il tuo controllo su quello sciame termina, e lo sciame si comporta come " +
                        "farebbe normalmente e non può essere attirato nuovamente dalla musica del piffero per le successive 24 ore.",
                "Oggetto meraviglioso",
                0,
                "non comune"
            )
        )
        result.add(
            Item(
                "Piffero dello Spavento",
                "Devi essere competente con gli strumenti a fiato per usare questo piffero. Puoi usare un’azione per suonarlo e " +
                        "spendere 1 carica per creare un suono incantevole e spettrale. Ogni creatura entro 9 metri da te e che ti oda suonare " +
                        "deve superare un tiro salvezza di Saggezza con CD 15 o restare spaventata da te per 1 minuto. Se lo desideri, tutte " +
                        "le creature nell’area che non ti siano ostili possono superare automaticamente il loro tiro salvezza. Una creatura " +
                        "che fallisca il tiro salvezza può ripeterlo alla fine del suo turno, terminando l’effetto su di sé in caso lo superi." +
                        " Una creatura che superi il tiro salvezza è immune all’effetto di questo piffero per 24 ore. Il piffero ha 3 cariche " +
                        "e recupera 1d3 cariche spese ogni giorno all’alba.",
                "Oggetto meraviglioso",
                0,
                "non comune"
            )
        )
        result.add(
            Item(
                "Pigmenti delle Meraviglie",
                "Trovati solitamente in 1d4 vasetti all’interno di eleganti scatole di legno assieme a un pennello " +
                        "(del peso totale di 500 grammi), questi pigmenti ti permettono di creare oggetti tridimensionali, " +
                        "dipingendoli a due dimensioni. La pittura fluisce dal pennello per formare l’oggetto desiderato mentre ti concentri " +
                        "sull’immagine. Ogni vasetto di pittura è sufficiente a coprire 90 m2 di una superficie, permettendoti di creare oggetti i" +
                        "nanimati e caratteristiche del terreno (porte, fosse, fiori, alberi, celle, stanze o armi) che occupino un totale di 270" +
                        " m3. Ci vogliono 10 minuti per coprire 90 m2. Quando completi il dipinto, l’oggetto o la caratteristica del terreno" +
                        " dipinta diventa un oggetto reale, non magico. Quindi, dipingere una porta su di una parete crea una vera porta che " +
                        "può essere aperta per accedere a ciò che si trova oltre di essa. Dipingere una fossa sul pavimento crea una vera fossa," +
                        " la cui profondità è conteggiata nell’area totale degli oggetti che puoi creare. Nulla di ciò che viene creato dai pigmenti" +
                        " può avere un valore superiore ai 25 mo. Se dipingi un oggetto di valore superiore (un diamante o una pila d’oro)," +
                        " l’oggetto sembrerà autentico, ma un attento esame rivelerà che è fatto di gomma, ossa o qualche altro materiale " +
                        "privo di valore. Se dipingi una forma di energia, come fuoco o fulmine, l’energia compare ma si dissipa non appena " +
                        "completi il dipinto, senza recare danni a niente.",
                "Oggetto meraviglioso",
                0,
                "molto raro"
            )
        )
        result.add(
            Item(
                "Piuma Arcana",
                "Questo minuscolo oggetto assomiglia a una piuma. Esistono diversi tipi di piume arcane, ciascuno dotato" +
                        " di un singolo effetto monouso. Il GM sceglie il tipo di piuma arcana. Albero. Devi trovarti all’aperto per poter" +
                        " usare questa piuma arcana. Puoi usare un’azione per appoggiarla a uno spazio non occupato sul terreno. La piuma " +
                        "svanisce e al suo posto spunta un albero di quercia non magico. L’albero è alto 18 metri e ha un tronco di 1,5 metri" +
                        " di diametro. In cima, i suoi rami si estendono per un massimo di 6 metri. Ancora. Puoi usare un’azione per appoggiare" +
                        " la piuma arcana a una barca o nave. Per le successive 24 ore, il vascello non potrà essere mosso in alcun modo. Toccare " +
                        "di nuovo il vascello con la piuma arcana termina questo effetto. Quando l’effetto termina, la piuma svanisce. Frusta. Puoi " +
                        "usare un’azione per lanciare la piuma arcana verso un punto entro 3 metri da te. La piuma svanisce e al suo posto compare" +
                        " una frusta fluttuante. Puoi poi usare un’azione bonus per effettuare un attacco con incantesimo in mischia contro una " +
                        "creatura entro 3 metri dalla frusta, con un bonus di attacco +9. Se colpisci, il bersaglio subisce 1d6 + 5 danni da forza." +
                        "Durante il tuo turno, con un’azione bonus, puoi dirigere la frusta affinché voli per un massimo di 6 metri e ripeta l’attacco " +
                        "contro una creatura entro 3 metri da essa. La frusta svanisce dopo 1 ora, quando usi un’azione per congedarla, o quando sei " +
                        "inabile o muori. Nave Cigno. Puoi usare un’azione per appoggiare la piuma arcana su di una massa d’acqua di almeno 18 metri" +
                        " di diametro. La piuma svanisce e al suo posto compare una barca lunga 15 metri e larga 6 metri dalla forma di cigno. La " +
                        "barca si sposta da sola e si muove in acqua alla velocità di 9 chilometri all’ora. Puoi usare un’azione, mentre sei a " +
                        "bordo per comandarle di muoversi o voltare di 90 gradi. La barca può trasportare fino a trentadue creature di taglia " +
                        "Media o inferiore. Una creatura Grande conta come quattro creature Medie, mentre una creatura Enorme conta come nove " +
                        "creature Medie. La barca svanisce dopo 24 ore. Puoi congedare la barca con un’azione. Uccello. Puoi usare un’azione " +
                        "per lanciare la piuma arcana 1,5 metri nell’aria. La piuma svanisce e un enorme uccello multicolore ne prende il posto." +
                        " L’uccello ha le statistiche di un roc, ma obbedisce a comandi semplici e non può attaccare. Può trasportare fino a 250" +
                        " chili mentre vola alla sua velocità massima (24 chilometri all’ora per un massimo di 216 chilometri al giorno, con un" +
                        "’ora di riposo ogni 3 ore di volo), o 500 chili di peso a metà velocità. L’uccello svanisce dopo aver volato per la" +
                        " distanza massima possibile in un giorno o se scende a 0 punti ferita. Puoi congedare l’uccello con un’azione." +
                        " Ventaglio. " +
                        "Se ti trovi su di una barca o una nave, puoi usare un’azione per lanciare la piuma arcana fino a 3 metri in aria. " +
                        "La piuma svanisce e un gigantesco ventaglio compare al suo posto. Il ventaglio galleggia e crea un vento forte abbastanza" +
                        " da gonfiare le vele della nave, aumentandone la velocità di 7,5 chilometri all’ora per 8 ore. Puoi congedare il " +
                        "ventaglio con un’azione.",
                "Oggetto meraviglioso",
                0,
                "raro"
            )
        )
        result.add(
            Item(
                "Polvere dell’Aridità",
                "Questa piccola confezione contiene 1d6 + 4 pizzichi di polvere. Puoi usare un’azione per spargere un" +
                        " pizzico di polvere sull’acqua. La polvere trasforma un cubo d’acqua di 4,5 metri di spigolo in una pallina" +
                        " delle dimensioni di una biglia, che fluttua o si deposita nel punto in cui è stata gettata la polvere. Il" +
                        "peso della pallina è trascurabile. Chiunque può usare un’azione per spaccare la pallina contro una superficie" +
                        " dura, facendo sì che la pallina si rompa e liberi l’acqua assorbita dalla polvere. Farlo esaurisce la magia " +
                        "della pallina. Un elementale composto principalmente d’acqua e che venga esposto a un pizzico di questa polvere," +
                        " deve effettuare un tiro salvezza di Costituzione con CD 13, subendo 10d6 danni necrotici se lo fallisce, o la " +
                        "metà di questi danni se lo riesce.",
                "Oggetto meraviglioso",
                0,
                "raro"
            )
        )
        result.add(
            Item(
                "Polvere della Sparizione",
                "Rinvenuta in piccoli sacchetti, questa polverina sembra sabbia molto sottile. In un sacchetto ce n’è a " +
                        "sufficienza per un uso. Quando usi un’azione per lanciare la polvere in aria, tu e ciascuna creatura e oggetto " +
                        "entro 3 metri da te diventate invisibili per 2d4 minuti. La durata è la stessa per tutti i soggetti, e " +
                        "quando la magia prende effetto la polvere si consuma. Se una creatura sotto l’effetto della polvere attacca o" +
                        "lancia un incantesimo, l’invisibilità ha fine solo per quella creatura.",
                "Oggetto meraviglioso",
                0,
                "non comune"
            )
        )
        result.add(
            Item(
                "Polvere dello Starnuto e del Soffocamento",
                "Trovata in piccoli contenitori, questa polverina sembra sabbia sottile." +
                        " Appare simile alla polvere della sparizione, e l’incantesimo identificare la " +
                        "rivela come tale. Ce n’è a sufficienza per un uso. Quando usi un’azione per lanciare una" +
                        " manciata di polvere in aria, tu e tutte le creature che necessitano di respirare e si " +
                        "trovino entro 9 metri da te dovete superare un tiro salvezza di Costituzione con CD 15 o " +
                        "smettere di respirare, e iniziare a starnutire in maniera incontrollabile. Una creatura " +
                        "afflitta a questo modo è inabile e soffoca. Finché è cosciente, la creatura può ripetere " +
                        "il tiro salvezza alla fine di ciascun suo turno, terminando l’effetto in caso lo superi. " +
                        "Anche l’incantesimo ristorare inferiore può terminare l’effetto che affligge la creatura.",
                "Oggetto meraviglioso",
                0,
                "non comune"
            )
        )
        result.add(
            Item(
                "Portale Cubico",
                "Questo cubo di 7,5 centimetri di spigolo irradia una palpabile energia magica. " +
                        "Le sei facce del cubo sono ciascuna collegata a un diverso piano di esistenza, uno" +
                        " dei quali è il Piano Materiale. Le altre facce sono collegate a piani determinati dal GM. " +
                        "Puoi usare un’azione per premere una faccia del cubo per lanciare tramite esso l’incantesimo" +
                        " portale, aprendo un passaggio verso il piano collegato a quella faccia. In alternativa, se " +
                        "usi un’azione per premere una faccia due volte, puoi lanciare l’incantesimo spostamento planare " +
                        "(CD del tiro salvezza 17) tramite il cubo e trasportarne i bersagli al piano collegato a quella faccia." +
                        " Il cubo ha 3 cariche. Ogni uso del cubo spende 1 carica. Il cubo recupera 1d3 cariche spese ogni giorno all’alba.",
                "Oggetto meraviglioso",
                0,
                "leggendario"
            )
        )
        result.add(
            Item(
                "Pozione di Amicizia con gli Animali",
                "Quando bevi questa pozione, per 1 ora puoi lanciare a volontà l’incantesimo amicizia con gli animali" +
                        " (CD del tiro salvezza 13).",
                "pozione",
                0,
                "non comune"
            )
        )
        result.add(
            Item(
                "Pozione di Arrampicata",
                "Quando bevi questa pozione, per 1 ora ottieni velocità di scalata pari alla tua velocità " +
                        "di passeggio. Durante questo periodo hai vantaggio alle prove di Forza (Atletica) che compi " +
                        "per effettuare una scalata.",
                "pozione",
                0,
                "comune"
            )
        )
        result.add(
            Item(
                "Pozione di Chiaroveggenza",
                "Quando bevi questa pozione, ottieni l’effetto dell’incantesimo chiaroveggenza.",
                "pozione",
                0,
                "raro"
            )
        )
        result.add(
            Item(
                "Pozione di Crescita",
                "Quando bevi questa pozione, per 1d4 ore ottieni l’effetto “ingrandire” dell’incantesimo" +
                        " ingrandire/ridurre (non richiede concentrazione).",
                "pozione",
                0,
                "non comune"
            )
        )
        result.add(
            Item(
                "Pozione di Eroismo",
                "Quando bevi questa pozione, ottieni 10 punti ferita temporanei che durano 1 ora." +
                        " Per la stessa durata sei sotto l’effetto dell’incantesimo benedizione (non " +
                        "richiede concentrazione).",
                "pozione",
                0,
                "raro"
            )
        )
        result.add(
            Item(
                "Pozione di Forma Gassosa",
                "Quando bevi questa pozione, per 1 ora o finché non terminerai l’effetto con un’azione" +
                        " bonus, ottieni l’effetto dell’incantesimo forma gassosa (non richiede concentrazione).",
                "pozione",
                0,
                "raro"
            )
        )
        result.add(
            Item(
                "Pozione di Forza dei Giganti",
                "Quando bevi questa pozione, per 1 ora il tuo punteggio di Forza cambia." +
                        " Il tipo di gigante determina il punteggio (vedi la tabella seguente). La pozione " +
                        "non ha effetto se il tuo punteggio di Forza è pari o superiore al nuovo punteggio." +
                        " La pozione della forza del gigante del gelo e la pozione della forza del gigante " +
                        "di pietra hanno lo stesso effetto.\n" +
                        "Tipo                             Forza      Rarità\n" +
                        "Gigante di colline               21         Non comune\n" +
                        "Gigante di pietra/del gelo       23         Raro\n" +
                        "Gigante del fuoco                25         Raro\n" +
                        "Gigante delle nuvole             27         Molto raro\n" +
                        "Gigante delle tempeste           29         Leggendario",
                "pozione",
                0,
                "non comune, raro, molto raro, leggendario (vedi singolo oggetto)"
            )
        )
        result.add(
            Item(
                "Pozione di Guarigione",
                "Quando bevi da questa pozione, recuperi un numero di punti ferita che varia a seconda della " +
                        "rarità della pozione, come mostrato sulla tabella Pozioni di Guarigione." +
                        "Pozioni di Guarigione\n" +
                        "Pozioni di…              Rarità         PF recuperati\n" +
                        "Guarigione               Comune         2d4 + 2\n" +
                        "Guarigione maggiore      Non comune     4d4 + 4\n" +
                        "Guarigione superiore     Raro           8d4 + 8\n" +
                        "Guarigione suprema       Molto raro     10d4 + 20",
                "pozione",
                0,
                "comune, non comune, raro, molto raro (vedi singole pozioni)"
            )
        )
        result.add(
            Item(
                "Pozione di Invisibilità",
                "Quando bevi questa pozione, per 1 ora diventi invisibile. Mentre sei invisibile," +
                        " tutto ciò che trasporti o indossi resta anch’esso invisibile assieme a te. L’effetto" +
                        " ha termine qualora tu attacchi o lanci un incantesimo.",
                "pozione",
                0,
                "molto raro"
            )
        )
        result.add(
            Item(
                "Pozione di Lettura del Pensiero",
                "Quando bevi questa pozione, ottieni l’effetto dell’incantesimo individuazione dei" +
                        " pensieri (CD del tiro salvezza 13).",
                "pozione",
                0,
                "raro"
            )
        )
        result.add(
            Item(
                "Pozione di Resistenza",
                "Quando bevi questa pozione, per 1 ora ottieni resistenza a un tipo di danno. Il GM " +
                        "sceglie il tipo di danno o lo determina casualmente." +
                        "Pozioni di Resistenza\n" +
                        "d10    Tipo di Danno\n" +
                        "1      Acido\n" +
                        "2      Freddo\n" +
                        "3      Fuoco\n" +
                        "4      Forza\n" +
                        "5      Fulmine\n" +
                        "6      Necrotico\n" +
                        "7      Veleno\n" +
                        "8      Psichico\n" +
                        "9      Radiante\n" +
                        "10     Tuono",
                "pozione",
                0,
                "non comune"
            )
        )
        result.add(
            Item(
                "Pozione di Rimpicciolimento",
                "Quando bevi questa pozione, per 1d4 ore ottieni l’effetto “ridurre” " +
                        "dell’incantesimo ingrandire/ridurre (non richiede concentrazione).",
                "pozione",
                0,
                "raro"
            )
        )
        result.add(
            Item(
                "Pozione di Respirare Sott’Acqua",
                "Dopo aver bevuto questa pozione, puoi respirare sott’acqua per 1 ora.",
                "pozione",
                0,
                "non comune"
            )
        )
        result.add(
            Item(
                "Pozione di Veleno",
                "Questo distillato assomiglia, odora e ha il sapore di una pozione di guarigione " +
                        "o di un’altra pozione benefica. Tuttavia è in realtà un veleno mascherato da magie di illusione." +
                        " L’incantesimo identificare ne rivela la vera natura. Se lo bevi, subisci 3d6 danni da veleno, " +
                        "e devi superare un tiro salvezza di Costituzione con CD 13 o restare avvelenato. All’inizio di ciascun" +
                        " tuo turno, finché resti avvelenato a questo modo, subisci 3d6 danni da veleno. Puoi ripetere il tiro " +
                        "salvezza al termine di ciascun tuo turno. Se il tiro salvezza riesce, il danno da veleno subito nei turni" +
                        " successivi diminuisce di 1d6. Il veleno cessa i suoi effetti quando il danno scende a 0d6.",
                "pozione",
                0,
                "non comune"
            )
        )
        result.add(
            Item(
                "Pozione di Velocità",
                "Quando bevi questa pozione, ottieni l’effetto dell’incantesimo velocità per 1 minuto" +
                        " (non richiede concentrazione).",
                "pozione",
                0,
                "molto raro"
            )
        )
        result.add(
            Item(
                "Pozione di Volo",
                "Quando bevi questa pozione, per 1 ora ottieni velocità di volo pari alla tua normale" +
                        " velocità di passeggio e puoi fluttuare. Se la pozione ha termine mentre stai volando," +
                        " cadi a meno che non possiedi qualche altro metodo per restare in aria.",
                "pozione",
                0,
                "molto raro"
            )
        )
        result.add(
            Item(
                "Pozzo dei Molti Mondi",
                "Questo elegante tessuto nero, soffice come la seta, è avvolto fino alle dimensioni di" +
                        " un fazzoletto. Si dispiega in un foglio circolare di 1,8 metri di diametro. " +
                        "Puoi usare un’azione per dispiegare e piazzare il pozzo dei molti mondi su di una " +
                        "superficie solida, su cui crea un portale bidirezionale verso un altro mondo o piano" +
                        " di esistenza. Ogni volta che l’oggetto apre un portale, il GM decide il posto a cui conduce." +
                        " Puoi usare un’azione per chiudere un portale aperto afferrando i margini del tessuto e ripiegandoli." +
                        " Una volta che un pozzo dei molti mondi ha aperto un portale, non potrà farlo di nuovo prima che " +
                        "siano passate 1d8 ore.",
                "Oggetto meraviglioso",
                0,
                "leggendario"
            )
        )
        result.add(
            Item(
                "Pugnale del Veleno",
                "Hai un bonus di +1 ai tiri per colpire e tiri di danno per gli attacchi effettuati" +
                        " con quest’arma magica. Una volta al giorno, puoi usare un’azione per far sì che un denso" +
                        " veleno nero ricopra la lama. Il veleno resta per 1 minuto o finché non colpisci con un attacco" +
                        " usando quest’arma. Quando colpisci una creatura con il pugnale avvelenato, il bersaglio deve " +
                        "effettuare un tiro salvezza di Costituzione con CD 15. Se fallisce il tiro salvezza, il bersaglio" +
                        " diventa avvelenato per 1 minuto e subisce 2d10 danni da veleno. Il pugnale non può essere usato di " +
                        "nuovo a questo modo fino alla prossima alba.",
                "arma (pugnale)",
                0,
                "raro"
            )
        )
        result.add(
            Item(
                "Sacra Vendicatrice",
                "Richiede sintonia da parte di un paladino. Ottieni un bonus di +3 ai tiri per colpire e danno " +
                        "effettuati con quest’arma magica. Quando con essa colpisci un immondo o un non morto, quella creatura" +
                        " subisce 2d10 danni radianti aggiuntivi. Mentre impugni la spada sguainata, essa crea un’aura di 3 metri " +
                        "di raggio attorno a te. Tu e tutte le creature a te amichevoli all’interno dell’aura ottenete vantaggio ai" +
                        " tiri salvezza contro incantesimi e altri effetti magici. Se hai 17 o più livelli nella classe del paladino," +
                        " il raggio dell’aura aumenta a 9 metri.",
                "arma (qualsiasi spada)",
                0,
                "leggendario"
            )
        )
        result.add(
            Item(
                "Scarabeo di Protezione",
                "Richiede sintonia. Se tieni questo medaglione a forma di scarabeo tra le tue mani per 1 round, su di" +
                        " esso compare un’iscrizione che ne rivela la natura magica. Mentre è addosso a te, fornisce due benefici:" +
                        "  Hai vantaggio ai tiri salvezza contro incantesimi.  Lo scarabeo ha 12 cariche. Se fallisci un tiro salvezza" +
                        " contro un incantesimo di necromanzia o un effetto nocivo originante da una creatura non morta, puoi usare la tua " +
                        "reazione per spendere 1 carica e trasformare il tiro salvezza fallito in un successo. Lo scarabeo si riduce in polvere " +
                        "ed è distrutto quando viene spesa la sua ultima carica.",
                "anello",
                0,
                "leggendario"
            )
        )
        result.add(
            Item(
                "Scimitarra di Velocità",
                "Richiede sintonia. Ottieni un bonus di +2 ai tiri per colpire e danno effettuati con quest’arma magica. " +
                        "Inoltre, come azione bonus durante ciascun tuo turno puoi effettuare un attacco aggiuntivo.",
                "arma (scimitarra)",
                0,
                "molto raro"
            )
        )
        result.add(
            Item(
                "Scopa Volante",
                "Questa scopa di legno, del peso di circa 1,5 chili, funziona come una normale scopa fino a " +
                        "quando non vi siedi sopra e ne pronunci la parola di comando. Essa inizia così a fluttuare sotto " +
                        "di te e può essere cavalcata in aria. Ha velocità di volo 15 metri. Può trasportare fino a 200 chili," +
                        " ma la sua velocità di volo diventa 9 metri se dovesse trasportare più di 100 chili. Quando atterri, " +
                        "la scopa smette di fluttuare. Pronunciando la parola di comando, nominando il posto e se vi sei familiare, " +
                        "puoi inviare la scopa da sola in un posto fino a 1,5 chilometri da te. La scopa tornerà da te quando pronuncerai" +
                        " un’altra parola di comando, purché si trovi ancora entro 1,5 chilometri da te.",
                "Oggetto meraviglioso",
                0,
                "non comune"
            )
        )
        result.add(
            Item(
                "Scudo +1",
                "Mentre impugni questo scudo, hai un bonus alla CA determinato dalla rarità dello scudo." +
                        " Questo bonus è in aggiunta al normale bonus alla CA fornito dallo scudo.",
                "armatura (scudo)",
                0,
                "non comune"
            )
        )
        result.add(
            Item(
                "Scudo +2",
                "Mentre impugni questo scudo, hai un bonus alla CA determinato dalla rarità dello " +
                        "scudo. Questo bonus è in aggiunta al normale bonus alla CA fornito dallo scudo.",
                "armatura (scudo)",
                0,
                "raro"
            )
        )
        result.add(
            Item(
                "Scudo +3",
                "Mentre impugni questo scudo, hai un bonus alla CA determinato dalla rarità dello " +
                        "scudo. Questo bonus è in aggiunta al normale bonus alla CA fornito dallo scudo.",
                "armatura (scudo)",
                0,
                "molto raro"
            )
        )
        result.add(
            Item(
                "Scudo Afferra Frecce",
                "Richiede sintonia. Mentre impugni questo scudo, hai un bonus di +2 alla CA contro" +
                        " gli attacchi a distanza. Questo bonus è in aggiunta al normale bonus dello scudo alla " +
                        "CA. Inoltre, ogni volta che una creatura effettua un attacco a distanza contro un bersaglio" +
                        " entro 1,5 metri da te, puoi usare la tua reazione per divenire il bersaglio dell’attacco.",
                "armatura (scudo)",
                0,
                "raro"
            )
        )
        result.add(
            Item(
                "Scudo Animato",
                "Richiede sintonia. Mentre impugni questo scudo, con un’azione bonus puoi pronunciare " +
                        "una parola di comando e farlo animare. Lo scudo fluttuerà nell’aria all’interno del tuo" +
                        " spazio per proteggerti come se lo stessi impugnando, lasciandoti libera la mano. Lo scudo" +
                        " resta animato per 1 minuto, finché non usi un’azione bonus per terminarne l’effetto, sei " +
                        "inabile o muori: a quel punto lo scudo cadrà a terra o tornerà nella tua mano se ne hai una libera.",
                "armatura (scudo)",
                0,
                "molto raro"
            )
        )
        result.add(
            Item(
                "Scudo dell’Attrazione dei Proiettili",
                "Richiede sintonia. Mentre impugni questo scudo hai resistenza ai danni da parte degli" +
                        " attacchi con arma a distanza. Maledizione. Questo scudo è maledetto. Sintonizzarsi con" +
                        " esso ti maledice finché non sarai bersaglio dell’incantesimo rimuovi maledizione o simile " +
                        "magia. Togliersi lo scudo non pone fine alla maledizione. Ogni qualvolta un attacco con arma " +
                        "a distanza viene effettuato contro un bersaglio entro 3 metri da te, la maledizione fa sì che " +
                        "diventi tu il bersaglio dell’attacco.",
                "armatura (scudo)",
                0,
                "raro"
            )
        )
        result.add(
            Item(
                "Scudo di Difesa dagli Incantesimi",
                "Richiede sintonia. Mentre impugni questo scudo, hai vantaggio ai tiri salvezza contro " +
                        "incantesimi e altri effetti magici, e gli attacchi con incantesimo subiscono svantaggio quando" +
                        " effettuati contro di te.",
                "armatura (scudo)",
                0,
                "molto raro"
            )
        )
        result.add(
            Item(
                "Sfera dell’Annientamento",
                "Questa sfera nera di 50 centimetri di diametro è in realtà un foro nella struttura del multiverso" +
                        ", che fluttua nello spazio ed è stabilizzata dal campo magico che la circonda. La sfera" +
                        " annienta tutta la materia che attraversa e tutta la materia che l’attraversa. L’unica " +
                        "eccezione sono gli artefatti. A meno che l’artefatto non sia suscettibile ai danni della " +
                        "sfera dell’annientamento, esso può attraversare la sfera senza problemi. Qualsiasi altra " +
                        "cosa tocchi la sfera e non ne sia completamente avvolta e annientata da essa, subisce 4d10" +
                        " danni da forza. La sfera resta immobile fino a quando qualcuno non la controlla. Se ti " +
                        "trovi entro 18 metri da una sfera incontrollata, puoi impiegare un’azione per effettuare una " +
                        "prova di Intelligenza (Arcano) con CD 25. Se la superi, la sfera levita in una direzione a tua" +
                        " scelta, per un numero di metri pari a 1,5 x il tuo modificatore di Intelligenza (minimo 1,5 metri)." +
                        " Se fallisci, la sfera si muove di 3 metri verso di te. Una creatura nel cui spazio entri la sfera, " +
                        "deve superare un tiro salvezza di Destrezza con CD 13 o venire toccata da essa, subendo 4d10 danni da " +
                        "forza. Se tenti di controllare una sfera che si trova sotto il controllo di un’altra creatura, effettui" +
                        " una prova contesa di Intelligenza (Arcano) contro l’Intelligenza (Arcano) dell’altra creatura." +
                        " Il vincitore della contesa ottiene il controllo della sfera e può farla levitare come di norma." +
                        " Se la sfera entra in contatto con un portale planare, come quello creato dall’incantesimo portale," +
                        " o uno spazio extradimensionale, come quello all’interno di un buco portatile, il GM determina " +
                        "casualmente ciò che accade, utilizzando la tabella seguente." +
                        "d20    Risultato\n" +
                        "1-10       La sfera è distrutta\n" +
                        "11-17      La sfera si muove attraverso il portale o all’interno dello spazio extradimensionale.\n" +
                        "18-20      Un squarcio spaziale spedisce ogni creatura e oggetto entro 54 metri dalla sfera, sfera " +
                        "inclusa, in un piano dell’esistenza casuale.",
                "oggetto meraviglioso",
                0,
                "leggendario"
            )
        )
        result.add(
            Item(
                "Solvente Universale",
                "Questo tubetto contiene un liquido bianco con un forte odore di alcool. Puoi usare un’" +
                        "azione per versarne i contenuti su di una superficie a portata. Il liquido dissolve istantaneamente " +
                        "1.000 cm2 di adesivo con cui entra in contatto, compresa la colla suprema.",
                "oggetto meraviglioso",
                0,
                "leggendario"
            )
        )
        result.add(
            Item(
                "Spada dell’Affilatezza",
                "Richiede sintonia. Quando attacchi un oggetto con quest’arma magica e colpisci," +
                        " massimizza i dadi di danno della tua arma contro il bersaglio. Quando attacchi una " +
                        "creatura con quest’arma e ottieni 20 al tiro per colpire, il bersaglio subisce 14 danni" +
                        " taglienti aggiuntivi. Tira poi un altro d20. Se il risultato è ancora 20, recidi uno degli" +
                        " arti del bersaglio: l’effetto di questa perdita è determinato dal GM. Se la creatura non ha " +
                        "arti da recidere, verrà tagliata una parte del suo corpo. Inoltre, puoi pronunciare la parola " +
                        "di comando della spada per far sì che la lama irradi luce intensa in un raggio di 3 metri e " +
                        "luce fioca per ulteriori 3 metri. Pronunciando di nuovo la parola di comando o rinfoderando" +
                        " la spada, la luce si spegne.",
                "arma (qualsiasi spada che infligga danni taglienti)",
                0,
                "molto raro"
            )
        )
        result.add(
            Item(
                "Spada Danzante",
                "Richiede sintonia. Puoi usare un’azione bonus per scagliare questa spada " +
                        "magica nell’aria e pronunciare la parola di comando. Quando lo fai, la spada inizia a" +
                        " fluttuare, vola fino a 9 metri, e attacca una creatura a tua scelta entro 1,5 metri " +
                        "da essa. La spada usa il tuo tiro per colpire e il tuo modificatore del punteggio di caratteristica " +
                        "per i tiri di danno. Mentre la spada fluttua, puoi usare un’azione bonus per farla volare di massimo 9" +
                        " metri verso un altro punto entro 9 metri da te. Come parte della stessa azione bonus, puoi far sì che" +
                        " la spada attacchi una creatura entro 1,5 metri da essa. Dopo che la spada fluttuante avrà attaccato per " +
                        "la quarta volta, volerà per un massimo di 9 metri e cercherà di tornare tra le tue mani. Se non hai mani libere," +
                        " la spada cadrà sul terreno ai tuoi piedi. Se la spada non ha strada libera verso di te," +
                        " si muoverà più vicino possibile a te e poi cadrà a terra. Cesserà di fluttuare anche nel " +
                        "caso in cui tu la afferri o ti allontani più di 9 metri da essa.",
                "arma (qualsiasi spada)",
                0,
                "molto raro"
            )
        )
        result.add(
            Item(
                "Spada Ruba Vita",
                "Richiede sintonia. Quando attacchi una creatura con quest’arma magica e ottieni " +
                        "20 al tiro per colpire, il bersaglio, a parte i costrutti e i non morti, subisce 10 " +
                        "danni necrotici aggiuntivi. Inoltre, tu guadagni 10 punti ferita temporanei.",
                "arma (qualsiasi spada)",
                0,
                "raro"
            )
        )
        result.add(
            Item(
                "Spada del Sanguinamento",
                "Richiede sintonia. I punti ferita persi a causa dei danni di quest’arma," +
                        " possono essere recuperati solo tramite un riposo breve o lungo, anziché tramite" +
                        " la rigenerazione, la magia o altri metodi. Una volta per turno, quando colpisci" +
                        " una creatura con un attacco usando quest’arma magica, puoi far sanguinare il " +
                        "bersaglio. All’inizio di ciascun turno della creatura sanguinante, essa subisce " +
                        "1d4 danni necrotici per ogni volta che l’hai ferita a questo modo, ed essa può " +
                        "effettuare un tiro salvezza di Costituzione con CD 15, terminando l’effetto su" +
                        " tutte le ferite sanguinanti in caso di successo. In alternativa, la creatura sanguinante," +
                        " o una creatura entro 1,5 metri da essa, può usare un’azione per effettuare una " +
                        "prova di Saggezza (Medicina) con CD 15, terminando l’effetto del sanguinamento" +
                        " in caso la superi.",
                "arma (qualsiasi spada)",
                0,
                "raro"
            )
        )
        result.add(
            Item(
                "Spada Vorpal",
                "Richiede sintonia. Ottieni un bonus di +3 ai tiri per colpire e danno" +
                        " effettuati con quest’arma magica. Inoltre, l’arma ignora la resistenza ai " +
                        "danni taglienti. Quando attacchi una creatura che abbia almeno una testa con " +
                        "quest’arma e ottieni 20 al tiro per colpire, tagli una delle teste della creatura." +
                        " La creatura muore se non può sopravvivere senza la perdita della testa. Una creatura " +
                        "è immune a questo effetto se è immune ai danni taglienti, non possiede o non ha bisogno" +
                        " di una testa, possiede azioni leggendarie o il GM decide che la creatura è troppo " +
                        "grossa perché la sua testa sia recisa da quest’arma. Una creatura del genere subisce" +
                        " invece 6d8 danni taglienti aggiuntivi dal colpo subito.",
                "arma (qualsiasi spada che infligga danni taglienti)",
                0,
                "leggendario"
            )
        )
        result.add(
            Item(
                "Specchio Intrappola Vita",
                "Quando questo specchio alto 120 centimetri viene guardato in maniera indiretta, " +
                        "la sua superficie mostra una vaga immagine della creatura. Lo specchio pesa 25" +
                        " chili, ha CA 11, 10 punti ferita e vulnerabilità ai danni contundenti. Si " +
                        "frantuma ed è distrutto quando viene ridotto a 0 punti ferita. Se lo " +
                        "specchio è appeso a una superficie verticale e ti trovi entro 1,5 metri da esso," +
                        " puoi usare un’azione per pronunciare la sua parola di comando e attivarlo. Rimarrà " +
                        "attivo fino a quando non pronuncerai di nuovo la parola di comando. Qualsiasi creatura," +
                        " a parte te, che veda il suo riflesso nello specchio attivato mentre si trova entro 9 metri" +
                        " da esso deve superare un tiro salvezza di Carisma con CD 15 o finire intrappolata, insieme " +
                        "a tutto ciò che indossa o trasporta, in una delle dodici celle extradimensionali dello specchio." +
                        " Questo tiro salvezza riceve vantaggio se la creatura conosce la natura dello specchio, e i costrutti" +
                        " riescono automaticamente il tiro salvezza. Una cella extradimensionale è uno spazio infinito" +
                        " colmo di una densa foschia che riduce la visibilità a 3 metri. Le creature intrappolate nelle " +
                        "celle dello specchio non invecchiano, e non hanno bisogno di mangiare, bere o dormire. Una " +
                        "creatura intrappolata all’interno di una cella può fuggirne usando la magia che permette di" +
                        " viaggiare tra i piani. Altrimenti, la creatura è confinata nella cella fino a quando non sarà" +
                        "liberata. Se lo specchio intrappola una creatura ma le sue dodici celle extradimensionali sono " +
                        "già occupate, lo specchio libera una delle creature intrappolate a caso per alloggiare il nuovo" +
                        " prigioniero. La creatura liberata compare in uno spazio non occupato in vista dello specchio ma" +
                        " rivolta dalla parte opposta. Se lo specchio viene infranto, tutte le creature che contiene sono" +
                        " liberate e ricompaiono in uno spazio non occupato in sua prossimità. Mentre ti trovi entro 1,5" +
                        " metri dallo specchio, puoi usare un’azione per pronunciare il nome di una delle creature intrappolate" +
                        " al suo interno o richiamare un particolare numero di cella. La creatura nominata o contenuta" +
                        " nella cella nominata appare come immagine sulla superficie dello specchio. Dopodiché tu e la" +
                        " creatura nominata potete comunicare normalmente. In un modo simile, puoi usare un’azione per" +
                        " pronunciare una seconda parola di comando e liberare una delle creature intrappolate nello " +
                        "specchio. La creatura liberata compare, insieme a tutte le sue proprietà, nello spazio non " +
                        "occupato più vicino allo specchio e rivolta nella direzione opposta a esso.",
                "Oggetto meraviglioso",
                0,
                "molto raro"
            )
        )
        result.add(
            Item(
                "Spilla della Difesa",
                "Richiede sintonia. Mentre indossi questa spilla, hai resistenza ai danni da forza," +
                        "e hai immunità al danno generato dall’incantesimo dardo incantato.",
                "Oggetto meraviglioso",
                0,
                "non comune"
            )
        )
        result.add(
            Item(
                "Stivali Alati",
                "Richiede sintonia. Mentre indossi questi stivali, hai una velocità di volo" +
                        " pari alla tua velocità di passeggio. Puoi usare questi stivali per volare per" +
                        " un massimo di 4 ore, tutte insieme o divise in brevi voli, ciascuno dei quali " +
                        "impiega un minimo di 1 minuto di durata. Se la durata termina mentre stai volando," +
                        " scendi alla velocità di 9 metri per round finché non atterri. Gli stivali recuperano " +
                        "2 ore di capacità di volo ogni 12 ore che non sono in uso.",
                "Oggetto meraviglioso",
                0,
                "non comune"
            )
        )
        result.add(
            Item(
                "Stivali della Corsa e del Salto",
                "Richiede sintonia. Mentre indossi questi stivali, la tua velocità di " +
                        "passeggio diventa 9 metri, a meno che non sia superiore, e la tua velocità " +
                        "non viene ridotta qualora tu sia ingombrato o stia indossando un’armatura pesante." +
                        " Inoltre, salti tre volte la normale distanza, anche se non puoi saltare più di " +
                        "quanto ti permetterebbe di fare il tuo movimento restante.",
                "Oggetto meraviglioso",
                0,
                "non comune"
            )
        )
        result.add(
            Item(
                "Stivali degli Elfi",
                "Mentre indossi questi stivali, i tuoi passi non emettono suoni, quale" +
                        " che sia la superficie che stai attraversando. Hai vantaggio alle prove di" +
                        " Destrezza (Furtività) che si basano sul muoversi silenziosamente.",
                "Oggetto meraviglioso",
                0,
                "non comune"
            )
        )
        result.add(
            Item(
                "Stivali dell’Inverno",
                "Richiede sintonia. Mentre indossi questi stivali, ottieni i seguenti " +
                        "benefici:  Hai resistenza ai danni da freddo.  Ignori il terreno " +
                        "difficile prodotto da neve o ghiaccio.  Puoi tollerare le temperature" +
                        " fino ai -45° C senza bisogno di ulteriori protezioni. Se indossi abiti" +
                        " pesanti, puoi tollerare temperature fino a -75° C.",
                "Oggetto meraviglioso",
                0,
                "non comune"
            )
        )
        result.add(
            Item(
                "Stivali della Levitazione",
                "Richiede sintonia . Mentre indossi questi stivali,\n" +
                        " puoi usare a volontà un’ azione per lanciare l’ incantesimo levitazione su di te .",
                " Oggetto meraviglioso",
                0,
                " raro "
            )
        )
        result.add(
            Item(
                "Stivali della Velocità",
                "Richiede sintonia. Mentre indossi questi stivali, puoi usare un’azione " +
                        "bonus per raddoppiare la tua velocità di passeggio, e qualsiasi creatura" +
                        " che effettui un attacco di opportunità contro di te, ha svantaggio al " +
                        "tiro per colpire. Puoi terminare l’effetto quando vuoi. Quando la " +
                        "proprietà degli stivali è stata usata per un totale di 10 minuti, " +
                        "la magia cessa di funzionare fino al termine di un riposo lungo.",
                "Oggetto meraviglioso",
                0,
                "raro"
            )
        )


        return result
    }
}