FROM maven:3.9.6-eclipse-temurin-21

WORKDIR /app

COPY pom.xml .

COPY . .

RUN mvn clean package -DskipTests

CMD ["java", "-jar", "target/bin-2-dec-1.0-SNAPSHOT-jar-with-dependencies.jar"]
