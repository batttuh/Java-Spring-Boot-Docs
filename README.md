# Java-Spring-Boot-Docs

<h2> IoC and Dependency Injection with xml</h2>

- IoC( inversion of control) we can control which classes are alternative theirselves
- bean is java class for IoC in the beans there is a bean and we named id like <bean id="database" class="springIntro.CustomerDal"> if there is request for database we give CustomerDal
- <h3> Class Injection</h3>
- We need firstly application.context 
- in the main ClassPathXmlApplicationContext("file name") we need to delete modules and we take this bean using variableName.getBean("database") if the constructere has paramater we need to use <constructer-arg ref="other bean id"/>
- if we use getter setter we need to use <property name="customerDal(which property)" ref="which wants to be run id">
- <h3> String Injection</h3>
- For using connection String 
- We need to use value change ref
- we can use values.properties for values define we are using this sqlConnectionString=loremlorem
- we are using <context:property-placeholder location="classpath:values.properties"/> for using values.properties
<h2> Annotation Injection </h2>

- @Component("name of component") we need to write at up to the class we need to write (Component Scan) <context:component-scan base-package="package name">

<h2> IoC with class</h2>

- We need to write IocConfig class and we need to add @Configuration and @ComponentScan("package name")
- We need to use AnnotationConfigApplicationContext(IocConfig.class);
- we can define bean in IocConfig 
- <h3> Property Injection </h3>
- We need to write annotation @PropertySource("(Filepath) classpath:values.properties")
- At the normal class we need to add @Value("${valuename}");

```Java

@Bean
public ICustomerDal database(){
 return new MsSqlCustomerDal
 
}

@Bean
public ICustomerService service(){
return new CustomerManager(database()); 

}
```

<h2> Hibernate</h2>

- We can use ORM with hibernate and easily manage the database
- use the model class we need to use @Entity javax.persistence.Entity (database variable) and then @Table(name="database name")
- for column we use @Id @Column(name="ID")
- SessionFactory creating just one times and we need to import org.hibernate
```Java

SessionFactory factory=new Configuration().configure("cml path").addAnnotatedClass("annotated class").buildSessionFactory();
Session session=factory.getCurrentSession
try{
session.beginTransaction();
//HQL hibernate query langugage
//Select * from city
List<City> cities=session.createQuery("from (className)").getResultList();

 List<City> cities=session.createQuery("from (className) c where c.countryCode=`TUR `").getResultList();
 List<City> cities=session.createQuery("from (className) c where c.countryCode=`TUR ` AND ").getResultList();
 List<City> cities=session.createQuery("from (className) c where c.countryCode=`TUR ` OR ").getResultList();
 List<City> cities=session.createQuery("from (className) c where c.name LIKE `%kar%`").getResultList();
 // ASC-Ascending
 //DESC-Descending
 List<City> cities=session.createQuery("from (className) c ORDER BY c.name").getResultList();
 //Group By make grup with something it does not even include repetitive value
 List<City> cities=session.createQuery("from (className) c GROUP BY c.name").getResultList();
// just take one column
 List<String> cities=session.createQuery("select c.countryCode from (className) c GROUP BY c.name").getResultList();
//Insert
City city=new City();
session.save(city);
//Update
City city=session.get(City.class,4086);
city.setPopulcation();
session.save(city);
//DELETE
City city=session.get(City.class,4086);
session.delete(city);
//
session.saveOrUpdate
session.getTransaction().commit;

}finally{
 factory.close
}

```

<h2> Maven</h2>

- Managing jar file
- project template
- version control
- https://mvnrepository.com/
- <maven.compiler.target>1.jdk</maven.compiler.target>
- <maven.compiler.source>1.jdk</maven.compiler.source>
- For update click right project>maven>updateProject

<h2>Spring Initializr</h2>

- We can start easily with using this web page
- https://start.spring.io/

<h2>General things</h2>

- mvnw can build maven for windows 
- SpringApplication.run(Application.class,args); for the app class
- @RestController annotation for using restApi we need to use this in controller class
- @RequestMapping("/api") is direction to link
- @GetMapping
- @PostMapping 
- @RequestBody taken parameters at request body
- making online server we need to add groupid like springframework.boot and artifactId spring-boot-devtools
- In the application.properties we define spring.datasource.url , spring.datasource.username , spring.datasource.password
- Entitites packages holds database's vraiable 
- GeneratedValue(strategy=GenerationType.Identity)
- DataAccessLayer DAL 
- Bussines package check value using if conditions  use @Service annotation
- service package 
- Aspect Oriented Programing for making this we need to use Transactional
- for session Session session=entityManager.unwrap(Session.class);
- Bussiness communicate with Dal
- In the bussiness we
- @GetMapping("/citites/{id}") we need to take it with @PathVariable int id 

<h2> MongoDb</h2>

- we use collections attribute using @Document for id @id and it needs to be in entity
- In the repositoryy folder we use interface and it extends MongoRepository<>
- @EnableMongoRepositories for the main class we are using for mongoRepo
- @Autowired using for wired repository
- ResponseEntity for returning response to server
<h2> JWT </h2>

- https://github.com/jwtk/jjwt




Repository:
Service: communicate with dal
Entity: Data models
Controller: Api written
