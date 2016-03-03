Pyjama
===
Pyjama is a research project and it aims at supporting OpenMP-like directives for Java.

Programming in Pyjama integrates the benefits of using the directives based incremental parallelism with the high level object oriented programming, in this case Java. Thus, when working in Java, the Pyjama directives can be used to add expressive parallelism and concurrency, without the need to introduce major restructuring or reimplementation.


Build the Project
---

### Prerequisite

+ [ant](http://ant.apache.org/) is properly installed on your system.
+ Java 1.6 or later.

Additionally, [ivy](http://ant.apache.org/ivy/) is needed. If it is not installed on your system, within any project with ant `build.xml` file in it, use following command to install it automatically (internet access required).

	$ ant install-ivy
	
As simple as that.

### Build by Ant (Command Line Interface)

Commonly used commands:

Option		|	Description 
:---		|	:--- 
compile		|	Compile all Java files into class files (into folder target/classes/). 
install-ivy	|	Install ivy if it is not properly installed. 
test		|	Run all JUnit tests, output report into `target/report/` folder. 
main		|	Default option, equivalent of compile + test. 
build		|	Build .jar file without any dependencies.
package-all	|	Build .jar file with all dependencies and package sources and javadoc as jar files.

Use following command to view available options.

	$ ant -p

### Import the Project into Eclipse

Check out the project from Github:

	$ git clone origin https://github.com/ParallelAndReconfigurableComputing/Pyjama.git
	
In Eclipse:

1. `File` -> `New` -> `Java Project`. Disable the `Use default location` checkbox. Fill the path of your newly checked out project into the `Location` box.
2. Press `next`. Adjust the settings accordingly. Remember to `Add folder 'test' to build path` in order to integrate JUnit into the project.
3. Press `finish`.

### Run Ant Task in Eclipse

1. Right click `build.xml` in the Package Explorer view. `Run As` -> `Ant Build...`.
2. Choose the target(s) to run.

For newly checked out project, you may want to run one of the `ant main`/`ant compile`/`ant test`/`ant build` at least once to get all the missing dependencies into position (`lib`).

If it fails and notify you that it cannot find the `ivy` installed in your system, run `ant install-ivy` (it's an one-off process). Make sure that you have access to the internet when doing so.
