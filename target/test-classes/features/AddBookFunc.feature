@add
Feature: Add Book Functionality

	Background:
		#@PROF-229
		Given the librarian logged in the application

	
	@PROF-232 @PROF-270 @book
	Scenario: Add Book Function (Cucumber)
		Given user clicks on book module
		And user clicks on Add Book button
		When user fills each add book parameters on add book window
		And user clicks on save changes button
		Then new added book will appear on book management page

	@PROF-269 @book
	Scenario: Add Book Parameters
		Given user clicks on book module
		And user clicks on Add Book button
		When user fills each add book parameters on add book window
		And user clicks on save changes button
		Then new added book will appear on book management page


	@PROF-271 @PROF-270
	Scenario: ISBN Function (Cucumber)
		When user clicks on book module
		And user clicks on Add Book button
		And user clicks on ISBN box
		Then user enters ISBN data


	@PROF-272 @PROF-270
	Scenario: Year Function (Cucumber)
		When user clicks on book module
		And user clicks on Add Book button
		And user clicks on Year box
		Then user enters Year data


	@PROF-273 @PROF-270
	Scenario: Book Categories (Cucumber)
		When user clicks on book module
		And user clicks on Add Book button
		When the user clicks on Book Category dropdown
		Then the user should see following options
			| Action and Adventure    |
			| Anthology               |
			| Classic                 |
			| Comic and Graphic Novel |
			| Crime and Detective     |
			| Drama                   |
			| Fable                   |
			| Fairy Tale              |
			| Fan-Fiction             |
			| Fantasy                 |
			| Historical Fiction      |
			| Horror                  |
			| Science Fiction         |
			| Biography/Autobiography |
			| Humor                   |
			| Romance                 |
			| Short Story             |
			| Essay                   |
			| Memoir                  |
			| Poetry                  |