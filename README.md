# Getting Started
A platform built with Spring + Bootstrap, deploy to AWS EC2. The platform offer features such as posting, replying, editing, notification, keyword searching, showing related topic, and updating hot topics in couple hours. Visit website at:

[Link](http://107.22.218.98/)

Please login with github account.


## Run in Local Guides
1. Tools
- Git
- JDK
- Maven
2. Create local database
```bash
mvn flyway:migrate
mvn -Dmybatis.generator.overwrite=true mybatis-generator:generate
```
Change below setting to MySQL if needed
```
# src/main/resources/application.properties 
spring.datasource.url=jdbc:h2:~/community
```
```
# pom.xml
<properties>
    <db.url>jdbc:h2:~/community</db.url>
</properties>
```
3. Packing to get jar
```sh
mvn package -DskipTests
```
4. Run project
```sh
java -jar target/demo-0.0.1-SNAPSHOT.jar
```

## Steps for cloud deployment
- yum update
- yum install git
- mkdir App
- cd App
- git clone https://
- yum install maven
- mvn compile package
- cp src/main/resources/application.properties src/main/resources/application-production.properties
- vim src/main/resources/application-production.properties
- mvn package
- java -jar -Dspring.profiles.active=production target/demo-0.0.1-SNAPSHOT.jar
- sudo nohup java -jar -Dspring.profiles.active=production target/demo-0.0.1-SNAPSHOT.jar
### stop
find pid
- cat nohup.out

kill process
- kill -0 pid
