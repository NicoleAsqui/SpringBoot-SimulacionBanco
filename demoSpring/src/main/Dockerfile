# Usar una imagen base de OpenJDK
FROM openjdk:17-jdk-slim

# Copiar el archivo JAR al contenedor
COPY target/demoSpring.jar demoSpring.jar

# Establecer el comando de entrada
ENTRYPOINT ["java", "-jar", "/demoSpring.jar"]
