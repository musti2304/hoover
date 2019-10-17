package Database;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;

public class DatabaseConnection {

    private String databaseHost;
    private Integer databasePort;
    private MongoClient mongoClient;
    private MongoDatabase mongoDatabase;
    private MongoCollection<Document> mongoCollection;

    /**
     * {@link DatabaseConnection}
     *
     * @param databaseHost    Host
     * @param databasePort    Port
     * @param mongoDatabase   Database
     * @param mongoCollection Collection
     */
    public DatabaseConnection(String databaseHost, Integer databasePort, String mongoDatabase, String mongoCollection) {

        this.databaseHost = databaseHost;
        this.databasePort = databasePort;

        this.mongoClient = new MongoClient(databaseHost, databasePort);
        this.mongoDatabase = mongoClient.getDatabase(mongoDatabase);
        this.mongoCollection = this.mongoDatabase.getCollection(mongoCollection);
    }

    /**
     * @return String
     */
    public String getDatabaseHost() {
        return databaseHost;
    }

    /**
     * Database Host (Default: localhost)
     *
     * @param databaseHost {@link String}
     */
    public void setDatabaseHost(String databaseHost) {
        this.databaseHost = databaseHost;
    }

    /**
     * @return {@link Integer}
     */
    public Integer getDatabasePort() {
        return databasePort;
    }

    /**
     * Database Port (Default: 27017)
     *
     * @param databasePort {@link Integer}
     */
    public void setDatabasePort(Integer databasePort) {
        this.databasePort = databasePort;
    }

    /**
     * @return {@link MongoClient}
     */
    public MongoClient getMongoClient() {
        return mongoClient;
    }

    /**
     * @param mongoClient {@link MongoClient}
     */
    public void setMongoClient(MongoClient mongoClient) {
        this.mongoClient = mongoClient;
    }

    /**
     * @return {@link MongoDatabase}
     */
    public MongoDatabase getMongoDatabase() {
        return mongoDatabase;
    }

    /**
     * @param mongoDatabase {@link MongoDatabase}
     */
    public void setMongoDatabase(MongoDatabase mongoDatabase) {
        this.mongoDatabase = mongoDatabase;
    }

    /**
     * @return {@link MongoCollection}
     */
    public MongoCollection<Document> getMongoCollection() {
        return mongoCollection;
    }

    /**
     * @param mongoCollection {@link MongoCollection}
     */
    public void setMongoCollection(MongoCollection<Document> mongoCollection) {
        this.mongoCollection = mongoCollection;
    }
}
