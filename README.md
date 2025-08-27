# 🐉 Sistema de Criação de Personagens - RPG

Sistema completo para criação de personagens de RPG baseado em Kotlin, implementando os conceitos de orientação a objetos com distribuição de atributos, raças e classes.

## 🎯 Funcionalidades

- ✅ **3 Sistemas de Distribuição de Atributos:** Clássica, Heróica e Aventureiro
- ✅ **3 Raças Implementadas:** Humano, Elfo e Anão
- ✅ **3 Classes Implementadas:** Guerreiro, Mago e Ladino
- ✅ **Sistema de características únicas** por raça e classe
- ✅ **Interface interativa** para criação de personagens

## 🛠️ Tecnologias

- **Linguagem:** Kotlin 1.9.23
- **Build Tool:** Gradle 9.0
- **JDK:** Java 17+


## 🚀 Como Executar o Projeto

### Pré-requisitos
- **JDK 17** ou superior instalado
- **Gradle** (opcional - já incluído no wrapper)

### Método 1: Execução com Gradle Wrapper (Recomendado)
```bash
# Compilar e executar
./gradlew clean run

# Ou apenas executar se já compilado
./gradlew run

# Compilar o projeto
./gradlew clean jar

# Executar o JAR gerado
java -jar build/libs/trabaio-facul-1.0-SNAPSHOT.jar