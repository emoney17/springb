### Run
```
java -jar target/demo-0.0.1-SNAPSHOT.jar --server.port=8080
```

### Request examples using curl

Go to [localhost:8080](http://localhost:8080) or which ever port you chose

**POST** request example:

```
curl -X POST -H "Content-Type: application/json" \
    -d '{"name": "student name", "email": "student@example.com", "dob": "1975-10-14"}' \
    localhost:8080/api/v1/student
```

**DELETE** request example:

```
curl -X DELETE localhost:8080/api/v1/student/2
```

**PUT** request example:
```
curl -X PUT -d email=newemail@example.com -d name=newname localhost:8080/api/v1/student/2
```
