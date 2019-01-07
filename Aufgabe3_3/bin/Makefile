NAME=Aufgabe3_3

run: $(NAME).jar
	java -jar $<

$(NAME).jar: $(NAME).class
	jar cfe $@ $(NAME) $?

%.class: %.java
	javac $<

.PHONY: run
