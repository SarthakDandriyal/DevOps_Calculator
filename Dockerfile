FROM openjdk:8
COPY  ./target/DevOps_Calculator-1.0-SNAPSHOT-jar-with-dependencies.jar ./
WORKDIR ./
CMD ["java", "-jar", "DevOps_Calculator-1.0-SNAPSHOT-jar-with-dependencies.jar"]