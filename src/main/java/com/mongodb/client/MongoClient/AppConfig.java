@Configuration 
public class AppConfig {
	public @Bean MongoClient mongoClient() {
		return MongoClients.create("mongodb://localhost:27017");
	}
}