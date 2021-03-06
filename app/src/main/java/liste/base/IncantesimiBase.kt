package liste.base

import sqlite.Enchantment

class IncantesimiBase {

    constructor() {}

    fun getIncantesimiBase(): List<Enchantment> {
        var result: MutableList<Enchantment> = mutableListOf()


        result.add(
            Enchantment(
                "Aiuto",
                "Aid",
                2,
                "Abiurazione",
                "1 azione",
                "9 metri",
                "V, S, M (una sottile striscia di tessuto bianco)",
                "8 ore",
                "Il tuo incantesimo aumenta la robustezza e risolutezza dei tuoi alleati. Scegli fino a tre creature a gittata. Per la durata, i punti ferita massimi e i punti ferita attuali di ciascun bersaglio aumentano di 5."
            )
        )



        result.add(
            Enchantment(
                "Allarme",
                "Alarm",
                1,
                "Abiurazione (rituale)",
                "1 minuto",
                "9 metri",
                "V, S, M (una campanella e un pezzo di pregiato filo d’argento)",
                "8 ore",
                "Predisponi un allarme contro intrusioni indesiderate. Scegli una porta, una finestra o un’area a gittata che non sia più grande di un cubo di 6 metri di spigolo. Fino al termine dell’incantesimo, sarai avvertito da un allarme ogni volta che una creatura di taglia Minuscola o superiore entri in contatto o acceda all’area protetta. Quando lanci l’incantesimo, puoi indicare delle creature che non faranno scattare l’allarme. Scegli anche se l’allarme è udibile o solo mentale. Un allarme mentale, qualora ti trovi entro 1,5 chilometri dall’area protetta, ti avverte con un rumore nella tua mente. Il rumore è in grado di svegliarti se stai dormendo. Un allarme udibile produce il suono di una campanella per 10 secondi, udibile entro 18 metri."
            )
        )



        result.add(
            Enchantment(
                "Alleato Planare",
                "Planar Ally",
                6,
                "Evocazione",
                "10 minuti",
                "18 metri",
                "V, S",
                "Istantanea",
                "Supplichi un’entità ultraterrena perché ti conceda aiuto. L’essere ti deve essere noto: un dio, un primordiale, un principe dei demoni, o qualche altra creatura di grande potere. Quell’entità invia un celestiale, elementale o immondo a essa leale perché ti aiuti, facendo comparire la creatura in uno spazio non occupato a gittata. Se conosci il nome di una specifica creatura, puoi pronunciarne il nome quando lanci questo incantesimo per richiedere l’aiuto di quella creatura, sebbene tu possa comunque riceverne un’altra (a discrezione del GM). Quando la creatura appare, non è sotto l’obbligo di agire in alcun modo particolare. Puoi chiedere alla creatura di svolgere un servizio in cambio di una ricompensa, ma essa non è obbligata a soddisfarti. Il compito richiesto potrebbe essere facile (“portaci in volo oltre il baratro” o “aiutaci a combattere questa battaglia”) o complesso (“spia i nostri nemici” o “proteggici durante la nostra esplorazione del sotterraneo”). Devi essere in grado di comunicare con la creatura per patteggiare i suoi servigi. La ricompensa può assumere diverse forme. Un celestiale potrebbe chiedere una considerevole donazione di oro od oggetti magici a un tempio alleato, mentre un immondo potrebbe richiedere un sacrificio umano o il dono di un tesoro. Alcune creature potrebbero scambiare i loro servigi per una missione che dovrai intraprendere per conto loro."
            )
        )



        result.add(
            Enchantment(
                "Allucinazione Mortale",
                "Phantasmal Killer",
                4,
                "Illusione",
                "1 azione",
                "36 metri",
                "V, S",
                "Concentrazione, massimo 1 minuto",
                "Attingi agli incubi di una creatura a gittata e che puoi vedere, e crei una manifestazione illusoria delle sue più insite paure, visibile solo per quella creatura. Il bersaglio deve effettuare un tiro salvezza su Saggezza. Se fallisce il tiro salvezza, il bersaglio è spaventato per la durata. Alla fine di ciascun turno del bersaglio, prima del termine dell’incantesimo, il bersaglio deve superare un tiro salvezza su Saggezza o subire 4d10 danni psichici. Se supera il tiro salvezza, l’incantesimo termina."
            )
        )



        result.add(
            Enchantment(
                "Amicizia con gli Animali",
                "Animal Friendship",
                1,
                "Ammaliamento",
                "1 azione",
                "9 metri",
                "V, S, M (un po’ di cibo)",
                "24 ore",
                "Questo incantesimo ti permette di convincere una bestia che non vuoi arrecargli danno. Scegli una bestia a gittata che puoi vedere. Questa deve vederti e udirti. Se l’Intelligenza della bestia è 4 o più, l’incantesimo fallisce. Altrimenti, la bestia deve superare un tiro salvezza su Saggezza o restare affascinata da te per la durata dell’incantesimo. Se tu o uno dei tuoi compagni danneggiate il bersaglio, l’incantesimo ha termine."
            )
        )



        result.add(
            Enchantment(
                "Anatema",
                "Bane",
                1,
                "Ammaliamento",
                "1 minuto",
                "9 metri",
                "V, S, M (un goccio di sangue)",
                "Concentrazione, massimo 1 minuto",
                "Fino a tre creature di tua scelta che puoi vedere, e che sono a gittata, devono effettuare un tiro salvezza su Carisma. Ogni bersaglio che fallisca questo tiro salvezza ed effettua un tiro per colpire o un tiro salvezza prima del termine dell’incantesimo, deve tirare un d4 e sottrarre il numero così ottenuto dal tiro per colpire o tiro salvezza."
            )
        )



        result.add(
            Enchantment(
                "Animale Messaggero",
                "Animal Messenger",
                2,
                "Ammaliamento (rituale)",
                "1 azione",
                "9 metri",
                "V, S, M (un tocco di cibo)",
                "24 ore",
                "Tramite questo incantesimo, usi un animale per consegnare un messaggio. Scegli una bestia Minuscola a gittata e che puoi vedere, come uno scoiattolo, una ghiandaia o un pipistrello. Specifichi un luogo, che devi aver visitato in passato, e un destinatario che corrisponda a una descrizione generica, come “un uomo o una donna che vesta l’uniforme della guardia cittadina” o “un nano dai capelli rossi che indossa un cappello a punta”. Pronuncia anche un messaggio di massimo venticinque parole. La bestia bersaglio viaggia per la durata dell’incantesimo verso il luogo specificato,coprendo circa 75 chilometri in 24 ore per un messaggero volante, o 40 chilometri per gli altri animali. Quando il messaggero arriva a destinazione, consegna il messaggio alla creatura da te descritta, replicando il suono della tua voce. Il messaggero parla solo a una creatura corrispondente alla descrizione da te fornita. Se il messaggero non riesce a raggiungere la destinazione prima del termine dell’incantesimo, il messaggio è perduto, e la bestia ritorna verso il punto in cui hai lanciato l’incantesimo."
            )
        )



        result.add(
            Enchantment(
                "Animare Morti",
                "Animate Dead",
                3,
                "Necromanzia",
                "1 minuto",
                "3 metri",
                "V, S, M (una goccia di sangue, un pezzo di carne e un pizzico di polvere d’ossa)",
                "Istantanea",
                "Questo incantesimo crea un servitore non morto. Scegli una pila di ossa o un cadavere di un umanoide Medio o Piccolo a gittata. Il tuo incantesimo imbeve il bersaglio di una nefanda parvenza di vita, rianimandolo come creatura non morta. Il bersaglio diventa uno scheletro se scegli le ossa o uno zombi se scegli un cadavere. Durante ciascun tuo turno, puoi usare un’azione bonus per comandare mentalmente qualsiasi creatura da te creata con questo incantesimo che si trovi entro 18 metri da te (se controlli più creature, puoi comandarle tutte o solo alcune di loro allo stesso momento, inviando lo stesso comando a tutte). Decidi quale azione la creatura svolgerà e dove si muoverà durante il suo prossimo turno, oppure inviale un comando generale, come quello di stare di guardia a una particolare stanza o corridoio. Se non invii alcun comando, la creatura si limita a difendersi dalle creature ostili. Una volta ricevuto un ordine, la creatura continuerà a svolgerlo fino al suo compimento. La creatura è sotto il tuo controllo per 24 ore, dopodiché smetterà di eseguire i comandi che le impartirai. Per mantenere il controllo sulla creatura per altre 24 ore, devi lanciare di nuovo questo incantesimo su di essa prima del termine dell’attuale periodo di 24 ore. Questo impiego dell’incantesimo riafferma il tuo controllo su di un massimo di quattro creature che hai animato con questo incantesimo, piuttosto che animarne una nuova."
            )
        )



        result.add(
            Enchantment(
                "Animare Oggetti",
                "Animate Objects",
                5,
                "Trasmutazione",
                "1 minuto",
                "36 metri",
                "V, S",
                "Concentrazione, massimo 1 minuto",
                "Gli oggetti prendono vita al tuo comando. Scegli fino a dieci oggetti non magici a gittata e che non siano indossati o trasportati. I bersagli Medi contano come due oggetti, i bersagli Grandi contano come quattro oggetti, i bersagli Enormi contano come otto oggetti. Non puoi animare oggetti di taglia più grossa di Enorme. Ogni bersaglio si anima e diventa una creatura sotto il tuo controllo fino al termine dell’incantesimo o finché non viene ridotto a 0 punti ferita. Con un’azione bonus, puoi comandare mentalmente qualsiasi creatura che hai generato con questo incantesimo e che si trovi entro 150 metri da te (se controlli più creature, puoi comandarne solo alcune o tutte allo stesso tempo, impartendo lo stesso comando a ciascuna). Decidi tu quale azione intraprenderà la creatura e dove si muoverà durante il suo turno successivo, o puoi emettere un comando generico, come quello di fare la guardia a una particolare stanza o corridoio. Se non impartisci comandi, la creatura si limiterà a difendersi dalle creature ostili. Una volta dato un ordine, la creatura continuerà a seguirlo finché non avrà completato il suo compito."
            )
        )



        result.add(
            Enchantment(
                "Alterare Sé Stesso",
                "Alter Self",
                2,
                "Trasmutazione",
                "1 azione",
                "Incantatore",
                "V, S",
                "Concentrazione, massimo 1 ora",
                "Assumi una forma diversa. Quando lanci questo incantesimo, scegli una della seguenti opzioni, l’effetto della quale permane per la durata dell’incantesimo. Per la durata dell’incantesimo puoi terminare un’opzione per ottenere i benefici di un’altra."
            )
        )



        result.add(
            Enchantment(
                "Anti-Individuazione",
                "Nondetection",
                3,
                "Abiurazione",
                "1 azione",
                "Contatto",
                "V, S, M (un pizzico di polvere di diamante del valore di 25 mo sparsa sul bersaglio, che l’incantesimo consuma)",
                "8 ore",
                "Per la durata, nascondi il bersaglio con cui sei stato in contatto dalla magia di divinazione. Il bersaglio può essere una creatura consenziente o un luogo o un oggetto che occupi uno spazio equivalente a un cubo non superiore ai 3 metri di spigolo. Il bersaglio non può divenire bersaglio di alcuna magia di divinazione o essere percepito tramite sensi di scrutamento magici."
            )
        )



        result.add(
            Enchantment(
                "Antipatia/Simpatia",
                "Antypathy/Sympathy",
                8,
                "Ammaliamento",
                "1 ora",
                "18 metri",
                "V, S, M (o un pezzo di allume immerso nell’aceto per l’effetto antipatia o un goccio di miele per l’effetto simpatia)",
                "10 giorni",
                "Questo incantesimo attrae o repelle delle creature di tua scelta. Prendi un bersaglio a gittata, che sia un oggetto Enorme o più piccolo o una creatura o un’area non più grande di un cubo di 60 metri di spigolo. Poi specifica una specie di creature intelligenti, come i draghi rossi, i goblin o i vampiri. Investi il bersaglio di un’aura che attrae o respinge le creature specificate per la durata. Scegli antipatia o simpatia come effetto dell’aura."
            )
        )



        result.add(
            Enchantment(
                "Arma Magica",
                "Magic Weapon",
                2,
                "Trasmutazione",
                "1 azione bonus",
                "Contatto",
                "V, S",
                "Concentrazione, massimo 1 ora",
                "Lanci l’incantesimo a contatto di un’arma non magica. Fino al termine dell’incantesimo, l’arma diventa un’arma magica con un bonus di +1 ai tiri per colpire e di danno."
            )
        )



        result.add(
            Enchantment(
                "Arma Spirituale",
                "Spiritual Weapon",
                2,
                "Invocazione",
                "1 azione bonus",
                "18 metri",
                "V, S",
                "1 minuto",
                "In un punto nella gittata, crei un’arma spettrale fluttuante, che resta per la durata o finché non lanci di nuovo questo incantesimo. Quando lanci l’incantesimo, puoi effettuare un attacco da mischia con incantesimo contro una creatura entro 1,5 metri dall’arma. Se colpisci, il bersaglio subisce danni da forza pari a 1d8 + il tuo modificatore di caratteristica da incantatore. Durante il tuo turno, con un’azione bonus, puoi spostare l’arma di 6 metri e ripetere l’attacco contro una creatura entro 1,5 metri dall’arma. L’arma può assumere qualsiasi forma tu voglia. I chierici di divinità che sono associate a un’arma particolare (la mazza di S. Cutberto e il martello di Thor) generano l’effetto di questo incantesimo a forma di quell’arma."
            )
        )



        result.add(
            Enchantment(
                "Armatura Magica",
                "Mage Armor",
                1,
                "Abiurazione",
                "1 azione",
                "Contatto",
                "V, S, M (un pezzo di cuoio lavorato)",
                "8 ore",
                "Lanci l’incantesimo a contatto di una creatura consenziente che non indossa un’armatura. Una forza magica protettiva circonda il bersaglio fino al termine dell’incantesimo. La CA base del bersaglio diventa 13 + il suo modificatore di Destrezza. L’incantesimo termina se il bersaglio indossa un’armatura o interrompe l’incantesimo con un’azione."
            )
        )



        result.add(
            Enchantment(
                "Artificio Druidico",
                "Druidcraft",
                0,
                "Trasmutazione",
                "1 azione",
                "9 metri",
                "V, S",
                "Istantanea",
                "Sussurrando agli spiriti della natura, crei, a gittata, uno dei seguenti effetti:"
            )
        )



        result.add(
            Enchantment(
                "Aura Magica dell’Arcanista",
                "Arcanist’s Magic Aura",
                2,
                "Illusione",
                "1 azione",
                "Contatto",
                "V, S, M (un piccolo quadretto di seta)",
                "24 ore",
                "Poni un’illusione su di una creatura od oggetto con cui sei in contatto, così che gli incantesimi di divinazione rivelino false informazioni su di esso. Il bersaglio può essere una creatura consenziente o un oggetto che non sia trasportato o indossato da un’altra creatura. Quando lanci questo incantesimo, scegli uno o entrambi i seguenti effetti. L’effetto permane per la durata. Se esegui questo incantesimo sulla stessa creatura od oggetto ogni giorno per 30 giorni, piazzando ogni volta lo stesso effetto, l’illusione permarrà finché non viene dissolta."
            )
        )



        result.add(
            Enchantment(
                "Aura Sacra",
                "Holy Aura",
                8,
                "Abiurazione",
                "1 azione",
                "Incantatore",
                "V, S, M (un minuscolo reliquario del valore di almeno 1.000 mo contenente una reliquia sacra, come un pezzo di tessuto dell’abito di un santo o un frammento di pergamena di un testo religioso)",
                "Concentrazione, massimo 1 minuto",
                "Irradi da te luce divina che si raccoglie in una debole luminosità con raggio di 9 metri intorno a te. Quando lanci l’incantesimo, le creature da te scelte in questo raggio emanano luce fioca con un raggio di 1,5 metri e hanno vantaggio a tutti i tiri salvezza, mentre le altre creature hanno svantaggio sui tiri per colpire contro di loro fino al termine dell’incantesimo. Inoltre, quando un immondo o non morto colpisce una creatura bersaglio con un attacco in mischia, l’aura risplende di una luce intensa. L’attaccante deve superare un tiro salvezza su Costituzione o restare accecato fino al termine dell’incantesimo."
            )
        )



        result.add(
            Enchantment(
                "Bacche Benefiche",
                "Goodberry",
                1,
                "Trasmutazione",
                "1 azione",
                "Contatto",
                "V, S, M (un rametto di vischio)",
                "Istantanea",
                "Fino a dieci bacche compaiono nella tua mano e vengono infuse di magia per la durata. Una creatura può usare la sua azione per mangiare una bacca. Mangiare una bacca ripristina 1 punto ferita, e la bacca inoltre provvede nutrimento sufficiente per alimentare una creatura per un giorno."
            )
        )



        result.add(
            Enchantment(
                "Bagliore Lunare",
                "Moonbeam",
                2,
                "Invocazione",
                "1 azione",
                "36 metri",
                "V, S, M (diversi semi di bella di notte e un pezzo di felpato opalescente)",
                "Concentrazione, massimo 1 minuto",
                "Un fascio argenteo di luce pallida risplende in un cilindro di raggio 1,5 metri, alto 12 metri centrato in un punto a gittata. Fino al termine dell’incantesimo, una luce fioca riempie il cilindro. Quando una creatura entra nell’area dell’incantesimo per la prima volta durante un turno o inizia qui il suo turno, è avvolta da fiamme spettrali che provocano un dolore terribile, e deve effettuare un tiro salvezza su Costituzione. Se fallisce il tiro salvezza subisce 2d10 danni radianti, o la metà di questi danni se lo supera. Un mutaforma effettua il tiro salvezza con svantaggio. Se lo fallisce ritorna immediatamente alla sua forma originale e non può assumere una forma diversa finché non esce dalla luce dell’incantesimo. Durante ciascun tuo turno dopo aver lanciato l’incantesimo, puoi usare un’azione per muovere il fascio di 18 metri in qualsiasi direzione."
            )
        )



        result.add(
            Enchantment(
                "Bagliore Solare",
                "Sunbeam",
                6,
                "Invocazione",
                "1 azione",
                "Incantatore (linea di 18 metri)",
                "V, S, M (una lente d’ingrandimento)",
                "Concentrazione, massimo 1 minuto",
                "Una fascio di luce brillante esplode dalla tua mano in una linea larga 1,5 metri e lunga 18 metri. Ogni creatura sulla linea deve effettuare un tiro salvezza su Costituzione. Se fallisce il tiro salvezza, la creatura subisce 6d8 danni radianti e rimane accecata fino al tuo prossimo turno. Se supera il tiro salvezza, subisce la metà dei danni e non è accecata. I non morti e le melme hanno svantaggio su questo tiro salvezza."
            )
        )



        result.add(
            Enchantment(
                "Banchetto degli Eroi",
                "Heroes’ Feast",
                6,
                "Evocazione",
                "10 minuti",
                "9 metri",
                "V, S, M (una ciotola incrostata di gemme del valore di almeno 1.000 mo, che l’incantesimo consuma)",
                "Istantanea",
                "Crei un magnifico banchetto, comprensivo di cibi e bevande prelibate. Il banchetto viene consumato in 1 ora e scompare al termine di questo periodo, ma gli effetti benefici non si faranno sentire fino al termine dell’ora. Fino ad altre dodici creature possono partecipare al banchetto. Una creatura che partecipi al banchetto ottiene diversi benefici. La creatura viene guarita da tutte le malattie e i veleni, diventa immune al veleno e all’essere spaventata, e ha vantaggio su tutti i tiri salvezza su Saggezza. I suoi punti ferita massimi aumentano di 2d10, e guarisce lo stesso quantitativo di punti ferita attuali. Questi benefici durano 24 ore."
            )
        )



        result.add(
            Enchantment(
                "Barriera di Lame",
                "Blade Barrier",
                6,
                "Invocazione",
                "1 azione",
                "18 metri",
                "V, S",
                "Concentrazione, massimo 10 minuti",
                "Crei un muro verticale di lame rotanti fatte di energia magica, affilate come rasoi. Il muro compare a gittata e resta per la durata. Puoi creare un muro diritto lungo fino a 30 metri, alto 6 metri e spesso 1,5 metri, o un muro circolare di 18 metri massimo di diametro, alto 6 metri e spesso 1,5 metri. Il muro fornisce tre quarti di copertura alle creature dietro di esso, e il suo spazio è terreno difficile. Quando una creatura entra per la prima volta in un turno nell’area del muro o comincia il suo turno lì, la creatura deve effettuare un tiro salvezza su Destrezza. Se la creatura fallisce il tiro salvezza subisce 6d10 danni taglienti, o la metà se lo supera."
            )
        )



        result.add(
            Enchantment(
                "Beffa Crudele",
                "Vicious Mockery",
                0,
                "Ammaliamento",
                "1 azione",
                "18 metri",
                "V",
                "Istantanea",
                "Scateni una serie di insulti avvolti da una subdola malia contro una creatura a gittata e che puoi vedere. Se il bersaglio ti può udire (sebbene non sia necessario che ti comprenda), deve superare un tiro salvezza su Saggezza o subire 1d4 danni psichici e avere svantaggio al prossimo tiro per colpire che effettuerà prima del termine del suo prossimo turno. Il danno dell’incantesimo aumenta di 1d4 quando raggiungi il 5° livello (2d4), 11° livello (3d4) e 17° livello (4d4)."
            )
        )



        result.add(
            Enchantment(
                "Benedizione",
                "Bless",
                1,
                "Ammaliamento",
                "1 azione",
                "9 metri",
                "V, S, M (uno spruzzo di acqua sacra)",
                "Concentrazione, massimo 1 minuto",
                "Benedici fino a tre creature a gittata, scelte da te. Ogni qualvolta un bersaglio effettua un tiro per colpire o un tiro salvezza prima del termine dell’incantesimo, può tirare un d4 aggiuntivo e sommare il risultato ottenuto al tiro per colpire o al tiro salvezza."
            )
        )



        result.add(
            Enchantment(
                "Blocca Mostri",
                "Hold Monster",
                5,
                "Ammaliamento",
                "1 azione",
                "27 metri",
                "V, S, M (un piccolo pezzo dritto di ferro)",
                "Concentrazione, massimo 1 minuto",
                "Scegli una creatura a gittata e che puoi vedere. Il bersaglio deve superare un tiro salvezza su Saggezza, o restare paralizzato per la durata. Questo incantesimo non ha effetto su non morti o costrutti. Al termine di ciascun suo turno, il bersaglio può effettuare un altro tiro salvezza su Saggezza. Se lo supera, per quel bersaglio l’incantesimo ha termine."
            )
        )



        result.add(
            Enchantment(
                "Blocca Persone",
                "Hold Person",
                2,
                "Ammaliamento",
                "1 azione",
                "18 metri",
                "V, S, M (un piccolo pezzo dritto di ferro)",
                "Concentrazione, massimo 1 minuto",
                "Scegli un umanoide a gittata e che puoi vedere. Il bersaglio deve superare un tiro salvezza su Saggezza o restare paralizzato per la durata. Al termine di ciascun suo turno, il bersaglio può effettuare un altro tiro salvezza su Saggezza. Se lo supera, per quel bersaglio l’incantesimo ha termine."
            )
        )



        result.add(
            Enchantment(
                "Bocca Magica",
                "Magic Mouth",
                2,
                "Illusione (rituale)",
                "1 minuto",
                "9 metri",
                "V, S, M (un piccolo pezzo di favo e polvere di giada del valore di almeno 10 mo, che l’incantesimo consuma)",
                "Finché non viene dissolto",
                "Impianti un messaggio in un oggetto a gittata, messaggio che viene pronunciato quando si soddisfa la condizione di attivazione. Scegli un oggetto che puoi vedere e che non sia indossato o trasportato da un’altra creatura. Poi pronuncia il messaggio, che deve essere di 25 parole o meno, ma può essere distribuito in un periodo di massimo 10 minuti. Infine, determina la circostanza che attiverà l’incantesimo, affinché questo trasmetta il tuo messaggio. Quando la circostanza si manifesta, una bocca magica appare sull’oggetto e recita il messaggio con la tua voce e allo stesso volume con cui l’hai pronunciato. Se l’oggetto da te scelto ha una bocca o qualcosa che assomiglia a una bocca (per esempio, la bocca di una statua), la bocca magica appare così che le parole sembrino provenire dalla bocca dell’oggetto. Quando lanci questo incantesimo, puoi far sì che l’incantesimo termini dopo aver trasmesso il suo messaggio, o che perduri e ripeta il messaggio ogni volta che la condizione si attiva. La circostanza di attivazione può essere generica o dettagliata quanto desideri, ma deve essere basata su condizioni visibili o udibili che avvengono entro 9 metri dall’oggetto. Per esempio, potresti istruire la bocca di parlare quando una qualsiasi creatura si avvicina entro 9 metri dall’oggetto o quando una campanella d’argento suona entro 9 metri da esso."
            )
        )



        result.add(
            Enchantment(
                "Caduta Morbida",
                "Feather Fall",
                1,
                "Trasmutazione",
                "1 reazione, che effettui quando tu o una creatura entro 18 metri da te cadete",
                "18 metri",
                "V, M (una piccola piuma o un pezzo di piuma)",
                "1 minuto",
                "Scegli fino a cinque creature a gittata. La velocità di discesa di una creatura che cade diminuisce a 18 metri per round fino al termine dell’incantesimo. Se la creatura atterra prima del termine dell’incantesimo, non subisce danni da caduta e può atterrare sui suoi piedi; per quella creatura l’incantesimo ha termine."
            )
        )



        result.add(
            Enchantment(
                "Calmare Emozioni",
                "Calm Emotions",
                2,
                "Ammaliamento",
                "1 azione",
                "18 metri",
                "V, S",
                "Concentrazione, massimo 1 minuto",
                "Tenti di sopprimere le forti emozioni in un gruppo di persone. Ogni umanoide in una sfera di 6 metri di raggio centrata su di un punto a gittata da te scelto, deve effettuare un tiro salvezza su Carisma; se lo desidera, una creatura può scegliere di fallire questo tiro salvezza. Se una creatura fallisce il tiro salvezza, scegli uno di questi due effetti."
            )
        )



        result.add(
            Enchantment(
                "Camminare nel Vento",
                "Wind Walk",
                6,
                "Trasmutazione",
                "1 minuto",
                "9 metri",
                "V, S, M (fuoco e acqua sacra)",
                "8 ore",
                "Per la durata, tu e fino ad altre dieci creature consenzienti a gittata, che puoi vedere, assumete forma gassosa, diventando nubi. Mentre è in forma di nube, una creatura ha velocità di volo 90 metri e ha resistenza ai danni dalle armi non magiche. Ritornare alla forma normale richiede 1 minuto, durante il quale la creatura è inabile e non può muoversi. Fino al termine dell’incantesimo, una creatura può tornare alla forma di nube, che richiede una trasformazione di un minuto. Se una creatura è in forma di nube e sta volando quando l’effetto ha termine, la creatura scende 18 metri per round al minuto finché non atterra, al sicuro. Se non riesce ad atterrare dopo 1 minuto, la creatura cadrà per la distanza rimanente."
            )
        )



        result.add(
            Enchantment(
                "Camminare sull’Acqua",
                "Water Walk",
                3,
                "Trasmutazione (rituale)",
                "1 azione",
                "9 metri",
                "V, S, M (un pezzo di sughero)",
                "1 ora",
                "Questo incantesimo conferisce la capacità di muoversi attraverso superfici liquide (come acqua, acido, fango, neve, sabbie mobili o lava) come se fossero innocuo terreno solido (le creature che attraversano la lava fusa possono comunque subire danni dal calore). Fino a dieci creature consenzienti a gittata, e che puoi vedere, ricevono questa capacità per tutta la durata. Se il tuo bersaglio è immerso in un liquido, l’incantesimo riporta il bersaglio in superficie del liquido a una velocità di 18 metri per round."
            )
        )



        result.add(
            Enchantment(
                "Campo Anti-Magia",
                "Antimagic Field",
                8,
                "Abiurazione",
                "1 azione",
                "Incantatore (sfera di 3 metri di raggio)",
                "V, S, M (un pizzico di ferro in polvere o lime di ferro)",
                "Concentrazione, massimo 1 ora",
                "Vieni circondato da una sfera invisibile di anti-magia di 3 metri di raggio. Quest’area è separata dall’energia magica che permea il multiverso. All’interno della sfera non si possono lanciare incantesimi, le creature richiamate scompaiono e anche gli oggetti magici diventano normali. Fino al termine dell’incantesimo, la sfera si muove con te, centrata su di te. Gli incantesimi e altri effetti magici, eccetto quelli creati da un artefatto o divinità, sono soppressi all’interno della sfera né vi possono penetrare. Uno slot speso per lanciare un incantesimo soppresso è consumato. Mentre un effetto è soppresso, non funziona, ma il tempo che trascorre soppresso è conteggiato per la sua durata."
            )
        )



        result.add(
            Enchantment(
                "Camuffare Sé Stesso",
                "Disguise Self",
                1,
                "Illusione",
                "1 azione",
                "Incantatore",
                "V, S",
                "1 ora",
                "Cambi il tuo aspetto, assieme a quello dei tuoi abiti, armatura, armi e altri oggetti che indossi, fino al termine dell’incantesimo o finché non impieghi un’azione per interrompere l’incantesimo. Puoi apparire 30 centimetri più basso o più alto, magro, grasso o una via di mezzo. Non puoi modificare la tua conformazione fisica, quindi devi adottare una forma che abbia la medesima distribuzione di arti. Per tutto il resto, l’illusione è limitata solo dalla tua fantasia. I cambi apportati da questo incantesimo non sono in grado di sostenere un’ispezione fisica. Per esempio, se usi questo incantesimo per aggiungere un cappello al tuo abbigliamento, gli oggetti attraversano il cappello, e chiunque lo tocchi non avvertirebbe nulla e finirebbe per toccarti la testa e i capelli. Se usi questo incantesimo per apparire più magro di quello che sei, la mano di una persona che provasse a toccarti rimbalzerebbe su di te,mentre alla vista sembrerebbe fermarsi a mezz’aria. Per distinguere il tuo camuffamento, una creatura può usare la sua azione per ispezionare il tuo aspetto e deve superare una prova di Intelligenza (Indagare) contro la CD del tiro salvezza dell’incantesimo."
            )
        )



        result.add(
            Enchantment(
                "Capanna",
                "Tiny Hut",
                3,
                "Invocazione (rituale)",
                "1 minuto",
                "Incantatore (semisfera di 3 metri di raggio)",
                "V, S, M (una piccola biglia di cristallo)",
                "8 ore",
                "Una cupola di forza immobile del raggio di 3 metri si forma intorno e sopra di te, restando stazionaria per la durata. L’incantesimo termina se lasci l’area. Nove creature di taglia Media o inferiore possono entrare nella cupola insieme a te. L’incantesimo fallisce se l’area include una creatura più grande o più di dieci creature. Le creature e gli oggetti all’interno della cupola, quando lanci questo incantesimo, la possono attraversare liberamente. Tutte le altre creature e oggetti sono proibiti dall’attraversarla. Incantesimi e altri effetti magici non possono estendersi oltre la cupola o attraversarla. L’atmosfera all’interno dello spazio è confortevole e asciutta, quale che sia il clima all’esterno. Fino al termine dell’incantesimo, puoi comandare che l’interno diventi illuminato fioco o buio. La cupola è opaca dall’esterno, di qualsiasi colore tu scelga, ma è trasparente dall’interno."
            )
        )



        result.add(
            Enchantment(
                "Caratteristica Potenziata",
                "Enhance Ability",
                2,
                "Trasmutazione",
                "1 azione",
                "Contatto",
                "V, S, M (pelo o piuma di una bestia)",
                "Concentrazione, massimo 1 ora",
                "Conferisci un potenziamento magico a una creatura con cui sei in contatto. Scegli uno degli effetti seguenti; il bersaglio ottiene quell’effetto fino al termine dell’incantesimo."
            )
        )



        result.add(
            Enchantment(
                "Carne in Pietra",
                "Flesh to Stone",
                6,
                "Trasmutazione",
                "1 azione",
                "18 metri",
                "V, S, M (un pizzico di lime, acqua e terra)",
                "Concentrazione, massimo 1 minuto",
                "Cerchi di trasformare in pietra una creatura a gittata che puoi vedere. Se il corpo del bersaglio è fatto di carne, la creatura deve effettuare un tiro salvezza su Costituzione. Se fallisce il tiro salvezza, è intralciata e la sua carne comincia a indurirsi. Se supera il tiro salvezza, la creatura non subisce l’incantesimo. Una creatura intralciata da questo incantesimo deve effettuare un altro tiro salvezza su Costituzione al termine di ciascun suo turno. Se supera il tiro salvezza con successo per tre volte, l’incantesimo termina. Se fallisce il tiro salvezza per tre volte, viene trasformata in pietra e resta vittima della condizione pietrificato per la durata. I successi e i fallimenti non devono essere continuativi; tenere traccia di entrambi finché il bersaglio non ne ottiene tre di un tipo. Se la creatura viene danneggiata fisicamente mentre è pietrificata, soffre di deformità simili ai danni arrecati alla pietra, se ritorna al suo stato originale. Se mantieni la tua concentrazione su questo incantesimo per la sua intera possibile durata, la creatura è trasformata in pietra finché l’effetto non viene rimosso."
            )
        )



        result.add(
            Enchantment(
                "Catena di Fulmini",
                "Chain Lightning",
                6,
                "Invocazione",
                "1 azione",
                "45 metri",
                "V, S, M (un po’ di pelliccia; un pezzo d’ambra, vetro o una verga di cristallo; e tre spille d’argento)",
                "Istantanea",
                "Crei una saetta di luce che colpisce un bersaglio a gittata che puoi vedere, scelto da te. Tre saette colpiscono il bersaglio e fino ad altri tre bersagli, ciascuno dei quali deve trovarsi entro 9 metri dal primo bersaglio. Un bersaglio può essere una creatura o oggetto e può essere bersaglio di una sola saetta. Un bersaglio deve effettuare un tiro salvezza su Destrezza. Il bersaglio subisce 10d8 danni da fulmine se fallisce il tiro salvezza, o la metà di questi danni se lo supera."
            )
        )



        result.add(
            Enchantment(
                "Cecità/Sordità",
                "Blindness/Deafness",
                2,
                "Necromanzia",
                "1 azione",
                "9 metri",
                "V",
                "1 minuto",
                "Puoi accecare o assordare un nemico. Scegli una creatura a gittata e che puoi vedere. Il bersaglio deve effettuare un tiro salvezza su Costituzione. Se lo fallisce, il bersaglio è accecato o assordato (a tua scelta) per la durata. Al termine di ciascun suo turno, il bersaglio può effettuare un tiro salvezza su Costituzione. Se lo supera, l’incantesimo termina."
            )
        )



        result.add(
            Enchantment(
                "Celare",
                "Sequester",
                7,
                "Trasmutazione",
                "1 azione",
                "Contatto",
                "V, S, M (una polvere composta da polvere di diamante, smeraldo, rubino e zaffiro del valore di almeno 50.000 mo, che l’incantesimo consuma)",
                "Fino a che dissolto",
                "Tramite questo incantesimo, una creatura consenziente o un oggetto può essere nascosto, impossibile da individuare per la durata. Eseguendo questo incantesimo ed entrando in contatto con un bersaglio, questo diventa invisibile e non può essere preso come bersaglio dagli incantesimi di divinazione, né percepito da sensori di scrutamento creati da incantesimi di divinazione. Se il bersaglio è una creatura, cade in uno stato di animazione sospesa. Per lui il tempo cessa di scorrere, e non invecchia. Puoi predisporre una condizione per cui l’incantesimo termini anticipatamente. La condizione può essere qualsiasi cosa tu voglia, ma deve avvenire o essere visibile entro 1,5 chilometri dal bersaglio. Esempi includono “dopo 1.000 anni” o “quando il tarrasque si risveglia”. Questo incantesimo termina anche qualora il bersaglio subisca danni."
            )
        )



        result.add(
            Enchantment(
                "Cerchio di Morte",
                "Circle of Death",
                6,
                "Invocazione",
                "1 azione",
                "45 metri",
                "V, S, M (una perla nera ridotta in polvere del valore di almeno 500 mo)",
                "Istantanea",
                "Una sfera di energia negativa del raggio di 18 metri, erutta in un punto a gittata. Ogni creatura in quell’area deve effettuare un tiro salvezza su Costituzione. Un bersaglio subisce 8d6 danni necrotici se fallisce il tiro salvezza, o la metà di questi danni se lo supera."
            )
        )



        result.add(
            Enchantment(
                "Cerchio di Teletrasporto",
                "Teleporation Circle",
                5,
                "Evocazione",
                "1 minuto",
                "3 metri",
                "V, M (gessi e inchiostri rari infusi di gemme preziose del valore di almeno 50 mo, che l’incantesimo consuma)",
                "1 round",
                "Mentre lanci l’incantesimo, tracci un cerchio di 3 metri di diametro sul pavimento, inscritto con sigilli che collegano il posto in cui ti trovi a un cerchio di teletrasporto permanente di tua scelta, di cui conosci la sequenza dei sigilli e che si trovi sullo stesso piano di esistenza in cui ti trovi tu. Un portale luminoso si apre all’interno del cerchio tracciato da te e resta aperto fino al termine del tuo prossimo turno. Qualsiasi creatura che entri nel portale, riappare istantaneamente entro 1,5 metri dal cerchio di destinazione o nello spazio non occupato più vicino, se non può comparire entro 1,5 metri da esso."
            )
        )



        result.add(
            Enchantment(
                "Cerchio Magico",
                "Magic Circle",
                3,
                "Abiurazione",
                "1 minuto",
                "3 metri",
                "V, S, M (acqua sacra o argento e ferro in polvere del valore di almeno 100 mo, che l’incantesimo consuma)",
                "1 ora",
                "Crei un cilindro di energia magica di 3 metri di raggio e alto 6 metri, centrato su di un punto del terreno a gittata e che puoi vedere. Rune luminose compaiono dovunque il cilindro si intersechi con il pavimento o altra superficie. Scegli uno o più dei seguenti tipi di creature: celestiali, elementali, fatati, immondi o non morti. Il circolo influisce su di una creatura del tipo scelto nei modi seguenti:"
            )
        )



        result.add(
            Enchantment(
                "Charme su Persone",
                "Charm Person",
                1,
                "Ammaliamento",
                "1 azione",
                "9 metri",
                "V, S",
                "1 ora",
                "Cerchi di affascinare un umanoide a gittata e che puoi vedere. Egli deve effettuare un tiro salvezza su Saggezza, e avrà vantaggio se sta combattendo con te o i tuoi alleati. Se fallisce il tiro salvezza, è affascinato da te fino al termine dell’incantesimo o finché tu o i tuoi alleati non gli facciate qualcosa di nocivo. La creatura affascinata ti considera un amichevole conoscente. Quando l’incantesimo termina, la creatura èconsapevole di essere stata affascinata da te."
            )
        )



        result.add(
            Enchantment(
                "Chiaroveggenza",
                "Clairvoyance",
                3,
                "Divinazione",
                "10 minuti",
                "1,5 chilometri",
                "V, S, M (un focus del valore di almeno 100 mo, che sia un corno ingioiellato per udire o un occhio di vetro per guardare)",
                "Concentrazione, massimo 10 minuti",
                "Crei un sensore invisibile in un luogo a te familiare e che sia a gittata (un luogo che hai già visitato o visto precedentemente) o in un luogo ovvio ma che non ti è familiare (come dietro una porta o un angolo, o in mezzo un boschetto di alberi). Il sensore rimane sul posto per la durata, e non può essere attaccato né altrimenti vi si può interagire."
            )
        )



        result.add(
            Enchantment(
                "Clone",
                "Clone",
                8,
                "Necromanzia",
                "1 ora",
                "Contatto",
                "V, S, M (un diamante del valore di almeno 1.000 mo e almeno 16 centimetri cubi di carne della creatura che deve essere clonata, che l’incantesimo consuma, e un recipiente da almeno 2.000 mo di valore che abbia un coperchio sigillabile e sia grande a sufficienza da contenere una creatura Media, come una grossa urna, una bara, una fossa piena di fango nel terreno o un contenitore di cristallo pieno di acqua salata)",
                "Istantanea",
                "Questo incantesimo produce il duplicato inerte di una creatura vivente come salvaguardia dalla morte. Questo clone si forma all’interno di un recipiente sigillato e raggiunge la massima dimensione e maturità dopo 120 giorni; puoi anche decidere che il clone sia una versione più giovane della stessa creatura. Rimane inerte e sopravvive all’infinito, purché il recipiente resti indisturbato. In qualsiasi momento dopo che il clone è maturato, se la creatura originale muore, la sua anima si trasferisce nel clone, purché l’anima sia libera e consenziente a tornare. Il clone è fisicamente identico all’originale e ha la stessa personalità, ricordi e caratteristiche, ma nulladell’equipaggiamento dell’originale. I resti fisici della creatura originale, se esistono ancora, divengono inerti e non possono essere riportati alla vita, dato che l’anima della creatura è altrove."
            )
        )



        result.add(
            Enchantment(
                "Colpo Accurato",
                "True Strike",
                0,
                "Divinazione",
                "1 azione",
                "9 metri",
                "S",
                "Concentrazione, massimo 1 round",
                "Allunghi la mano e punti il dito verso un bersaglio a gittata. La tua magia ti conferisce una breve comprensione delle difese del bersaglio. Durante il tuo prossimo turno, purché questo incantesimo non sia terminato, ottieni vantaggio al primo tiro per colpire contro quel bersaglio."
            )
        )



        result.add(
            Enchantment(
                "Colpo Infuocato",
                "Flame Strike",
                5,
                "Invocazione",
                "1 azione",
                "18 metri",
                "V, S, M (pizzico di zolfo)",
                "Istantanea",
                "Una colonna verticale di fuoco divino scende dal cielo e si abbatte sul luogo da te specificato. Ogni creatura in un cilindro di 3 metri di raggio e alto 12 metri centrato su di un punto a gittata deve effettuare un tiro salvezza su Destrezza. Una creatura subisce 4d6 danni da fuoco e 4d6 danni radianti se fallisce il tiro salvezza, o la metà di questi danni se lo supera."
            )
        )



        result.add(
            Enchantment(
                "Comando",
                "Command",
                1,
                "Ammaliamento",
                "1 azione",
                "18 metri",
                "V",
                "1 round",
                "Pronunci un comando di una parola verso una creatura a gittata e che puoi vedere. Il bersaglio deve superare un tiro salvezza su Saggezza o eseguire il comando durante il suo prossimo turno. L’incantesimo non ha effetto se il bersaglio è non morto, se non capisce la tua lingua, o se il tuo comando gli recherebbe danni. Seguono alcuni tipici comandi e i loro effetti. Puoi dare comandi diversi da quelli descritti qui, e in quel caso il GM determinerà il comportamento del bersaglio. Se il bersaglio non può eseguire il tuo comando, l’incantesimo ha fine."
            )
        )



        result.add(
            Enchantment(
                "Comprensione dei Linguaggi",
                "Comprehend Languages",
                1,
                "Divinazione (rituale)",
                "1 azione",
                "Incantatore",
                "V, S, M (un pizzico di sale e fuliggine)",
                "1 ora",
                "Per la durata, capisci il significato letterale di qualsiasi linguaggio parlato che ascolti. Capisci anche qualsiasi linguaggio scritto che vedi, ma devi essere a contatto con la superficie su cui le parole sono scritte. Per leggere una pagina di testo impieghi 1 minuto. Questo incantesimo non decodifica i messaggi segreti in un testo o glifo, come un sigillo arcano, che non faccia parte di un linguaggio scritto."
            )
        )



        result.add(
            Enchantment(
                "Compulsione",
                "Compulsion",
                4,
                "Ammaliamento",
                "1 azione",
                "9 metri",
                "V, S",
                "Concentrazione, massimo 1 minuto",
                "Le creature di tua scelta entro la gittata, che puoi vedere e che ti possono sentire, devono effettuare un tiro salvezza su Saggezza. Un bersaglio supera automaticamente il tiro salvezza se non può essere affascinato. Fino al termine dell’incantesimo, puoi usare un’azione bonus durante ciascun tuo turno per indicare una direzione orizzontale rispetto a te. Ogni bersaglio soggetto all’incantesimo deve usare quanto più possibile del suo movimento, durante il suo prossimo turno, per muoversi in quella direzione. Il bersaglio non può effettuare nessuna azione prima di muoversi. Dopo essersi mosso in questo modo, il bersaglio può effettuare un altro tiro salvezza su Saggezza per tentare di terminare l’effetto. Un bersaglio non può essere obbligato a muoversi dentro un pericolo palesemente letale, come fiamme o pozzi, ma per muoversi nella direzione indicata potrà provocare attacchi di opportunità."
            )
        )



        result.add(
            Enchantment(
                "Comunione",
                "Commune",
                5,
                "Divinazione (rituale)",
                "1 minuto",
                "Incantatore",
                "V, S, M (incenso e una fiala di acqua sacra o blasfema)",
                "1 minuto",
                "Comunichi con la tua divinità o un agente divino e gli poni fino a tre domande a cui si può dare risposta con un sì o un no. Devi porre le domande prima della fine dell’incantesimo. Riceverai la risposta corretta a ciascuna domanda. Le creature divine non sono necessariamente onniscienti, quindi potresti ricevere “non è chiaro” come risposta a una domanda che riguarda informazioni non pertinenti alle conoscenze della divinità. Nel caso in cui una risposta di una parola potrebbe essere fuorviante o contraria agli interessi della divinità, il GM potrebbe invece dare una breve frase come risposta. Se lanci l’incantesimo due o più volte prima di aver terminato il tuo prossimo riposo lungo, c’è una probabilità cumulativa del 25% che per ogni lancio dopo il primo tu non ottenga alcuna risposta. Il GM effettua questo tiro in segreto."
            )
        )



        result.add(
            Enchantment(
                "Comunione con la Natura",
                "Commune with Nature",
                5,
                "Divinazione (rituale)",
                "1 minuto",
                "Incantatore",
                "V, S",
                "Istantanea",
                "Per un istante diventi tutt’uno con la natura e ottieni informazioni sul territorio circostante. In ambienti esterni, l’incantesimo ti fornisce informazioni sul territorio entro 5 chilometri da te. In grotte e altri ambienti naturali sotterranei, il raggio è limitato a 100 metri. L’incantesimo non funziona nei luoghi in cui la natura è stata soppiantata da costruzioni, come in sotterranei e paesi."
            )
        )



        result.add(
            Enchantment(
                "Confusione",
                "Confusion",
                4,
                "Ammaliamento",
                "1 azione",
                "27 metri",
                "V, S, M (tre gusci di noce)",
                "Concentrazione, massimo 1 minuto",
                "Questo incantesimo assale e piega la mente delle creature, generando illusioni e provocando azioni incontrollate. Quando lanci questo incantesimo ogni creatura, in una sfera di 3 metri di raggio centrata su di un punto da te scelto entro la gittata, deve superare un tiro salvezza su Saggezza o subirne gli effetti. Un bersaglio soggetto all’incantesimo non può effettuare reazioni e deve tirare un d10 all’inizio di ciascun suo turno per determinare il proprio comportamento per quel turno."
            )
        )



        result.add(
            Enchantment(
                "Cono di Freddo",
                "Cone of Cold",
                5,
                "Invocazione",
                "1 azione",
                "Incantatore (cono di 18 metri)",
                "V, S, M (un piccolo cristallo o cono di vetro)",
                "Istantanea",
                "Un’esplosione di aria fredda erutta dalle tue mani. Ogni creatura in un cono di 18 metri deve effettuare un tiro salvezza su Costituzione. Una creatura subisce 8d8 danni da freddo se fallisce il tiro salvezza, o la metà di questi danni se lo supera. Una creatura uccisa da questo incantesimo diventa una statua di ghiaccio fino a quando disgela."
            )
        )



        result.add(
            Enchantment(
                "Conoscenza delle Leggende",
                "Legend Lore",
                5,
                "Divinazione",
                "10 minuti",
                "Incantatore",
                "V, S, M (incenso del valore di almeno 250 mo, che l’incantesimo consuma, e quattro strisce d’avorio del valore di almeno 50 mo)",
                "Istantanea",
                "Nomina o descrivi una persona, luogo od oggetto. L’incantesimo ti porta alla mente un breve riassunto delle conoscenze più importanti sull’argomento da te nominato. Se la cosa da te nominata non ha alcuna rilevanza leggendaria, non ottieni alcuna informazione. Maggiori informazioni hai sull’argomento, più precise e dettagliate saranno le informazioni che riceverai. L’informazione che riceverai sarà accurata, ma celata magari in linguaggio metaforico."
            )
        )



        result.add(
            Enchantment(
                "Contagio",
                "Contagion",
                5,
                "Necromanzia",
                "1 azione",
                "Contatto",
                "V, S",
                "7 giorni",
                "Tramite il contatto puoi infliggere malattie. Effettua un attacco da mischia con incantesimo contro una creatura a portata. Se colpisci, infetti la creatura con una malattia a tua scelta tra quelle descritte di seguito. Al termine di ciascun turno del bersaglio, esso deve effettuare un tiro salvezza su Costituzione. Dopo aver fallito tre di questi tiri salvezza, gli effetti della malattia permangono per la durata, e la creatura non effettua più tiri salvezza. Dopo aver superato tre di questi tiri salvezza, la creatura recupera dalla malattia, e l’incantesimo ha termine. Dato che questo incantesimo induce nel suo bersaglio una malattia naturale, qualsiasi effetto che rimuova le malattie o migliori gli effetti delle malattie si applica a essa."
            )
        )



        result.add(
            Enchantment(
                "Contattare Altri Piani",
                "Contact Other Plane",
                5,
                "Divinazione (rituale)",
                "1 minuto",
                "Incantatore",
                "V",
                "1 minuto",
                "Contatti mentalmente un semidio, lo spirito di un saggio da tempo defunto, o qualche altra misteriosa entità di un altro piano. Contattare l’intelligenza extraplanare può affaticare o addirittura spezzare la tua mente. Quando lanci questo incantesimo, effettua un tiro salvezza su Intelligenza con CD 15. Se lo fallisci, subisci 6d6 danni psichici e resti demente fino al termine di un riposo lungo. Mentre sei demente, non puoi effettuare azioni, non puoi capire quello che dicono le altre creature, non puoi leggere, e parli solo farneticando. L’incantesimo ristorare superiore può porre fine a questo effetto. Se superi il tiro salvezza, puoi porre all’entità fino a cinque domande. Devi porre le domande prima del termine dell’incantesimo. Il GM risponderà a ciascuna domanda con una parola: “sì”, “no”, “forse”, “mai”, “irrilevante” o “confuso” (se l’entità non conosce la risposta alla domanda). Se una risposta di una parola potrebbe risultare fuorviante, il GM potrebbe invece dare come risposta una breve frase."
            )
        )



        result.add(
            Enchantment(
                "Contingenza",
                "Contingency",
                6,
                "Invocazione",
                "10 minuti",
                "Incantatore",
                "V, S, M (una statuetta raffigurante te stesso scolpita in avorio e decorata con gemme del valore di almeno 1.500 mo)",
                "10 giorni",
                "Scegli un incantesimo di 5° livello o più basso che puoi lanciare, che abbia il tempo di lancio di 1 azione, e che può avere te come bersaglio. Lanci quell’incantesimo (detto incantesimo contingente) come parte del lancio di contingenza, spendendo gli slot incantesimo di entrambi, ma senza che l’incantesimo contingente abbia effetto. Avrà invece effetto quando si avvererà una determinata circostanza. Descrivi questa circostanza mentre lanci i due incantesimi. Per esempio, contingenza lanciato assieme a respirare sott’acqua potrebbe stipulare che respirare sott’acqua entra in azione quando sei immerso nell’acqua o simile liquido. L’incantesimo contingente ha effetto immediatamente dopo che la circostanza si verifica per la prima volta, che tu lo voglia o no, e poi contingenza termina. L’incantesimo contingente agisce solo su di te, anche se normalmente può prendere come bersaglio anche altri. Puoi usare un solo incantesimo contingenza alla volta. Se lanci di nuovo questo incantesimo, l’effetto di un altro incantesimo contingenza su di te avrà termine. Inoltre, contingenza per te ha termine se la componente materiale non dovesse più trovarsi sulla tua persona."
            )
        )



        result.add(
            Enchantment(
                "Controincantesimo",
                "Counterspell",
                3,
                "Abiurazione",
                "1 reazione, che effettui quando vedi una creatura entro 18 metri da te lanciare un incantesimo",
                "18 metri",
                "S",
                "Istantanea",
                "Cerchi di interrompere una creatura nell’atto di lanciare un incantesimo. Se la creatura sta lanciando un incantesimo di 3° livello o più basso, l’incantesimo fallisce e non ha effetto. Se sta eseguendo un incantesimo di 4° livello o più alto, effettui una prova di caratteristica utilizzando la tua caratteristica da incantatore. La CD è uguale a 10 + il livello dell’incantesimo da interrompere. Se la superi, l’incantesimo della creatura fallisce e non ha effetto."
            )
        )



        result.add(
            Enchantment(
                "Controllare Acqua",
                "Control Water",
                4,
                "Trasmutazione",
                "1 azione",
                "90 metri",
                "V, S, M (un goccio d’acqua e un pizzico di polvere)",
                "Concentrazione, massimo 10 minuti",
                "Fino al termine dell’incantesimo, controlli qualsiasi acqua libera all’interno dell’area che hai scelto fino a un cubo di 30 metri di spigolo. Quando lanci questo incantesimo puoi scegliere qualsiasi tra i seguenti effetti. Come azione, durante il tuo turno, puoi ripetere lo stesso effetto o sceglierne uno diverso."
            )
        )



        result.add(
            Enchantment(
                "Controllare Tempo Atmosferico",
                "Control Weather",
                8,
                "Trasmutazione",
                "10 minuti",
                "Incantatore (raggio di 1,5 chilometri)",
                "V, S, M (incenso bruciato e po’ di terra e legno mescolati nell’acqua)",
                "Concentrazione, massimo 8 ore",
                "Per la durata, assumi il controllo del clima entro 7,5 chilometri da te. Per lanciare questo incantesimo devi essere all’esterno. Muoversi in un posto dove non hai la visuale aperta verso il cielo, termina l’incantesimo anticipatamente. Quando lanci questo incantesimo, cambia le attuali condizioni climatiche, determinate dal GM in base alla stagione e la latitudine. Puoi modificare le precipitazioni, la temperatura e il vento. Ci vogliono 1d4 x 10 minuti perché la nuova condizione prenda effetto. Una volta che la condizione avrà preso effetto, potrai cambiarla di nuovo. Quando l’incantesimo termina, il clima tornerà gradualmente alla norma. Quando cambi le condizioni climatiche, trova l’attuale condizione sulla seguente tabella e cambiala di uno stadio, verso l’alto o il basso. Quando cambi il vento, puoi cambiarne anche la direzione."
            )
        )



        result.add(
            Enchantment(
                "Costrizione",
                "geas",
                5,
                "Ammaliamento",
                "1 minuto",
                "18 metri",
                "V",
                "30 giorni",
                "Imponi un comando magico a una creatura a gittata che puoi vedere, obbligandolo ad adempiere un determinato compito o vietandole di svolgere un’azione o corso d’attività deciso da te. Se la creatura ti può capire, deve superare un tiro salvezza su Saggezza o restare affascinata da te per la durata. Mentre la creatura è affascinata da te, subisce 5d10 danni psichici ogni volta che agisce in maniera direttamente contraria alle tue istruzioni, ma non più di una volta al giorno. Una creatura che non ti può capire ignora gli effetti di questo incantesimo. Puoi dare qualsiasi comando di tua scelta, tranne un’attività che provocherebbe morte certa. Dovessi tu pronunciare un comando suicida, l’incantesimo avrebbe termine. Puoi terminare l’incantesimo usando un’azione. Anche rimuovi maledizione, ristorare superiore o desiderio vi pongono termine."
            )
        )



        result.add(
            Enchantment(
                "Creare Cibo e Acqua",
                "Create Food and Water",
                3,
                "Evocazione",
                "1 azione",
                "9 metri",
                "V, S",
                "Istantanea",
                "Crei 22,5 chili di cibo e 120 litri d’acqua sul terreno o in contenitori a gittata, sufficienti a sostenere fino a quindici umanoidi o cinque cavalcature per 24 ore. Il cibo è blando ma nutriente, e marcisce dopo 24 ore se non viene consumato. L’acqua è pulita e non va a male."
            )
        )



        result.add(
            Enchantment(
                "Creare Non Morti",
                "Create Undead",
                6,
                "Necromanzia",
                "1 azione",
                "3 metri",
                "V, S, M (un vaso di terracotta pieno di terra di cimitero, un vaso di terracotta pieno di acqua salmastra, e un onice nero del valore di 50 mo per ogni cadavere)",
                "Istantanea",
                "Puoi lanciare questo incantesimo solo di notte. Scegli fino a tre cadaveri di umanoidi Medi o Piccoli a gittata. Ogni cadavere diventa un ghoul sotto il tuo controllo (il GM possiede le statistiche di gioco di queste creature). Durante il tuo turno, con un’azione bonus, puoi comandare mentalmente qualsiasi creatura da te animata con questo incantesimo, se la creatura si trova entro 36 metri da te (se controlli più creature, puoi comandarle tutte o solo alcune nello stesso momento, impartendo lo stesso comando a ciascuna). Decidi tu quale azione effettuerà la creatura e dove si muoverà durante il suo prossimo turno, oppure puoi impartire un comando generico, come quello di fare la guardia a una specifica stanza o corridoio. Se non impartisci comandi, le creature si limiteranno a difendersi dalle creature ostili. Una volta ricevuto un comando, la creatura continuerà a eseguirlo finche il compito sarà completo. La creatura è sotto il tuo controllo per 24 ore, dopodiché smetterà di rispondere ai comandi che gli impartisci. Per mantenere il controllo della creatura per altre 24 ore, devi lanciare questo incantesimo sulla creatura prima che l’attuale periodo di 24 ore abbia termine. Questo impiego dell’incantesimo riasserisce il tuo controllo su di un massimo di tre creature che hai animato con questo incantesimo, anziché animarne di nuove."
            )
        )



        result.add(
            Enchantment(
                "Creare o Distruggere Acqua",
                "Create or Destroy Water",
                1,
                "Trasmutazione",
                "1 azione",
                "9 metri",
                "V, S, M (un goccio d’acqua per creare acqua o qualche granello di sale per distruggerla)",
                "Istantanea",
                "Crei o distruggi l’acqua."
            )
        )



        result.add(
            Enchantment(
                "Creazione",
                "Creation",
                5,
                "Illusione",
                "1 minuto",
                "9 metri",
                "V, S, M (un minuscolo pezzo di materiale dello stesso tipo di oggetto che intendi creare)",
                "Speciale",
                "Afferri pezzi di materia d’ombra dal Mondo delle Ombre per creare, a gittata, oggetti non viventi di materia vegetale: beni morbidi, corda, legno o qualcosa di simile. Puoi usare questo incantesimo anche per creare oggetti minerali come pietra, cristallo o metallo. L’oggetto creato non può essere più grosso di un cubo di 1,5 metri di spigolo, e l’oggetto deve essere di una forma e materiale che hai già visto in passato. La durata dipende dal materiale dell’oggetto. Se l’oggetto è composto da più materiali, usa la durata più breve."
            )
        )



        result.add(
            Enchantment(
                "Crescita di Spine",
                "Spike Growth",
                2,
                "Trasmutazione",
                "1 azione",
                "45 metri",
                "V, S, M (sette spine affilate o sette ramoscelli, ciascuno di esse appuntito ad un’estremità)",
                "Concentrazione, massimo 10 minuti",
                "Il terreno in un raggio di 6 metri centrato su di un punto a gittata si contorce e genera spuntoni e spine molto acuminate. Per la durata, l’area diventa terreno difficile. Quando una creatura entra o si muove all’interno dell’area, subisce 2d4 danni perforanti per ogni 1,5 metri percorsi."
            )
        )



        result.add(
            Enchantment(
                "Crescita Vegetale",
                "Plant Growth",
                3,
                "Trasmutazione",
                "1 azione o 8 ore",
                "45 metri",
                "V, S",
                "Istantanea",
                "Questo incantesimo incanala vitalità nei vegetali entro una specifica area. Esistono due usi possibili per questo incantesimo, che conferiscono benefici immediati o a lungo termine. Se lanci questo incantesimo impiegando 1 azione, scegli un punto a gittata. Tutte i vegetali normali in un raggio di 30 metri centrato su quel punto diventano densi e folti. Una creatura che attraversa l’area quadruplica il costo del suo movimento. Puoi escludere dai suoi effetti una o più aree di qualsiasi dimensione all’interno dell’area dell’incantesimo."
            )
        )



        result.add(
            Enchantment(
                "Cura Ferite",
                "Cure Wounds",
                1,
                "Invocazione",
                "1 azione",
                "Contatto",
                "V, S",
                "Istantanea",
                "Una creatura a contatto con te recupera un numero di punti ferita uguale a 1d8 + il tuo modificatore di caratteristica da incantatore. Questo incantesimo non ha effetto su non morti e costrutti."
            )
        )



        result.add(
            Enchantment(
                "Cura Ferite di Massa",
                "Mass Cure Wounds",
                5,
                "Invocazione",
                "1 azione",
                "18 metri",
                "V, S",
                "Istantanea",
                "Un’onda di energia guaritrice parte da un punto a gittata, scelto da te. Scegli fino a sei creatura in una sfera di 9 metri di raggio centrata su quel punto. Ogni bersaglio recupera punti ferita uguali a 3d8 + il tuo modificatore di caratteristica da incantatore. Questo incantesimo non ha effetto su non morti o costrutti."
            )
        )



        result.add(
            Enchantment(
                "Danza Irresistibile",
                "Irresistible Dance",
                8,
                "Ammaliamento",
                "1 azione",
                "9 metri",
                "V",
                "Concentrazione, massimo 1 minuto",
                "Scegli una creatura a gittata e che puoi vedere. Il bersaglio comincia un comico balletto sul posto: agitando le gambe, battendo i piedi e saltellando per la durata. Le creature che non possono essere affascinate sono immuni a questo incantesimo. Una creatura che balla deve usare tutto il suo movimento per ballare senza lasciare il suo spazio e ha svantaggio ai tiri salvezza su Destrezza e i tiri per colpire. Mentre il bersaglio è soggetto a questo incantesimo, le altre creature hanno vantaggio ai tiri per colpire contro di lui. Con un’azione, una creatura che balla effettua un tiro salvezza su Saggezza per recuperare il controllo di se stessa. Se lo supera, l’incantesimo ha fine."
            )
        )



        result.add(
            Enchantment(
                "Dardo di Fuoco",
                "Fire Bolt",
                0,
                "Invocazione",
                "1 azione",
                "36 metri",
                "V, S",
                "Istantanea",
                "Scagli una scintilla infuocata a una creatura od oggetto a gittata. Effettua un attacco a distanza con incantesimo contro il bersaglio. Se colpisci, il bersaglio subisce 1d10 danni da fuoco. Un oggetto infiammabile colpito da questo incantesimo prende fuoco, se non è indossato o trasportato. Il danno dell’incantesimo aumenta di 1d10 quando raggiungi il 5° livello (2d10), 11° livello (3d10) e 17° livello (4d10)."
            )
        )



        result.add(
            Enchantment(
                "Dardo Incantato",
                "Magic Missile",
                1,
                "Invocazione",
                "1 azione",
                "36 metri",
                "V, S",
                "Istantanea",
                "Crei tre dardi luminosi di forza magica. Ciascun dardo colpisce una creatura a gittata che puoi vedere, scelta da te. Un dardo infligge 1d4 + 1 danni da forza al suo bersaglio. I dardi colpiscono tutti simultaneamente, e li puoi dirigere perché colpiscano una o più creature."
            )
        )



        result.add(
            Enchantment(
                "Dardo Tracciante",
                "Guiding Bolt",
                1,
                "Invocazione",
                "1 azione",
                "36 metri",
                "V, S",
                "1 round",
                "Un lampo di luce viaggia verso una creatura a gittata, scelta da te. Effettua un attacco a distanza con incantesimo contro il bersaglio. Se colpisci, il bersaglio subisce 4d6 danni radianti, e il prossimo tiro per colpire effettuato contro di lui prima del termine del tuo prossimo turno ha vantaggio, grazie alla mistica luce fioca che continuerà a brillare intorno al bersaglio fino ad allora."
            )
        )



        result.add(
            Enchantment(
                "Deflagrazione Occulta",
                "Eldritch Blast",
                0,
                "Invocazione",
                "1 azione",
                "36 metri",
                "V, S",
                "Istantanea",
                "Un fascio di energia crepitante si dirige verso una creatura a gittata. Effettua un attacco a distanza con incantesimo contro il bersaglio. Se colpisci, il bersaglio subisce 1d10 danni da forza. Quando raggiungi i livelli più elevati, l’incantesimo crea più fasci di energia: due fasci di energia al 5° livello, tre all’11° livello e quattro al 17° livello. Puoi dirigere questi fasci di energia contro lo stesso bersaglio o dividerli tra più bersagli. Effettua un tiro per colpire separato per ogni fascio di energia."
            )
        )



        result.add(
            Enchantment(
                "Desiderio",
                "Wish",
                9,
                "Evocazione",
                "1 azione",
                "Incantatore",
                "V",
                "Istantanea",
                "Desiderio è il più potente incantesimo che una creatura mortale possa lanciare. Semplicemente parlando ad alta voce, puoi modificare le stesse fondamenta della realtà a seconda dei tuoi bisogni. L’uso basilare di questo incantesimo è quello di riprodurre l’effetto di qualsiasi altro incantesimo di 8° livello o più basso. Non devi soddisfare nessuno dei requisiti dell’incantesimo, comprese le componenti materiali costose. L’incantesimo ha semplicemente effetto. In alternativa, puoi creare uno dei seguenti effetti a tua scelta:"
            )
        )



        result.add(
            Enchantment(
                "Destriero Fantomatico",
                "Phantom Steed",
                3,
                "Illusione (rituale)",
                "1 minuto",
                "9 metri",
                "V, S",
                "1 ora",
                "Una creatura quasi reale simile a un cavallo di taglia Grande, appare sul terreno in uno spazio non occupato di tua scelta e a gittata. Decidi tu l’aspetto della creatura, e questa compare equipaggiata di sella, morso e briglia. Qualsiasi equipaggiamento creato dall’incantesimo svanisce in una nuvola di fumo se viene portato a più di 3 metri di distanza dal destriero. Per la durata, tu o una creatura di tua scelta potete cavalcare il destriero. La creatura usa le statistiche del cavallo da corsa, eccetto che ha velocità 30 metri e può percorrere 15 chilometri in un’ora, o 20 chilometri ad andatura veloce. Quando l’incantesimo termina, il destriero inizia gradualmente a svanire, dando al cavallerizzo 1 minuto per smontare di sella. L’incantesimo termina se usi un’azione per interromperlo o se il destriero subisce danni."
            )
        )



        result.add(
            Enchantment(
                "Disco Fluttuante",
                "Floating Disk",
                1,
                "Evocazione (rituale)",
                "1 azione",
                "9 metri",
                "V, S, M (una goccia di mercurio)",
                "1 ora",
                "Questo incantesimo crea un piano di forza orizzontale, perfettamente circolare, di 1 metro di diametro e 2,5 centimetri di spessore che fluttua a 1 metro da terra, in uno spazio non occupato di tua scelta a gittata e che puoi vedere. Il disco rimane attivo per la durata, e può sostenere 250 chili. Se gli viene poggiato sopra un peso superiore, l’incantesimo termina e tutto quello che vi si trova sopra cade a terra. Finché ti trovi entro 6 metri da esso, il disco è immobile. Se ti muovi più di 6 metri lontano da esso, il disco ti segue in modo da rimanere sempre a 6 metri da te. Può muoversi attraverso terreno disomogeneo, su e giù per le scale, pendenze e simili, ma non può superare cambi di altitudine di 3 o più metri. Per esempio, il disco non può attraversare un fossato profondo 3 metri, né potrebbe lasciare il fossato se fosse creato in fondo a esso. Se ti allontani più di 30 metri dal disco (di solito perché non riesce ad aggirare un ostacolo nel seguirti), l’incantesimo termina."
            )
        )



        result.add(
            Enchantment(
                "Disintegrazione",
                "Disintegrate",
                6,
                "Trasmutazione",
                "1 azione",
                "18 metri",
                "V, S, M (una calamita e un pizzico di polvere)",
                "Istantanea",
                "Un sottile raggio verde parte dal tuo dito puntato verso un bersaglio a gittata e che puoi vedere. Il bersaglio può essere una creatura, un oggetto o una creazione di forza magica, come un muro creato da muro di forza. Una creatura bersaglio di questo incantesimo deve effettuare un tiro salvezza su Destrezza. Il bersaglio subisce 10d6 + 40 danni da forza se fallisce il tiro salvezza. Se questo danno riduce il bersaglio a 0 punti ferita, questi è disintegrato. Una creatura disintegrata e tutto quello che indossa e trasporta, eccetto gli oggetti magici, viene ridotta a una pila di sottile polvere grigia. La creatura può essere riportata in vita solo tramite un incantesimo resurrezione pura o desiderio. Questo incantesimo disintegra automaticamente gli oggetti non magici o una creazione di forza magica di taglia Grande o più piccola. Se il bersaglio è un oggetto non magico o una creazione di forza di taglia Enorme o più grossa, questo incantesimo disintegra una porzione di essa pari a un cubo di 3 metri di spigolo. Gli oggetti magici ignorano questo incantesimo."
            )
        )



        result.add(
            Enchantment(
                "Dissolvi il Bene e il Male",
                "Dispel Evil and Good",
                5,
                "Abiurazione",
                "1 azione",
                "Incantatore",
                "V, S, M (acqua sacra o argento e ferro in polvere)",
                "Concentrazione, massimo 1 minuto",
                "Un’energia luminosa ti circonda e ti protegge da fatati, non morti e creature originarie di luoghi al di là del Piano Materiale. Per la durata, i celestiali, elementali, fatati, immondi e non morti hanno svantaggio ai tiri per colpire contro di te. Puoi terminare l’incantesimo anticipatamente usando una delle seguenti funzioni speciali."
            )
        )



        result.add(
            Enchantment(
                "Dissolvi Magie",
                "Dispel Magic",
                3,
                "Abiurazione",
                "1 azione",
                "36 metri",
                "V, S",
                "Istantanea",
                "Scegli una creatura, oggetto o effetto magico a gittata. Qualsiasi incantesimo di 3° livello o più basso sul bersaglio ha fine. Per ogni incantesimo di 4° livello o più alto sul bersaglio, effettua una prova di caratteristica usando la tua caratteristica da incantatore. La CD della prova è uguale a 10 + il livello dell’incantesimo da dissolvere. Se superi la prova, l’incantesimo ha termine."
            )
        )



        result.add(
            Enchantment(
                "Dito della Morte",
                "Finger of Death",
                7,
                "Necromanzia",
                "1 azione",
                "18 metri",
                "V, S",
                "Istantanea",
                "Invii una scarica di energia negativa a una creatura a gittata e che puoi vedere, provocandole profondo dolore. Il bersaglio deve effettuare un tiro salvezza su Costituzione. Il bersaglio subisce 7d8 + 30 danni necrotici se fallisce il tiro salvezza, o la metà di questi danni se lo supera. Un umanoide ucciso da questo incantesimo si rianima come zombi sotto il tuo comando permanente all’inizio del tuo prossimo turno, e seguirà i tuoi ordini verbali al meglio delle sue capacità."
            )
        )



        result.add(
            Enchantment(
                "Divinazione",
                "Divination",
                4,
                "Divinazione (rituale)",
                "1 azione",
                "Incantatore",
                "V, S, M (incenso e un’offerta sacrificale appropriata alla tua religione, il cui valore complessivo sia di 25 mo, che saranno consumati dall’incantesimo)",
                "Istantanea",
                "La tua magia e un’offerta votiva ti mettono in comunicazione con un dio o il servitore di un dio. Gli puoi porre una singola domanda in merito a uno specifico obiettivo, evento o attività che debba verificarsi entro 7 giorni. Il GM dà una risposta veritiera. La replica potrebbe essere una breve frase, una rima criptica o un presagio. L’incantesimo non tiene conto di ogni possibile circostanza che possa modificare il risultato, come il lancio di ulteriori incantesimi o la perdita o l’arrivo di un alleato. Se lanci l’incantesimo due o più volte prima di aver terminato il tuo prossimo riposo lungo, c’è una probabilità cumulativa del 25% che per ogni lancio dopo il primo tu ottenga una lettura erronea. Il GM effettua questo tiro in segreto."
            )
        )



        result.add(
            Enchantment(
                "Dominare Bestie",
                "Dominate Beast",
                4,
                "Ammaliamento",
                "1 azione",
                "18 metri",
                "V, S",
                "Concentrazione, massimo 1 minuto",
                "Cerchi di affascinare una bestia a gittata che puoi vedere. Essa deve superare un tiro salvezza su Saggezza o restare affascinata per la durata, ricevendo vantaggio al tiro se tu o i tuoi alleati la state combattendo. Mentre la bestia è affascinata, finché voi due vi trovate sullo stesso piano di esistenza mantieni un collegamento telepatico con essa. Puoi usare questo collegamento telepatico per inviare comandi alla creatura mentre sei cosciente (non richiede un’azione), a cui essa obbedirà al suo meglio. Puoi specificare un corso d’azione semplice e generico, come “Attacca quella creatura”, “Corri laggiù”, o “Prendi quell’oggetto”. Se la creatura completa l’ordine e non riceve ulteriori indicazioni da te, si difenderà e preserverà al meglio delle sue capacità. Puoi impiegare la tua azione per assumere il totale e preciso controllo del bersaglio. Fino al termine del tuo prossimo turno, il bersaglio effettuerà solo le azioni decise da te, e non farà nulla che tu non gli permetta di fare. Durante questo periodo, puoi anche far usare una reazione al bersaglio, ma ciò richiede l’uso della tua reazione. Ogni volta che il bersaglio subisce danni, effettua un nuovo tiro salvezza su Saggezza contro l’incantesimo. Se supera il tiro salvezza, l’incantesimo termina."
            )
        )



        result.add(
            Enchantment(
                "Dominare Mostri",
                "Dominate Monster",
                8,
                "Ammaliamento",
                "1 azione",
                "18 metri",
                "V, S",
                "Concentrazione, massimo 1 ora",
                "Cerchi di affascinare una creatura a gittata che puoi vedere. Essa deve superare un tiro salvezza su Saggezza o restare affascinata per la durata, ricevendo vantaggio al tiro se tu o i tuoi alleati la state combattendo. Mentre la creatura è affascinata, finché voi due vi trovate sullo stesso piano di esistenza mantieni un collegamento telepatico con essa. Puoi usare questo collegamento telepatico per inviare comandi alla creatura mentre sei cosciente (non richiede un’azione), a cui essa obbedirà al suo meglio. Puoi specificare un corso d’azione semplice e generico, come “Attacca quella creatura”, “Corri laggiù”, o “Prendi quell’oggetto”. Se la creatura completa l’ordine e non riceve ulteriori indicazioni da te, si difenderà e preserverà al meglio delle sue capacità. Puoi impiegare la tua azione per assumere il totale e preciso controllo del bersaglio. Fino al termine del tuo prossimo turno la creatura effettuerà solo le azioni decise da te, e non farà nulla che tu non le permetta di fare. Durante questo periodo, puoi anche far usare una reazione alla creatura, ma ciò richiede l’uso della tua reazione. Ogni volta che il bersaglio subisce danni, effettua un nuovo tiro salvezza su Saggezza contro l’incantesimo. Se supera il tiro salvezza, l’incantesimo termina."
            )
        )



        result.add(
            Enchantment(
                "Dominare Persone",
                "Dominate Person",
                5,
                "Ammaliamento",
                "1 azione",
                "18 metri",
                "V, S",
                "Concentrazione, massimo 1 minuto",
                "Cerchi di affascinare un umanoide a gittata che puoi vedere. Esso deve superare un tiro salvezza su Saggezza o restare affascinato per la durata, ricevendo vantaggio al tiro se tu o i tuoi alleati lo state combattendo. Mentre il bersaglio è affascinato, finché voi due vi trovate sullo stesso piano di esistenza mantieni un collegamento telepatico con esso. Puoi usare questo collegamento telepatico per inviare comandi al bersaglio mentre sei cosciente (non richiede un’azione), a cui esso obbedirà al suo meglio. Puoi specificare un corso d’azione semplice e generico, come “Attacca quella creatura”, “Corri laggiù”, o “Prendi quell’oggetto”. Se il bersaglio completa l’ordine e non riceve ulteriori indicazioni da te, si difenderà e preserverà al meglio delle sue capacità. Puoi impiegare la tua azione per assumere il totale e preciso controllo del bersaglio. Fino al termine del tuo prossimo turno, il bersaglio effettuerà solo le azioni decise da te, e non farà nulla che tu non gli permetta di fare. Durante questo periodo, puoi anche far usare una reazione al bersaglio, ma ciò richiede l’uso della tua reazione. Ogni volta che il bersaglio subisce danni, effettua un nuovo tiro salvezza su Saggezza contro l’incantesimo. Se supera il tiro salvezza, l’incantesimo termina."
            )
        )



        result.add(
            Enchantment(
                "Eroismo",
                "Heroism",
                1,
                "Ammaliamento",
                "1 azione",
                "Contatto",
                "V, S",
                "Concentrazione, massimo 1 minuto",
                "Una creatura consenziente con cui sei in contatto viene infusa di coraggio. Fino al termine dell’incantesimo, la creatura è immune all’essere spaventata e, all’inizio di ciascun suo turno, ottiene punti ferita temporanei pari al tuo modificatore di caratteristica da incantatore. Quando l’incantesimo ha termine, il bersaglio perde tutti i punti ferita temporanei rimanenti derivati da questo incantesimo."
            )
        )



        result.add(
            Enchantment(
                "Esilio",
                "Banishment",
                4,
                "Abiurazione",
                "1 azione",
                "18 metri",
                "V, S, M (un oggetto disprezzato dal bersaglio)",
                "Concentrazione, massimo 1 minuto",
                "Cerchi di spedire una creatura a gittata e che puoi vedere in un altro piano di esistenza. Il bersaglio deve superare un tiro salvezza su Carisma o venire esiliato. Se il bersaglio è natio del piano di esistenza in cui ti trovi, esili il bersaglio in un semipiano innocuo. Mentre è lì, il bersaglio è inabile. Il bersaglio rimane lì fino al termine dell’incantesimo, quando riapparirà nello spazio che aveva lasciato o nello spazio non occupato più vicino, se il suo spazio originale adesso è occupato. Se il bersaglio è natio di un diverso piano di esistenza da quello in cui ti trovi, il bersaglio svanisce emettendo un lieve scoppio, tornando al suo piano natio. Se l’incantesimo termina prima che sia trascorso 1 minuto, il bersaglio riappare nello spazio che aveva lasciato o nello spazio non occupato più vicino, se il suo spazio originale è occupato."
            )
        )



        result.add(
            Enchantment(
                "Esplosione Solare",
                "Sunburst",
                8,
                "Invocazione",
                "1 azione",
                "45 metri",
                "V, S, M (fuoco e un pezzo di pietra di sole)",
                "Istantanea",
                "Un’intensa luce solare illumina in un raggio di 18 metri centrato su di un punto a gittata, scelto da te. Tutte le creature all’interno della luce devono effettuare un tiro salvezza su Costituzione. Se fallisce il tiro salvezza, una creatura subisce 12d6 danni radianti e resta accecata per 1 minuto. Se lo supera, subisce la metà dei danni e non resta accecata dall’incantesimo. Non morti e melme hanno svantaggio a questo tiro salvezza. Una creatura accecata da questo incantesimo effettua un altro tiro salvezza su Costituzione alla fine di ciascun suo turno. Se supera il tiro salvezza, non è più accecata. Nella sua area, questo incantesimo dissolve qualsiasi oscurità generata da un incantesimo."
            )
        )



        result.add(
            Enchantment(
                "Estasiare",
                "Enthrall",
                2,
                "Ammaliamento",
                "1 azione",
                "Incantatore",
                "V, S",
                "1 minuto",
                "Intessi una serie di parole svianti, facendo sì che delle creature di tua scelta entro la gittata, che puoi vedere e possano sentirti, effettuino un tiro salvezza su Saggezza. Qualsiasi creatura che non può restare affascinata supera il tiro salvezza automaticamente, e se tu o i tuoi compagni state combattendo una creatura, questa ha vantaggio al tiro salvezza. Se fallisce il tiro salvezza, il bersaglio ha svantaggio sulle prove di Saggezza (Percezione) effettuate per percepire una qualsiasi creatura diversa da te fino al termine dell’incantesimo o finché il bersaglio non può più sentirti. L’incantesimo termina se sei reso inabile o non puoi più parlare."
            )
        )



        result.add(
            Enchantment(
                "Evoca Animali",
                "Conjure Animals",
                3,
                "Evocazione",
                "1 azione",
                "18 metri",
                "V, S",
                "Concentrazione, massimo 1 ora",
                "Evochi spiriti fatati che assumono l’aspetto di bestie e compaiono in spazi non occupati a gittata e che puoi vedere. Scegli una delle seguenti opzioni per determinare ciò che appare:"
            )
        )



        result.add(
            Enchantment(
                "Evoca Celestiale",
                "Conjure Celestial",
                7,
                "Evocazione",
                "1 minuto",
                "27 metri",
                "V, S",
                "Concentrazione, massimo 1 ora",
                "Evochi un celestiale di grado sfida 4 o inferiore, che appare in uno spazio non occupato a gittata e che puoi vedere. Il celestiale sparisce quando scende a 0 punti ferita o l’incantesimo termina. Il celestiale è amichevole verso di te e i tuoi compagni per la durata dell’incantesimo. Tira l’iniziativa per il celestiale, che agisce durante il proprio turno. Obbedisce a qualsiasi comando verbale che gli viene dato (senza bisogno che tu compia azioni), purché non violi il suo allineamento. Se non dai comandi al celestiale, si difenderà dalle creature ostili, ma non compirà altre azioni."
            )
        )



        result.add(
            Enchantment(
                "Evoca Creature Boschive",
                "Conjure Woodland Beings",
                4,
                "Evocazione",
                "1 azione",
                "18 metri",
                "V, S, M (una bacca di agrifoglio per creatura convocata)",
                "Concentrazione, massimo 1 ora",
                "Evochi spiriti fatati che compaiono in spazi non occupati a gittata e che puoi vedere. Scegli una delle seguenti opzioni per determinare ciò che appare:"
            )
        )



        result.add(
            Enchantment(
                "Evoca Elementale",
                "Conjure Elemental",
                5,
                "Evocazione",
                "1 minuto",
                "27 metri",
                "V, S, M (incenso bruciato per l’aria, argilla malleabile per la terra, zolfo e fosforo per il fuoco, o acqua e sabbia per l’acqua)",
                "Concentrazione, massimo 1 ora",
                "Evochi un servitore elementale. Scegli un’area a gittata composta di acqua, aria, fuoco o terra e che riempia un cubo di 3 metri di spigolo. Un elementale di grado di sfida 5 o minore appropriato all’area da te scelta compare in uno spazio non occupato entro 3 metri da essa. L’elementale sparisce quando scende a 0 punti ferita o l’incantesimo termina. L’elementale è amichevole verso di te e i tuoi compagni per la durata dell’incantesimo. Tira l’iniziativa per l’elementale, che agisce durante il proprio turno. Obbedisce a qualsiasi comando verbale che gli viene dato (senza bisogno che tu compia azioni). Se non dai comandi all’elementale, si difenderà dalle creature ostili, ma non compirà altre azioni. Se la tua concentrazione viene infranta, l’elementale non sparisce. Invece, perderai il controllo dell’elementale, che diventerà ostile verso di te e i tuoi compagni, e potrebbe attaccarvi. Un elementale fuori controllo non può essere congedato da te, e sparisce 1 ora dopo che lo hai convocato."
            )
        )



        result.add(
            Enchantment(
                "Evoca Elementali Minori",
                "Conjure Minor Elementals",
                4,
                "Evocazione",
                "1 minuto",
                "27 metri",
                "V, S",
                "Concentrazione, massimo 1 ora",
                "Evochi degli elementali che compariranno in spazi non occupati a gittata e che puoi vedere. Scegli una della seguenti opzioni per decidere cosa appare:"
            )
        )



        result.add(
            Enchantment(
                "Evoca Folletto",
                "Conjure Fey",
                6,
                "Evocazione",
                "1 minuto",
                "27 metri",
                "V, S",
                "Concentrazione, massimo 1 ora",
                "Evochi uno spirito fatato di grado di sfida 6 o inferiore, o uno spirito fatato che assuma la forma di una bestia di grado di sfida 6 o inferiore. Esso compare in uno spazio non occupato a gittata e che puoi vedere. La creatura fatata sparisce quando scende a 0 punti ferita o quando l’incantesimo termina. La creatura fatata è amichevole verso di te e i tuoi compagni. Tirare l’iniziativa per la creatura fatata, che agisce durante i propri turni. Essa obbedisce a qualsiasi comando verbale che gli viene dato (senza bisogno che tu compia azioni), purché non violi il suo allineamento. Se non dai comandi, si difenderà dalle creature ostili, ma non compirà altre azioni. Se la tua concentrazione viene infranta, la creatura fatata non sparisce. Invece, perderai il controllo della creatura fatata, che diventerà ostile verso di te e i tuoi compagni, e potrebbe attaccarvi. Una creatura fatata fuori controllo non può essere congedata da te, e sparisce 1 ora dopo che l’hai evocata."
            )
        )



        result.add(
            Enchantment(
                "Evocazioni Istantanee",
                "Instant Summons",
                6,
                "Evocazione (rituale)",
                "1 minuto",
                "Contatto",
                "V, S, M (uno zaffiro del valore di 1.000 mo)",
                "Fino a che dissolto",
                "Entri a contatto con un oggetto del peso di 5 chili o meno e la cui dimensione più grossa non superi i 180 centimetri. L’incantesimo lascia un marchio sulla superficie dell’oggetto e ne incide invisibilmente il nome sullo zaffiro usato come componente materiale. Ogni volta che lanci questo incantesimo, devi usare uno zaffiro diverso. In qualsiasi momento successivo, puoi usare la tua azione per pronunciare il nome dell’oggetto e frantumare lo zaffiro. L’oggetto appare istantaneamente nella tua mano quale che sia la distanza fisica o planare che vi separa, e l’incantesimo ha termine. Se un’altra creatura sta impugnando o trasportando l’oggetto, frantumare lo zaffiro non trasporterà l’oggetto da te, ma invece apprenderai chi sia la creatura che ne è in possesso e indicativamente dove si trovi in questo momento. Dissolvi magie, o un effetto simile applicato con successo allo zaffiro, termina l’effetto dell’incantesimo."
            )
        )



        result.add(
            Enchantment(
                "Fabbricare",
                "Fabricate",
                4,
                "Trasmutazione",
                "10 minuti",
                "36 metri",
                "V, S",
                "Istantanea",
                "Converti le materie prime in prodotti finiti dello stesso materiale. Per esempio, puoi fabbricare un ponte di legno da un cumulo di alberi, una corda da un mucchio di canapa, e abiti dal lino o la lana. Scegli le materie prima che puoi vedere a gittata. Puoi fabbricare un oggetto di taglia Grande o inferiore (contenuto in un cubo di 3 metri di spigolo, o otto cubi connessi di 1,5 metri di spigolo) data una sufficiente quantità di materie prime. Se stai lavorando con il metallo, la pietra o altre sostanze minerali, l’oggetto fabbricato non può essere più grande di taglia Media (contenuto in un singolo cubo di 1,5 metri di spigolo). La qualità degli oggetti creati da questo incantesimo è commisurata alla qualità delle materie prime. Tramite questo incantesimo non si possono creare o trasmutare creature od oggetti magici. Inoltre non puoi usarlo per creare oggetti che normalmente richiedono un alto livello di lavorazione, come i gioielli, le armi, il vetro o le armature, a meno che tu non abbia la competenza con il tipo di strumenti da artigiano utilizzati per costruire questi oggetti."
            )
        )



        result.add(
            Enchantment(
                "Faro di Speranza",
                "Beacon of Hope",
                3,
                "Abiurazione",
                "1 azione",
                "9 metri",
                "V, S",
                "Concentrazione, massimo 1 minuto",
                "Questo incantesimo conferisce speranza e vitalità. Scegli un qualsiasi numero di creature a gittata. Per la durata, ciascun bersaglio ha vantaggio ai tiri salvezza su Saggezza e ai tiri salvezza da morte, e da ogni cura ottiene il massimo numero di punti ferita possibili."
            )
        )



        result.add(
            Enchantment(
                "Fatale",
                "Weird",
                9,
                "Illusione",
                "1 azione",
                "36 metri",
                "V, S",
                "Concentrazione, massimo 1 minuto",
                "Attingendo alle paure più intime di un gruppo di creature, crei delle creature illusorie nella loro mente, visibili solo a loro. Ogni creatura in una sfera di 9 metri di raggio centrata su di un punto a tua scelta nella gittata, deve effettuare un tiro salvezza su Saggezza. Se fallisce il tiro salvezza, la creatura diventa spaventata per la durata. L’illusione affonda nelle paure più intime della creatura, manifestando i suoi incubi peggiori come una implacabile minaccia. Alla fine di ciascun turno della creatura spaventata, questa deve superare un tiro salvezza su Saggezza o subire 4d10 danni psichici. Se supera il tiro salvezza, per quella creatura l’incantesimo ha termine."
            )
        )



        result.add(
            Enchantment(
                "Favore Divino",
                "Divine Favor",
                1,
                "Invocazione",
                "1 azione bonus",
                "Incantatore",
                "V, S",
                "Concentrazione, massimo 1 minuto",
                "Le tue preghiere potenziano te e la tua arma. Fino al termine dell’incantesimo, quando colpisce, la tua arma infligge 1d4 danni radianti aggiuntivi."
            )
        )



        result.add(
            Enchantment(
                "Ferire",
                "Harm",
                6,
                "Necromanzia",
                "1 azione",
                "18 metri",
                "V, S",
                "Istantanea",
                "Scateni una malattia virulenta su di una creatura a gittata che puoi vedere. Il bersaglio deve effettuare un tiro salvezza su Costituzione. Il bersaglio subisce 14d6 danni necrotici se fallisce il tiro salvezza, o la metà di questi danni se lo supera. il danno non può ridurre i punti ferita del bersaglio sotto l’1. Se il bersaglio fallisce il tiro salvezza, i suoi punti ferita massimi sono ridotti per 1 ora di un ammontare uguale al danno necrotico subito. Qualsiasi effetto che rimuova una malattia permette ai punti ferita massimi del personaggio di poter tornare al valore normale prima che trascorra quel tempo."
            )
        )



        result.add(
            Enchantment(
                "Fermare il Tempo",
                "Time Stop",
                9,
                "Trasmutazione",
                "1 azione",
                "Incantatore",
                "V",
                "Istantanea",
                "Fermi brevemente il flusso del tempo per tutti, tranne che per te. Il tempo non scorre per le altre creature, mentre tu effettui 1d4 + 1 turni di fila, durante i quali puoi effettuare azioni e muoverti come sempre. Questo incantesimo termina se una delle azioni che usi durante questo periodo, o qualsiasi effetto che crei durante questo periodo, ha effetto su di una creatura diversa da te o su di un oggetto indossato o trasportato da qualcuno che non sia tu. Inoltre, l’incantesimo termina se ti muovi in un posto lontano più di 300 metri da quello in cui lo hai lanciato."
            )
        )



        result.add(
            Enchantment(
                "Fiamma Perenne",
                "Continual Flame",
                2,
                "Invocazione",
                "1 azione",
                "Contatto",
                "V, S, M (polvere di rubino del valore di 50 mo, che l’incantesimo consuma)",
                "Fino a che dissolto",
                "Una luminosità simile a quella prodotta da una fiaccola si sprigiona da un oggetto con cui sei in contatto. L’effetto sembra quello di una normale fiamma, ma non produce calore né necessita ossigeno. Una fiamma perpetua può essere celata o nascosta ma non può essere smorzata né spenta."
            )
        )



        result.add(
            Enchantment(
                "Fiamma Sacra",
                "Sacred Flame",
                0,
                "Invocazione",
                "1 azione",
                "18 metri",
                "V, S",
                "Istantanea",
                "Una luminosità simile a quella prodotta da una fiaccola discende su di una creatura a gittata che puoi vedere. Il bersaglio deve superare un tiro salvezza su Destrezza o subire 1d8 danni radianti. Il bersaglio non riceve il beneficio della copertura per questo tiro salvezza. Il danno dell’incantesimo aumenta di 1d8 quando raggiungi il 5° livello (2d8), l’11° livello (3d8) e il 17° livello (4d8)."
            )
        )



        result.add(
            Enchantment(
                "Fiotto Acido",
                "Acid Splash",
                0,
                "Evocazione",
                "1 azione",
                "18 metri",
                "V, S",
                "Istantanea",
                "Scagli una bolla di acido. Scegli una creatura a gittata o due creature a gittata che siano entro 1,5 metri l’una dall’altra. Il bersaglio deve superare un tiro salvezza su Destrezza o subire 1d6 danni da acido. Il danno dell’incantesimo aumenta di 1d6 quando raggiungi il 5° livello (2d6), 11° livello (3d6) e 17° livello (4d6)."
            )
        )



        result.add(
            Enchantment(
                "Folata di Vento",
                "Gust of Wind",
                2,
                "Invocazione",
                "1 azione",
                "Incantatore (linea di 18 metri)",
                "V, S, M (un seme di legume)",
                "Concentrazione, massimo 1 minuto",
                "Una linea di forte vento lunga 18 metri e larga 3 metri esplode partendo da te in una direzione a tua scelta, per la durata dell’incantesimo. Ogni creatura che inizia il suo turno dentro la linea deve superare un tiro salvezza su Forza o venire spinta lontano da te di 4,5 metri, seguendo la direzione della linea. Qualsiasi creatura sulla linea deve spendere il doppio del movimento per avvicinarsi a te."
            )
        )



        result.add(
            Enchantment(
                "Fondersi nella Pietra",
                "Meld into Stone",
                3,
                "Trasmutazione (rituale)",
                "1 azione",
                "Contatto",
                "V, S",
                "8 ore",
                "Entri in un oggetto o superficie di pietra grossi abbastanza da contenere tutto il tuo corpo, fondendoti con la pietra assieme a tutto l’equipaggiamento che trasporti per la durata. Usando il tuo movimento, entri nella pietra in un punto con cui sei in contatto. Non resta nulla della tua presenza che rimanga visibile o altrimenti possa essere individuato da sensi non magici. Mentre sei fuso con la pietra, non puoi vedere ciò cheavviene all’esterno, e qualsiasi prova di Saggezza (Percezione) che effettui per ascoltare i suoni prodotti fuori da essa è fatta con svantaggio. Resti consapevole del passare del tempo e puoi lanciare incantesimi su di te mentre sei fuso con la pietra. Puoi usare il tuo movimento per lasciare la pietra e ricomparire nel punto in cui vi sei entrato, terminando così l’incantesimo. Altrimenti non puoi muoverti. I danni minori alla pietra non ti danneggiano, ma la sua parziale distruzione o cambio di forma (di modo che tu non vi entri più) ti espellono da essa e ti infliggono 6d6 danni contundenti. La completa distruzione della pietra (o la sua trasmutazione in un’altra sostanza) ti fa espellere e ti infligge 50 danni contundenti. Se vieni espulso, cadi prono in uno spazio non occupato, nel punto più vicino a quello in cui sei entrato nella pietra."
            )
        )



        result.add(
            Enchantment(
                "Forma Eterea",
                "Etherealness",
                7,
                "Trasmutazione",
                "1 azione",
                "Incantatore",
                "V, S",
                "Massimo 8 ore",
                "Entri nelle regioni di confine del Piano Etereo, nell’area che si sovrappone al tuo piano attuale. Resti sul Confine Etereo per la durata o finché non usi un’azione per interrompere l’incantesimo. Se ti muovi verso l’alto o il basso, il costo del movimento è raddoppiato. Puoi vedere e udire il piano da cui provieni, ma tutto quello che si trova lì ti appare grigio, e non puoi vedere a più di 18 metri di distanza. Mentre sei sul Piano Etereo, può interagire solo con altre creature su quel piano. Le creature che non sono sul Piano Etereo non ti possono percepire né interagire con te, a meno che una capacità speciale o la magia gli fornisca la possibilità di farlo. Ignori tutti gli oggetti e gli effetti che non sono sul Piano Etereo, potendo così attraversare gli oggetti che percepisci sul piano da cui provieni. Quando l’incantesimo termina, ritorni immediatamente al piano da cui provieni nel punto che occupi attualmente. Se quando accade occupi lo stesso spazio di un oggetto solido o di una creatura, vieni immediatamente spostato nel più vicino spazio non occupato che puoi occupare e subisci 6 danni da forza per ogni metro di cui vieni spostato (o sua frazione). Questo incantesimo non ha effetto se lo esegui mentre sei già nel Piano Etereo o su di un piano che non vi confina, come uno dei Piani Esterni."
            )
        )



        result.add(
            Enchantment(
                "Forma Gassosa",
                "Gaseous Form",
                3,
                "Trasmutazione",
                "1 azione",
                "Contatto",
                "V, S, M (un pezzo di garza e un filo di fumo)",
                "Concentrazione, massimo 1 ora",
                "Trasformi una creatura consenziente con cui sei in contatto, insieme a tutto ciò che sta indossando e trasportando, in una nube vaporosa per la durata. L’incantesimo termina se la creatura scende a 0 punti ferita. Le creature incorporee ignorano questo effetto. Mentre è in questa forma, l’unico metodo di movimento del bersaglio è una velocità di volo 3 metri. Il bersaglio può entrare e occupare lo spazio di un’altra creatura. Ilbersaglio ha resistenza ai danni non magici, e ha vantaggio ai tiri salvezza su Forza, Destrezza e Costituzione. Il bersaglio può attraversare piccoli buchi, strettoie, e anche semplici fori, sebbene consideri i liquidi come superfici solide. Il bersaglio non può cadere e resta fluttuante nell’aria anche se stordito o altrimenti reso inabile. Mentre è nella forma di una nube vaporosa, il bersaglio non può parlare né manipolare oggetti, e qualsiasi oggetto stesse indossando o trasportando non può essere gettato, usato o altrimenti impiegato. Il bersaglio non può attaccare né lanciare incantesimi."
            )
        )



        result.add(
            Enchantment(
                "Forme Animali",
                "Animal Shapes",
                8,
                "Trasmutazione",
                "1 azione",
                "9 metri",
                "V, S",
                "Concentrazione, massimo 24 ore",
                "Trasformi magicamente altre creature in bestie. Scegli un qualsiasi numero di creature consenzienti a gittata e che puoi vedere. Trasformi ciascun bersaglio nella forma di una bestia di taglia Grande o minore con un grado di sfida 4 o inferiore. Nei turni successivi, puoi usare la tua azione per trasformare le creature soggette in nuove forme. La trasformazione permane per ciascun bersaglio per la durata dell’incantesimo, o finché quel bersaglio scende a 0 punti ferita o muore. Puoi scegliere una forma diversa per ciascun bersaglio. Le statistiche di gioco del bersaglio sono rimpiazzate dalle statistiche della bestia scelta, a eccezione dell’allineamento e dei punteggi di Intelligenza, Saggezza e Carisma che restano quelli del bersaglio. Il bersaglio assume i punti ferita della sua nuova forma e, quando ritorna alla sua forma normale, ritorna al numero di punti ferita che aveva prima di trasformarsi. Se si ritrasforma perché è sceso a 0 punti ferita, il danno in eccesso viene applicato alla forma originale. Purché il danno in eccesso non riduca la forma normale della creatura a 0 punti ferita, essa non è priva di sensi. La creatura è limitata nelle azioni che può svolgere dalla natura della sua nuova forma, e non può parlare né lanciare incantesimi."
            )
        )



        result.add(
            Enchantment(
                "Frantumare",
                "Shatter",
                2,
                "Invocazione",
                "1 azione",
                "18 metri",
                "V, S, M (un frammento di metallo)",
                "Istantanea",
                "Un forte squillo, molto intenso, erutta da un punto a gittata di tua scelta. Ogni creatura in una sfera di 3 metri di raggio centrata su quel punto deve effettuare un tiro salvezza su Costituzione. Una creatura subisce 3d8 danni da tuono se fallisce il tiro salvezza, o la metà di questi danni se lo supera. Una creatura composta di materiale inorganico, come pietra, cristallo o metallo, ha svantaggio sul tiro salvezza. Un oggetto non magico che non è indossato né trasportato subisce anch’esso danni se si trova nell’area dell’incantesimo."
            )
        )



        result.add(
            Enchantment(
                "Freccia Acida",
                "Acid Arrow",
                2,
                "Invocazione",
                "1 azione",
                "27 metri",
                "V, S, M (una foglia di rabarbaro in polvere e uno stomaco di pitone)",
                "Istantanea",
                "Una freccia verde luminosa saetta verso un bersaglio a gittata ed esplode con uno spruzzo d’acido. Effettua un attacco a distanza con incantesimo contro il bersaglio. Se colpisci, il bersaglio subisce immediatamente 4d4 danni da acido e 2d4 danni da acido al termine del suo prossimo turno. Se manchi, la freccia spruzza il bersaglio di acido infliggendo la metà dei danni iniziali e non arrecando danni al termine del prossimo turno del bersaglio."
            )
        )



        result.add(
            Enchantment(
                "Fulmine",
                "Lightning Bolt",
                3,
                "Invocazione",
                "1 azione",
                "Incantatore (linea di 30 metri)",
                "V, S, M (un pezzo di pelliccia e una verga d’ambra, cristallo o vetro)",
                "Istantanea",
                "Esplodi un fulmine che forma una linea lunga 30 metri e larga 1,5 metri che parte da dove ti trovi in una direzione scelta da te. Ogni creatura sulla linea deve superare un tiro salvezza su Destrezza. La creatura subisce 8d6 danni da fulmine se fallisce il tiro salvezza, o la metà di questi danni se lo supera. Il fulmine incendia gli oggetti infiammabili nell’area che non sono indossati o trasportati."
            )
        )



        result.add(
            Enchantment(
                "Fuorviare",
                "Mislead",
                5,
                "Illusione",
                "1 azione",
                "Incantatore",
                "S",
                "Concentrazione, massimo 1 ora",
                "Diventi invisibile nello stesso momento in cui un tuo doppione illusorio compare nel posto in cui ti trovi. Il doppione resta per la durata dell’incantesimo, ma l’invisibilità termina se attacchi o lanci un incantesimo. Puoi usare la tua azione per far muovere il doppione illusorio fino al doppio della tua velocità e fargli compiere un gesto, parlare e comportarsi in qualsiasi maniera tu voglia. Puoi vedere attraverso i suoi occhi e udire tramite le sue orecchie come se fossi nello spazio in cui si trova lui. Durante ciascun tuo turno, con un’azione bonus, puoi passare dall’usare i suoi sensi all’usare i tuoi, o viceversa. Mentre stai usando i suoi sensi, sei accecato e assordato riguardo i tuoi dintorni."
            )
        )



        result.add(
            Enchantment(
                "Gabbia di Forza",
                "Forcecage",
                7,
                "Invocazione",
                "1 azione",
                "30 metri",
                "V, S, M (polvere di rubino del valore di 1.500 mo)",
                "1 ora",
                "Una prigione cubica, immobile e invisibile, composta di forza magica compare intorno a un’area a gittata da te scelta. La prigione può essere una gabbia o una scatola solida, a tua scelta. Una prigione nella forma di una gabbia può avere 6 metri di lato ed essere composta da sbarre di 1,5 centimetri separate di 1,5 centimetri tra di loro. Una prigione a forma di scatola può avere 3 metri di lato, creando una barriera solida che impedisce a qualsiasi materia di attraversarla e bloccando qualsiasi incantesimo lanciato dall’interno o l’esterno dell’area. Quando lanci questo incantesimo, qualsiasi creatura che è completamente all’interno della gabbia, è intrappolata. Le creature solo parzialmente nell’area della gabbia, o quelle troppo grosse per entrarvi,vengono spinte via dal centro dell’area finché non ne sono completamente fuori. Una creatura all’interno della gabbia non può lasciarla tramite mezzi non magici. Se la creatura prova a usare il teletrasporto o il viaggio interplanare per lasciare la gabbia, deve prima effettuare un tiro salvezza su Carisma. Se lo supera, la creatura può usare quella magia per sfuggire alla gabbia. Se lo fallisce, la creatura non può uscire dalla gabbia e spreca l’uso dell’incantesimo o dell’effetto. La gabbia si estende anche sul Piano Etereo, bloccando così il viaggio etereo. Questo incantesimo non può essere dissolto da dissolvi magie."
            )
        )



        result.add(
            Enchantment(
                "Giara Magica",
                "Magic Jar",
                6,
                "Necromanzia",
                "1 minuto",
                "Incantatore",
                "V, S, M (una gemma, cristallo, reliquario o qualche altro contenitore ornamentale del valore di almeno 500 mo)",
                "Fino a che dissolto",
                "Il tuo corpo entra in uno stato catatonico mentre la tua anima lo abbandona ed entra nel contenitore da te usato come componente materiale. Mentre la tua anima occupa il contenitore, sei consapevole dei tuoi dintorni come se fossi nello spazio del contenitore. Non puoi muoverti né usare reazioni. L’unica azione che puoi effettuare è quella di proiettare la tua anima fino a 30 metri di distanza, fuori dal contenitore, ritornando al tuo corpo vivente (e terminando l’incantesimo) o cercando di possedere un corpo umanoide. Puoi tentare di possedere qualsiasi umanoide entro 30 metri da te e che tu possa vedere (le creature protette dagli incantesimi protezione dal bene e dal male o cerchio magico non possono essere possedute). Il bersaglio deve effettuare un tiro salvezza su Carisma e, se lo fallisce, la tua anima entra nel corpo del bersaglio, mentre l’anima del bersaglio resta intrappolata nel contenitore. Se lo supera, il bersaglio resiste ai tuoi tentativi di possederlo, e non puoi tentare di possederlo nuovamente prima che siano trascorse 24 ore. Una volta che possiedi il corpo di una creatura, lo puoi controllare. Le tue statistiche di gioco sono rimpiazzate dalle statistiche della creatura, a eccezione del tuo allineamento e dei tuoi punteggi di Intelligenza, Saggezza e Carisma. Mantieni i benefici forniti dai tuoi privilegi di classe. Se il bersaglio possiede dei livelli di classe, non puoi usare nessuno dei suoi privilegi di classe."
            )
        )



        result.add(
            Enchantment(
                "Glifo di Interdizione",
                "Glyph of Warding",
                3,
                "Abiurazione",
                "1 azione",
                "Contatto",
                "V. S, M (incenso e diamante in polvere del valore di almeno 200 mo, che l’incantesimo consuma)",
                "Fino a che dissolto o attivato",
                "Quando lanci questo incantesimo, inscrivi un glifo che danneggia altre creature su di una superficie (come un tavolo o una sezione di pavimento o muro) o all’interno di un oggetto che può essere chiuso (come un libro, una pergamena o un forziere) per celare il glifo. Se scegli una superficie, il glifo può coprire un’area di superficie non maggiore di 3 metri di diametro. Se scegli un oggetto, quell’oggetto deve restare al suo posto; se l’oggetto viene spostato più di 3 metri dal punto in cui è stato lanciato l’incantesimo, il glifo è spezzato, e l’incantesimo termina senza essere statoattivato. Il glifo è quasi invisibile e può essere trovato con una prova di Intelligenza (Indagare) contro la CD del tiro salvezza dei tuoi incantesimi. Decidi tu cosa attivi il glifo al momento del lancio dell’incantesimo. Per i glifi inscritti su di una superficie, l’attivazione tipica comprende entrare in contatto o stare sopra il glifo, rimuovere un altro oggetto che copra il glifo, avvicinarsi a una certa distanza dal glifo, o manipolare l’oggetto su cui è inscritto il glifo. Per i glifi inscritti su di un oggetto, l’attivazione tipica comprende aprire l’oggetto, avvicinarsi a una certa distanza dall’oggetto, o vedere o leggere il glifo. Una volta che il glifo è stato attivato, l’incantesimo ha termine. Puoi definire meglio l’attivazione così che l’incantesimo si attivi solo in determinate circostanze o secondo certe peculiarità fisiche (come l’altezza o il peso), specie di creatura (per esempio, l’interdizione potrebbe agire contro le aberrazioni o gli elfi oscuri), o l’allineamento. Puoi anche predisporre condizioni per evitare che il glifo venga attivato, come la pronuncia di una parola d’ordine."
            )
        )



        result.add(
            Enchantment(
                "Globo di Invulnerabilità",
                "Globe of Invulnerability",
                6,
                "Abiurazione",
                "1 azione",
                "Incantatore (raggio di 3 metri)",
                "V. S, M (una pallina di vetro o di cristallo che si frantuma quando l’incantesimo termina)",
                "Concentrazione, massimo 1 minuto",
                "Una barriera immobile e lievemente scintillante si erge in un raggio di 3 metri intorno a te e vi rimane per la durata. Qualsiasi incantesimo di 5° livello o più basso lanciato dall’esterno della barriera non può agire sulle creature o gli oggetti al suo interno, anche se l’incantesimo viene lanciato usando uno slot incantesimo di livello più alto. Questi incantesimi possono prendere come bersaglio creature e oggetti all’interno della barriera, ma non avranno effetto su di essi. Allo stesso modo, l’area all’interno della barriera viene esclusa dalle aree di effetto di questi incantesimi."
            )
        )



        result.add(
            Enchantment(
                "Guardiani Spirituali",
                "Guardian Spirits",
                3,
                "Evocazione",
                "1 azione",
                "Incantatore (raggio di 4,5 metri)",
                "V, S, M (un simbolo sacro)",
                "Concentrazione, massimo 10 minuti",
                "Richiami degli spiriti che ti proteggano. Per la durata dell’incantesimo, essi fluttueranno intorno a te a una distanza di 4,5 metri. Se sei buono o neutrale, la forma spettrale sarà angelica o fatata (a tua scelta). Se sei malvagio, avranno un aspetto immondo."
            )
        )



        result.add(
            Enchantment(
                "Guardiano della Fede",
                "Guardian of Faith",
                4,
                "Evocazione",
                "1 azione",
                "9 metri",
                "V",
                "8 ore",
                "Un guardiano spettrale Grande compare per la durata e fluttua in uno spazio non occupato a gittata e che puoi vedere, scelto da te. Il guardiano occupa quello spazio ed è indistinguibile eccetto per una spada luminosa e uno scudo con il simbolo della tua divinità. Qualsiasi creatura a te ostile che entri in uno spazio entro 3 metri dal guardiano per la prima volta durante un turno, deve effettuare un tiro salvezza su Destrezza. La creatura subisce 20 danni radianti se fallisce il tiro salvezza, o la metà di questi danni se lo supera. Il guardiano svanisce dopo aver inflitto un totale di 60 danni."
            )
        )



        result.add(
            Enchantment(
                "Guarigione",
                "Heal",
                6,
                "Invocazione",
                "1 azione",
                "18 metri",
                "V, S",
                "Istantanea",
                "Scegli una creatura a gittata e che puoi vedere. Un’ondata di energia positiva travolge la creatura, facendole recuperare 70 punti ferita. L’incantesimo pone anche termine a qualsiasi cecità, sordità e malattia che affligga il bersaglio. Questo incantesimo non ha effetto su costrutti o non morti."
            )
        )



        result.add(
            Enchantment(
                "Guarigione di Massa",
                "Mass Heal",
                9,
                "Invocazione",
                "1 azione",
                "18 metri",
                "V, S",
                "Istantanea",
                "Un effluvio di energia guaritrice scorre da te verso le creature ferite che ti circondano. Ripristini fino a 700 punti ferita, divisi come preferisci tra qualsiasi creatura a gittata e che puoi vedere. Le creature guarite da questo incantesimo sono curate anche di tutte le malattie e da qualsiasi effetto che le renda accecate o assordate. Questo incantesimo non ha effetto su costrutti o non morti."
            )
        )



        result.add(
            Enchantment(
                "Guida",
                "Guidance",
                0,
                "Divinazione",
                "1 azione",
                "Contatto",
                "V, S",
                "Concentrazione, massimo 1 minuto",
                "Lanci l’incantesimo a contatto di una creatura consenziente. Una volta, prima che l’incantesimo termini, il bersaglio può tirare un d4 e sommare il risultato tirato a una prova di caratteristica a sua scelta. Può tirare il dado prima o dopo aver effettuato la prova di caratteristica. L’incantesimo ha poi termine."
            )
        )



        result.add(
            Enchantment(
                "Guscio Anti-Vita",
                "Antilife Shell",
                5,
                "Abiurazione",
                "1 azione",
                "Incantatore (raggio di 3 metri)",
                "V, S",
                "Concentrazione, massimo 1 ora",
                "Una barriera luminosa si estende fino a un raggio di 3 metri intorno a te, muovendosi con te e rimanendo centrata su di te, tenendo distanti le creature che non siano non morti o costrutti. La barriera permane per la durata. La barriera impedisce a una creatura soggetta di attraversarla in alcun modo. Una creatura soggetta può lanciare incantesimi o effettuare attacchi con armi a distanza o con portata attraverso la barriera. Se ti muovi in modo che una creatura soggetta venga forzata ad attraversare la barriera, l’incantesimo termina."
            )
        )



        result.add(
            Enchantment(
                "Identificare",
                "Identify",
                1,
                "Divinazione (rituale)",
                "1 minuto",
                "Contatto",
                "V, S, M (una perla del valore di almeno 100 mo e una piuma di gufo)",
                "Istantanea",
                "Scegli un oggetto con cui devi restare a contatto per tutto il lancio dell’incantesimo. Se si tratta di un oggetto magico o altro oggetto imbevuto di magia, ne apprendi le proprietà e come usarle, se richiede sintonia per l’uso, e quante cariche abbia, se ne ha. Apprendi se degli incantesimi stiano agendo sull’oggetto e cosa siano. Se l’oggetto è stato creato da un incantesimo, apprendi quale incantesimo lo abbia creato. Se invece durante l’esecuzione resti a contatto con una creatura, apprendi se degli incantesimi stiano agendo su di essa e quali siano."
            )
        )



        result.add(
            Enchantment(
                "Illusione Programmata",
                "Programmed Illusion",
                6,
                "Illusione",
                "1 azione",
                "36 metri",
                "V, S, M (un pezzo di vello e polvere di giada del valore di almeno 25 mo)",
                "Fino a che dissolto",
                "Crei, a gittata, l’illusione di un oggetto, creatura o qualche altro fenomeno visibile che si attiva quando viene soddisfatta una specifica condizione. Fino ad allora l’illusione è impercettibile. Non può essere più grande di un cubo di 9 metri di spigolo, e decidi tu quando lanci l’incantesimo, come si comporti l’illusione e che suoni produca. L’esibizione programmata può durare fino a 5 minuti. Quando occorrono le condizioni da te specificate, l’illusione si manifesta e si comporta nel modo da te descritto. Una volta che l’illusione ha terminato la sua esibizione, scompare e rimane dormiente per 10 minuti. Dopo questo periodo, l’illusione può essere attivata di nuovo. La condizione di attivazione può essere generica o dettagliata quanto vuoi, sebbene debba essere basata su condizioni visibili o udibili che avvengano entro 9 metri dall’area. Per esempio, potresti creare un’illusione di te stesso che appare e avverta chi tenti di aprire una porta munita di trappola, oppure potresti predisporre l’illusione perché si attivi solo quando una creatura pronunci la parola o la frase giusta. L’interazione fisica con l’immagine la rivela come illusione, dato che le cose le passano attraverso. Una creatura che usi la sua azione per esaminare l’immagine può determinare che è un’illusione con una prova riuscita di Intelligenza (Indagare) contro la CD del tiro salvezza dell’incantesimo. Se una creatura riconosce l’illusione per quello che è, essa può vedere attraverso l’immagine, e qualsiasi suono prodotto dall’immagine le suona artefatto."
            )
        )



        result.add(
            Enchantment(
                "Immagine Maggiore",
                "Major Image",
                3,
                "Illusione",
                "1 azione",
                "36 metri",
                "V, S, M (un pezzo di vello)",
                "Concentrazione, massimo 10 minuti",
                "Crei l’immagine di un oggetto, una creatura o qualche altro fenomeno visibile non più grande di un cubo di 6 metri di spigolo. L’immagine appare in un punto a gittata che puoi vedere e vi rimane per la durata dell’incantesimo. L’immagine sembra completamente reale, e comprende suoni, odori e la temperatura appropriata alla cosa raffigurata. Non puoi generare calore o freddo sufficiente a provocare danni, né un suono abbastanza forte da infliggere danno da tuono o assordare una creatura, o un odore che possa far star male una creatura (come il fetore di un troglodita). Finché resti a gittata dell’illusione, puoi usare un’azione per far muovere l’immagine in qualsiasi altro punto a gittata. Quando l’immagine cambia posizione, puoi alterarne l’aspetto così che i suoi movimenti appaiano naturali. Per esempio, se crei l’immagine di una creatura e la muovi, puoi alterare l’immagine in modo che sembri camminare. Allo stesso modo, puoi impiegare l’illusione per produrre suoni diversi in momenti diversi, fino a farle portare avanti una conversazione."
            )
        )



        result.add(
            Enchantment(
                "Immagine Silenziosa",
                "Silent Image",
                1,
                "Illusione",
                "1 azione",
                "36 metri",
                "V, S, M (un pezzo di vello)",
                "Concentrazione, massimo 10 minuti",
                "Crei l’immagine di un oggetto, una creatura o qualche altro fenomeno visibile non più grande di un cubo di 4,5 metri di spigolo. L’immagine appare in un punto a gittata che puoi vedere e resta per la durata dell’incantesimo. L’immagine è puramente visiva; non è accompagnata da suoni, odori o altri effetti sensoriali. Puoi usare un’azione per far muovere l’immagine in qualsiasi altro punto a gittata. Quando l’immagine cambia posizione, puoi alterarne l’aspetto così che i suoi movimenti appaiano naturali. Per esempio, se crei l’immagine di una creatura e la muovi, puoi alterare l’immagine in modo che sembri camminare. L’interazione fisica con l’immagine la rivela come illusione, dato che le cose vi passano attraverso. Una creatura che usa la sua azione per esaminare l’immagine può determinare che si tratta di un’illusione con una prova riuscita di Intelligenza (Indagare) contro la CD del tiro salvezza del tuo incantesimo. Se una creatura riconosce l’illusione per quello che è, la creatura può vedervi attraverso."
            )
        )



        result.add(
            Enchantment(
                "Immagine Speculare",
                "Mirror Image",
                2,
                "Illusione",
                "1 azione",
                "Incantatore",
                "V, S",
                "1 minuto",
                "Nel tuo spazio compaiono tre duplicati illusori di te stesso. Fino al termine dell’incantesimo, i duplicati si muovono con te e imitano le tue azioni, scambiandosi di posto in modo da rendere impossibile determinare quale sia l’immagine reale. Puoi usare la tua azione per congedare i duplicati illusori. Ogni volta che una creatura ti prenda come bersaglio di un attacco nella durata dell’incantesimo, tira un d20 per determinare se l’attacco colpisca invece uno dei tuoi duplicati. Se hai tre duplicati, devi tirare 6 o più per spostare l’attacco della creatura contro un duplicato. Con due duplicati, devi tirare 8 o più. Con un duplicato, devi tirare 11 o più. La CA del duplicato è pari a 10 + il tuo modificatore di Destrezza. Se un attacco colpisce un duplicato, questo è distrutto. Un duplicato può essere distrutto solo da un attacco che lo colpisce. Ignora invece tutti gli altri danni o effetti. L’incantesimo ha termine quando tutti e tre i duplicati sono stati distrutti. Una creatura che non può vedere, o si affida a sensi diversi dalla vista (come la vista cieca), o che può distinguere le illusioni come false (come la visione del vero), ignora gli effetti di questo incantesimo."
            )
        )



        result.add(
            Enchantment(
                "Imprigionare",
                "Imprisonment",
                9,
                "Abiurazione",
                "1 azione",
                "9 metri",
                "V, S, M (una raffigurazione su vello o una statuetta incisa con le fattezze del bersaglio, e una componente speciale che varia a seconda della versione che scegli dell’incantesimo, del valore di almeno 500 mo per Dado Vita del bersaglio)",
                "Fino a dissolvimento",
                "Crei dei vincoli magici per bloccare una creatura a gittata e che puoi vedere. Il bersaglio deve superare un tiro salvezza su Saggezza o essere avvinto dall’incantesimo; se lo supera, è immune all’incantesimo qualora lo lanci di nuovo. Mentre è soggetta a questo incantesimo, la creatura non ha bisogno di respirare, mangiare o bere e non invecchia. Gli incantesimi di divinazione non possono localizzare né percepire il bersaglio. Quando lanci questo incantesimo, scegli una delle seguenti forme di prigionia."
            )
        )



        result.add(
            Enchantment(
                "Inaridire",
                "Blight",
                4,
                "Necromanzia",
                "1 azione",
                "9 metri",
                "V, S",
                "Istantanea",
                "Energia necromantica avvolge una creatura di tua scelta a gittata e che puoi vedere, deprivandola di linfa e vitalità. Il bersaglio deve effettuare un tiro salvezza su Costituzione. Se fallisce il tiro salvezza, il bersaglio subisce 8d8 danni necrotici, o la metà di questi danni se supera il tiro salvezza. L’incantesimo non ha effetto su non morti o costrutti. Se il bersaglio è un vegetale non magico che non sia anche una creatura, come un albero o un cespuglio, non effettua alcun tiro salvezza, avvizzisce e muore all’istante."
            )
        )



        result.add(
            Enchantment(
                "Individuazione dei Pensieri",
                "Detect Thoughts",
                2,
                "Divinazione",
                "1 azione",
                "Incantatore",
                "V, S, M (un pezzo di rame)",
                "Concentrazione, massimo 1 minuto",
                "Per la durata, puoi leggere i pensieri di certe creature. Quando lanci questo incantesimo e come tua azione in ciascun turno successivo sino al termine dell’incantesimo, puoi concentrare la tua mente su qualsiasi creatura che tu possa vedere e si trovi entro 9 metri da te. Se la creatura che hai scelto ha un punteggio di Intelligenza 3 o meno o non parla nessun linguaggio, la creatura ignora l’effetto. Inizialmente, apprendi solo i pensieri di superficie della creatura: quelli più ricorrenti. Con un’azione, puoi o spostare la tua attenzione sui pensieri di un’altra creatura o tentare di sondare più a fondo la mente della stessa creatura. Se sondi più a fondo, il bersaglio deve effettuare un tiro salvezza su Saggezza. Se lo fallisce, ottieni una percezione dei suoi ragionamenti (se ve ne sono), del suo stato emotivo, e di ogni cosa abbia prevalenza nei suoi pensieri (come una preoccupazione, l’amore, o l’odio). Se supera il tiro salvezza, l’incantesimo termina. A ogni modo, il bersaglio sa che stai sondando la sua mente e, a meno che non sposti la tua attenzione verso la mente di un’altra creatura, nel suo turno la creatura può usare la propria azione per effettuare una prova di Intelligenza contesa dalla tua prova di Intelligenza; se la vince, l’incantesimo termina. Le domande poste verbalmente alla creatura bersaglio, ovviamente, modellano il corso dei suoi pensieri, cosicché questo incantesimo risulta particolarmente efficace negli interrogatori. Puoi anche usare questo incantesimo per individuare la presenza di creature pensanti che non puoi vedere. Quando lanci questo incantesimo o come tua azione nella sua durata, puoi cercare pensieri entro 9 metri da te. L’incantesimo può penetrare le barriere, ma è bloccato da 60 centimetri di pietra, 5 centimetri di metallo che non sia il piombo, o un sottile foglio di piombo. Non puoi individuare una creatura con Intelligenza 3 o meno, o una creatura che non parla alcun linguaggio. Una volta individuata in questo modo la presenza di una creatura, puoi leggerne i pensieri per la durata dell’incantesimo finché resta nella gittata, come descritto sopra, anche se non puoi vederla."
            )
        )



        result.add(
            Enchantment(
                "Individuazione del Bene e del Male",
                "Detect Evil and Good",
                1,
                "Divinazione",
                "1 azione",
                "Incantatore",
                "V, S",
                "Concentrazione, massimo 10 minuti",
                "Per la durata, apprendi se entro 9 metri da te si trova un’aberrazione, celestiale, elementale, fatato, immondo o non morto, e la sua posizione. Allo stesso modo, apprendi se entro 9 metri da te si trovi un luogo o oggetto che sia stato consacrato o dissacrato magicamente. L’incantesimo può penetrare la maggior parte delle barriere, ma è bloccato da 30 centimetri di pietra, 2,5 centimetri di metallo comune, un sottile foglio di piombo o 1 metro di legno o terra."
            )
        )



        result.add(
            Enchantment(
                "Individuazione del Magico",
                "Detect Magic",
                1,
                "Divinazione (rituale)",
                "1 azione",
                "Incantatore",
                "V, S",
                "Concentrazione, massimo 10 minuti",
                "Per la durata, percepisci la presenza della magia entro 9 metri da te. Se percepisci la magia in questo modo, puoi usare la tua azione per vedere una flebile aura che si estende intorno a qualsiasi creatura o oggetto visibile nell’area che rechi magia, e ne apprendi anche la scuola di magia, se ce l’ha. L’incantesimo può penetrare la maggior parte delle barriere, ma è bloccato da 30 centimetri di pietra, 2,5 centimetri di metallo comune, un sottile foglio di piombo o 1 metro di legno o terra."
            )
        )



        result.add(
            Enchantment(
                "Individuazione delle Malattie e dei Veleni",
                "Detect Poison and Disease",
                1,
                "Divinazione (rituale)",
                "1 azione",
                "Incantatore",
                "V, S, M (una foglia di tasso)",
                "Concentrazione, massimo 10 minuti",
                "Per la durata, percepisci la presenza e posizione di veleni, creature velenose e malattie entro 9 metri da te. Inoltre riesci a identificare il tipo di veleno, creatura velenosa o malattia. L’incantesimo può penetrare la maggior parte delle barriere, ma è bloccato da 30 centimetri di pietra, 2,5 centimetri di metallo comune, un sottile foglio di piombo o 1 metro di legno o terra."
            )
        )



        result.add(
            Enchantment(
                "Infliggi Ferite",
                "Inflict Wounds",
                1,
                "Necromanzia",
                "1 azione",
                "Contatto",
                "V, S",
                "Istantanea",
                "Effettua un attacco in mischia con incantesimo contro una creatura a portata. Se colpisci, il bersaglio subisce 3d10 danni necrotici."
            )
        )



        result.add(
            Enchantment(
                "Ingrandire/Ridurre",
                "Enlarge/Reduce",
                2,
                "Trasmutazione",
                "1 azione",
                "9 metri",
                "V, S, M (un pizzico di ferro in polvere)",
                "Concentrazione, massimo 1 minuto",
                "Fai sì che una creatura od oggetto a gittata e che puoi vedere ingrandisca o rimpicciolisca per la durata dell’incantesimo. Scegli una creatura o un oggetto che non sia né indossato né trasportato. Se il bersaglio non è consenziente, può effettuare un tiro salvezza su Costituzione. Se lo supera, l’incantesimo non ha effetto. Se il bersaglio è una creatura, tutto ciò che sta indossando e trasportando cambia taglia assieme a essa. Qualsiasi oggetto lasciato cadere da una creatura soggetta a questo incantesimo ritorna subito alla sua taglia normale."
            )
        )



        result.add(
            Enchantment(
                "Insetto Gigante",
                "Giant Insect",
                4,
                "Trasmutazione",
                "1 azione",
                "9 metri",
                "V, S",
                "Concentrazione, massimo 10 minuti",
                "Per la durata dell’incantesimo, trasformi fino a dieci centopiedi, tre ragni, cinque vespe o uno scorpione a gittata, in versioni giganti della loro forma naturale. Un centopiedi diventa un centopiedi gigante, un ragno diventa un ragno gigante, una vespa diventa una vespa gigante e uno scorpione diventa uno scorpione gigante. Ogni creatura obbedisce ai tuoi comandi vocali e, in combattimento, agisce in ciascun round durante il tuo turno. Il GM possiede le statistiche di queste creature, e sarà sempre Il GM a risolvere le loro azioni e i loro movimenti. Una creatura resta nella sua forma gigante per la durata, finché non scende a 0 punti ferita, o finché non usi un’azione per interrompere l’effetto su di essa. Il GM può permetterti di scegliere bersagli differenti. Per esempio, se trasformi un’ape, la sua versione gigante potrebbe avere le stesse statistiche della vespa gigante."
            )
        )



        result.add(
            Enchantment(
                "Interdizione alla Morte",
                "Death Ward",
                4,
                "Abiurazione",
                "1 azione",
                "Contatto",
                "V, S",
                "8 ore",
                "Lanci l’incantesimo a contatto con una creatura. Conferisci al bersaglio protezione dalla morte. La prima volta che il bersaglio dovesse scendere a 0 punti ferita in seguito al danno subito, il bersaglio scende invece a 1 punto ferita e l’incantesimo ha fine. Se l’incantesimo è ancora attivo quando il bersaglio è vittima di un effetto che lo ucciderebbe all’istante senza infliggere danni, quell’effetto viene invece negato sul bersaglio e l’incantesimo ha fine."
            )
        )



        result.add(
            Enchantment(
                "Intermittenza",
                "Blink",
                3,
                "Trasmutazione",
                "1 azione",
                "Incantatore",
                "V, S",
                "1 minuto",
                "Tira un d20 alla fine di ciascun tuo turno per la durata di questo incantesimo. Se ottieni 11 o più, svanisci dal tuo attuale piano di esistenza e riappari sul Piano Etereo (l’incantesimo fallisce e il lancio è sprecato qualora tu fossi già su quel piano). All’inizio del tuo prossimo turno, e quando l’incantesimo termina, qualora tu fossi sul Piano Etereo, ritorni in uno spazio non occupato di tua scelta e che puoi vedere, entro 3 metri dallo spazio da cui sei svanito. Se nessuno spazio non occupato è disponibile entro questa gittata, compari nello spazio non occupato più vicino (determinato casualmente se è disponibile più di uno spazio). Puoi interrompere l’incantesimo con un’azione. Mentre sei sul Piano Etereo, puoi vedere e udire il piano da cui provieni, che percepisci in sfumature di grigio, ma non puoi comunque percepire nulla che si trovi a più di 18 metri di distanza. Puoi interagire solo con creature che si trovano sul Piano Etereo. Le creature che non si trovano lì non possono né percepirti né interagire con te, a meno che non siano provviste della capacità di farlo."
            )
        )



        result.add(
            Enchantment(
                "Intimorire Infernale",
                "Hellish Rebuke",
                1,
                "Invocazione",
                "1 reazione, che puoi effettuare in risposta al danno arrecatoti da una creatura entro 18 metri da te che puoi vedere",
                "18 metri",
                "V, S",
                "Istantanea",
                "Punti il dito, e la creatura che ti ha danneggiato viene momentaneamente avvolta da fiamme diaboliche. La creatura deve effettuare un tiro salvezza su Destrezza. Subisce 2d10 danni da fuoco se fallisce il tiro salvezza, o la metà di questi danni se lo supera."
            )
        )



        result.add(
            Enchantment(
                "Intralciare",
                "Entangle",
                1,
                "Evocazione",
                "1 azione",
                "27 metri",
                "V, S",
                "Concentrazione, massimo 1 minuto",
                "Rampicanti e rami stritolanti spuntano dal terreno in un quadrato di 6 metri di lato a partire da un punto a gittata. Per la durata, questi vegetali trasformano il terreno nell’area in terreno difficile. Una creatura nell’area nel momento in cui lanci questo incantesimo deve superare un tiro salvezza su Forza o restare intralciata da questi vegetali fino al termine dell’incantesimo. Una creatura intralciata dai vegetali può usare le sue azioni per effettuare una prova di Forza contro la CD del tiro salvezza dell’incantesimo. Se la supera, si libera. Quando l’incantesimo ha termine, i vegetali evocati svaniscono."
            )
        )



        result.add(
            Enchantment(
                "Inversione della Gravità",
                "Reverse Gravity",
                7,
                "Trasmutazione",
                "1 azione",
                "30 metri",
                "V, S, M (una calamita e un fil di ferro)",
                "Concentrazione, massimo 1 minuto",
                "Questo incantesimo inverte la gravità in un cilindro di raggio 15 metri, alto 30 metri, centrato in un punto a gittata. Quando lanci questo incantesimo, tutte le creature e gli oggetti che non sono in qualche modo ancorati al terreno cadono verso l’alto e raggiungono la cima dell’area. Una creatura può tentare un tiro salvezza su Destrezza per afferrare un oggetto fisso a portata, per evitare di cadere in questo modo, in caso lo superi."
            )
        )



        result.add(
            Enchantment(
                "Inviare",
                "Sending",
                3,
                "Invocazione",
                "1 azione",
                "Illimitata",
                "V, S, M (un piccolo pezzo di cavo di rame)",
                "1 round",
                "Invii un breve messaggio di 25 parole o meno a una creatura con cui sei familiare. La creatura sente il messaggio nella sua mente, ti riconosce come mittente, e può risponderti in modo simile. L’incantesimo permette a creature con un punteggio di Intelligenza almeno di 1 di comprendere il significato del tuo messaggio. Puoi inviare il messaggio attraverso qualsiasi distanza e anche su altri piani di esistenza, ma se il bersaglio è su di un piano diverso dal tuo, c’è una probabilità del 5% che il messaggio non arrivi."
            )
        )



        result.add(
            Enchantment(
                "Invisibilità",
                "Invisibility",
                2,
                "Illusione",
                "1 azione",
                "Contatto",
                "V, S, M (un ciglio avvolto nella gomma arabica)",
                "Concentrazione, massimo 1 ora",
                "Lanci l’incantesimo a contatto di una creatura. Il bersaglio diventa invisibile fino alla fine dell’incantesimo. Qualsiasi cosa il bersaglio stia indossando o trasportando diventa invisibile finché resta sul bersaglio. L’incantesimo ha fine per il bersaglio che attacca o esegue un incantesimo."
            )
        )



        result.add(
            Enchantment(
                "Invisibilità Superiore",
                "Greater Invisibility",
                4,
                "Illusione",
                "1 azione",
                "Contatto",
                "V, S",
                "Concentrazione, massimo 1 minuto",
                "Lanci l’incantesimo a contatto di una creatura. Il bersaglio diventa invisibile fino alla fine dell’incantesimo. Qualsiasi cosa indossata o trasportata dal bersaglio diventa invisibile finché resta addosso al bersaglio."
            )
        )



        result.add(
            Enchantment(
                "Invocare il Fulmine",
                "Call Lightning",
                3,
                "Evocazione",
                "1 azione",
                "36 metri",
                "V, S",
                "Concentrazione, massimo 10 minuti",
                "Una nube di tempesta compare nella forma di un cilindro alto 3 metri con un raggio di 18 metri, centrato su di un punto che puoi vedere, 30 metri sopra di te. L’incantesimo fallisce automaticamente se non puoi vedere il punto nell’aria dove apparirà la nube di tempesta (per esempio, se sei in una stanza che non può accogliere la nube). Quando lanci l’incantesimo, scegli un punto che puoi vedere entro la gittata. Un fulmine si abbatterà dalla nuvola su quel punto. Ogni creatura entro 1,5 metri da quel punto deve effettuare un tiro salvezza su Destrezza. Una creatura subisce 3d10 danni da fulmine se fallisce il tiro salvezza, o la metà di questi danni se lo supera. Durante ciascun tuo turno fino al termine dell’incantesimo, puoi usare la tua azione per richiamare un altro fulmine in questo modo, prendendo come bersaglio lo stesso punto o uno diverso. Se quando lanci questo incantesimo ti trovi all’esterno in condizioni di tempesta, l’incantesimo ti fornisce il controllo della tempesta esistente invece di crearne una nuova. Sotto queste condizioni, il danno dell’incantesimo aumenta di 1d10."
            )
        )



        result.add(
            Enchantment(
                "Labirinto",
                "Maze",
                8,
                "Evocazione",
                "1 azione",
                "18 metri",
                "V, S",
                "Concentrazione, massimo 10 minuti",
                "Bandisci una creatura a gittata e che puoi vedere in un semipiano labirintico. Il bersaglio rimane lì per la durata dell’incantesimo o finché non fugge dal labirinto. Il bersaglio può impiegare la sua azione per tentare di fuggire. Quando lo fa, effettua una prova di Intelligenza CD 20. Se la supera, fugge, e l’incantesimo termina (un minotauro o un demone goristro riescono automaticamente). Quando l’incantesimo termina, il bersaglio riappare nello spazio che aveva lasciato o, se quello spazio è occupato, nel più vicino spazio non occupato."
            )
        )



        result.add(
            Enchantment(
                "Lama Infuocata",
                "Flame Blade",
                2,
                "Invocazione",
                "1 azione bonus",
                "Incantatore",
                "V, S, M (una foglia di sommacco)",
                "Concentrazione, massimo 10 minuti",
                "Crei nella tua mano una lama infuocata. La lama è simile in dimensioni e forma a una scimitarra, e rimane per la durata. Se lasci andare la lama, questa sparisce, ma ne puoi creare un’altra con un’azione bonus."
            )
        )



        result.add(
            Enchantment(
                "Legame Planare",
                "Planar Binding",
                5,
                "Abiurazione",
                "1 ora",
                "18 metri",
                "V, S, M (un gioiello del valore di almeno 1.000 mo, che l’incantesimo consuma)",
                "24 ore",
                "Con questo incantesimo, cerchi di vincolare un celestiale, elementale, fatato o immondo al tuo servizio. La creatura deve restare nella gittata per l’intero lancio dell’incantesimo. (Di solito, la creatura viene prima evocata al centro di un cerchio magico invertito per tenerla intrappolata mentre questo incantesimo viene lanciato). Al completamento del lancio, il bersaglio deve effettuare un tiro salvezza su Carisma. Se fallisce il tiro salvezza, è vincolato al tuo servizio per la durata. Se la creatura è stata evocata o creata da un altro incantesimo, la durata di quell’incantesimo viene estesaper corrispondere alla durata di questo incantesimo. Una creatura vincolata deve eseguire le tue istruzioni al meglio delle sue capacità. Potresti comandare la creatura di accompagnarti nel corso di un’avventura, di proteggere un luogo o di consegnare un messaggio. La creatura obbedisce le tue istruzioni alla lettera, ma se ti è ostile, cercherà di distorcere le tue parole ai suoi fini. Se la creatura adempie completamente alle tue istruzioni prima del termine dell’incantesimo, qualora vi troviate sullo stesso piano di esistenza ritornerà da te per comunicarti l’avvenuto. Se vi trovate su piani di esistenza diversi, ritornerà nel luogo dove l’hai vincolata e rimarrà lì fino al termine dell’incantesimo."
            )
        )



        result.add(
            Enchantment(
                "Legame Telepatico",
                "Telepathic Bond",
                5,
                "Divinazione (rituale)",
                "1 azione",
                "9 metri",
                "V, S, M (pezzi di gusci d’uovo da due differenti specie di creature)",
                "1 ora",
                "Stabilisci un collegamento telepatico tra un massimo di otto creature consenzienti a gittata di tua scelta, collegando psichicamente ciascuna creatura alle altre per la durata dell’incantesimo. Le creature con punteggio di Intelligenza 2 o meno ignorano questo incantesimo. Fino al termine dell’incantesimo, i bersagli possono comunicare telepaticamente tramite questo legame, che condividano o meno un linguaggio comune. La comunicazione è possibile a qualsiasi distanza, ma non può estendersi su differenti piani di esistenza."
            )
        )



        result.add(
            Enchantment(
                "Lentezza",
                "Slow",
                3,
                "Trasmutazione",
                "1 azione",
                "36 metri",
                "V, S, M (una goccia di melassa)",
                "Concentrazione, massimo 1 minuto",
                "Modifichi lo scorrere del tempo intorno a un massimo di sei creature di tua scelta in un cubo di 12 metri di spigolo a gittata. Ciascun bersaglio deve superare un tiro salvezza su Saggezza o subire gli effetti dell’incantesimo per la sua durata. La velocità di un bersaglio soggetto all’incantesimo è dimezzata, questi subisce una penalità di -2 alla CA e ai tiri salvezza su Destrezza, e non può usare reazioni. Durante il suo turno, può usare un’azione o un’azione bonus, ma non entrambe. Quali che siano le capacità o gli oggetti magici della creatura, durante il suo turno questa non può effettuare più di un attacco in mischia o a distanza. Se la creatura tenta di lanciare un incantesimo con tempo di lancio 1 azione, tira un d20. Con 11 o più, l’incantesimo non avrà effetto fino al prossimo turno della creatura, e la creatura dovrà usare la sua azione in quel turno per completare l’incantesimo. Se non potrà farlo, l’incantesimo viene sprecato. Una creatura sotto l’effetto di questo incantesimo effettua un altro tiro salvezza su Saggezza al termine del suo turno. Se supera questo tiro salvezza, l’effetto ha termine."
            )
        )



        result.add(
            Enchantment(
                "Levitazione",
                "Levitation",
                2,
                "Trasmutazione",
                "1 azione",
                "18 metri",
                "V, S, M (o un piccolo laccio di cuoio oppure un pezzo di cavo d’oro piegato a forma di tazza con un lungo stelo alla fine)",
                "Concentrazione, massimo 10 minuti",
                "Una creatura o oggetto a gittata che puoi vedere, scelto da te, si alza verticalmente fino a 6 metri e rimane sospeso per la durata dell’incantesimo. L’incantesimo può levitare un bersaglio pesante fino a 250 chili. Una creatura non consenziente che superi un tiro salvezza su Costituzione ignora l’effetto. Il bersaglio può muoversi solo spingendo o tirando verso un oggetto fisso o superficie a portata (per esempio un muro o un soffitto). Durante il tuo turno puoi cambiare l’altitudine del bersaglio fino a 6 metri in entrambe le direzioni. Se sei tu il bersaglio, ti puoi muovere verso l’alto o il basso come parte del tuo movimento. Altrimenti puoi usare la tua azione per muovere il bersaglio, che deve rimanere nella gittata dell’incantesimo. Quando l’incantesimo termina, qualora sia ancora in aria, il bersaglio fluttua dolcemente a terra."
            )
        )



        result.add(
            Enchantment(
                "Libertà di Movimento",
                "Freedom of Movement",
                4,
                "Abiurazione",
                "1 azione",
                "Contatto",
                "V, S, M (una striscia di cuoio, avvolta intorno a un braccio o simile appendice)",
                "1 ora",
                "Lanci l’incantesimo a contatto di una creatura consenziente. Per la sua durata, il movimento del bersaglio ignora il terreno difficile, mentre gli incantesimi o altri effetti magici non possono ridurre la sua velocità né far sì che il bersaglio sia paralizzato o intralciato. Il bersaglio può spendere 1,5 metri di movimento per liberarsi automaticamente da qualsiasi restrizione non magica, come manette o una creatura da cui è afferrato. Infine, trovarsi sott’acqua non comporta penalità al movimento o gli attacchi del bersaglio."
            )
        )



        result.add(
            Enchantment(
                "Lingue",
                "Tongues",
                3,
                "Divinazione",
                "1 azione",
                "Contatto",
                "V, M (un piccolo modello di argilla di uno ziggurat)",
                "1 ora",
                "Questo incantesimo conferisce alla creatura con cui sei stato in contatto al momento del lancio dell’incantesimo la capacità di comprendere qualsiasi linguaggio parlata che ode. Inoltre, quando il bersaglio parla, qualsiasi creatura che conosca almeno un linguaggio e può udire il bersaglio, comprende ciò che dice."
            )
        )



        result.add(
            Enchantment(
                "Localizza Animali o Vegetali",
                "Locate Animals or Plants",
                2,
                "Divinazione (rituale)",
                "1 azione",
                "Incantatore",
                "V, S, M (un pezzo di pelo di un segugio)",
                "Istantanea",
                "Descrivi o nomina uno specifico tipo di bestia o vegetale. Concentrandoti sulla voce della natura nei tuoi dintorni, apprendi la direzione e la distanza dalla più vicina creatura o vegetale di quella specie, se ce ne sono entro 7,5 chilometri."
            )
        )



        result.add(
            Enchantment(
                "Localizza Creatura",
                "Locate Creature",
                4,
                "Divinazione",
                "1 azione",
                "Incantatore",
                "V, S, M (un pezzo di pelliccia di segugio)",
                "Concentrazione, massimo 1 ora",
                "Descrivi o nomina una creatura che ti è familiare. Percepisci la direzione della posizione della creatura, purché quella creatura si trovi entro 300 metri da te. Se la creatura si muove, conosci anche la direzione del suo movimento."
            )
        )



        result.add(
            Enchantment(
                "Localizza Oggetto",
                "Locate Object",
                2,
                "Divinazione",
                "1 azione",
                "Incantatore",
                "V, S, M (un ramoscello biforcuto)",
                "Concentrazione, massimo 10 minuti",
                "Descrivi o nomina un oggetto che ti è familiare. Percepisci la direzione della posizione dell’oggetto, purché quell’oggetto si trovi entro 300 metri da te. Se l’oggetto si muove, conosci anche la direzione del suo movimento."
            )
        )



        result.add(
            Enchantment(
                "Loquacità",
                "Glibness",
                8,
                "Trasmutazione",
                "1 azione",
                "Incantatore",
                "V",
                "1 ora",
                "Fino al termine dell’incantesimo, quando effettui una prova di Carisma puoi rimpiazzare il numero tirato con 15. Inoltre, non importa quello che dici, la magia che determina se stai dicendo la verità indicherà sempre che sei onesto."
            )
        )



        result.add(
            Enchantment(
                "Luce",
                "Light",
                0,
                "Invocazione",
                "1 azione",
                "Contatto",
                "V, M (una lucciola o del muschio fosforescente)",
                "1 ora",
                "Lanci l’incantesimo a contatto di un oggetto che non sia più grosso di 3 metri in qualsiasi direzione. Fino al termine dell’incantesimo, l’oggetto irradia una luce intensa in un raggio di 6 metri e una luce fioca per ulteriori 6 metri. La luce può essere di qualsiasi colore tu voglia. Coprire completamente un oggetto con qualcosa di opaco blocca la luce. L’incantesimo termina se lo lanci di nuovo o lo interrompi con un’azione. Se un oggetto bersaglio è tenuto o indossato da una creatura ostile, quella creatura deve superare un tiro salvezza su Destrezza per evitare l’incantesimo."
            )
        )



        result.add(
            Enchantment(
                "Luce Diurna",
                "Daylight",
                3,
                "Invocazione",
                "1 azione",
                "18 metri",
                "V, S",
                "1 ora",
                "Una sfera di luce con raggio 18 metri si espande da un punto a tua scelta entro la gittata. La sfera irradia luce intensa e luce fioca per ulteriori 18 metri. Se scegli un punto su di un oggetto che stai reggendo o che non è indossato o trasportato, la luce si irradia dall’oggetto e si muove con esso. Coprire completamente un oggetto con qualcosa di opaco, come un vaso o un elmo, blocca la luce. Se qualsiasi parte dell’area di questo incantesimo si sovrappone con l’area di oscurità creata da un incantesimo di 3° livello o più basso, l’incantesimo che ha creato l’oscurità viene dissolto."
            )
        )



        result.add(
            Enchantment(
                "Luci Danzanti",
                "Dancing Lights",
                0,
                "Invocazione",
                "1 azione",
                "36 metri",
                "V, S, M (un pezzo di fosforo o legno stregato, o un lombrico)",
                "Concentrazione, massimo 1 minuto",
                "Crei, a gittata, fino a quattro luci delle dimensioni di una torcia, facendole apparire come torce, lanterne o sfere luminose che fluttuano nell’aria per la durata dell’incantesimo. Puoi anche combinare le quattro luci in un’unica forma luminosa vagamente umanoide di taglia Media. Qualsiasi forma scegli, ciascuna luce emette una luce fioca in un raggio di 3 metri. Come azione bonus durante il tuo turno, puoi spostare le luci fino a 18 metri in un nuovo punto a gittata. Una luce deve trovarsi entro 6 metri da un’altra luce creata con questo incantesimo, e le luci svaniscono se eccedono la gittata dell’incantesimo."
            )
        )



        result.add(
            Enchantment(
                "Luminescenza",
                "Faerie Fire",
                1,
                "Invocazione",
                "1 azione",
                "18 metri",
                "V",
                "Concentrazione, massimo 1 minuto",
                "Tutti gli oggetti in un cubo di 6 metri di spigolo a gittata vengono circondati da una luce blu, verde o viola (a tua scelta). Qualsiasi creatura nell’area quando l’incantesimo viene lanciato, viene anch’essa circondata dalla luce se fallisce un tiro salvezza su Destrezza. Per la durata dell’incantesimo, gli oggetti e le creature soggette emettono una luce fioca con raggio di 3 metri. Qualsiasi tiro per colpire contro una creatura od oggetto soggetto ha vantaggio se l’attaccante può vederlo, e la creatura od oggetto non può beneficiare dell’invisibilità."
            )
        )



        result.add(
            Enchantment(
                "Mani Brucianti",
                "Burning Hands",
                1,
                "Invocazione",
                "1 azione",
                "Incantatore (cono di 4,5 metri)",
                "V, S",
                "Istantanea",
                "Mentre tieni le mani con i pollici che si toccano e le dita tese, un sottile fiotto di fiamme parte da ciascuna delle punta delle tue dita. Ogni creatura in un cono di 4,5 metri deve effettuare un tiro salvezza su Destrezza. Una creatura subisce 3d6 danni da fuoco se fallisce il tiro salvezza, o la metà se lo supera. Il fuoco incendia gli oggetti infiammabili nell’area che non siano indossati o trasportati."
            )
        )



        result.add(
            Enchantment(
                "Mano Arcana",
                "Arcane Hand",
                5,
                "Invocazione",
                "1 azione",
                "36 metri",
                "V, S, M (un guscio d’uovo e un guanto di pelle di serpente)",
                "Concentrazione, massimo 1 minuto",
                "Crei una mano Grande, composta di energia trasparente e luminosa, in uno spazio non occupato a gittata e che puoi vedere. La mano permane per la durata dell’incantesimo, e si muove al tuo comando, imitando i movimenti della tua mano. La mano è un oggetto che ha CA 20 e punti ferita uguali ai tuoi punti ferita massimi. Ha Forza 26 (+8) e Destrezza 10 (+0). La mano non riempie il suo spazio. Quando lanci l’incantesimo e come azione bonus durante i tuoi turni successivi, puoi muovere la mano fino a 18 metri e poi generare uno dei seguenti effetti."
            )
        )



        result.add(
            Enchantment(
                "Mano Magica",
                "Mage Hand",
                0,
                "Evocazione",
                "1 azione",
                "9 metri",
                "V, S",
                "1 minuto",
                "Una mano spettrale fluttuante compare in un punto a gittata, scelto da te. La mano resta per la durata dell’incantesimo o finché non viene interrotta con un’azione. La mano svanisce se si dovesse trovare a più di 9 metri da te o se lanci nuovamente l’incantesimo. Puoi usare la tua azione per controllare la mano. Puoi usare la mano per manipolare un oggetto, aprire una porta o un contenitore non chiusi a chiave, inserire o recuperare un oggetto da un contenitore aperto, o versare fuori i contenuti di una fiala. Puoi muovere la mano di 9 metri ogni volta che la usi. La mano non può attaccare, attivare oggetti magici o trasportare più di 5 chili."
            )
        )



        result.add(
            Enchantment(
                "Marchio del Cacciatore",
                "Hunter’s Mark",
                1,
                "Divinazione",
                "1 azione bonus",
                "27 metri",
                "V",
                "Concentrazione, massimo 1 ora",
                "Scegli una creatura a gittata che puoi vedere. La creatura è misticamente marchiata come tua preda. Fino al termine dell’incantesimo, infliggi 1d6 danni aggiuntivi al bersaglio ogni volta che lo colpisci con un attacco con arma, e hai vantaggio alle prove di Saggezza (Percezione) o Saggezza (Sopravvivenza) per trovarlo. Se il bersaglio scende a 0 punti ferita prima del termine dell’incantesimo, puoi usare un’azione bonus durante il tuo prossimo turno per marchiare una nuova creatura."
            )
        )



        result.add(
            Enchantment(
                "Messaggio",
                "Message",
                0,
                "Trasmutazione",
                "1 azione",
                "36 metri",
                "V, S, M (un piccolo pezzo di cavo di rame)",
                "1 round",
                "Punti il dito verso una creatura a gittata e sussurri un messaggio. Il bersaglio (e solo il bersaglio) ode il messaggio e può replicare con un sussurro che solo tu puoi udire. Puoi lanciare questo incantesimo anche attraverso oggetti solidi, se sei familiare col bersaglio e sai che questi si trova dietro la barriera. Il silenzio magico, 30 centimetri di pietra, 2,5 centimetri di metallo normale, un sottile foglio di piombo o 1 metro di legno bloccano l’incantesimo. L’incantesimo non deve seguire una linea retta, e può liberamente aggirare gli angoli o attraversare gli spiragli."
            )
        )



        result.add(
            Enchantment(
                "Metamorfosi",
                "Polymorph",
                4,
                "Trasmutazione",
                "1 azione",
                "18 metri",
                "V, S, M (un bozzolo di bruco)",
                "Concentrazione, massimo 1 ora",
                "Questo incantesimo trasforma una creatura a gittata, che puoi vedere, in una nuova forma. Una creatura non consenziente deve superare un tiro salvezza su Saggezza per evitare l’effetto. I mutaforma superano automaticamente il tiro salvezza. L’incantesimo non ha effetto su di un bersaglio con 0 punti ferita. La trasformazione permane per la durata dell’incantesimo o finché il bersaglio non scende a 0 punti ferita o muore. La nuova forma può essere quella di qualsiasi bestia il cui grado di sfida sia uguale o più basso di quello del bersaglio (o del livello del bersaglio, se questi non ha un grado di sfida). Le statistiche di gioco del bersaglio, compresi i punteggi delle caratteristiche mentali, vengono rimpiazzate dalle statistiche della bestia scelta. Egli mantiene però il suo allineamento e personalità. Il bersaglio assume i punti ferita della sua nuova forma. Quando ritorna alla sua forma normale, la creatura ritorna al numero di punti ferita che aveva prima di trasformarsi. Se però si ritrasforma perché ridotto a 0 punti ferita, qualsiasi danno in eccesso si ripercuote sulla sua normale forma. Purché il danno in eccesso non riduca la forma normale della creatura a 0 punti ferita, ella non cade priva di sensi."
            )
        )



        result.add(
            Enchantment(
                "Metamorfosi Pura",
                "True Polymorph",
                9,
                "Trasmutazione",
                "1 azione",
                "9 metri",
                "V, S, M (un goccio di mercurio, un mucchietto di gomma arabica, e uno sbuffo di fumo)",
                "Concentrazione, massimo 1 ora",
                "Scegli una creatura od oggetto non magico a gittata e che puoi vedere. L’incantesimo non ha effetto su di un bersaglio con 0 punti ferita. Trasformi la creatura in una creatura diversa, la creatura in un oggetto, o l’oggetto in una creatura (l’oggetto non deve essere indossato né trasportato da un’altra creatura). La trasformazione permane per la durata dell’incantesimo o finché il bersaglio non scende a 0 punti ferita o muore. Se ticoncentri su questo incantesimo per l’intera durata, la trasformazione diventa permanente."
            )
        )



        result.add(
            Enchantment(
                "Miraggio Arcano",
                "Mirage Arcana",
                7,
                "Illusione",
                "10 minuti",
                "Vista",
                "V, S",
                "10 giorni",
                "Fai sì che un pezzo di terreno a gittata, in un’area quadrata fino a 1,5 chilometri, appaia, risuoni e odori come qualche altro tipo di terreno. La conformazione generale del terreno rimane tuttavia la stessa. Campi aperti o una strada possono essere trasformati in un acquitrino, colline, un crepaccio o qualche altro tipo di terreno difficile o invalicabile. Un laghetto può essere trasformato in una radura erbosa, un precipizio in una lieve pendenza, un burrone cosparso di rocce in una strada ampia e liscia. Allo stesso modo, puoi modificare l’aspetto delle strutture, o aggiungerne dove non ve ne sono. L’incantesimo non camuffa, occulta né aggiungecreature. L’illusione comprende elementi uditivi, visivi, tattili e olfattivi, così da poter trasformare un terreno sgombro in terreno difficile (o viceversa) o impedire altrimenti il movimento nell’area. Qualsiasi pezzo di terreno illusorio (come una pietra o un bastone), che venga rimosso dall’area dell’incantesimo, svanisce immediatamente. Le creature con visione del vero possono vedere oltre l’illusione e distinguere la vera forma del terreno; tuttavia, gli altri elementi dell’illusione rimangono, così, sebbene la creatura sia consapevole della presenza dell’illusione, vi può comunque interagire fisicamente."
            )
        )



        result.add(
            Enchantment(
                "Modificare Memoria",
                "Modify Memory",
                5,
                "Ammaliamento",
                "1 azione",
                "9 metri",
                "V, S",
                "Concentrazione, massimo 1 minuto",
                "Tenti di rimodellare i ricordi di un’altra creatura. Una creatura che puoi vedere deve effettuare un tiro salvezza su Saggezza. Se la stai combattendo, la creatura ha vantaggio sul tiro salvezza. Se fallisce il tiro salvezza, il bersaglio diventa affascinato da te per la durata dell’incantesimo. Il bersaglio affascinato è inabile e inconsapevole dell’ambiente circostante, sebbene sia ancora in grado di udirti. Se subisce danni o diviene bersaglio di un altro incantesimo, questo incantesimo termina, e nessuno dei ricordi del bersaglio viene modificato. Mentre il bersaglio resta affascinato da questo incantesimo, puoi agire sui ricordi del bersaglio in merito a un evento che abbia vissuto nelle ultime 24 ore e che non sia durato più di 10 minuti. Puoi eliminare permanentemente tutti i ricordi dell’evento, permettere al bersaglio di ricordare l’evento con perfetta chiarezza e dettagli particolareggiati, modificare il ricordo dei dettagli dell’evento, o creare il ricordo di un altro evento. Devi poter parlare al bersaglio per descrivere il modo in cui i suoi ricordi saranno colpiti, e questi deve essere in grado di comprendere il tuo linguaggio, affinché i ricordi modificati si instaurino nella sua memoria. Se l’incantesimo termina prima che tu abbia finito di descrivere i ricordi modificati, la memoria della creatura non viene alterata. Altrimenti, i ricordi modificati si instaurano al termine dell’incantesimo."
            )
        )



        result.add(
            Enchantment(
                "Movimenti del Ragno",
                "Spider Climb",
                2,
                "Trasmutazione",
                "1 azione",
                "Contatto",
                "V, S, M (una goccia di bitume e un ragno)",
                "Concentrazione, massimo 1 ora",
                "Lanci l’incantesimo a contatto di una creatura consenziente. Fino al termine dell’incantesimo, la creatura ottiene la capacità di spostarsi verso l’alto, il basso e lungo superfici verticali o stando a testa in giù sul soffitto, tenendo le mani libere. Il bersaglio ottiene anche velocità di scalata pari alla sua velocità di passeggio."
            )
        )



        result.add(
            Enchantment(
                "Muovere il Terreno",
                "Move Earth",
                6,
                "Trasmutazione",
                "1 azione",
                "36 metri",
                "V, S, M (un badile di ferro e un piccola borsa contenente un misto di tipi di terreno – argilla, concime e sabbia)",
                "Concentrazione, massimo 2 ore",
                "Scegli un’area sul terreno a gittata, non più grande di 12 metri di lato. Per la durata, puoi rimodellare terriccio, sabbia o argilla nell’area in qualsiasi modo tu voglia. Puoi innalzare o abbassare l’altitudine dell’area, creare o riempire un fossato, erigere o abbassare un muro, o formare un pilastro. La portata di questi cambiamenti non può eccedere metà della dimensione più grossa dell’area. Così, se operi su di un quadrato di 12 metri di lato, puoi creare un pilastro alto 6 metri, innalzare o abbassare l’altitudine del terreno di 6 metri, scavare un fossato profondo 6 metri, e così via. Ci vogliono 10 minuti per completare questi mutamenti."
            )
        )



        result.add(
            Enchantment(
                "Muro di Forza",
                "Wall of Force",
                5,
                "Invocazione",
                "1 azione",
                "36 metri",
                "V, S, M (un pizzico di polvere prodotta frantumando una gemma trasparente)",
                "Concentrazione, massimo 10 minuti",
                "Un invisibile muro di forza si forma in un punto a gittata scelto da te. Il muro appare in qualsiasi orientamento da te desiderato, come una barriera orizzontale o verticale oppure angolata. Può fluttuare nell’aria o appoggiarsi su di una superficie solida. Puoi darle la forma di una cupola semisferica o di una sfera con un raggio massimo di 3 metri, oppure darle l’aspetto di una superficie piana composta da un massimo di dieci pannelli di 3 metri per 3 metri. Ogni pannello deve essere contiguo a un altro pannello. In qualsiasi forma, il muro ha uno spessore di 75 centimetri e resta per tutta la durata dell’incantesimo. Se il muro taglia uno spazio di una creatura, quando compare, la creatura viene spinta da un lato del muro (a tua discrezione). Nulla può attraversare fisicamente il muro. È immune a tutti i danni e non può essere dissolto da dissolvi magie. Tuttavia, il muro è distrutto all’istante dall’incantesimo disintegrazione. Il muro si estende anche sul Piano Etereo, impedendo ai viaggiatori eterei di attraversarlo."
            )
        )



        result.add(
            Enchantment(
                "Muro di Fuoco",
                "Wall of Fire",
                4,
                "Invocazione",
                "1 azione",
                "36 metri",
                "V, S, M (un piccolo pezzo di fosforo)",
                "Concentrazione, massimo 1 minuto",
                "Crei un muro di fuoco su di una superficie solida a gittata. Puoi creare un muro lungo fino a 18 metri, alto fino a 6 metri e spesso 30 centimetri, o un muro circolare di 6 metri di diametro, 6 metri di altezza e 30 centimetri di spessore. Il muro è opaco e rimane per la durata dell’incantesimo. Quando il muro appare, ogni creatura nella sua area deve effettuare un tiro salvezza su Destrezza. Una creatura subisce 5d8 danni da fuoco se fallisce il tiro salvezza, o la metà se lo supera. Un lato del muro, selezionato da te quando lanci questo incantesimo, infligge 5d8 danni da fuoco a ciascuna creatura che termini il suo turno entro 3 metri da quel lato o all’interno del muro. Una creatura subisce lo stesso danno quando entra nel muro per la prima volta durante un turno. L’altro lato del muro non infligge danni."
            )
        )



        result.add(
            Enchantment(
                "Muro di Ghiaccio",
                "Wall of Ice",
                6,
                "Invocazione",
                "1 azione",
                "36 metri",
                "V, S, M (un piccolo pezzo di quarzo)",
                "Concentrazione, massimo 10 minuti",
                "Crei un muro di ghiaccio su di una superficie solida a gittata. Puoi creare una cupola semisferica o una sfera con un raggio massimo di 3 metri, o puoi creare una superficie piana composta di un massimo di dieci panelli quadrati di 3 metri di lato. Ogni pannello deve essere contiguo ad almeno un altro pannello. In ogni forma, il muro è spesso 30 centimetri e rimane per la durata dell’incantesimo."
            )
        )



        result.add(
            Enchantment(
                "Muro di Pietra",
                "Wall of Stone",
                5,
                "Invocazione",
                "1 azione",
                "36 metri",
                "V, S, M (un piccolo blocco di granito)",
                "Concentrazione, massimo 10 minuti",
                "Un muro di pietra solida non magico si forma in un punto a gittata, scelto da te. Il muro è spesso 15 centimetri ed è composto di pannelli di 3 per 3 metri. Ogni pannello deve essere contiguo ad almeno un altro pannello. In alternativa, puoi creare pannelli 3 x 6 metri di soli 7,5 centimetri di spessore."
            )
        )



        result.add(
            Enchantment(
                "Muro di Spine",
                "Wall of Thorns",
                6,
                "Evocazione",
                "1 azione",
                "36 metri",
                "V, S, M (una manciata di spine)",
                "Concentrazione, massimo 10 minuti",
                "Crei un muro di cespugli robusti, malleabili e impigliati, ricolmi di spine appuntite. Il muro compare a gittata su di una superficie solida e rimane per la durata dell’incantesimo. Il muro che puoi creare può essere lungo fino a 18 metri, alto fino a 3 metri, e spesso fino a 1,5 metri o un circolo che abbia un diametro di 6 metri e sia alto fino a 6 metri e spesso 1,5 metri. Il muro blocca la linea di visuale."
            )
        )



        result.add(
            Enchantment(
                "Muro di Vento",
                "Wind Wall",
                3,
                "Invocazione",
                "1 azione",
                "36 metri",
                "V, S, M (un minuscolo ventaglio e una piuma di origini esotiche)",
                "Concentrazione, massimo 1 minuto",
                "Un muro di forte vento si leva dal terreno in un punto a gittata di tua scelta. Puoi creare un muro lungo fino a 15 metri, alto 4,5 metri e spesso 30 centimetri. Puoi modellare il muro in qualsiasi maniera desideri purché componga un percorso continuo sul terreno. Il muro rimane per la durata dell’incantesimo. Quando il muro appare, ogni creatura all’interno della sua area deve effettuare un tiro salvezza su Forza. Una creatura subisce 3d8 danni contundenti se fallisce il tiro salvezza, o la metà di questi danni se lo supera. Il forte vento tiene lontana foschia, fumo e altri gas. Le creature volanti di taglia Piccola o minore non possono attraversare il muro. I materiali leggeri trascinati nel muro volano verso l’alto. Frecce, quadrelli e altre munizioni normali vengono deviati e mancano automaticamente il bersaglio (i macigni scagliati dai giganti e dalle macchine d’assedio, e munizioni simili, ne ignorano invece gli effetti). Le creature in forma gassosa non possono attraversarlo."
            )
        )



        result.add(
            Enchantment(
                "Muro Prismatico",
                "Prismatic Wall",
                9,
                "Abiurazione",
                "1 azione",
                "18 metri",
                "V, S",
                "10 minuti",
                "Un piano di luci brillanti e multicolore forma un muro verticale opaco, largo fino a 27 metri, alto 9 metri e spesso 2,5 centimetri, centrato su di un punto a gittata e che puoi vedere. In alternativa, puoi modellare il muro in una sfera, fino a 9 metri di diametro, centrata su di un punto a gittata di tua scelta. Il muro resta fisso sul posto per la durata dell’incantesimo. Se posizioni il muro in modo che attraversi lo spazio occupato da unacreatura, l’incantesimo fallisce, e la tua azione e lo slot incantesimo sono sprecati. Il muro irradia luce intensa fino a una gittata di 30 metri e luce fioca per ulteriori 30 metri. Tu e le creature indicate da te al momento del lancio dell’incantesimo potete attraversare e restare vicini al muro senza pericolo. Se un’altra creatura che può vedere il muro si muove entro 6 metri da esso o inizia lì il suo turno, deve superare un tiro salvezza su Costituzione o restare accecata per 1 minuto. Il muro consiste di sette strati, ognuno di un diverso colore. Quando una creatura cerca di immergersi o attraversare il muro, lo fa uno strato alla volta, attraverso tutti gli strati del muro. Mentre si immerge o attraversa ciascuno strato, la creatura deve superare un tiro salvezza su Destrezza o subire le proprietà di ciascuno strato, uno alla volta, come descritto di seguito. Il muro può essere distrutto, uno strato alla volta, in ordine dal rosso al violetto, in un modo specifico per ogni strato. Una volta che uno strato è distrutto, lo sarà per la durata dell’incantesimo. Una verga di cancellazione distrugge un muro prismatico, ma un campo anti-magia non ha effetto su di esso."
            )
        )



        result.add(
            Enchantment(
                "Nube di Nebbia",
                "Fog Cloud",
                1,
                "Evocazione",
                "1 azione",
                "36 metri",
                "V, S",
                "Concentrazione, massimo 1 ora",
                "Crei una sfera di foschia del raggio di 6 metri centrata su di un punto a gittata. La sfera si propaga intorno agli angoli, e la sua area è oscurata pesantemente. Rimane per la durata dell’incantesimo o finché un vento di velocità moderata o superiore (almeno 15 chilometri all’ora) non la disperde."
            )
        )



        result.add(
            Enchantment(
                "Nube Incendiaria",
                "Incendiary Cloud",
                8,
                "Evocazione",
                "1 azione",
                "45 metri",
                "V, S",
                "Concentrazione, massimo 1 minuto",
                "Una nube di fumo turbinante attraversata da lapilli incandescenti si forma in una sfera di 6 metri di raggio centrata su di un punto a gittata. La nube si propaga intorno agli angoli ed è oscurata pesantemente. Rimane per la durata dell’incantesimo o finché un vento di velocità moderata o superiore (almeno 15 chilometri all’ora) non la disperde. Quando la nube appare, ogni creatura al suo interno deve effettuare un tiro salvezza su Destrezza. Una creatura subisce 10d8 danni da fuoco se fallisce il tiro salvezza, e la metà di questi danni se lo supera. Una creatura deve effettuare il tiro salvezza anche quando entra per la prima volta nell’area o termina lì il suo turno. All’inizio di ciascun tuo turno, la nube si muove di 3 metri lontano da te in una direzione a tua scelta."
            )
        )



        result.add(
            Enchantment(
                "Nube Maleodorante",
                "Stinking Cloud",
                3,
                "Evocazione",
                "1 azione",
                "27 metri",
                "V, S, M (un uovo marcio o foglie di cavolo puzzolente)",
                "Concentrazione, massimo 1 ora",
                "Crei, in un punto a gittata, una sfera di 6 metri di raggio composta di un gas giallo e nauseabondo. La nube si propaga dietro gli angoli e la sua area è oscurata pesantemente. La nube permane nell’aria per la durata. Ogni creatura che si trovi completamente all’interno della nube all’inizio del proprio turno, deve effettuare un tiro salvezza su Costituzione contro il veleno. Se il tiro salvezza fallisce, la creatura spende la sua azione di quel turno a vomitare e barcollare. Le creature che non hanno bisogno di respirare o che sono immuni al veleno superano automaticamente il tiro salvezza. Un vento moderato (almeno 15 chilometri all’ora) disperde la nube dopo 4 round. Un vento forte (almeno 30 chilometri all’ora) lo disperde dopo 1 round."
            )
        )



        result.add(
            Enchantment(
                "Nube Mortale",
                "Cloudkill",
                5,
                "Evocazione",
                "1 azione",
                "36 metri",
                "V, S",
                "Concentrazione, massimo 10 minuti",
                "Crei una sfera di 6 metri di raggio formata da una nebbia velenosa giallo-verde centrata in un punto a gittata di tua scelta. La nebbia si propaga dietro gli angoli. Rimane per la durata dell’incantesimo o finché un forte vento non disperde la nebbia, terminando l’incantesimo. La sua area è oscurata pesantemente. Quando una creatura entra nell’area dell’incantesimo per la prima volta in un turno o inizia lì il suo turno, quella creatura deve effettuare un tiro salvezza su Costituzione. La creatura subisce 5d8 danni da veleno se fallisce il tiro salvezza, o la metà di questi danni se lo supera. Le creature ne sono soggette anche se trattengono il respiro o non hanno bisogno di respirare. La nebbia si allontana di 3 metri da te all’inizio di ogni tuo turno, spostandosi lungo la superficie del terreno. I vapori, essendo più pesanti dell’aria, tendono a scendere verso il basso, arrivando addirittura a insinuarsi nelle aperture."
            )
        )



        result.add(
            Enchantment(
                "Occhio Arcano",
                "Arcane Eye",
                4,
                "Divinazione",
                "1 azione",
                "9 metri",
                "V, S, M (un pezzo di manto di pipistrello)",
                "Concentrazione, massimo 1 ora",
                "Crei a gittata un occhio magico e invisibile, che fluttua nell’aria per la durata dell’incantesimo. Ricevi mentalmente le informazioni visive dall’occhio, che ha vista normale e scurovisione fino a 9 metri. L’occhio può guardare in tutte le direzioni."
            )
        )



        result.add(
            Enchantment(
                "Onda Tonante",
                "Thunderwave",
                1,
                "Invocazione",
                "1 azione",
                "Incantatore (cubo di 4,5 metri di spigolo)",
                "V, S",
                "Istantanea",
                "Un’onda di forza tonante si proietta da te. Ogni creatura in un cubo di 4,5 metri di spigolo che origina da te deve effettuare un tiro salvezza su Costituzione. Se fallisce il tiro salvezza, una creatura subisce 2d8 danni da tuono e viene allontana 3 metri da te. Se supera il tiro salvezza, la creatura subisce la metà dei danni e non viene allontanata. Inoltre, gli oggetti non ancorati che sono totalmente all’interno dell’area vengono spinti 3 metri lontano da te dall’effetto dell’incantesimo, e l’incantesimo produce un rimbombo tonante udibile fino a 90 metri."
            )
        )



        result.add(
            Enchantment(
                "Oscurità",
                "Darkness",
                2,
                "Invocazione",
                "1 azione",
                "18 metri",
                "V, M (pelo di pipistrello e un pizzico di bitume o un pezzo di carbone)",
                "Concentrazione massimo 10 minuti",
                "L’oscurità magica si propaga da un punto a gittata, scelto da te, per riempire una sfera di 4,5 metri di raggio per la durata dell’incantesimo. L’oscurità si propaga intorno agli angoli. Una creatura con scurovisione non può vedere in questa oscurità, e la luce non magica non può illuminarla. Se il punto che hai scelto è su di un oggetto che stai trasportando o uno che non è indossato o trasportato, l’oscurità emana dall’oggetto e si muove con esso. Coprire completamente la fonte dell’oscurità con un oggetto opaco, come un vaso o un elmo, blocca l’oscurità. Se qualsiasi parte dell’area di questo incantesimo si sovrappone con l’area di luce creata da un incantesimo di 2° livello o più basso, l’incantesimo che ha creato la luce viene dissolto."
            )
        )



        result.add(
            Enchantment(
                "Palla di Fuoco",
                "Fireball",
                3,
                "Invocazione",
                "1 azione",
                "45 metri",
                "V, S, M (una minuscola palla di guano di pipistrello e zolfo)",
                "Istantanea",
                "Un fascio di luce gialla parte dal tuo dito puntato verso un punto a gittata scelto da te, e poi esplode con un boato sommesso e si trasforma in un getto di fiamme. Ogni creatura in una sfera di 6 metri di raggio centrata in quel punto deve effettuare un tiro salvezza su Destrezza. Una creatura subisce 8d6 danni da fuoco se fallisce il tiro salvezza, o la metà di questi danni se lo supera. Il fuoco si propaga intorno agli angoli. Il fuoco incendia gli oggetti infiammabili nell’area che non sono indossati o trasportati."
            )
        )



        result.add(
            Enchantment(
                "Palla di Fuoco Ritardata",
                "Delayed Blast Fireball",
                7,
                "Invocazione",
                "1 azione",
                "45 metri",
                "V, S, M (una minuscola palla di guano di pipistrello e zolfo)",
                "Concentrazione, massimo 1 minuto",
                "Un fascio di luce gialla parte dal tuo dito puntato, per condensarsi per la durata dell’incantesimo nella forma di una pallina luminosa in un punto a gittata, scelto da te. Quando l’incantesimo termina, o perché la tua concentrazione è spezzata o perché decidi tu di porgli fine, la pallina esplode con un boato sommesso e si trasforma in un getto di fiamme che si propaga dietro gli angoli. Ogni creatura in una sfera di 6 metri di raggio centrata in quel punto deve effettuare un tiro salvezza su Destrezza. Una creatura subisce danni da fuoco pari al danno totale accumulato se fallisce il tiro salvezza, o la metà di questi danni se lo supera."
            )
        )



        result.add(
            Enchantment(
                "Parlare con gli Animali",
                "Speak with Animals",
                1,
                "Divinazione (rituale)",
                "1 azione",
                "Incantatore",
                "V, S",
                "10 minuti",
                "Per la durata dell’incantesimo, ottieni la capacità di comprendere e comunicare verbalmente con le bestie. Il sapere e la consapevolezza di molte bestie sono limitati dal loro intelletto ma, come minimo, le bestie possono fornirti informazioni riguardo luoghi e mostri nelle vicinanze, compresi quelli che possono percepire o hanno percepito nei giorni passati. A discrezione del GM potresti riuscire a convincere una bestia a farti un piccolo favore."
            )
        )



        result.add(
            Enchantment(
                "Parlare con i Morti",
                "Speak with Dead",
                3,
                "Necromanzia",
                "1 azione",
                "3 metri",
                "V, S, M (incenso acceso)",
                "10 minuti",
                "Conferisci un’apparenza di vita e intelligenza a un cadavere a gittata, scelto da te, permettendogli di rispondere alle domande che gli poni. Il cadavere deve avere ancora una bocca e non può essere non morto. L’incantesimo fallisce se il cadavere è già stato bersaglio di questo incantesimo negli ultimi 10 giorni. Fino al termine dell’incantesimo, puoi porre al cadavere fino a cinque domande. Il cadavere conosce solo quello che già sapeva in vita, compresi i linguaggi parlati. Le risposte sono di solito brevi, criptiche o ripetitive, e il cadavere non è sotto nessun obbligo a darti risposte veritiere se gli sei ostile o ti riconosce come suo nemico. Questo incantesimo non riporta l’anima della creatura nel corpo, ma solo lo spirito che lo muove. Di conseguenza, il cadavere non può apprendere nuove informazioni, non capisce nulla di quello che è successo da quando è morto, e non può fare valutazioni su eventi futuri."
            )
        )



        result.add(
            Enchantment(
                "Parlare con le Piante",
                "Speak with Plants",
                3,
                "Trasmutazione",
                "1 azione",
                "Incantatore (raggio di 9 metri)",
                "V, S",
                "10 minuti",
                "Infondi i vegetali entro 9 metri da te di capacità senziente e di limitata mobilità, dandole la capacità di comunicare con te ed eseguire dei semplici comandi. Puoi interrogare i vegetali in merito a eventi avvenuti nell’ultimo giorno nell’area dell’incantesimo, ottenendo informazioni sulle creature di passaggio, il clima e altro. Puoi anche trasformare il terreno difficile prodotto dalla crescita dei vegetali (come cespugli e fitto sottobosco) in terreno ordinario per la durata dell’incantesimo. Oppure puoi trasformare del terreno normale in cui siano presenti dei vegetali in terreno difficile, che rimane per la durata dell’incantesimo facendo sì, per esempio, che rampicanti e rami rallentino gli inseguitori. A discrezione del GM i vegetali potrebbero svolgere anche altri compiti per tuo conto. L’incantesimo non permette ai vegetali di sradicarsi e muoversi, ma possono muovere liberamente rami, steli e gambi. Se una creatura vegetale si trova nell’area, puoi comunicare con essa come se parlaste lo stesso linguaggio, ma non ottieni alcuna capacità magica per influenzarla."
            )
        )



        result.add(
            Enchantment(
                "Parola del Potere Stordire",
                "Power Word Stun",
                8,
                "Ammaliamento",
                "1 azione bonus",
                "18 metri",
                "V",
                "Istantanea",
                "Pronunci una parola di potere che può travolgere la mente di una creatura a gittata e che puoi vedere, lasciandola confusa. Se il bersaglio ha 150 punti ferita o meno, è stordito. Altrimenti, l’incantesimo non ha effetto. Il bersaglio stordito deve effettuare un tiro salvezza su Costituzione al termine di ciascun suo turno. Se lo supera, l’effetto di stordimento ha fine."
            )
        )



        result.add(
            Enchantment(
                "Parola del Potere Uccidere",
                "Power Word Kill",
                9,
                "Ammaliamento",
                "1 azione bonus",
                "18 metri",
                "V",
                "Istantanea",
                "Pronunci una parola di potere che costringe a morire all’istante una creatura a gittata che puoi vedere. Se la creatura che scegli ha 100 punti ferita o meno, muore. Altrimenti, l’incantesimo non ha effetto."
            )
        )



        result.add(
            Enchantment(
                "Parola del Ritiro",
                "Word of Recall",
                6,
                "Evocazione",
                "1 azione",
                "1,5 metri",
                "V",
                "Istantanea",
                "Te e fino a cinque creature consenzienti entro 1,5 metri da te vi teletrasportate istantaneamente in un luogo sicuro indicato precedentemente, detto santuario. Tu e tutte le creature teletrasportate con te, riapparite nello spazio non occupato più vicino al punto indicato quando hai preparato questo santuario (vedi sotto). Se lanci questo incantesimo senza aver prima preparato un santuario, l’incantesimo non ha effetto. Devi indicare un santuario, lanciando l’incantesimo all’interno del luogo, per esempio un tempio, che sia dedicato o fortemente collegato alla tua divinità. Se tenti di lanciare l’incantesimo in questa maniera in un’area che non sia dedicata alla tua divinità, l’incantesimo non ha effetto."
            )
        )



        result.add(
            Enchantment(
                "Parola Divina",
                "Divine Word",
                7,
                "Invocazione",
                "1 azione bonus",
                "9 metri",
                "V",
                "Istantanea",
                "Pronunci una parola divina, infusa del potere che ha modellato il mondo all’alba della creazione. Scegli un qualsiasi numero di creature a gittata e che puoi vedere. Ogni creatura che può udirti deve effettuare un tiro salvezza su Carisma. Se fallisce il tiro salvezza, la creatura subisce un effetto in base ai suoi attuali punti ferita:"
            )
        )



        result.add(
            Enchantment(
                "Parola Guaritrice",
                "Healing Word",
                1,
                "Invocazione",
                "1 azione bonus",
                "18 metri",
                "V",
                "Istantanea",
                "Una creatura a gittata che puoi vedere, scelta da te, recupera punti ferita pari a 1d4 + il tuo modificatore di caratteristica da incantatore. Questo incantesimo non ha effetto su non morti o costrutti."
            )
        )



        result.add(
            Enchantment(
                "Parola Guaritrice di Massa",
                "Mass Healing Word",
                3,
                "Invocazione",
                "1 azione bonus",
                "18 metri",
                "V",
                "Istantanea",
                "Mentre pronunci parole di cura, fino a sei creature a gittata che puoi vedere, scelte da te, recuperano punti ferita pari a 1d4 + il tuo modificatore di caratteristica da incantatore. Questo incantesimo non ha effetto su non morti o costrutti."
            )
        )



        result.add(
            Enchantment(
                "Passapareti",
                "Passwall",
                5,
                "Trasmutazione",
                "1 azione",
                "9 metri",
                "V, S, M (un pizzico di semi di sesamo)",
                "1 ora",
                "Per la durata dell’incantesimo, compare un passaggio in un punto a gittata che puoi vedere, su di una superficie di legno, calcina o pietra (come una parete, un soffitto o un pavimento) scelta da te. Scegli le dimensioni dell’apertura: al massimo larga 1,5 metri, alta 2,4 metri e profonda 6 metri. Il passaggio non crea instabilità nella struttura che lo circonda. Quando l’apertura sparisce, qualsiasi creatura od oggetto ancora nel passaggio creato dall’incantesimo viene espulso al sicuro nello spazio non occupato più vicino alla superficie su cui hai lanciato l’incantesimo."
            )
        )



        result.add(
            Enchantment(
                "Passare Senza Tracce",
                "Pass Without Trace",
                2,
                "Abiurazione",
                "1 azione",
                "Incantatore",
                "V, S, M (ceneri di una foglia di vischio bruciata e un ramoscello di abete rosso)",
                "Concentrazione, massimo 1 ora",
                "Un velo d’ombra e silenzio si irradia da te, proteggendo te e i tuoi compagni dall’essere individuati. Per la durata dell’incantesimo, ogni creatura a tua scelta entro 9 metri da te (te compreso) riceve un bonus di +10 alle prove di Destrezza (Furtività) e le sue tracce non possono essere seguite eccetto che da mezzi magici. Una creatura che riceve questo bonus non lascia tracce né altri segni del suo passaggio."
            )
        )



        result.add(
            Enchantment(
                "Passo Velato",
                "Misty Step",
                2,
                "Evocazione",
                "1 azione bonus",
                "Incantatore",
                "V",
                "Istantanea",
                "Avvolto rapidamente da una foschia argentata, ti teletrasporti di massimo 9 metri in uno spazio non occupato che puoi vedere."
            )
        )



        result.add(
            Enchantment(
                "Passo Veloce",
                "Longstrider",
                1,
                "Trasmutazione",
                "1 azione",
                "Contatto",
                "V, S, M (un pizzico di terra)",
                "1 ora",
                "La velocità di una creatura con cui sei in contatto aumenta di 3 metri fino al termine dell’incantesimo."
            )
        )



        result.add(
            Enchantment(
                "Paura",
                "Fear",
                3,
                "Illusione",
                "1 azione",
                "Incantatore (cono di 9 metri)",
                "V, S, M (una piuma bianca o il cuore di una gallina)",
                "Concentrazione, massimo 1 minuto",
                "Proietti un’immagine illusoria delle peggiori paure di una creatura. Ogni creatura in un cono di 9 metri deve superare un tiro salvezza su Saggezza o far cadere qualsiasi cosa stia impugnando e restare spaventata per la durata dell’incantesimo. Mentre è spaventata da questo incantesimo, una creatura deve, durante ciascun suo turno, effettuare l’azione Scattare e muoversi lontano da te tramite il tragitto più sicuro, a meno che non abbia spazio per muoversi. Se la creatura termina il suo turno in un posto dove non ha linea di visuale su di te, può effettuare un tiro salvezza su Saggezza. Se lo supera, l’incantesimo, per quella creatura, ha termine."
            )
        )



        result.add(
            Enchantment(
                "Pelle di Corteccia",
                "Barkskin",
                2,
                "Trasmutazione",
                "1 azione",
                "Contatto",
                "V, S, M (una manciata di corteccia di quercia)",
                "Concentrazione, massimo 1 ora",
                "La pelle del bersaglio con cui sei in contatto al momento del lancio dell’incantesimo diventa ruvida e dall’aspetto simile alla corteccia fino al termine dell’incantesimo, e la CA del bersaglio non può essere inferiore a 16, quale che sia l’armatura che sta indossando."
            )
        )



        result.add(
            Enchantment(
                "Pelle di Pietra",
                "Stoneskin",
                4,
                "Abiurazione",
                "1 azione",
                "Contatto",
                "V, S, M (polvere di diamante del valore di 100 mo, che l’incantesimo consuma)",
                "Concentrazione, massimo 1 ora",
                "Lanci l’incantesimo a contatto di una creatura consenziente, la cui pelle si tramuta in una sostanza dura come la pietra. Fino alla fine dell’incantesimo il bersaglio ha resistenza ai danni contundenti, perforanti e taglienti di natura non magica."
            )
        )



        result.add(
            Enchantment(
                "Piaga degli Insetti",
                "Insect Plague",
                5,
                "Evocazione",
                "1 azione",
                "90 metri",
                "V, S, M (qualche granello di zucchero, qualche chicco di grano, e una passata di lardo)",
                "Concentrazione, massimo 10 minuti",
                "Uno sciame di locuste affamate riempie una sfera di 6 metri di raggio centrata in un punto a gittata scelto da te. La sfera si propaga intorno agli angoli. La sfera rimane per la durata dell’incantesimo, e la sua area è oscurata leggermente. L’area della sfera è terreno difficile."
            )
        )



        result.add(
            Enchantment(
                "Porta Dimensionale",
                "Dimension Door",
                4,
                "Evocazione",
                "1 azione",
                "150 metri",
                "V",
                "Istantanea",
                "Ti teletrasporti dalla tua attuale posizione in qualsiasi altro posto a gittata. Arrivi esattamente nel posto desiderato. Può essere un luogo che puoi vedere, uno che puoi visualizzare, o uno che puoi descrivere indicando distanza e direzione, come “30 metri verso il basso” o “90 metri in alto a nordovest con un angolo di 45 gradi.”"
            )
        )



        result.add(
            Enchantment(
                "Portale",
                "Gate",
                9,
                "Evocazione",
                "1 azione",
                "18 metri",
                "V, S, M (un diamante del valore di almeno 5.000 mo)",
                "Concentrazione, massimo 1 minuto",
                "Evochi in uno spazio non occupato a gittata che puoi vedere un portale collegato a un posto preciso su di un diverso piano di esistenza. Il portale è un’apertura circolare creata da te, da 1,5 a 6 metri di diametro. Puoi orientare il portale in qualsiasi direzione desideri. Il portale resta per la durata. Il portale ha un fronte e un dietro su entrambi i piani in cui compare. Il viaggio attraverso il portale è possibile solo muovendosi dal fronte. Qualsiasi cosa lo faccia viene istantaneamente trasportata nell’altro piano, comparendo nello spazio non occupato più vicino al portale. Divinità e altri sovrani planari possono impedire ai portali creati da incantesimi di aprirsi in loro presenza o in qualsiasi punto dei loro domini. Quando lanci questo incantesimo, puoi pronunciare il nome di una specifica creatura (lo pseudonimo, titolo o soprannome non funzionano). Se quella creatura si trova su di un piano diverso dal tuo, il portale si apre in prossimità della creatura nominata e attira la creatura attraverso di sé, verso lo spazio non occupato più vicino dal tuo lato del portale. Non detieni alcun potere speciale sulla creatura, ed essa è libera di agire come il GM ritiene appropriato. Potrebbe andarsene, attaccarti o aiutarti."
            )
        )



        result.add(
            Enchantment(
                "Preghiera di Guarigione",
                "Prayer of Healing",
                2,
                "Invocazione",
                "10 minuti",
                "9 metri",
                "V",
                "Istantanea",
                "Fino a sei creature a gittata che puoi vedere, scelte da te, recuperano ciascuna punti ferita pari a 2d8 + il tuo modificatore di caratteristica da incantatore. Questo incantesimo non ha effetto su non morti o costrutti."
            )
        )



        result.add(
            Enchantment(
                "Presagio",
                "Augury",
                2,
                "Divinazione (rituale)",
                "1 minuto",
                "Incantatore",
                "V, S, M (dei bastoncini, ossa o simili oggetti marchiati appositamente e del valore di almeno 25 mo)",
                "Istantanea",
                "Gettando bastoncini intarsiati con gemme, facendo rotolare ossa di drago, impilando carte elaborate o impiegando qualche altro strumento di divinazione, ricevi un presagio da un’entità ultraterrena riguardo il risultato di uno specifico corso di azione che intendi intraprendere nei prossimi 30 minuti. Il GM sceglie tra i seguenti presagi:"
            )
        )



        result.add(
            Enchantment(
                "Prestidigitazione",
                "Prestidigitation",
                0,
                "Trasmutazione",
                "1 azione",
                "3 metri",
                "V, S",
                "Massimo 1 ora",
                "Questo incantesimo è un trucco magico minore che gli incantatori novizi impiegano per fare pratica. Crei a gittata uno dei seguenti effetti magici:"
            )
        )



        result.add(
            Enchantment(
                "Previsione",
                "Foresight",
                9,
                "Divinazione",
                "1 minuto",
                "Contatto",
                "V, S, M (una piuma di colibrì)",
                "8 ore",
                "Lanci l’incantesimo a contatto di una creatura consenziente per conferirle una limitata capacità di vedere nell’immediato futuro. Per la durata, il bersaglio non può essere sorpreso e ha vantaggio sui tiri per colpire, prove di caratteristica e tiri salvezza. Inoltre, sempre per la durata, le altre creature hanno svantaggio sui tiri per colpire contro il bersaglio. L’incantesimo ha immediatamente termine se lo lanci di nuovo prima che la sua durata abbia fine."
            )
        )



        result.add(
            Enchantment(
                "Produrre Fiamma",
                "Produce Flame",
                0,
                "Evocazione",
                "1 azione",
                "Incantatore",
                "V, S",
                "10 minuti",
                "Una fiammella compare nella tua mano. La fiammella resta lì per la durata dell’incantesimo e non danneggia né te né il tuo equipaggiamento. La fiamma produce luce intensa nel raggio di 3 metri e luce fioca per ulteriori 3 metri. L’incantesimo termina se lo interrompi con un’azione o se lo lanci di nuovo. Puoi usare la fiamma anche per attaccare, sebbene farlo ponga termine all’incantesimo. Quando lanci questo incantesimo, o con un’azione in un turno successivo, puoi scagliare la fiamma a una creatura entro 9 metri da te. Effettua un attacco a distanza con incantesimo. Se colpisci, il bersaglio subisce 1d8 danni da fuoco. Il danno dell’incantesimo aumenta di 1d8 quando arrivi al 5° livello (2d8), 11° livello (3d8) e 17° livello (4d8)."
            )
        )



        result.add(
            Enchantment(
                "Proibizione",
                "Forbiddance",
                6,
                "Abiurazione (rituale)",
                "10 minuti",
                "Contatto",
                "V, S, M (uno spruzzo di acqua sacra, incensi rari, e un rubino in polvere del valore di 1.000 mo)",
                "1 giorno",
                "Crei una interdizione al viaggio magico che protegge fino a 4.000 metri quadri di pavimento, fino a un’altezza di 9 metri dal suolo. Per la durata dell’incantesimo, le creature non possono teletrasportarsi nell’area o usare passaggi, come quello creato dall’incantesimo portale, per entrare nell’area. L’incantesimo protegge l’area dal viaggio planare, e quindi impedisce alle creature di accedere all’area tramite il Piano Astrale, il PianoEtereo, le Lande Fatate o il Mondo delle Ombre, o l’incantesimo spostamento planare. Inoltre, l’incantesimo danneggia i tipi di creatura scelti da te durante il lancio. Scegli uno o più dei seguenti: celestiali, elementali, fatati, immondi e non morti. Quando una creatura selezionata entra nell’area dell’incantesimo per la prima volta in un turno o inizia qui il suo turno, la creatura subisce 5d10 danni radianti o necrotici (a tua scelta, quando lanci l’incantesimo). Quando lanci questo incantesimo, puoi stabilire una parola d’ordine. Una creatura che pronuncia la parola d’ordine mentre entra nell’area dell’incantesimo, non subisce danni da esso. L’area dell’incantesimo non può sovrapporsi all’area di un altro incantesimo proibizione. Se esegui proibizione ogni giorno per 30 giorni nello stesso posto, l’incantesimo durerà finché non viene dissolto, e le componenti materiali saranno consumate durante l’ultimo lancio."
            )
        )



        result.add(
            Enchantment(
                "Proiezione Astrale",
                "Astral Projection",
                9,
                "Necromanzia",
                "1 azione",
                "3 metri",
                "V, S, M (per ogni creatura soggetta a questo incantesimo, devi fornire un giacinto del valore di almeno 1.000 mo e un lingotto d’argento elegantemente scolpito del valore di almeno 100 mo, tutti i quali sono consumati dall’incantesimo)",
                "Speciale",
                "Tu e fino ad altre otto creature consenzienti a gittata proiettate i vostri corpi astrali nel Piano Astrale (l’incantesimo fallisce e il lancio è sprecato qualora vi trovaste già in quel piano). Il corpo materiale che ti lasci alle spalle è privo di sensi e in uno stato di animazione sospesa; non ha bisogno di cibo né di acqua e non invecchia. Il tuo corpo astrale assomiglia in tutto e per tutto alla tua forma mortale, replicando le tue statistiche di gioco e i tuoi oggetti. La principale differenza è l’aggiunta di un cordone argenteo che si estende dalle scapole per 30 centimetri dietro di te, divenendo poi invisibile. Il cordone è la tua connessione al tuo corpo materiale. Finché questa connessione resterà intatta, potrai tornare a casa. Se il cordone viene tagliato (un avvenimento che accade solo quando uno specifico effetto lo indica) la tua anima e corpo vengono separati, uccidendoti all’istante."
            )
        )



        result.add(
            Enchantment(
                "Protezione dai Veleni",
                "Protection from Poison",
                2,
                "Abiurazione",
                "1 azione",
                "Contatto",
                "V, S",
                "1 ora",
                "Neutralizzi il veleno che agisce su di una creatura avvelenata con cui sei in contatto. Se più di un veleno affligge il bersaglio, neutralizzi il veleno che sai essere presente, o ne neutralizzi uno a caso."
            )
        )



        result.add(
            Enchantment(
                "Protezione dal Bene e dal Male",
                "Protection from Evil and Good",
                1,
                "Abiurazione",
                "1 azione",
                "Contatto",
                "V, S, M (acqua sacra o argento e ferro in polvere, che l’incantesimo consuma)",
                "Concentrazione, massimo 10 minuti",
                "Fino al termine dell’incantesimo, una creatura consenziente in contatto con te al momento dell’esecuzione è protetta da certi tipi di creature: aberrazioni, celestiali, elementali, fatati, immondi e non morti. La protezione conferisce diversi benefici. Le creature di quei tipi hanno svantaggio ai tiri per colpire contro il bersaglio. Il bersaglio non può essere affascinato, spaventato o posseduto da loro. Se il bersaglio è già affascinato, spaventato o posseduto da una simile creatura, il bersaglio ha vantaggio su qualsiasi nuovo tiro salvezza contro l’effetto in questione."
            )
        )



        result.add(
            Enchantment(
                "Protezione dall’Energia",
                "Protection from Energy",
                3,
                "Abiurazione",
                "1 azione",
                "Contatto",
                "V, S",
                "Concentrazione, massimo 1 ora",
                "Lanci l’incantesimo a contatto di una creatura consenziente. Per la durata dell’incantesimo, il bersaglio ha resistenza a un tipo di danno scelto da te: acido, freddo, fuoco, fulmine o tuono."
            )
        )



        result.add(
            Enchantment(
                "Punizione Marchiante",
                "Branding Smite",
                2,
                "Invocazione",
                "1 azione bonus",
                "Incantatore",
                "V",
                "Concentrazione, massimo 1 minuto",
                "La prossima volta che colpisci una creatura con un attacco in mischia con arma nella durata dell’incantesimo, l’arma riluce di un bagliore astrale mentre colpisci. L’attacco infligge 2d6 danni radianti aggiuntivi al bersaglio, che diventa visibile qualora sia invisibile ed emette luce fioca in un raggio di 1,5 metri. Inoltre il bersaglio non può diventare invisibile fino al termine dell’incantesimo."
            )
        )



        result.add(
            Enchantment(
                "Purificare Cibo e Bevande",
                "Purify Food and Water",
                1,
                "Trasmutazione (rituale)",
                "1 azione",
                "3 metri",
                "V, S",
                "Istantanea",
                "Tutti i cibi e le bevande non magiche in una sfera di 1,5 metri di raggio, centrata in un punto a gittata di tua scelta, vengono purificati e liberati da veleni e malattie."
            )
        )



        result.add(
            Enchantment(
                "Raggio di Affaticamento",
                "Ray of Enfeeblement",
                2,
                "Necromanzia",
                "1 azione",
                "18 metri",
                "V, S",
                "Concentrazione, massimo 1 minuto",
                "Un fascio nero di energia debilitante parte dal tuo dito diretto contro una creatura a gittata. Effettua un attacco a distanza con incantesimo contro il bersaglio. Se colpisci, il bersaglio infliggerà la metà dei danni con gli attacchi con arma che usano la Forza fino al termine dell’incantesimo."
            )
        )



        result.add(
            Enchantment(
                "Raggio di Gelo",
                "Ray of Frost",
                0,
                "Invocazione",
                "1 azione",
                "18 metri",
                "V, S",
                "Istantanea",
                "Un fascio gelato di luce azzurra colpisce una creatura a gittata. Effettua un attacco a distanza con incantesimo contro il bersaglio. Se colpisci, egli subisce 1d8 danni da freddo, e la sua velocità è ridotta di 3 metri fino all’inizio del tuo prossimo turno. Il danno dell’incantesimo aumenta di 1d8 quando raggiungi il 5° livello (2d8), l’11° livello (3d8) e il 17° livello (4d8)."
            )
        )



        result.add(
            Enchantment(
                "Raggio Rovente",
                "Scorching Ray",
                2,
                "Invocazione",
                "1 azione",
                "36 metri",
                "V, S",
                "Istantanea",
                "Crei tre raggi di fuoco e li proietti verso tre bersagli a gittata. Puoi proiettarli contro lo stesso bersaglio o bersagli diversi. Effettua un attacco a distanza con incantesimo per ciascun raggio. Se colpisci, il bersaglio subisce 2d6 danni da fuoco."
            )
        )



        result.add(
            Enchantment(
                "Ragnatela",
                "Web",
                2,
                "Evocazione",
                "1 azione",
                "18 metri",
                "V, S, M (un pezzo di tela di ragno)",
                "Concentrazione, massimo 1 ora",
                "Evochi una spessa massa di tela densa e appiccicosa in un punto a gittata, scelto da te. Per la durata, la ragnatela riempie un cubo di 6 metri di spigolo da quel punto. La ragnatela è terreno difficile e rende quell’aera oscurata leggermente. Se la tela non è ancorate tra due masse solide (come pareti o alberi) o stesa lungo un pavimento, parete o soffitto, la ragnatela evocata crolla su se stessa, e l’incantesimo termina all’inizio del tuo prossimo turno. Le tele distese su di una superficie piatta hanno una profondità di 1,5 metri. Ogni creatura che inizia il suo turno nella ragnatela o che vi entra durante il proprio turno deve effettuare un tiro salvezza su Destrezza. Se lo fallisce, la creatura è intralciata finché rimane nella ragnatela o finché non si libera. Una creatura intralciata dalle ragnatele può usare la sua azione per effettuare una prova di Forza contro la CD del tiro salvezza dell’incantesimo. Se la supera, non è più intralciata. Le ragnatele sono infiammabili. Qualsiasi cubo di 1,5 metri di spigolo di ragnatela che venga esposto al fuoco, brucia in 1 round, infliggendo 2d4 danni da fuoco a qualsiasi creatura che inizi il suo turno in mezzo al fuoco."
            )
        )



        result.add(
            Enchantment(
                "Randello Incantato",
                "Shillelagh",
                0,
                "Trasmutazione",
                "1 azione bonus",
                "Contatto",
                "V, S, M (vischio, una foglia di quadrifoglio, e una randello o bastone da combattimento)",
                "1 minuto",
                "Il legno di un randello o bastone da combattimento che stai impugnando viene infuso del potere della natura. Per la durata dell’incantesimo, usando quell’arma puoi usare la tua caratteristica da incantatore al posto della Forza per i tiri per colpire e danno da mischia, e il dado di danno dell’arma diventa un d8. L’arma diventa anche magica, se già non lo è. L’incantesimo ha termine se lo lanci di nuovo o se lasci l’arma."
            )
        )



        result.add(
            Enchantment(
                "Reggia Meravigliosa",
                "Magnificient Mansion",
                7,
                "Evocazione",
                "1 minuto",
                "90 metri",
                "V, S, M (un portale in miniatura scolpito in avorio, un piccolo pezzo di marmo lucido, e un minuscolo cucchiaio d’argento, ciascuno di questi oggetti deve essere almeno del valore di 5 mo)",
                "24 ore",
                "Entro la gittata, evochi un’abitazione extradimensionale che rimane per la durata dell’incantesimo. Scegli dove è posizionato il suo portone d’ingresso. Il portone d’ingresso emette una lieve luminosità ed è largo 1,5 metri per 3 metri di altezza. Tu e tutte le creature da te indicate quando hai lanciato l’incantesimo potete entrare nell’abitazione extradimensionale, fino a quando il portone resta aperto. Puoi aprire o chiudere il portone se ti trovi entro 9 metri da esso. Mentre è chiuso, il portone è invisibile."
            )
        )



        result.add(
            Enchantment(
                "Regressione Mentale",
                "Feeblemind",
                8,
                "Ammaliamento",
                "1 azione",
                "45 metri",
                "V, S, M (una manciata di sfere di argilla, cristallo, vetro o minerali)",
                "Istantanea",
                "Assalti la mente di una creatura a gittata e che puoi vedere, cercando di frammentarne l’intelletto e la personalità. Il bersaglio subisce 4d6 danni psichici e deve effettuare un tiro salvezza su Intelligenza. Se fallisce il tiro salvezza, i punteggi di Intelligenza e Carisma della creatura scendono a 1. La creatura non può lanciare incantesimi, attivare oggetti magici, comprendere linguaggi, o comunicare in alcun modo comprensibile. La creatura può, tuttavia, identificare i suoi amici, seguirli e anche proteggerli. Ogni 30 giorni, la creatura può ripetere il tiro salvezza contro l’incantesimo. Se lo supera, l’incantesimo ha termine. L’incantesimo può essere terminato da ristorare superiore, guarigione o desiderio."
            )
        )



        result.add(
            Enchantment(
                "Reincarnazione",
                "Reincarnate",
                5,
                "Trasmutazione",
                "1 ora",
                "Contatto",
                "V, S, M (oli e unguenti rari del valore di almeno 1.000 mo, che l’incantesimo consuma)",
                "Istantanea",
                "Entri a contatto con un umanoide morto o un frammento di umanoide morto. Purché la creatura non sia morta da più di 10 giorni, l’incantesimo gli forma un nuovo corpo adulto e poi ne richiama l’anima affinché entri nel corpo. Se l’anima del bersaglio non è libera o consenziente a farlo, l’incantesimo fallisce. La magia modella un nuovo corpo, che probabilmente provocherà un cambio di razza alla creatura. Il GM tira un d100 e consulta la seguente tabella per determinare quale forma assuma la creatura una volta riportata in vita, oppure sarà Il GM a scegliere la forma."
            )
        )



        result.add(
            Enchantment(
                "Resistenza",
                "Resistance",
                0,
                "Abiurazione",
                "1 azione",
                "Contatto",
                "V, S, M (un mantello in miniatura)",
                "Concentrazione, massimo 1 minuto",
                "Lanci l’incantesimo a contatto con una creatura consenziente. Una volta prima del termine dell’incantesimo, il bersaglio può tirare un d4 e sommare il risultato ottenuto a un tiro salvezza a sua scelta. Può tirare il dado prima o dopo aver effettuato il tiro salvezza. Poi l’incantesimo termina."
            )
        )



        result.add(
            Enchantment(
                "Respirare Sott’Acqua",
                "Water Breathing",
                3,
                "Trasmutazione (rituale)",
                "1 azione",
                "9 metri",
                "V, S, M (una cannuccia o una pagliuzza)",
                "24 ore",
                "Questo incantesimo consente a un massimo di dieci creature consenzienti a gittata e che puoi vedere, di respirare sott’acqua fino al termine dell’incantesimo. Le creature soggette mantengono anche il loro normale metodo di respirazione."
            )
        )



        result.add(
            Enchantment(
                "Resurrezione",
                "Resurrection",
                7,
                "Necromanzia",
                "1 ora",
                "Contatto",
                "V, S, M (un diamante del valore di almeno 1.000 mo, che l’incantesimo consuma)",
                "Istantanea",
                "Lanci l’incantesimo a contatto di una creatura morta da non più di un secolo, che non è morta di vecchiaia e che non sia non morta. Se la sua anima è libera e consenziente, il bersaglio ritornerà in vita con tutti i suoi punti ferita. Questo incantesimo neutralizza tutti i veleni e cura le normali malattie che affliggevano la creatura quando è morta. Tuttavia non rimuove malattie magiche, maledizioni e simili; se questi effetti non sono rimossi prima del lancio dell’incantesimo, affliggeranno il bersaglio al suo ritorno in vita. Questo incantesimo chiude tutte le ferite mortali e ripristina qualsiasi parte del corpo mancante. Tornare dalla morte è un’ordalia. Il bersaglio subisce una penalità di -4 a tutti i tiri per colpire, tiri salvezza e prove di caratteristica. Ogni volta che il bersaglio termina un riposo lungo, la penalità viene ridotta di 1 finché non scompare. Lanciare questo incantesimo per riportare in vita una creatura che è morta da un anno o più ti sfianca. Fino al termine di un riposo lungo, non potrai più lanciare"
            )
        )



        result.add(
            Enchantment(
                "Resurrezione Pura",
                "True Resurrection",
                9,
                "Trasmutazione",
                "1 ora",
                "Contatto",
                "V, S, M (un po’ di acqua sacra e diamanti del valore di 25.000 mo, che l’incantesimo consuma)",
                "Istantanea",
                "Lanci l’incantesimo a contatto di una creatura morta da non più di 200 anni e che sia morta per qualsiasi motivo ma non di vecchiaia. Se la sua anima è libera e consenziente, la creatura ritornerà in vita con tutti i suoi punti ferita."
            )
        )



        result.add(
            Enchantment(
                "Rianimare Morti",
                "Raise Dead",
                5,
                "Necromanzia",
                "1 ora",
                "Contatto",
                "V, S, M (una diamante del valore di almeno 500 mo, che l’incantesimo consuma)",
                "Istantanea",
                "Riporti in vita una creatura morta, purché questa non sia morta da più di 10 giorni. Se l’anima della creatura è sia consenziente che libera di riunirsi al corpo, la creatura torna in vita con 1 punto ferita. Questo incantesimo neutralizza anche qualsiasi veleno e cura le malattie non magiche che affliggevano la creatura al momento della morte. Questo incantesimo, tuttavia, non rimuove le malattie magiche, maledizioni o simili effetti; se questi non vengono rimossi prima del lancio dell’incantesimo, riprenderanno a manifestarsi quando la creatura torna in vita. L’incantesimo non può riportare in vita una creatura non morta. Questo incantesimo richiude tutte le ferite mortali, ma non ripristina le parti del corpo mancanti. Se la creatura è priva di parti del corpo o organi fondamentali per la sopravvivenza (la testa, per esempio) l’incantesimo fallisce automaticamente. Tornare dalla morte è un’ordalia. Il bersaglio subisce una penalità di -4 a tutti i tiri per colpire, tiri salvezza e prove di caratteristica. Ogni volta che il bersaglio termina un riposo lungo, la penalità viene ridotta di 1 finché non scompare."
            )
        )



        result.add(
            Enchantment(
                "Rigenerazione",
                "Regenerate",
                7,
                "Trasmutazione",
                "1 minuto",
                "Contatto",
                "V, S, M (un rosario e acqua sacra)",
                "1 ora",
                "Lanci l’incantesimo a contatto di una creatura per stimolare la sua capacità di guarigione naturale. Il bersaglio recupera 4d8 + 15 punti ferita. Per la durata dell’incantesimo, il bersaglio recupera 1 punto ferita all’inizio di ciascun suo turno (10 punti ferita al minuto). Le membra recise del corpo del bersaglio (dita, gambe, code e così via), se ne ha, vengono ripristinate in 2 minuti. Se hai la parte recisa e la tieni appoggiata al moncherino, l’incantesimo fa sì che l’arto si ricucia istantaneamente col moncherino."
            )
        )



        result.add(
            Enchantment(
                "Rimuovi Maledizione",
                "Remove Curse",
                3,
                "Abiurazione",
                "1 azione",
                "Contatto",
                "V, S",
                "Istantanea",
                "Tutte le maledizioni che affliggono una creatura o oggetto a contatto con te, terminano. Se l’oggetto è un oggetto magico maledetto, la maledizione resta, ma l’incantesimo infrange la sintonia del proprietario con l’oggetto così che lo possa rimuovere o gettare."
            )
        )



        result.add(
            Enchantment(
                "Rinascita",
                "Revivify",
                3,
                "Necromanzia",
                "1 azione",
                "Contatto",
                "V, S, M (diamante del valore di 300 mo, che l’incantesimo consuma)",
                "Istantanea",
                "Una creatura morta nell’ultimo minuto e con cui sei in contatto, ritorna in vita con 1 punto ferita. Questo incantesimo non può riportare in vita le persone morte di vecchiaia, né può ripristinare le parti del corpo mancanti."
            )
        )



        result.add(
            Enchantment(
                "Riparare",
                "Mending",
                0,
                "Trasmutazione",
                "1 minuto",
                "Contatto",
                "V, S, M (due calamite)",
                "Istantanea",
                "Questo incantesimo ripara una singola rottura o spaccatura in un oggetto con cui sei a contatto, come una catenella spezzata, due metà di una chiave rotta, un mantello lacerato, o un otre che perde. Purché la rottura o la spaccatura non sia più grande di 30 centimetri in qualsiasi dimensione, sei in grado di ripararle, senza lasciare traccia dei danni subiti. Questo incantesimo può riparare fisicamente un oggetto magico o un costrutto, ma non è in grado di ripristinare le funzioni magiche di questi oggetti."
            )
        )



        result.add(
            Enchantment(
                "Riposo Inviolato",
                "Gentle Repose",
                2,
                "Necromanzia (rituale)",
                "1 azione",
                "Contatto",
                "V, S, M (un pizzico di sale e un pezzo di rame posto su ciascun occhio del cadavere, che devono restare lì per la durata)",
                "10 giorni",
                "Entri a contatto con un cadavere o altri resti. Per la durata, il bersaglio è protetto dalla putrefazione e non può diventare non morto. L’incantesimo, inoltre, estende il limite di tempo per rianimare il bersaglio dalla morte, dato che i giorni trascorsi sotto l’influenza di questo incantesimo non sono conteggiati nel limite di tempo di incantesimi come rianimare morti."
            )
        )



        result.add(
            Enchantment(
                "Risata Incontenibile",
                "Hideous Laughter",
                1,
                "Ammaliamento",
                "1 azione",
                "9 metri",
                "V, S, M (piccole torte e una piuma che viene agitata nell’aria)",
                "Concentrazione, massimo 1 minuto",
                "Una creatura a gittata di tua scelta e che puoi vedere percepisce tutto come tremendamente ilare e divertente, scoppiando in fragorose risate finché è soggetta a questo incantesimo. Il bersaglio deve superare un tiro salvezza su Saggezza o cadere prono, restando inabile e incapace di rialzarsi per la durata. Le creature con un punteggio di Intelligenza 4 o meno, ignorano l’effetto. Al termine di ciascun suo turno, e ogni volta che subisce danni, il bersaglio può effettuare un altro tiro salvezza su Saggezza. Il bersaglio ha vantaggio al tiro salvezza se questo è stato provocato dai danni. Se lo supera, l’incantesimo termina."
            )
        )



        result.add(
            Enchantment(
                "Riscaldare il Metallo",
                "Heat Metal",
                2,
                "Trasmutazione",
                "1 azione",
                "18 metri",
                "V, S, M (un pezzo di ferro e una fiamma)",
                "Concentrazione, massimo 1 minuto",
                "Scegli un manufatto di metallo, come un’arma di metallo o un’armatura di metallo media o pesante, a gittata e che puoi vedere. Fai sì che l’oggetto risplenda di rosso per il calore. Qualsiasi creatura in contatto fisico con l’oggetto subisce 2d8 danni da fuoco quando lanci questo incantesimo. Fino al termine dell’incantesimo, puoi usare un’azione bonus per infliggere di nuovo questo danno nei tuoi turni successivi. Se una creatura sta impugnando o indossando l’oggetto e subisce danno da esso, la creatura deve superare un tiro salvezza su Costituzione o gettare l’oggetto se ne è in grado. Se non getta l’oggetto, ha svantaggio ai tiri per colpire e le prove di caratteristica fino all’inizio del suo prossimo turno."
            )
        )



        result.add(
            Enchantment(
                "Ristorare Inferiore",
                "Lesser Restoration",
                2,
                "Abiurazione",
                "1 azione",
                "Contatto",
                "V, S",
                "Istantanea",
                "Puoi porre fine a una malattia o condizione che affligge una creatura con cui sei a contatto. La condizione può essere accecato, assordato, avvelenato o paralizzato."
            )
        )



        result.add(
            Enchantment(
                "Ristorare Superiore",
                "Greater Restoration",
                5,
                "Abiurazione",
                "1 azione",
                "Contatto",
                "V, S, M (polvere di diamante del valore di almeno 100 mo, che l’incantesimo consuma)",
                "Istantanea",
                "Imbevi una creatura a contatto di energia positiva per annullare un effetto debilitante. Puoi ridurre il livello di sfinimento del bersaglio di uno, o terminare uno dei seguenti effetti che affliggono il bersaglio:"
            )
        )



        result.add(
            Enchantment(
                "Risveglio",
                "Awaken",
                5,
                "Trasmutazione",
                "8 ore",
                "Contatto",
                "V, S, M (un’agata del valore di almeno 1.000 mo, che l’incantesimo consuma)",
                "Istantanea",
                "Dopo aver trascorso il tempo di lancio a disegnare tracciati magici con una gemma preziosa, entri a contatto con una bestia o vegetale Enorme o di taglia inferiore. Il bersaglio deve essere privo di punteggio di Intelligenza o avere Intelligenza 3 o meno. Il bersaglio ottiene Intelligenza 10. Il bersaglio ottiene anche la capacità di parlare un linguaggio che conosci. Se il bersaglio è un vegetale, ottiene la capacità di muovere i suoi arti, radici, liane, rampicanti e così via, e ottiene sensi simili a quelli di un umano. Il GM sceglierà le statistiche appropriate al tipo di vegetale risvegliato, come le statistiche per il cespuglio risvegliato o l’albero risvegliato. La bestia o vegetale risvegliato è affascinato da te per 30 giorni o finché tu o i tuoi compagni non gli arrecherete danno. Quando la condizione affascinato termina, la creatura risvegliata sceglie se rimanerti amichevole, in base a come l’hai trattata mentre era affascinata."
            )
        )



        result.add(
            Enchantment(
                "Ritirata Rapida",
                "Expeditious Retreat",
                1,
                "Trasmutazione",
                "1 azione bonus",
                "Incantatore",
                "V, S",
                "Concentrazione, massimo 10 minuti",
                "Questo incantesimo ti permette di muoverti a un’andatura incredibile. Quando lanci questo incantesimo, e poi con un’azione bonus durante ciascun tuo turno fino al termine dell’incantesimo, puoi effettuare l’azione Scattare."
            )
        )



        result.add(
            Enchantment(
                "Saltare",
                "Jump",
                1,
                "Abiurazione",
                "1 azione",
                "Contatto",
                "V, S, M (la zampa posteriore di una cavalletta)",
                "1 minuto",
                "La distanza di salto della creatura con cui sei in contatto al momento del lancio è triplicata fino al termine dell’incantesimo."
            )
        )



        result.add(
            Enchantment(
                "Salvare i Morenti",
                "Spare the Dying",
                0,
                "Necromazia",
                "1 azione",
                "Contatto",
                "V, S",
                "Istantanea",
                "Una creatura a 0 punti ferita, con cui sei a contatto, diventa stabile. L’incantesimo non ha effetto su non morti o costrutti."
            )
        )



        result.add(
            Enchantment(
                "Santificare",
                "Hallow",
                5,
                "Invocazione",
                "24 ore",
                "Contatto",
                "V, S, M (erbe, oli e incensi del valore di almeno 1.000 mo, che l’incantesimo consuma)",
                "Fino a che dissolto",
                "Infondi l’area circostante a un punto con cui sei in contatto di potere sacro (o blasfemo). L’area può avere un raggio massimo di 18 metri, e l’incantesimo fallisce se include un’area già sotto l’effetto di un incantesimo santificare. L’area soggetta all’incantesimo genera i seguenti effetti. Per prima cosa, celestiali, elementali, fatati, immondi e non morti non possono entrare nell’area, né una simile creatura può affascinare, spaventare o possederne altre al suo interno. Qualsiasi creatura affascinata, spaventata o posseduta da una creatura simile non è più affascinata, spaventata o posseduta dal momento in cui entra in quest’area. Puoi escludere uno o più tipi di queste creature da questo effetto. Seconda cosa, puoi vincolare un effetto ulteriore all’area. Scegli l’effetto dalla lista seguente, o scegline uno presentatoti dal GM. Alcuni di questi effetti si applicano alle creature nell’area; puoi decidere se gli effetti si applichino a tutte le creature, le creature che seguono una specifica divinità o capo, o le creature di un tipo specifico, come orchi o troll. Quando una creatura soggetta all’incantesimo entra in quest’area per la prima volta durante un turno o inizia il suo turno qui, deve effettuare un tiro salvezza su Carisma. Se lo supera, la creatura ignora l’effetto aggiuntivo finché non lascia l’area."
            )
        )



        result.add(
            Enchantment(
                "Santuario",
                "Sanctuary",
                1,
                "Abiurazione",
                "1 azione bonus",
                "9 metri",
                "V, S, M (un piccolo specchio d’argento)",
                "1 minuto",
                "Proteggi una creatura a gittata dagli attacchi. Fino al termine dell’incantesimo, qualsiasi creatura che prenda come bersaglio la creatura protetta con un attacco o incantesimo dannoso deve prima effettuare un tiro salvezza su Saggezza. Se fallisce il tiro salvezza, l’attaccante deve scegliere un nuovo bersaglio o perdere l’attacco o l’incantesimo. Questo incantesimo non protegge la creatura protetta dagli effetti ad area, come lo scoppio di una palla di fuoco. Se la creatura protetta effettua un attacco o lancia un incantesimo che agisce su creature nemiche, l’incantesimo termina."
            )
        )



        result.add(
            Enchantment(
                "Santuario Privato",
                "Private Sanctum",
                4,
                "Abiurazione",
                "10 minuti",
                "36 metri",
                "V, S, M (un sottile foglio di piombo, un pezzo di vetro opaco, un batuffolo di cotone o tessuto, e crisolito in polvere)",
                "24 ore",
                "Proteggi con la magia un’area. L’area è un cubo che può essere piccolo fino a 1,5 metri di spigolo o grande fino a 30 metri di spigolo. L’incantesimo agisce fino al termine della durata o finché non usi un’azione per interromperlo. Quando lanci l’incantesimo, decidi che tipo di protezione questo fornisce, scegliendo una o più delle seguenti proprietà:"
            )
        )



        result.add(
            Enchantment(
                "Scagliare Maledizione",
                "Bestow Curse",
                3,
                "Necromanzia",
                "1 azione",
                "Contatto",
                "V, S",
                "Concentrazione, massimo 1 minuto",
                "Una creatura con cui sei a contatto deve superare un tiro salvezza su Saggezza o restare maledetta per la durata dell’incantesimo. Quando lanci questo incantesimo, scegli la natura della maledizione tra le seguenti opzioni:"
            )
        )



        result.add(
            Enchantment(
                "Scassinare",
                "Knock",
                2,
                "Trasmutazione",
                "1 azione",
                "18 metri",
                "V",
                "Istantanea",
                "Scegli un oggetto a gittata e che puoi vedere. L’oggetto può essere una porta, scatola, delle manette, una serratura o un altro oggetto che possieda un metodo comune o magico per prevenirne l’accesso. Un bersaglio che è chiuso da una serratura comune o che è bloccato o sbarrato viene aperto, sbloccato o liberato. Se l’oggetto ha più serrature, solo una di queste viene aperta. Se scegli un bersaglio che è tenuto chiuso con serratura arcana, quell’incantesimo resta soppresso per 10 minuti, durante i quali il bersaglio può essere aperto come di norma."
            )
        )



        result.add(
            Enchantment(
                "Sciame di Meteore",
                "Meteor Swarm",
                9,
                "Invocazione",
                "1 azione",
                "1,5 chilometri",
                "V, S",
                "Istantanea",
                "Sfere incandescenti di fuoco si schiantano a terra in quattro punti differenti a gittata e che puoi vedere. Ogni creatura, in una sfera di 2 metri di raggio centrata sul punto scelto da te, deve effettuare un tiro salvezza su Destrezza. La sfera si propaga intorno agli angoli. Una creatura subisce 20d6 danni da fuoco e 20d6 danni contundenti se fallisce il tiro salvezza, o la metà di questi danni se lo supera. Una creatura nell’area di più di uno scoppio infuocato ne subisce gli effetti solo una volta. L’incantesimo danneggia gli oggetti nell’area e incendia gli oggetti infiammabili che non sono indossati o trasportati."
            )
        )



        result.add(
            Enchantment(
                "Scolpire Pietra",
                "Stone Shape",
                4,
                "Trasmutazione",
                "1 azione",
                "Contatto",
                "V, S, M (argilla malleabile, che deve essere lavorata per ottenere una vaga forma dell’oggetto di pietra)",
                "Istantanea",
                "Scolpisci in qualsiasi forma che si presti ai tuoi scopi un oggetto di pietra di taglia Media o inferiore o una sezione di pietra non più grossa di 1,5 metri in qualsiasi direzione, con cui sei in contatto. Così, per esempio, potresti scolpire una grossa pietra in un’arma, idolo o feretro, o creare un piccolo passaggio attraverso il muro, purché il muro sia spesso meno di 1,5 metri. Potresti anche modellare una porta di pietra o la sua cornice per sigillare la porta. L’oggetto che crei può avere fino a due cardini e un chiavistello, ma è impossibile creare meccanismi più complessi."
            )
        )



        result.add(
            Enchantment(
                "Scopri Trappole",
                "Find Traps",
                2,
                "Divinazione",
                "1 azione",
                "36 metri",
                "V, S",
                "Istantanea",
                "Avverti la presenza di qualsiasi trappola a gittata che sia nella tua linea di visuale. Una trappola, ai fini di questo incantesimo, comprende qualsiasi cosa che sia in grado di infliggere un effetto improvviso o inaspettato che tu possa considerare dannoso o indesiderabile, e che è stato espressamente inteso come tale dal suo creatore. Di conseguenza, l’incantesimo percepirebbe un’area sotto l’incantesimo allarme, un glifo di interdizione, o una botola meccanica, ma non rivelerebbe una debolezza naturale del pavimento, un soffitto instabile o una buca nascosta. L’incantesimo si limita a rivelare la presenza delle trappole. Non apprendi la posizione delle trappole, ma apprendi la natura generica del pericolo posto dalle trappole che hai percepito."
            )
        )



        result.add(
            Enchantment(
                "Scrigno Segreto",
                "Secret Chest",
                4,
                "Evocazione",
                "1 azione",
                "Contatto",
                "V, S, M (un forziere lavorato, 1 metro x 50 cm x 50 cm, costruito con rari materiali del valore di almeno 5.000 mo, e una sua replica Minuscola fatta degli stessi materiali e del valore di almeno 50)",
                "Istantanea",
                "Nascondi un forziere e tutti i suoi contenuti sul Piano Etereo. Quando lanci questo incantesimo devi essere in contatto con il forziere e la replica in miniatura che serve da componente materiale. Il forziere può contenere fino a 0,25 metri cubi di materiale non vivente (1 x metro x 50 centimetri x 50 centimetri). Mentre il forziere rimane sul Piano Etereo, puoi usare un’azione per entrare in contatto con la replica e richiamare il forziere. Esso riapparirà in uno spazio non occupato sul terreno entro 1,5 metri da te. Puoi rispedire il forziere nel Piano Etereo, usando un’azione ed entrando in contatto sia col forziere che con la replica."
            )
        )



        result.add(
            Enchantment(
                "Scritto Illusorio",
                "Illusory Script",
                1,
                "Illusione (rituale)",
                "1 minuto",
                "Contatto",
                "S, M (un inchiostro a base di piombo del valore di almeno 10 mo, che l’incantesimo consuma)",
                "10 giorni",
                "Scrivi su di una pergamena, un pezzo di carta o qualche altro materiale adatto a scrivere e lo infondi di una potente illusione che permane per la durata dell’incantesimo. Per te e qualsiasi creatura da te indicata al lancio dell’incantesimo, la scritta appare normale, con la tua grafia, e trasmette qualsiasi significato volevi comunicare quando hai vergato il testo. Per tutti gli altri, la scritta appare come se fosse redatta in una scrittura ignota o magica, che risulta incomprensibile. In alternativa, puoi far sì che la scritta sembri un messaggio totalmente diverso, in una grafia e linguaggio differente, sebbene debba essere un linguaggio a te conosciuto. In caso l’incantesimo venisse dissolto, sia la scritta originale che l’illusione svaniscono. Una creatura con visione del vero può leggere il messaggio nascosto."
            )
        )



        result.add(
            Enchantment(
                "Scrutare",
                "Scrying",
                5,
                "Divinazione",
                "10 minuti",
                "Incantatore",
                "V, S, M (un focus del valore di almeno 1.000 mo, come una sfera di cristallo, un specchio d’argento o una fonte ricolma di acqua sacra)",
                "Concentrazione, massimo 10 minuti",
                "Puoi vedere e udire una particolare creatura a tua scelta che si trovi sul tuo stesso piano di esistenza. Il bersaglio deve effettuare un tiro salvezza su Saggezza, modificato da quanto bene conosci il bersaglio e dal tipo di legame che hai nei suoi confronti. Se il bersaglio sa che stai lanciando l’incantesimo, può fallire volontariamente il tiro salvezza, in caso desiderasse essere osservato da te."
            )
        )



        result.add(
            Enchantment(
                "Scudo",
                "Shield",
                1,
                "Abiurazione",
                "1 reazione, che effettui quando sei colpito da un attacco o bersaglio dell’incantesimo dardo incantato",
                "Incantatore",
                "V, S",
                "1 round",
                "Compare una barriera di forza magica invisibile a proteggerti. Fino all’inizio del tuo prossimo turno hai un bonus di +5 alla CA, compreso l’attacco innescante, e non subisci danni da dardo incantato."
            )
        )



        result.add(
            Enchantment(
                "Scudo della Fede",
                "Shield of Faith",
                1,
                "Abiurazione",
                "1 azione bonus",
                "18 metri",
                "V, S, M (una piccola pergamena con su scritto un frammento di testo sacro)",
                "Concentrazione, massimo 10 minuti",
                "Compare un campo scintillante che circonda una creatura a gittata, scelta da te, conferendole un bonus di +2 alla CA per la durata dell’incantesimo."
            )
        )



        result.add(
            Enchantment(
                "Scudo di Fuoco",
                "Fire Shield",
                4,
                "Invocazione",
                "1 azione",
                "Incantatore",
                "V, S, M (un po’ di fosforo o una lucciola)",
                "10 minuti",
                "Fiamme sottili e vaporose avvolgono il tuo corpo per la durata dell’incantesimo, emettendo luce intensa in un raggio di 3 metri e luce fioca per ulteriori 3 metri. Puoi terminare l’incantesimo in anticipo, usando un’azione per interromperlo."
            )
        )



        result.add(
            Enchantment(
                "Scurovisione",
                "Darkvision",
                2,
                "Trasmutazione",
                "1 azione",
                "Contatto",
                "V, S, M (o un pizzico di carota o di agata secca)",
                "8 ore",
                "Una creatura consenziente con cui sei in contatto ottiene la capacità di vedere al buio. Per la durata dell’incantesimo, quella creatura ha scurovisione fino a una gittata di 18 metri."
            )
        )



        result.add(
            Enchantment(
                "Segugio Fedele",
                "Faithful Hound",
                4,
                "Evocazione",
                "1 azione",
                "9 metri",
                "V, S, M (un minuscolo fischietto d’argento, e un pezzo d’osso, e un filo)",
                "8 ore",
                "Puoi evocare un cane da guardia fantasma in uno spazio non occupato a gittata e che puoi vedere, dove rimarrà per la durata dell’incantesimo, finché non viene congedato con un’azione, o finché non si allontanerà più di 30 metri da te. Il segugio è invisibile a tutte le creature eccetto che a te e non può essere danneggiato. Quando una creatura di taglia Piccola o superiore si avvicina entro 9 metri da esso senza aver prima pronunciato la parola d’ordine da te specificata quando hai lanciato l’incantesimo, il segugio inizia ad abbaiare a grande volume. Il segugio vede le creature invisibili e può vedere nel Piano Etereo. Esso ignora le illusioni. All’inizio di ciascun tuo turno, il segugio tenta di mordere una creatura entro 1,5 metri da esso e che ti sia ostile. Il bonus di attacco del segugio è uguale al tuo modificatore di caratteristica da incantatore + il tuo bonus di competenza. Se colpisce, infligge 4d8 danni perforanti."
            )
        )



        result.add(
            Enchantment(
                "Sembrare",
                "Seeming",
                5,
                "Illusione",
                "1 azione",
                "9 metri",
                "V, S",
                "8 ore",
                "Questo incantesimo ti permette di cambiare l’aspetto di un qualsiasi numero di creature a gittata e che puoi vedere. Fornisci a ciascun bersaglio un nuovo aspetto illusorio. Una creatura non consenziente può effettuare un tiro salvezza su Carisma e, se lo supera, ignora l’incantesimo. L’incantesimo camuffa l’aspetto fisico oltre che gli abiti, le armature, le armi e l’equipaggiamento. Puoi far sembrare ciascuna creatura 30 centimetri più bassa o più alta, sembrare magra, grassa o una via di mezzo. Non puoi cambiare la conformazione del corpo del bersaglio, e quindi devi scegliere una forma che abbia la stessa distribuzione basilare di arti. Per tutto il resto, l’illusione è limitata solo dalla tua fantasia. L’incantesimo permane per la sua durata, a meno che tu non usi una tua azione per interromperlo prima. I cambi apportati da questo incantesimo non sono in grado di sostenere un’ispezione fisica. Per esempio, se usi questo incantesimo per aggiungere un cappello all’abbigliamento di una creatura, gli oggetti attraversano il cappello, e chiunque lo tocchi non avvertirebbe nulla e finirebbe per toccare la testa e i capelli della creatura. Se usi questo incantesimo per apparire più magro di quello che sei, la mano di una persona che provasse a toccarti rimbalzerebbe su di te, mentre alla vista sembrerebbe fermarsi a mezz’aria. Una creatura può usare la sua azione per ispezionare un bersaglio ed effettuare una prova di Intelligenza (Indagare) contro la CD del tiro salvezza dell’incantesimo. Se la riesce, capisce che il bersaglio è camuffato."
            )
        )



        result.add(
            Enchantment(
                "Semipiano",
                "Demiplane",
                8,
                "Evocazione",
                "1 azione",
                "18 metri",
                "S",
                "1 ora",
                "Crei una porta d’ombra su di una superficie piana a gittata e che puoi vedere. La porta è grande abbastanza da permettere il passaggio senza problemi a una creatura Media. Quando viene aperta, la porta conduce a un semipiano che appare come una stanza vuota di 9 metri in ciascuna dimensione, fatta di legno e pietra. Quando l’incantesimo termina, la porta scompare, e qualsiasi creatura od oggetto all’interno del semipiano rimane intrappolato lì, mentre la porta scompare anche dall’altro lato. Ogni volta che esegui questo incantesimo, crei un nuovo semipiano, oppure permetti alla porta d’ombra di connettersi a un semipiano creato da un precedente lancio dell’incantesimo. Inoltre, se conosci la natura e i contenuti di un semipiano creato dal lancio di questo incantesimo da parte di un’altra creatura, puoi far sì che la porta d’ombra si colleghi invece a quel semipiano."
            )
        )



        result.add(
            Enchantment(
                "Serratura Arcana",
                "Arcane Lock",
                2,
                "Abiurazione",
                "1 azione",
                "Contatto",
                "V, S, M (polvere d’oro del valore di almeno 25 mo, che viene consumata dall’incantesimo)",
                "Fino a che dissolto",
                "Lanci l’incantesimo a contatto di una porta, finestra, portale, forziere o altro ingresso chiuso, e questo diventa chiuso a chiave per la durata. Tu e le creature che hai indicato, quando hai lanciato questo incantesimo, potete aprire l’oggetto normalmente. Puoi anche predisporre una parola d’ordine che, quando pronunciata entro 1,5 metri dall’oggetto, sopprime l’incantesimo per 1 minuto. Altrimenti l’apertura è invalicabile fino a che non viene distrutta o l’incantesimo è dissolto o soppresso. Lanciare scassinare sull’oggetto sopprime serratura arcana per 10 minuti."
            )
        )



        result.add(
            Enchantment(
                "Servitore Inosservato",
                "Unseen Servant",
                1,
                "Evocazione (rituale)",
                "1 azione",
                "18 metri",
                "V, S, M (un pezzo di corda e un pezzo di legno)",
                "1 ora",
                "Questo incantesimo crea una forza invisibile, senza cervello e informe, che svolge dei semplici compiti al tuo comando, fino al termine dell’incantesimo. Il servitore si forma in uno spazio sul terreno non occupato, entro la gittata. Ha CA 10, 1 punto ferita, Forza 2 e non può attaccare. Se scende a 0 punti ferita, l’incantesimo ha termine. Come azione bonus, durante ciascun tuo turno, puoi comandare mentalmente il servitore di muoversi fino a 4,5 metri e interagire con un oggetto. Il servitore può svolgere dei semplici compiti alla stregua di un servitore umano, come raccogliere cose, pulire, riparare, piegare abiti, accendere fuochi, servire il cibo e versare il vino. Una volta impartito il comando, il servitore svolgerà il compito al meglio delle sue capacità finché non l’avràcompletato, e poi aspetterà il tuo prossimo comando. Se comandi al servitore di svolgere un compito che lo farà muovere a più di 18 metri da te, l’incantesimo termina."
            )
        )



        result.add(
            Enchantment(
                "Sfera Congelante",
                "Freezing Sphere",
                6,
                "Invocazione",
                "1 azione",
                "90 metri",
                "V, S, M (una piccola sfera di cristallo)",
                "Istantanea",
                "Un globo gelido di energia fredda parte dalla punta delle tue dita verso un punto di tua scelta a gittata, dove esplode in una sfera di 18 metri di raggio. Ogni creatura nell’area deve effettuare un tiro salvezza su Costituzione. Se fallisce il tiro salvezza, una creatura subisce 10d6 danni da freddo. Se lo supera, subisce la metà di questi danni. Se il globo colpisce un corpo d’acqua o un liquido composto principalmente d’acqua (escluse però le creature a base d’acqua), congela il liquido fino a una profondità di 15 centimetri in un’area quadrata di 9 metri di lato. Il ghiaccio dura 1 minuto. Le creature che stavano nuotando sulla superficie dell’acqua congelata restano intrappolate nel ghiaccio. Una creatura intrappolata può usare un’azione per effettuare una prova di Forza contro la CD del tiro salvezza dell’incantesimo, al fine di liberarsi. Se lo desideri, dopo aver completato l’incantesimo, puoi trattenerti dallo sparare il globo. Un piccolo globo, circa delle dimensioni di una pietra da fionda, freddo al contatto, appare nella tua mano. In qualsiasi momento, tu, o una creatura a cui hai dato il globo, potete lanciare il globo (fino a una gittata di 12 metri). Questo si frantumerà all’impatto, con lo stesso effetto del normale lancio dell’incantesimo. Puoi anche poggiare il globo a terra senza che si frantumi. Dopo 1 minuto, se il globo non è già stato frantumato, esploderà."
            )
        )



        result.add(
            Enchantment(
                "Sfera Elastica",
                "Resilient Sphere",
                4,
                "Invocazione",
                "1 azione",
                "90 metri",
                "V, S, M (un pezzo semisferico di cristallo trasparente e un pezzo semisferico corrispondente di gomma arabica)",
                "Concentrazione, massimo 1 minuto",
                "Una sfera di energia luminosa avvolge una creatura od oggetto di taglia Grande o inferiore a gittata. Una creatura non consenziente deve effettuare un tiro salvezza su Destrezza. Se lo fallisce, la creatura è avvolta dall’incantesimo per la sua durata. Nulla (né oggetti fisici, né energia, né altri effetti di incantesimi) può attraversare questa barriera, in entrata o uscita, sebbene una creatura all’interno della sfera possa respirare senza problemi. La sfera è immune a tutti i danni, e una creatura al suo interno non può essere danneggiata da attacchi o effetti originanti dall’esterno, né una creatura all’interno della sfera può danneggiare nulla che si trovi all’esterno."
            )
        )



        result.add(
            Enchantment(
                "Sfera Infuocata",
                "Flaming Sphere",
                2,
                "Evocazione",
                "1 azione",
                "18 metri",
                "V, S, M (un po’ di sego, un pizzico di zolfo, e una manciata di ferro in polvere)",
                "Concentrazione, massimo 1 minuto",
                "Per la durata dell’incantesimo compare una sfera di 1,5 metri di diametro in uno spazio a gittata, scelto da te. Qualsiasi creatura che termini il suo turno entro 1,5 metri dalla sfera deve effettuare un tiro salvezza su Destrezza. La creatura subisce 2d6 danni da fuoco se fallisce il tiro salvezza, o la metà di questi danni se lo supera. Con un’azione bonus, puoi spostare la sfera di 9 metri. Se fai schiantare la sfera contro una creatura, la creatura deve effettuare un tiro salvezza contro il danno della sfera, e la sfera smetterà di muoversi per quel turno. Quando muovi la sfera, la puoi spostare oltre barriere alte fino a 1,5 metri, e farle saltare spazi larghi fino a 3 metri. La sfera incendia gli oggetti infiammabili non indossati o trasportati, e irradia una luce intensa in un raggio di 6 metri e una luce fioca per ulteriori 6 metri."
            )
        )



        result.add(
            Enchantment(
                "Sfocatura",
                "Blur",
                2,
                "Illusione",
                "1 azione",
                "Incantatore",
                "V",
                "Concentrazione, massimo 1 minuto",
                "Il tuo corpo diventa sfocato, indistinto e tremolante a chiunque ti veda. Per la durata dell’incantesimo, tutte le creature hanno svantaggio sui tiri per colpire contro di te. Gli attaccanti che non si affidano alla vista sono immuni a questo effetto, per esempio se hanno vista cieca o sono in grado di distinguere le illusioni, come per visione del vero."
            )
        )



        result.add(
            Enchantment(
                "Sguardo Penetrante",
                "Eyebite",
                6,
                "Necromanzia",
                "1 azione",
                "Incantatore",
                "V, S",
                "Concentrazione, massimo 1 minuto",
                "Per la durata dell’incantesimo, i tuoi occhi si tramutano in un vuoto nero infuso di terribile potere. Una creatura a tua scelta entro 18 metri da te e che puoi vedere, deve superare un tiro salvezza su Saggezza o, per la durata, subire uno dei seguenti effetti di tua scelta. Durante ciascun tuo turno, fino al termine dell’incantesimo, puoi usare la tua azione per prendere come bersaglio un’altra creatura, ma non puoi prendere di nuovo come bersaglio una creatura che abbia superato un tiro salvezza contro questo lancio di sguardo penetrante."
            )
        )



        result.add(
            Enchantment(
                "Silenzio",
                "Silence",
                2,
                "Illusione (rituale)",
                "1 azione",
                "36 metri",
                "V, S",
                "Concentrazione, massimo 10 minuti",
                "Per la durata dell’incantesimo, nessun suono può essere creato all’interno o attraversare una sfera di 6 metri di raggio centrata su di un punto a gittata, scelto da te. Qualsiasi creatura o oggetto che si trovi completamente all’interno della sfera è immune al danno da tuono, e le creature che sono completamente al suo interno sono assordate. È impossibile lanciare un incantesimo che comprende una componente verbale mentre si è al suo interno."
            )
        )



        result.add(
            Enchantment(
                "Simbolo",
                "Symbol",
                7,
                "Abiurazione",
                "1 azione",
                "Contatto",
                "V, S, M (mercurio, fosforo e diamante e opale in polvere con un valore totale di almeno 1.000 mo, che l’incantesimo consuma)",
                "Fino a che dissolto o attivato",
                "Quando lanci questo incantesimo, inscrivi un glifo dannoso su di una superficie (come una sezione di pavimento, muro o un tavolo) o all’interno di un oggetto che può essere chiuso per nascondere il glifo (come un libro, una pergamena o un forziere). Se scegli una superficie, il glifo può coprire un’area di superficie non maggiore di 3 metri di diametro. Se scegli un oggetto, quell’oggetto deve restare al suo posto; se l’oggetto viene spostato più di 3 metri dal punto in cui è stato lanciato l’incantesimo, il glifo è spezzato, e l’incantesimo termina senza essere stato attivato. Il glifo è quasi invisibile e può essere trovato con una prova di Intelligenza (Indagare) contro la CD del tiro salvezza dei tuoi incantesimi."
            )
        )



        result.add(
            Enchantment(
                "Simulacro",
                "Simulacrum",
                7,
                "Illusione",
                "12 ore",
                "Contatto",
                "V, S, M (neve o ghiaccio in quantità per creare una copia a dimensioni reali della creatura duplicata; un po’ di capelli, unghie o altro pezzo del corpo di quella creatura da piazzare in mezzo alla neve o al ghiaccio; e un rubino in polvere del valore di 1.500 mo, sparso sopra il duplicato e consumato dall’incantesimo)",
                "Fino a che dissolto",
                "Modelli un duplicato illusorio di una bestia o umanoide che resti a gittata per l’intero tempo di lancio dell’incantesimo. Il duplicato è una creatura, in parte reale e formata di ghiaccio o neve, che può effettuare azioni e interagire come una normale creatura. Sembra essere identica all’originale, ma ha la metà dei punti ferita massimi di quella creatura e si presenta priva di equipaggiamento. Altrimenti, l’illusione usa tutte le statistiche della creatura che duplica. Il simulacro è amichevole verso di te e le creature da te indicate. Obbedisce ai comandi da te pronunciati, muovendosi e agendo in accordo ai tuoi desideri e agendo durante il tuo turno in combattimento. Il simulacro è privo della capacità di apprendere o diventare più potente, e quindi non accresce mai di livello o nelle caratteristiche, né può recuperare gli slot incantesimi spesi. Se il simulacro è danneggiato, puoi ripararlo in un laboratorio alchemico, usando erbe rare e minerali del valore di 100 mo per punto ferita recuperato. Il simulacro rimane finché non scende a 0 punti ferita, a quel punto si ritrasforma in neve e si scioglie all’istante. Se lanci di nuovo questo incantesimo, qualsiasi duplicato da te creato con questo incantesimo attualmente attivo viene immediatamente distrutto."
            )
        )



        result.add(
            Enchantment(
                "Sogno",
                "Dream",
                5,
                "Illusione",
                "1 azione",
                "Speciale",
                "V, S, M (una manciata di sabbia, una punta di inchiostro, e una penna per scrivere presa da un volatile addormentato)",
                "8 ore",
                "Questo incantesimo modella i sogni di una creatura. Scegli una creatura a te nota come bersaglio dell’incantesimo. Il bersaglio deve trovarsi sul tuo stesso piano di esistenza. Le creature che non dormono, come gli elfi, non possono essere soggette a questo incantesimo. Tu o una creatura consenziente con cui sei a contatto entrate in uno stato di trance, agendo da messaggero. Mentre è in trance, il messaggero è consapevole di ciò che lo circonda, ma non può effettuare azioni o muoversi. Per la durata dell’incantesimo, se il bersaglio è addormentato, il messaggero appare nei sogni del bersaglio e può conversare con lui finché questi rimane addormentato. Il messaggero può anche modellare l’ambiente del sogno, creando terreni, oggetti e altre immagini. Il messaggero può emergere dalla trance in qualsiasi momento, terminando anticipatamente l’effetto dell’incantesimo. Al risveglio, il bersaglio ricorda perfettamente il suo sogno. Se il bersaglio è sveglio quando lanci l’incantesimo, il messaggero ne viene a conoscenza e può porre fine alla trance (eall’incantesimo) o aspettare che il bersaglio si addormenti. A quel punto il messaggero potrà comparire nei sogni del bersaglio. Puoi fare apparire il messaggero al bersaglio con un aspetto mostruoso e terrificante. Se lo fai, il messaggero può consegnare un messaggio di al massimo dieci parole e poi il bersaglio deve effettuare un tiro salvezza su Saggezza. Se fallisce il tiro salvezza, gli echi della spaventosa mostruosità generano un incubo per la durata del sonno del bersaglio che gli impedisce di ottenere qualsiasi beneficio da quel riposo. Inoltre, quando il bersaglio si sveglia, subisce 3d6 danni psichici. Se possiedi una ciocca di capelli, delle unghie tagliate, o simile porzione del corpo del bersaglio, egli effettuerà il suo tiro salvezza con svantaggio."
            )
        )



        result.add(
            Enchantment(
                "Sonno",
                "Sleep",
                1,
                "Ammaliamento",
                "1 azione",
                "27 metri",
                "V, S, M (un pizzico di sabbia, petali di rosa o un grillo)",
                "1 minuto",
                "Questo incantesimo pone le creature in un torpore magico. Tira 5d8; il totale è il numero di punti ferita di creature su cui l’incantesimo può agire. Le creature, entro 6 metri dal punto a gittata scelto da te, sono influenzate in ordine ascendente di punti ferita (ignorando le creature svenute). A partire dalla creatura con il numero più basso di punti ferita attuali, ogni creatura soggetta a questo incantesimo perde i sensi fino al terminedell’incantesimo, chi dorme subisce danni, o qualcuno usa un’azione per scuotere o prendere a schiaffi l’addormentato. Sottrarre i punti ferita di ciascuna creatura dal totale prima di considerare la creatura con il valore di punti ferita più basso successiva. I punti ferita di una creatura devono essere uguali o inferiori al totale rimanente perché l’effetto agisca su di essa."
            )
        )



        result.add(
            Enchantment(
                "Spada Arcana",
                "Arcane Sword",
                7,
                "Invocazione",
                "1 azione",
                "18 metri",
                "V, S, M (una spada di platino in miniatura con l’impugnatura e il pomello di rame e zinco, del valore di 250 mo)",
                "Concentrazione, massimo 1 minuto",
                "Per la durata dell’incantesimo, crei a gittata un piano di forza a forma di spada fluttuante. Quando la spada appare, effettui un attacco in mischia con incantesimo contro un bersaglio scelto da te entro 1,5 metri dalla spada. Se colpisci, il bersaglio subisce 3d10 danni da forza. Fino al termine dell’incantesimo, puoi usare un’azione bonus ogni tuo turno per muovere la spada di 6 metri in un punto che puoi vedere e ripetere questo attacco contro lo stesso bersaglio o uno differente."
            )
        )



        result.add(
            Enchantment(
                "Spostamento Planare",
                "Plane Shift",
                7,
                "Evocazione",
                "1 azione",
                "Contatto",
                "V, S, M (una verga di metallo biforcuta del valore di almeno 250 mo, sintonizzata verso uno specifico piano di esistenza)",
                "Istantanea",
                "Tu e un massimo di altre otto creature consenzienti, che si stringono le mani per formare un cerchio, venite trasportati su di un diverso piano di esistenza. Puoi specificare una destinazione bersaglio in termini generici, e riapparirai all’interno o in prossimità di quella destinazione, a discrezione del GM. In alternativa, se conosci la sequenza di sigilli di un cerchio di teletrasporto verso un altro piano di esistenza, l’incantesimo può condurti a quel cerchio. Se il cerchio di teletrasporto è troppo piccolo per contenere tutte le creature che trasporti con te, esse riappariranno nello spazio non occupato più vicino possibile al cerchio. Puoi usare questo incantesimo per bandire una creatura non consenziente in un altro piano. Scegli una creatura a portata ed effettua un attacco in mischia con incantesimo contro di essa. Se colpisci, la creatura deve effettuare un tiro salvezza su Carisma. Se la creatura fallisce il tiro salvezza, viene trasportata in un luogo casuale sul piano di esistenza da te specificato. Una creatura così trasportata dovrà trovare per proprio conto il modo di tornare sul tuo attuale piano di esistenza."
            )
        )



        result.add(
            Enchantment(
                "Spruzzo Colorato",
                "Color Spray",
                1,
                "Illusione",
                "1 azione",
                "Incantatore (cono di 4,5 metri)",
                "V, S, M (un pizzico di polvere o sabbia che sia colorata di rosso, giallo e blu)",
                "1 round",
                "Dalla tua mano si sprigiona una raffica di luci colorate e abbaglianti. Tira 6d10; il totale è l’ammontare di punti ferita di creature su cui questo incantesimo agisce. Le creature, in un cono di 4,5 metri che origina da te, sono soggette in ordine ascendente dei loro attuali punti ferita (ignorando le creature prive di sensi e le creature che non possono vedere). A partire dalla creatura che ha il minor numero di punti ferita attuali, ciascuna creatura soggetta a questo incantesimo resta accecata fino al terminedell’incantesimo. Sottrarre i punti ferita di ciascuna creatura dal totale prima di passare alla creatura col totale più basso di punti ferita successiva. I punti ferita di una creatura devono essere uguali o minori del totale rimanente perché l’incantesimo agisca su di essa."
            )
        )



        result.add(
            Enchantment(
                "Spruzzo Prismatico",
                "Prismatic Spray",
                7,
                "Invocazione",
                "1 azione",
                "Incantatore (cono di 18 metri)",
                "V, S",
                "Istantanea",
                "Otto raggi di luce multicolore partono dalla tua mano. Ogni raggio è di un diverso colore e ha un potere e uno scopo diverso. Ogni creatura in un cono di 18 metri deve effettuare un tiro salvezza su Destrezza. Per ogni bersaglio, tirare un d8 per determinare quale sia il colore del raggio che lo ha colpito."
            )
        )



        result.add(
            Enchantment(
                "Spruzzo Velenoso",
                "Poison Spray",
                0,
                "Evocazione",
                "1 azione",
                "3 metri",
                "V, S",
                "Istantanea",
                "Stendi la mano verso una creatura a gittata e che puoi vedere, e proietti una nube di gas velenoso dal tuo palmo. La creatura deve superare un tiro salvezza su Costituzione o subire 1d12 danni da veleno. Il danno dell’incantesimo aumenta di 1d12 quando raggiungi il 5° livello (2d12), 11° livello (3d12) e 17° livello (4d12)."
            )
        )



        result.add(
            Enchantment(
                "Stretta Folgorante",
                "Shocking Grasp",
                0,
                "Invocazione",
                "1 azione",
                "Contatto",
                "V, S",
                "Istantanea",
                "Dalle tue mani saettano lampi che infliggono una scossa a una creatura con cui provi a entrare in contatto. Effettua un attacco in mischia con incantesimo contro il bersaglio. Hai vantaggio sul tiro per colpire se il bersaglio sta indossando un’armatura fatta di metallo. Se colpisci, il bersaglio subisce 1d8 danni da fulmine, e non può effettuare reazioni fino all’inizio del suo prossimo turno. Il danno dell’incantesimo aumenta di 1d8 quando raggiungi il 5° livello (2d8), l’11° livello (3d8) e il 17° livello (4d8)."
            )
        )



        result.add(
            Enchantment(
                "Suggestione",
                "Suggestion",
                2,
                "Ammaliamento",
                "1 azione",
                "9 metri",
                "V, M (la lingua di un serpente e un pezzo di favo o un goccio di olio dolce)",
                "Concentrazione, massimo 8 ore",
                "Suggerisci un corso di attività (limitato a una o due frasi) e influenzi magicamente una creatura a gittata e che puoi vedere e udire e ti possa capire, scelta da te. Le creature che non possono essere affascinate sono immuni a questo effetto. La suggestione deve essere pronunciata in modo che il corso d’azione suoni ragionevole. Chiedere a una creatura di pugnalarsi, gettarsi su di una lancia, darsi fuoco, o fare qualche altro atto palesemente dannoso nega automaticamente gli effetti dell’incantesimo. Il bersaglio deve effettuare un tiro salvezza su Saggezza. Se fallisce il tiro salvezza, esso segue il corso d’azione da te descritto al meglio delle suecapacità. Il corso d’azione suggerito può proseguire per l’intera durata dell’incantesimo. Se l’attività suggerita può essere completata in un tempo più breve, l’incantesimo ha termine quando il soggetto termina di fare ciò che gli è stato chiesto. Puoi anche specificare condizioni che attiveranno un’attività speciale per la durata dell’incantesimo. Per esempio, potresti suggerire a un cavaliere di cedere il suo cavallo da guerra al primo mendicante che incontri. Se la condizione non viene soddisfatta prima del termine dell’incantesimo, l’attività non verrà svolta. Se tu o uno qualsiasi dei tuoi compagni danneggia il bersaglio, l’incantesimo ha termine."
            )
        )



        result.add(
            Enchantment(
                "Suggestione di Massa",
                "Mass Suggestion",
                6,
                "Ammaliamento",
                "1 azione",
                "18 metri",
                "V, M (la lingua di un serpente e un pezzo di favo o un goccio di olio dolce)",
                "24 ore",
                "Suggerisci un corso di attività (limitato a una o due frasi) e influenzi magicamente fino a dodici creature a gittata che puoi vedere e udire e ti possano capire, scelte da te. Le creature che non possono essere affascinate sono immuni a questo effetto. La suggestione deve essere pronunciata in modo che il corso d’azione suoni ragionevole. Chiedere a una creatura di pugnalarsi, gettarsi su di una lancia, darsi fuoco, o fare qualche altro atto palesemente dannoso nega automaticamente gli effetti dell’incantesimo. Ogni bersaglio deve effettuare un tiro salvezza su Saggezza. Se fallisce il tiro salvezza, esso segue il corso d’azione da te descritto al meglio delle sue capacità. Il corso d’azione suggerito può proseguire per l’intera durata dell’incantesimo. Se l’attività suggerita può essere completata in un tempo più breve, l’incantesimo ha termine quando il soggetto termina di fare ciò che gli è stato chiesto. Puoi anche specificare condizioni che attiveranno un’attività speciale per la durata dell’incantesimo. Per esempio, potresti suggerire a un gruppo di soldati di cedere tutti i loro soldi al primo mendicante che incontrino. Se la condizione non viene soddisfatta prima del termine dell’incantesimo, l’attività non verrà svolta. Se tu o uno qualsiasi dei tuoi compagni danneggia una creatura soggetta a questo incantesimo, per quella creatura l’incantesimo ha termine."
            )
        )



        result.add(
            Enchantment(
                "Taumaturgia",
                "Thaumaturgy",
                0,
                "Trasmutazione",
                "1 azione",
                "9 metri",
                "V",
                "Massimo 1 minuto",
                "Manifesti a gittata una trucco minore, un segno di potere soprannaturale. Crei a gittata uno dei seguenti effetti magici:"
            )
        )



        result.add(
            Enchantment(
                "Telecinesi",
                "Telekinesis",
                5,
                "Trasmutazione",
                "1 azione",
                "18 metri",
                "V, S",
                "Concentrazione, massimo 10 minuti",
                "Ottieni la capacità di muovere o manipolare creature o oggetti tramite il pensiero. Quando lanci questo incantesimo, e come tua azione durante ciascun round, puoi esercitare la tua volontà su di una creatura od oggetto a gittata e che puoi vedere, provocando l’effetto appropriato tra quelli seguenti. Puoi agire round dopo round sempre sullo stesso bersaglio, o sceglierne uno nuovo ogni volta. Se cambi bersaglio, il bersaglio precedente non è più soggetto all’incantesimo."
            )
        )



        result.add(
            Enchantment(
                "Teletrasporto",
                "Teleport",
                7,
                "Evocazione",
                "1 azione",
                "3 metri",
                "V",
                "Istantanea",
                "Questo incantesimo teletrasporta istantaneamente te e altre otto creature consenzienti (oppure un singolo oggetto) a gittata e che puoi vedere, scelte da te, in una destinazione di tua scelta. Se il bersaglio è un oggetto, deve poter entrare in un cubo di 3 metri di spigolo, e non può essere tenuto o trasportato da una creatura non consenziente. La destinazione che scegli ti deve essere nota, e deve essere sullo stesso piano di esistenza in cui ti trovi. La tua familiarità con la destinazione determina se vi riesce ad arrivare. Il GM tira il d100 e consulta la tabella."
            )
        )



        result.add(
            Enchantment(
                "Tempesta di Fuoco",
                "Fire Storm",
                7,
                "Invocazione",
                "1 azione",
                "45 metri",
                "V, S",
                "Istantanea",
                "Una tempesta composta di fiamme ruggenti compare in un punto a gittata, scelto da te. L’area della tempesta consiste di un massimo di dieci cubi di 3 metri di spigolo, che puoi disporre come preferisci. Ogni cubo deve avere almeno una faccia adiacente a quella di un altro cubo. Ogni creatura nell’area deve effettuare un tiro salvezza su Destrezza. Se lo fallisce subisce 7d10 danni da fuoco, o la metà di questi danni se lo supera. Il fuoco danneggia gli oggetti nell’area e incendia gli oggetti infiammabili che non sono indossati o trasportati. Se lo desideri, la vita vegetale nell’area resta illesa dagli effetti di questo incantesimo."
            )
        )



        result.add(
            Enchantment(
                "Tempesta di Ghiaccio",
                "Ice Storm",
                4,
                "Invocazione",
                "1 azione",
                "90 metri",
                "V, S, M (un pizzico di polvere e alcune gocce d’acqua)",
                "Istantanea",
                "Una grandinata di ghiaccio si abbatte a terra in un cilindro di 6 metri di raggio e 12 metri di altezza centrato su di un punto a gittata. Ogni creatura nel cilindro deve effettuare un tiro salvezza su Destrezza. La creatura subisce 2d8 danni contundenti e 4d6 danni da freddo se fallisce il tiro salvezza, o la metà se lo supera. La grandine trasforma l’area di effetto della tempesta in terreno difficile fino al termine del tuo prossimo turno."
            )
        )



        result.add(
            Enchantment(
                "Tempesta di Nevischio",
                "Sleet Storm",
                3,
                "Evocazione",
                "1 azione",
                "45 metri",
                "V, S, M (un pizzico di polvere e qualche goccia d’acqua)",
                "Concentrazione, massimo 1 minuto",
                "Fino al termine dell’incantesimo, pioggia gelida e nevischio si abbattono in un cilindro alto 6 metri e del raggio di 12 metri centrato in un punto da te scelto a gittata. L’area è oscurata pesantemente, mentre le fiamme esposte vengono spente. Il terreno nell’area è coperto di ghiaccio scivoloso, rendendolo terreno difficile. Quando una creatura entra nell’area dell’incantesimo per la prima volta durante un turno o inizia il suo turno lì, deve effettuare un tiro salvezza su Destrezza. Se lo fallisce, cade prona. Se una creatura nell’area dell’incantesimo si sta concentrando, deve superare un tiro salvezza su Costituzione contro la CD del tiro salvezzadell’incantesimo o perdere la concentrazione."
            )
        )



        result.add(
            Enchantment(
                "Tempesta di Vendetta",
                "Storm of Vengeance",
                9,
                "Evocazione",
                "1 azione",
                "Vista",
                "V, S",
                "Concentrazione, massimo 1 minuto",
                "Si forma una ribollente nube di tempesta, centrata in un punto che puoi vedere e che si propaga in un raggio di 110 metri. L’area è illuminata da fulmini, vi riecheggiano tuoni e venti forti la spazzano. Quando la nube compare, ogni creatura sotto di essa (ovvero non più di 1.500 metri sotto la nube) deve effettuare un tiro salvezza su Costituzione. Se fallisce il tiro salvezza, la creatura subisce 2d6 danni da tuono e resta assordata per 5 minuti. Ogni round in cui mantieni la concentrazione su questo incantesimo, la tempesta, durante il tuo turno, produce ulteriori effetti."
            )
        )



        result.add(
            Enchantment(
                "Tentacoli Neri",
                "Black Tentacles",
                4,
                "Evocazione",
                "1 azione",
                "27 metri",
                "V, S, M (un pezzo di tentacolo di una piovra gigante o di un calamaro gigante)",
                "Concentrazione, massimo 1 minuto",
                "Viscidi tentacoli d’ebano riempiono un quadrato di 6 metri di lato sul terreno, a gittata e che puoi vedere. Per la durata dell’incantesimo, questi tentacoli trasformano l’area in terreno difficile. Quando una creatura entra nell’area soggetta per la prima volta in un turno o comincia qui il suo turno, la creatura deve superare un tiro salvezza su Destrezza o subire 3d6 danni contundenti e rimanere intralciata dai tentacoli fino al termine dell’incantesimo. Una creatura che inizia il suo turno nell’area ed è già intralciata dai tentacoli, subisce 3d6 danni contundenti. Una creatura intralciata dai tentacoli può usare la sua azione per effettuare una prova di Forza o Destrezza (a sua scelta) contro la CD del tiro salvezza dell’incantesimo. Se la supera, si libera."
            )
        )



        result.add(
            Enchantment(
                "Terremoto",
                "Earthquake",
                8,
                "Invocazione",
                "1 azione",
                "150 metri",
                "V, S, M (un pizzico di terriccio, un pezzo di pietra e un grumo di argilla)",
                "Concentrazione, massimo 1 minuto",
                "Provochi un disturbo sismico in un punto sul terreno a gittata e che puoi vedere. Per la durata, un intenso tremore scuote il terreno in un cerchio di 30 metri di raggio centrato su quel punto e scuote le creature e le strutture in quell’area che sono a contatto del terreno. Il terreno nell’area diventa terreno difficile. Ogni creatura a terra che si sta concentrando deve effettuare un tiro salvezza su Costituzione. Se lo fallisce, la sua concentrazione è infranta. Quando lanci questo incantesimo e alla fine di ogni turno che hai speso a concentrarti su di esso, ogni creatura nell’area che si trovi a terra deve effettuare un tiro salvezza su Destrezza. Se lo fallisce, la creatura cade prona. Questo incantesimo ha effetti aggiuntivi a seconda del tipo di terreno nell’area, a discrezione del GM."
            )
        )



        result.add(
            Enchantment(
                "Terreno Illusorio",
                "Hallucinatory Terrain",
                4,
                "Illusione",
                "10 minuti",
                "90 metri",
                "V, S, M (una pietra, un rametto e un pezzo di pianta verde)",
                "24 ore",
                "Fai sì che un pezzo di terreno naturale a gittata, in un cubo di 45 metri di spigolo, appaia, risuoni e odori come qualche altro tipo di terreno naturale. Di conseguenza, campi aperti o una strada possono essere trasformati in un acquitrino, colline, un crepaccio o qualche altro tipo di terreno difficile o invalicabile. Un laghetto può essere trasformato in una radura erbosa, un precipizio in una lieve pendenza, un burrone cosparso di rocce in una strada ampia e liscia. Le strutture edificate, l’equipaggiamento e le creature all’interno dell’area non mutano d’aspetto. Le peculiarità tattili del terreno sono immutate, così che le creature che entrano nell’area è probabile che svelino l’illusione. Se al contatto la differenza non è ovvia, una creatura che esamina con cautela l’illusione può tentare una prova di Intelligenza (Indagare) contro la CD del tiro salvezza dei tuoi incantesimi per dubitare di essa. Una creatura che riconosca l’illusione per quello che è, la percepisce come una vaga immagine sovrapposta al terreno."
            )
        )



        result.add(
            Enchantment(
                "Tocco Gelido",
                "Chill Touch",
                0,
                "Necromanzia",
                "1 azione",
                "36 metri",
                "V, S",
                "1 round",
                "Crei una scheletrica mano spettrale nello spazio di una creatura a gittata. Effettua un attacco a distanza con incantesimo contro la creatura, per aggredirla con il gelo della morte. Se colpisci, il bersaglio subisce 1d8 danni necrotici, e non può recuperare punti ferita fino all’inizio del tuo prossimo turno. Fino ad allora, la mano resterà serrata sul bersaglio."
            )
        )



        result.add(
            Enchantment(
                "Tocco Vampirico",
                "Vampiric Touch",
                3,
                "Necromanzia",
                "1 azione",
                "Incantatore",
                "V, S",
                "Concentrazione, massimo 1 minuto",
                "Il contatto con la tua mano avvolta dall’ombra può risucchiare la forza vitale altrui per curare le tue ferite. Effettua un attacco in mischia con incantesimo contro una creatura a portata. Se colpisci, il bersaglio subisce 3d6 danni necrotici, e tu recuperi un numero di punti ferita pari alla metà del danno necrotico che hai inflitto. Fino al termine dell’incantesimo, puoi effettuare ogni turno di nuovo questo attacco come tua azione."
            )
        )



        result.add(
            Enchantment(
                "Trama Ipnotica",
                "Hypnotic Pattern",
                3,
                "Illusione",
                "1 azione",
                "36 metri",
                "S, M (un bastoncino luminoso di incenso o una fiala di cristallo piena di materiale fosforescente)",
                "Concentrazione, massimo 1 minuto",
                "Crei a gittata una trama contorta di colori che si muove nell’aria all’interno di un cubo di 9 metri di spigolo. La trama appare per un momento e poi svanisce. Ogni creatura nell’area che veda la trama deve effettuare un tiro salvezza su Saggezza. Se fallisce il tiro salvezza, una creatura rimane affascinata per la durata. Mentre è affascinata da questo incantesimo, la creatura è inabile e ha velocità 0."
            )
        )



        result.add(
            Enchantment(
                "Trasformazione",
                "Shapechange",
                9,
                "Trasmutazione",
                "1 azione",
                "Incantatore",
                "V, S, M (un cerchietto di giada del valore di almeno 1.500 mo, che devi poggiare sulla tua testa prima di lanciare l’incantesimo)",
                "Concentrazione, massimo 1 ora",
                "Per la durata assumi la forma di una creatura differente. La nuova forma può essere quella di qualsiasi creatura il cui grado di sfida sia pari o inferiore al tuo livello. La creatura non può essere un costrutto o un non morto, e devi averla vista almeno una volta. Ti trasformi in un esemplare medio di quella creatura, uno senza livelli di classe o il tratto Incantesimi."
            )
        )



        result.add(
            Enchantment(
                "Traslazione Arborea",
                "Tree Stride",
                5,
                "Evocazione",
                "1 azione",
                "Incantatore",
                "V, S",
                "Concentrazione, massimo 1 minuto",
                "Ottieni la capacità di entrare in un albero e muoverti dal suo interno all’interno di un altro albero della stessa specie entro 150 metri. Entrambi gli alberi devono essere vivi e almeno della tua stessa taglia. Devi usare 1,5 metri di movimento per entrare nell’albero. Apprendi istantaneamente la posizione di tutti gli altri alberi della stessa specie entro 150 metri e, come parte del movimento impiegato per entrare nell’albero, puoi passare in uno degli altri alberi o uscire dall’albero in cui sei entrato. Riappari in un punto a tua scelta entro 1,5 metri dall’albero di destinazione, utilizzando altri 1,5 metri di movimento. Se non ti rimane movimento da usare, riappari entro 1,5 metri dall’albero in cui sei entrato."
            )
        )



        result.add(
            Enchantment(
                "Trasporto Vegetale",
                "Transport via Plants",
                6,
                "Evocazione",
                "1 azione",
                "3 metri",
                "V, S",
                "1 round",
                "Questo incantesimo crea un legame magico tra un vegetale inanimato di taglia Grande o maggiore a gittata e un altro vegetale, a qualsiasi distanza, sullo stesso piano di esistenza. Devi aver visto o essere entrato in contatto almeno una volta con il vegetale di destinazione. Per la durata dell’incantesimo, qualsiasi creatura può entrare nel vegetale bersaglio e uscire dal vegetale di destinazione usando 1,5 metri di movimento."
            )
        )



        result.add(
            Enchantment(
                "Trova Cavalcatura",
                "Find Steed",
                2,
                "Evocazione",
                "10 minuti",
                "9 metri",
                "V, S",
                "Istantanea",
                "Evochi uno spirito che assume la forma di una cavalcatura insolitamente intelligente, forte e leale, stabilendo un legame duraturo con esso. Apparendo in uno spazio a gittata, non occupato, il destriero assume la forma di tua scelta, come quella di un cavallo da guerra, un pony, un cammello, un alce o un mastino (il GM potrebbe darti la possibilità di evocare come destrieri anche altri tipi di animali). Il destriero ha le statistiche della forma scelta, sebbene sia di tipo celestiale, fatato o immondo (a tua scelta) invece del suo normale tipo. Inoltre, se il tuo destriero ha Intelligenza 5 o meno, la sua Intelligenza diventa 6, e ottiene la capacità di comprendere un linguaggio a tua scelta tra quelli che sei in grado di parlare. Il tuo destriero serve da cavalcatura, sia in combattimento che fuori da esso, e possiedi un legame istintivo con esso, che vi permette di combattere come foste un unico insieme. Mentre sei in groppa alla tua cavalcatura, puoi far sì che qualsiasi incantesimo che lanci e che prenda come bersaglio solo te, prenda come bersaglio anche il tuo destriero. Quando il destriero scende a 0 punti ferita, scompare, non lasciandosi dietro alcuna forma fisica. Puoi congedare il destriero in qualsiasi momento con un’azione, facendolo sparire. In entrambi i casi, lanciare di nuovo questo incantesimo evoca lo stesso destriero, ripristinato al massimo dei suoi punti ferita. Mentre il tuo destriero si trova entro 1,5 chilometri da te, puoi comunicare telepaticamente con esso. Non puoi avere più di un destriero legato da questo incantesimo alla volta. Con un’azione, puoi liberare il destriero da questo legame in qualsiasi momento, facendolo sparire."
            )
        )



        result.add(
            Enchantment(
                "Trova Famiglio",
                "Find Familiar",
                1,
                "Evocazione (rituale)",
                "1 ora",
                "3 metri",
                "V, S, M (10 mo di carbone, incenso e erbe che devono essere consumate dal fuoco in un braciere d’ottone)",
                "Istantanea",
                "Ottieni il servizio di un famiglio, uno spirito che assume una forma animale di tua scelta: cavalluccio marino, corvo, donnola, falco, gatto, granchio, gufo, lucertola, pesce (frizzo), piovra, pipistrello, ragno, rana (rospo), ratto o serpente velenoso. Apparendo in uno spazio a gittata, non occupato, il famiglio ha le statistiche della forma scelta, sebbene sia di tipo celestiale, fatato o immondo (a tua scelta) invece di una bestia. Il tuo famiglio agisce in maniera indipendente da te, ma ubbidisce sempre ai tuoi comandi. In combattimento, tira la propria iniziativa e agisce durante il proprio turno. Un famiglio non può attaccare, ma può svolgere le altre azioni come di norma. Quando il famiglio scende a 0 punti ferita, scompare, non lasciandosi dietro alcuna forma fisica. Riappare quando lanci di nuovo questo incantesimo. Mentre il tuo famiglio si trova entro 30 metri da te, puoi comunicare telepaticamente con esso. Inoltre, con un’azione puoi vedere attraverso gli occhi del famiglio e ascoltare quello che sente fino all’inizio del tuo prossimo turno, ottenendo i benefici di qualsiasi senso speciale di cui il famiglio sia in possesso. Durante questo periodo, sei cieco e sordo per quel che concerne i tuoi sensi. Con un’azione, puoi congedare temporaneamente il famiglio. Questo scompare in una dimensione tascabile dove aspetta di essere richiamato. In alternativa, lo puoi congedare per sempre. Con un’azione, mentre è temporaneamente congedato, lo puoi far riapparire in uno spazio non occupato entro 9 metri da te. Non puoi avere più di un famiglio alla volta. Se esegui questo incantesimo mentre hai già un famiglio, fai adottare a quello che hai già una nuova forma. Scegli una delle forme dalla lista precedente. Il tuo famiglio si trasforma nella creatura prescelta. Infine, quando lanci un incantesimo con gittata contatto, il tuo famiglio può trasmettere l’incantesimo come se l’avesse lanciato lui. Il famiglio deve trovarsi entro 30 metri da te, e deve usare la propria reazione per trasmettere l’incantesimo nel momento in cui lo lanci. Se l’incantesimo richiede un tiro per colpire, per questo tiro usi il tuo modificatore di attacco."
            )
        )



        result.add(
            Enchantment(
                "Trucco della Corda",
                "Rope Trick",
                2,
                "Trasmutazione",
                "1 minuto",
                "Contatto",
                "V, S, M (estratto di grano in polvere e un laccio di pergamena)",
                "1 ora",
                "Entri a contatto con un pezzo di corda lungo fino a 18 metri. Un’estremità della corda si leva nell’aria finché la corda non pende perpendicolare al terreno. All’estremità opposta della corda, un’entrata invisibile si apre su di uno spazio extradimensionale che resta fino al termine dell’incantesimo. Lo spazio extradimensionale può essere raggiunto arrampicandosi fino alla cima della corda. Lo spazio può contenere fino a otto creature di taglia Media o inferiore. La corda può essere trascinata nello spazio, facendola sparire dalla vista di chi è fuori di esso. Attacchi e incantesimi non possono attraversare l’ingresso in entrata o uscita dallo spazio extradimensionale, ma chi si trova al suo interno può vedere fuori come se vedesse attraverso una finestra di 1 x 1,5 metri centrata sulla corda."
            )
        )



        result.add(
            Enchantment(
                "Unto",
                "Grease",
                1,
                "Evocazione",
                "1 azione",
                "18 metri",
                "V, S, M (un pezzo di cotenna di maiale o burro)",
                "1 minuto",
                "Grasso scivoloso ricopre il terreno in un quadrato di 3 metri di lato, centrato su di un punto a gittata, e lo trasforma in terreno difficile per la durata dell’incantesimo. Quando compare il grasso, ciascun bersaglio che si trova in piedi nell’area deve superare un tiro salvezza su Destrezza o cadere prono. Una creatura che entra nell’area o termina il suo turno lì, deve superare un tiro salvezza su Destrezza o cadere prona."
            )
        )



        result.add(
            Enchantment(
                "Vedere Invisibilità",
                "See Invisibility",
                2,
                "Divinazione",
                "1 azione",
                "Incantatore",
                "V, S, M (un pizzico di talco e una manciata di polvere d’argento)",
                "1 ora",
                "Per la durata dell’incantesimo, vedi le creature e gli oggetti invisibili come se fossero visibili, e inoltre puoi vedere nel Piano Etereo. Le creature e gli oggetti eterei ti appaiono spettrali e trasparenti."
            )
        )



        result.add(
            Enchantment(
                "Velocità",
                "Haste",
                3,
                "Trasmutazione",
                "1 azione",
                "9 metri",
                "V, S, M (una grattata di radice di liquirizia)",
                "Concentrazione, massimo 1 minuto",
                "Scegli una creatura consenziente a gittata e che puoi vedere. Fino al termine dell’incantesimo, la velocità del bersaglio è raddoppiata, ottiene un bonus di +2 alla CA, ha vantaggio ai tiri salvezza su Destrezza, e ottiene un’azione aggiuntiva durante ciascun suo turno. Quest’azione può essere impiegata solo per effettuare le azioni Attaccare (un solo attacco con un’arma), Disimpegnarsi, Nascondersi, Scattare o Usare un Oggetto. Quando l’incantesimo termina, il bersaglio non può muoversi o effettuare azioni fino al suo prossimo turno, mentre è pervaso da un’improvvisa sonnolenza."
            )
        )



        result.add(
            Enchantment(
                "Vigilanza e Interdizione",
                "Guards and Wards",
                6,
                "Abiurazione",
                "10 minuti",
                "Contatto",
                "V, S, M (incenso bruciato, un piccolo misurino di zolfo e olio, un laccio legato, un piccolo ammontare di sangue di colosso di terra, e una piccola verga d’argento del valore di almeno 10 mo)",
                "24 ore",
                "Crei una interdizione che protegge fino a 225 metri quadri di pavimento (un’area quadrata di 15 metri di lato, o cento quadrati di 1,5 metri di lato o venticinque quadrati di 3 metri di lato). L’area interdetta può essere alta fino a 6 metri, e modellata come preferisci. Puoi interdire diversi piani di una roccaforte dividendo l’area tra di essi, purché tu possa camminare ininterrottamente in ogni area adiacente, mentre lanci l’incantesimo. Quando lanci questo incantesimo, puoi specificare gli individui che ignorano qualcuno o tutti gli effetti di questo incantesimo. Puoi anche specificare una parola d’ordine che, pronunciata ad alta voce, rende chi la proferisce immune a questi effetti. Vigilanza e interdizione crea i seguenti effetti all’interno dell’area interdetta."
            )
        )



        result.add(
            Enchantment(
                "Vincolo di Interdizione",
                "Warding Bond",
                2,
                "Abiurazione",
                "1 azione",
                "Contatto",
                "V, S, M (una coppia di anelli di platino del valore di 50 mo l’uno, che tu e il bersaglio dovete indossare per la durata)",
                "1 ora",
                "Lanci l’incantesimo a contatto di una creatura che vuoi proteggere. Crei una connessione mistica tra di te e il bersaglio fino al termine dell’incantesimo. Finché il bersaglio è entro 18 metri da te, ottiene un bonus di +1 alla CA e ai tiri salvezza e ha resistenza a tutti i danni. Inoltre, ogni volta che il bersaglio subisce danni, tu ne subisci la stessa quantità. L’incantesimo ha fine se scendi a 0 punti ferita o tu e il bersaglio vi allontanate più di 18 metri. Ha fine anche se lo lanci di nuovo sulla stessa creatura su cui è già in atto. Puoi interrompere l’incantesimo con un’azione."
            )
        )



        result.add(
            Enchantment(
                "Visione del Vero",
                "True Sight",
                6,
                "Divinazione",
                "1 azione",
                "Contatto",
                "V, S, M (un unguento per gli occhi che costa 25 mo; fatto di funghi in polvere, zafferano e grasso; viene consumato dall’incantesimo)",
                "1 ora",
                "Lanci l’incantesimo a contatto di una creatura consenziente. Il bersaglio riceve la capacità di vedere le cose come sono realmente. Per la durata dell’incantesimo, la creatura ha visione del vero, nota porte segrete nascoste dalla magia, e può vedere nel Piano Etereo, fino a una gittata di 36 metri."
            )
        )



        result.add(
            Enchantment(
                "Vita Falsata",
                "False Life",
                1,
                "Necromanzia",
                "1 azione",
                "Incantatore",
                "V, S, M (un piccolo ammontare di alcool o spirito distillato)",
                "1 ora",
                "Potenziandoti con una parvenza necromantica di vitalità, ottieni 1d4 + 4 punti ferita temporanei per la durata."
            )
        )



        result.add(
            Enchantment(
                "Vuoto Mentale",
                "Mind Blank",
                8,
                "Abiurazione",
                "1 azione",
                "Contatto",
                "V, S",
                "24 ore",
                "Fino al termine dell’incantesimo, una creatura consenziente con cui sei in contatto durante il lancio è immune al danno psichico, qualsiasi effetto che ne percepirebbe le emozioni o leggerebbe i pensieri, incantesimi di divinazione e la condizione affascinato. L’incantesimo nega anche gli incantesimi desiderio e altri incantesimi o effetti di simili potenza impiegati per influenzare la mente del bersaglio o per ottenere informazioni su di esso."
            )
        )



        result.add(
            Enchantment(
                "Volare",
                "Fly",
                3,
                "Trasmutazione",
                "1 azione",
                "Contatto",
                "V, S, M (una piuma dell’ala di qualsiasi volatile)",
                "Concentrazione, massimo 10 minuti",
                "Lanci l’incantesimo a contatto di una creatura consenziente. Per la durata dell’incantesimo, il bersaglio ottiene velocità di volo 18 metri. Quando l’incantesimo ha fine, qualora sia ancora in aria, il bersaglio cade, a meno che non riesca a frenare la discesa."
            )
        )



        result.add(
            Enchantment(
                "Zona di Verità",
                "Zone of Truth",
                2,
                "Ammaliamento",
                "1 azione",
                "18 metri",
                "V, S",
                "10 minuti",
                "Crei una zona magica che protegge contro i raggiri in una sfera di 4,5 metri di raggio centrata su di un punto a gittata di tua scelta. Fino al termine dell’incantesimo, una creatura che entra nell’area dell’incantesimo per la prima volta durante un turno, o inizia il suo turno al suo interno, deve effettuare un tiro salvezza su Carisma. Se fallisce il tiro salvezza, la creatura non può pronunciare bugie deliberatamente mentre è nel raggiodell’incantesimo. Sei a conoscenza se una creatura ha superato o fallito il tiro salvezza. Una creatura soggetta all’incantesimo ne è consapevole e può quindi evitare di rispondere a domande a cui risponderebbe normalmente con una bugia. Questa creatura può dare risposte elusive purché rimanga entro i confini della verità."
            )
        )



        result.add(
            Enchantment(
                "Scopri il Percorso",
                "Find the Path",
                6,
                "Divinazione",
                "1 minuto",
                "Incantatore",
                "V, S, M (degli attrezzi da divinazione – dei bastoncini d’avorio, ossa, carte, denti o rune incise – del valore di almeno 100 mo e un oggetto dal luogo che desideri trovare)",
                "Concentrazione, massimo 1 giorno",
                "Questo incantesimo ti permette di trovare la rotta fisica più breve e diretta verso uno specifico luogo fisso con cui hai familiarità ed è sullo stesso piano di esistenza. Se indichi una destinazione su di un altro piano di esistenza, una destinazione che si muove (come una fortezza mobile) o una destinazione non specifica (come “la tana di un drago verde”), l’incantesimo fallisce. Per la durata dell’incantesimo, finché sei nello stesso piano di esistenza della destinazione, saprai quanto è distante e in che direzione si trovi. Mentre sei in viaggio verso di essa, ogni volta che ti si presenterà la possibilità di scegliere tra percorsi diversi, determinerai automaticamente qual è la via più breve e la rotta più diretta (ma non necessariamente la più sicura) per raggiungere la destinazione."
            )
        )



        result.add(
            Enchantment(
                "Immagine Proiettata",
                "Project Image",
                7,
                "Illusione",
                "1 azione",
                "750 chilometri",
                "V, S, M (una tua piccola riproduzione fatta di materiali del valore almeno di 5 mo)",
                "Concentrazione, massimo 1 giorno",
                "Crei una copia illusoria di te stesso che permane per la durata. La copia può apparire in qualsiasi luogo entro la gittata che tu abbia già visto, ignorando qualsiasi ostacolo frapposto. L’illusione riproduce il tuo aspetto e i tuoi rumori ma è intangibile. Se l’illusione subisce danni, scompare, e l’incantesimo ha termine."
            )
        )




        return result
    }

}