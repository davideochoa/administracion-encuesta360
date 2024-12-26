# Etapa 1: Construcción del JAR con Maven
FROM maven:3.9.5-eclipse-temurin-21 AS build
WORKDIR /app

# Copiar archivos de configuración de Maven y el proyecto
COPY pom.xml .
COPY src ./src

# Construir el proyecto con el perfil "production"
RUN mvn -Pproduction package -DskipTests

# Etapa 2: Construcción de la imagen final
FROM eclipse-temurin:21-jre
WORKDIR /app

# Copiar el JAR generado desde la etapa anterior
COPY --from=build /app/target/*.jar app.jar

# Exponer el puerto 8080
EXPOSE 8080

# Comando de inicio
ENTRYPOINT ["java", "-jar", "app.jar"]
