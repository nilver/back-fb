## back-fb
## Get the rep
`git clone https://github.com/nilver/back-fb.git`

## Go to folder
Run `cd back-fb`

## create a network.
Run `docker network create back-mysql`

## Create and run an image to mysql with new network
`docker run -d -e MYSQL_ROOT_PASSWORD=fernando -e MYSQL_DATABASE=fibonacci -e MYSQL_USER=nilver -e MYSQL_PASSWORD=fernando --name=mysql -p 3306:3306 --network=back-mysql mysql:5.7`

## Build an image using dockerfile
`docker build -t fibonacci:dockerfile1 .`

# run image 
`docker run -p 8080:8080 --network=back-mysql -e RDS_HOSTNAME=mysql fibonacci:dockerfile1`
