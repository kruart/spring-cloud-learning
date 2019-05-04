 ## Ports

|     Application       |     Port          |
| ------------- | ------------- |
| Limits Service | 8080, 8081, ... |
| Spring Cloud Config Server | 8888 |
|  |  |
| Currency Exchange Service | 8000, 8001, 8002, ..  |
| Currency Conversion Service | 8100, 8101, 8102, ... |
| Netflix Eureka Naming Server | 8761 |
| Netflix Zuul API Gateway Server | 8765 |
| Zipkin Distributed Tracing Server | 9411 |


## URLs

|     Application       |     URL          |
| ------------- | ------------- |
| Limits Service | http://localhost:8080/limits POST -> http://localhost:8080/actuator/refresh|
|Spring Cloud Config Server| http://localhost:8888/limits-service/default http://localhost:8888/limits-service/dev http://localhost:8888/limits-service/qa|
|  Currency Converter Service - Direct Call| http://localhost:8100/currency-converter/from/USD/to/UAH/quantity/10|
|  Currency Converter Service - Feign| http://localhost:8100/currency-converter-feign/from/EUR/to/UAH/quantity/10000|
| Currency Exchange Service | http://localhost:8000/currency-exchange/from/EUR/to/UAH http://localhost:8001/currency-exchange/from/USD/to/UAH|
| Eureka | http://localhost:8761/|
| Zuul - Currency Exchange & Exchange Services | http://localhost:8765/currency-exchange-service/currency-exchange/from/EUR/to/UAH http://localhost:8765/currency-conversion-service/currency-converter-feign/from/USD/to/UAH/quantity/10|
| Zipkin | http://localhost:9411/zipkin/ |
| Spring Cloud Bus Refresh | http://localhost:8080/actuator/bus-refresh |

## Zipkin Installation

Quick Start Page
- https://zipkin.io/pages/quickstart

Command to run
```
RABBIT_URI=amqp://localhost java -jar zipkin.jar
```

## VM Argument
-Dserver.port=8001
