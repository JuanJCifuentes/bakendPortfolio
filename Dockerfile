FROM amazoncorretto:19.0.2

MAINTAINER juanjc

COPY target/jc-0.0.1-SNAPSHOT.jar jc-0.0.1-SNAPSHOT.jar

ENTRYPOINT ["java","-jar","/jc-0.0.1-SNAPSHOT.jar"]
