package services;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisCluster;

import java.time.ZonedDateTime;

public class RedisConnector {

    private static Jedis conn;

    private RedisConnector() {
    }

    public static void kick() {
        conn = new Jedis("127.0.0.1");
        conn.set("APPLICATION_BOOT_JAVA_MONOLITH", ZonedDateTime.now().toInstant().toString());
    }

    public static Jedis getCluster() {
        if (RedisConnector.conn == null)
            throw new IllegalStateException("Cluster does not seem initialized, carefull about lifecycle !");
        return conn;
    }
}
