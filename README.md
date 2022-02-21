# com.kicks.data

>Local Database Docker Publish

```
docker run -d -it --name kkdb -v /Users/isaac/Desktop/Project/storage/kkdb:/bitnami/postgresql \
  -p 5432:5432 \
  -e POSTGRESQL_USERNAME=admin \
  -e POSTGRESQL_PASSWORD=1234 \
  -e POSTGRESQL_POSTGRES_PASSWORD=1234 \
  -e POSTGRESQL_DATABASE=kkdb \
bitnami/postgresql 
