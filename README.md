
# Tutorial: OCL in Ecore, Transactions, Compare, and Forms

* Create an Ecore model via the OCLinEcore editor
* Incorporate EMF Transactions

## OCLinEcore

### Overview

* Walk enough through the tutorial to create an Ecore meta-model
* Write an operation that performs a trivial query
* Generate Java code and execute the query with and without valid values

### Tutorial

Main plugins:

* /us.coastalhacking.tutorial.ocl.ecore: contains main Ecore meta-model
* /us.coastalhacking.tutorial.ocl.model: auto-generated source
* /us.coastalhacking.tutorial.ocl.model.tests: manually created fragment project test

Synopsis:

* Use LPG for default OCL delegate
* Set generate java code in `*Impl` classes in OCL preferences
* Write Ecore meta-model with a query
* Generate GenModel
* Generate code & save via GenModel

### Bugs

#### Generation Breaks Ecore

Note that the import `import ecore : 'http://www.eclipse.org/emf/2002/Ecore' ;`
is changed from the tutorial `import ecore : 'http://www.eclipse.org/emf/2002/Ecore#/';`, seemingly after GenModel generation.
It also removes the `: ecore::EDate[?]` part in the Ecore model, which breaks the meta-model `Loan` and this line: `attribute date : ecore::EDate[?];`.
This leaves just `attribute date` after generating a model, resulting in a lot of errors in the Problems view.

Work-around:

* Close Ecore and GenModel editors
* Opened the Ecore one and removed the affected line, saved the Ecore. Added the line back in, saved the model. I might have re-generated in-between, forgot.

### Links

* [Tutorial](https://help.eclipse.org/photon/index.jsp?topic=%2Forg.eclipse.ocl.doc%2Fhelp%2FTutorials.html&anchor=OCLinEcoreTutorialHelpers)

* [Meta-Model used for tutorial](https://help.eclipse.org/photon/topic/org.eclipse.ocl.doc/references/4100-metamodel3.oclinecore)

* [The OCLinEcore Language reference](http://help.eclipse.org/photon/topic/org.eclipse.ocl.doc/help/OCLinEcore.html?cp=75_1_2)

* [Fast, Faster, Fastest Queries](https://www.eclipsecon.org/europe2012/sites/eclipsecon.org.europe2012/files/FastQueries.pdf): talks about using OCL via generated java for "fast" speed.

## EMF Transactions

### Overview

#### Part 1

* Modify the existing Ecore to use cross-references for the Library containers
* Re-generate models and also create both edit and editor plugins
* Create two editing domains for two resources, each using the Library as its root model
* Modify editors to use correct content label adapters and property sheet adapters

#### Part 2

* Modify to use a workspace transactional editing domain
* Include everything needed to monitor and respond via changes

### Tutorial

TODO

### Links

These currently point to an ad-heavy site. I saved as PDF via selecting the text.

[EMF Transactions and Workspace integration](https://www.linuxtopia.org/online_books/eclipse_documentation/eclipse_emf_model_transaction_developer_guide/nav/eclipse_emf_model_transaction_12)

## EMF Compare

### Overview

Simulate how a comparison with a merge conflict works

### Tutorial

TODO

### Links

[Vogella EGit Overview](http://www.vogella.com/tutorials/EclipseGit/article.html)

[EclipseSource EGit and Compare](https://eclipsesource.com/blogs/2015/04/13/collaborative-modeling-with-papyrus-emf-compare-and-egit/)


## EMF Forms

* Create a basic view change
* Model references in an intuitive way (such as creating a new one)
 
### Tutorial

TODO

### Links

[Getting started with EMF Forms](https://eclipsesource.com/blogs/tutorials/getting-started-with-EMF-Forms/)
[EMF Forms: View Model Element](https://eclipsesource.com/blogs/tutorials/emf-forms-view-model-elements/)
[How to customize with EMF Forms](https://eclipsesource.com/blogs/tutorials/how-to-customize-emf-forms/) 





