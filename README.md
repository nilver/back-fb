## back-fb. My docker version is.
Client: Docker Engine - Community
 Version:           19.03.12
 API version:       1.40
 Go version:        go1.13.10
 Git commit:        48a66213fe
 Built:             Mon Jun 22 15:43:18 2020
 OS/Arch:           windows/amd64
 Experimental:      false

Server: Docker Engine - Community
 Engine:
  Version:          19.03.12

## Get the rep
Open a terminal and type `git clone https://github.com/nilver/back-fb.git`

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
