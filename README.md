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

5) If the configuration file has defined the threshold file size 
   in bytes, e.g. threshold.file.size=20000, then any xml file larger than that 20,000 bytes
   is considered to be a large file. In this case, the application
   uses appropriate parsing method (SAX, not DOM) to be able to handle large files.

General requirements:

    Zip the source code including build, configuration source, and test codes.
    By using this zip file, one should be able to compile, build, and run your application. 
    The implementation should follow the best practices of software development, and
    it should include a release document explaining how to run the application 
    and explaining pre-requisites and configurations.

## How to run it?

1) Clone the app:

git clone https://github.com/jrodolfo/xmlparser

2) Edit keys on file xmlparser.properties to configure the xml files to be parsed, which elements, and 
threshold to define big files in number of bytes

3) Open a command prompt and type:

    mvn package
    cd target\classes
    java com.jrodolfo.xmlparser.App

## To do list

1) Fix 

Exception in thread "main" java.lang.NoClassDefFoundError: org/slf4j/LoggerFactory
        at com.jrodolfo.xmlparser.App.<init>(App.java:21)

2) Implement case insensitive in DomXmlParser

Best regards,

Rod Oliveira | Software Developer | jrodolfo.com | Halifax, Canada
