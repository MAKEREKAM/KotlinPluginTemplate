plugins {
    kotlin("jvm") version "1.9.10"
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

    copy {
        from("build/libs")
        into("D:\\Programming\\Mcserver\\연구소\\plugins\\update") // 여기서 빌드 주소를 설정하세요.
        include("*.jar")
    }
}
