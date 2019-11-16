docker build -t springdb:1.0 .   --creating image for my app, specified from my docker

docker pull mysql:5.6

docker run --name=mysql-dev-server -e MYSQL_ROOT_PASSWORD=test -e MYSQL_USER=test -e MYSQL_PASSWORD=test -e MYSQL_DATABASE=testdb -d -p 3306:3306 mysql

docker run --name spring-data-cont -d --link mysql-dev-server -p 8080:8080 springdb:1.0
