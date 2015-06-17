Product: Single Page Web Application with REST for Student information handling.

Pre-requisites:

 - Maven 3.x
 - Java 1.7 or above
 - JBoss AS 7

Used Technologies/Frameworks:

 - Spring v4.0
 - Cassandra
 - AngularJS v1.3.0
 - Bootstrap v3.1.1

Tested Platform: 

 - Microsoft WINDOWS V-8

Steps to follow in setting integration test.

 1. Create a clone or download the zip file of the git repository.

 2. Configure Cassandra instance details in "config.properties" file in the location "{Project_Directory}/src/main/resources".
       
      Create a keyspace in cassandra using the following command.
        CREATE KEYSPACE student_info WITH replication = {'class': 'SimpleStrategy', 'replication_factor': 1};
      	
      Create a table in cassandra using the following command.
        CREATE TABLE student (
	      id text PRIMARY KEY,
	      student_number text,
	      gender text,
	      birth_date timestamp,
	      disability boolean,
	      first_name text,
	      last_name text,
	      email text
        );
       
      i)   cassandra.contactpoints - node addresses of the Cassandra instance.
      ii)  cassandra.port          - Hosted port number (Default port number is: 9042).
      iii) cassandra.keyspace      - The name of the database to be used (Default value is set to 'student_info').
	
 3. Navigate to project directory containing the "pom.xml" file and run the following command.
      $ mvn clean install

 4. Deploy the file "studentApp.war" in the location "{Project_Directory}/target" to JBoss.

 5. Use the following URL format to access the deployed application.
      http://{Host_Name}:{Port}/studentApp/
	