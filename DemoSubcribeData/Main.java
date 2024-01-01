package org.example;

import com.hivemq.client.mqtt.MqttClient;
import com.hivemq.client.mqtt.mqtt5.Mqtt5BlockingClient;

import static com.hivemq.client.mqtt.MqttGlobalPublishFilter.ALL;
import static java.nio.charset.StandardCharsets.UTF_8;

public class Main {

    public static void main(String[] args) throws Exception {

        final String host = "6013f541d4ae432aa706c26260fcf199.s1.eu.hivemq.cloud";
        final String username = "tranngocbao";
        final String password = "Tranbao12623";

        // create an MQTT client
        final Mqtt5BlockingClient client = MqttClient.builder()
                .useMqttVersion5()
                .serverHost(host)
                .serverPort(8883)
                .sslWithDefaultConfig()
                .buildBlocking();

        // connect to HiveMQ Cloud with TLS and username/pw
        client.connectWith()
                .simpleAuth()
                .username(username)
                .password(UTF_8.encode(password))
                .applySimpleAuth()
                .send();

        System.out.println("Connected successfully");

        // subscribe to the topic "NamDinh/data"
        client.subscribeWith()
                .topicFilter("NamDinh/data")
                .send();

        // subscribe to the topic "NamDinh/warning/1"
        client.subscribeWith()
                .topicFilter("NamDinh/warning/1")
                .send();

        // subscribe to the topic "NamDinh/warning/2"
        client.subscribeWith()
                .topicFilter("NamDinh/warning/2")
                .send();

        // subscribe to the topic "NamDinh/warning/3"
        client.subscribeWith()
                .topicFilter("NamDinh/warning/3")
                .send();

        // set a callback that is called when a message is received (using the async API style)
        client.toAsync().publishes(ALL, publish -> {
            System.out.println("Received message: " +
                    publish.getTopic() + " -> " +
                    UTF_8.decode(publish.getPayload().get()));
        });
    }
}
