## Docker
### postgres

Step by step:
```
docker run --name todo-postgres -e POSTGRES_PASSWORD=db_3curity_p@$$ -d -p 5432:5432 postgres:alpine

docker ps

docker port todo-postgres

docker exec -it af99a45432d5 bin/bash

bash> psql -U postgres

bash> \c tododb

bash> \dt

bash> \d todo   
```