FROM openjdk:17

EXPOSE 8082
ADD  target/devops_automation.jar  devops_automation.jar

ENTRYPOINT ["java", "-jar", "devops_automation.jar"]