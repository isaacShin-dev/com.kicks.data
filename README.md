# com.kicks.data

>Local Database Docker container build 
>> 

```
docker run -d -it --name kkdb -v C:\dev\storage\kkdb:/bitnami/postgresql -p 5432:5432 -e POSTGRESQL_USERNAME=admin -e POSTGRESQL_PASSWORD=1234 -e POSTGRESQL_POSTGRES_PASSWORD=1234 -e POSTGRESQL_DATABASE=kkdb bitnami/postgresql


