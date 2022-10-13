# Foobar

Foobar is a Python library for dealing with word pluralization.

## Installation

STEP 1: DOWNLOAD AND INSTALL KAFKA
https://dlcdn.apache.org/kafka/3.2.0/kafka_2.13-3.2.0.tgz

STEP 2: START THE KAFKA ENVIRONMENT
# Start the ZooKeeper service
C:\Users\RAMESH\Downloads\kafka>.\bin\windows\zookeeper-server-start.bat .\config\zookeeper.properties

# Start the Kafka broker service
C:\Users\RAMESH\Downloads\kafka>.\bin\windows\kafka-server-start.bat .\config\server.properties

STEP 3: CREATE A TOPIC TO STORE YOUR EVENTS
C:\Users\RAMESH\Downloads\kafka>.\bin\windows\kafka-topics.bat --create --topic topic_demo --bootstrap-server localhost:9092

STEP 4: WRITE SOME EVENTS INTO THE TOPIC
C:\Users\RAMESH\Downloads\kafka>.\bin\windows\kafka-console-producer.bat --topic topic_demo --bootstrap-server localhost:9092
>hello world
>topic demo

STEP 5:  READ THE EVENTS
C:\Users\RAMESH\Downloads\kafka>.\bin\windows\kafka-console-consumer.bat --topic topic_demo --from-beginning --bootstrap-server localhost:9092
hello world
topic demo
```bash
pip install foobar
```

## Usage

```python
import foobar

# returns 'words'
foobar.pluralize('word')

# returns 'geese'
foobar.pluralize('goose')

# returns 'phenomenon'
foobar.singularize('phenomena')
```

## Contributing
Pull requests are welcome. For major changes, please open an issue first to discuss what you would like to change.

Please make sure to update tests as appropriate.

## License
[MIT](https://choosealicense.com/licenses/mit/)