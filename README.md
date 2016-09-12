# XML Parser
Java app that implements XML parse using DOM and SAX

## What is this?

This is a Java app that implements XML parse using DOM and SAX based on the following features:

1) Files sample-small.xml and sample-big.xml are used for testing.

2) There is a configuration file, xmlparser.properties, where user can define the nodes (aka tags or elements)
   (e.g. ns2:Denomination) he/she is interested in (case insensitive).

3) During the parsing of the XML document, if it encounters one of a defined 
   tag, it prints the node value defined for that element as follows:

		Node {Node name} found with value {Node value}

4) Application is able to handle large files.

5) The key threshold.file.size on the configuration file defines the threshold file size 
   in bytes, e.g. threshold.file.size=20000, which is used to define large files, i.e. any 
   xml file larger than that 20,000 bytes is considered to be a large file. In this case, 
   the application uses an appropriate parsing method (SAX, instead of DOM) to be able to 
   handle large files.

General requirements:

    One should be able to compile, build, and run this application by downloading a zip file
    with source code, build configuration, and test codes, or by cloning the app on GitHub.
    The implementation should follow the best practices of software development, and
    it should include a release document explaining pre-requisites, configuration, and how to 
    run the application.

## Pre-requisites, configurations, and how to run it

1) Pre-requisites and Configurations

You will need Java 7 (or later version) and Maven installed. If you want to clone the app from GitHub,
you will need Git.

2) Get the app by one of these two methods:

2.1) Cloning the app:

git clone https://github.com/jrodolfo/xmlparser

2.2) Downloading a zip file with source code, build configuration, and test codes:

https://github.com/jrodolfo/xmlparser/blob/master/xmlparser.zip

3) Edit keys on file xmlparser.properties to configure the xml files to be parsed, which elements, and 
threshold to define big files in number of bytes

4) In order to run the application, open a command prompt and type:

    cd xmlparser
    mvn package
    java -jar target/xmlparser.jar

## To do list

1) Implement case insensitive in DomXmlParser

Best regards,

Rod Oliveira | Software Developer | jrodolfo.com | Halifax, Canada
