agilepays-service


# Rodar local
mvn spring-boot:run -Dspring.profiles.active=dev

# Gerar war prod
mvn clean && mvn compile && mvn package

# Rodar war como dev
java -jar target/agilepays-service-0.0.1-SNAPSHOT.war --spring.profiles.active=dev

# Rodar war como prod
java -jar target/agilepays-service-0.0.1-SNAPSHOT.war
