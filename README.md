# spring-boot-mongodb
https://github.com/glory2018/spring-boot-mongodb.git
#创建nginx容器
docker pull nginx

docker run -p 80:80 -d nginx:latest

#创建MongoDB容器
docker pull mongo:4.2

docker run -p 27017:27017 -d mongo:4.2
