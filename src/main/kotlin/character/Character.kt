package character

import attributes.AttributeDistribution
import races.Race
import classes.CharacterClass

data class Character(
    val name: String,
    val race: Race,
    val characterClass: CharacterClass,
    val attributes: Map<String, Int>
) {
    fun displayCharacter() {
        println("=== PERSONAGEM ===")
        println("Nome: $name")
        println("Raça: ${race.name}")
        println("Classe: ${characterClass.name}")
        println("\nAtributos:")
        attributes.forEach { (attr, value) -> println("$attr: $value") }
        println("\nCaracterísticas da Raça:")
        println("Movimento: ${race.movement}m")
        println("Visão no Escuro: ${race.darkvision}ft")
        println("Alinhamento: ${race.alignment}")
        println("Habilidades: ${race.getSpecialAbilities().joinToString()}")
        println("\nCaracterísticas da Classe:")
        println("Dado de Vida: d${characterClass.hitDice}")
        println("Habilidades: ${characterClass.getClassFeatures().joinToString()}")
    }
}