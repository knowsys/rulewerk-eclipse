# RuleWerk-eclipse


A java Xtext plugin for the [rule language](https://github.com/knowsys/rulewerk/wiki#rule-language) of [Rulewerk](https://github.com/knowsys/rulewerk). For further information regarding the syntax of rulewerk and some of its examples see (https://github.com/knowsys/rulewerk/wiki/Rule-syntax-grammar) and (https://github.com/knowsys/rulewerk/wiki/Rule-syntax-by-examples) 

Installation
------------
* Download Xtext from Eclipse Marketplace
* Import the cloned folder as an existing maven project
* Run ```mvn clean install```
* Refresh all the projects in eclipse
* Create a new folder with the name ```xtend-gen``` in the three modules ```rls4eclipse.ide```, ```rls4eclipse.ui``` and ```rls4eclipse.ui.tests```
* Run the main project ```rls4eclipse``` as an Eclipse Application

Exporting rls4eclipse as a deployable feature
------------
* From eclipse choose ```file``` -> ```Export``` -> choose ```Deployable features``` under ```Plug-in Development```
* Select ```rls4eclipse.feature``` under ```Available Features``` and then press ```Options```
* Under ```Categorize repository``` press ```Browse```
* Choose the file ```Category.xml```
* Select ```Destination``` and then choose ```Archive file``` then press ```Browse``` and select the desired destination and file name for the feature
* Select ```Finish```

Installing rls4eclipse in eclipse
------------
* From eclipse choose  ```Help ``` >  ```Install new Software ```
* Selecet  ```Add ``` >  ```Archive ``` > Choose rls4eclipse archive file
* Tick right at  ```Uncategorized ``` then press next, finalize and accept all conditions
* Choose  ```Install anyway ```
* Select  ```Restart now ```

Currently supported xtext features
------------
* Syntax Highlighting
* Auto-completion
* Validations
* Labeling

General information
------------

* The grammar file is found in ```rls4eclipsen/src/rls4eclipse``` under the name of ```RLS.xtext```, you can edit the grammar in this file and then run the file as Generate Xtext Artifacts before running the application to apply the grammar changes
* For more information regarding implementing a certain feature in xtext and the importance of each module in the project, see [Xtext Documentation](https://www.eclipse.org/Xtext/documentation/310_eclipse_support.html)
