# Changelog
All notable changes to this project will be documented in this file.

The format is based on [Keep a Changelog](https://keepachangelog.com/en/1.0.0/),
and this project adheres to [Semantic Versioning](https://semver.org/spec/v2.0.0.html).

## [Unreleased]

## [0.1.6] - 2019-11-29
### Added
- Added the necessary algorithms for the app and each selection plays a relevant video
- Added the computer information for all Laptop and PC results

### Changed
- Adjusted the layout of the ThirdQuestionActivity
- Adjusted the layout of the ResultActivity
- Attempted to implement the SettingsActivity

## [0.1.5] - 2019-11-28
### Added
- Added maximum and minimum budget resource files
- Added the list of desktops
- Added a Home menu item for each of the activities
- Uploaded the list of Laptops and PCs in an Excel sheet (Items.xlsx)
- Added images of desktops
- Added a background image to the ThirdQuestionActivity

### Changed
- Adjusted the layout of AllLaptops and AllPCs cardview (Description, Title and Price)
- Adjusted the Nagivation drawer menu items
- Updated the ResultActivity
- Adjusted the ThirdQuestionActivity Spinner and its drop-down items

### Fixed
- Fixed the Spinners
- Fixed the code of the ResultActivity
- Fixed the descriptions of PCs and their width

### Removed
- Removed the FavouritesActivity
- Removed commented code from the activities
- Removed one of the Spinners in the ThirdQuestionActivity

## [0.1.4] - 2019-11-27
### Added
- Added the Navigation drawer for the SettingsActivity
- Added YouTube API. The YouTube player works, but the FAB must be set to invisible.
- Added Spinner for maximum and minimum budgets (Faulty)

### Changed
- Adjusted the variable names for all computer items in both databases

### Remove
- Removed some unneeded drawable files

## [0.1.3] - 2019-11-26
### Added
- Added the Navigation drawer for AllLaptopsActivity, AllPCsActivity, FavouritesActivity, FeedbackActivity and ShareActivity
- Added all laptop items and images (11)
- Added Spinner input control to the ThirdQuestionActivity
- Added String value for the Budget title

### Changed
- Changed the RadioButton options from LPW/MPW/HPW to Office work, Casual gaming, Hardcore gaming, Photo/Video editing
- Set the Navigation drawer for the AboutActivity
- Adjusted the Manifest file and SecondQuestionActivity layout

### Fixed
- Fixed the layouts of Navigation drawer activities due to Toolbar spacing
- Fixed the Strings XML file

## [0.1.2] - 2019-11-25
### Added
- Added 4 laptop items and images to the LaptopItemRoobDatabase
- Added Up Navigation for the Navigation drawer menu items

### Changed
- Adjusted the FAB button to allow the user to redo the questionnaire
- Log.d for all messages for YouTube player

## [0.1.1] - 2019-11-24
### Changed
- Adjusted the About and Feedback activities so that they clear when the user click on the button
- Updated the About and Feedback layouts

## [0.1.0] - 2019-11-23
### Changed
- Adjusted the layouts for the Favourites and Help activities

## [0.0.9] - 2019-11-22
### Added
- Created necessary classes for SettingsActivity
- Created necessary classes for the Settings activity once more
- Added a tab layout for the HelpActivity and FavouritesActivity
- Added Youtube Player, commented out
- Added the necessary Intents to pass values from all questionnaires

### Changed
- Adjusted code in the FirstQuestionActivity
- Adjusted some of the layouts and recreated the SettingsActivity to ensure its functionality
- Adjusted the layouts for the Favourites and Help activities

### Fixed
- Fixed the Manifest file for the newly created activities
- Fixed the QuestionActivities to enable triggered values for the user

### Removed
-  Removed Up Navigation for now, since the user will be able to return to the ResultActivity without any occurring error

## [0.0.8] - 2019-11-21
### Added
- Created the application logo
- Added the images for the Laptop and PC items in the database
- Added an Intent for the FirstQuestion Activity
- Added connection between FirstQuestionActivity and ResultActivity to pass data

### Changed
- Renamed Laptop variables
- Adjusted the About and Feedback layouts
- Adjusted the Favourites layout
- Adjusted the background color of all layouts
- Adjusted the FirstQuestionActivity layout
- Adjusted AllPCs and AllLaptops Cardview layouts
- Adjusted the ShareActivity layout

### Fixed
- Fixed the PC variable names for the database classes
- Fixed the Toggle buttons for the FirstQuestionActivity class

## [0.0.7] - 2019-11-20
### Added
- Added necessary classes for PCItem database

### Changed
- Adjusted Youtube Configuration file
- Adjusted LaptopItem attributes for each laptop
- Adjusted LaptopItem classes for database

### Fixed
- Fixed classes for the creation of AllLaptop database
- Fixed an error in the ResultActivity
- Fixed an error to add Laptop items to the database

## [0.0.6] - 2019-11-19
### Added
- Created Model classes for each PC and Laptop in each RecyclerView
- Added new XML content layouts for AllPCs and AllLaptops activities
- Added connection between content layouts and original Model classes (AllPCs/AllLaptops)
- Added Adapter classes for each RecyclerView
- Created initial layouts for each CardView
- Added a menu option AboutActivity
- Added DAO files for the database and set entities for all computer items
- Added RoomDatabase classes
- Added repository and ViewModel class for each LaptopItem
- Added YoutubeAPI library
- Added First Milestone Algorithms images

### Changed
- Adjusted the code from the AllPCs and AllLaptops activities
- Edited the logo from the Navigation Drawer Head
- Beautified layout of SecondQuestionActivity
- Adjusted dependencies for the database
- Adjusted the Youtube configuration for the API key
- Changed VideoView to PersonalView on the ResultActivity
- Beautified the layout of FirstQuestionActivity, SecondQuestionActivity and ThirdQuestionActivity

### Fixed
- Fixed classes involving the implementation of RecyclerView
- Fixed errors found in AllLaptops and AllPCs activities

## [0.0.5] - 2019-11-18
### Added
- Added Internet permissions for YoutubeAPI
- Added access to network and account in Manifest file
- Added icons for all menu items in Navigation Drawer
- Added Intents for activities in Navigation Drawer
- Added Up Navigation for Navigation Drawer activities

### Changed
- Beautified the layout of MainActivity and FirstQuestionActivity
- Beautified the layout of SecondQuestionActivity
- Adjusted some design features to the Navigation Drawer Header

### Fixed
- Fixed the Manifest file
- Fixed the logo of the application

## [0.0.4] - 2019-11-15
### Added
- Added more activities for the Nagivation Drawer
- Found a way to add a database of all or certain PCs and laptops
- Added event handlers for each clickable feature
- Create a RecyclerView and each CardView layout

### Removed
- Disabled Up Navigation between the 3 QuestionActivities

## [0.0.3] - 2019-11-14
### Added
- Added intents to connect the layouts for each activity
- Added logo image for the MainActivity
- Added application description for the MainActivity
- Added image (desktop icon)
- Added project logo
- Enabled Up Navigation
- Designed and connected all the questionnaire layouts

### Changed
- Adjusted the design of the MainActivity
- Adjusted element positions for the MainActivity
- Adjusted the FirstQuestionActivity
- Adjusted the SecondQuestionActivity
- Adjusted the ThirdQuestionActivity
- Adjusted the designs for each QuestionActivities
- Adjusted all layouts in general and extracted string resources

### Fixed
- Fix the background for the activities
- Fix the MainActivity
- Fix the Java code concerning the transferring of Intents
- Fix the ResultActivity

## [0.0.2] - 2019-11-13
### Changed
- Adjusted position of the button
- Adjusted TextView ID names

### Fixed
- Fix layout content of the MainActivity (Button and TextView)

### Removed
- Removed green background image

## [0.0.1] - 2019-11-12
### Added
- Added new MainActivity of the project TechSeeker on AndroidStudioProjects
- Added 3 new QuestionActivities
- Added index file to mockups folder

### Changed
- Adjusted position of the button