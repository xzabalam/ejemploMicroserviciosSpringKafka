# Configuración 
Para que el aplicativo funcione se debe crear las siguientes variables de entorno 

- TWITTER_BEARER_TOKEN
  - Contiene el código bearer token de acceso a twitter
- JASYPT_ENCRYPTOR_PASSWORD_USERNAME
  - Es el nombre de usuario que se debe usar para conectarse al servidor de configuración.
- JASYPT_ENCRYPTOR_PASSWORD_SECRET
  - la clave encriptada (secreto) en jasypt que se genera en el proyecto playground.
- JASYPT_ENCRYPTOR_PASSWORD_PHRASE
  - La frase pública que servirá para desencriptar el secreto

# Inicialización
Para  inicializar los contenedores, nos ubicamos en la carpeta docker-compose en donde están los archivos: 
- common.yml 
- kafka_cluster.yml 
 
Ejecutamos el comando:

```bash
docker-compose -f common.yml -f kafka_cluster.yml up
```

# Deploy del artefacto
Nos ubicamos en la carpeta root y compilamos el código con el comando 
```bash
mvn clean install
```

Desde Intellij Idea deployamos el módulo twitter-to-kafka-service y en la consola se imprimirá los twitts que son enviados a kafka. 


# Se añade un servicio que contiene la configuración común a todos los microservicios
## Orden de deploy
- config-server
- twitter-to-kafka-service