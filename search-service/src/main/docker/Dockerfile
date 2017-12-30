FROM frolvlad/alpine-oraclejdk8
VOLUME /tmp
ADD search-service.jar search-service.jar
COPY startService.sh /startService.sh
RUN chmod +x /startService.sh
EXPOSE 8090
ENTRYPOINT ["./startService.sh", "eureka-server1", "8761", "/search-service.jar"]
