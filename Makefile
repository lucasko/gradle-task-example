build:
	echo "123"
	./gradlew build

build_img:
	docker build -t lucasko/my-gradle:1.0 .