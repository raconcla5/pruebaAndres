ARG CR_URL
FROM $CR_URL/openjdk:8-jdk-alpine as final
RUN apk --no-cache add curl jq

FROM $CR_URL/maven:3.6.3-jdk-8 as build

ARG NEXUS_USR_READ
ARG NEXUS_PSW_READ
ARG NEXUS_URL_MVN
RUN apt-get update && apt-get install zip

WORKDIR /src
# Just copy pom files to install necessary packages
# It must be done this way to run with Kaniko cache.
COPY pom.xml .
COPY ./.m2 ./.m2


RUN mvn -s .m2/settings.xml install -DskipTests

# Copy code, otherwhise a copy .. instruction prevents Kaniko cache to run succesfully.
COPY ./src/ ./src/
COPY ./resources/ ./resources/

RUN mvn -s .m2/settings.xml package -DskipTests

#Create folder to zip
WORKDIR /projectFolderExe

#Copy needs to build executable ZIP
RUN cp -r /src/resources ./ && cp /src/target/3108smokeExe.jar ./ && cp -r /src/target/lib ./
COPY ./extent_config.xml ./
COPY ./config.properties ./
COPY ./README.md ./

RUN cd /projectFolderExe && zip -r ./3108smokeExe.zip . -x "execute.sh"


FROM final
WORKDIR /app
COPY --from=build projectFolderExe/3108smokeExe.zip .
COPY execute.sh .
# RUN useradd -u 1001 nonrootuser
# RUN chown -R 1001:1001 $CATALINA_HOME