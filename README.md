# Citizen Intelligence Agency

Tracking politicians like bugs. Citizen Intelligence Agency is independent and non-partisan voluntary project.



# Goal

Visualize political activity in Sweden, present key performance indicators and metadata for the actors on national level.



# Demo https://www.hack23.com/cia/

Still prototype, live demo running at [https:/www.hack23.com/cia/](https:/www.hack23.com/cia/).

Using open data from  [http://data.riksdagen.se/](http://data.riksdagen.se/) , [http://www.val.se/](http://www.val.se/) and [http://data.worldbank.org/](http://data.worldbank.org/) .

Currently the application displays data, metadata and charts for data related to Swedish parliament and government. Covering parliament members, committees, documents, ballots, decisions, ministries, government members and political parties.

Limited functionality proper navigation, descriptions,content, ui and styling are still not in place.



# Roadmap

Plan to make it public some time after 2018.04, running Ubuntu 18.04, Postgresql 9.6+, JDK9, Spring framework 5.x , Hibernate 6.x, Vaadin 8.x.



#Resources

Project documentation [http://cia.sourceforge.net/](http://cia.sourceforge.net/)

Github source code location [https://github.com/Hack23/cia](https://github.com/Hack23/cia)

Build server, jenkins [https://www.hack23.com/jenkins/](https://www.hack23.com/jenkins/)

QA report, sonarqube [https://www.hack23.com/sonar/](https://www.hack23.com/sonar/)

Repository manager, nexus [https://www.hack23.com/nexus/](https://www.hack23.com/nexus/)



# Installing Debian/Ubuntu package

 Currently only build a debian package, works with debian and ubuntu 14.04,14.10,15.04,15.10,16.04


1. Installing database(postgres) and openjdk

```
$ sudo apt-get install openjdk-8-jdk postgresql pgadmin3
```


2. Installing Oracle JDK 8 on Ubuntu

First you need to add webupd8team Java PPA repository in your system and install Oracle Java 8 using following set of commands.

```
$ sudo add-apt-repository ppa:webupd8team/java
$ sudo apt-get update
$ sudo apt-get install oracle-java8-installer oracle-java8-unlimited-jce-policy
```

3. Create empty database

Below description set the default username/password and database name used for development, recommend using custom credentials and update the configuration at /opt/cia/webapps/cia/WEB-INF/database.properties to define your own username/password and database name.

```
$ sudo su - postgres
$ psql
postgres=# CREATE USER eris WITH password 'discord';
postgres=# CREATE DATABASE cia_dev;
postgres=# GRANT ALL PRIVILEGES ON DATABASE cia_dev to eris;
```

4. Modify postgres setting, enable prepared transactions

Edit file "/etc/postgresql/9.5/main/postgresql.conf" set

```
max_prepared_transactions = 100
```


5. Modify postgres setting
Edit file "/etc/postgresql/9.5/main/pg_hba.conf" add line

```
host all all ::1/128 md5
```


6. Restart postgres

```
$ service postgresql restart
```

7. Get cia debian package and


```
$ wget https://oss.sonatype.org/content/repositories/releases/com/hack23/cia/cia-dist-deb/2016.7.28/cia-dist-deb-2016.7.28.deb
```


8. Install debian package

```
$ sudo dpkg -i cia-dist-deb-2016.7.5.deb
```


9. Access the server at [http://localhost:2323/cia/](http://localhost:2323/cia/) .