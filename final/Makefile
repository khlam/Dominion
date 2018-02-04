ALL_FILES = src/main/java/dominion/Dominion.java src/main/java/dominion/Player.java src/main/java/dominion/Game.java src/main/java/dominion/Card.java src/main/java/dominion/Treasure.java src/main/java/dominion/Adventure.java src/main/java/dominion/Victory.java

default: all

all: $(ALL_FILES) lamki_dom mvn_comp		#compile all
	
mvn_comp: $(ALL_FILES)
	mvn compile

lamki_dom: $(ALL_FILES) 					#compile game into executable 
	javac -d . $(ALL_FILES)
	echo Main-Class: dominion.Dominion > dominion/manifest.txt
	jar cvfm lamki_dom.jar dominion/manifest.txt dominion/*.class
	chmod +x lamki_dom.jar
	rm -f -rf dominion/

run: lamki_dom 								#run game
	java -jar lamki_dom.jar

#evo: mvn_comp
	#java -jar evosuite-1.0.3.jar -generateSuite -class dominion.Dominion -projectCP target/classes
	#java -jar evosuite-1.0.3.jar -generateSuite -class dominion.Victory -projectCP target/classes -Dsearch_budget=1200  -Dstopping_condition=MaxTime
	#java -jar evosuite-1.0.3.jar -generateSuite -class dominion.Treasure -projectCP target/classes -Dsearch_budget=1200  -Dstopping_condition=MaxTime
	#java -jar evosuite-1.0.3.jar -generateSuite -class dominion.Player -projectCP target/classes -Dsearch_budget=1200  -Dstopping_condition=MaxTime
	#java -jar evosuite-1.0.3.jar -generateSuite -class dominion.Game -projectCP target/classes -Dsearch_budget=1200  -Dstopping_condition=MaxTime
	#java -jar evosuite-1.0.3.jar -generateSuite -class dominion.Card -projectCP target/classes -Dsearch_budget=1200  -Dstopping_condition=MaxTime
	#java -jar evosuite-1.0.3.jar -generateSuite -class dominion.Adventure -projectCP target/classes -Dsearch_budget=1200  -Dstopping_condition=MaxTime
	#python pitfix.py 						# This will fix the EvoSuite tests so PiTest can run them
	#rm -r src/test/java/
	#rm -rf evosuite-report/
	#mv -f evosuite-tests/ src/test/java/

tests: 										#run all tests
	mvn test

pitest:										#run mutation coverage
	mvn clean
	mvn test
	mvn org.pitest:pitest-maven:mutationCoverage

coverage: mvn_comp 							#run tests with coverage
	mvn cobertura:cobertura site

clean: 										#clean dir
	rm -f -rf dominion/
	rm -f lamki_dom.jar	
	mvn clean
