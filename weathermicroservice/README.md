* テスト、ビルド、Dockerへデプロイ
mvn package docker:build

* Docker上で起動
docker run -e "SPRING_PROFILES_ACTIVE=prod" -p 8080:8081 -t ric/weathermicroservice

* サービスへアクセス
http://192.168.99.100:8080/weather/

