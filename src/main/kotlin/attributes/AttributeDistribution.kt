package attributes

interface AttributeDistribution {
    fun distribute(): Map<String, Int>
}

class ClassicDistribution : AttributeDistribution {
    override fun distribute(): Map<String, Int> {
        val attributes = listOf("Força", "Destreza", "Constituição", "Inteligência", "Sabedoria", "Carisma")
        return attributes.associateWith { (8..18).random() }
    }
}

class HeroicDistribution : AttributeDistribution {
    override fun distribute(): Map<String, Int> {
        val attributes = listOf("Força", "Destreza", "Constituição", "Inteligência", "Sabedoria", "Carisma")
        return attributes.associateWith { (14..18).random() }
    }
}

class AdventurerDistribution : AttributeDistribution {
    override fun distribute(): Map<String, Int> {
        val attributes = listOf("Força", "Destreza", "Constituição", "Inteligência", "Sabedoria", "Carisma")
        return attributes.associateWith { (10..16).random() }
    }
}