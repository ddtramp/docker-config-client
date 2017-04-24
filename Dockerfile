FROM java:8

RUN mkdir /app
WORKDIR /app

ADD build/libs/config-client-0.0.1-SNAPSHOT.jar /app
RUN ln -sf config-client-0.0.1-SNAPSHOT.jar config-client-latest.jar

ADD ./wait-for-it.sh /usr/local/bin/wait-for-it
RUN chmod +x /usr/local/bin/wait-for-it

CMD java -jar /app/config-client-latest.jar