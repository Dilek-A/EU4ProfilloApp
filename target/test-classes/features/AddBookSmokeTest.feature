@add
Feature: Add Book Smoke Test

	Background:
		#@PROF-229
		Given the librarian logged in the application
		

	@PROF-262 @PROF-249
	Scenario: Add Book Functionality (Smoke Test Suit)
		When user clicks on books module
		Then Book Management page should be opened
		And the user should be able to click to Add Book button
		Then Add Book window should be opened