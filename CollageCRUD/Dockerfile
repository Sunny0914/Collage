FROM maven:3.8.1-openjdk-17 as Build
COPY . .
RUN mvn package -DskipTests

FROM openjdk:17.0.1-jdk-slim
COPY --from=build /target/CollageCRUD-0.0.1-SNAPSHOT.jar CollageCRUD.jar
EXPOSE 8081
ENTRYPOINT ["java","-jar","CollageCRUD.jar"]