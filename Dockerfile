#
# Package stage
#

FROM openjdk:11-jre-slim
COPY target/HCVaultPoc-1.0-SNAPSHOT.jar /usr/local/lib/HCVaultPoc-1.0-SNAPSHOT.jar
EXPOSE 8090
ENTRYPOINT ["java","-jar","/usr/local/lib/HCVaultPoc-1.0-SNAPSHOT.jar"]