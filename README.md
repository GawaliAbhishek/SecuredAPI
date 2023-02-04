# SecuredAPI
Recently added spring security in my tech stack. 

Spring Security  :-  [Spring Security](https://spring.io/projects/spring-security) is a powerful and highly customizable authentication and access-control framework. It is the de-facto standard for securing Spring-based applications.
Spring Security is a framework that focuses on providing both authentication and authorization to Java applications. 

I have Used Spring Boot v- 3.0.2 and same compatible version of spring security

![Screenshot (8)](https://user-images.githubusercontent.com/89680568/216748683-f21149a7-9245-443e-bdb4-28a4e7f95225.png)


# API
The basic API is about citys and countries data in world when requested for "/city/" url we will get all cities in world. same as "/country/" url will 
give all countries in world

details of endpoints :

1. city -  urls


          "/" = all data
          "/{id}" = data on basis of id
          "/byname/{name}" = data on basis of name of city         
          "/bydistrict/{district}" = data on basis of district          

          "/bypopulation/{population}" = data on basis of population

2. country - urls
            
            "/" =all data
            "byId/{code}" = data on basis of country code
            "/byname/{name}" = data on basis of country name
            "/bycontinent/{continent}" = data on basis of continent
            
            
 ![Screenshot (6)](https://user-images.githubusercontent.com/89680568/216748650-b719c2f2-34d6-42ce-b08c-273dede5187c.png)
    
            
 # Security
 
 All the above urls are secured . only the adduser url which is used for signup is public <br>
 i have used role based authentication. two roles are defined "ADMIN" and "NORMAL"<br>
 ADMIN have rights to add the city and country data in db as well he can access all the get urls <br>
 NORMAL user has only access to get urls <br>
           
 
 I have used Bcrpytpassword encoder to encode the passwords and store it in db 
 
 ![Screenshot (3)](https://user-images.githubusercontent.com/89680568/216748730-19dbb107-af3b-4310-b943-33a5e57dcccc.png)


# UI

There is Not as such UI in this Project but Login and Logout Page UI are like this

![Screenshot (5)](https://user-images.githubusercontent.com/89680568/216748866-c95a8d5f-0094-45fc-b497-d080a8ca25a4.png)

 
   ![Screenshot (4)](https://user-images.githubusercontent.com/89680568/216748876-14b54448-7ee4-405e-ab5e-9cf36d43bf45.png)
         


