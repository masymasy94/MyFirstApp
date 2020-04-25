package sqlite

class Enchantment {
    var id: Int = 0;
    var italianName: String? = null
    var englishName: String? = null
    var level: Int? = null
    var classOfMagic: String? = null;
    var castingTime: String? = null;
    var range : String? = null
    var components : String? = null
    var duration : String? = null
    var description: String? = null

    constructor(){}

    constructor(
        id: Int,
        italianName: String?,
        englishName: String?,
        level: Int?,
        classOfMagic: String?,
        castingTime: String?,
        range: String?,
        components: String?,
        duration: String?,
        description: String?
    ) {
        this.id = id
        this.italianName = italianName
        this.englishName = englishName
        this.level = level
        this.classOfMagic = classOfMagic
        this.castingTime = castingTime
        this.range = range
        this.components = components
        this.duration = duration
        this.description = description
    }

    constructor(
        italianName: String?,
        englishName: String?,
        level: Int?,
        classOfMagic: String?,
        castingTime: String?,
        range: String?,
        components: String?,
        duration: String?,
        description: String?
    ) {
        this.italianName = italianName
        this.englishName = englishName
        this.level = level
        this.classOfMagic = classOfMagic
        this.castingTime = castingTime
        this.range = range
        this.components = components
        this.duration = duration
        this.description = description
    }

    fun equalsAttributues(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Enchantment

        if (italianName != other.italianName) return false
        if (englishName != other.englishName) return false
        if (level != other.level) return false
        if (classOfMagic != other.classOfMagic) return false
        if (castingTime != other.castingTime) return false
        if (range != other.range) return false
        if (components != other.components) return false
        if (duration != other.duration) return false
        if (description != other.description) return false

        return true
    }




}