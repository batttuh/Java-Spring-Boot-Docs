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

<h2> IoC and Dependency Injection</h2>

- IoC( inversion of control) we can control which classes are alternative theirselves
- bean is java class for IoC in the beans there is a bean and we named id like <bean id="database" class="springIntro.CustomerDal"> if there is request for database we give CustomerDal
 - <h3> Class Injection</h3>
- in the main ClassPathXmlApplicationContext("file name") we need to delete modules and we take this bean using variableName.getBean("database") if the constructere has paramater we need to use <constructer-arg ref="other bean id"/>
- if we use getter setter we need to use <property name="customerDal(which property)" ref="which wants to be run id">
- <h3> String Injection</h3>
- For using connection String 
- We need to use value change ref
- we can use values.properties for values define we are using this sqlConnectionString=loremlorem
- we are using <context:property-placeholder location="classpath:values.properties"/> for using values.properties
