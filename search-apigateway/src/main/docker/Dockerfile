FROM frolvlad/alpine-oraclejdk8
VOLUME /tmp
ADD search-apigateway.jar search-apigateway.jar
COPY startService.sh /startService.sh
RUN chmod +x /startService.sh
EXPOSE 8095
ENTRYPOINT ["./startService.sh", "search-service", "8090", "/search-apigateway.jar"]
