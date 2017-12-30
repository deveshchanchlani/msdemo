FROM frolvlad/alpine-oraclejdk8
VOLUME /tmp
ADD search-apigateway.jar search-apigateway.jar
EXPOSE 8095
ENTRYPOINT ["java", "-Djava.security.egd=file:/dev/./urandom", "-jar","/search-apigateway.jar"]
