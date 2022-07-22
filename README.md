# Java-Spring-Boot-Docs

<h2>Spring Initializr</h2>

- We can start easily with using this web page
- https://start.spring.io/

<h2>General things</h2>

- SpringApplication.run(Application.class,args); for the app class
- @RestController annotation for using restApi we need to use this
- @RequestMapping is direction to link
- @GetMapping
- @PostMapping 
- @RequestBody taken parameters at request body

<h2> MongoDb</h2>

- we use collections attribute using @Document for id @id and it needs to be in entity
- In the repositoryy folder we use interface and it extends MongoRepository<>
- @EnableMongoRepositories for the main class we are using for mongoRepo
- @Autowired using for wired repository
- ResponseEntity for returning response to server
