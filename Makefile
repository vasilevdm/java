java:
	@docker compose run --rm java javac $(ARGS).java
	@docker compose run --rm java java $(ARGS)