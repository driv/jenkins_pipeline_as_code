echo "Starting pipeline"

stage 'Compilation'

node {
	sh 'ls'
	dir ('api'){
		sh 'pwd'
		sh 'ls'
		sh './gradlew build -p api'
		stash includes: 'build/libs/gs-spring-boot-0.1.0.jar', name: 'api-jar'
	}
}
