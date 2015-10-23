#tesla-kafka-logging

> "The harness of waterfalls is the most economical method known for drawing energy from the sun" - Niloka Tesla

Provides dependencies for logging to a kafka queue using Daniel Wegener's [logback-kafka-appender](https://github.com/danielwegener/logback-kafka-appender). 
This is to save us the hassle of including and maintaining several dependencies in each and every of our [tesla-microservice](https://github.com/otto-de/tesla-microservice) instances.

`[de.otto/tesla-kafka-logging "0.1.0"]`

[![Build Status](https://travis-ci.org/otto-de/tesla-kafka-logging.svg)](https://travis-ci.org/otto-de/tesla-kafka-logging)
[![Dependencies Status](http://jarkeeper.com/otto-de/tesla-kafka-logging/status.svg)](http://jarkeeper.com/otto-de/tesla-kafka-logging)

## Configuration

See `./resources/logback.xml` for an example config that assumes `$HOST` and `$KAFKA_LOGGING_HOSTS` are defined and that logs to both, kafka and console. 

## License
Apache License
