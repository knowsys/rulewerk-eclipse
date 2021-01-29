# RuleWerk-eclipse


A java Xtext plugin for the [rule language](https://github.com/knowsys/rulewerk/wiki#rule-language) of [Rulewerk](https://github.com/knowsys/rulewerk). For further information regarding the syntax of rulewerk and some of its examples see (https://github.com/knowsys/rulewerk/wiki/Rule-syntax-grammar) and (https://github.com/knowsys/rulewerk/wiki/Rule-syntax-by-examples) 

Installation for development
------------
For Development make sure that Xtext 2.20 is installed from eclipse's marketplace before following these steps.
* From eclipse, select ```file``` > ```import``` > ```Maven``` > ```existing maven projects```, then select the directory of the clonned folder and press ok. Make sure that     all the projects are selected before pressing finish
* Right click on ```rls4eclipse.parent``` module and then choose ```Run As``` > ```Maven install```
* Right click on ```rls4eclipse``` module and then choose ```Run As``` > ```Eclipse Application``` (for the first time after choosing ```Run As``` the option ```Eclipse         Application``` might not be there, so instead select ```Run Configurations``` > double click on ```Eclipse Application``` and then select ```Run```
* A new eclipse window will appear but with the features of ```rls4eclipse``` loaded and ready for testing

Exporting rls4eclipse as a deployable feature
------------
* From eclipse choose ```file``` > ```Export``` > choose ```Deployable features``` under ```Plug-in Development```
* Select ```rls4eclipse.feature``` under ```Available Features``` and then press ```Options```
* Under ```Categorize repository``` press ```Browse```
* Choose the file ```Category.xml```
* Select ```Destination``` and then choose ```Archive file``` then press ```Browse``` and select the desired destination and file name for the feature
* Select ```Finish```

Installing rls4eclipse in eclipse
------------
* From eclipse choose  ```Help ``` >  ```Install new Software ```
* Select  ```Add ``` > copy the url ```https://knowsys.github.io/rulewerk-eclipse/``` to the location box > press ```Add```
* Select  ```Rulewerk ``` then press next, finalize and accept all conditions
* Choose  ```Install anyway ```
* Select  ```Restart now ```

Currently supported xtext features
------------
* Syntax Highlighting
* Auto-completion
* Validations
* Labeling
* Rename Refactoring
* Direct creation of Rulewerk files


General information
------------

* The grammar file is found in ```rls4eclipse/src/rls4eclipse``` under the name of ```RLS.xtext```, you can edit the grammar in this file and then run the file as Generate Xtext Artifacts before running the application to apply the grammar changes
* For more information regarding implementing a certain feature in xtext and the importance of each module in the project, see [Xtext Documentation](https://www.eclipse.org/Xtext/documentation/310_eclipse_support.html)
