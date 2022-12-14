import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
  java
  id("org.jetbrains.dokka") version "1.7.10"
  kotlin("jvm") version "1.7.20"
  `maven-publish`
  signing
}

group = "io.foxcapades.lib"
version = "1.0.0"

repositories {
  mavenCentral()
}

java {
  sourceCompatibility = JavaVersion.VERSION_1_9
  targetCompatibility = JavaVersion.VERSION_1_9

  withJavadocJar()
  withSourcesJar()
}

tasks.withType<KotlinCompile> {
  kotlinOptions.jvmTarget = "9"
}

tasks.dokkaHtml {
  outputDirectory.set(file("docs/dokka/${version}"))
}

publishing {
  repositories {
    maven {
      name = "GitHub"
      url = uri("https://maven.pkg.github.com/foxcapades/jdbc-ro-result-set")
      credentials {
        username = project.findProperty("gpr.user") as String? ?: System.getenv("USERNAME")
        password = project.findProperty("gpr.key") as String? ?: System.getenv("TOKEN")
      }
    }

    maven {
      name = "Sonatype"
      url = uri("https://s01.oss.sonatype.org/service/local/staging/deploy/maven2/")
      credentials {
        username = project.findProperty("nexus.user") as String? ?: System.getenv("NEXUS_USER")
        password = project.findProperty("nexus.pass") as String? ?: System.getenv("NEXUS_PASS")
      }
    }
  }

  publications {
    create<MavenPublication>("gpr") {
      from(components["java"])
      pom {
        name.set("Read-Only ResultSet")
        description.set("Provides a thin wrapper around ResultSet instances that blocks mutative methods.")
        url.set("https://github.com/foxcapades/jdbc-ro-result-set")

        licenses {
          license {
            name.set("MIT")
          }
        }

        developers {
          developer {
            id.set("epharper")
            name.set("Elizabeth Paige Harper")
            email.set("foxcapades.io@gmail.com")
            url.set("https://github.com/foxcapades")
          }
        }

        scm {
          connection.set("scm:git:git://github.com/foxcapades/jdbc-ro-result-set.git")
          developerConnection.set("scm:git:ssh://github.com/foxcapades/jdbc-ro-result-set.git")
          url.set("https://github.com/foxcapades/jdbc-ro-result-set")
        }
      }
    }
  }
}

signing {
  useGpgCmd()

  sign(configurations.archives.get())
  sign(publishing.publications["gpr"])
}
