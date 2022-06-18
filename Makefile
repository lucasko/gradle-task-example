
build:
	./gradlew build
	docker build -t lucasko/my-gradle:1.0 .
