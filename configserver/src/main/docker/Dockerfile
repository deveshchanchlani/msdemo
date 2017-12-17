FROM frolvlad/alpine-oraclejdk8

VOLUME /tmp

ADD configserver.jar configserver.jar
EXPOSE 8888
ENTRYPOINT ["java", "-Djava.security.egd=file:/dev/./urandom", "-jar","/configserver.jar"]
