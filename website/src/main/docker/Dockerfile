FROM frolvlad/alpine-oraclejdk8
VOLUME /tmp
ADD website.jar website.jar
COPY startService.sh /startService.sh
RUN chmod +x /startService.sh
EXPOSE 8001
ENTRYPOINT ["./startService.sh", "search-apigateway", "8095", "/website.jar"]
