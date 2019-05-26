REM Helpful Commands to assist your workflow

REM Useful Maven commands
REM mvnw -Pdev -Dmaven.test.skip=true -Dspring.profiles.active=dev :No tests, Dev profile
REM mvnw -Pprod -Dskip.npm=true -Dskip.webpack=true -DskipTests :Skip NPM, client build and Tests
REM mvnw -Pprod clean package :Build a prod JAR
REM mvnw -Pdev clean package :Build a dev JAR
REM mvnw spring-boot:run

REM Set JAVA_HOME
set JAVA_HOME=C:\Program Files\Java\jdk1.8.0_161

REM Prod Mode MariaDB - these variables are exported and picked up in
REM src/main/resources/config/application-prod.yml
REM *** REMEMBER TO CHANGE THE USERNAME AND PASSWORD :-) ***
REM Start App in Prod Mode: mvnw -Pprod
set DB_URL=jdbc:mariadb://docsappstack:9200/webblogdb
set ADMIN_USERNAME=webblog_admin
set ADMIN_PASSWORD=webblog_admin

REM Back End Testing Commands - More info @ https://www.jhipster.tech/running-tests/
REM mvnw -Pdev clean test :Integration tests are done with the Spring Test Context framework
REM ** You can also run the tests from the IDE but it won't compile the app so do both for a complete test!!!

REM Front End Testing Commands
REM npm test :Jest front end tests
REM npm run e2e : E2E Protractor browser based integration tests, must have the back end up!
REM npm run e2e -- --specs src\test\javascript\e2e\account\account.spec.ts :E2E for individual spec

REM Access Maria DB
REM mysql -u {username} -p {dbname}

REM FontAwersome!!
REM Sometimes need to import icons in the vendor.ts file.

REM New Production Version
REM 1. change POM version
REM 2. change README version
REM 3. Change CHANGELOG
REM 4. commit "Version xx.xx"
REM 5. add tag
REM 6. Update default Jenkins Prod deploy number

REM New Project Setup
REM 1. Copy and update README, CHANGELOG and env_variables
REM 2. Add DB variables to src/main/resources/config/application-prod.yml
REM 3. Add docker plugin to POM file and add/update CD-CI Jenkins pipeline
REM 4. Update Dockerfile and set up DevOps build pipelines for Dev and Prod
REM 5. Check no security information has been leaked and run full suite of tests and builds
REM 6. Create entity design and import into project
REM 7. Code your new project :-) !!
