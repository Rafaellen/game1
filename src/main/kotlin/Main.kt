import character.CharacterBuilder

fun main() {
    val builder = CharacterBuilder()
    
    println("🐉 SISTEMA DE CRIAÇÃO DE PERSONAGENS 🐉")
    println("=".repeat(50))
    
    // Tenta criar personagem interativo ou usa modo demonstração
    val character = builder.createCharacter()
    
    println("\n" + "=".repeat(50))
    println("FICHA DO PERSONAGEM:")
    println("=".repeat(50))
    character.displayCharacter()
}