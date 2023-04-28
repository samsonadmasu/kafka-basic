1. Download tar file and extract
2. rename the folder to kafka

---------------------------
1. go to bin
2. select windows

----------------------------
START THE KAFKA ENVIRONMENT
----------------------------
1. start the zookeeper server
    - go to the kafka folder and
      .\bin\windows\zookeeper-server-start.bat .\config\zookeeper.properties
      //port 2181
2. start the kafka server
    - go to kafka folder and
      .\bin\windows\kafka-server-start.bat .\config\server.properties
      //port 9092


------------------------------------
CREATE A TOPIC TO STORE YOUR EVENTS
------------------------------------
- go to kafka folder
  .\bin\windows\kafka-topics.bat --create --topic topic-name --bootstrap-server localhost:9092

-------------------------------------
WRITE SOME EVENTS INTO THE TOPIC
-------------------------------------
- go to the kafka folder
  .\bin\windows\kafka-console-producer.bat --topic topic-name --bootstrap-server localhost:9092

- to stop writing Ctrl + C

-------------------
READ THE EVENTS
-------------------
- go to the kafka folder
  .\bin\windows\kafka-console-consumer.bat --topic topic-name --from-beginning --bootstrap-server localhost:9092

________________________________________________________________________________________________________________
________________________________________________________________________________________________________________
STEP 1: DOWNLOAD AND INSTALL KAFKA
https://dlcdn.apache.org/kafka/3.2.0/...


STEP 2: START THE KAFKA ENVIRONMENT
# Start the ZooKeeper service
.\bin\windows\zookeeper-server-start.bat .\config\zookeeper.properties

# Start the Kafka broker service
.\bin\windows\kafka-server-start.bat .\config\server.properties

STEP 3: CREATE A TOPIC TO STORE YOUR EVENTS
.\bin\windows\kafka-topics.bat --create --topic topic_demo --bootstrap-server localhost:9092

STEP 4: WRITE SOME EVENTS INTO THE TOPIC
.\bin\windows\kafka-console-producer.bat --topic topic_demo --bootstrap-server localhost:9092

STEP 5:  READ THE EVENTS
.\bin\windows\kafka-console-consumer.bat --topic topic_demo --from-beginning --bootstrap-server localhost:9092
hello world
topic demo