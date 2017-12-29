FROM frolvlad/alpine-oraclejdk8
VOLUME /tmp
ADD search-service.jar search-service.jar
EXPOSE 8090
ENTRYPOINT ["java", "-Djava.security.egd=file:/dev/./urandom", "-jar","/search-service.jar"]
