# Getting Started

### Reference Documentation
For further reference, please consider the following sections:

* [Official Apache Maven documentation](https://maven.apache.org/guides/index.html)
* [Spring Boot Maven Plugin Reference Guide](https://docs.spring.io/spring-boot/docs/2.6.4/maven-plugin/reference/html/)
* [Create an OCI image](https://docs.spring.io/spring-boot/docs/2.6.4/maven-plugin/reference/html/#build-image)
* [Spring Boot DevTools](https://docs.spring.io/spring-boot/docs/2.6.4/reference/htmlsingle/#using-boot-devtools)
* [Spring Data MongoDB](https://docs.spring.io/spring-boot/docs/2.6.4/reference/htmlsingle/#boot-features-mongodb)
* [Spring Boot Actuator](https://docs.spring.io/spring-boot/docs/2.6.4/reference/htmlsingle/#production-ready)
* [Spring Web](https://docs.spring.io/spring-boot/docs/2.6.4/reference/htmlsingle/#boot-features-developing-web-applications)

### Guides
The following guides illustrate how to use some features concretely:

* [Accessing Data with MongoDB](https://spring.io/guides/gs/accessing-data-mongodb/)
* [Building a RESTful Web Service with Spring Boot Actuator](https://spring.io/guides/gs/actuator-service/)
* [Building a RESTful Web Service](https://spring.io/guides/gs/rest-service/)
* [Serving Web Content with Spring MVC](https://spring.io/guides/gs/serving-web-content/)
* [Building REST services with Spring](https://spring.io/guides/tutorials/bookmarks/)

### Implementation

* Create the Docker container
* generate the profiles
* Based on environament start the respective profiles 
	* we can pass the profile as an environment variable to the docker image and kubenetes deployment
* Volumes we will implement later

### Docker Implementation
			
* build docker file and tag it as v1
** 		
* 	Create a network 
* 	docker network create product
* 	Run mongo container 			
* 	docker container run -p 27017:27017 --name=mongo --network=product -e MONGO_INITDB_ROOT_USERNAME=mongo  -e MONGO_INITDB_ROOT_PASSWORD=mongo mongo
		
				
*  Running the product image
*  docker run   --name=productmanagement   --rm   --network=product   -p 8080:8080   -e MONGO_URL=mongodb://mongo:27017/ProductDB  productmanagement:v1
			or 
* docker run   --name=productmanagement   --rm   --network=product   -p 8080:8080   -e spring.data.mongodb.host=mongo  productmanagement:v1
* 	Or similary pass the profile in above command


### Moving to the kubernetes
*