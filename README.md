# base-api

# Tech Stack
  - java 11, with maven 3 as builder
  - spring boot 2.2.6
  - multi module support for dependency injection during build
  - integrated wit Open API 3

# Build Usage

### Install
  For Intsalling All Libraries 
  - mvn clean install
  
  For Installing AWS libraries
  - mvn clean install -Paws
  
### Run
  For running with all libraries
  - mvn clean spring-boot:run -pl base-api-restapp
  
  For running with AWS libraries
  - mvn clean spring-boot:run -Paws -pl base-api-restapp


# Open API
http://localhost:8080/swagger-ui/