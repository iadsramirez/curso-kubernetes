FROM openjdk:11.0.13

ENV TZ="America/New_York"

WORKDIR /app/msvc-usuarios


COPY  ./pom.xml /app

COPY ./msvc-usuarios .


RUN  ./mvnw clean package    -DskipTests

EXPOSE 8001

ENTRYPOINT [ \
    "java", \
    "-jar", \
    "./target/msvc-usuarios-0.0.1-SNAPSHOT.jar" \
]




