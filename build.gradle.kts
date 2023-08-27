plugins {
    kotlin("jvm") version "1.9.10"
    id("com.github.johnrengelman.shadow") version "8.1.1"
}

group = "kr.vanilage"
version = "1.0" // 여기에 버전을 작성하세요.

repositories {
    mavenCentral()
    maven("https://repo.papermc.io/repository/maven-public/")
}

dependencies {
    compileOnly("io.papermc.paper:paper-api:1.20.1-R0.1-SNAPSHOT"); // 여기 버전을 바꿀수 있습니다.
}

tasks {
    compileKotlin {
        kotlinOptions.jvmTarget = "17"
    }

    compileTestKotlin {
        kotlinOptions.jvmTarget = "17"
    }

    shadowJar {
        destinationDirectory = file("D:\\Programming\\Mcserver\\연구소\\plugins\\update") //여기에 프로젝트 내보내기 주소를 작성하세요.
    }
}