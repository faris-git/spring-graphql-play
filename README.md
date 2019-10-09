# Spring Boot + GraphQL

### Run   
* Start the spring boot application
* http://localhost:8080/graphiql
* Run the below code on GraphQL interface:
```` 
# To create
mutation {
  createPerson(name: "Globewaytech", street: "Globeway", houseNumber: "1", postalCode: "G1212", city: "Earth", country: "Universe") 
  {
    id
  }
}

# get by id
query {
  person(id: 1) 
  {
    id,
    name,
    address {
      street
      houseNumber
      postalCode
      city
      country
    }
	}
}

# Get all persons
query {
  persons(count: 1) 
  {
    id,
    name,
    address {
        street
	}
}
````
### Reference Documentation
For further reference, please consider the following sections:

* [Official GraphQL documentation](https://graphql.org/learn/)
* [Spring Boot Maven Plugin Reference Guide](https://docs.spring.io/spring-boot/docs/2.1.9.RELEASE/maven-plugin/)
* [Securing a Web Application](https://spring.io/guides/gs/securing-web/)
* [Spring Security](https://docs.spring.io/spring-boot/docs/2.1.9.RELEASE/reference/htmlsingle/#boot-features-security)

