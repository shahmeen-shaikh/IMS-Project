Coverage: 66.8%

IMS Project- 
This inventory management system was created to allow users to interact with it through a CLI (command line interface). The IMS uses CRUD functions to allow user to work with customers, items and orders with ease and efficiency.


## Getting Started

These instructions will get you a copy of the project up and running on your local machine for development and testing purposes. See deployment for notes on how to deploy the project on a live system.

### Prerequisites

What things you need to install the software and how to install them

Java Development kit -https://www.oracle.com/java/technologies/downloads/
MySQL, Workbench - https://dev.mysql.com/downloads/mysql/
Eclipse IDE - https://www.eclipse.org/downloads/
Git/git bash- https://git-scm.com/download/mac
Apache Maven - https://maven.apache.org/download.cgi


### Installing

A step by step series of examples that tell you how to get a development env running
1. Fork IMS Project and Build repository where you want project to go. Then copy SSH code.
2. Open up terminal at local folder, type "git clone" followed by SSH code URL.
3. Open up eclipse and import IMS Project folder where you cloned into.
4. Open up SQL work bench, test connection.If successful go over to eclipse file called 'db.properties' and enter your SQL password where it says password. This is going to establish the connection.
5. Then you can start working on the project.


## Running the tests
Prerequisites will ensure you're able to run tests in eclipse. 
1.Right click folder you want to test.
2.Scroll down to 'Coverage as'.
3.Select 'JUnit test'.
This will run a series of tests and return you a value which will indicate the full coverage of your project. It will also provide further details such as how many tests failed and why they failed so you can make an attempt to recitify the errors and potentially bring your coverage up.


### Unit Tests 
In unit testing, smaller blocks of code are tested logically by setting up conditions before they are tested.

```
@Test
	public void testToString() {
		customer = new Customer(id, firstName, surname);
		assertEquals(("id:" + customer.getId() + " first name:" + customer.getFirstName() + " surname:" + customer.getSurname()), customer.toString());
	}
```

### Integration Tests 
The purpose of integration testing is to check if components of a program work together logically.

```
@Test
	public void testUpdate() {
		Item item = new Item(1L, "Makeup", (double)100.00);

		Mockito.when(this.utils.getLong()).thenReturn(1L);
		Mockito.when(this.utils.getString()).thenReturn(item.getName());
		Mockito.when(this.utils.getDouble()).thenReturn(item.getPrice());
		Mockito.when(this.DAO.update(item)).thenReturn(item);

		assertEquals(item, this.controller.update());

		Mockito.verify(this.utils, Mockito.times(1)).getLong();
		Mockito.verify(this.utils, Mockito.times(1)).getString();
		Mockito.verify(this.utils, Mockito.times(1)).getDouble();
		Mockito.verify(this.DAO, Mockito.times(1)).update(item);
	}
```


## Built With

* [Maven](https://maven.apache.org/) - Dependency Management

## Versionining 

GitHubfor versioning.

## Authors

* **Shahmeen Shaikh** - *IMS Project* - https://github.com/shahmeen-shaikh/IMS-Project

## License

This project is licensed under the MIT license - see the [LICENSE.md](LICENSE.md) file for details 

*For help in [Choosing a license](https://choosealicense.com/)*

## Acknowledgments

* Massive thanks to all the members in my cohort and all the trainers that have helped me delevlop my skills!
