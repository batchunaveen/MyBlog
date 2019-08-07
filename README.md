# RestApp using MongoDB database
 
Rest API using Spring boot and MongoDB 

Using Docker MongoDb Container 
   
   
Steps
 
    1. Run Docker 
    2. docker pull mongo (this will give us the latest) 
    3. docker images (check to see we have mongo with latest tag )
    4. docker run --name mongodb mongo:latest (naming database)
    5. docker run -d -p 27017-27019:27017:27019 --name mongodb mongo:latest (runing databse to that port)
    6. docker exec -it mongodb bash (to get the shell client for mongodb)
        1. show dbs
        2. show collections
        ...
    7. docker system prune -a --volumes (to remove all the images, volumes)    

Rest API
    using lombok 
    
    @AllArgsConstructor , @Getter &  @Setter
    //MongoDB annotation
    @Document(collection = "cards") 
    public class Card {
    }

Rest Endpoint 
    
    http://localhost:8080
    
    {
    _links: {
       - cards: {
             href: "http://localhost:8080/cards{?page,size,sort}",
             templated: true,
        },
       - profile: {
            href: "http://localhost:8080/profile"
                },
        }
    }
    
    http://localhost:8080/cards
    {
    _embedded: {
    cards: [ ]
    },
    _links: {
        self: {
            href: "http://localhost:8080/cards{?page,size,sort}",
            templated: true,
            },
        profile: {
            href: "http://localhost:8080/profile/cards"
            },
        search: {
            href: "http://localhost:8080/cards/search"
            },
          },
        page: {
            size: 20,
            totalElements: 0,
            totalPages: 0,
            number: 0,
        },
    }
    
ActiveMQ  Message 
 

