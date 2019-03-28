# showme-springboot-jwt

User registration with JWT

Just clone the repo, run <b>mvn spring-boot:run</b> and test the sample request

```
curl --header "Content-Type: application/json" --request POST --data '{"email": "davi@test.com", "password": "test"}' \-6 http://localhost:8080/cadastrar
```

You can create a container image by running <b>mvn docker:build</b>
