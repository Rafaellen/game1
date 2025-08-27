package races

abstract class Race(
    val name: String,
    val movement: Int,
    val darkvision: Int,
    val alignment: String
) {
    abstract fun getSpecialAbilities(): List<String>
}

class Human : Race("Humano", 9, 0, "Qualquer") {
    override fun getSpecialAbilities(): List<String> {
        return listOf("Versátil", "Adaptável")
    }
}

class Elf : Race("Elfo", 9, 60, "Caótico Bom") {
    override fun getSpecialAbilities(): List<String> {
        return listOf("Imunidade a sono", "Visão no escuro", "Proficiência com espadas longas")
    }
}

class Dwarf : Race("Anão", 6, 60, "Leal Bom") {
    override fun getSpecialAbilities(): List<String> {
        return listOf("Resistência a veneno", "Proficiência com machados", "Conhecimento de pedra")
    }
}