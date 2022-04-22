plugins {
    kotlin("jvm") version "1.6.20"
}

group = "me.cookie"
version = "0.1"

repositories {
    maven(url = "https://jitpack.io/")
    mavenCentral()
}

dependencies {
    implementation(kotlin("stdlib"))
    compileOnly("com.github.Minestom:Minestom:c32153d221")
}

tasks {
    jar {
        destinationDirectory.set(file("C:\\Users\\sasha\\Documents\\MinestomShit\\LevelUP\\extensions"))
    }
}