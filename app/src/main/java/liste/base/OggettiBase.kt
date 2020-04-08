package liste.base

import sqlite.Item

class OggettiBase {

    constructor(){

    }

    fun getOggettiBase(): List<Item> {
        var result : MutableList<Item> = mutableListOf()

        //WEAPONS --------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
        result.add(Item("Spada di legno", "Spada di legno semplice", "weapon", 0, "Common"))
        result.add(Item("Ascia", "Da lancio (gittata 6/18), leggera", "weapon", 0, "Common"))
        result.add(Item("Bastone da combattimento", "Versatile", "weapon", 0, "Common"))
        result.add(Item("Falcetto", "Leggera", "weapon", 0, "Common"))
        result.add(Item("Giavellotto", "Da lancio (gittata 9/36)", "weapon", 0, "Common"))
        result.add(Item("Lancia", "Da lancio (gittata 6/18), versatile", "weapon", 0, "Common"))
        result.add(Item("Martello leggero", "Da lancio (gittata 6/18), leggera", "weapon", 0, "Common"))
        result.add(Item("Mazza", " - ", "weapon", 0, "Common"))
        result.add(Item("Pugnale", "Da lancio (gittata 6/18), leggera, precisione ", "weapon", 0, "Common"))
        result.add(Item("Randello", "Leggera", "weapon", 0, "Common"))
        result.add(Item("Randello pesante", "A due mani", "weapon", 0, "Common"))
        result.add(Item("Arco corto", "A due mani, munizioni (gittata 24/96)", "weapon", 0, "Common"))
        result.add(Item("Balestra leggera", "Ricarica, a due mani, munizioni (gittata 24/96)", "weapon", 0, "Common"))
        result.add(Item("Dardo", "Da lancio (gittata 9/36), precisione", "weapon", 0, "Common"))
        result.add(Item("Fionda", "Munizioni (gittata 9/36)", "weapon", 0, "Common"))
        result.add(Item("Alabarda", "A due mani, portata, pesante", "weapon", 0, "Common"))
        result.add(Item("Ascia da battaglia", "Versatile", "weapon", 0, "Common"))
        result.add(Item("Ascia bipenne", "A due mani, pesante", "weapon", 0, "Common"))
        result.add(Item("Falcione", "A due mani, portata, pesante", "weapon", 0, "Common"))
        result.add(Item("Frusta", "Portata, precisione", "weapon", 0, "Common"))
        result.add(Item("Lancia da cavaliere", "Portata, speciale", "weapon", 0, "Common"))
        result.add(Item("Maglio", "A due mani, pesante", "weapon", 0, "Common"))
        result.add(Item("Martello da guerra", "Versatile", "weapon", 0, "Common"))
        result.add(Item("Mazzafrusto", " - ", "weapon", 0, "Common"))
        result.add(Item("Morning star", " - ", "weapon", 0, "Common"))
        result.add(Item("Picca", "A due mani, pesante, portata", "weapon", 0, "Common"))
        result.add(Item("Piccone da guerra", " - ", "weapon", 0, "Common"))
        result.add(Item("Scimitarra", "Leggera, precisione", "weapon", 0, "Common"))
        result.add(Item("Spada corta", "Leggera, precisione", "weapon", 0, "Common"))
        result.add(Item("Spada lunga", "Versatile", "weapon", 0, "Common"))
        result.add(Item("Spadone", "A due mani, pesante", "weapon", 0, "Common"))
        result.add(Item("Stocco", "Precisione", "weapon", 0, "Common"))
        result.add(Item("Tridente", "Da lancio (gittata 6/18), versatile", "weapon", 0, "Common"))
        result.add(Item("Arco lungo", "A due mani, pesante, munizioni (gittata 45/180)", "weapon", 0, "Common"))
        result.add(Item("Balestra pesante", "Ricarica, due mani, munizioni (gittata 30/120), pesante", "weapon", 0, "Common"))
        result.add(Item("Balestra a mano", "Ricarica, leggera, munizioni (gittata 9/36)", "weapon", 0, "Common"))
        result.add(Item("Cerbottana", "Ricarica, munizioni (gittata 7,5/30)", "weapon", 0, "Common"))
        result.add(Item("Rete", "Da lancio (gittata 1,5/4,5), speciale", "weapon", 0, "Common"))

        //ARMORS ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
        result.add(Item("Armatura imbottita", "Le armature imbottite consistono di strati" +
                " di tessuto e imbottitura cuciti insieme", "armor", 0, "Common"))
        result.add(Item("Armatura di Cuoio", "Il corpetto e le protezioni delle " +
                "spalle di questa armatura sono fatte di cuoio indurito dopo essere stato bollito " +
                "nell’olio. Il resto dell’armatura è composto di materiali più morbidi" +
                " e flessibili", "armor", 0, "Common"))
        result.add(Item("Armatura di Cuoio Borchiato", "Fatta di cuoio duro" +
                " ma flessibile, l’armatura di cuoio borchiato è rinforzata da rivetti" +
                " o spuntoni", "armor", 0, "Common"))
        result.add(Item("Armatura di Pelle", "Un’armatura rozza composta " +
                "di pelle e folta pelliccia. È indossata normalmente da tribù barbariche, umanoidi " +
                "malvagi e altre popolazioni che non hanno accesso agli attrezzi e i materiali per " +
                "costruire armature migliori", "armor", 0, "Common"))
        result.add(Item("Giaco di maglia", "Composto di anelli metallici intrecciati " +
                "tra di loro, un giaco di maglia viene indossato sopra " +
                "strati di abiti o cuoio. Questo tipo di armatura offre una " +
                "protezione modesta alla parte superiore del corpo, " +
                "mentre il rumore degli anelli che strusciano fra di loro " +
                "viene attutito dagli altri strati", "armor", 0, "Common"))
        result.add(Item("Armatura a scaglie", "Quest’armatura consiste in una cotta e " +
                "gambali (a volte anche di una gonna separata) di cuoio " +
                "coperti da pezzi di metallo sovrapposti, in maniera simile alle scaglie di un pesce. L’armatura è completa di " +
                "guant", "armor", 0, "Common"))
        result.add(Item("Corazza a Piastre", "Questa armatura consiste di un " +
                "corpetto di metallo indossato su di uno strato di cuoio. " +
                "Sebbene lasci braccia e gambe relativamente scoperte, " +
                "l’armatura fornisce una buona protezione agli organi " +
                "vitali del personaggio, senza procurargli grande " +
                "ingombro", "armor", 0, "Common"))
        result.add(Item("Corazza mezza a Piastre", "La mezza armatura di piastre " +
                "consiste di piastre di metallo sagomate che coprono " +
                "gran parte del corpo del personaggio. Non comprende " +
                "protezioni per le gambe oltre a dei semplici schinieri " +
                "legati con lacci di cuoio", "armor", 0, "Common"))
        result.add(Item("Armatura ad Anelli", "Quest’armatura è un’armatura di cuoio con dei " +
                "pesanti anelli cuciti sopra. Gli anelli servono a rinforzare " +
                "l’armatura contro i colpi di spada e d’ascia. L’armatura " +
                "di anelli è inferiore alla cotta di maglia, e viene di solito " +
                "indossata solo da chi non si può permettere di meglio", "armor", 0, "Common"))
        result.add(Item("Cotta di Maglia", "Fatta di anelli di metallo intrecciati fra " +
                "di loro, la cotta di maglia comprende uno strato di " +
                "tessuto cucito sotto una maglia di metallo per impedire " +
                "graffi e assorbire l’impatto dei colpi. L’armatura è " +
                "completa di guanti", "armor", 0, "Common"))
        result.add(Item("Armatura a Strisce", "L’armatura è fatta di strette strisce verticali di " +
                "metallo rivettate a un sostegno di cuoio indossato sopra " +
                "un’imbottitura di tessuto. Un’armatura di maglia " +
                "metallica flessibile protegge le giunture", "armor", 0, "Common"))
        result.add(Item("Armatura Completa a Piastre", "Quest’armatura consiste di piastre " +
                "di metallo sagomate a incastro che coprono l’intero " +
                "corpo. Un’armatura di piastre comprende guanti, stivali " +
                "di cuoio pesanti, un elmo con visiera, e uno spesso " +
                "strato di imbottitura sotto l’armatura. Fibbie e lacci " +
                "distribuiscono il peso dell’armatura su tutto il corpo", "armor", 0, "Common"))

        //ADVENTURE ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

        result.add(Item("Antitossina", "Una creatura che beve da questa fiala di " +
                "liquido ottiene vantaggio sui tiri salvezza contro il " +
                "veleno per 1 ora. Non conferisce alcun bonus ai non " +
                "morti e ai costrutti", "adventure", 0, "Common"))
        result.add(Item("Ariete Portatile", "Puoi usare un ariete portatile per " +
                "abbattere le porte. Nel farlo, ottieni un bonus di +4 alle " +
                "prove di Forza. Un altro personaggio può aiutarti con " +
                "l’uso dell’ariete, dandoti vantaggio sulla prova", "adventure", 0, "Common"))
        result.add(Item("Attrezzatura da Pesca", "Questo kit comprende un’asta " +
                "di legno, filo di seta, taglierino di legno, ami d’acciaio, " +
                "peso di piombo, esche di velluto e un retino", "adventure", 0, "Common"))
        result.add(Item("Biglie di Metallo", "Con un’azione, puoi spargere una " +
                "singola borsa di queste minuscole biglie di metallo per " +
                "coprire un’area piana quadrata di 3 metri di lato. Una " +
                "creatura che attraversa l’area coperta deve superare un " +
                "tiro salvezza su Destrezza con CD 10 o cadere prona. " +
                "Una creatura che attraversa l’area a metà velocità non " +
                "deve effettuare il tiro salvezza.", "adventure", 0, "Common"))
        result.add(Item("Bilancia da Mercante", "Una bilancia da mercante " +
                "include un piccolo bilanciere, un piatto, e un " +
                "assortimento di pesi fino a 1 chilo. Con essa, puoi " +
                "misurare il peso esatto di piccoli oggetti, come metalli " +
                "preziosi o merci, per aiutarti a determinarne il valore.", "adventure", 0, "Common"))
        result.add(Item("Borsa dei Componenti", " Una borsa dei componenti è " +
                "un piccolo borsello da cinta di cuoio impermeabile " +
                "munito di compartimenti contenenti tutte le componenti " +
                "materiali e altri oggetti speciali di cui hai bisogno per " +
                "lanciare i tuoi incantesimi, eccetto per quelle " +
                "componenti che hanno un costo specifico (come " +
                "indicato nella descrizione dell’incantesimo).", "adventure", 0, "Common"))
        result.add(Item("Borsello", "Un borsello di tessuto o cuoio può contenere, " +
                "tra le altre cose, fino a 20 proiettili da fionda o 50 aghi " +
                "da cerbottana. Un borsello diviso in compartimenti per " +
                "contenere componenti per incantesimi viene detto " +
                "borsa dei componenti.", "adventure", 0, "Common"))
        result.add(Item("Candela", "Per 1 ora, una candela proietta luce intensa " +
                "in un raggio di 1,5 metri e luce fioca per ulteriori 1,5 " +
                "metri.", "adventure", 0, "Common"))
        result.add(Item("Cannocchiale", "Gli oggetti osservati tramite un " +
                "cannocchiale sono ingranditi al doppio delle loro " +
                "dimensioni.", "adventure", 0, "Common"))
        result.add(Item("Carrucola e Paranco", "Una serie di leve collegate da " +
                "un cavo e un gancio per attaccarsi ad oggetti, carrucola " +
                "e paranco ti permettono di tirare su fino a quattro volte il " +
                "peso che puoi normalmente sollevare.", "adventure", 0, "Common"))
        result.add(Item("Catena", "Una catena ha 10 punti ferita. Può essere " +
                "spezzata superando una prova di Forza con CD 20.", "adventure", 0, "Common"))
        result.add(Item("Corda", "Una corda, che sia fatta di canapa o seta, ha 2 " +
                "punti ferita e può essere spezzata superando una prova " +
                "di Forza con CD 17.", "adventure", 0, "Common"))
        result.add(Item("Faretra", "Una faretra può contenere fino a 20 frecce.", "adventure", 0, "Common"))
        result.add(Item("Focus Arcano", "Un focus arcano è un oggetto speciale " +
                "(una sfera, un cristallo, una verga, un bastone " +
                "appositamente costruito, un pezzo di legno della " +
                "lunghezza di una bacchetta, o simile oggetto) progettato " +
                "per incanalare il potere degli incantesimi arcani. Un " +
                "warlock, stregone o mago può usare un simile oggetto " +
                "come focus di incantamento, come descritto in “Lanciare " +
                "Incantesimi”.", "adventure", 0, "Common"))
        result.add(Item("Focus Druidico", "Un focus druidico è un rametto di " +
                "vischio o agrifoglio, una bacchetta o uno scettro di " +
                "tasso o altro legno speciale, un bastone estratto integro " +
                "da un albero vivente, o un piccolo totem che incorpora " +
                "piume, pelo, ossa e denti di animali sacri. Un druido " +
                "può usare questo oggetto come focus per lanciare " +
                "incantesimi, come descritto in “Lanciare Incantesimi”.", "adventure", 0, "Common"))
        result.add(Item("Fuoco dell’Alchimista", "Questo fluido appiccicoso si " +
                "incendia quando entra a contatto con l’aria. Con " +
                "un’azione, puoi lanciare questa ampolla fino a 6 metri, " +
                "fracassandola all’impatto. Effettua un tiro per colpire a " +
                "distanza contro la creatura o l’oggetto, trattando il fuoco " +
                "dell’alchimista come un’arma improvvisata. Se colpisci, " +
                "il bersaglio subisce 1d4 danni da fuoco all’inizio di " +
                "ciascun suo turno. Una creatura può porre fine a questi " +
                "danni spendendo un’azione e superando una prova di " +
                "Destrezza con CD 10. Se la prova riesce le fiamme si " +
                "estinguono.", "adventure", 0, "Common"))
        result.add(Item("Kit da Guaritore", "Questo kit è una borsa di cuoio " +
                "contenente bende, unguenti e stecche. Il kit può essere " +
                "usato dieci volte. Con un’azione, puoi spendere un uso " +
                "del tuo kit per stabilizzare una creatura a 0 punti ferita, " +
                "senza dover effettuare una prova di Saggezza " +
                "(Medicina).", "adventure", 0, "Common"))
        result.add(Item("Kit da Pranzo", " Questa piccola scatola di latta contiene " +
                "una ciotola e delle semplici posate. Le due parti della " +
                "scatola possono essere staccate, e un lato impiegato " +
                "come pentola per cucinare e l’altro come piatto o " +
                "contenitore", "adventure", 0, "Common"))
        result.add(Item("Kit da Scalatore", "Un kit da scalatore comprende chiodi " +
                "speciali, punte per stivali, guanti e un’imbracatura. Puoi " +
                "ancorarti usando il kit da scalatore con un’azione; " +
                "quando lo fai, non puoi cadere per più di 7,5 metri dal " +
                "punto in cui ti sei ancorato, e non puoi arrampicarti a " +
                "più di 7,5 metri di distanza dal punto a cui ti sei " +
                "ancorato senza prima disfare l’ancora.", "adventure", 0, "Common"))
        result.add(Item("Lampada", "Una lampada proietta luce intensa in un " +
                "raggio di 4,5 metri e luce fioca per ulteriori 9 metri. Una " +
                "volta accesa, brucia per 6 ore con un’ampolla (0,5 litri) " +
                "d’olio.", "adventure", 0, "Common"))
        result.add(Item("Lanterna a Lente Sporgente", " Una lanterna a lente " +
                "sporgente proietta luce intensa in un cono di 18 metri e " +
                "luce fioca per ulteriori 18 metri. Una volta accesa, " +
                "brucia per 6 ore con un’ampolla (0,5 litri) d’olio.", "adventure", 0, "Common"))
        result.add(Item("Lanterna Schermabile", " Una lanterna schermabile " +
                "proietta luce intensa in un raggio di 9 metri e luce fioca " +
                "per ulteriori 9 metri. Una volta accesa, brucia per 6 ore " +
                "con un’ampolla (0,5 litri) d’olio. Con un’azione, puoi " +
                "abbassare la schermatura, riducendo la luce a fioca " +
                "con un raggio di 1,5 metri", "adventure", 0, "Common"))
        result.add(Item("Lanterna Schermabile", "Una lanterna schermabile " +
                "proietta luce intensa in un raggio di 9 metri e luce fioca " +
                "per ulteriori 9 metri. Una volta accesa, brucia per 6 ore " +
                "con un’ampolla (0,5 litri) d’olio. Con un’azione, puoi " +
                "abbassare la schermatura, riducendo la luce a fioca " +
                "con un raggio di 1,5 metri", "adventure", 0, "Common"))
        result.add(Item("Lente Ingranditrice", "Questa lente permette di dare " +
                "un’occhiata più ravvicinata agli oggetti piccoli. È anche " +
                "un utile sostituto per pietra focaia e acciarino " +
                "nell’accendere un fuoco. Appiccare un fuoco con la " +
                "lente ingranditrice richiede almeno una luce di intensità " +
                "pari a quella solare, legna da accendere, e circa 5 " +
                "minuti di tempo perché il legno prenda fuoco. Una lente " +
                "ingranditrice fornisce vantaggio in qualsiasi prova " +
                "effettuata per valutare o analizzare un oggetto piccolo o " +
                "molto dettagliato.", "adventure", 0, "Common"))
        result.add(Item("Libro", "Un libro può contenere poesie, resoconti storici, " +
                "informazioni pertinenti a uno specifico campo del " +
                "sapere, diagrammi e note su congegni gnomeschi, o " +
                "qualsiasi altra cosa possa essere rappresentata usando " +
                "testo e disegni. Un libro contenente incantesimi viene " +
                "detto libro degli incantesimi", "adventure", 0, "Common"))
        result.add(Item("Libro degli Incantesimi", "Essenziale per i maghi, un " +
                "libro degli incantesimi è un tomo rilegato in pelle con " +
                "100 pagine di vello bianche adatte a registrare gli " +
                "incantesimi. ", "adventure", 0, "Common"))
        result.add(Item("Manette", "Questi strumenti di metallo possono " +
                "imprigionare una creatura Piccola o Media. Per liberarsi " +
                "dalle manette bisogna superare una prova di Destrezza " +
                "con CD 20. Per romperle bisogna superare una prova " +
                "di Forza con CD 20. Ogni set di manette è fornito di una " +
                "chiave. Senza la chiave, una creatura competente con " +
                "gli attrezzi da ladro può scassinare la serratura delle " +
                "manette superando una prova di Destrezza con CD 15. " +
                "Le manette hanno 15 punti ferita.", "adventure", 0, "Common"))
        result.add(Item("Olio", "Di solito si compra in un’ampolla d’argilla che " +
                "contiene 0,5 litri. Con un’azione, puoi spargere l’olio inn " +
                "questa ampolla su di una creatura entro 1,5 metri da te " +
                "o lanciarla fino a 6 metri, fracassandola all’impatto. In " +
                "entrambi i casi, effettua un tiro per colpire a distanza " +
                "contro la creatura o l’oggetto, trattando l’olio come " +
                "un’arma improvvisata. Se colpisci, il bersaglio è " +
                "ricoperto d’olio. Se il bersaglio subisse qualsiasi entità " +
                "di danno da fuoco prima che l’olio si asciughi (dopo 1 " +
                "minuto), il bersaglio subisce altri 5 danni da fuoco " +
                "dall’olio infiammato. Puoi anche versare un’ampolla " +
                "d’olio sul pavimento per coprire un quadrato di 1,5 metri " +
                "di lato, purché la superficie sia piana. Se infiammato, " +
                "l’olio brucia per 2 round e infligge 5 danni da fuoco a " +
                "qualsiasi creatura che entri nell’area o termini il suo " +
                "turno dentro di essa. Una creatura può subire questo " +
                "danno solo una volta per turno", "adventure", 0, "Common"))
        result.add(Item("Piede di Porco", "Utilizzare un piede di porco dà " +
                "vantaggio alle prove di Forza ogni volta si possa " +
                "applicare la leva del piede di porco.", "adventure", 0, "Common")) //------
        result.add(Item("Pozione di Guarigione", " Un personaggio che beva il " +
                "magico fluido rosso contenuto in questa fiala recupera " +
                "2d4+2 punti ferita. Bere o somministrare la pozione " +
                "richiede un’azione.", "adventure", 0, "Common"))
        result.add(Item("Razioni", "Le razioni consistono di cibo secco adatto a " +
                "lunghi viaggi, e includono carne secca, frutta secca, " +
                "gallette e noci.", "adventure", 0, "Common"))
        result.add(Item("Scatola con l’Esca", " Questo piccolo contenitore " +
                "contiene pietra, acciarino ed esca (di solito uno straccio " +
                "secco imbevuto d’olio) impiegati per appiccare un " +
                "fuoco. Utilizzarlo per accendere una torcia (o qualsiasi " +
                "altro oggetto facilmente incendiabile) richiede " +
                "un’azione. Accendere qualsiasi altro fuoco richiede 1 " +
                "minuto", "adventure", 0, "Common"))
        result.add(Item("Scatola per Mappe o Pergamene", "Questa scatola " +
                "cilindrica di cuoio può contenere, arrotolati, fino a dieci " +
                "pezzi di carta o cinque fogli di pergamena.", "adventure", 0, "Common"))
        result.add(Item("Scatola per Quadrelli da Balestra", "Questa scatola di " +
                "legno contiene fino a venti quadrelli per balestra.", "adventure", 0, "Common"))
        result.add(Item("Serratura", " Insieme alla serratura viene fornita una " +
                "chiave. Senza la chiave, una creatura competente con " +
                "gli attrezzi da ladro può scassinare questa serratura " +
                "superando una prova di Destrezza con CD 15. Il GM " +
                "può decidere che per cifre maggiori sono disponibili " +
                "serrature di qualità migliore", "adventure", 0, "Common"))
        result.add(Item("Simbolo Sacro", " Un simbolo sacro è la raffigurazione di " +
                "un dio o pantheon. Potrebbe essere un amuleto che " +
                "raffigura il simbolo di una divinità, lo stesso simbolo " +
                "accuratamente inciso o intrecciato su di un emblema o " +
                "scudo, o una minuscola scatola contenente una reliquia " +
                "sacra. Vedi l’appendice per alcune divinità e pantheon " +
                "di esempio. Un chierico o paladino può usare un " +
                "simbolo sacro come focus per lanciare incantesimi, " +
                "come descritto in “Lanciare Incantesimi”. Per usare il " +
                "simbolo in questo modo, l’incantatore deve tenerlo in " +
                "mano, indossarlo visibilmente o portarlo raffigurato su " +
                "di uno scudo.", "adventure", 0, "Common"))
        result.add(Item("Tenda", " Un semplice riparo portabile di tela, una tenda " +
                "può contenere due persone", "adventure", 0, "Common"))
        result.add(Item("Torcia", "Una torcia brucia per 1 ora, fornendo luce " +
                "intensa in un raggio di 6 metri e luce fioca per ulteriori 6 " +
                "metri. Se effettui un tiro per colpire con una torcia " +
                "accesa e colpisci, infliggi 1 danno da fuoco aggiuntivo.", "adventure", 0, "Common"))
        result.add(Item("Trappola da Caccia", "Usi un’azione per disporre questa " +
                "trappola, formata da un anello d’acciaio seghettato, che " +
                "scatta quando una creatura calpesta la piastra metallica " +
                "al centro di essa. La trappola è fissata tramite una " +
                "catena pesante a un oggetto immobile, come un albero " +
                "o uno spuntone conficcato nel terreno. Una creatura " +
                "che calpesti la piastra deve superare un tiro salvezza " +
                "su Destrezza con CD 13 o subire 1d4 danni perforanti e " +
                "interrompere il movimento. Dopodiché, finché la " +
                "creatura non si libera dalla trappola, il suo movimento è " +
                "limitato dalla lunghezza della catena (lunga di solito 90 " +
                "centimetri). Una creatura può usare la usa azione per " +
                "superare una prova di Forza con CD 13, e se la riesce " +
                "si libera o libera un’altra creatura a portata. Ogni " +
                "tentativo fallito infligge 1 danno perforante alla creatura " +
                "intrappolata", "adventure", 0, "Common"))
        result.add(Item("Tribolo", "Con un’azione, puoi spargere una singola " +
                "borsa di questi minuscoli triboli per coprire un’area " +
                "quadrata di 1,5 metri di lato. Una creatura che " +
                "attraversa l’area coperta deve superare un tiro salvezza " +
                "su Destrezza con CD 15 o subire 1 danno perforante. " +
                "Finché la creatura non recupera almeno 1 punto ferita, " +
                "la sua velocità a piedi è diminuita di 3 metri. Una " +
                "creatura che attraversa l’area a metà velocità non deve " +
                "effettuare il tiro salvezza", "adventure", 0, "Common"))
        result.add(Item("Veleno Base", "Puoi usare il veleno in questa fiala per " +
                "coprire un’arma tagliente o perforante o fino a tre pezzi " +
                "di munizioni. Applicare il veleno necessita un’azione. " +
                "Una creatura colpita da un’arma o munizione " +
                "avvelenata deve superare un tiro salvezza su " +
                "Costituzione con CD 10 o subire 1d4 danni da veleno. " +
                "Una volta applicato, il veleno mantiene la sua efficacia " +
                "per 1 minuto prima di seccarsi.", "adventure", 0, "Common"))
        //TOOLS -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
        result.add(Item("Attrezzi da Artigiano", "Questi attrezzi speciali " +
                "comprendono gli oggetti necessari a condurre " +
                "un’attività. La tabella mostra degli esempi degli attrezzi " +
                "più comuni, ognuno dei quali fornisce oggetti legati a " +
                "una singola attività. La competenza con un set di " +
                "attrezzi da artigiano ti permette di sommare il tuo bonus " +
                "di competenza a qualsiasi prova di caratteristica " +
                "effettuata usando quegli attrezzi nella tua attività. Ogni " +
                "tipo di attrezzi da artigiano richiede una competenza " +
                "separata", "adventure", 0, "Common"))
        result.add(Item("Attrezzi da Navigatore", "Questo set di strumenti viene " +
                "usato per la navigazione in mare. La competenza con " +
                "gli attrezzi da navigatore ti permette di progettare il " +
                "tragitto di una nave e seguire le carte di navigazione. " +
                "Inoltre, questi attrezzi ti permettono di sommare il tuo " +
                "bonus di competenza a qualsiasi prova di caratteristica " +
                "effettuata per evitare di perderti in mare.", "adventure", 0, "Common"))
        result.add(Item("Attrezzi da Scasso", "Questo set di attrezzi comprende " +
                "una piccola lima, un set di grimaldelli, un piccolo " +
                "specchio montato su di una maniglia, un set di forbici " +
                "dalla lama sottile, e un paio di pinze. La competenza " +
                "con questi attrezzi ti permette di sommare il tuo bonus " +
                "di competenza a qualsiasi prova di caratteristica " +
                "effettuata per disarmare trappole o aprire serrature.", "adventure", 0, "Common"))
        result.add(Item("Kit da Avvelenatore", " Un kit da avvelenatore " +
                "comprende fiale, prodotti chimici e altro " +
                "equipaggiamento necessario alla creazione di veleni. " +
                "La competenza con questo kit ti permette di sommare il " +
                "tuo bonus di competenza a qualsiasi prova di " +
                "caratteristica effettuata per produrre o impiegare veleni.", "adventure", 0, "Common"))
        result.add(Item("Kit da Erborista", "Questo kit contiene diversi strumenti " +
                "come forbici, mortaio e pestello, e borselli e fiale usati " +
                "dagli erboristi per creare rimedi e pozioni. La " +
                "competenza con questo kit ti permette di sommare il " +
                "tuo bonus di competenza a qualsiasi prova di " +
                "caratteristica effettuata per identificare o applicare erbe. " +
                "Inoltre, la competenza con questo kit è necessaria per " +
                "creare antitossine e pozioni di guarigione.", "adventure", 0, "Common"))
        result.add(Item("Kit da Falsario", "Questa piccola scatola contiene diversi " +
                "pezzi di carta e pergamena, penne e inchiostri, sigilli e " +
                "ceralacca, foglie d’oro e d’argento, e altre risorse " +
                "necessarie per creare dei falsi convincenti di documenti " +
                "fisici. La competenza con questo kit ti permette di " +
                "sommare il tuo bonus di competenza alle prove di " +
                "caratteristica effettuate per falsificare un documento " +
                "fisico", "adventure", 0, "Common"))
        result.add(Item("Kit da Truccatore", " Questo borsello contiene trucchi, " +
                "tinte per i capelli e piccole protesi per farti creare dei " +
                "camuffamenti che modifichino il tuo aspetto fisico. La " +
                "competenza con questo kit ti permette di sommare il " +
                "tuo bonus di competenza a qualsiasi prova di " +
                "caratteristica effettuata per creare un camuffamento " +
                "visivo", "adventure", 0, "Common"))
        result.add(Item("Set da Gioco", "Questo oggetto include un’ampia serie " +
                "di strumenti di gioco, compresi dadi e mazzi di carte. " +
                "Alcuni esempi comuni compaiono sulla tabella Attrezzi, " +
                "ma esistono anche altri set da gioco non elencati. Se " +
                "sei competente con un set da gioco, puoi sommare il " +
                "tuo bonus di competenza alle prove di caratteristica " +
                "effettuate per giocare una partita con quel set. Ogni tipo " +
                "di set da gioco richiede una competenza separata.", "adventure", 0, "Common"))
        result.add(Item("Strumento Musicale", " Sulla tabella sono mostrati alcuni " +
                "dei più comuni esempi di strumenti musicali. Se hai la " +
                "competenza con uno specifico strumento musicale, " +
                "puoi sommare il tuo bonus di competenza a qualsiasi " +
                "prova di caratteristica effettuata per suonare musica " +
                "con quello strumento. Ogni tipo di strumento musicale " +
                "richiede una competenza separata.", "adventure", 0, "Common"))

        return result
    }
}
