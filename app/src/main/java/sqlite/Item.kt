package sqlite

class Item {
    var id: Int = 0;
    var name: String? = null
    var description: String? = null
    var category: String? = null;
    var idVirtualTable: Int = -1;
    var rarity: String? = null
    // manca price

    constructor(){}

    constructor(
        id: Int,
        name: String?,
        description: String?,
        category: String?,
        idVirtualTable: Int,
        rarity: String?
    ) {
        this.id = id
        this.name = name
        this.description = description
        this.category = category
        this.idVirtualTable = idVirtualTable
        this.rarity = rarity
    }

    constructor(name: String?, description: String?, category: String?, idVirtualTable: Int, rarity: String?) {
        this.name = name
        this.description = description
        this.category = category
        this.idVirtualTable = idVirtualTable
        this.rarity = rarity
    }

    fun equalsAttributues(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Item

        if (name != other.name) return false
        if (description != other.description) return false
        if (category != other.category) return false
        if (idVirtualTable != other.idVirtualTable) return false
        if (rarity != other.rarity) return false

        return true
    }



}