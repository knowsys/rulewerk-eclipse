# RuleWerk-Plugin


A java Xtext plugin for the [rule language](https://github.com/knowsys/rulewerk/wiki#rule-language) of [Rulewerk](https://github.com/knowsys/rulewerk), see (https://github.com/knowsys/rulewerk/wiki/Rule-syntax-grammar) to know about the syntax of Rulewerk and (https://github.com/knowsys/rulewerk/wiki/Rule-syntax-by-examples) to look at some examples of using Rulewerk syntax

Usage
------------

* Import the cloned folder as an existing maven project
* Run ```mvn clean install```
* Refresh all the projects in java
* create a new folder with the name ```xtend-gen``` in the three modules ```rulewerkplugin.ide```, ```rulewerkplugin.ui``` and ```rulewerkplugin.ui.tests```
* Run the main project ```rulewerkplugin``` as an Eclipse Application

General information
------------

* The grammar file is found in ```rulewerkplugin/src/rulewerkplugin``` under the name of ```Rulelang.xtext```, you can edit the grammar in this file and then run the file as Generate Xtext Artifacts before running the application to apply the grammar changes
* For more information regarding implementing a certain feature in xtext and the importance of each module in the project, see [Xtext Documentation](https://www.eclipse.org/Xtext/documentation/310_eclipse_support.html)
