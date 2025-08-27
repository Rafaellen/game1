package classes

abstract class CharacterClass(val name: String) {
    abstract val hitDice: Int
    abstract val primaryAttributes: List<String>
    abstract fun getClassFeatures(): List<String>
}

class Warrior : CharacterClass("Guerreiro") {
    override val hitDice: Int = 10
    override val primaryAttributes: List<String> = listOf("Força", "Constituição")
    
    override fun getClassFeatures(): List<String> {
        return listOf("Proficiência com todas as armas", "Armadura pesada", "Ataque extra")
    }
}

class Wizard : CharacterClass("Mago") {
    override val hitDice: Int = 6
    override val primaryAttributes: List<String> = listOf("Inteligência")
    
    override fun getClassFeatures(): List<String> {
        return listOf("Magia arcana", "Familiar", "Escrever pergaminhos")
    }
}

class Rogue : CharacterClass("Ladino") {
    override val hitDice: Int = 8
    override val primaryAttributes: List<String> = listOf("Destreza")
    
    override fun getClassFeatures(): List<String> {
        return listOf("Furtividade", "Ataque furtivo", "Armadilhas")
    }
}