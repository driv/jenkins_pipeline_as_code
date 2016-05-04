echo "Starting pipeline"

node {
	sh './api/gradlew build -p api'
	stash includes: 'api/build/libs/gs-spring-boot-0.1.0.jar', name: 'appJar'
}
