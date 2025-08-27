package character

import attributes.*
import races.*
import classes.*
import java.util.*

class CharacterBuilder {
    fun createCharacter(): Character {
        println("=== CRIAÇÃO DE PERSONAGEM ===")
        
        // Verifica se está sendo executado em ambiente com input disponível
        return if (isInteractiveEnvironment()) {
            createInteractiveCharacter()
        } else {
            createDefaultCharacter()
        }
    }
    
    private fun isInteractiveEnvironment(): Boolean {
        return try {
            // Tenta verificar se há input disponível
            System.`in`.available()
            true
        } catch (e: Exception) {
            false
        }
    }
    
    private fun createInteractiveCharacter(): Character {
        val scanner = Scanner(System.`in`)
        
        println("Modo Interativo Ativado")
        println("-----------------------")
        
        print("Nome do personagem: ")
        val name = scanner.nextLine()
        
        val race = chooseRaceInteractive(scanner)
        val characterClass = chooseClassInteractive(scanner)
        val attributes = chooseAttributeDistributionInteractive(scanner)
        
        println("Personagem criado com sucesso!")
        return Character(name, race, characterClass, attributes)
    }
    
    private fun chooseRaceInteractive(scanner: Scanner): Race {
        println("\nEscolha uma raça:")
        println("1 - Humano")
        println("2 - Elfo")
        println("3 - Anão")
        print("Opção (1): ")
        
        val input = scanner.nextLine()
        return when (input.toIntOrNull() ?: 1) {
            2 -> {
                println("Raça escolhida: Elfo")
                Elf()
            }
            3 -> {
                println("Raça escolhida: Anão")
                Dwarf()
            }
            else -> {
                println("Raça escolhida: Humano")
                Human()
            }
        }
    }
    
    private fun chooseClassInteractive(scanner: Scanner): CharacterClass {
        println("\nEscolha uma classe:")
        println("1 - Guerreiro")
        println("2 - Mago")
        println("3 - Ladino")
        print("Opção (1): ")
        
        val input = scanner.nextLine()
        return when (input.toIntOrNull() ?: 1) {
            2 -> {
                println("Classe escolhida: Mago")
                Wizard()
            }
            3 -> {
                println("Classe escolhida: Ladino")
                Rogue()
            }
            else -> {
                println("Classe escolhida: Guerreiro")
                Warrior()
            }
        }
    }
    
    private fun chooseAttributeDistributionInteractive(scanner: Scanner): Map<String, Int> {
        println("\nEscolha o método de distribuição de atributos:")
        println("1 - Clássica (8-18)")
        println("2 - Heróica (14-18)")
        println("3 - Aventureiro (10-16)")
        print("Opção (1): ")
        
        val input = scanner.nextLine()
        val distribution = when (input.toIntOrNull() ?: 1) {
            2 -> {
                println("Distribuição escolhida: Heróica")
                HeroicDistribution()
            }
            3 -> {
                println("Distribuição escolhida: Aventureiro")
                AdventurerDistribution()
            }
            else -> {
                println("Distribuição escolhida: Clássica")
                ClassicDistribution()
            }
        }
        
        return distribution.distribute()
    }
    
    private fun createDefaultCharacter(): Character {
        println("Modo de Demonstração (sem input interativo)")
        println("-------------------------------------------")
        
        // Valores padrão para demonstração
        val name = "Herói"
        val race = Human()
        val characterClass = Warrior()
        val attributes = ClassicDistribution().distribute()
        
        println("Nome: $name")
        println("Raça: ${race.name}")
        println("Classe: ${characterClass.name}")
        println("Distribuição: Clássica")
        
        return Character(name, race, characterClass, attributes)
    }
}