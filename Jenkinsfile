echo "Starting pipeline"

node {
	dir ('api'){
		sh './gradlew build -p api'
		stash includes: 'build/libs/gs-spring-boot-0.1.0.jar', name: 'api-jar'
	}
}
