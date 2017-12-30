FROM frolvlad/alpine-oraclejdk8
VOLUME /tmp
ADD eureka-server.jar eureka-server.jar
COPY startService.sh /startService.sh
RUN chmod +x /startService.sh
EXPOSE 8761
ENTRYPOINT ["./startService.sh", "config-server", "8888", "/eureka-server.jar"]
