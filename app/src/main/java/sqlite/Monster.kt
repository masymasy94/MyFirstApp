package sqlite

class Monster {
    var id: Int = 0;
    var name: String? = null
    var size: String? = null
    var species: String? = null
    var alignment: String? = null;
    var hitPoints: Int? = null
    var hitPointsDices: String? = null;
    var armorClass: Int? = null
    var armorClassType: String? = null
    var speed: String? = null;
    var challenge: Double? = null
    var experience: Int? = null
    var savingThrows: String? = null
    var abilities: String? = null
    var senses: String? = null
    var languages: String? = null
    var passiveActions: String? = null
    var actions: String? = null
    var legendaryActions: String? = null
    var legendaryActionsDescription: String? = null
    var resistenzaDanni: String? = null
    var immunitaDanni: String? = null
    var resistenzaCondizioni: String? = null
    var immunitaCondizioni: String? = null


    var strenght: Int? = null
    var strenghtModifier: Int? = null
    var dexterity: Int? = null
    var dexterityModifier: Int? = null
    var intelligence: Int? = null
    var intelligenceModifier: Int? = null
    var constitution: Int? = null
    var constitutionModifier: Int? = null
    var wisdom: Int? = null
    var wisdomModifier: Int? = null
    var charisma: Int? = null
    var charismaModifier: Int? = null

    var reactions: String? = null


    constructor()



    constructor(
        id: Int,
        name: String?,
        size: String?,
        species: String?,
        alignment: String?,
        hitPoints: Int?,
        hitPointsDices: String?,
        armorClass: Int?,
        armorClassType: String?,
        speed: String?,
        challenge: Double?,
        experience: Int?,
        savingThrows: String?,
        abilities: String?,
        senses: String?,
        languages: String?,
        passiveActions: String?,
        actions: String?,
        legendaryActions: String?,
        legendaryActionsDescription: String?,
        resistenzaDanni: String?,
        immunitaDanni: String?,
        resistenzaCondizioni: String?,
        immunitaCondizioni: String?,
        strenght: Int?,
        strenghtModifier: Int?,
        dexterity: Int?,
        dexterityModifier: Int?,
        constitution: Int?,
        constitutionModifier: Int?,
        intelligence: Int?,
        intelligenceModifier: Int?,
        wisdom: Int?,
        wisdomModifier: Int?,
        charisma: Int?,
        charismaModifier: Int?,
        reactions: String?
    ) {
        this.id = id
        this.name = name
        this.size = size
        this.species = species
        this.alignment = alignment
        this.hitPoints = hitPoints
        this.hitPointsDices = hitPointsDices
        this.armorClass = armorClass
        this.armorClassType = armorClassType
        this.speed = speed
        this.challenge = challenge
        this.experience = experience
        this.savingThrows = savingThrows
        this.abilities = abilities
        this.senses = senses
        this.languages = languages
        this.passiveActions = passiveActions
        this.actions = actions
        this.legendaryActions = legendaryActions
        this.legendaryActionsDescription = legendaryActionsDescription
        this.resistenzaDanni = resistenzaDanni
        this.resistenzaCondizioni = resistenzaCondizioni
        this.immunitaDanni = immunitaDanni
        this.immunitaCondizioni = immunitaCondizioni
        this.strenght = strenght
        this.strenghtModifier = strenghtModifier
        this.dexterity = dexterity
        this.dexterityModifier = dexterityModifier
        this.intelligence = intelligence
        this.intelligenceModifier = intelligenceModifier
        this.constitution = constitution
        this.constitutionModifier = constitutionModifier
        this.wisdom = wisdom
        this.wisdomModifier = wisdomModifier
        this.charisma = charisma
        this.charismaModifier = charismaModifier
        this.reactions = reactions
    }

    constructor(
        name: String?,
        size: String?,
        species: String?,
        alignment: String?,
        hitPoints: Int?,
        hitPointsDices: String?,
        armorClass: Int?,
        armorClassType: String?,
        speed: String?,
        challenge: Double?,
        experience: Int?,
        savingThrows: String?,
        abilities: String?,
        senses: String?,
        languages: String?,
        passiveActions: String?,
        actions: String?,
        legendaryActions: String?,
        legendaryActionsDescription: String?,
        resistenzaDanni: String?,
        immunitaDanni: String?,
        resistenzaCondizioni: String?,
        immunitaCondizioni: String?,
        strenght: Int?,
        strenghtModifier: Int?,
        dexterity: Int?,
        dexterityModifier: Int?,
        constitution: Int?,
        constitutionModifier: Int?,
        intelligence: Int?,
        intelligenceModifier: Int?,
        wisdom: Int?,
        wisdomModifier: Int?,
        charisma: Int?,
        charismaModifier: Int?,
        reactions: String?
    ) {
        this.name = name
        this.size = size
        this.species = species
        this.alignment = alignment
        this.hitPoints = hitPoints
        this.hitPointsDices = hitPointsDices
        this.armorClass = armorClass
        this.armorClassType = armorClassType
        this.speed = speed
        this.challenge = challenge
        this.experience = experience
        this.savingThrows = savingThrows
        this.abilities = abilities
        this.senses = senses
        this.languages = languages
        this.passiveActions = passiveActions
        this.actions = actions
        this.legendaryActions = legendaryActions
        this.legendaryActionsDescription = legendaryActionsDescription
        this.resistenzaDanni = resistenzaDanni
        this.resistenzaCondizioni = resistenzaCondizioni
        this.immunitaDanni = immunitaDanni
        this.immunitaCondizioni = immunitaCondizioni
        this.strenght = strenght
        this.strenghtModifier = strenghtModifier
        this.dexterity = dexterity
        this.dexterityModifier = dexterityModifier
        this.intelligence = intelligence
        this.intelligenceModifier = intelligenceModifier
        this.constitution = constitution
        this.constitutionModifier = constitutionModifier
        this.wisdom = wisdom
        this.wisdomModifier = wisdomModifier
        this.charisma = charisma
        this.charismaModifier = charismaModifier
        this.reactions = reactions
    }



    fun equalsAttributues(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Monster

        if (name != other.name) return false
        if (size != other.size) return false
        if (species != other.species) return false
        if (alignment != other.alignment) return false
        if (hitPoints != other.hitPoints) return false
        if (hitPointsDices != other.hitPointsDices) return false
        if (armorClass != other.armorClass) return false
        if (armorClassType != other.armorClassType) return false
        if (speed != other.speed) return false
        if (challenge != other.challenge) return false
        if (experience != other.experience) return false
        if (savingThrows != other.savingThrows) return false
        if (abilities != other.abilities) return false
        if (senses != other.senses) return false
        if (languages != other.languages) return false
        if (passiveActions != other.passiveActions) return false
        if (actions != other.actions) return false
        if (legendaryActions != other.legendaryActions) return false
        if (legendaryActionsDescription != other.legendaryActionsDescription) return false
        if (resistenzaDanni != other.resistenzaDanni) return false
        if (immunitaDanni != other.immunitaDanni) return false
        if (resistenzaCondizioni != other.resistenzaCondizioni) return false
        if (immunitaCondizioni != other.immunitaCondizioni) return false
        if (strenght != other.strenght) return false
        if (strenghtModifier != other.strenghtModifier) return false
        if (dexterity != other.dexterity) return false
        if (dexterityModifier != other.dexterityModifier) return false
        if (intelligence != other.intelligence) return false
        if (intelligenceModifier != other.intelligenceModifier) return false
        if (constitution != other.constitution) return false
        if (constitutionModifier != other.constitutionModifier) return false
        if (wisdom != other.wisdom) return false
        if (wisdomModifier != other.wisdomModifier) return false
        if (charisma != other.charisma) return false
        if (charismaModifier != other.charismaModifier) return false

        return true
    }




}