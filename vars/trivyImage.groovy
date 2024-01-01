def call() {
    sh 'trivy image anrs125/youtube:latest > trivyimage.txt'
}
