# Medical API Proof of Concept

This project provides a minimal Spring Boot application (Java 17) that exposes
reference data for medical asset and act types. It also ships with an OpenAPI
3.0 specification describing the HTTP contract.

## Requirements

- Java 17+
- Maven 3.9+

## Running the application

```bash
mvn spring-boot:run
```

The API will be available at `http://localhost:8080`.

### Available endpoints

- `GET /api/v1/medical-asset-types`
- `GET /api/v1/medical-acts-type`

Interactive documentation is exposed via Springdoc OpenAPI at
`http://localhost:8080/swagger-ui.html`.

The corresponding OpenAPI definition is stored in
[`src/main/resources/openapi/medical-api.yaml`](src/main/resources/openapi/medical-api.yaml).
