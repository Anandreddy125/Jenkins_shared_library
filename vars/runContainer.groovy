def call(){
    sh "docker run -d --name youtube1 -p 3000:3000 anrs125/youtube:latest"
    sh "docker run -d --name youtube2 -p 80:8080 anrs125/youtube:latest"
}
