# ea-eureka-service
The service responsible for the other microservices registration and balancing in Eagle Eye Application.


## Useful APIS

### How to check particular service information in Eureka
```http request
GET http://<eureka service>:8761/eureka/apps/<APPID>
```
For instance, to see the organization service in the registry you can call
`http:// localhost:8761/eureka/apps/ea-organisation-service`